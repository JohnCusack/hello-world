<%--
  Created by IntelliJ IDEA.
  User: peker
  Date: 16/6/11
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
  <title>${title}</title>
  <t:insertAttribute name="head" ignore="true"/>
</head>
<body>
<a href="/base.html">Home</a>
<a href="/base/aboutus.html">aboutus</a>
<a href="/base/news.html">news</a>
<br>
<t:insertAttribute name="content"/>
<br>
Copyright 2016
</body>
</html>
