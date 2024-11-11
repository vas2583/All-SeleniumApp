set projectLocation=G:\WorkSpeace\seleniunm\suresh715\AutomationTestingUsingFrameWork_TestNg_log4j
cd %projectLocation%
set classpatrh=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testSuite.xml