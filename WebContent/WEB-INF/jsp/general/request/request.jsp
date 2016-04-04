<%@ page pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jspf/directive/page.jspf"%>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf"%>

<html>
<ctg:permit u="${user}" />
<fmt:message key="link.requests" var="title" />
<%@ include file="/WEB-INF/jspf/head.jspf"%>
<body>
	<%@ include file="/WEB-INF/jspf/header.jspf"%>
	<c:if test="${userRole eq 'CONTROLLER'}">
	<br>
		<form action="controller" method="post">
			<input type="hidden" name="command" value="requests" /> <input
				type="hidden" name="option" value="add" /> <fmt:message key="request.add_request" /> <input
				type="number" name="pilots"
				placeholder="<fmt:message key="request.pilot" />" min="1" max=3  />
			<input type="number" name="navigators"
				placeholder="<fmt:message key="request.navigator" />" min="1" max=3  />
			<input type="number" name="operators"
				placeholder="<fmt:message key="request.operator" />" min="1" max=3 />
			<input type="number" name="hostess"
				placeholder="<fmt:message key="request.hostess" />" min="1" max=3 />
			<input type="number" name="crew_id"
				placeholder="<fmt:message key="flight.crew_id" />" min="1" required />
			<input type="submit" value="<fmt:message key="crew.add" />" name="create_request_button">
		</form>
	</c:if>
	<c:forEach var="request" items="${requests}">
		<ctg:req r="${request}" />
	</c:forEach>
	<c:if test="${userRole eq 'ADMIN'}">
	<form action="controller" method="post">
		<input type="hidden" name="command" value="requests" /> <input
			type="hidden" name="option" value="change_status" /> <fmt:message key="crew.change_status" /> <input
			type="number" name="id" placeholder="<fmt:message key="flight.id" />"
			min="1" required /> <select name="stat_id">
			<option value="2"><fmt:message key="request.status.confirm" /></option>
			<option value="3"><fmt:message key="request.status.reject" /></option>
		</select> <input type="submit" value="<fmt:message key="locale.change" />" name="staus_button">
	</form>
	</c:if>
	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
</body>
</html>