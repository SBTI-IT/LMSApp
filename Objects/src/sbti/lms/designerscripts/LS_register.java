package sbti.lms.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_register{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _icnxoffset="";
String _icnyoffset="";
String _tboffset="";
String _lroffset="";
views.get("pnlregfrm").vw.setTop((int)(0d));
views.get("pnlregfrm").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 3;BA.debugLine="pnlRegFrm.SetLeftAndRight(0, 100%x)"[register/General script]
views.get("pnlregfrm").vw.setLeft((int)(0d));
views.get("pnlregfrm").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 5;BA.debugLine="txtFullname.Height = pnlFullname.Height"[register/General script]
views.get("txtfullname").vw.setHeight((int)((views.get("pnlfullname").vw.getHeight())));
//BA.debugLineNum = 6;BA.debugLine="txtEmpID.Height = pnlEmpID.Height"[register/General script]
views.get("txtempid").vw.setHeight((int)((views.get("pnlempid").vw.getHeight())));
//BA.debugLineNum = 7;BA.debugLine="txtGender.Height = pnlGender.Height"[register/General script]
views.get("txtgender").vw.setHeight((int)((views.get("pnlgender").vw.getHeight())));
//BA.debugLineNum = 8;BA.debugLine="txtEmail.Height = pnlEmail.Height"[register/General script]
views.get("txtemail").vw.setHeight((int)((views.get("pnlemail").vw.getHeight())));
//BA.debugLineNum = 9;BA.debugLine="txtRole.Height = pnlRole.Height"[register/General script]
views.get("txtrole").vw.setHeight((int)((views.get("pnlrole").vw.getHeight())));
//BA.debugLineNum = 10;BA.debugLine="txtPassword.Height = pnlPswrd.Height"[register/General script]
views.get("txtpassword").vw.setHeight((int)((views.get("pnlpswrd").vw.getHeight())));
//BA.debugLineNum = 12;BA.debugLine="icnxOffset = 10%x"[register/General script]
_icnxoffset = BA.NumberToString((10d / 100 * width));
//BA.debugLineNum = 13;BA.debugLine="icnyOffset = 5%y"[register/General script]
_icnyoffset = BA.NumberToString((5d / 100 * height));
//BA.debugLineNum = 15;BA.debugLine="pnlFullname.SetLeftAndRight(icnxOffset,pnlRegFrm.Right - icnyOffset)"[register/General script]
views.get("pnlfullname").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlfullname").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 16;BA.debugLine="txtFullname.SetLeftAndRight(pnlRegFrm.Left + icnxOffset, pnlFullname.Right - icnyOffset)"[register/General script]
views.get("txtfullname").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtfullname").vw.setWidth((int)((views.get("pnlfullname").vw.getLeft() + views.get("pnlfullname").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 19;BA.debugLine="pnlEmpID.SetLeftAndRight(icnxOffset,pnlRegFrm.Right - icnyOffset)"[register/General script]
views.get("pnlempid").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlempid").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 20;BA.debugLine="txtEmpID.SetLeftAndRight(pnlRegFrm.Left + icnxOffset, pnlEmpID.Right - icnyOffset)"[register/General script]
views.get("txtempid").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtempid").vw.setWidth((int)((views.get("pnlempid").vw.getLeft() + views.get("pnlempid").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 23;BA.debugLine="pnlGender.SetLeftAndRight(icnxOffset,pnlRegFrm.Right - icnyOffset)"[register/General script]
views.get("pnlgender").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlgender").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 24;BA.debugLine="txtGender.SetLeftAndRight(pnlRegFrm.Left + icnxOffset, pnlGender.Right - icnyOffset)"[register/General script]
views.get("txtgender").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtgender").vw.setWidth((int)((views.get("pnlgender").vw.getLeft() + views.get("pnlgender").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 27;BA.debugLine="pnlEmail.SetLeftAndRight(icnxOffset,pnlRegFrm.Right - icnyOffset)"[register/General script]
views.get("pnlemail").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlemail").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 28;BA.debugLine="txtEmail.SetLeftAndRight(pnlRegFrm.Left + icnxOffset, pnlEmail.Right - icnyOffset)"[register/General script]
views.get("txtemail").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtemail").vw.setWidth((int)((views.get("pnlemail").vw.getLeft() + views.get("pnlemail").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 31;BA.debugLine="pnlRole.SetLeftAndRight(icnxOffset,pnlRegFrm.Right - icnyOffset)"[register/General script]
views.get("pnlrole").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlrole").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 32;BA.debugLine="txtRole.SetLeftAndRight(pnlRegFrm.Left + icnxOffset, pnlRole.Right - icnyOffset)"[register/General script]
views.get("txtrole").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtrole").vw.setWidth((int)((views.get("pnlrole").vw.getLeft() + views.get("pnlrole").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 35;BA.debugLine="pnlPswrd.SetLeftAndRight(icnxOffset,pnlRegFrm.Right - icnyOffset)"[register/General script]
views.get("pnlpswrd").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlpswrd").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 36;BA.debugLine="txtPassword.SetLeftAndRight(pnlRegFrm.Left + icnxOffset, pnlPswrd.Right - icnyOffset)"[register/General script]
views.get("txtpassword").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtpassword").vw.setWidth((int)((views.get("pnlpswrd").vw.getLeft() + views.get("pnlpswrd").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
//BA.debugLineNum = 39;BA.debugLine="tbOffset = 10"[register/General script]
_tboffset = "10";
//BA.debugLineNum = 40;BA.debugLine="lrOffset = 10"[register/General script]
_lroffset = "10";
//BA.debugLineNum = 41;BA.debugLine="btnRegister.SetLeftAndRight(lrOffset, pnlRegFrm.Right - lrOffset)"[register/General script]
views.get("btnregister").vw.setLeft((int)(Double.parseDouble(_lroffset)));
views.get("btnregister").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_lroffset) - (Double.parseDouble(_lroffset))));
//BA.debugLineNum = 42;BA.debugLine="btnRegister.SetTopAndBottom(pnlRegFrm.Bottom - btnRegister.Height - tbOffset, pnlRegFrm.Bottom - tbOffset)"[register/General script]
views.get("btnregister").vw.setTop((int)((views.get("pnlregfrm").vw.getTop() + views.get("pnlregfrm").vw.getHeight())-(views.get("btnregister").vw.getHeight())-Double.parseDouble(_tboffset)));
views.get("btnregister").vw.setHeight((int)((views.get("pnlregfrm").vw.getTop() + views.get("pnlregfrm").vw.getHeight())-Double.parseDouble(_tboffset) - ((views.get("pnlregfrm").vw.getTop() + views.get("pnlregfrm").vw.getHeight())-(views.get("btnregister").vw.getHeight())-Double.parseDouble(_tboffset))));

}
}