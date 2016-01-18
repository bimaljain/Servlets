package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;
public class SimpleChild extends SimpleTagSupport {     
public void doTag() throws JspException, IOException {
ClassicParent parent=(ClassicParent)getParent();
getJspContext().getOut().print("Parent attribute is: " + parent.getName()); }}