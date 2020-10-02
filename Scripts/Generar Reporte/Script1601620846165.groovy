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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.taskcontrol.tk/login')

WebUI.setText(findTestObject('Object Repository/Generar Reporte/Page_Task Control/input_Autenticarse para iniciar sesin_email'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Generar Reporte/Page_Task Control/input_Autenticarse para iniciar sesin_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Generar Reporte/Page_Task Control/span_Acceder_fas fa-sign-in-alt'))

WebUI.click(findTestObject('Object Repository/Generar Reporte/Page_Dashboard/a_Reporte'))

WebUI.click(findTestObject('Object Repository/Generar Reporte/Page_Reportera/input_Usuarios_filter_usuarios'))

WebUI.click(findTestObject('Object Repository/Generar Reporte/Page_Reportera/input'))

WebUI.click(findTestObject('Object Repository/Generar Reporte/Page_Reportera/div_Reportera                              _a4e097'))

WebUI.click(findTestObject('Object Repository/Generar Reporte/Page_Reportera/button_Exportar'))

