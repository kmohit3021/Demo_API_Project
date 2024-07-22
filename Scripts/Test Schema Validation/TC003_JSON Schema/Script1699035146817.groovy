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
import org.apache.commons.io.FileUtils as FileUtils
import org.apache.commons.io.FilenameUtils as FilenameUtils
import org.openqa.selenium.Keys as Keys

res = WS.sendRequest(findTestObject('OR Schema/JSON'))

String jsonSchema = '\n{\n  "$schema": "http://json-schema.org/draft-04/schema#",\n  "type": "array",\n  "items": [\n    {\n      "type": "object",\n      "properties": {\n        "id": {\n          "type": "integer"\n        },\n        "username": {\n          "type": "string"\n        },\n        "password": {\n          "type": "string"\n        },\n        "gender": {\n          "type": "string"\n        },\n        "age": {\n          "type": "integer"\n        },\n        "avatar": {\n          "type": "null"\n        }\n      },\n      "required": [\n        "id",\n        "username",\n        "password",\n        "gender",\n        "age",\n        "avatar"\n      ]\n    }\n  ]\n}\n'

WS.validateJsonAgainstSchema(res, 'Example/json/jsonSchema.json')

WS.validateJsonAgainstSchema(res, jsonSchema)

WS.validateJsonAgainstSchema(res, 'Example/json/jsonSchemaWrong.json', FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('OR Schema/JSON'))

