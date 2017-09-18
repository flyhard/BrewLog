<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h1>
			<h:outputText value="#{BrewLog.name }" />
		</h1>
		<h:dataTable value="#{BrewLog.logEntries }" var="entry">
			<h:column rowHeader="ljhvl">
				<h:outputText value="#{entry.text}" />
			</h:column>
		</h:dataTable>
		<h:outputLabel for="newEntryText" value="New Entry"/>
		<h:inputText id="newEntryText" value="#{brewLogEntry.text }"/>
		<h:commandButton value="Save" action="#{brewLogEntry.save }"/>
	</f:view>
</body>
</html>