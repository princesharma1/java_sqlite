package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.ProjectDao;
import com.dto.ProjectDTO;
import com.util.Constants;
import com.util.DBConnection;
import com.util.DBUtil;
import com.util.PropertyUtil;
import com.util.Utility;

public class ProjectDaoImpl implements ProjectDao {

	@Override
	public List<ProjectDTO> getProjectlist() {
		Connection conn = null;
		PreparedStatement ps = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<ProjectDTO> list = null;
		ProjectDTO p = null;

		String sql = "select * from project_master";
		try {

			list = new ArrayList<ProjectDTO>();
			// conn = DBConnection.getInstance().getConnection();
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			// stmt = conn.createStatement();
			rs = ps.executeQuery();
			// rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					p = new ProjectDTO();
					p.setpId(rs.getString("p_id"));
					p.setpName(rs.getString("p_name"));
					p.setpDesc(rs.getString("p_desc"));
					p.setpIp(rs.getString("p_ip"));
					p.setAspPort(rs.getString("asp_port"));
					p.setJavaPort(rs.getString("java_port"));
					p.setLiveServer1Ip(rs.getString("live_server1_ip"));
					p.setLiveServer2Ip(rs.getString("live_server2_ip"));
					p.setLocalDbUrl(rs.getString("local_db_url"));
					p.setLocalDbUser(rs.getString("local_db_user"));
					p.setLocalDbPass(rs.getString("local_db_pass"));
					p.setUatDbUrl(rs.getString("uat_db_url"));
					p.setUatDbUser(rs.getString("uat_db_user"));
					p.setUatDbPass(rs.getString("uat_db_pass"));
					p.setLiveDbUrl(rs.getString("live_db_url"));
					p.setLiveDbUser(rs.getString("live_db_user"));
					p.setLiveDbPass(rs.getString("live_db_pass"));
					p.setWarName(rs.getString("war_name"));
					p.setWarPath(rs.getString("war_path"));
					p.setAspFullUrl(rs.getString("asp_full_url"));
					p.setJavaFullUrl(rs.getString("java_full_url"));
					// System.out.println("P: " + p);
					list.add(p);
				}
			} else {
				throw new Exception("No any Data found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Utility.close(conn, ps, rs);
		}
		return list;
	}

