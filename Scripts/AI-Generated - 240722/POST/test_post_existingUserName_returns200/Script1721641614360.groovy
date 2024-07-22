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

// Step 1: Create a new Book
def bookPayload = '{"title": "Test Book__unique__", "pageCount": 200, "publishDate": "2022-01-01T00:00:00Z"}'
def bookRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Books/POST")
def bookPayloadContent = new HttpTextBodyContent(replaceSuffixWithUUID(bookPayload))
bookRequest.setBodyContent(bookPayloadContent)
addHeaderConfiguration(bookRequest)
def bookResponse = WSBuiltInKeywords.sendRequest(bookRequest)
WSBuiltInKeywords.verifyResponseStatusCode(bookResponse, 200)

// Step 2: Create a new Author
def authorPayload = '{"idBook": 1, "firstName": "John__unique__", "lastName": "Doe__unique__"}'
def authorRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Authors/POST")
def authorPayloadContent = new HttpTextBodyContent(replaceSuffixWithUUID(authorPayload))
authorRequest.setBodyContent(authorPayloadContent)
addHeaderConfiguration(authorRequest)
def authorResponse = WSBuiltInKeywords.sendRequest(authorRequest)
WSBuiltInKeywords.verifyResponseStatusCode(authorResponse, 200)

// Step 3: Create a new CoverPhoto
def coverPhotoPayload = '{"idBook": 1, "url": "https://example.com/image.jpg"}'
def coverPhotoRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_CoverPhotos/POST")
def coverPhotoPayloadContent = new HttpTextBodyContent(replaceSuffixWithUUID(coverPhotoPayload))
coverPhotoRequest.setBodyContent(coverPhotoPayloadContent)
addHeaderConfiguration(coverPhotoRequest)
def coverPhotoResponse = WSBuiltInKeywords.sendRequest(coverPhotoRequest)
WSBuiltInKeywords.verifyResponseStatusCode(coverPhotoResponse, 200)

// Step 4: Send a POST request to create a new User with an existing 'userName'
def userPayload = '{"userName": "existing_username", "password": "password123"}'
def userRequest = findTestObject("Object Repository/OR Swagger/FakeRESTApi_Web V1/_api_v1_Users/POST")
def userPayloadContent = new HttpTextBodyContent(replaceSuffixWithUUID(userPayload))
userRequest.setBodyContent(userPayloadContent)
addHeaderConfiguration(userRequest)
def userResponse = WSBuiltInKeywords.sendRequest(userRequest)
WSBuiltInKeywords.verifyResponseStatusCode(userResponse, 200)

def replaceSuffixWithUUID(payload) {
    replacedString = payload.replaceAll('unique__', uuid)
    return replacedString
}

