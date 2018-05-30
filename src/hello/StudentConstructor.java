package hello;

public class StudentConstructor {
	int rollNo;
	String name;
	StudentConstructor()
	{
		rollNo =  23;
		name = "hari";
	}
	public void display()
	{
		System.out.println(name+","+rollNo);
	}
	public void setDetails(int r,String n)
	{
		rollNo = r;
		name = n;
	}
	public void getDetails()
	{
		System.out.println(name+","+rollNo);
	}
	public static void main(String[] args)
	{
		StudentConstructor stu = new StudentConstructor();
		stu.display(); 
		stu.setDetails(1234,"Raju");
		stu.getDetails();
	}
}