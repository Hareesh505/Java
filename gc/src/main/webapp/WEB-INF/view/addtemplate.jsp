<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Templates</title>
</head>
<body>
<form:form method="post" action="/gc/template/add" commandName="template">
 <form:input path="gcTempId" type="hidden" />
    <table>
    <tr>
        <td><form:label path="gcTempName"><spring:message code="label.tempName"/></form:label></td>
        <td><form:input path="gcTempName" /></td>
    </tr>
    <tr>
        <td><form:label path="gcTempDesc"><spring:message code="label.tempDec"/></form:label></td>
        <td><form:input path="gcTempDesc" /></td>
    </tr>
    <tr>
        <td><form:label path="gcTempImgPath"><spring:message code="label.tempFile"/></form:label></td>
        <td><form:input path="gcTempImgPath" type="file"/></td>
    </tr>
    <tr>
        <td><form:label path="gcTempParentId"><spring:message code="label.tempParent"/></form:label></td>
        <td><form:select path="gcTempParentId">
			   <form:option value="" label="--- Select ---"/>
			   <form:options items="${parentTemp}" />
			</form:select>
		</td>
    </tr>
    <tr>
        <td><form:label path="isParent"><spring:message code="label.isParent"/></form:label></td>
        <td><form:radiobutton path="isParent" value="Y"/>Yes
        	<form:radiobutton path="isParent" value="N"/>No         
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     

<c:if  test="${!empty templateList}">
<h3>Templates</h3>
<table class="data">
<tr>
    <th>Name</th>
    <th>Description</th>
    <th>Path</th>
    <th>Parent Temp Id</th>
    <th>IsParent</th>
    <th>&nbsp;</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${templateList}" var="temp">
    <tr>
        <td>${temp.gcTempName}</td>
        <td>${temp.gcTempDesc}</td>
        <td>${temp.gcTempImgPath}</td>
        <td>${temp.gcTempParentId }
        <td>${temp.isParent}</td>
        <td><a href="/gc/temp/edit/${temp.gcTempId}">Edit</a></td>
        <td><a href="/gc/temp/delete/${temp.gcTempId}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>