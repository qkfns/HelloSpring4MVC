<%@ page contentType="text/html;charset=UTF-8"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title>성적데이터 리스트</title>
</head>
<body>
<h1>성적데이터 리스트</h1>
<table width="550" border="1">
    <tr><th>번호</th><th>이름</th><th>국어</th>
        <th>영어</th><th>수학</th><th>등록일</th></tr>
    <c:forEach var="sj" items="${sjlist}">
        <tr><th>${sj.sjno}</th>
            <th><a href="/sungjukview?sjno=${sj.sjno}">${sj.name}</a></th>
            <th>${sj.kor}</th><th>${sj.eng}</th><th>${sj.mat}</th>
            <th>${fn:substring(sj.regdate , 0, 10)}</th></tr>

    </c:forEach>
</table>

</body>
</html>
