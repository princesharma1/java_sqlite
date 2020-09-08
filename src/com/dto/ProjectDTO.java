package com.dto;

public class ProjectDTO {
	private String pId;
	private String pName;
	private String pDesc;
	private String pIp;
	private String aspPort;
	private String javaPort;
	private String liveServer1Ip;
	private String liveServer2Ip;
//		private ProjectDB pdb;
//		private ProjectWar pwar;

	private String warName;
	private String warPath;
	private String aspFullUrl;
	private String javaFullUrl;

	private String localDbUrl;
	private String localDbUser;
	private String localDbPass;
	private String uatDbUrl;
	private String uatDbUser;
	private String uatDbPass;
	private String liveDbUrl;
	private String liveDbUser;
	private String liveDbPass;

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", pIp=" + pIp + ", aspPort=" + aspPort
				+ ", javaPort=" + javaPort + ", liveServer1Ip=" + liveServer1Ip + ", liveServer2Ip=" + liveServer2Ip
				+ ", warName=" + warName + ", warPath=" + warPath + ", aspFullUrl=" + aspFullUrl + ", javaFullUrl="
				+ javaFullUrl + ", localDbUrl=" + localDbUrl + ", localDbUser=" + localDbUser + ", localDbPass="
				+ localDbPass + ", uatDbUrl=" + uatDbUrl + ", uatDbUser=" + uatDbUser + ", uatDbPass=" + uatDbPass
				+ ", liveDbUrl=" + liveDbUrl + ", liveDbUser=" + liveDbUser + ", liveDbPass=" + liveDbPass + "]";
	}

	public ProjectDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public String getpIp() {
		return pIp;
	}

	public void setpIp(String pIp) {
		this.pIp = pIp;
	}

	public String getAspPort() {
		return aspPort;
	}

	public void setAspPort(String aspPort) {
		this.aspPort = aspPort;
	}

	public String getJavaPort() {
		return javaPort;
	}

	public void setJavaPort(String javaPort) {
		this.javaPort = javaPort;
	}

	public String getLiveServer1Ip() {
		return liveServer1Ip;
	}

	public void setLiveServer1Ip(String liveServer1Ip) {
		this.liveServer1Ip = liveServer1Ip;
	}

	public String getLiveServer2Ip() {
		return liveServer2Ip;
	}

	public void setLiveServer2Ip(String liveServer2Ip) {
		this.liveServer2Ip = liveServer2Ip;
	}

	public String getWarName() {
		return warName;
	}

	public void setWarName(String warName) {
		this.warName = warName;
	}

	public String getWarPath() {
		return warPath;
	}

	public void setWarPath(String warPath) {
		this.warPath = warPath;
	}

	public String getAspFullUrl() {
		return aspFullUrl;
	}

	public void setAspFullUrl(String aspFullUrl) {
		this.aspFullUrl = aspFullUrl;
	}

	public String getJavaFullUrl() {
		return javaFullUrl;
	}

	public void setJavaFullUrl(String javaFullUrl) {
		this.javaFullUrl = javaFullUrl;
	}

	public String getLocalDbUrl() {
		return localDbUrl;
	}

	public void setLocalDbUrl(String localDbUrl) {
		this.localDbUrl = localDbUrl;
	}

	public String getLocalDbUser() {
		return localDbUser;
	}

	public void setLocalDbUser(String localDbUser) {
		this.localDbUser = localDbUser;
	}

	public String getLocalDbPass() {
		return localDbPass;
	}

	public void setLocalDbPass(String localDbPass) {
		this.localDbPass = localDbPass;
	}

	public String getUatDbUrl() {
		return uatDbUrl;
	}

	public void setUatDbUrl(String uatDbUrl) {
		this.uatDbUrl = uatDbUrl;
	}

	public String getUatDbUser() {
		return uatDbUser;
	}

	public void setUatDbUser(String uatDbUser) {
		this.uatDbUser = uatDbUser;
	}

	public String getUatDbPass() {
		return uatDbPass;
	}

	public void setUatDbPass(String uatDbPass) {
		this.uatDbPass = uatDbPass;
	}

	public String getLiveDbUrl() {
		return liveDbUrl;
	}

	public void setLiveDbUrl(String liveDbUrl) {
		this.liveDbUrl = liveDbUrl;
	}

	public String getLiveDbUser() {
		return liveDbUser;
	}

	public void setLiveDbUser(String liveDbUser) {
		this.liveDbUser = liveDbUser;
	}

	public String getLiveDbPass() {
		return liveDbPass;
	}

	public void setLiveDbPass(String liveDbPass) {
		this.liveDbPass = liveDbPass;
	}

}
