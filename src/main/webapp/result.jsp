<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head><title>Kết quả đăng nhập</title></head>
<body>
    <c:choose>
        <c:when test="${not empty message}">
            <h3><c:out value="${message}" /></h3>
        </c:when>
        <c:otherwise>
            <h3>Không có thông báo để hiển thị.</h3>
        </c:otherwise>
    </c:choose>
    <a href="login.jsp">Quay lại đăng nhập</a>
</body>
</html>
