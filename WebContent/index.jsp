<%@ page pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf"%>
<html>
<c:set var="title" value="Login" />
<%@ include file="/WEB-INF/jspf/head.jspf"%>
<body>

	<%@ include file="/WEB-INF/jspf/header.jspf"%>
	<c:if test="${not empty user }">
		<c:redirect url="controller?command=main"/>
	</c:if>
	<div class="middle">

		<form id="login_form" action="controller" method="post">
			<input type="hidden" name="command" value="login" />
			<table>
				<tr>
					<td colspan="2"><input type="text" name="login"
						placeholder="<fmt:message key="login.login"  />" maxlength="10"
						required></td>
				</tr>
				<tr>
					<td colspan="2"><input type="password" name="password"
						placeholder="<fmt:message key="login.password"  />" required></td>
				</tr>
				<tr>
					<td><select name="localeToSet">
							<c:forEach var="localeName" items="${locales}">
								<option value="${localeName}">${localeName}</option>
							</c:forEach>
					</select></td>
					<td><input type="submit"
						value="<fmt:message key="login.submit"  />"></td>
				</tr>
			</table>
		</form>
	</div>
	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
</body>
</html>