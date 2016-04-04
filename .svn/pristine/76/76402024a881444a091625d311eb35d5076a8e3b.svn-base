<%@ page pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jspf/directive/page.jspf"%>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf"%>
<html>
<fmt:message key="link.flights" var="title" />
<%@ include file="/WEB-INF/jspf/head.jspf"%>

<body>
	<%@ include file="/WEB-INF/jspf/header.jspf"%>
	<ctg:permit u="${user}" />
	<c:choose>
		<c:when test="${empty flights}">No flights</c:when>

		<c:otherwise>
			<table class="flight_content" border="1">
				<caption>
					<fmt:message key="link.flights" />
				</caption>
				<thead>
					<tr>
						<th><a href=controller?command=flights&sort=id><fmt:message
									key="flight.id" /></a></th>
						<th><a href=controller?command=flights&sort=name><fmt:message
									key="flight.name" /></a></th>
						<th><fmt:message key="flight.departure" /></th>
						<th><fmt:message key="flight.arrival" /></th>
						<th><a href=controller?command=flights&sort=date><fmt:message
									key="flight.date" /></a></th>
						<th><fmt:message key="flight.crew_id" /></th>
						<th><fmt:message key="flight.crew_status" /></th>
						<th><fmt:message key="flight.status" /></th>
					</tr>
				</thead>
				<c:forEach var="bean" items="${flights}">
					<tr>
						<td>${bean.id}</td>
						<td>${bean.name}</td>
						<td>${bean.departure}</td>
						<td>${bean.arrival}</td>
						<td>${bean.date}</td>
						<td class="center"><c:choose>
								<c:when test="${bean.crewId==0}">
									<p>-</p>
								</c:when>
								<c:otherwise>
									<p>${bean.crewId}</p>
								</c:otherwise>
							</c:choose></td>
						<td>${bean.crewStatus}</td>
						<td>${bean.flightStatus}</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<form action="controller" method="post">
				<input type="hidden" name="command" value="flights" /> <input
					type="hidden" name="option" value="search" /><input type="hidden"
					name="by" value="id" />
				<fmt:message key="flight.search_by_id" />
				<input type="number" name="search_id" min="1" required /> <input
					type="submit" value="<fmt:message key="flight.search_button"/>"
					name="search_id_button">
			</form>

			<form action="controller" method="post">
				<input type="hidden" name="command" value="flights" /><input
					type="hidden" name="option" value="search" /> <input type="hidden"
					name="by" value="params" />
				<fmt:message>flight.search_my_params</fmt:message>
				<select name="dep_id">
					<c:forEach var="airport" items="${airports}">
						<option value="${airport.value}">${airport.key}</option>
					</c:forEach>
				</select> <select name="arr_id">
					<c:forEach var="airport" items="${airports}">
						<option value="${airport.value}">${airport.key}</option>
					</c:forEach>
				</select> <input type="date" name="date" min="2000-01-01" required> <input
					type="submit" value="<fmt:message key="flight.search_button"/>"
					name="search_params_button">
			</form>
		</c:otherwise>
	</c:choose>
	<c:if test="${userRole eq 'ADMIN'}">
		<form action="controller" method="post">
			<input type="hidden" name="command" value="flights" /> <input
				type="hidden" name="option" value="add" /> <fmt:message key="flight.add_flight" /> <input
				type="number" name="id"
				placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
				type="text" name="name" pattern="^[A-Z]{2}\s\d{3}$"
				placeholder="<fmt:message key="flight.name" />" required /> <select
				name="dep_id">
				<c:forEach var="airport" items="${airports}">
					<option value="${airport.value}">${airport.key}</option>
				</c:forEach>
			</select> <select name="arr_id">
				<c:forEach var="airport" items="${airports}">
					<option value="${airport.value}">${airport.key}</option>
				</c:forEach>
			</select> <input type="date" name="date" required /> <input type="number"
				name="crew_id" placeholder="<fmt:message key="flight.crew_id" />"
				min="0" /> <select name="stat_id">
				<c:forEach var="status" items="${statuses}">
					<option value="${status.value}">${status.key}</option>
				</c:forEach>
			</select> <input type="submit" value="<fmt:message key="crew.add" />" name="create_flight_button">
		</form>

		<form action="controller" method="post">
			<input type="hidden" name="command" value="flights" /> <input
				type="hidden" name="option" value="update" /><fmt:message key="flight.update_flight" /> <input
				type="number" name="id"
				placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
				type="text" name="name" pattern="^[A-Z]{2}\s\d{3}$"
				placeholder="<fmt:message key="flight.name" />" /> <select
				name="dep_id">
				<c:forEach var="airport" items="${airports}">
					<option value="${airport.value}">${airport.key}</option>
				</c:forEach>
			</select> <select name="arr_id">
				<c:forEach var="airport" items="${airports}">
					<option value="${airport.value}">${airport.key}</option>
				</c:forEach>
			</select> <input type="date" name="date" /> <input type="number"
				name="crew_id" placeholder="<fmt:message key="flight.crew_id" />"
				min="0" /> <select name="stat_id">
				<c:forEach var="status" items="${statuses}">
					<option value="${status.value}">${status.key}</option>
				</c:forEach>
			</select> <input type="submit" value="<fmt:message key="locale.change" />" name="update_flight_button">
		</form>

		<form action="controller" method="post">
			<input type="hidden" name="command" value="flights" /> <input
				type="hidden" name="option" value="delete" /> <fmt:message key="flight.delete_flight" /> <input
				type="number" name="id"
				placeholder="<fmt:message key="flight.id" />" min="1" required /> <input
				type="submit" value="<fmt:message key="crew.delete" />" name="delete_flight_button">
		</form>

	</c:if>
	<c:if test="${userRole eq 'CONTROLLER'}">
		<form action="controller" method="post">
			<input type="hidden" name="command" value="flights" /> <input
				type="hidden" name="option" value="change_status" /> <fmt:message key="crew.change_status" />
			<input type="number" name="id" min="1" required
				placeholder="<fmt:message key="flight.id" />" /> <select
				name="stat_id">
				<c:forEach var="status" items="${statuses}">
					<option value="${status.value}">${status.key}</option>
				</c:forEach>
			</select> <input type="submit" value="<fmt:message key="locale.change" />" name="staus_button">
		</form>

		<form action="controller" method="post">
			<input type="hidden" name="command" value="flights" /> <input
				type="hidden" name="option" value="change_crew" /> <fmt:message key="flight.change_crew" /> <input
				type="number" name="id" min="1"
				placeholder="<fmt:message key="flight.id" />" required /> <input
				type="number" name="crew_id"
				placeholder="<fmt:message key="flight.crew_id" />" min="0" required />
			<input type="submit" value="<fmt:message key="locale.change" />" name="crew_button">
		</form>

	</c:if>
	<%@ include file="/WEB-INF/jspf/foot4staff.jspf"%>
</body>
</html>