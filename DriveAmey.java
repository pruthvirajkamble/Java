class Frd{
	    String Name;
		String Fname;
		String Marr;
		long Mnumber;
		float Height;
	Frd(String Name, String Fname, String Marr, long Mnumber, float Height)
	{
		super();
		this.Name = Name;
		this.Fname = Fname;
		this.Marr = Marr;
		this.Mnumber = Mnumber;
		this.Height = Height;

	}
	void Display(){
		System.out.println("Frd Details : ");
		System.out.println("Name : " +Name);
		System.out.println("Fname : " +Fname);
		System.out.println("Marriage : " +Marr);
		System.out.println("Mobile Number : "+Mnumber);
		System.out.println("Height : " +Height);
	}
}


class DriveAmey{
	public static void main(String[] args) {
		Frd obj = new Frd("Shreyash","Amey","Randwa",90951007,5.5f);
		obj.Display();
	}
}