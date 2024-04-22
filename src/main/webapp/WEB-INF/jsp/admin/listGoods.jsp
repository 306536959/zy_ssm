<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>

  <!-- CSS样式 -->
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
      width: 100px;
    }

    th:nth-child(3),
    td:nth-child(3) {
      width: 100px;
    }
    th:nth-child(4),
    td:nth-child(4) {
      width: 100px;
    }

    th:last-child,
    td:last-child {
      width:200px;
    }
  </style>
</head>

<body>
<!-- 搜索区域 -->
<div class="search-container">
  <button type="button" onclick="add()">增加商品</button>
  <input type="text" id="searchInputName" placeholder="请输入名称关键词...">
  <input type="text" id="searchInputPrice" placeholder="请输入价格关键词...">
  <input type="text" id="searchInputType" placeholder="请输入类型关键词...">
  <button type="button" onclick="performSearch()">查询</button>
  <button type="button" onclick="cz()">重置</button>
</div>

<!-- 损毁/折旧按钮 -->
<div class="search-container">
  <button type="button" onclick="addsh()">损毁商品填报</button>
  <button type="button" onclick="addzj()">商品折旧填报</button>
</div>

<!-- 商品列表表格 -->
<table>
  <thead>
  <tr>
    <th>商品ID</th>
    <th>商品名称</th>
    <th>商品价格</th>
    <th>商品库存</th>
    <th>商品类型</th>
    <th>折旧时间</th>
    <th>商品添加时间</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="item">
    <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
      <td>${item.price}</td>
      <td>${item.num}</td>
      <td>${item.type}</td>
      <td>${item.oldtime}</td>
      <td>${item.time}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>

<!-- 脚本区域 -->
<script>
  function addzj() {
    window.location.href = "/zy_ssm_war/depreciationGoods";
  }

  function addsh() {
    window.location.href = "/zy_ssm_war/damageGoods";
  }

  function add() {
    window.location.href = "/zy_ssm_war/add_goods";
  }

  function cz() {
    window.location.href = "/zy_ssm_war/admin_goods_list";
  }

  function performSearch() {
    const name = document.getElementById('searchInputName').value.trim();
    const price = document.getElementById('searchInputPrice').value.trim();
    const type = document.getElementById('searchInputType').value.trim();
    let urlParams = "";
    console.log(name);

    if (name != null) {
      urlParams += "name=" + encodeURIComponent(name);
    }

    if (price != null) {
      if (!urlParams == "") {
        urlParams += "&";
      }
      urlParams += "price=" + encodeURIComponent(price);
    }

    if (type != null) {
      if (!urlParams == "") {
        urlParams += "&";
      }
      urlParams += "type=" + encodeURIComponent(type);
    }

    if (!urlParams == "") {
      window.location.href = "/zy_ssm_war/admin_goods_list?" + urlParams;
    } else {
      window.location.href = "/zy_ssm_war/admin_goods_list";
    }
  }
</script>
</html>
