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

def bookPayload = [
    "title": "Sample Title__unique__",
    "pageCount": 200,
    "publishDate": "2022-01-01T00:00:00Z"
]

def authorPayload = [
    "idBook": 1,
    "firstName": "John__unique__",
    "lastName": "Doe__unique__"
]

def coverPhotoPayload = [
    "idBook": 1,
    "url": "https://sampleurl.com/sample.jpg"
]

def userPayload = [
    "password": "password__unique__"
]

def bookRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Books/POST")
addHeaderConfiguration(bookRequest)
bookRequest.setBodyContent(new HttpTextBodyContent(replaceSuffixWithUUID(JsonOutput.toJson(bookPayload))))
def bookResponse = WSBuiltInKeywords.sendRequest(bookRequest)
WSBuiltInKeywords.verifyResponseStatusCode(bookResponse, 200)

def authorRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Authors/POST")
addHeaderConfiguration(authorRequest)
authorRequest.setBodyContent(new HttpTextBodyContent(replaceSuffixWithUUID(JsonOutput.toJson(authorPayload))))
def authorResponse = WSBuiltInKeywords.sendRequest(authorRequest)
WSBuiltInKeywords.verifyResponseStatusCode(authorResponse, 200)

def coverPhotoRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_CoverPhotos/POST")
addHeaderConfiguration(coverPhotoRequest)
coverPhotoRequest.setBodyContent(new HttpTextBodyContent(replaceSuffixWithUUID(JsonOutput.toJson(coverPhotoPayload))))
def coverPhotoResponse = WSBuiltInKeywords.sendRequest(coverPhotoRequest)
WSBuiltInKeywords.verifyResponseStatusCode(coverPhotoResponse, 200)

def userRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Users/POST")
addHeaderConfiguration(userRequest)
userRequest.setBodyContent(new HttpTextBodyContent(replaceSuffixWithUUID(JsonOutput.toJson(userPayload))))
def userResponse = WSBuiltInKeywords.sendRequest(userRequest)
WSBuiltInKeywords.verifyResponseStatusCode(userResponse, 200)

def replaceSuffixWithUUID(payload) {
    replacedString = payload.replaceAll('unique__', uuid)
    return replacedString
}

