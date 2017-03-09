package tags;


import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class Insert extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
	   JspWriter out = getJspContext().getOut();
	   int i=getJspContext().getAttributesScope("insertResult");
	      
		  if(i==1)
			  out.println("<h2>Row Inserted Successfully manish rocks</h2>");
		  else
			  out.println("<h2>Row couldn't Inserted </h2>");
   }
}