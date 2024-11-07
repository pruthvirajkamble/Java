class Student{
	int id;
	String name;
	String edu;
	int yop;
	Student(int id, String name, String edu,int yop){
		this.id=id;
		this.name = name;
		this.edu = edu;
		this.yop = yop;

	}
	@Override
	public String toString(){
		return "Id : "+ id +", name : "+ name +" , eductaion : "+edu+" , yop: "+yop;
	}
}

class StudentDriver{
	public static void main(String[] args) 
	{
		Student obj1 = new Student(1,"ramesh","BE",2024);
		Student obj2 = new Student(2,"suresh","mca",2022);
		Student obj3 = new Student(3,"ganesh","BTech",2023);
		Student obj4 = new Student(4,"mukesh","Mtech",2020);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);

	}
}