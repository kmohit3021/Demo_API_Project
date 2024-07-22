import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper as JsonSlurper
import groovy.json.JsonOutput as JsonOutput

def getUsersResponse = WS.sendRequest(findTestObject('OR Swagger/FakeRESTApi_Web V1/_api_v1_Users/GET'))

WS.verifyResponseStatusCode(getUsersResponse, 200)

