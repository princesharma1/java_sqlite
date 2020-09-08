package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDao;
import com.dao.impl.ProjectDaoImpl;
import com.dto.ProjectDTO;
import com.util.Constants;

/**
 * Servlet implementation class ProjectAction
 */
@WebServlet("/ProjectAction")
public class ProjectAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ProjectAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String resMsg = "";
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ProjectDao pdao = new ProjectDaoImpl();
		RequestDispatcher rd = null;
		System.out.println("Action : " + action);
		if (null != action && !"".equalsIgnoreCase(action)) {
			if (Constants.ADD.equalsIgnoreCase(action)) {
				ProjectDTO p = setDTO(request);
				System.out.println("P: " + p);
				int result = pdao.create(p);    
				if (result > 0) {
					resMsg = Constants.INSERT_SUCCESS_MSG;
					out.println("Inserted Successfully!");
				} else {
					resMsg = Constants.INSERT_ERROR_MSG;
					out.println("Error Occured!");
				}
				rd = request.getRequestDispatcher("/views/projects/create.jsp?resMsg=" + resMsg);
				rd.forward(request, response);
			} else if (Constants.UPDATE.equalsIgnoreCase(action)) {
				String pid = request.getParameter("p_id");
				ProjectDTO p = setDTO(request);
				System.out.println("P: " + p);
				int result = pdao.update(p,pid);   
				if (result > 0) {
					resMsg = Constants.UPDATE_SUCCESS_MSG;
					out.println("Updated Successfully!");
				} else {
					resMsg = Constants.UPDATE_ERROR_MSG;
					out.println("Error Occured!");
				}
				rd = request.getRequestDispatcher("/views/projects/edit.jsp?resMsg=" + resMsg);
				rd.forward(request, response);
			} else if (Constants.DELETE.equalsIgnoreCase(action)) {
				String pid = request.getParameter("pid");
				System.out.println("PID: " +pid);
				int result = pdao.delete(pid);   
				if (result > 0) {
					resMsg = Constants.DELETE_SUCCESS_MSG;
					out.println("Deleted Successfully!");
				} else {
					resMsg = Constants.DELETE_ERROR_MSG;
					out.println("Error Occured!");
				}
				rd = request.getRequestDispatcher("/views/projects?resMsg=" + resMsg);
				rd.forward(request, response);

			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected ProjectDTO setDTO(HttpServletRequest request) {
		ProjectDTO p = new ProjectDTO();
		p.setpId(request.getParameter("p_id"));
		p.setpName(request.getParameter("p_name"));
		p.setpDesc(request.getParameter("p_desc"));
		p.setpIp(request.getParameter("p_ip"));
		p.setAspPort(request.getParameter("asp_port"));
		p.setJavaPort(request.getParameter("java_port"));
		p.setLiveServer1Ip(request.getParameter("live_server1_ip"));
		p.setLiveServer2Ip(request.getParameter("live_server2_ip"));
		p.setLocalDbUrl(request.getParameter("local_db_url"));
		p.setLocalDbUser(request.getParameter("local_db_user"));
		p.setLocalDbPass(request.getParameter("local_db_pass"));
		p.setUatDbUrl(request.getParameter("uat_db_url"));
		p.setUatDbUser(request.getParameter("uat_db_user"));
		p.setUatDbPass(request.getParameter("uat_db_pass"));
		p.setLiveDbUrl(request.getParameter("live_db_url"));
		p.setLiveDbUser(request.getParameter("live_db_user"));
		p.setLiveDbPass(request.getParameter("live_db_pass"));
		p.setWarName(request.getParameter("war_name"));
		p.setWarPath(request.getParameter("war_path"));
		p.setAspFullUrl(request.getParameter("asp_full_url"));
		p.setJavaFullUrl(request.getParameter("java_full_url"));
		return p;

	}
}
