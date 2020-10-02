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

WebUI.setText(findTestObject('Object Repository/Crear Tarea/Page_Task Control/input_Autenticarse para iniciar sesin_email'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Crear Tarea/Page_Task Control/input_Autenticarse para iniciar sesin_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Crear Tarea/Page_Task Control/span_Acceder_fas fa-sign-in-alt'))

WebUI.click(findTestObject('Object Repository/Crear Tarea/Page_Dashboard/i_Calendario_fa fa-plus'))

WebUI.setText(findTestObject('Object Repository/Crear Tarea/Page_Dashboard/input_Nombre_nombre'), 'Q3')

WebUI.setText(findTestObject('Object Repository/Crear Tarea/Page_Dashboard/textarea_Descripcin_descripcion'), 'Prueba')

WebUI.click(findTestObject('Object Repository/Crear Tarea/Page_Dashboard/span_Asignar a_mdi mdi-chevron-down comboTr_77d82d'))

WebUI.click(findTestObject('Object Repository/Crear Tarea/Page_Dashboard/span_admingmail.com'))

WebUI.click(findTestObject('Object Repository/Crear Tarea/Page_Dashboard/span_Seleccionar opcin'))

WebUI.click(findTestObject('Object Repository/Crear Tarea/Page_Dashboard/button_Seleccionar opcin_submit'))

