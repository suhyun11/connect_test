<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container" style="max-width: 1500px">
    <div class="py-5 text-center">
        <h2>회원목록</h2>
    </div>
    <div class="row">
            <div class="col">
                <li class="btn btn-primary float-end"><input type = "text" name = "Search" size = "20">&nbsp;<a href="components.html"><img
                				src="/img/Magnifier.png" style="width: 20px;" alt="Search"></a></li>
            </div>
        </div>
    <hr class="my-4">
    <div>
        <table class="table">
            <thead>
            <tr>
               <th>번호</th>
               <th>아이디</th>
               <th>비밀번호</th>
               <th>주소</th>
               <th>이메일</th>
               <th>전화번호</th>
               <th>이름</th>
               <th>권한</th>
               <th>가입일</th>
               <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="member" items="${members}">
                <tr>
                    <td>${member.member_No}</td>
                    <td>${member.member_Id}</td>
                    <td>${member.member_Pwd}</td>
                    <td>${member.member_Address}</td>
                    <td>${member.member_Email}</td>
                    <td>${member.member_Phone}</td>
                    <td>${member.member_Name}</td>
                    <td>${member.member_Grade}</td>
                    <td>${member.member_Date}</td>
                    <td>
                    <div class="col">
                        <c:url value="/basic/items/member/${member.member_No}/edit" var="editUrl"/>
                        <button class="w-100 btn btn-primary btn-lg" onclick="location.href='${editUrl}'" type="button">정보수정</button>
                    </div>
                    <td></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div> <!-- /container -->
</body>
</html>
