package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class ClassicParent extends TagSupport {
private String name;
public void setName(String name) { this.name = name; }
public String getName()  { return name; }
public int doStartTag() throws JspException { return EVAL_BODY_INCLUDE; }}