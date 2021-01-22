<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>성적상세조회</title>
</head>
<body>
<h1>성적상세조회</h1>
<p>이름 : ${sj.name}</p>
<p>국어 : ${sj.kor}</p>
<p>영어 : ${sj.eng}</p>
<p>수학 : ${sj.mat}</p>
<hr>
<p>총점 : ${sj.tot}</p>
<p>평균 : ${sj.mean}</p>
<p>학점 : ${sj.grd}</p>
<p>등록일 : ${sj.regdate}</p>

<hr>
<p><button type="button" onclick="modSungJuk('${sj.sjno}')">성적수정</button>
    <button type="button" onclick="rmvSungJuk('${sj.sjno}')">성적삭제</button></p>

<script>
    // 성적번호를 이용해서 성적데이터를 수정하는 url 호출
    function modSungJuk(sjno) {
        location.href='/sungjukupd?sjno=' + sjno;
    }
    // 성적번호를 이용해서 성적데이터를 삭제하는 url 호출
    function rmvSungJuk(sjno) {
        location.href='/sungjukdel?sjno=' + sjno;
    }
</script>
</body>
</html>
