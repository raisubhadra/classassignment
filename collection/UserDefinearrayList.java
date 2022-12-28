package collection;

import java.util.ArrayList;

public class UserDefinearrayList {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("subhadra ");
		emp1.setSalary( 40000);
		
		Employee emp2=new Employee(2, "palak ", 50000);
		Employee emp3=new Employee(3, "rai ", 35000);
		
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		
		//traverse the arrayList
		for(Employee e:employeeList)
		{
			//System.out.println(e);
			System.out.println("ID:"+e.getEmpId()+" Name: "+e.getEmpName()+" Salary:"+e.getSalary());
		}
	}

}
