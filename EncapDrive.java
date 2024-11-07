class UserSccount{
	private String username;
	private int pin;
	private double bal;
	private long adhar;

	UserSccount(String username, int pin, double bal, long adhar){
		super();
		this.username = username;
		this.pin = pin;
		this.bal = bal;
		this.adhar = adhar;

	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String Username){
		username = Username;
	}
	public int getPin(){
		return pin;
	}
	public void setUsername(){
		pin  = Pin;
	}
	public double getBal(){
		return bal;
	}
	public void setUsername(){
		bal = Bal;
	}
	public long getAdhar(){
		return adhar;
	}
	

}

class EncapDrive{
	public static void main(String[] args) {
		UserSccount obj = new UserSccount("ramesh",123,20000,12346789);
		System.out.println(obj.getUsername());
		obj.setUsername("");
		
	}
}