
public class Room {
	private int roomid;
	private String category,status;
	private double rate;
	
	public Room(int roomid, String category, String status, double rate) {
		super();
		this.roomid = roomid;
		this.category = category;
		this.status = status;
		this.rate = rate;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

}
