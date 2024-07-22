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

res = WS.sendRequest(findTestObject('OR Schema/XML'))

String xml = '<?xml version="1.0" encoding="utf-8"?>\n<List>\n    <item>\n        <username>James Johnson</username>\n        <password>789</password>\n        <gender>FEMALE</gender>\n        <age>75</age>\n        <avatar/>\n    </item>\n</List>'

String xmlFile = FileUtils.readFileToString(new File('Example/xml/person.xml'))

WS.validateXmlAgainstSchema(res, 'Example/xml/person.xsd')

WS.validateXmlAgainstSchema(xml, 'Example/xml/personWrong.xsd', FailureHandling.CONTINUE_ON_FAILURE)

WS.validateXmlAgainstSchema(xmlFile, 'Example/xml/person.xsd', FailureHandling.STOP_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('OR Schema/XML'))

