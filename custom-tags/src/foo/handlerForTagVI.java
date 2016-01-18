package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class handlerForTagVI extends TagSupport {  
String[] movies = new String[] {"Spiderman", "Saved!", "Amelie"};    
int movieCounter;
public int doStartTag() throws JspException {
JspWriter out = pageContext.getOut();  // this must be declared inside the method
try { out.println("<BR>in doStartTag()"); } 
catch(IOException ex) { throw new JspException("IOException-" + ex.toString()); }
movieCounter = 0;
pageContext.setAttribute("movie", movies[movieCounter]);
movieCounter++;
return EVAL_BODY_INCLUDE; }
public int doAfterBody() throws JspException {
JspWriter out = pageContext.getOut();  // this must be declared inside the method
try { out.println("<BR>in doAfterBody()"); } 
catch(IOException ex) { throw new JspException("IOException-" + ex.toString()); }
if (movieCounter < movies.length) {
pageContext.setAttribute("movie", movies[movieCounter]);
movieCounter++;
return EVAL_BODY_AGAIN; } 
else { return SKIP_BODY; }}     
public int doEndTag() throws JspException {
JspWriter out = pageContext.getOut();
try { out.println("<BR>in doEndTag()"); }
catch(IOException ex) { throw new JspException("IOException- " + ex.toString()); }
return EVAL_PAGE; }}