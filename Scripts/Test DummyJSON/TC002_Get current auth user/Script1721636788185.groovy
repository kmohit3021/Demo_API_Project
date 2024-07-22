import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response = WS.sendRequest(findTestObject('OR_DummyJSON/Get current auth user', [('auth_token') : GlobalVariable.ACCESS_TOKEN]))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'firstName', 'Emily', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'lastName', 'Johnson', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'maidenName', 'Smith', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'age', 28, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'gender', 'female', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'email', 'emily.johnson@x.dummyjson.com', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'phone', '+81 965-431-3024', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'username', 'emilys', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'password', 'emilyspass', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'birthDate', '1996-5-30', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'bloodGroup', 'O-', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'height', 193.24, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'weight', 63.16, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'eyeColor', 'Green', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'hair.color', 'Brown', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'hair.type', 'Curly', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'ip', '42.48.100.32', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'address.address', '626 Main Street', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'address.city', 'Phoenix', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'address.state', 'Mississippi', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'address.stateCode', 'MS', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'address.postalCode', '29112', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'address.country', 'United States', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'macAddress', '47:fa:41:18:ec:eb', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'university', 'University of Wisconsin--Madison', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'bank.cardExpire', '03/26', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'bank.cardNumber', '9289760655481815', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'bank.cardType', 'Elo', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'bank.currency', 'CNY', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'bank.iban', 'YPUXISOBI7TTHPK2BR3HAIXL', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.department', 'Engineering', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.name', 'Dooley, Kozey and Cronin', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.title', 'Sales Manager', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.address.address', '263 Tenth Street', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.address.city', 'San Francisco', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.address.state', 'Wisconsin', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.address.stateCode', 'WI', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.address.postalCode', '37657', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.address.coordinates.lat', 71.814525, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'company.address.country', 'United States', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'ein', '977-175', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'ssn', '900-590-289', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'userAgent', 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36', 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'crypto.coin', 'Bitcoin', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'crypto.wallet', '0xb9fc2fe63b2a6c003f1c324c3bfa53259162181a', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'crypto.network', 'Ethereum (ERC20)', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'role', 'admin', FailureHandling.CONTINUE_ON_FAILURE)

