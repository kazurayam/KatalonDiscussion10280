import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.angularjshub.com/examples/forms/textinputs/')

WebUI.verifyElementPresent(
	findTestObject('Page_AngularJS Hub  Text Inputs/iframe_exampleIFrame'), 50)

WebUI.setText(
	findTestObject('Object Repository/Page_AngularJS Hub  Text Inputs/input_Text_textEdit'), 'foo')

String actualText = WebUI.getText(findTestObject('Page_AngularJS Hub  Text Inputs/span_Value'))

WebUI.comment(">>> actualText=\'${actualText}\'")

WebUI.verifyMatch(actualText, 'Value: foo', false)

WebUI.closeBrowser()


