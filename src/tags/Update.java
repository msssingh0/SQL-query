package tags;


import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class Update extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
	     JspWriter out = getJspContext().getOut();
	  	  int i=getJspContext().getAttributesScope("deleteResult");
	      
		  if(i==1)
			  out.println("<h2>Row Updated Successfully</h2>");
		  else
			  out.println("<h2>Row couldn't Updated </h2>");
   }
}