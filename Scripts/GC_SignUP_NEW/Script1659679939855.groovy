import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils
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

Mobile.startApplication('C:\\Users\\DELL\\Downloads\\app-qa-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.TextView - Sign up'), 0)

def PhoneNumber = '315' + RandomStringUtils.randomNumeric(7)

Mobile.setText(findTestObject('Object Repository/GC_SignUP_New/android.widget.EditText - Phone Number'), PhoneNumber, 
    0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.Button - Verify'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/GC_SignUP_New/android.widget.EditText'), '9999', 0)

Mobile.setText(findTestObject('Object Repository/GC_SignUP_New/android.widget.EditText - First Name'), 'Zee', 0)

Mobile.setText(findTestObject('Object Repository/GC_SignUP_New/android.widget.EditText - Last Name'), 'Aly', 0)

String EmailAddress = RandomStringUtils.randomAlphanumeric(10) + '@mymail.com'

Mobile.setText(findTestObject('Object Repository/GC_SignUP_New/android.widget.EditText - Email Address'), EmailAddress, 
    0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.CheckBox - I accept the Terms of Use'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.TextView - All Stores'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.TextView - GC-Test Kitchen'), 0)

Mobile.setText(findTestObject('Object Repository/GC_SignUP_New/android.widget.EditText - Model  Make (i.e. Honda Civic)'), 
    'Honda', 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/GC_SignUP_New/android.widget.EditText - Color'), 'Civic', 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.Button - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.TextView - Next'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUP_New/android.widget.TextView - Finish'), 0)

Mobile.delay(5)

Mobile.pressBack()

Mobile.closeApplication()

