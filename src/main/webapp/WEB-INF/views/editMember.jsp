<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

    <style>
        .container {
            max-width: 560px;
        }
    </style>
</head>
<body>
<div class="container" style="max-width: 600px">
    <div class="py-5 text-center">
        <h2>회원 수정</h2>
    </div>
     <h2>Edit Member</h2>
        <form method="POST" action="../${member.member_No}/edit">
          <div>
             <label for="member_id">아이디</label>
             <input type="text" id="member_Id" name="member_Id" value="${member.member_Id}" readonly/>
          </div>
          <div>
             <label for="member_pwd">비밀번호</label>
             <input type="password" id="member_Pwd" name="member_Pwd" value="${member.member_Pwd}"/>
          </div>
          <div>
             <label for="member_name">이름</label>
             <input type="text" id="member_Name" name="member_Name" value="${member.member_Name}" />
          </div>
          <div>
             <label for="member_address">주소</label>
             <input type="text" id="member_Address" name="member_Address" value="${member.member_Address}" />
          </div>
          <div>
             <label for="member_phone">전화번호</label>
             <input type="text" id="member_Phone" name="member_Phone" value="${member.member_Phone}" />
          </div>
          <div>
             <label for="member_email">이메일</label>
              <input type="email" id="member_Email" name="member_Email" value="${member.member_Email}" />
          </div>
          <hr class="my-4">
          <div class="row">
              <div class="col">
                    <button type="submit">저장</button>
              </div>
              <div class="col">
                    <c:url value="/basic/items/member" var="itemUrl"/>
                    <button onclick="location.href='${itemUrl}'" type="button">목록</button>
              </div>
              <div class="col">
                    <c:url value="/basic/items/member/${member.member_No}/delete" var="itemUrl"/>
                    <button onclick="location.href='${itemUrl}'" type="button">삭제</button>
              </div>
          </div>
        </form>
</div> <!-- /container -->
</body>
</html>
