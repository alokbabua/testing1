package pracex;

public class encapsulationex {
	private int  exppinnum;
	private int actpinnum=1234;
	private String exppassword;
	private String actpassword="testing";
	
	
	
	public int getExppinnum() {
		return actpinnum;
	}
	public void setExppinnum(int exppinnum) {
		this.actpinnum = exppinnum;
	}
	public String getExppassword() {
		return actpassword;
	}
	public void setExppassword(String exppassword) {
		this.actpassword = exppassword;
	}
	public static void main(String[] args) {
		encapsulationex obj=new encapsulationex();
		
		obj.setExppinnum(1234);
	}

}
