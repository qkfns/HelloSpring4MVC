<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>회원정보 수정</title>
</head>
<body>
<h1>회원정보 수정</h1>
<form name="mbfrm" method="post" action="/memberupdok">
    <div>아이디 <input type="text" name="userid" value="${mvo.userid}" readonly></div>
    <div>이름 <input type="text" name="name" value="${mvo.name}"></div>
    <div>회원등급<input type="text" name="grade" value="${mvo.grade}"></div>
    <div>마일리지<input type="text" name="points" value="${mvo.points}"></div>
    <div><button type="submit">수정완료</button></div>
</form>

</body>
</html>
