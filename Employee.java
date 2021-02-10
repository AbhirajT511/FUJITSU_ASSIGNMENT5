public class Employee 
{
	String first_name;
	String last_name;

	public Employee(String first_name, String last_name) 
	{
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String toString()
	{
		return first_name + " " + last_name;		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Tony", "Stark");
		Employee emp2 = new Employee("John","Cena");
		Employee emp3 = new Employee("Adam","Walker");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}
