package main;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 1;
		arr[4] = 3;

		int min = arr[0];
		int second = arr[0];

		for(int i =1;i<arr.length ; i++) {

			if(arr[i]<min) {      // 2 <5 			// 4<2  // 1<
				second = min;		//second = min = 5 // 
				min = arr[i];		//min = 2		  //
			}


		}

		System.out.println("Smallest value is "+min);
		System.out.println("Second smallest is "+second);
		System.out.println();


		//Write method which will return a String[] where it will take two string argument 
		//and will return words of s1 which are not present in s2

		String sentence1 = "The quick brown fox jumps";
		String sentence2 = "The brown jumps";
		
		String[] s1 = sentence1.split(" ") ;  // s1[0] = The // s[1] = quick // s[2] = brown // 
		String[] s2 = sentence2.split(" ");	// s2[0] = The // s[1] = jumps // s[2] = brown //
		String s ="";

											  // the quick brown  fox  jumps
		for (int i=0; i < s1.length; i++) {   // 0,   1,    2,    3,   4,
			for(int j=0; j<s2.length; j++) {  // 0, 1 , 2 
				
				if(s1[i].contentEquals(s2[j])){   
					System.out.println("i = " +i+" j ="+j);
					i++;
				}
				else {
					System.out.println("i = " +i+" j ="+j);
					s= s1[i];
					System.out.println(s);
					i++;
				}
				j++;
			}
		}
		
		
		//System.out.println(s);


		// i2 j1 // i3 j2 
		//System.out.println("i = " +i+" j ="+j);

		//		System.out.println("i = " +i+" j ="+j);






	}


}
