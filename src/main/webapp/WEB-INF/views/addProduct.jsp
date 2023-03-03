<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <style>
        .container {
            max-width: 560px;
        }
    </style>
</head>
<body>
<div>
    <div>
        <h2>상품 등록</h2>
    </div>
    <h4>상품 입력</h4>
    <form action="/basic/items/product/add" method="post">
        <div>
           <label for="name">책제목</label>
           <input type="text" id="product_title" name="product_title" placeholder="이름을 입력하세요">
        </div>
        <div>
           <label for="subtitle">부제목</label>
           <input type="text" id="product_subtitle" name="product_subtitle" placeholder="부제목을 입력하세요">
        </div>
        <div>
           <label for="writer">작가</label>
           <input type="text" id="product_writer" name="product_writer" placeholder="작가를 입력하세요">
        </div>
        <div>
           <label for="price">가격</label>
           <input type="text" id="product_price" name="product_price" placeholder="가격을 입력하세요">
        </div>
        <div>
            <label for="img">이미지</label>
            <input type="text" id="product_img" name="product_img" placeholder="이미지 URL을 입력하세요">
        </div>
        <div>
            <label for="date">출간일</label>
            <input type="text" id="product_date" name="product_date" placeholder="출간일을 입력하세요 (yyyy-MM-dd)">
        </div>
        <div>
            <label for="page">페이지 수</label>
            <input type="text" id="product_page" name="product_page" placeholder="페이지 수를 입력하세요">
        </div>
        <div>
            <label for="editor">내용</label>
            <input type="text" id="product_code" name="product_code" placeholder="내용을 입력하세요">
            </div>
        <div>
            <label for="stock">재고</label>
            <input type="text" id="product_stock" name="product_stock" placeholder="재고를 입력하세요">
        </div>
        <hr class="my-4">
        <div class="row">
            <div class="col">
                <button type="submit">상품등록</button>
            </div>
            <div class="col">
                <button onclick="location.href='/basic/items/product'" type="button">취소</button>
            </div>
        </div>
    </form>
</div> <!-- /container -->
</body>
</html>
