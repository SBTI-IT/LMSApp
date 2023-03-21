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

}
}