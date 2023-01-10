<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>

<div id="nav">
		<%@ include file="../include/nav.jsp" %>
</div>
 <form method="post">
 
 
	 <label>제목</label>
	 ${view.title}<br />
	 
	 
	 <label>작성자</label>
	 ${view.writer}<br />
	 	
	 <label>내용</label>
	 ${view.content}<br />
	 
	 <div>					<!-- 게시물 수정이랑 삭제 -->
	 <a href = "/board/modify?bno=${view.bno}">게시물 수정</a>
	 <a href = "/board/delete?bno=${view.bno}">게시물 삭제</a>
	 
	 </div>
	 
	 <!-- 댓글 시작 -->
	 
	 <hr />
	 
	 <ul>
	 	<li>첫번째 댓글</li>
	 	<li>두번째 댓글</li>
	 	<li>세번째 댓글</li>
	 </ul>	
	 <div>
	 	<p>
	 		<label>댓글 작성자</label> <input type="text">
	 	</p>
	 	<p>
	 		<textarea rows="5" cols="50"></textarea>
	 	</p>
	 	<p>
	 		<button type="button">댓글 작성</button>
	 	</p>
	 </div>
	 
	 
	 <!-- 댓글 종료 -->

 
 
 </form>



</body>
</html>