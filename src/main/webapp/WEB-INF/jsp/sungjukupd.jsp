
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>성적처리수정</title>
</head>
<body>
<h1>성적처리수정</h1>
<form name="sjfrm" method="post" action="/sungjukupdok">
    <div>이름 : <input type="text" name="name" value="${sj.name}" readonly></div>
    <div>국어 : <input type="text" name="kor" value="${sj.kor}"></div>
    <div>영어 : <input type="text" name="eng" value="${sj.eng}"></div>
    <div>수학 : <input type="text" name="mat" value="${sj.mat}"></div>
    <input type="hidden" name="sjno" value="${sj.sjno}">
    <div><button type="submit">수정완료</button></div>


</form>

</body>
</html>
