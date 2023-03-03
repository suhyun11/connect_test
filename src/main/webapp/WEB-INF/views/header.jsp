<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="author" content="Devcrud">
<meta http-equiv="Content-Type" content = "text/html; charset=UTF-8"></meta>
<title>header</title>
<link rel="stylesheet" href="/css/hdcss.css">
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="40" id="home">

	<nav class="navbar nav-first navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="#"> <img
				src="/img/sponge.png" style="width: 100px;"
				alt="Logo">
			</a>
			<ul class="navbar-nav ml-auto">
				<li><a href="#" class="btn btn-primary btn-sm">로그인</a> <a href="#" class="btn btn-primary btn-sm">회원가입</a>
					<a href="#" class="btn btn-primary btn-sm"><img src="/img/basket.png" style="width: 20px;" alt="basket">&nbsp;장바구니</a></li>
			</ul>
		</div>
	</nav>


	<nav
		class="nav-second navbar custom-navbar navbar-expand-sm navbar-dark bg-dark sticky-top">
		<div class="container">
			<button class="navbar-toggler ml-auto" type="button"
				data-toggle="collapse" data-target="#navbarSupportedContent"
				aria-controls="navnav-linkbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li><a class="nav-link" href="#">BEST</a>
					</li>
					<li><a class="nav-link" href="#">NEW</a>
					</li>
				</ul>
				<ul class="navbar-nav ml-auto">
					<li class="btn btn-primary btn-sm"><input type = "text" name = "Search" size = "15">&nbsp;<a href="components.html"><img
				src="/img/Magnifier.png" style="width: 20px;" alt="Search"></a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<div class = "text-center">△ 헤더 <br> ▽ 푸터</div>

   <div class="py-4 border border-lighter border-bottom-0 border-left-0 border-right-0 bg-dark" >
        <div class="container">
<!--             <div class="row justify-content-between align-items-center text-center"> -->
<!--                 <div class="col-md-3 text-md-left mb-3 mb-md-0"> -->
<%--                     <img src="/img/sponge.png" width="100" alt="Logo" class="mb-0"> --%>
<!--                 </div> -->
                <div class="col-md-9 text-center">
                    <a href="#" class="px-3"><small class="font-weight-bold">이용안내</small></a>
                    <a href="#" class="px-3"><small class="font-weight-bold">정책</small></a>
                    <a href="#" class="pl-3"><small class="font-weight-bold">고객지원</small></a>
                </div>
<!--             </div> -->
        </div>
    </div>
    
	<footer
		class="border border-dark border-left-0 border-right-0 border-bottom-0 p-4 bg-dark">
		<div class="container">
				<div class="row align-items-center text-center text-md-left col">
					<p class="mb-0 small">
						<a href="">프로젝트 소개</a>&nbsp;|&nbsp;<a href="">조원소개</a>&nbsp;|&nbsp;<a href="">개발범위</a>&nbsp;|&nbsp;<a href="">시스템 요구사항</a>
					</p>
				</div>
		</div>
	</footer>
</body>
</html>