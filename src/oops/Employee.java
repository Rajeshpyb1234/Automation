package oops;

public class Employee {
	int Empid;
	String Ename;
	String Ejob;
	int Esal;
	
	Employee(String Ename,int Empid,String Ejob,int Esal)
	{
		this.Ename=Ename;
		this.Empid=Empid;
		this.Ejob=Ejob;
		this.Esal=Esal;
	}
	void Display() {
		System.out.println(Empid);
		System.out.println(Ename);
		System.out.println(Ejob);
		System.out.println(Esal);
	}
	void show() {
		System.out.println("Next Employee data ::");
	}

	public static void main(String[] args) {
		
		Employee Emp1=new Employee("rajesh",1,"Tester",100000);
		Emp1.Display();
		Emp1.show();

	}

}
