
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title>회원정보목록</title>
</head>
<body>
<h1>회원정보목록</h1>
<table width="350px" border="1" cellspacing="0" cellpadding="10">
    <tr><th>아이디</th><th>회원등급</th><th>가입일</th></tr>
    <c:forEach var="m" items="${mvos}">
        <tr>
            <th><a href="/memberview?userid=${m.userid}">${m.userid}</a></th>
            <th>${m.grade}</th>
            <th>${fn.substring(m.regdate,0,10)}</th></tr>
    </c:forEach>


</table>

</body>
</html>
