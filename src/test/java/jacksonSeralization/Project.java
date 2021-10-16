package jacksonSeralization;

public class Project {
	
	String projectName;
	String status;
    int projectid;
    int teamsize;
	
    
    public Project(String projectName, String status, int projectid, int teamsize) {
		super();
		this.projectName = projectName;
		this.status = status;
		this.projectid = projectid;
		this.teamsize = teamsize;
	}
    
    
    public Project() {
    	
    }


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getProjectid() {
		return projectid;
	}


	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}


	public int getTeamsize() {
		return teamsize;
	}


	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
    
    
    
    

}
