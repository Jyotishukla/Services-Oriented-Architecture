package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
java.util.List<ws.Customer> result = null;
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>  \n");
      out.write("        <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	ws.AllWebServicesService service = new ws.AllWebServicesService();
	ws.AllWebServices port = service.getAllWebServicesPort();
	// TODO process result here
    
	 result = port.getCustomers();
	
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    out.println("Result = "+result);
    
      out.write("    ");
      out.write("<hr/>\n");
      out.write("   \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("<table class=\"table table-striped\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>ID</th>\n");
      out.write("\t\t\t\t\t<th>Name</th>\n");
      out.write("                                        <th>Type</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("                            ");
for(int i= 0; i<result.size(); i++){
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            \n");
      out.write("                        <td>");
out.println(result.get(i).getCustomerId());
      out.write("</td>\n");
      out.write("                        <td>");
out.println(result.get(i).getCustomerTitle());
      out.write("</td>\n");
      out.write("                        <td>");
out.println(result.get(i).getCustomerType());
      out.write("</td>\n");
      out.write("                        </tr>");
}
      out.write(" \n");
      out.write("\t\t\t\t\t\n");
      out.write("                           \n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
