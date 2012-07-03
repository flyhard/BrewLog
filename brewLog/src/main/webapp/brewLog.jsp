<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h1>Brew Log</h1>
		<h:form>
			<h:outputLabel for="name">Name: </h:outputLabel>
			<h:inputText id="name" value="#{BrewLog.name }" required="true" />
			<h:commandButton action="#{brewLogController.create }"
				value="Create Log" />
			<h:messages showDetail="true" showSummary="false" />
		</h:form>
	</f:view>
</body>
</html>