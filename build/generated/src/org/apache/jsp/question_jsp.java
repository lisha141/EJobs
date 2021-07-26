package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tecdev.*;
import java.sql.*;
import java.util.*;

public final class question_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Questions | eExam</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css folder/bootstrap.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .btn{\n");
      out.write("            background-color:  #009999;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <c:set var=\"msg\" scope=\"session\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <div class=\"well well-sm text-center\" id=\"msg\">\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty msg?\"Manage Questions\":msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.txt", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <c:remove var=\"msg\" scope=\"session\"/>\n");
      out.write("            </c:if>\n");
      out.write("            <span>&nbsp;</span> \n");
      out.write("            \n");
      out.write("             \n");
      out.write("            <form class=\"form\" method=\"post\" action=\"Examservlet?op=5\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                     \n");
      out.write("                    <div class=\"panel-heading text-center\">\n");
      out.write("                        <h1><span class=\"label label-default\">Questions</span></h1> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel panel-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-3 col-sm-2 text-right\">\n");
      out.write("\n");
      out.write("                                <label>Category</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-9 col-sm-7\">\n");
      out.write("                                <select  disabled name=\"category\" class=\"form-control\" id=\"category\">\n");
      out.write("                                    ");

                                        ResultSet rs = DatabaseBean.executeQuery("select category from categories order by category");
                                        // rs.first();
                                        String value = "";
                                        String tag = "";
                                        while (rs.next()) {       //Gives true till row found
                                            value = rs.getString("category");
                                            tag = String.format("<option value='%s'>%s</option>", value, value);
                                            out.print(tag);
                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-6 col-sm-2 pull-right\">\n");
      out.write("                                <input type=\"button\" id=\"add\" class=\"form-control btn btn-primary\" value=\"Add\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <span>&nbsp;</span>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-3 col-sm-2 text-right\">\n");
      out.write("                                <label>Question-Id</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-9 col-sm-7\">\n");
      out.write("                                <input disabled id=\"qid\" name=\"qid\" class=\"form-control\" readonly=\"true\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-6 col-sm-2 pull-right\">\n");
      out.write("                                <input type=\"submit\" disabled id=\"save\" class=\"form-control btn btn-default\" value=\"Save\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <span>&nbsp;</span>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-3 col-sm-2 text-right\">\n");
      out.write("                                <label>Question</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-9 col-sm-7\">\n");
      out.write("                                <input required disabled id=\"question\" name=\"question\" class=\"form-control\" required placeholder=\"Enter Question here\" type=\"text\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-6 col-sm-2 pull-right\">\n");
      out.write("                                <input type=\"button\" id=\"edit\" class=\"form-control btn btn-primary\" value=\"Edit\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <span>&nbsp;</span>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6 col-md-3\">\n");
      out.write("                                <label>Option 1</label>\n");
      out.write("                                <input disabled id=\"option1\" name=\"option1\" class=\"form-control\" required placeholder=\"option 1\" type=\"text\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-md-3\">\n");
      out.write("                                <label>Option 2</label>\n");
      out.write("                                <input disabled id=\"option2\" name=\"option2\" class=\"form-control\" required placeholder=\"option 2\" type=\"text\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-md-3\">\n");
      out.write("                                <label>Option 3</label>\n");
      out.write("                                <input disabled id=\"option3\" name=\"option3\" class=\"form-control\" required placeholder=\"option 3\" type=\"text\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-md-3\">\n");
      out.write("                                <label>Option 4</label>\n");
      out.write("                                <input disabled id=\"option4\" name=\"option4\" class=\"form-control\" required placeholder=\"option 4\" type=\"text\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <span>&nbsp;</span>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                                <label>Answer</label>\n");
      out.write("                                <input disabled id=\"answer\" name=\"answer\" class=\"form-control\" required placeholder=\"Correct answer\" type=\"text\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                                <label>Question Type</label>\n");
      out.write("                                <select disabled name=\"questiontype\" class=\"form-control\" id=\"questiontype\">\n");
      out.write("                                    ");

