package foo;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
public class handlerForTagII extends SimpleTagSupport {     
public void doTag() throws JspException, IOException {
getJspBody().invoke(null);}}