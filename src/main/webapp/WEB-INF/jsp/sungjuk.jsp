
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>성적처리프로그램</title>
</head>
<body>
<h1>성적처리프로그램</h1>
<form name="sjfrm" method="post" action="/sungjukok">
    <div>이름 : <input type="text" name="name"></div>
    <div>국어 : <input type="text" name="kor"></div>
    <div>영어 : <input type="text" name="eng"></div>
    <div>수학 : <input type="text" name="mat"></div>
    <div><button type="submit">입력완료</button>
        <button type="reset">다시입력</button></div>
</form>

</body>
</html>
