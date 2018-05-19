<%@ page import="java.util.List" %>
<%@ page import="xin.wangning.domain.Privacy" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
<h1 align="center">所有数据</h1>
<table border="1" width="70%" align="center">
    <tr>
        <th>uuid</th>
        <th>姓名级别</th>
        <th>年龄级别</th>
        <th>性别级别</th>
        <th>推送级别</th>
    </tr>
    <%
        List<Privacy> privacyList = (List<Privacy>) request.getAttribute("privacyList");
        for(Privacy privacy:privacyList){
    %>
    <tr>
        <td><%=privacy.getUuid()%></td>
        <td><%=privacy.getName_range()%></td>
        <td><%=privacy.getSex_range()%></td>
        <td><%=privacy.getAge_range()%></td>
        <td><%=privacy.getPull_range()%></td>

    </tr>
    <%
        }
    %>

</table>
</body>
</html>
