
public class parttimeorwage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//constant
		int is_part_time =1;
		int is_full_time =2;
		int emp_rate_per_hour =20;
//variables
		int empHrs=0;
		int empWage=0;
//computation
		double empCheck = Math.floor(Math.random()*10) % 3;
		
		if (empCheck == is_part_time) {;
			empHrs = 4;
			System.out.println("Emp part time");
	}else  if (empCheck == is_full_time) {;
		   empHrs = 8;
		   System.out.println(" Emp full time");
		   
	}  else {
		empHrs = 0;
		System.out.println(" Emp is Absent");
		   }
		empWage = empHrs * emp_rate_per_hour;
		System.out.println(" Emp wage:" +empWage);
			
				
	}

}
