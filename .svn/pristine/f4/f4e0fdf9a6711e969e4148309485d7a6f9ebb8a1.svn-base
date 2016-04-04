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
		<c:when test="${not empty flights[0].id}">
			<table border="1">
				<caption>
					<fmt:message key="link.flights" />
				</caption>
				<thead>
					<tr>
						<th><fmt:message key="flight.id" /></th>
						<th><fmt:message key="flight.name" /></th>
						<th><fmt:message key="flight.departure" /></th>
						<th><fmt:message key="flight.arrival" /></th>
						<th><fmt:message key="flight.date" /></th>
						<th><fmt:message key="flight.crew_id" /></th>
						<th><fmt:message key="flight.crew_status" /></th>
						<th><fmt:message key="flight.status" /></th>
					</tr>
				</thead>
				<c:forEach var="fb" items="${flights}">
					<tr>
						<td>${fb.id }</td>
						<td>${fb.name }</td>
						<td>${fb.departure }</td>
						<td>${fb.arrival }</td>
						<td>${fb.date }</td>
						<td class="center"><c:choose>
								<c:when test="${fb.crewId==0}">
									<p>-</p>
								</c:when>
								<c:otherwise>
									<p>${fb.crewId}</p>
								</c:otherwise>
							</c:choose></td>
						<td>${fb.crewStatus }</td>
						<td>${fb.flightStatus }</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h2>
				<fmt:message key="flight.no_found" />
			</h2>
		</c:otherwise>
	</c:choose>

	<a href=controller?command=flights><fmt:message key="link.back" /></a>

	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
</body>
</html>