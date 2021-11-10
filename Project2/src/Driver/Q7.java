package Driver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Q7 {
	public class Employee implements Comparator<Employee> {
		String name, department;
		Integer age;

		public int compare(Employee employee, Employee oEmployee) {
			if (employee.name == oEmployee.name) {
				//sorting attributes that aren't name
				if (employee.department == oEmployee.department) {
					return employee.age.compareTo(oEmployee.age);

				}else {
					return employee.department.compareTo(oEmployee.department);
				}
			}else {
				return employee.name.compareTo(oEmployee.name);

			}
		}
		public String toString() {
			return name + ", " +department + ", " + age + ". ";
		}}
	
		public void Comparator() {
			Employee ben = new Employee();
			ben.name = "Ben";
			ben.department = "Sales";
			ben.age = 23;

			Employee jay = new Employee();
			jay.name = "Jay";
			jay.department = "Sales";
			jay.age = 24;

			Employee jay2 = new Employee();
			jay2.name = "Jay";
			jay2.department = "Sales";
			jay2.age = 55;


			Employee ben2 = new Employee();
			ben2.name = "Ben";
			ben2.department = "Accounts";
			ben2.age = 34;

			List <Employee> employees = new ArrayList<Employee>();

			employees.add(ben);
			employees.add(ben2);
			employees.add(jay);
			employees.add(jay2);

			Collections.sort(employees, new Employee());

			for(int i= 0; i < employees.size(); ++i) {
				System.out.println(employees.get(i).toString());
			}
		}
	}

	
		
	

