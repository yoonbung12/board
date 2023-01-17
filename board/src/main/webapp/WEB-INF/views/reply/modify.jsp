<!-- c:forEach를 쓰는 데 jstl 추가 안하고써서 오류가 뜬것 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글 수정</title>
</head>
<body>

	 
	 <div>
	 
		<form method="post" action="/reply/modify">
		 	<p>
		 		<label>댓글 작성자</label> <input type="text" name="writer" readonly="readonly">
		 	</p>
		 	<p>
		 		<textarea rows="5" cols="50" name="content"></textarea>
		 	</p>
		 	<p>
		 		<input type="hidden" name="bno" value="${view.bno}">
		 		<input type="hidden" name="rno" value="${view.rno }">
		 		<button type="submit">댓글 수정</button>
		 	</p>
		</form>	
	 </div>
	 
	 
	 <!-- 댓글 종료 -->

 
 



</body>
</html>