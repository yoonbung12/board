<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>
<body>
    <table>
 		<thead>   	
	        <tr>
	            <th>번호</th>
	            <th>제목</th>
	            <th>내용</th>
	            <th>작성자</th>
	            <th>작성일</th>
	            <th>조회수</th>
	        </tr>
		</thead>
		<tbody>
			
			<!-- list 받아오기 -->
			<c:forEach items = "${list}" var = "list">
				<tr>
					<td>
						<a href = "/board/view?bno = ${list.bno}">${list.title }</a> 
					</td>
					<td>${list.bno}</td>
					<td>${list.title }</td>
					<td>${list.content }</td>					
					<td>${list.writer }</td>
					<td>${list.regDate }</td>
					<td>${list.viewCnt }</td>
				</tr>
			
			
			</c:forEach>
		
		</tbody>
    </table>
</body>
</html>