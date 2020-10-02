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

WebUI.setText(findTestObject('Object Repository/Agregar Comentario/Page_Task Control/input_Autenticarse para iniciar sesin_email'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Agregar Comentario/Page_Task Control/input_Autenticarse para iniciar sesin_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Agregar Comentario/Page_Task Control/button_Acceder'))

WebUI.click(findTestObject('Object Repository/Agregar Comentario/Page_Dashboard/a_Tareas'))

WebUI.click(findTestObject('Object Repository/Agregar Comentario/Page_Tareas/a_Ver'))

WebUI.setText(findTestObject('Object Repository/Agregar Comentario/Page_Dashboard/textarea_Comentario_descripcion'), 'Prueba automatica')

WebUI.click(findTestObject('Object Repository/Agregar Comentario/Page_Dashboard/button_Haga click aqu para adjuntar archivo_65d29e'))

