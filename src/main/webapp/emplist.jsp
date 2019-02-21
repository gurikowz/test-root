<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>

		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20 
							<br />
							安全退出
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Salary
							</td>
							<td>
								Age
							</td>
							<td>
								Operation
							</td>
						</tr>
						<c:forEach items="${requestScope.list}" var="e" varStatus="vs">

							<tr class="row${vs.count %2+1}">
								<td>
									${e.id}
								</td>
								<td>
									${e.name}
								</td>
								<td>
									${e.salary}
								</td>
								<td>
									${e.age}
								</td>
								<td>
									<a href="/employee/removeEmployee?id=${e.id}">delete emp</a>&nbsp;<a href="/employee/getEmployeeInfo?id=${e.id}">update emp</a>
								</td>
							</tr>


						</c:forEach>

						<%--<tr class="row2">
							<td>
								2
							</td>
							<td>
								lishi
							</td>
							<td>
								20000
							</td>
							<td>
								20
							</td>
							<td>
								<a href="emplist.html">delete emp</a>&nbsp;<a href="updateEmp.html">update emp</a>
							</td>
						</tr>--%>
					</table>
					<p>
						<input type="button" class="button" value="Add Employee" onclick="location='/addEmp.jsp'"/>
					</p>
				</div>
				<a href="">1</a>
				<a href="">2</a>
				<a href="">3</a>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
