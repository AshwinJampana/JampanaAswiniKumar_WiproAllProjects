package Strings;

import java.util.Scanner;

public class Assignments {
	
	
//	int empid,age;
//	String empname;
//	static String empcompany="ABC";
//	
//	
//	
//	void details(int empid1,int age1,String empname1) {
//		empid=empid1;
//		age=age1;
//		empname=empname1;
//		
//		System.out.println("Employee id           ="+empid);
//		System.out.println("Age                   ="+age);
//		System.out.println("EmployeeName          ="+empname);
//		System.out.println("empcompany            ="+empcompany);
//		
//	}

	public static void main(String[] args) {
		
		//Varaibles-1
		
//		Assignments obj=new Assignments();
//		System.out.println("**************Employee 1**************");
//		obj.details(101,25,"sai");
//		System.out.println("**************Employee 2**************");
//		obj.details(102,24,"Venkat");
		
		
		//Variables 2
//		int a=5 ,b=7;
//		System.out.println("Addition of two numbers "+(a+b));
		
		
		//Variable 3
//		int a=5,b=6,temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("Swapping of two numbers after is a="+a+" b="+b);
		
		//Variable 4
//		int l=20;
//		int b=40;
//		System.out.println("Area of reactangle is "+(l*b));
		
		
		//variable 5
//		double p=10000;
//		int t=12;
//		float r=2f;
//		System.out.println("Simple Interest is "+((p*t*r)/100));
		
		
		
		//String -1
		/*Count number of vowels in a string(input=”Programming”, output=3 Vowels)  */
//		String st1="Programming";
//		int count=0;
//		String st=st1.toLowerCase();
//		for(int i=0;i<st.length();i++) {
//			if(st.charAt(i)=='a'||st.charAt(i)=='e'|| st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
//				count=count+1;
//			}
//		}
//		System.out.println("Count of vowels in "+st1+" is "+count);

		
		//	String -2
		/* Replace all Spaces with Hyphens */
//		String name="venkat sai";
//		String st1r=name.replace(" ", "-");
//		System.out.println(st1r);
		
		
		
		
		//String-3
//		String st1="NOON";
//		String s2="";
//		for(int i=st1.length()-1;i>=0;i--) {
//			s2=s2+st1.charAt(i);
//		}
//		if(s2.equals(st1)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not a Palindrome");
//		}

		
		//String-4
		
		
//		String sentence="Count words in a Sentence";
//		int wc=0;
//		
//		for(int i=0;i<sentence.trim().length();i++) {
//			if(sentence.charAt(i)==' ') {
//				wc=wc+1;
//			}
//		}
//		System.out.println(wc+1);
		
		//String-5
//		String st="java";
//		System.out.println("String Starts with j  "+st.startsWith("j"));
//		System.out.println("String Ends With a    "+st.endsWith("a"));

		
		//String-6
		
//		String Sentence="Split a sentence into words ";
//		String[] words= Sentence.split("//s+");
//		for(String b:words) {
//			System.out.print(b+" ");
//		}
		
		
		//String -7
		
//		String st = "frequency";
//		for (int i = 0; i < st.length(); i++) {
//		    int count = 1; 
//		    boolean skip = false;
//		    for (int k = 0; k < i; k++) {
//		        if (st.charAt(k) == st.charAt(i)) {
//		            skip = true;
//		            break;
//		        }
//		    }
//		    if (!skip) {
//		        for (int j = i + 1; j < st.length(); j++) {
//		            if (st.charAt(i) == st.charAt(j)) {
//		                count++;  
//		        }
//		        System.out.println(st.charAt(i) + " = " + count);
//		    }
//		}
		
		
		//String-8
//		String st="a b c",st1="";
//		for(int i=0;i<st.length();i++) {
//			if(st.charAt(i)!=' ') {
//				st1=st1+st.charAt(i);
//			}
//			
//		}
//		System.out.println("New String After Removing Spaces "+st1);
		
		
		//String-9
//		String s = "Program to count digits, letters,1234567&&&@3456asdfgh";
//        int letters = 0, digits = 0, spaces = 0, special = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            
//            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
//                letters++;
//            }
//            else if (c >= '0' && c <= '9') {
//                digits++;
//            }
//            else if (c == ' ' || c == '\t' || c == '\n') { 
//                spaces++;
//            }
//            else {
//                special++;
//            }
//        }
//
//        System.out.println("Letters: " + letters);
//        System.out.println("Digits: " + digits);
//        System.out.println("Spaces: " + spaces);
//        System.out.println("Special Characters: " + special);

		
		
		//String-10
//		String str="programming";
//		char[] chars = str.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//            for (int j = i + 1; j < chars.length; j++) {
//                if (chars[i] > chars[j]) { // Swap if out of order
//                    char temp = chars[i];
//                    chars[i] = chars[j];
//                    chars[j] = temp;
//                }
//            }
//        }
//	
//		
//		 String sortedStr = new String(chars);
//	     System.out.println(sortedStr);
	        
		
		
		
		//Array-1
//		int[][] num= {{10,20,30},
//						{40,50,60}};
//		int sum=0;
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				sum=sum+num[i][j];
//			}
//		}
//		
//		System.out.println("Sum is "+sum);
		
		
		//Array-2
//		int[][] num= {{1,2,3},
//				{5,0,6,7,9,12}};
//		int en=0,on=0;
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				if(num[i][j]%2==0) {
//					en++;
//				}
//				else {
//					on++;
//				}
//			}
//		}
//		System.out.println("Count of even numbers is "+en);
//		System.out.println("Count of odd numbers is  "+on);
		
		
		
		//Array-3
//		int[][] num= {{1,2,3},
//		{5,0,6,7,9,12}};
//		
//		int max=num[0][0];
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				if(num[i][j]>max) {
//					max=num[i][j];
//				}
//			}
//		}
//		System.out.println("Max value is "+max);
//		int min=num[0][0];
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				if(num[i][j]<min) {
//					min=num[i][j];
//				}
//			}
//		}
//		System.out.println("Min value is "+min);
		
		//Array-4
//		int[] num = {1,6,7,8,9,2,3,5,4,10};
//		int highest = 0;
//		int secondHighest = 0;
//
//		for (int i = 0; i < num.length; i++) {
//		    if (num[i] > highest) {
//		        secondHighest = highest;
//		        highest = num[i];
//		    } else if (num[i] > secondHighest && num[i] != highest) {
//		        secondHighest = num[i];
//		    }
//		}
//
//		System.out.println("Second highest salary is: " + secondHighest);
		
		//Array-5
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a number to search ");
//		int en=sc.nextInt();
//		int[][] num= {{1,2,3},
//		{5,0,6,7,9,12}};
//		boolean found=false;
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				if(num[i][j]==en) {
//					System.out.println("Number found at "+(i+1)+" "+ (j+1));
//					found=true;
//					break;
//				}
//			}
//			if(found) {
//				break;
//			}
//		}
//	    if(!found) {
//	    	System.out.println("Number not found in the array");
//	    }
		
		
		
		//Array-6
//		int[][] num= {{1,2,3},
//		{5,0,6,7,9,12}};
//		for(int i=(num.length)-1;i>=0;i--) {
//			for(int j=(num[i].length)-1;j>=00;j--) {
//				System.out.print(num[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//Array-7
//		int[] arr = {1, 2, 2, 3, 4, 4, 5};
//		int n = arr.length;
//		int[] temp = new int[n];
//		int j = 0;
//
//		for (int i = 0; i < n - 1; i++) {
//		    if (arr[i] != arr[i + 1]) {
//		        temp[j++] = arr[i];
//		    }
//		}
//		temp[j++] = arr[n - 1];
//		for (int i = 0; i < j; i++) {
//		    System.out.print(temp[i] + " ");
//		}
		
		
		
		//Arrays-8
//		int[] source = {1, 2, 3,4,5,6,9};
//		int[] dest = new int[source.length];
//
//		for (int i = 0; i < source.length; i++) {
//		    dest[i] = source[i];
//		}
//		for (int num : dest) {
//		    System.out.print(num + " ");
//		}
		
		//Array-9
//		int[] arr = {5, 2, 8, 1, 3};
//		int n = arr.length;
//		for (int i = 0; i < n - 1; i++) {
//		    for (int j = 0; j < n - i - 1; j++) {
//		        if (arr[j] > arr[j + 1]) {
//		            int temp = arr[j];
//		            arr[j] = arr[j + 1];
//		            arr[j + 1] = temp;
//		        }
//		    }
//		}
//		for (int num : arr) {
//		    System.out.print(num + " ");
//		}
		
		//Array-10
//		int[] arr = {2, 3, 4, 5, 6, 7};
//
//		for (int num : arr) {
//		    boolean isPrime = true;
//		    if (num <= 1) {
//		        isPrime = false;
//		    } else {
//		        for (int i = 2; i <= num / 2; i++) {
//		            if (num % i == 0) {
//		                isPrime = false;
//		                break;
//		            }
//		        }
//		    }
//		    if (isPrime) {
//		        System.out.print(num + " ");
//		    }
//		}
		
		//Array-11
//		int[] arr = {1, 2, 2, 3, 1, 4};
//		int n = arr.length;
//		boolean[] visit = new boolean[n];
//
//		for (int i = 0; i < n; i++) {
//		    if (!visit[i]) {
//		        int count = 1;
//		        for (int j = i + 1; j < n; j++) {
//		            if (arr[i] == arr[j]) {
//		                visit[j] = true;
//		                count++;
//		            }
//		        }
//		        System.out.println(arr[i] +" " + count + " times");
//		    }
//		}	
		
		
		//Array-12
//		int[] arr = {1, 2, 3, 4, 5};
//		int k = 2; 
//		int n = arr.length;
//
//		for (int r = 0; r < k; r++) {
//		    int temp = arr[0];
//		    for (int i = 0; i < n - 1; i++) {
//		        arr[i] = arr[i + 1];
//		    }
//		    arr[n - 1] = temp;
//		}
//
//
//		for (int num : arr) {
//		    System.out.print(num + " ");
//		}
		
		
		
		//Array-13
//		int[] arr1 = {1, 3, 5};
//		int[] arr2 = {2, 4, 6};
//		int[] merged = new int[arr1.length + arr2.length];
//		int index = 0;
//		for (int num : arr1) {
//		    merged[index++] = num;
//		}
//		for (int num : arr2) {
//		    merged[index++] = num;
//		}
//
//		for (int i = 0; i < merged.length - 1; i++) {
//		    for (int j = 0; j < merged.length - i - 1; j++) {
//		        if (merged[j] > merged[j + 1]) {
//		            int temp = merged[j];
//		            merged[j] = merged[j + 1];
//		            merged[j + 1] = temp;
//		        }
//		    }
//		}
//
//
//		for (int num : merged) {
//		    System.out.print(num + " ");
//		}

		
		
		//Array-14
//		int[] arr = {1, 2, 3, 2, 1};
//		boolean isPalindrome = true;
//		int n = arr.length;
//
//		for (int i = 0; i < n / 2; i++) {
//		    if (arr[i] != arr[n - 1 - i]) {
//		        isPalindrome = false;
//		        break;
//		    }
//		}
//		if(isPalindrome) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println(" Not a Palindrome");
//		}

		
		//Array-15
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		int left = 0, right = arr.length - 1;

		while (left < right) {
		    while (arr[left] % 2 == 0 && left < right) left++;
		    while (arr[right] % 2 != 0 && left < right) right--;

		    if (left < right) {
		        int temp = arr[left];
		        arr[left] = arr[right];
		        arr[right] = temp;
		    }
		}

		for (int num : arr) {
		    System.out.print(num + " ");
		}
		
		
		
		
		
		
		
		
		
	}

}
