
public class caseuc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constant
		final	     	int IS_PART_TIME =1;
		final			int  IS_FULL_TIME =2;
		final			int emp_rate_per_hour =20;
		//variables
				int empHrs=0;
				int empWage=0;
			
		int empCheck = (int) (Math.floor(Math.random()*10) % 3);	
	switch (empCheck) {
	
	case IS_PART_TIME:
         empHrs = 4;
    break;
	case  IS_FULL_TIME:
          empHrs = 8;
    break;     
         default:
         empHrs = 0;
        	
	}
	empWage = empHrs * emp_rate_per_hour;
	System.out.println(" Emp wage:" +empWage);    
	
	}
}
