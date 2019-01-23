<%@ page language="java" contentType="text/html"%>
<%@include file="Demo.jsp"%>

	<body>
	<br/><br/><br/><br/><br/><br/>
	<form action="LoginCheck" method="post">
	<table align="right" width="40%">
		<tr bgcolor="black">
			<td colspan="2"><font color="white">Sign In Here</font> </td>
		</tr>
		<tr bgcolor="gray">
		<td>Login</td><td><input type="text" name="loginname"/></td>
		</tr>
		<tr bgcolor="gray">
		<td>Password</td><td><input type="password" name="passwd"/></td>
		</tr>
		<tr bgcolor="gray">
		<td colspan="2">
		<input type="submit" value="Login"/><input type="reset" value="Reset"/>
		</td>
		</tr>
	</table>
	</form>

	</body>
</html>