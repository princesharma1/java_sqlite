<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.*,com.util.Constants,com.dao.ProjectDao,com.dao.impl.ProjectDaoImpl,com.dto.ProjectDTO"%>

<jsp:include page="<%=Constants.PROJECT_HEADER%>"></jsp:include>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">Dashboard</div>
				<div class="card-body">
				<%
				String resMsg=request.getParameter("resMsg");
				if(null!=resMsg && !"".equalsIgnoreCase(resMsg)){
					out.println(resMsg);
				}   
				%>
				<div class="card-text">
				<a href="create.jsp" title="Add Project" class="btn btn-success">Add Project</a>
				</div>
					<div class="card-text">
						<table class="table table-responsive table-bordered">
							<thead>
								<tr>
									<td>Project Id</td>
									<td>Project Name</td>
									<td>Project IP</td>
									<td>Asp Port</td>
									<td>Java Port</td>
									<td>View</td>
									<td>Edit</td>
									<td>Delete</td>
								</tr>
							</thead>

							<tbody>
								<%
									ProjectDao pdao = new ProjectDaoImpl();
									List<ProjectDTO> list = pdao.getProjectlist();
									for (ProjectDTO p : list) {
								%>
								<tr>
									<td><%=p.getpId()%></td>
									<td><%=p.getpName()%></td>
									<td><%=p.getpIp()%></td>
									<td><%=p.getAspPort()%></td>
									<td><%=p.getJavaPort()%></td>
									<td><a href="view.jsp?pid=<%=p.getpId()%>" title="View">View</a></td>
									<td><a href="edit.jsp?pid=<%=p.getpId()%>" title="Edit">Edit</a></td>
									<td><a href='javascript:void(0)' id='delete' onclick='return _delete("<%=p.getpId()%>")' title='Deleted'>Delete</a></td>
								</tr>
								<%
									}
								%>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="<%=Constants.PROJECT_FOOTER%>"></jsp:include>