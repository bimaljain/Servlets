package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
public class Menu extends TagSupport {
private ArrayList items;
public void addMenuItem(String item) { items.add(item); }
public int doStartTag() throws JspException { 
try { pageContext.getOut().println("<BR>Inside Menu: doStartTag"); } 
catch(Exception ex) { }
items = new ArrayList();
return EVAL_BODY_INCLUDE; } 
public int doEndTag() throws JspException { 
try { pageContext.getOut().println("<BR>Inside Menu: doEndTag"); } 
catch(Exception ex) { }
try { pageContext.getOut().println("<BR>Menu items are: " + items); } 
catch(Exception ex) { }
return EVAL_PAGE; }}