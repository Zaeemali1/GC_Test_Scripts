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

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.TextView - Welcome Back'), 'Welcome Back')
//Mobile.getText(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.TextView - Welcome Back'), 0)

Mobile.setText(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.EditText - Phone Number'), '3165888999',
	0)

Mobile.tap(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.Button - Login'), 0)

Mobile.delay(3)

Mobile.setText(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.EditText'), '9999', 0)

Mobile.tap(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.TextView - All Stores'), 0)

Mobile.tap(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.EditText - Zip Code or Address'), 'redendo',
	0)

Mobile.tap(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.TextView - Cancel'), 0)

Mobile.tap(findTestObject('Object Repository/GC_VerifyGalaxyClub/android.widget.TextView - 1155 Valentine Ave SE Pacific'),
	0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/test/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/test/android.widget.TextView - Galaxy Club'), 0)

Mobile.closeApplication()

