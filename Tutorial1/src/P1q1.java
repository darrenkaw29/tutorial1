import java.util.Scanner;

public class P1q1 {

    public static void main(String[] args) {
    	String name;
    	int year;
    	float cgpa;
    	
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter name: ");
		name = scan.nextLine();
		
		
		
		System.out.print("\nEnter your year of study: ");
		year = scan.nextInt();
		
	
		System.out.print("what is your target cgpa: ");
		cgpa = scan.nextFloat();
		
		System.out.println("Hello : " + name);
		System.out.println("\nyear of study : " + year);
		System.out.println("\nyear of study : " + cgpa);
		
		
		
    	
    }
    
    
}

