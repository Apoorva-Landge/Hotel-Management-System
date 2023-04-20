
public class Manager {
	private int managerid;
	private String mname;
	
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getName() {
		return mname;
	}
	public void setName(String mname) {
		this.mname = mname;
	}
	public Manager(int managerid, String mname) {
		super();
		this.managerid = managerid;
		this.mname = mname;
	}
	

}
