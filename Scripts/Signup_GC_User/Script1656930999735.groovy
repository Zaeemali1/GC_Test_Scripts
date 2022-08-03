import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
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

Mobile.startApplication('C:\\Users\\DELL\\Downloads\\app-dev-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.TextView - Sign up'), 0)

def PhoneNumber = '315' + RandomStringUtils.randomNumeric(7)

//println('PhoneNumber: ' + PhoneNumber)

Mobile.setText(findTestObject('Object Repository/GC_SignUp/android.widget.EditText - Phone Number'), PhoneNumber, 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.Button - Verify'), 0)

Mobile.delay(3)

Mobile.setText(findTestObject('Object Repository/GC_SignUp/android.widget.EditText'), '9999', 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.Button - Next'), 0)

Mobile.setText(findTestObject('Object Repository/GC_SignUp/android.widget.EditText - First Name'), 'Zaeem Ali', 0)

Mobile.setText(findTestObject('Object Repository/GC_SignUp/android.widget.EditText - Last Name'), 'Akhtar', 0)

//def EmailAddress = "315" + RandomStringUtils.randomNumeric(7)
//println ("PhoneNumber: " + PhoneNumber)
String EmailAddress = RandomStringUtils.randomAlphanumeric(10) + '@mymail.com'

Mobile.setText(findTestObject('Object Repository/GC_SignUp/android.widget.EditText - Email Address'), EmailAddress, 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.CheckBox - I accept the Terms of Use'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.TextView - All Stores'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.TextView - 1155 Valentine Ave SE Pacific'), 0)

Mobile.setText(findTestObject('Object Repository/GC_SignUp/android.widget.EditText - Model  Make (i.e. Honda Civic)'), 'Honda Civic 2021', 
    0)

Mobile.setText(findTestObject('Object Repository/GC_SignUp/android.widget.EditText - Color'), 'Black', 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.Button - Get Started'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/GC_SignUp/android.widget.TextView - Finish'), 0)

Mobile.pressBack()

Mobile.closeApplication()

