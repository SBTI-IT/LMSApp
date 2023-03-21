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
views.get("pnlregfrm").vw.setLeft((int)(0d));
views.get("pnlregfrm").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("txtfullname").vw.setHeight((int)((views.get("pnlfullname").vw.getHeight())));
views.get("txtempid").vw.setHeight((int)((views.get("pnlempid").vw.getHeight())));
views.get("txtgender").vw.setHeight((int)((views.get("pnlgender").vw.getHeight())));
views.get("txtemail").vw.setHeight((int)((views.get("pnlemail").vw.getHeight())));
views.get("txtrole").vw.setHeight((int)((views.get("pnlrole").vw.getHeight())));
views.get("txtpassword").vw.setHeight((int)((views.get("pnlpswrd").vw.getHeight())));
_icnxoffset = BA.NumberToString((10d / 100 * width));
_icnyoffset = BA.NumberToString((5d / 100 * height));
views.get("pnlfullname").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlfullname").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
views.get("txtfullname").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtfullname").vw.setWidth((int)((views.get("pnlfullname").vw.getLeft() + views.get("pnlfullname").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
views.get("pnlempid").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlempid").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
views.get("txtempid").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtempid").vw.setWidth((int)((views.get("pnlempid").vw.getLeft() + views.get("pnlempid").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
views.get("pnlgender").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlgender").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
views.get("txtgender").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtgender").vw.setWidth((int)((views.get("pnlgender").vw.getLeft() + views.get("pnlgender").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
views.get("pnlemail").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlemail").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
views.get("txtemail").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtemail").vw.setWidth((int)((views.get("pnlemail").vw.getLeft() + views.get("pnlemail").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
views.get("pnlrole").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlrole").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
views.get("txtrole").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtrole").vw.setWidth((int)((views.get("pnlrole").vw.getLeft() + views.get("pnlrole").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
views.get("pnlpswrd").vw.setLeft((int)(Double.parseDouble(_icnxoffset)));
views.get("pnlpswrd").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_icnyoffset) - (Double.parseDouble(_icnxoffset))));
views.get("txtpassword").vw.setLeft((int)((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset)));
views.get("txtpassword").vw.setWidth((int)((views.get("pnlpswrd").vw.getLeft() + views.get("pnlpswrd").vw.getWidth())-Double.parseDouble(_icnyoffset) - ((views.get("pnlregfrm").vw.getLeft())+Double.parseDouble(_icnxoffset))));
_tboffset = "10";
_lroffset = "10";
views.get("btnregister").vw.setLeft((int)(Double.parseDouble(_lroffset)));
views.get("btnregister").vw.setWidth((int)((views.get("pnlregfrm").vw.getLeft() + views.get("pnlregfrm").vw.getWidth())-Double.parseDouble(_lroffset) - (Double.parseDouble(_lroffset))));
views.get("btnregister").vw.setTop((int)((views.get("pnlregfrm").vw.getTop() + views.get("pnlregfrm").vw.getHeight())-(views.get("btnregister").vw.getHeight())-Double.parseDouble(_tboffset)));
views.get("btnregister").vw.setHeight((int)((views.get("pnlregfrm").vw.getTop() + views.get("pnlregfrm").vw.getHeight())-Double.parseDouble(_tboffset) - ((views.get("pnlregfrm").vw.getTop() + views.get("pnlregfrm").vw.getHeight())-(views.get("btnregister").vw.getHeight())-Double.parseDouble(_tboffset))));

}
}