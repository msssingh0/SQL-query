package tags;

import javax.servlet.jsp.tagext.*;

import com.SQL;
import javax.servlet.jsp.*;
import java.io.*;
public class ViewAll extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
	   JspWriter out = getJspContext().getOut();
	   String[][] table=new SQL().viewAll();
		
		if(table!=null){
				out.println("<table class='table'>");
				out.println("<tr>");
				out.println("<th>ID</th><th>Name</th><th>Salary</th>");
				out.println("</tr>");
				for(int i=0;i<table.length;i++){
					out.println("<tr>");
					for(int j=0;j<3;j++){
						out.println("<td>");
						out.print(table[i][j]+"&nbsp&nbsp");
						out.println("</td>");
					}
					out.println("<tr>");
				out.println("<br>");
				}
				out.println("</table>");
		}
      
   }
}