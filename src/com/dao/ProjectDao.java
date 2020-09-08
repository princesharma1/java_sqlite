package com.dao;

import java.util.List;

import com.dto.ProjectDTO;

public interface ProjectDao {
	List<ProjectDTO> getProjectlist();
	List<ProjectDTO> getProjectById(String pid);
	int create(ProjectDTO p);
	int update(ProjectDTO p,String pid);
	int delete(String pid);

}
