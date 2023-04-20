
public class Customer {
	private  int  custid;
	 private boolean checkin,checkout;
	 private String cname,id_proof;
	 private int mobile_no;
	 private  Date bookin_date;
 public Customer(int custid, boolean checkin, boolean checkout, String cname, String id_proof, int mobile_no,
			Date bookin_date) {
		super();
		this.custid = custid;
		this.checkin = checkin;
		this.checkout = checkout;
		this.cname = cname;
		this.id_proof = id_proof;
		this.mobile_no = mobile_no;
		this.bookin_date = bookin_date;
	}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public boolean isCheckin() {
	return checkin;
}
public void setCheckin(boolean checkin) {
	this.checkin = checkin;
}
public boolean isCheckout() {
	return checkout;
}
public void setCheckout(boolean checkout) {
	this.checkout = checkout;
}
public String getName() {
	return cname;
}
public void setName(String cname) {
	this.cname = cname;
}
public String getId_proof() {
	return id_proof;
}
public void setId_proof(String id_proof) {
	this.id_proof = id_proof;
}
public int getMobile_no() {
	return mobile_no;
}
public void setMobile_no(int mobile_no) {
	this.mobile_no = mobile_no;
}
public Date getBookin_date() {
	return bookin_date;
}
public void setBookin_date(Date bookin_date) {
	this.bookin_date = bookin_date;
}
 
 
}
