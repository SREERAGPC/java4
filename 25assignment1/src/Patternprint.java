

	import java.util.Scanner;

public class Patternprint {	public static void main(String[] args) {
	
	System.out.println("enter size of array");
	Scanner obj=new Scanner(System.in);
	int limit=obj.nextInt();
	System.out.println("enter the values in array");
	int[] a=getarray(limit,obj);
	int[] c1=null;     
	System.out.println("entered values of array are");
	
	System.out.println("\n"+"new array");
	oddout(limit,a,c1);
	display(c1);
	display1(c1);
}
public static int[] getarray(int limit1,Scanner obj) {
	int a[] = new int[limit1];
	for(int i=0;i<limit1;i++) {
		a[i]=obj.nextInt();
				
	}
	return a;
}	public static int[] oddout(int limit1,int [] a,int [] b) {
	int b1[] = new int[limit1];
	int c1[] = new int[limit1];
	for(int i=0;i<limit1;i++) {
		 if(i<a.length) {
		if(a[i]%2!=0) {b1[i]=a[i];
		if(a[i]!=0) {for(int j=i;j<a.length;j++) {
			b1[i]=c1[j];}
		}
			i=i+3;
	}
		 }if(i < a.length) {
		b1[i]=a[i];if(a[i]!=0) {for(int j=i;j<a.length;j++) {
			b1[i]=c1[j];}
		}
	}
	}
	return c1;
}

public static void display(int[] c1) {

	for(int i=0;i<c1.length;i++) {
		System.out.print("\t"+c1[i]);
				
	}

}

public static void display1(int[] c) {
	
	for(int i=0;i<c.length;i++) {
		for(int j=2;j<=c.length;j++) {
			if(j%2==0) {System.out.println("\t"+c[i]);
				
			}
		}
		System.out.print("\t"+c[i]);
				
	}

}



}

