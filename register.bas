B4A=true
Group=Default Group\View
ModulesStructureVersion=1
Type=Activity
Version=12
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private btnRegister As Button
	Private txtEmail As EditText
	Private txtEmpID As EditText
	Private txtFullname As EditText
	Private txtGender As EditText
	Private txtPassword As EditText
	Private txtRole As EditText
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("register")
	' Hide input line
	HideInputLine
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HideInputLine
	txtEmpID.Color = Colors.Transparent
	txtFullname.Color = Colors.Transparent
	txtEmail.Color = Colors.Transparent
	txtGender.Color = Colors.Transparent
	txtRole.Color = Colors.Transparent
	txtPassword.Color = Colors.Transparent
End Sub


Private Sub txtPassword_EnterPressed
	
End Sub

Private Sub btnRegister_Click
	
End Sub