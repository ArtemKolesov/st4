<%@ page pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jspf/directive/page.jspf"%>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf"%>

<html>
<ctg:permit u="${user}" />
<fmt:message key="link.staff" var="title" />
<%@ include file="/WEB-INF/jspf/head.jspf"%>
<body>

	<%@ include file="/WEB-INF/jspf/header.jspf"%>

	<table class="flight_content" border="1">
		<caption>
			<fmt:message key="link.staff" />
		</caption>
		<thead>
			<tr>
				<th><a href=controller?command=staff&sort=id><fmt:message
							key="flight.id" /></a></th>
				<th><fmt:message key="staff.name" /></th>
				<th><a href=controller?command=staff&sort=surname><fmt:message
							key="staff.surname" /></a></th>
				<th><a href=controller?command=staff&sort=position><fmt:message
							key="staff.position" /></a></th>
				<th><fmt:message key="staff.birthdate" /></th>
				<th><a href=controller?command=staff&sort=crew_id><fmt:message
							key="flight.crew_id" /></a></th>
			</tr>
		</thead>
		<c:forEach var="fb" items="${staff}">
			<tr>
				<td>${fb.id }</td>
				<td>${fb.name }</td>
				<td>${fb.surname }</td>
				<td>${fb.position }</td>
				<td>${fb.birthdate }</td>
				<td class="center"><c:choose>
						<c:when test="${fb.crewId==0}">
							<p>-</p>
						</c:when>
						<c:otherwise>
							<p>${fb.crewId}</p>
						</c:otherwise>
					</c:choose></td>
			</tr>
		</c:forEach>
	</table>

	<br>

	<c:if test="${userRole eq 'ADMIN'}">
		<form action="controller" method="post">
			<input type="hidden" name="command" value="staff" /> <input
				type="hidden" name="option" value="delete" />
			<fmt:message key="staff.delete_staff" />
			<input type="number" name="id"
				placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
				type="submit" value="<fmt:message key="crew.delete" />"
				name="DELETE_staff_button">
		</form>

		<form action="controller" method="post">
			<input type="hidden" name="command" value="staff" /> <input
				type="hidden" name="option" value="add" />
			<fmt:message key="staff.add_staff" />
			<input type="number" name="id"
				placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
				type="text" name="name"
				placeholder="<fmt:message key="staff.name" />" required /> <input
				type="text" name="surname"
				placeholder="<fmt:message key="staff.surname" />" required /><select
				name="position_id">
				<c:forEach var="position" items="${positions}">
					<option value="${position.value}">${position.key}</option>
				</c:forEach>
			</select> <input type="date" name="birthdate" min="1960-01-01"
				min="1995-01-01" required> <input type="number"
				name="crew_id" placeholder="<fmt:message key="flight.crew_id" />"
				min="0" /> <input type="submit"
				value="<fmt:message key="crew.add" />" name="create_staff_button">
		</form>

		<form action="controller" method="post">
			<input type="hidden" name="command" value="staff" /> <input
				type="hidden" name="option" value="update" />
			<fmt:message key="staff.update_staff" />
			<input type="number" name="id"
				placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
				type="text" name="name"
				placeholder="<fmt:message key="staff.name" />" /> <input
				type="text" name="surname"
				placeholder="<fmt:message key="staff.surname" />" /><select
				name="position_id">
				<c:forEach var="position" items="${positions}">
					<option value="${position.value}">${position.key}</option>
				</c:forEach>
			</select> <input type="date" name="birthdate" min="1960-01-01"
				min="1995-01-01"> <input type="number" name="crew_id"
				placeholder="<fmt:message key="flight.crew_id" />" min="0" /> <input
				type="submit" value="<fmt:message key="locale.change" />"
				name="update_staff_button">
		</form>

	</c:if>
	<c:if test="${userRole eq 'CONTROLLER' }">
		<form action="controller" method="post">
			<input type="hidden" name="command" value="staff" /> <input
				type="hidden" name="option" value="change_crew" />
			<fmt:message key="flight.change_crew" />
			<input type="number" name="id"
				placeholder="<fmt:message key="flight.id" />" min="1" /> <input
				type="number" name="crew_id"
				placeholder="<fmt:message key="flight.crew_id" />" min="0" /> <input
				type="submit" value="<fmt:message key="locale.change" />"
				name="crew_button">
		</form>
	</c:if>
	<%@ include file="/WEB-INF/jspf/foot4staff.jspf"%>
</body>
</html>