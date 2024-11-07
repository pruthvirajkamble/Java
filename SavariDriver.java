import java.util.*;
class CabDriver
{
   static int diverId = 123;
   private int id;
   private String name; // get set
   private long contact; // get set
   private String type; // get
   private String car; // get
   private Long account; // get set
   private String status = "Available";

  CabDriver(String name, Long contact, String type, String car,long account)
   {

     super();
     this.name = name;
     this.contact = contact;
     this.type = type;
     this.car = car;
     this.account =account;
     this.id = diverId++;
    }
    public String getName(){      //String name, Long contact, String type, String car,long account, String status
    	return this.name;
    }
    public void setName(String newName){
    	this.name = newName;
    }
    public long getContact(){
    	return this.contact;
    }
    public void setContact(long newContact){
    	this.contact = newContact;
    }
    public String getType(){
    	return this.type;
    }
    public String getCar(){
    	return this.car;
    }
    public long getAccount(){
    	return this.account;
    }
    public void setAccount(long newAccount){
        this.account = newAccount;
    }
    public String getStatus(){
    	return this.status;
    }
    public void setStatus(String newStatus){
    	this.status = newStatus;
    }
    public int getId(){
    	return this.id;
    }
    public void displayCabDriver()
    {
    	System.out.println();
    	System.out.println("**** CAB DETAILS ****");
    	System.out.println("Booking Id : "+ this.id);
    	System.out.println("Driver Name :"+ this.getName());
    	System.out.println("Type of Car : "+ this.getType());
    	System.out.println("Status :"+ this.getStatus());

    }
    public void diplayCarDriverAfterBooking(){
    	System.out.println();
    	System.out.println("**** Car Details ****");
    	System.out.println("Booking Id :"+ this.id);
    	System.out.println("Driver Name : "+ this.getName());
    	System.out.println("Contact : "+ this.getContact());
    	System.out.println("type of Car : "+ this.getType());
    	System.out.println("Car Number : "+ this.getCar());
    	System.out.println("Account Number "+ this.getAccount());
    	System.out.println("Status :"+ this.getStatus());

    }

} 
class Passenger
{
	String name;
	String start;
	String end;
	long contact;
	int noPass;
	Passenger(String name, String start, String end, long contact, int noPass){
		super();
		this.name = name;
		this.start = start;
		this.end = end;
		this.contact = contact;
		this.noPass = noPass;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public String getStart(){
		return this.start;
	}
	public void setStart(String newStart){
		this.start = newStart;
	}
	public String getEnd(){
		return this.end;
	}
	public void setEnd(String newEnd){
		this.end = newEnd;
	}
	public long getContact(){
		return this.contact;
	}
	public void setContact(long newContact){
		this.contact = newContact;
	}
	public int getNoPass(){
		return this.noPass;
	}
	public void setNoPass(int newNoPass){
		this.noPass = newNoPass;
	}

}  
class SavariDriver
{
	static ArrayList<CabDriver> listCab = new ArrayList<>();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String name, Long contact, String type, String car,long account, String status
		CabDriver obj1 = new CabDriver("Ramesh",9875645768l,"Sedan","MH12AA1234",4123567897l);
		CabDriver obj2 = new CabDriver("Gamesh",7875645768l,"hatChback","MH12AA1235",523456789789l);
        CabDriver obj3 = new CabDriver("Somesh",6875645768l,"SUV","MH12AA1233",723456789789l);
        CabDriver obj4 = new CabDriver("amesh",4875645768l,"XUV","MH12AA1232",923456789789l);

        
        listCab.add(obj1);
        listCab.add(obj2);
        listCab.add(obj3);
        listCab.add(obj4);

        String start = null;
        String end = null;
        String name = null;
        long contact = 0;
        int noPass = 0;


        for (; ; ) 
        {
        	System.out.println();
        	System.out.println("**** Welcome to Savari ****");
        	System.out.println();
        	System.out.println("Book a Ride : ");
        	System.out.print("Enter a name: ");
        	name = sc.nextLine();
        	System.out.print("Start dest : ");
        	start = sc.nextLine();
        	System.out.print("End dest : ");
        	end = sc.nextLine();
        	System.out.print("Contact : ");
        	contact = sc.nextLong();
        	System.out.print("NO of Pass : ");
        	noPass = sc.nextInt();

        	Passenger pass = new Passenger(name,start,end,contact,noPass);
        	System.out.println();
        	for(CabDriver i : listCab )
        	{
        		if(i.getStatus().equals("Available"))
        		{
        			i.displayCabDriver();
        		}	
            }

            System.out.println();
            System.out.println("Enter the booking id : ");
            int bookid = sc.nextInt();
            for(CabDriver i : listCab)
            {
            	if(bookid == i.getId())
            	{
            		i.setStatus("Occupied");
            		i.diplayCarDriverAfterBooking();
            		System.out.println();
            		System.out.println("Your Ride has been Booked");
            	}

            }	
        }
	}
}