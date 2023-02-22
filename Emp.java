import java.util.Scanner;

public class Emp {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp name : ");
	    String name = sc.nextLine();
	    
	    System.out.println("Enter emp id : ");
	    int id = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("Enter emp salary : ");
	    float sal = Float.parseFloat(sc.nextLine());
	    
	    System.out.println(" Enter emp address : ");
        String add = sc.nextLine();
        
        System.out.println("Employee name is : " + name.toUpperCase() );
        System.out.println("Employee id is : " + id );
        System.out.println("Employee salary is : " + sal );
        System.out.println("Employee address is : " + add.toUpperCase() );

	}
	
}

