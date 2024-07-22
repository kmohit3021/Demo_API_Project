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

WS.verifyElementPropertyValue(response, 'firstName', "Emily")
WS.verifyElementPropertyValue(response, 'lastName', "Johnson")
WS.verifyElementPropertyValue(response, 'maidenName', "Smith")
WS.verifyElementPropertyValue(response, 'age', 28)
WS.verifyElementPropertyValue(response, 'gender', "female")
WS.verifyElementPropertyValue(response, 'email', "emily.johnson@x.dummyjson.com")
WS.verifyElementPropertyValue(response, 'phone', "+81 965-431-3024")
WS.verifyElementPropertyValue(response, 'username', "emilys")
WS.verifyElementPropertyValue(response, 'password', "emilyspass")
WS.verifyElementPropertyValue(response, 'birthDate', "1996-5-30")
WS.verifyElementPropertyValue(response, 'bloodGroup', "O-")
WS.verifyElementPropertyValue(response, 'height', 193.24)
WS.verifyElementPropertyValue(response, 'weight', 63.16)
WS.verifyElementPropertyValue(response, 'eyeColor', "Green")
WS.verifyElementPropertyValue(response, 'hair.color', "Brown")
WS.verifyElementPropertyValue(response, 'hair.type', "Curly")
WS.verifyElementPropertyValue(response, 'ip', "42.48.100.32")
WS.verifyElementPropertyValue(response, 'address.address', "626 Main Street")
WS.verifyElementPropertyValue(response, 'address.city', "Phoenix")
WS.verifyElementPropertyValue(response, 'address.state', "Mississippi")
WS.verifyElementPropertyValue(response, 'address.stateCode', "MS")
WS.verifyElementPropertyValue(response, 'address.postalCode', "29112")

WS.verifyElementPropertyValue(response, 'address.country', "United States")
WS.verifyElementPropertyValue(response, 'macAddress', "47:fa:41:18:ec:eb")
WS.verifyElementPropertyValue(response, 'university', "University of Wisconsin--Madison")
WS.verifyElementPropertyValue(response, 'bank.cardExpire', "03/26")
WS.verifyElementPropertyValue(response, 'bank.cardNumber', "9289760655481815")
WS.verifyElementPropertyValue(response, 'bank.cardType', "Elo")
WS.verifyElementPropertyValue(response, 'bank.currency', "CNY")
WS.verifyElementPropertyValue(response, 'bank.iban', "YPUXISOBI7TTHPK2BR3HAIXL")
WS.verifyElementPropertyValue(response, 'company.department', "Engineering")
WS.verifyElementPropertyValue(response, 'company.name', "Dooley, Kozey and Cronin")
WS.verifyElementPropertyValue(response, 'company.title', "Sales Manager")
WS.verifyElementPropertyValue(response, 'company.address.address', "263 Tenth Street")
WS.verifyElementPropertyValue(response, 'company.address.city', "San Francisco")
WS.verifyElementPropertyValue(response, 'company.address.state', "Wisconsin")
WS.verifyElementPropertyValue(response, 'company.address.stateCode', "WI")
WS.verifyElementPropertyValue(response, 'company.address.postalCode', "37657")
WS.verifyElementPropertyValue(response, 'company.address.coordinates.lat', 71.814525)

WS.verifyElementPropertyValue(response, 'company.address.country', "United States")
WS.verifyElementPropertyValue(response, 'ein', "977-175")
WS.verifyElementPropertyValue(response, 'ssn', "900-590-289")
WS.verifyElementPropertyValue(response, 'userAgent', "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36")
WS.verifyElementPropertyValue(response, 'crypto.coin', "Bitcoin")
WS.verifyElementPropertyValue(response, 'crypto.wallet', "0xb9fc2fe63b2a6c003f1c324c3bfa53259162181a")
WS.verifyElementPropertyValue(response, 'crypto.network', "Ethereum (ERC20)")
WS.verifyElementPropertyValue(response, 'role', "admin")