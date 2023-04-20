
public class Staff {
	private int staffid;
	private String sname,job,shift;
	
	public Staff(int staffid, String sname, String job, String shift) {
		super();
		this.staffid = staffid;
		this.sname = sname;
		this.job = job;
		this.shift = shift;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	

}
