package tags;



import javax.servlet.jsp.tagext.*;

import com.SQL;

import javax.servlet.jsp.*;
import java.io.*;
public class Search extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
	   JspWriter out = getJspContext().getOut();
	   int j=(Integer)getJspContext().getAttribute("search");
	   String[] table=new SQL().search(j);
		
		if(table!=null){
				out.println("<table class='table'>");
				out.println("<tr>");
				out.println("<th>ID</th><th>Name</th><th>Salary</th>");
				out.println("</tr>");
					out.println("<tr>");
						out.println("<td>"+table[0]+"</td>");
						out.println("<td>"+table[1]+"</td>");
						out.println("<td>"+table[2]+"</td>");
					out.println("</tr>");
				out.println("</table>");
		}

   }
}