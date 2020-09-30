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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('UTILITIES/Open Marketplace COVID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel 1'))

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel 3'))

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel 4'))

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel5'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel 6'))

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel 7'))

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel 8'))

WebUI.verifyElementNotVisible(findTestObject('GDA homepage object/div_GDA Panel 9'))

