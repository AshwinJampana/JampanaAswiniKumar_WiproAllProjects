package Strings;

public class Arrays {

	public static void main(String[] args) {
//		int[] age= {22,23,24,25,28};//dynamic array
//		int[] arr=new int[3];//Static array with fixed size 3
//		System.out.println("First Person age "+age[0]);
		
		//foreach loop
//		for(int b:age) {
//			System.out.println(b);
//		}
		
		//for loop
//		for(int i=0;i<age.length;i++) {
//			System.out.println(age[i]);
//		}

//		float[] per= {87.5f,86,85,92.3f};
//		float max=per[0];
//		for(float b:per) {
//			if(b>max) {
//				max=b;
//			}
//		}
//		System.out.println("Highest Percentage "+max);
		
		//second highest element out of ten numbers.
//		int[] num= {1,6,7,8,9,2,3,5,4,10};
		
		
		//2-D arrays
//		int[][] arr= {{10,20},
//						{30,40,50},
//						{60}};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
//		int[][] arr=new int[3][4];
//		int num=1;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=num++;
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//int[][] arr1=new int[2][2];
	
//		int prev=1;
//		int next=2;
//		int sum;
//		int n=10;
//		System.out.print("1 "+"2 ");
//		for(int i=2;i<=n;i++) {
//			
//			sum=prev+next;
//			prev=next;
//			next=sum;
//			System.out.print(" "+sum+" ");
//		}
		
		
		
		
		//3-D Arrays
		int[][][] arr= {{{10,20},{30,40,50}},
				{{40,50,60},{70,80,90},{1,2,3,4}}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
