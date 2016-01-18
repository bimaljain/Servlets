package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
public class handlerForTagX extends SimpleTagSupport {   
public void doTag() throws JspException, IOException {
getJspContext().getOut().print("<BR>Message from within doTag()");
getJspContext().getOut().print("<BR>About to throw a SkipPageException");
if (true) throw new SkipPageException(); }}