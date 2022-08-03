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

Mobile.startApplication('C:\\Users\\DELL\\Downloads\\app-qa-debug.apk', true)

Mobile.setText(findTestObject('Object Repository/GC_DriveThru/android.widget.EditText - Phone Number'), '3155134066', 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.Button - Login'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/GC_DriveThru/android.widget.EditText'), '9999', 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.TextView - All Stores'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.TextView - GC-Test Kitchen'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.Button - Order'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ImageView'), 0)

Mobile.delay(5)

Mobile.scrollToText('12oz')

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ImageView (3)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.Button - Save'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ProgressBar'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ProgressBar (1)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ImageView (4)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.TextView - Visa ending in 5648'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.TextView - Complete Order'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.view.ViewGroup'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ProgressBar (2)'), 0)

Mobile.delay(35)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.Button - Next Steps'), 0)

Mobile.tap(findTestObject('Object Repository/GC_DriveThru/android.widget.ImageView (5)'), 0)

Mobile.closeApplication()

