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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/field_firstName'), 'wasis')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/field_lastName'), 'hidayat')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/field_Email'), 'test@mail.com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Field_Gender'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/field_mobileNumber'), '0888123312')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth'), '')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/datepicker'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/field_Subject'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects'), 'eng')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/pick_Subject'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/field_Hobbies'))

WebUI.uploadFile(findTestObject('upload/upload_button'), 'C:\\Users\\user\\Downloads\\ichigo.webp')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/field_currentAddress'), 'jalanin aja dulu')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/field_State'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Select State'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/pick_state_NCR'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Select City'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/pick_Delhi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('succes register')

WebUI.delay(3)

WebUI.closeBrowser()

