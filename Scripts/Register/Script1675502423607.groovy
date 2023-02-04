import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_Email_email'), 'robertchen4343@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_No. Handphone_mobilePhon'), '081319403374')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_Kata Sandi_password'), 
    'Cng4WqmFLbShZ+w2dMfaog==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_Ulangi Kata Sandi_confir'), 
    'Cng4WqmFLbShZ+w2dMfaog==')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_Nama Depan_firstName'), 'Robert')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_Nama Belakang_lastName'), 'Chen')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_KabupatenKota_cityAndPro'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/div_KOTA JAKARTA UTARA'))

WebUI.click(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/p_Daftar'))

WebUI.click(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/button_Kirim via SMS'))

WebUI.click(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/div_-3374_otp_HXEtv'))

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_1'), '8')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_2'), '8')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_3'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_4'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_5'), '7')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_6'), '7')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_7'), '7')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_8'), '7')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_9'), '8')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman Kartu Kredit/input_-3374_otp_10'), '8')

