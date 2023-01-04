<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>
<body>

<div id="nav">
		<%@ include file="../include/nav.jsp" %>
</div>

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
					<td>${list.bno}</td>
					<td>
						<a href = "/board/view?bno=${list.bno}">${list.title }</a> 
					</td>
					<%-- <td>${list.title }</td> --%>
					<td>${list.content }</td>					
					<td>${list.writer }</td>
					<%-- <td>${list.regDate }</td>  날짜 데이터포맷으로(yyyy-mm-dd)로 보이 바꿈 --%>
					<td>
						<fmt:formatDate value = "${list.regDate}" pattern = "yyyy-MM-dd" />
					</td>
					
					<td>${list.viewCnt }</td>
				</tr>
			
			
			</c:forEach>
		
		</tbody>
    </table>
    						<!-- 페이징 !!!! -->
    <div>
    	<c:forEach begin="1" end="${pageNum}" var = "num">
    		<span>
    			<a href="/board/listPage?num=${num}">${num}</a> 
    		</span>
    	</c:forEach>
    
    </div>
    
    
</body>
</html>