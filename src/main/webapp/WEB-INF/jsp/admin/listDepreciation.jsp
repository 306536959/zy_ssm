<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <style>
    table {
      border-collapse: collapse;
      width: 100%;
    }

    th, td {
      border: 1px solid #ccc;
      padding: 8px;
      text-align: left;
    }

    th {
      background-color: #f2f2f2;
      font-weight: bold;
    }

    /* 规划列宽 */
    th:first-child,
    td:first-child {
      width: 90px;
    }

    th:nth-child(2),
    td:nth-child(2) {
      width: 1.jpgpx;
    }

    th:nth-child(3),
    td:nth-child(3) {
      width: 100px;
    }

    th:last-child,
    td:last-child {
      width: 60px;
    }
  </style>
</head>
<body>
<div class="search-container">
  <button type="button" onclick="cz()">返回</button>
</div>
<table>
  <thead>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Time</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${depreciations}" var="item">
    <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
      <td>${item.price}</td>
      <td>${item.time}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
<script>
 function cz(){
   window.location.href="/zy_ssm_war/admin_goods_list";
 }
</script>
