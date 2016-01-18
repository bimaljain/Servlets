package foo;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
public class handlerForTagIII extends SimpleTagSupport {   
public void doTag() throws JspException, IOException {
getJspContext().setAttribute("message", "Wear sunscreen.");
getJspBody().invoke(null);}}