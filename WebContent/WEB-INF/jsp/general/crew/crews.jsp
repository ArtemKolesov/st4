<%@ page pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf"%>
<html>
<fmt:message key="link.crews" var="title" />
<%@ include file="/WEB-INF/jspf/head.jspf"%>
<body>
	<%@ include file="/WEB-INF/jspf/header.jspf"%>
	<ctg:permit u="${user}" />

	<table class="crew_content" border="1">
		<caption>
			<fmt:message key="link.crews" />
		</caption>
		<thead>
			<tr>
				<th><fmt:message key="flight.id" /></th>
				<th><fmt:message key="flight.crew_id" /></th>
				<th><fmt:message key="crew.flight_number" /></th>
			</tr>
		</thead>

		<c:forEach var="crew" items="${crews}">
			<tr>
				<td>${crew.id}</td>
				<td>${crew.status}</td>
				<td>${crew.flightNumber}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<form action="controller" method="post">
		<input type="hidden" name="command" value="crews" /> <input
			type="hidden" name="option" value="change_status" />
		<fmt:message key="crew.change_status" />
		<input type="number" name="id"
			placeholder="<fmt:message key="flight.id" />" min="1" required /> <select
			name="stat_id">
			<c:forEach var="status" items="${statuses}">
				<option value="${status.value}">${status.key}</option>
			</c:forEach>
		</select> <input type="submit" value="<fmt:message key="locale.change" />"
			name="staus_button">
	</form>
	<form action="controller" method="post">
		<input type="hidden" name="command" value="crews" /> <input
			type="hidden" name="option" value="add" />
		<fmt:message key="crew.add_crew" />
		<input type="number" name="id"
			placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
			type="submit" value="<fmt:message key="crew.add" />"
			name="add_button">
	</form>
	<form action="controller" method="post">
		<input type="hidden" name="command" value="crews" /> <input
			type="hidden" name="option" value="delete" />
		<fmt:message key="crew.delete_crew" />
		<input type="number" name="id"
			placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
			type="submit" value="<fmt:message key="crew.delete" />"
			name="delete_button">
	</form>
	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
</body>
</html>