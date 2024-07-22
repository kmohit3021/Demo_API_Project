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

def bookPayload = '{"title": "Test Book", "pageCount": 100, "publishDate": "2022-01-01T00:00:00Z"}'
def bookRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Books/POST')
def bookPayloadContent = new HttpTextBodyContent(replaceSuffixWithUUID(bookPayload))
bookRequest.setBodyContent(bookPayloadContent)
addHeaderConfiguration(bookRequest)
def bookResponse = WSBuiltInKeywords.sendRequest(bookRequest)
WSBuiltInKeywords.verifyResponseStatusCode(bookResponse, 200)
def bookId = new JsonSlurper().parseText(bookResponse.getResponseText())['id']

def authorPayload = '{"idBook": ' + bookId + ', "firstName": "John", "lastName": "Doe"}'
def authorRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Authors/POST')
def authorPayloadContent = new HttpTextBodyContent(replaceSuffixWithUUID(authorPayload))
authorRequest.setBodyContent(authorPayloadContent)
addHeaderConfiguration(authorRequest)
def authorResponse = WSBuiltInKeywords.sendRequest(authorRequest)
WSBuiltInKeywords.verifyResponseStatusCode(authorResponse, 200)

def userPayload = '{"userName": "test_user", "password": "password123"}'
def userRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Users/POST')
def userPayloadContent = new HttpTextBodyContent(replaceSuffixWithUUID(userPayload))
userRequest.setBodyContent(userPayloadContent)
addHeaderConfiguration(userRequest)
def userResponse = WSBuiltInKeywords.sendRequest(userRequest)
WSBuiltInKeywords.verifyResponseStatusCode(userResponse, 200)

def userName = "test_user"
def userSearchRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Users/GET')
userSearchRequest.addParameter('userName', userName)
addHeaderConfiguration(userSearchRequest)
def userSearchResponse = WSBuiltInKeywords.sendRequest(userSearchRequest)
WSBuiltInKeywords.verifyResponseStatusCode(userSearchResponse, 200)

def replaceSuffixWithUUID(payload) {
    replacedString = payload.replaceAll('unique__', uuid)
    return replacedString
}

