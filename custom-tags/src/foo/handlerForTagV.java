package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class handlerForTagV extends TagSupport {
public int doStartTag() throws JspException {
JspWriter out = pageContext.getOut();  // this must be declared inside the method
try { out.println("<BR>in doStartTag()"); } 
catch(IOException ex) { throw new JspException("IOException-" + ex.toString()); }
return SKIP_BODY; }
public int doEndTag() throws JspException {
JspWriter out = pageContext.getOut();
try { out.println("<BR>in doEndTag()"); }
catch(IOException ex) { throw new JspException("IOException- " + ex.toString()); }
return EVAL_PAGE; }}