package sbti.lms.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_index{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="tbHost.SetTopAndBottom(0, 100%y)"[index/General script]
views.get("tbhost").vw.setTop((int)(0d));
views.get("tbhost").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 3;BA.debugLine="tbHost.SetLeftAndRight(0, 100%x)"[index/General script]
views.get("tbhost").vw.setLeft((int)(0d));
views.get("tbhost").vw.setWidth((int)((100d / 100 * width) - (0d)));

}
}