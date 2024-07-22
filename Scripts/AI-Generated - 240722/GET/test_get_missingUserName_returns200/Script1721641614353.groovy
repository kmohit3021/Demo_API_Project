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

def bookData = '{"title": "Test Book", "pageCount": 100, "publishDate": "2022-01-01T00:00:00Z"}'
def bookRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Books/POST')
def bookPayload = new HttpTextBodyContent(replaceSuffixWithUUID(bookData))
bookRequest.setBodyContent(bookPayload)
addHeaderConfiguration(bookRequest)
def bookResponse = WSBuiltInKeywords.sendRequest(bookRequest)
WSBuiltInKeywords.verifyResponseStatusCode(bookResponse, 200)
def bookId = new JsonSlurper().parseText(bookResponse.getResponseText())['id']

def authorData = '{"idBook": ' + bookId + ', "firstName": "Jane", "lastName": "Smith"}'
def authorRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Authors/POST')
def authorPayload = new HttpTextBodyContent(replaceSuffixWithUUID(authorData))
authorRequest.setBodyContent(authorPayload)
addHeaderConfiguration(authorRequest)
def authorResponse = WSBuiltInKeywords.sendRequest(authorRequest)
WSBuiltInKeywords.verifyResponseStatusCode(authorResponse, 200)

def userData = '{"password": "password123"}'
def userRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Users/POST')
def userPayload = new HttpTextBodyContent(replaceSuffixWithUUID(userData))
userRequest.setBodyContent(userPayload)
addHeaderConfiguration(userRequest)
def userResponse = WSBuiltInKeywords.sendRequest(userRequest)
WSBuiltInKeywords.verifyResponseStatusCode(userResponse, 200)
def userId = new JsonSlurper().parseText(userResponse.getResponseText())['id']

def getUserRequest = findTestObject('Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Users_id_/GET', ['id': userId])
def getUserResponse = WSBuiltInKeywords.sendRequest(getUserRequest)
WSBuiltInKeywords.verifyResponseStatusCode(getUserResponse, 200)

def replaceSuffixWithUUID(payload) {
    replacedString = payload.replaceAll('unique__', uuid)
    return replacedString
}

