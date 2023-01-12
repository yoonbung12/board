<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
	 	 <li>
	 		<div>
	 			<P>첫번째 댓글 작성자</P>
	 			<p>첫번째 댓글</p>
	 		</div>
	 	</li>	 
	 	<li>
	 		<div>
	 			<P>두번째 댓글 작성자</P>
	 			<p>두번째 댓글</p>
	 		</div>
	 	</li>	 	
	 	<li>
	 		<div>
	 			<P>세번째 댓글 작성자</P>
	 			<p>세번째 댓글</p>
	 		</div>
	 	</li> 	
<%-- 	 	<c:forEach items ="${reply}" var="reply">
	 		<li>
		 		<div>
		 			<p>${reply.writer} / ${reply.regDate }</p>
		 			<p>${reply.content}</p>
		 		</div>
		 	</li>	 	
	 	</c:forEach> --%>
	 	
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