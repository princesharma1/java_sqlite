<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.*,com.util.Constants,com.dao.ProjectDao,com.dao.impl.ProjectDaoImpl,com.dto.ProjectDTO"%>
<%
	String pid = request.getParameter("pid");
%>
<jsp:include page="<%=Constants.PROJECT_HEADER%>"></jsp:include>
<div class="container">
	<div class="row">
		<%
			ProjectDao pdao = new ProjectDaoImpl();
			List<ProjectDTO> list = pdao.getProjectById(pid);
			for (ProjectDTO p : list) {
		%>
		<table class="table table-responsive table-bordered">
			<tbody>
				<tr>
					<td>Project Id</td>
					<td><%=p.getpId()%></td>
				</tr>
				<tr>
					<td>Project Name</td>
					<td><%=p.getpName()%></td>
				</tr>
				<tr>
					<td>Project Desc</td>
					<td><%=p.getpDesc()%></td>
				</tr>
				<tr>
					<td>Project IP</td>
					<td><%=p.getpIp()%></td>
				</tr>
				<tr>
					<td>Project ASP PORT</td>
					<td><%=p.getAspPort()%></td>
				</tr>
				<tr>
					<td>Project Java Port</td>
					<td><%=p.getJavaPort()%></td>
				</tr>
				<tr>
					<td>ASP Full Url</td>
					<td><%=p.getAspFullUrl()%></td>
				</tr>
				<tr>
					<td>Java Full URL</td>
					<td><%=p.getJavaFullUrl()%></td>
				</tr>
				<tr>
					<td>Local Db URL</td>
					<td><%=p.getLocalDbUrl()%></td>
				</tr>
				<tr>
					<td>Local Db User</td>
					<td><%=p.getLocalDbUser()%></td>
				</tr>
				<tr>
					<td>LOCAL DB PASSWORD</td>
					<td><%=p.getLocalDbPass()%></td>
				</tr>
				<tr>
					<td>UAT DB URL</td>
					<td><%=p.getUatDbUrl()%></td>
				</tr>
				<tr>
					<td>UAT DB USER</td>
					<td><%=p.getUatDbUser()%></td>
				</tr>
				<tr>
					<td>UAT DB PASSWORD</td>
					<td><%=p.getUatDbPass()%></td>
				</tr>
				<tr>
					<td>Live DB URL</td>
					<td><%=p.getLiveDbUrl()%></td>
				</tr>
				<tr>
					<td>Live DB User</td>
					<td><%=p.getLiveDbUser()%></td>
				</tr>
				<tr>
					<td>Live DB Password</td>
					<td><%=p.getLiveDbPass()%></td>
				</tr>
				<tr>
					<td>Live Server IP1</td>
					<td><%=p.getLiveServer1Ip()%></td>
				</tr>
				<tr>
					<td>Live Server IP2</td>
					<td><%=p.getLiveServer2Ip()%></td>
				</tr>
				<tr>
				
			</tbody>
		</table>
		<%
			}
		%>
	</div>

</div>
<jsp:include page="<%=Constants.PROJECT_FOOTER%>"></jsp:include>