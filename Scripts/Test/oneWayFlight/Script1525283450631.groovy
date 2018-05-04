import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SetUp/logIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('findFlightPage/input_RoundTrip'))

WebUI.selectOptionByValue(findTestObject('findFlightPage/dropdown_Passengers'), '4', true)

WebUI.selectOptionByValue(findTestObject('findFlightPage/select_OnMonth'), '8', true)

WebUI.selectOptionByValue(findTestObject('findFlightPage/select_OnDay'), '20', true)

WebUI.selectOptionByValue(findTestObject('findFlightPage/select_ArrivingIn'), f_from, true)

WebUI.selectOptionByValue(findTestObject('findFlightPage/select_DepartingForm'), f_in, true)

WebUI.selectOptionByIndex(findTestObject('findFlightPage/select_ReturningMonth'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('findFlightPage/select_ReturningDay'), '23', true)

firstClass = WebUI.modifyObjectProperty(findTestObject('findFlightPage/input_servClass'), 'value', 'equals', 'First', true)

WebUI.click(firstClass)

WebUI.selectOptionByIndex(findTestObject('findFlightPage/select_Airline'), '0')

WebUI.click(findTestObject('findFlightPage/btn_Continue'))

WebUI.waitForPageLoad(20)

WebUI.verifyTextPresent('Select your departure and return flight from the selections below.', true)

WebUI.callTestCase(findTestCase('TearDown/tearDown'), [:], FailureHandling.STOP_ON_FAILURE)

