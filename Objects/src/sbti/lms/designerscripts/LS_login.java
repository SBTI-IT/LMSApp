package sbti.lms.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _origin="";
String _activitywidth="";
String _activityheight="";
String _xoffset="";
String _yoffset="";
String _ximgoffset="";
String _yimgoffset="";
String _lroffset="";
String _tboffset="";
//BA.debugLineNum = 3;BA.debugLine="origin = 0"[login/General script]
_origin = "0";
//BA.debugLineNum = 4;BA.debugLine="activityWidth = 100%x"[login/General script]
_activitywidth = BA.NumberToString((100d / 100 * width));
//BA.debugLineNum = 5;BA.debugLine="activityHeight = 100%y"[login/General script]
_activityheight = BA.NumberToString((100d / 100 * height));
//BA.debugLineNum = 8;BA.debugLine="pnlLoginFrm.SetTopAndBottom(origin, activityHeight)"[login/General script]
views.get("pnlloginfrm").vw.setTop((int)(Double.parseDouble(_origin)));
views.get("pnlloginfrm").vw.setHeight((int)(Double.parseDouble(_activityheight) - (Double.parseDouble(_origin))));
//BA.debugLineNum = 9;BA.debugLine="pnlLoginFrm.SetLeftAndRight(origin, activityWidth)"[login/General script]
views.get("pnlloginfrm").vw.setLeft((int)(Double.parseDouble(_origin)));
views.get("pnlloginfrm").vw.setWidth((int)(Double.parseDouble(_activitywidth) - (Double.parseDouble(_origin))));
//BA.debugLineNum = 12;BA.debugLine="xOffset = 15%x"[login/General script]
_xoffset = BA.NumberToString((15d / 100 * width));
//BA.debugLineNum = 13;BA.debugLine="yOffset = 20%y"[login/General script]
_yoffset = BA.NumberToString((20d / 100 * height));
//BA.debugLineNum = 14;BA.debugLine="pnlForm.SetTopAndBottom(pnlLoginFrm.Top + yOffset, pnlLoginFrm.Bottom - yOffset)"[login/General script]
views.get("pnlform").vw.setTop((int)((views.get("pnlloginfrm").vw.getTop())+Double.parseDouble(_yoffset)));
views.get("pnlform").vw.setHeight((int)((views.get("pnlloginfrm").vw.getTop() + views.get("pnlloginfrm").vw.getHeight())-Double.parseDouble(_yoffset) - ((views.get("pnlloginfrm").vw.getTop())+Double.parseDouble(_yoffset))));
//BA.debugLineNum = 15;BA.debugLine="pnlForm.SetLeftAndRight(pnlLoginFrm.Left + xOffset, pnlLoginFrm.Right - xOffset)"[login/General script]
views.get("pnlform").vw.setLeft((int)((views.get("pnlloginfrm").vw.getLeft())+Double.parseDouble(_xoffset)));
views.get("pnlform").vw.setWidth((int)((views.get("pnlloginfrm").vw.getLeft() + views.get("pnlloginfrm").vw.getWidth())-Double.parseDouble(_xoffset) - ((views.get("pnlloginfrm").vw.getLeft())+Double.parseDouble(_xoffset))));
//BA.debugLineNum = 18;BA.debugLine="xImgOffset = 0%x"[login/General script]
_ximgoffset = BA.NumberToString((0d / 100 * width));
//BA.debugLineNum = 19;BA.debugLine="yImgOffset = 50%y"[login/General script]
_yimgoffset = BA.NumberToString((50d / 100 * height));
//BA.debugLineNum = 20;BA.debugLine="imgAppLogo.SetTopAndBottom(xImgOffset, pnlForm.Bottom - yImgOffset)"[login/General script]
views.get("imgapplogo").vw.setTop((int)(Double.parseDouble(_ximgoffset)));
views.get("imgapplogo").vw.setHeight((int)((views.get("pnlform").vw.getTop() + views.get("pnlform").vw.getHeight())-Double.parseDouble(_yimgoffset) - (Double.parseDouble(_ximgoffset))));
//BA.debugLineNum = 21;BA.debugLine="imgAppLogo.SetLeftAndRight(xImgOffset, pnlForm.Right - 8%y)"[login/General script]
views.get("imgapplogo").vw.setLeft((int)(Double.parseDouble(_ximgoffset)));
views.get("imgapplogo").vw.setWidth((int)((views.get("pnlform").vw.getLeft() + views.get("pnlform").vw.getWidth())-(8d / 100 * height) - (Double.parseDouble(_ximgoffset))));
//BA.debugLineNum = 24;BA.debugLine="pnlUsername.SetTopAndBottom(imgAppLogo.Bottom + 5%y, imgAppLogo.Bottom + 12%y)"[login/General script]
views.get("pnlusername").vw.setTop((int)((views.get("imgapplogo").vw.getTop() + views.get("imgapplogo").vw.getHeight())+(5d / 100 * height)));
views.get("pnlusername").vw.setHeight((int)((views.get("imgapplogo").vw.getTop() + views.get("imgapplogo").vw.getHeight())+(12d / 100 * height) - ((views.get("imgapplogo").vw.getTop() + views.get("imgapplogo").vw.getHeight())+(5d / 100 * height))));
//BA.debugLineNum = 25;BA.debugLine="pnlUsername.SetLeftAndRight(0%x, pnlForm.Right - 15%x)"[login/General script]
views.get("pnlusername").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlusername").vw.setWidth((int)((views.get("pnlform").vw.getLeft() + views.get("pnlform").vw.getWidth())-(15d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 26;BA.debugLine="txtUsername.SetLeftAndRight(pnlUsername.Left + 10%x, pnlUsername.Right)"[login/General script]
views.get("txtusername").vw.setLeft((int)((views.get("pnlusername").vw.getLeft())+(10d / 100 * width)));
views.get("txtusername").vw.setWidth((int)((views.get("pnlusername").vw.getLeft() + views.get("pnlusername").vw.getWidth()) - ((views.get("pnlusername").vw.getLeft())+(10d / 100 * width))));
//BA.debugLineNum = 27;BA.debugLine="txtUsername.Height = pnlUsername.Height"[login/General script]
views.get("txtusername").vw.setHeight((int)((views.get("pnlusername").vw.getHeight())));
//BA.debugLineNum = 30;BA.debugLine="pnlPassword.SetTopAndBottom(pnlUsername.Bottom + 2%y, pnlUsername.Bottom + 9%y)"[login/General script]
views.get("pnlpassword").vw.setTop((int)((views.get("pnlusername").vw.getTop() + views.get("pnlusername").vw.getHeight())+(2d / 100 * height)));
views.get("pnlpassword").vw.setHeight((int)((views.get("pnlusername").vw.getTop() + views.get("pnlusername").vw.getHeight())+(9d / 100 * height) - ((views.get("pnlusername").vw.getTop() + views.get("pnlusername").vw.getHeight())+(2d / 100 * height))));
//BA.debugLineNum = 31;BA.debugLine="pnlPassword.SetLeftAndRight(0%x, pnlForm.Right - 15%x)"[login/General script]
views.get("pnlpassword").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlpassword").vw.setWidth((int)((views.get("pnlform").vw.getLeft() + views.get("pnlform").vw.getWidth())-(15d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="txtPassword.SetLeftAndRight(pnlPassword.Left + 10%x, pnlPassword.Right)"[login/General script]
views.get("txtpassword").vw.setLeft((int)((views.get("pnlpassword").vw.getLeft())+(10d / 100 * width)));
views.get("txtpassword").vw.setWidth((int)((views.get("pnlpassword").vw.getLeft() + views.get("pnlpassword").vw.getWidth()) - ((views.get("pnlpassword").vw.getLeft())+(10d / 100 * width))));
//BA.debugLineNum = 33;BA.debugLine="txtPassword.Height = pnlPassword.Height"[login/General script]
views.get("txtpassword").vw.setHeight((int)((views.get("pnlpassword").vw.getHeight())));
//BA.debugLineNum = 35;BA.debugLine="lblRegister.SetTopAndBottom(pnlForm.Bottom + 2%y, btnLogin.Top - 25%y)"[login/General script]
views.get("lblregister").vw.setTop((int)((views.get("pnlform").vw.getTop() + views.get("pnlform").vw.getHeight())+(2d / 100 * height)));
views.get("lblregister").vw.setHeight((int)((views.get("btnlogin").vw.getTop())-(25d / 100 * height) - ((views.get("pnlform").vw.getTop() + views.get("pnlform").vw.getHeight())+(2d / 100 * height))));
//BA.debugLineNum = 36;BA.debugLine="lblRegister.SetLeftAndRight(pnlForm.Left, pnlForm.Right)"[login/General script]
views.get("lblregister").vw.setLeft((int)((views.get("pnlform").vw.getLeft())));
views.get("lblregister").vw.setWidth((int)((views.get("pnlform").vw.getLeft() + views.get("pnlform").vw.getWidth()) - ((views.get("pnlform").vw.getLeft()))));
//BA.debugLineNum = 39;BA.debugLine="lrOffset = 10"[login/General script]
_lroffset = "10";
//BA.debugLineNum = 40;BA.debugLine="tbOffset = 10"[login/General script]
_tboffset = "10";
//BA.debugLineNum = 42;BA.debugLine="btnLogin.SetLeftAndRight(lrOffset, pnlLoginFrm.Right - lrOffset)"[login/General script]
views.get("btnlogin").vw.setLeft((int)(Double.parseDouble(_lroffset)));
views.get("btnlogin").vw.setWidth((int)((views.get("pnlloginfrm").vw.getLeft() + views.get("pnlloginfrm").vw.getWidth())-Double.parseDouble(_lroffset) - (Double.parseDouble(_lroffset))));
//BA.debugLineNum = 43;BA.debugLine="btnLogin.SetTopAndBottom(pnlLoginFrm.Bottom - btnLogin.Height - tbOffset, pnlLoginFrm.Bottom - tbOffset)"[login/General script]
views.get("btnlogin").vw.setTop((int)((views.get("pnlloginfrm").vw.getTop() + views.get("pnlloginfrm").vw.getHeight())-(views.get("btnlogin").vw.getHeight())-Double.parseDouble(_tboffset)));
views.get("btnlogin").vw.setHeight((int)((views.get("pnlloginfrm").vw.getTop() + views.get("pnlloginfrm").vw.getHeight())-Double.parseDouble(_tboffset) - ((views.get("pnlloginfrm").vw.getTop() + views.get("pnlloginfrm").vw.getHeight())-(views.get("btnlogin").vw.getHeight())-Double.parseDouble(_tboffset))));

}
}