	@Override
	public List<ProjectDTO> getProjectById(String pid) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ProjectDTO> list = null;
		ProjectDTO p = null;
		String sql = "select * from project_master where p_id=?";
		try {

			list = new ArrayList<ProjectDTO>();
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, pid);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					p = new ProjectDTO();
					p.setpId(rs.getString("p_id"));
					p.setpName(rs.getString("p_name"));
					p.setpDesc(rs.getString("p_desc"));
					p.setpIp(rs.getString("p_ip"));
					p.setAspPort(rs.getString("asp_port"));
					p.setJavaPort(rs.getString("java_port"));
					p.setLiveServer1Ip(rs.getString("live_server1_ip"));
					p.setLiveServer2Ip(rs.getString("live_server2_ip"));
					p.setLocalDbUrl(rs.getString("local_db_url"));
					p.setLocalDbUser(rs.getString("local_db_user"));
					p.setLocalDbPass(rs.getString("local_db_pass"));
					p.setUatDbUrl(rs.getString("uat_db_url"));
					p.setUatDbUser(rs.getString("uat_db_user"));
					p.setUatDbPass(rs.getString("uat_db_pass"));
					p.setLiveDbUrl(rs.getString("live_db_url"));
					p.setLiveDbUser(rs.getString("live_db_user"));
					p.setLiveDbPass(rs.getString("live_db_pass"));
					p.setWarName(rs.getString("war_name"));
					p.setWarPath(rs.getString("war_path"));
					p.setAspFullUrl(rs.getString("asp_full_url"));
					p.setJavaFullUrl(rs.getString("java_full_url"));
					// System.out.println("P: " + p);
					list.add(p);
				}
			} else {
				throw new Exception("No any Data found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Utility.close(conn, ps, rs);
		}
		return list;
	}

	@Override
	public int create(ProjectDTO p) {
		int f;
		Connection conn = null;
		PreparedStatement ps = null;
		int rs = 0;
		List<ProjectDTO> list = null;
		String sql = "insert into project_master(" + Constants.PCOL
				+ ") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, p.getpId());
			ps.setString(2, p.getpName());
			ps.setString(3, p.getpDesc());
			ps.setString(4, p.getpIp());
			ps.setString(5, p.getAspPort());
			ps.setString(6, p.getJavaPort());
			ps.setString(7, p.getLiveServer1Ip());
			ps.setString(8, p.getLiveServer2Ip());
			ps.setString(9, p.getWarName());
			ps.setString(10, p.getWarPath());
			ps.setString(11, p.getAspFullUrl());
			ps.setString(12, p.getJavaFullUrl());
			ps.setString(13, p.getLocalDbUrl());
			ps.setString(14, p.getLocalDbUser());
			ps.setString(15, p.getLocalDbPass());
			ps.setString(16, p.getUatDbUrl());
			ps.setString(17, p.getUatDbUser());
			ps.setString(18, p.getUatDbPass());
			ps.setString(19, p.getLiveDbUrl());
			ps.setString(20, p.getLiveDbUser());
			ps.setString(21, p.getLiveDbPass());

			rs = ps.executeUpdate();
			if (rs > 0) {
				System.out.println("inserted");
			} else {
				System.out.println("Error Occured");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Utility.close(conn, ps);
		}
		return rs;
	}

	@Override
	public int update(ProjectDTO p,String pid) {
		Connection conn = null;
		PreparedStatement ps = null;
		int rs = 0;
		String[] colArr = Constants.PCOL.split(",");
		String sql = "update project_master set "+colArr[1]+"=?, "+colArr[2]+"=?, "+colArr[3]+"=?,"
				+ " "+colArr[4]+"=?, "+colArr[5]+"=?, "+colArr[6]+"=?, "+colArr[7]+"=?, "+colArr[8]+"=?,"
				+ " "+colArr[9]+"=?, "+colArr[10]+"=?, "+colArr[11]+"=?, "+colArr[12]+"=?, "+colArr[13]+"=?,"
				+ " "+colArr[14]+"=?, "+colArr[15]+"=?, "+colArr[16]+"=?, "+colArr[17]+"=?, "+colArr[18]+"=?,"
				+ " "+colArr[19]+"=?, "+colArr[20]+"=? where "+colArr[0]+"=?";
		System.out.println("SQL: " + sql);
		try {
    
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			//ps.setString(1, p.getpId());
			ps.setString(1, p.getpName());
			ps.setString(2, p.getpDesc());
			ps.setString(3, p.getpIp());
			ps.setString(4, p.getAspPort());
			ps.setString(5, p.getJavaPort());
			ps.setString(6, p.getLiveServer1Ip());
			ps.setString(7, p.getLiveServer2Ip());
			ps.setString(8, p.getWarName());
			ps.setString(9, p.getWarPath());
			ps.setString(10, p.getAspFullUrl());
			ps.setString(11, p.getJavaFullUrl());
			ps.setString(12, p.getLocalDbUrl());
			ps.setString(13, p.getLocalDbUser());
			ps.setString(14, p.getLocalDbPass());
			ps.setString(15, p.getUatDbUrl());
			ps.setString(16, p.getUatDbUser());
			ps.setString(17, p.getUatDbPass());
			ps.setString(18, p.getLiveDbUrl());
			ps.setString(19, p.getLiveDbUser());
			ps.setString(20, p.getLiveDbPass());
			ps.setString(21, pid);

			rs = ps.executeUpdate();
			if (rs > 0) {
				System.out.println("Project Updated");
			} else {
				System.out.println("Error Occured");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			 Utility.close(conn, ps);
		}
		return rs;
	}

	@Override
	public int delete(String pid) {
		Connection conn = null;
		PreparedStatement ps = null;
		int rs = 0;
		String[] colArr = Constants.PCOL.split(",");
		String sql = "delete from project_master where "+colArr[0]+"=?";
		System.out.println("SQL: " + sql + " - pid: " + pid);
		try {
    
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, pid);
			

			rs = ps.executeUpdate();
			if (rs > 0) {
				System.out.println("Project deleted");
			} else {
				System.out.println("Error occured");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			 Utility.close(conn, ps);
		}
		return rs;
	}

}
