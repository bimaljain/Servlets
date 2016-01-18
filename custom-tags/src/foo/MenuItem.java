package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;
public class MenuItem extends TagSupport {
private String itemValue;
public void setItemValue(String value) { itemValue = value; }
public int doStartTag() throws JspException { 
try { pageContext.getOut().println("<BR>Inside MenuItem: doStartTag"); } 
catch(Exception ex) { }	
return EVAL_BODY_INCLUDE; } 
public int doEndTag() throws JspException { 
try { pageContext.getOut().println("<BR>Inside MenuItem: doEndTag"); } 
catch(Exception ex) { }	
Menu parent = (Menu) getParent();
parent.addMenuItem(itemValue);
return EVAL_PAGE; }}