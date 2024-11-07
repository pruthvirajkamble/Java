class Bank
{
	long accno;
	String accname;
	String branch;
	String ifsc;
	long contact;
	String address;

	Bank(long accno,String accname,String branch,String ifsc,long contact,String address)
	{
		super();
		this.accno = accno;
		this.accname = accname;
		this.contact = contact;
		this.branch = branch;
		this.ifsc = ifsc;
		this.address = address;
	}
	void displayBank()
	{
		System.out.println("Bank Details");
		System.out.println("Account No : "+accno);
		System.out.println("Account Name : "+accname);
		System.out.println("Contact : "+contact);
		System.out.println("Branch : "+branch);
		System.out.println("IFSC : "+ifsc);
		System.out.println("Address : "+address);
	}
}
	
class DriverBank
{
	public static void main(String[] args) 
	{
		Bank obj = new Bank(123456987,"Ramesh","Deccan","ICIC1409",8830029,"Karve Nagar");
		obj.displayBank(); 
	}
}