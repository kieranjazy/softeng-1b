<%@ page import="blank.*" %>

<%!
    public static College college = new College();
%>

<h1>College Deploy Test</h1>
<h2>College run() Output:\n</h2>
<%
    out.print("<pre>" + college.run() + "</pre>");
%>