class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return name;
	}
}

class StudDriver{
	public static void main(String[] args) {
		Student obj = new Student("ramesh");
	}
}