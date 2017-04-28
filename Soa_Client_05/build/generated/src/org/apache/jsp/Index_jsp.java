package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Truck Application</title>\n");
      out.write("    </head>\n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- jQuery library -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Latest compiled JavaScript -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>.pull-right {  float: right !important; }</style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style>\n");
      out.write("  #section1 {padding-top:20px;height:250px;}\n");
      out.write("  #section2 {padding-top:20px;height:250px;}\n");
      out.write("  #section3 {padding-top:20px;height:250px;}\n");
      out.write("  #section4 {padding-top:20px;height:250px;}\n");
      out.write("  #section5 {padding-top:20px;height:250px;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\">\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-static\">\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Truck Application</a>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"#section1\">Customer Information</a></li>\n");
      out.write("          <li><a href=\"#section2\">Employee Information</a></li>\n");
      out.write("          <li><a href=\"#section3\">Truck Information</a></li>\n");
      out.write("          <li><a href=\"#section4\">Order Information</a></li>\n");
      out.write("          <li><a href=\"#section5\">Price Information</a></li>          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>    \n");
      out.write("            \n");
      out.write("            <script\n");
      out.write("\t\tsrc=\"//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("</div>\t \n");
      out.write("                <div class=\"container\">\n");
      out.write("                    \n");
      out.write("                    <!-- List of customers-->\n");
      out.write("                    <div id=\"section1\" class=\"container-fluid\">\n");
      out.write("                        <div class = \"row\">\n");
      out.write("                            <div class=\"col-sm-6\"><br><br><br>\n");
      out.write("                        <form action=\"customer.jsp\" method=\"POST\">\n");
      out.write("                            <h2>List of all Customers</h2><br>\n");
      out.write("                            <button type=\"submit\">submit</button>\n");
      out.write("                        </form><br><br><br><br><hr /><hr />\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"col-sm-6\"><br><br><br>\n");
      out.write("                        <form action=\"customerbyid.jsp\" method=\"POST\">\n");
      out.write("                            <h2>Customer Information by id</h2><br><br>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"cusid\" placeholder=\"Customer ID\"/><br>\n");
      out.write("                            <button type=\"submit\">submit</button>\n");
      out.write("                        </form><br><br><hr /><hr />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"section2\" class=\"container-fluid\">\n");
      out.write("                         <div class = \"row\"> \n");
      out.write("                            <div class=\"col-sm-6\"><br><br><br>                        \n");
      out.write("                                <form action=\"employeebyid.jsp\" method=\"POST\">\n");
      out.write("                                    <h2>Employee Information by Name</h2>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"empname\" placeholder=\"Employee Name\"><br>\n");
      out.write("                                    <button type=\"submit\">submit</button>\n");
      out.write("                                </form><br><br><br><br><hr /><hr />\n");
      out.write("                        \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"col-sm-6\"><br><br><br>\n");
      out.write("                        <form action=\"employee.jsp\" method=\"POST\">\n");
      out.write("                            <h2>List of all Employees</h2><br>\n");
      out.write("                            <button type=\"submit\">submit</button>\n");
      out.write("                        </form><br><br><br><br><br><br><hr /><hr />\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                   <!-- </div> -->\n");
      out.write("                       \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <!-- List of Truck-->\n");
      out.write("                    <div id=\"section3\" class=\"container-fluid\">\n");
      out.write("                        <div class = \"row\">\n");
      out.write("                            <div class=\"col-sm-6\"><br><br><br>\n");
      out.write("                                <form action=\"truck.jsp\" method=\"POST\">\n");
      out.write("                                    <h2>List of all Trucks</h2>\n");
      out.write("                                    <button type=\"submit\">submit</button>\n");
      out.write("                                </form><br><br><br><br><br><br><hr /><hr />\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"col-sm-6\"><br><br><br>\n");
      out.write("                                <!-- Truck by id-->\n");
      out.write("                                <form action=\"truckbyid.jsp\" method=\"POST\">\n");
      out.write("                                    <h2>Information of Trucks</h2>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"truckid\" placeholder=\"Truck ID\"><br>\n");
      out.write("                                    <button type=\"submit\">submit</button>\n");
      out.write("                                </form><br><br><br><br><br><br><hr /><hr />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                    <div id=\"section4\" class=\"container-fluid\">\n");
      out.write("                        <div class = \"row\">\n");
      out.write("                            <div class=\"col-sm-6\"><br><br><br>\n");
      out.write("                                <!-- List of Orders -->\n");
      out.write("                                <form action=\"order.jsp\" method=\"POST\">\n");
      out.write("                                    <h1>List of all Orders</h1>\n");
      out.write("                                    <button type=\"submit\">submit</button>\n");
      out.write("                                </form><br><br><br><br><br><br><hr /><hr />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\"><br><br><br>\n");
      out.write("                                <!-- oRDER BY ID -->\n");
      out.write("                                <form action=\"orderbyid.jsp\" method=\"POST\">\n");
      out.write("                                    <h2>Information of Order by ID</h2>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"orderid\" ><br>\n");
      out.write("                                    <button type=\"submit\">submit</button>\n");
      out.write("                                </form><br><br><br><br><br><br><hr /><hr />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div id=\"section5\" class=\"container-fluid\">\n");
      out.write("                         <div class = \"row\"> \n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <!-- List of Prices-->\n");
      out.write("                                <form action=\"pricebyid.jsp\" method=\"POST\">\n");
      out.write("                                    <h2>Information of Price</h2>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"priceidto\" placeholder=\"Price ID To\"><br>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"priceidfrom\" placeholder=\"Price ID from\"><br>\n");
      out.write("                                    <button type=\"submit\">submit</button>\n");
      out.write("                                </form><br><br><hr /><hr />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\" >\n");
      out.write("                                <!-- List of Prices-->\n");
      out.write("                                <form action=\"price.jsp\" method=\"POST\">\n");
      out.write("                                    <h2>List of all Prices</h2>\n");
      out.write("                                    <button type=\"submit\">submit</button>\n");
      out.write("                                </form><br><br><hr /><hr />\n");
      out.write("                             </div>\n");
      out.write("                            \n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("   </body>\n");
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
