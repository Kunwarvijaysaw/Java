package constructor;

public class Employee {
	


//you have to create a class Employee then some fields like empid , empNmae
		//empDepartment  // emp salary 
		// then you have to create contructor also both 
		// then you have to create method like display  /// 
		// method empShift that is return string 
		// then you have to  create 5 object  of employee then assign them  value with 
		// contrustor and you have to run each method with each object

	

			int empId;
			String empName;
			String empDepartment;
			int empSalary;
			
	// Constructor
			public Employee(int empId,String empName,String empDepartment,int empSalary) {
				this.empId = empId;
				this.empName = empName;
				this.empDepartment = empDepartment;
				this.empSalary = empSalary;
			 }
			 public Employee() {} ;
				// default contructor
			// Method to determine employee shift
			 
			    public String empShift() {
			    	
			 if(empId % 2 == 0) {
				 
				 return "DayShift";
			 }else {
				return "NightSift";
			 }
			    }
			 
			 public void display() {
			 
				 System.out.println("===============================================================");
				 System.out.println("empId ---> " + this.empId );
					System.out.println(" empName  ---> " + this.empName );
					System.out.println(" empDepartment  ---> " + this.empDepartment );
					System.out.println("empSalary ---> " + this.empSalary);
					System.out.println(this.empShift());
			 }
			 
			
			 
			 public static void main(String[] args) {
				 Employee E2 = new Employee(101,"Ram","IT",5000);
				 E2.display();
				 System.out.println(E2.empShift());
				 Employee E3 = new Employee(102,"Shyam","Sales",2000);
				 E3.display();
				 Employee E4 = new Employee(103,"Ramesh","Tech",4000);
				 E4.display();
				 Employee E5 = new Employee(104,"Sham","NonIT",3000);
				 E5.display();
				 Employee E6 = new Employee(105,"Rani","Sales",6000);
				 E6.display();
			 }
			
				 
				 
				
				 
				 
				
		
		}
			