                                        ResultSet rs1 = DatabaseBean.executeQuery("select distinct questiontype from question order by questiontype");
                                        // rs.first();
                                        String value1 = "";
                                        String tag1 = "";
                                        while (rs1.next()) {       //Gives true till row found
                                            value1 = rs1.getString("questiontype");
                                            tag1 = String.format("<option value='%s'>%s</option>", value1, value1);
                                            out.print(tag1);
                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel panel-footer\">\n");
      out.write("                        <div class=\"col-xs-6 col-sm-2\">\n");
      out.write("                            <input type=\"button\" name=\"submit\" class=\"form-control btn btn-primary\" id=\"first\" value=\"First\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-xs-6 col-sm-2\">\n");
      out.write("                            <input type=\"button\" name=\"submit\" class=\"form-control btn btn-primary\" id=\"next\" value=\"Next\"/>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"col-xs-6 col-sm-2\">\n");
      out.write("                            <input type=\"button\" name=\"submit\" class=\"form-control btn btn-primary\" id=\"previous\" value=\"Previous\"/>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-xs-6 col-sm-2\">\n");
      out.write("                            <input type=\"button\" name=\"submit\" class=\"form-control btn btn-primary\" id=\"last\" value=\"Last\"/>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-xs-6 col-sm-2\">\n");
      out.write("                <input type=\"button\" id=\"cancel\" disabled class=\"form-control btn btn-default\" value=\"Cancel\"/>\n");
      out.write("                        </div>\n");
      out.write("                         \n");
      out.write("                        <div class=\"col-xs-6 col-sm-2\">\n");
      out.write("                <input class=\"form-control btn btn-primary\" name=\"submit\" id=\"find\" type=\"button\" value=\"Find\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <span>&nbsp;</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               <input type=\"hidden\" id=\"operation\" name=\"operation\" value=\"\"/>\n");
      out.write("               <input type=\"hidden\" id=\"qno\" name=\"qno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.qno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <script src=\"script/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"script/bootstrap.min.js\"></script> \n");
      out.write("        <script>\n");
      out.write("            jQuery(document).ready(\n");
      out.write("                    function () {\n");
      out.write("                        //Register Click Event on [Add]\n");
      out.write("                        $(\"#add\").on('click', addClick);\n");
      out.write("                        $(\"#edit\").on('click', editClick);\n");
      out.write("                        $(\"#cancel\").on('click', cancelClick);\n");
      out.write("                         $(\"#find\").on('click', findClick);\n");
      out.write("                         $(\"#first\").on('click', function (){  \n");
      out.write("                             navigationClick(1); });\n");
      out.write("                        $(\"#previous\").on('click', function (){  \n");
      out.write("                            navigationClick(2); });\n");
      out.write("                        $(\"#next\").on('click', function (){  \n");
      out.write("                            navigationClick(3); });\n");
      out.write("                        $(\"#last\").on('click', function (){  \n");
      out.write("                            navigationClick(4); });\n");
      out.write("                           navigationClick(4);\n");
      out.write("                    }); //End of ready fn\n");
      out.write("                      function navigationClick(n) {\n");
      out.write("                          \n");
      out.write("                 //Passing value n to the choice variable\n");
      out.write("               var myurl = \"Examservlet?op=8&choice=\" + n;\n");
      out.write("                $.ajax({             /*Java - Map: Key/Value Pair*/\n");
      out.write("                    url: myurl,     /*JSON - JavaScript Object Notation*/\n");
      out.write("                    async: false,\n");
      out.write("                    type: 'POST',         /*i.e method=\"post\" */\n");
      out.write("                    success: function (data) {  //Get data from Servlet\n");
      out.write("                        //Convert comma seperated data to array\n");
      out.write("                     var array = data.split(\",\");\n");
      out.write("                        //User-Defined Fn to Display data\n");
      out.write("                      arrayToText(array)\n");
      out.write("                        //alert(\"All is Well = \" + data);\n");
      out.write("                    },\n");
      out.write("                  error: function (jqXHR, exception) {\n");
      out.write("                       console.log('arrayToText Exception ' + excepttion);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }        \n");
      out.write("                     function findClick() {\n");
      out.write("                //Ask client to input/prompt qid at runtime\n");
      out.write("                var qid = prompt(\"Enter Qid to Search\");\n");
      out.write("                //Check if cancel pressed or nothing entered\n");
      out.write("                if (qid == null || qid.trim().length == 0) {\n");
      out.write("                    return false; //Terminate Fn\n");
      out.write("                }\n");
      out.write("                var myurl = \"Examservlet?op=6&qid1=\" + qid;\n");
      out.write("                $.ajax({\n");
      out.write("                    url: myurl,\n");
      out.write("                    async: false,\n");
      out.write("                    type: 'POST',\n");
      out.write("                    success: function (data) {  //Get data from Servlet\n");
      out.write("                        //Convert comma seperated data to array\n");
      out.write("                        var array = data.split(\",\");\n");
      out.write("                        //User-Defined Fn to Display data\n");
      out.write("                        arrayToText(array)\n");
      out.write("                    },\n");
      out.write("                    error: function (jqXHR, exception) {\n");
      out.write("                        console.log('arrayToText Exception ' + excepttion);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("                //User-Defined Fn to Display Data inside UI-07-Sep-2020\n");
      out.write("                function arrayToText(array) {\n");
      out.write("                   \n");
      out.write("                    $(\"#qid\").val(array[0]);\n");
      out.write("                    $(\"#question\").val(array[1]);\n");
      out.write("                    //$(\"#category\").val(array[2]);\n");
      out.write("                    var select = \"#category option[value='\" + array[2] + \"']\";\n");
      out.write("                    $(select).attr(\"selected\", \"selected\");\n");
      out.write("                    $(\"#option1\").val(array[3]);\n");
      out.write("                    $(\"#option2\").val(array[4]);\n");
      out.write("                    $(\"#option3\").val(array[5]);\n");
      out.write("                    $(\"#option4\").val(array[6]);\n");
      out.write("                    $(\"#answer\").val(array[7]);\n");
      out.write("                    // $(\"#questiontype\").val(array[8]);\n");
      out.write("                    select = \"#questiontype option[value='\" + array[8] + \"']\";\n");
      out.write("                    $(select).attr(\"selected\", \"selected\");\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("            function addClick() {\n");
      out.write("                makeEditable();\n");
      out.write("                makeEmpty();\n");
      out.write("                $(\"#operation\").val(\"add\");\n");
      out.write("                //alert(\"Value of Hidden Field is \" + $(\"#operation\").val());\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function editClick() {\n");
      out.write("                makeEditable();\n");
      out.write("                $(\"#operation\").val(\"edit\");\n");
      out.write("                // alert(\"Value of Hidden Field is \" + $(\"#operation\").val());\n");
      out.write("            }\n");
      out.write("            function makeEditable() {\n");
      out.write("\n");
      out.write("                var $boxes = $(\":text,select\");\n");
      out.write("                $boxes.each(function () {\n");
      out.write("                    $(this).removeAttr('disabled');\n");
      out.write("                });\n");
      out.write("                //Activate save and cancel buttons\n");
      out.write("                $(\"#save\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("                $(\"#cancel\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("                //Disable Add and Edit Buttons\n");
      out.write("                $(\"#add\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("                $(\"#edit\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("                $(\"#first\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("                $(\"#next\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("                $(\"#previous\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("                $(\"#last\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("            }\n");
      out.write("            function makeEmpty() {\n");
      out.write("                //$(\"input[type=text], textarea\"). val(\"\");\n");
      out.write("                $(\":text, textarea\").val(\"\");\n");
      out.write("            }\n");
      out.write("            function cancelClick() {\n");
      out.write("                //Using JQuery Select find all text and select fields\n");
      out.write("                var $boxes = $(\":text,select\");\n");
      out.write("                //Now add attribue disabled\n");
      out.write("                $boxes.each(function () {\n");
      out.write("                    $(this).attr('disabled', 'disabled'); //key,value\n");
      out.write("                });\n");
      out.write("                //Activate Add and Edit buttons\n");
      out.write("                $(\"#add\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("                $(\"#edit\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("                //De-Activate Save and Cancel Buttons\n");
      out.write("                $(\"#save\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("                $(\"#cancel\").attr('disabled', '').removeClass('btn-primary').addClass('btn-default');\n");
      out.write("                $(\"#first\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("                $(\"#next\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("                $(\"#previous\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("                $(\"#last\").removeAttr('disabled').removeClass('btn-default').addClass('btn-primary');\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("\n");
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
