<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, maximum-scale=1">
<title><tiles:getAsString name="title"></tiles:getAsString></title>
<link rel="icon" href="favicon.png" type="image/png">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css"> 
<link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet" type="text/css"> 
<link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet" type="text/css">
 
<!--[if lt IE 9]>
    <script src="js/respond-1.1.0.min.js"></script>
    <script src="js/html5shiv.js"></script>
    <script src="js/html5element.js"></script>
<![endif]-->
<style>
      #map {
        width: 100%;
        height: 400px;
        background-color: grey;
      }
    </style>
 
</head>
<body>

<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="footer" />

<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-scrolltofixed.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.nav.js"/>" ></script> 
<script type="text/javascript" src="<c:url value="/resources/js/jquery.easing.1.3.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.isotope.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/wow.js"/>" ></script> 
<script type="text/javascript" src="<c:url value="/resources/js/custom.js"/>" ></script>


</body>
</html>