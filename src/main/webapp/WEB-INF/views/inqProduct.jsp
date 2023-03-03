<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>

</head>
<body>
    <div style="max-width: 1500px">
        <div class="py-5 text-center">
            <h2>상품 목록</h2>
        </div>
        <div class="row">
            <div class="col">
                <button onclick="location.href='product/add'" type="button">상품 등록 </button>
            </div>
        </div>
        <hr>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>이미지</th>
                        <th width = "30%">상품명</th>
                        <th width = "15%">작가</th>
                        <th>가격</th>
                        <th>페이지 수</th>
                        <th>재고</th>
                        <th>판매량</th>
                        <th>조회수</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="product" items="${products}">
                        <tr>
                            <td>${product.product_num}</td>
                            <td><img src=${product.product_img} style="width: 50px;" alt="img"></td>
                            <td>${product.product_title}</td>
                            <td>${product.product_writer}</td>
                            <td>${product.product_price} 원</td>
                            <td>${product.product_page}</td>
                            <td>${product.product_stock}</td>
                            <td>${product.product_sale}</td>
                            <td>${product.product_visit}</td>
                            <td>
                               <div class="col">
                                 <c:url value="/basic/items/product/${product.product_num}" var="deUrl"/>
                                 <button class="w-100 btn btn-primary btn-lg" onclick="location.href='${deUrl}'" type="button">상세보기</button>
                                </div>
                            </td>
                            <td>
                               <div class="col">
                                 <c:url value="/basic/items/member/${member.member_No}/edit" var="editUrl"/>
                                 <button class="w-100 btn btn-primary btn-lg" onclick="location.href='${editUrl}'" type="button">삭제</button>
                               </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div> <!-- /container -->
</body>
</html>
