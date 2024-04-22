<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>新增报损</title>

    <style>
        /* 简洁表单样式 */
        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 2rem;
            border: 1px solid #ccc;
            border-radius: .25rem;
        }

        label {
            display: block;
            margin-bottom: .5rem;
        }

        input[type="text"],
        input[type="number"] {
            display: block;
            width: 100%;
            padding: .5rem;
            font-size: 1rem;
            line-height: 1.5;
            color: #495057;
            background-color: #fff;
            background-clip: padding-box;
            border: 1px solid #ced4da;
            border-radius: .25rem;
        }

        button {
            display: block;
            width: 100%;
            padding: .5rem;
            font-size: 1rem;
            line-height: 1.5;
            color: #fff;
            background-color: #0d6efd;
            border: 1px solid #0d6efd;
            border-radius: .25rem;
            cursor: pointer;
        }

        button:hover {
            background-color: #0b5ed7;
            border-color: #0a58ca;
        }

        /* 新增：按钮间距样式 */
        .button-spacer {
            height: .5rem;
            margin-top: .5rem;
        }
    </style>
</head>
<body>
<h1>新增报损</h1>

<form action="/zy_ssm/addDamageGoods" method="POST">
    <label for="name">商品名称：</label>
    <input type="text" id="name" name="name" required>

    <label for="cause">损坏原因：</label>
    <input type="text" id="cause" name="cause"  required>

    <label for="num">损坏数量：</label>
    <input type="number" id="num" name="num" required>


    <!-- 其他必要的字段... -->

    <button type="submit">保存</button>

    <!-- 新增：按钮间距 -->
    <div class="button-spacer"></div>

    <button type="button" onclick="window.location.href='/zy_ssm/admin_goods_list'">取消</button>
</form>
</body>

</html>
