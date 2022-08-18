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

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView - Continue as Guest'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView - All Stores'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView - GC-Test Kitchen'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.Button - Order'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView'), 0)

Mobile.delay(3)

Mobile.scrollToText('12oz')

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView (1)'), 0)


Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView (2)'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.Button - Save'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ProgressBar'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView -'), 0)

Mobile.delay(3)


Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ProgressBar (1)'), 0)

def PhoneNumber = '315' + RandomStringUtils.randomNumeric(7)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - Phone Number'), PhoneNumber, 
    0)
Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.Button - Verify'), 0)

Mobile.delay(3)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText'), '9999', 0)

Mobile.delay(3)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - First Name'), 'Zaeem', 0)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - Last Name'), 'Aly', 0)

String EmailAddress = RandomStringUtils.randomAlphanumeric(10) + '@mymail.com'


Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - Email Address'), EmailAddress, 
    0)
Mobile.delay(3)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - Company Name (optional)'), 'CB', 
    0)

Mobile.scrollToText('payment')

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView - Add new card'), 0)

//Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - , Card number'), '4', 0)

//Mobile.setText(findTestObject(''), '4242424242424242', 0)
Mobile.delay(3)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - , Card number'), '4242424242424242', 0)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - , Expiration date'), '1223', 
    0)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - , CVC'), '123', 0)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - Name'), 'Zaeem', 0)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - Address'), 'ISB', 0)


Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - City'), 'rawalpindi', 0)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - State'), 'RWP', 0)

Mobile.scrollToText('number')

Mobile.delay(3)


Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - ZIP Code'), '46000', 0)

Mobile.setText(findTestObject('Object Repository/GC_GuestOrdering/android.widget.EditText - Phone number (1)'), '3155134066', 
    0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView'), 0)

Mobile.delay(3)


Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView - Visa ending in 4242'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView (5)'), 0)

Mobile.delay(3)


Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.TextView -  1.00'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.Button - Add Tip'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ProgressBar (2)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ProgressBar (2)'), 0)

Mobile.delay(35)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_GuestOrdering/android.widget.ImageView (7)'), 0)

Mobile.closeApplication()

