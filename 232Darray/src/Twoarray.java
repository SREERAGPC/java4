import java.util.Scanner;

public class Twoarray {
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner obj=new Scanner(System.in);
		int limit=obj.nextInt();
		System.out.println("enter the values in array");
		int[][] a=getarray(limit,obj);
		System.out.println("entered values of array are");
		display(a);
		
	}
	public static int[][] getarray(int limit1,Scanner obj) {
		int a[][] = new int[limit1][limit1];
		for(int i=0;i<limit1;i++){
			for(int j=0;j<limit1;j++) {
			a[i][j]=obj.nextInt();
			}
					
		}
		return a;
	}
	public static void display(int[][] b) {
	
		for(int i=0;i<b.length;i++) {for(int j=0;j<b.length;j++) {
			System.out.print("\t"+b[i][j]);
		}
		System.out.println();
					
		}
		
		
	}

}
