<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.*,com.util.Constants,com.dao.ProjectDao,com.dao.impl.ProjectDaoImpl,com.dto.ProjectDTO"%>

<jsp:include page="<%=Constants.PROJECT_HEADER%>"></jsp:include>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div class="card">
				<h5 class="card-header">Add Project</h5>
				<div class="card-body">
				<%
				String resMsg=request.getParameter("resMsg");
				if(null!=resMsg && !"".equalsIgnoreCase(resMsg)){
					out.println(resMsg);
				}   
				%>
					<div class="card-text">
						<form name="addProject" id="addProject" method="post"
							action="<%=request.getContextPath() %>/ProjectAction">
							<input type="hidden" name="action" id="action" value="add" />
							<table class="table table-responsive">
								<thead>
									<tr>
										<td>Project Id</td>
										<td><input type="text" class="form-control" name="p_id"
											id="p_id" value="" /></td>
									</tr>
									<tr>
										<td>Project Name</td>
										<td><input type="text" class="form-control" name="p_name"
											id="p_name" value="" /></td>
									</tr>
									<tr>
										<td>Project Desc</td>
										<td><!-- <input type="text" class="form-control" name="p_desc"
											id="p_desc" value="" /> -->
											<textarea class="form-control" name="p_desc"
											id="p_desc" value=""></textarea>
											</td>
									</tr>
									<tr>
										<td>Project IP</td>
										<td><input type="text" class="form-control" name="p_ip"
											id="p_ip" value="" /></td>
									</tr>
									<tr>
										<td>Project ASP PORT</td>
										<td><input type="text" class="form-control" name="asp_port"
											id="asp_port" value="" /></td>
									</tr>
									<tr>
										<td>Project Java Port</td>
										<td><input type="text" class="form-control"
											name="java_port" id="java_port" value="" /></td>
									</tr>
									<tr>
										<td>ASP Full Url</td>
										<td><input type="text" class="form-control"
											name="asp_full_url" id="asp_full_url" value="" /></td>
									</tr>
									<tr>
										<td>Java Full URL</td>
										<td><input type="text" class="form-control"
											name="java_full_url" id="java_full_url" value="" /></td>
									</tr>
									<tr>
										<td>War Name</td>
										<td><input type="text" class="form-control"
											name="war_name" id="war_name" value="" /></td>
									</tr>
									<tr>
										<td>War Path</td>
										<td><input type="text" class="form-control"
											name="war_path" id="war_path" value="" /></td>
									</tr>
									<tr>
										<td>Local Db URL</td>
										<td><input type="text" class="form-control"
											name="local_db_url" id="local_db_url" value="" /></td>
									</tr>
									<tr>
										<td>Local Db User</td>
										<td><input type="text" class="form-control"
											name="local_db_user" id="local_db_user" value="" /></td>
									</tr>
									<tr>
										<td>LOCAL DB PASSWORD</td>
										<td><input type="text" class="form-control"
											name="local_db_pass" id="local_db_pass" value="" /></td>
									</tr>
									<tr>
										<td>UAT DB URL</td>
										<td><input type="text" class="form-control"
											name="uat_db_url" id="uat_db_url" value="" /></td>
									</tr>
									<tr>
										<td>UAT DB USER</td>
										<td><input type="text" class="form-control"
											name="uat_db_user" id="uat_db_pass" value="" /></td>
									</tr>
									<tr>
										<td>UAT DB PASSWORD</td>
										<td><input type="text" class="form-control"
											name="uat_db_pass" id="uat_db_pass" value="" /></td>
									</tr>
									<tr>
										<td>Live DB URL</td>
										<td><input type="text" class="form-control"
											name="live_db_url" id="live_db_url" value="" /></td>
									</tr>
									<tr>
										<td>Live DB User</td>
										<td><input type="text" class="form-control"
											name="live_db_user" id="live_db_user" value="" /></td>
									</tr>
									<tr>
										<td>Live DB Password</td>
										<td><input type="text" class="form-control"
											name="live_db_pass" id="live_db_pass" value="" /></td>
									</tr>
									<tr>
										<td>Live Server IP1</td>
										<td><input type="text" class="form-control" name="lip1"
											id="lip1" value="" /></td>
									</tr>
									<tr>
										<td>Live Server IP2</td>
										<td><input type="text" class="form-control" name="lip2"
											id="lip2" value="" /></td>
									</tr>
									<tr>
									<td>&nbsp;</td>
									<td><input type="submit" value="Submit" class="btn btn-success" />
									</tr>
								</tbody>
							</table>
							
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="<%=Constants.PROJECT_FOOTER%>"></jsp:include>