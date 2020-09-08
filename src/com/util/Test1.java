package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.dto.ProjectDTO;

public class Test1 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Statement stmt = null;
		List<ProjectDTO> list = null;
		String sql = "select * from project_master";
		try {
			conn = DBConnection.getInstance().getConnection();
			System.out.println("Database Connected");
			//ps = conn.prepareStatement(sql);
			stmt = conn.createStatement();
			//rs = ps.executeQuery();
			rs=stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("-------------------------------");
				System.out.println(rs.getString("p_id"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
