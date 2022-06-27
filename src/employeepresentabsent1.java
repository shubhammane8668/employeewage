
public class employeepresentabsent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int isPresent =(int) (Math.random()*10)%3;
		System.out.println(isPresent);
		if(isPresent==0) {
			System.out.println("employee is absent");
		}
		else if(isPresent==1){
			System.out.println("employee is present");
		}
		else {
			System.out.println("employee is present for half day");	
		}
	}

}
