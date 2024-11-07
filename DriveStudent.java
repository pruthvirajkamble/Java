class Student{
	int sid;
	String sname;
	String graduation;

	Student(int sid, String sname, String graduation)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.graduation = graduation;

	}

	void display(){
		System.out.println("Student Details");
		System.out.println("Name " + sname);
		System.out.println("Id "+ sid);
		System.out.println("graduation "+ graduation);
	}
}
class DriveStudent{
	public static void main(String[] args) {
		Student obj = new Student(1,"Amey","AI/ML");
	    obj.display();
	}
}