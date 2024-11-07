class Qspider{
	long Sid;
	String Sname;
	String Branch;
	String MockName;
	float Rating;

	Qspider(long Sid,String Sname,String Branch,String MockName, float Rating)
	{
       super();
       this.Sid = Sid;
       this.Sname = Sname;
       this.Branch = Branch;
       this.MockName = MockName;
       this.Rating = Rating;
	}
	void Display(){
		System.out.println("Details of Qspider Student");
		System.out.println("Sid : "+ Sid);
		System.out.println("Sname "+ Sname);
		System.out.println("Branch "+ Branch);
		System.out.println("MockName "+ MockName);
		System.out.println("Rating "+ Rating);
	}
}

class QspiderLogin{
	public static void main(String[] args) {
		Qspider Obj = new Qspider(101,"Pinki","CSE","Java",1.5f);
		Obj.Display();
	}
}