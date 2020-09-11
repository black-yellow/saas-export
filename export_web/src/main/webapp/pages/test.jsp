<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
              crossorigin="anonymous">
    </head>
    <body>

        <table id="table01" class="table table-condensed">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>expiration_date</th>
                <th>address</th>
                <th>license_id</th>
                <th>representative</th>
                <th>phone</th>
                <th>company_size</th>
                <th>industry</th>
                <th>remarks</th>
                <th>state</th>
                <th>balance</th>
            </tr>
            <c:forEach items="${companyList}" var="company" varStatus="status">
                <tr>
                    <td>${status.index}</td>
                    <td>${company.name}</td>
                    <td>${company.expirationDate}</td>
                    <td>${company.address}</td>
                    <td>${company.licenseId}</td>
                    <td>${company.representative}</td>
                    <td>${company.phone}</td>
                    <td>${company.companySize}</td>
                    <td>${company.industry}</td>
                    <td>${company.remarks}</td>
                    <td>${company.state}</td>
                    <td>${company.balance}</td>
                </tr>
            </c:forEach>


        </table>

    </body>
</html>
