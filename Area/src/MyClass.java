import java.util.Scanner;

public class MyClass extends Area {public static void main(String[] args) {
	System.out.println("choose an option"
			+ "\n1:circle"
			+ "\n2:square"
			+ "\n3:rectangle"
			+ "\n4:triangle");
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	switch(option){case 1:
		System.out.println("enter radius:");
	    int r=sc.nextInt();
	    circle(r);
		display();
		break;
	case 2:
		System.out.println("enter length of one side:");
		int k=sc.nextInt();
		square(k);
		
		display();
		break;
	case 3:
		System.out.println("enter length and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		rectangle(l,b);
		display();
		break;
	case 4:
		System.out.println("enter length of base and height");
		int a=sc.nextInt();
		int h=sc.nextInt();
		triangle(a,h);
		display();
		break;
	}
	
	}

}
