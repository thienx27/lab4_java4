package org.apache.jsp.bai4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tinhtong_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <title>Insert title here</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Tong hai so</h1>\r\n");
      out.write("        <form action=\"index.jsp\" method=\"get\">\r\n");
      out.write("\t\tNh?p a: <input type=\"text\" name = \"so1\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\tNh?p b: <input type=\"text\" name = \"so2\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<button type=\"submit\">Tính t?ng</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<h2>K?t qu?: </h2>\r\n");
      out.write("\t");
      sample.control.tong cal = null;
      synchronized (_jspx_page_context) {
        cal = (sample.control.tong) _jspx_page_context.getAttribute("cal", PageContext.PAGE_SCOPE);
        if (cal == null){
          try {
            cal = (sample.control.tong) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "sample.control.tong");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "sample.control.tong", exc);
          }
          _jspx_page_context.setAttribute("cal", cal, PageContext.PAGE_SCOPE);
          out.write("\r\n");
          out.write("\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("cal"), request);
          out.write("\r\n");
          out.write("\t<b>\r\n");
          out.write("\t<h2  >\r\n");
          out.write("\t\t");
          out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((sample.control.tong)_jspx_page_context.findAttribute("cal")).getSum())));
          out.write("</h2>\r\n");
          out.write("\t</b>\r\n");
          out.write("\t");
        }
      }
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
