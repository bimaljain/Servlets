package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class handlerForTagVII extends TagSupport {
private int nestLevel = 0; 
public int doStartTag() throws JspException { 
try { pageContext.getOut().println("<br>Inside doStartTag");} catch(IOException ex) {} 
nestLevel = 0; 
Tag parent = getParent();
while (parent !=  null) {
try { pageContext.getOut().println("<br>Inside while loop");} catch(IOException ex) {} 
parent = parent.getParent(); 
nestLevel++; }
try { pageContext.getOut().println("<br>Tag nested level: " + nestLevel);}catch(IOException ex) {}
return EVAL_BODY_INCLUDE; }}