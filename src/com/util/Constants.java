package com.util;

public class Constants {
	public static final String FILE_SEPARATOR="/";
	public static final String DBPATH = "dbpath";
	public static final String PROP_FILE_LOCATION = "resources/";
	public static final String APP_PROP = "app.properties";

	public static final String SQLITE_CLASS_NAME = "org.sqlite.JDBC";
	public static final String SQLITE_JDBC_PRE_URL = "jdbc:sqlite:";
	
	public static final String PROJECT_NAME="Project";

	public static final String PROJECT_HEADER="/views/projects/common/header.jsp";
	public static final String PROJECT_FOOTER="/views/projects/common/footer.jsp";
	public static final String PROJECT_ASSETS="/static";
	public static final String PCOL="p_id,p_name,p_desc,p_ip,asp_port,java_port,live_server1_ip,live_server2_ip,war_name,war_path,asp_full_url,java_full_url,local_db_url,local_db_user,local_db_pass,uat_db_url,uat_db_user,uat_db_pass,live_db_url,live_db_user,live_db_pass";
	public static final String ADD = "add";
	public static final String UPDATE = "update";
	public static final String DELETE = "delete";
	public static final String INSERT_SUCCESS_MSG= "<div id='_msg_box'><div id='_success_msg'>Project inserted successfully. <div class='_close'>X</div></div></div>";
	public static final String INSERT_ERROR_MSG= "<div id='_msg_box'><div id='_error_msg'>Error occured during insertion. <div class='_close'>X</div></div></div>";
	public static final String UPDATE_SUCCESS_MSG= "<div id='_msg_box'><div id='_success_msg'>Project updated successfully. <div class='_close'>X</div></div></div>";
	public static final String UPDATE_ERROR_MSG= "<div id='_msg_box'><div id='_error_msg'>Error Occured during updation. <div class='_close'>X</div></div></div>";
	public static final String DELETE_SUCCESS_MSG ="<div id='_msg_box'><div id='_success_msg'>Project deleted successfully. <div class='_close'>X</div></div></div>";
	public static final String DELETE_ERROR_MSG = "<div id='_msg_box'><div id='_error_msg'>Error Occured during delettion. <div class='_close'>X</div></div></div>";
	
}            
      