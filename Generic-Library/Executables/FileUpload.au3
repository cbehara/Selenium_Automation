#cs ----------------------------------------------------------------------------

 AutoIt Version: 3.3.14.5
 Author: Ravi Kumar N G

 Script Function:
	This script uploads the file to already opened windows File Open window. User should pass the File path including the file name
	(for example : C:\temp\filename.txt") as argument.



#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here
Opt("WinTitleMatchMode", 4)

;Works for Google Chrome and Microsoft Edge browser
If WinExists ("Open") Then

   ;Wait for the Open window to open
   WinActivate("Open")

   ;Focus on the Edit box to pass the file path
   ControlFocus("Open","","Edit1")

   ;Pass the file path to the Edit box
   ControlSetText("Open","","Edit1",$CmdLine[1])
   Sleep(2000)

   ;Click on the Open Button to select the file
   ControlClick("Open","","Button1")

   Sleep(1000)

EndIf

;Works for Mozilla Firefox browser
If WinExists ("File Upload") Then

   ;Wait for the File upload window to open
   WinActivate("File Upload")

   ;Focus on the Edit box to pass the file path
   ControlFocus("File Upload","","Edit1")

   ;Pass the file path to the Edit box
   ControlSetText("File Upload","","Edit1", $CmdLine[1])
   Sleep(3000)

   ;Click on the Open Button to select the file
   ControlClick("File Upload","","Button1")

   Sleep(1000)

EndIf




