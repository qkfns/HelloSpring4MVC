<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>회원상세조회</title>
</head>
<body>
<h1>회원상세조회</h1>
<p>아이디 : ${m.userid}</p>
<p>이름  : ${m.name}</p>
<p>등급 : ${m.grade}</p>
<p>포인트 : ${m.points}</p>
<p>가입일 : ${m.regdate}</p>

<hr>
<div><button type="button" onclick="memberupd('${m.userid}')">회원수정</button>
<button type="button" onclick="memberdel('${m.name}')">회원삭제</button></div>

<script>
    function memberupd(userid){
        location.href = '/memberupd?userid=' +userid
    }
    function memberdel(name){
        location.href = '/memberdel?name=' + name
    }
</script>


</body>
</html>
