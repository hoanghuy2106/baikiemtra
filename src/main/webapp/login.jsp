<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head><title>Đăng nhập</title></head>
<body>
    <h2>Đăng nhập</h2>
    <form method="post" action="login">
        Tên đăng nhập: <input type="text" name="username" /><br/>
        Mật khẩu: <input type="password" name="password" /><br/>
        <input type="submit" value="Đăng nhập" />
    </form>

    <c:if test="${not empty error}">
        <p style="color:red;"><c:out value="${error}" /></p>
    </c:if>
</body>
</html>
