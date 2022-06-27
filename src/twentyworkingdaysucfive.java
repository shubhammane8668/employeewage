
public class twentyworkingdaysucfive {

	private static int totalEmpwage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final	     	int IS_PART_TIME =1;
		final			int  IS_FULL_TIME =2;
		final			int emp_rate_per_hour =20;
		final           int num_of_working_days=2;
		
		//variables
				int empHrs=0;
				int empWage=0;
		//computation
				for  (int day=0; day<num_of_working_days;day++);
				int empCheck = (int) (Math.floor(Math.random()*10) % 3);	
				switch (empCheck) {
				
				case IS_PART_TIME:
			         empHrs = 4;
			         System.out.println("employee is part time present");
			    break;
				case  IS_FULL_TIME:
			          empHrs = 8;
			          System.out.println("employee is present");
			    break;     
			         default:
			         empHrs = 0;
			         System.out.println("employee is absent");
				}
				
				empWage = empHrs * emp_rate_per_hour;
				totalEmpwage += empWage;
				
				System.out.println(" Emp wage:" +empWage);    
				
				}
			

	}


 