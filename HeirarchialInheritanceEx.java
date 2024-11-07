import java.util.Arrays;

class Google
{
	String username;
	String pass;
	String dob;
	String emailid;
	long contact;
	String gender;

	Google(String username,String pass,String dob,String emailid, long contact,String gender)
	{
		super();
		this.username = username;
		this.pass = pass;
		this.dob = dob;
		this.emailid = emailid;
		this.contact = contact;
		this.gender = gender;
	}

	public void displayGoogle()
	{
		System.out.println();
		System.out.println(" Google Details ");
		System.out.println("Google Username : " + this.username);
		System.out.println("Google Passsword : " + this.pass);
		System.out.println("Date Of Birth : " + this.dob);
		System.out.println("Email Id : " + this.emailid);
		System.out.println("Contact : " + this.contact);
		System.out.println("Gender : " + this.gender);
	}
}
class GooglePay extends Google
{
	String name;
	long accountNumber;
	String ifscCode;
	int upiPin;
	long debitCard;

	GooglePay(String name,long accountNumber, String ifscCode,int upiPin,long debitCard,
		      String username,String pass,String dob,String emailid, long contact,String gender)
	{
		super(username,pass,dob,emailid,contact,gender);
		this.name = name;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.upiPin = upiPin;
		this.debitCard = debitCard;
	}

	public void displayGooglePay()
	{
		System.out.println();
		System.out.println("Google Pay Details");
		System.out.println("Username : " + this.name);
		System.out.println("AccountNumber : " + this.accountNumber);
		System.out.println("Ifsc Code : " + this.ifscCode );
		System.out.println("Upi Pin: " + this.upiPin);
		System.out.println("Debit Card : " + this.debitCard);

	}
}
class GoogleMap extends Google
{
	String currentLoc;
	String [] bookmarks;
	String modeTravel;

	GoogleMap(String currentLoc,String[]bookmarks,String modeTravel,
			  String username,String pass,String dob,String emailid, long contact,String gender)
	{
		super(username,pass,dob,emailid,contact,gender);
		this.currentLoc = currentLoc;
		this.bookmarks = bookmarks;
		this.modeTravel = modeTravel;
	}

	public void displayGoogleMap()
	{
		System.out.println();
		System.out.println(" Google Map Details");
		System.out.println("Current Location : " + this.currentLoc);
		System.out.println("Bookmarks : " + Arrays.toString(this.bookmarks));
		System.out.println("Mode of Travel : " + this.modeTravel);

	}
}
class GoogleMeet extends Google
{
	String hostname;
	String joiningLink;
	String schedule;
	String meetId;

	GoogleMeet(String hostname,String joiningLink,String schedule,String meetId,
			   String username,String pass,String dob,String emailid, long contact,
			   String gender)
	{
		super(username,pass,dob,emailid,contact,gender);
		this.hostname = hostname;
		this.joiningLink = joiningLink;
		this.schedule = schedule;
		this.meetId = meetId;
	}

	public void displayGoogleMeet()
	{
		System.out.println();
		System.out.println(" Google Meet Details");
		System.out.println("Hostname : " + this.hostname);
		System.out.println("joiningLink : " + this.joiningLink);
		System.out.println("Schedule  : " + this.schedule);
		System.out.println("Meeting id : " + this.meetId);
	}
}
class GoogleClassroom extends Google
{
	String className;
	String subject;
	String teacherName;
	String classId;
	int countStudent;

	GoogleClassroom(String className,String subject,String teacherName,String classId,
					int countStudent,String username,String pass,String dob,String emailid,
					long contact,String gender)
	{
		super(username,pass,dob,emailid,contact,gender);
		this.className = className;
		this.subject = subject;
		this.teacherName = teacherName;
		this.classId = classId;
		this.countStudent = countStudent;
	}

	public void displayGoogleClassroom()
	{
		System.out.println();
		System.out.println("Google Classroom Details");
		System.out.println("Class Name : " + this.className);
		System.out.println("Subject : " + this.subject);
		System.out.println("TeacherName : " + this.teacherName);
		System.out.println("Class Id : " + this.classId);
		System.out.println("Count of Students : " + this.countStudent);
	}
}
class HeirarchialInheritanceEx
{
	public static void main(String[] args)
	{
		GooglePay obj = new GooglePay("Mithilesh Atkare",123412341234l,"ICIC19407",5326,5516969645698547L,
									   "Mithilesh","Mithilesh123","02/01/2001","mithileshatk@gmail.com",8830029347l,"Male");
		obj.displayGoogle();
		obj.displayGooglePay();
		

		GoogleMap obj1 = new GoogleMap("JM Road Deccan Pune",(new String[]{"FC Road","Jm Road"}),"Bike",
									   "Mithilesh","Mithilesh123","02/01/2001","mithileshatk@gmail.com",8830029347l,"Male");
		obj.displayGoogle();
		obj1.displayGoogleMap();

		GoogleMeet obj2 = new GoogleMeet("Amey","https://Amey.GoogleMeet.com//","10/10/2024 12:30Pm ","Amey@321", 
										 "Mithilesh","Mithilesh123","02/01/2001","mithileshatk@gmail.com",8830029347l,"Male");

		obj.displayGoogle();
		obj2.displayGoogleMeet();
		GoogleClassroom obj3 = new GoogleClassroom("Java Class","Core Java Programming","Shrikant Gajanan Kokate","M17",200,
												   "Mithilesh","Mithilesh123","02/01/2001","mithileshatk@gmail.com",8830029347l,"Male");
		obj.displayGoogle();
		obj3.displayGoogleClassroom();
	}
}