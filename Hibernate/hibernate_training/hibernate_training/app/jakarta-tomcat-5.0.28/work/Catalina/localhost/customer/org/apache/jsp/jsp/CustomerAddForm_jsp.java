package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerAddForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_property_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_submit_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_submit_property_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Customer Struts add page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Enter details of a customer</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<form method=\"POST\" action=\"CustomerAdd.jsp\">\r\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"0\" border=\"2\">\r\n");
      out.write("<tr><td>\r\n");
      out.write("User ID\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"uid\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("First Name\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"FName\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Last Name\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"LName\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Address Line 1\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"addressLine1\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Address Line 2\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"addressLine2\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("City\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"city\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("PinCode\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"pincode\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Marital status\r\n");
      out.write("</td><td>\r\n");
      out.write("<select name=\"maritalStatus\">\r\n");
      out.write("<option value=\"Y\">Y</option>\r\n");
      out.write("<option value=\"N\">N</option>\r\n");
      out.write("</select>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td  colspan=\"2\">\r\n");
      if (_jspx_meth_html_submit_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<input name=\"submit\" name=\"submit\" value=\"submit\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_submit_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent(null);
    _jspx_th_html_submit_0.setProperty("submit");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_property_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }
}
