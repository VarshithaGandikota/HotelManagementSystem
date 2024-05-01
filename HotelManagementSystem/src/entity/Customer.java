package entity;

public class Customer {
	private int cid;
	private String cname;
	private int cage;
	private long phone;
	private String cemail;
	private address caddress;
	private double camt;
	public double getCamt() {
		return camt;
	}
	public void setCamt(double camt) {
		this.camt = camt;
	}
	public Customer(int cid, String cname, int cage, long phone, String cemail, address caddress) {
//		super();
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
		this.phone = phone;
		this.cemail = cemail;
		this.caddress = caddress;
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCage() {
		return cage;
	}
	public void setCage(int cage) {
		this.cage = cage;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public address getCaddress() {
		return caddress;
	}
	public void setCaddress(address caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cage=" + cage + ", phone=" + phone + ", cemail="
				+ cemail + ", caddress=" + caddress + ", camt=" + camt + "]";
	}
	
}