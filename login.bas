B4A=true
Group=Default Group\View
ModulesStructureVersion=1
Type=Activity
Version=12
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private btnLogin As Button
	Private txtPassword As EditText
	Private txtUsername As EditText
	Private lblRegister As Label
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("login")
	
	HideLines
End Sub

Sub HideLines
	txtUsername.Color = Colors.Transparent
	txtPassword.Color = Colors.Transparent
End Sub

Private Sub btnLogin_Click
	
End Sub

Private Sub lblRegister_Click
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub