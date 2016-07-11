<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Owners Page</title>

    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>
<a href="../../index.jsp">Back to main menu</a>

<br/>
<br/>

<h1>Owner List</h1>

<c:if test="${!empty listOwners}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Ownername</th>
            <th width="120">Ownername</th>
            <th width="120">OwnerLastName</th>
            <th width="120">Tel</th>
            <th width="120">Email</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listOwners}" var="owner">
            <tr>
                <td>${owner.id}</td>
                <td><a href="/ownerdata/${owner.id}" target="_blank">${owner.ownername}</a></td>
                <td>${owner.ownername}</td>
                <td>${owner.ownerlastname}</td>
                <td>${owner.tel}</td>
                <td>${owner.email}</td>
                <td><a href="<c:url value='/edit/${owner.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${owner.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<h1>Add a Owner</h1>

<c:url var="addAction" value="/owners/add"/>

<form:form action="${addAction}" commandName="owner">
    <table>
        <c:if test="${!empty owner.ownername}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>


        <tr>

            <td>
                <form:label path="ownername">
                    <spring:message text="Ownername"/>
                </form:label>
            </td>

            <td>
                <form:input path="ownername"/>
            </td>

        </tr>

        <tr>

            <td>
                <form:label path="ownerlastname">
                    <spring:message text="Ownerlastname"/>
                </form:label>
            </td>

            <td>
                <form:input path="ownerlastname"/>
            </td>

        </tr>

        <tr>
        <tr>

            <td>
                <form:label path="tel">
                    <spring:message text="tel"/>
                </form:label>
            </td>
        <td>
            <form:input path="tel"/>
        </td>

        </tr>





        <tr>
            <td>
                <form:label path="email">
                    <spring:message text="email"/>
                </form:label>
            </td>
            <td>
                <form:input path="email"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty owner.ownername}">
                    <input type="submit"
                           value="<spring:message text="Edit Owner"/>"/>
                </c:if>
                <c:if test="${empty owner.ownername}">
                    <input type="submit"
                           value="<spring:message text="Add Owner"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
