import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def addHeaderConfiguration(request) {
    def content_type_header = new TestObjectProperty("content-type", ConditionType.EQUALS, "application/json")
    request.getHttpHeaderProperties().add(content_type_header)
}

uuid = UUID.randomUUID().toString()

def bookPayload = '{"title": "Test Book__unique__", "pageCount": 200, "publishDate": "2022-01-01T00:00:00Z"}'
def bookRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Books/POST')
def bookBodyContent = new HttpTextBodyContent(replaceSuffixWithUUID(bookPayload))
bookRequest.setBodyContent(bookBodyContent)
addHeaderConfiguration(bookRequest)
def bookResponse = WSBuiltInKeywords.sendRequest(bookRequest)
WSBuiltInKeywords.verifyResponseStatusCode(bookResponse, 200)

def authorPayload = '{"idBook": 1, "firstName": "John__unique__", "lastName": "Doe__unique__"}'
def authorRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Authors/POST')
def authorBodyContent = new HttpTextBodyContent(replaceSuffixWithUUID(authorPayload))
authorRequest.setBodyContent(authorBodyContent)
addHeaderConfiguration(authorRequest)
def authorResponse = WSBuiltInKeywords.sendRequest(authorRequest)
WSBuiltInKeywords.verifyResponseStatusCode(authorResponse, 200)

def coverPhotoPayload = '{"idBook": 1, "url": "https://example.com/image__unique__.jpg"}'
def coverPhotoRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_CoverPhotos/POST')
def coverPhotoBodyContent = new HttpTextBodyContent(replaceSuffixWithUUID(coverPhotoPayload))
coverPhotoRequest.setBodyContent(coverPhotoBodyContent)
addHeaderConfiguration(coverPhotoRequest)
def coverPhotoResponse = WSBuiltInKeywords.sendRequest(coverPhotoRequest)
WSBuiltInKeywords.verifyResponseStatusCode(coverPhotoResponse, 200)

def userPayload = '{"userName": "Special!@#$%^&*()_+{}:\\"<>?Characters__unique__", "password": "password__unique__"}'
def userRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Users/POST')
def userBodyContent = new HttpTextBodyContent(replaceSuffixWithUUID(userPayload))
userRequest.setBodyContent(userBodyContent)
addHeaderConfiguration(userRequest)
def userResponse = WSBuiltInKeywords.sendRequest(userRequest)
WSBuiltInKeywords.verifyResponseStatusCode(userResponse, 200)

def replaceSuffixWithUUID(payload) {
    replacedString = payload.replaceAll('unique__', uuid)
    return replacedString
}

