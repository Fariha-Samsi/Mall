package clothingStore;

public class SummerCloths extends AllCloths{

	public void tShirt(int price) {

		System.out.println("T-Shirts has "+ buttons+".");
		System.out.println("T-Shirt is made out of "+cotton+".");
		System.out.println("This t-Shirts has "+ pockets+".");
		System.out.println("This t-Shirt has "+ longSleeves+".");
		System.out.println("This t-Shirt cost :- $"+price);
	}


	public void shorts(int price) {

		System.out.println("This shorts has "+pockets+".");
		System.out.println("This shorts are madeout of "+rubber+".");
		System.out.println("This shorts has "+zippers+".");
		System.out.println("This shorts cost :- $"+price);
	}


	public void shorts(String colour) {

		System.out.println("This shorts has "+pockets+".");
		System.out.println("This shorts are madeout of "+rubber+".");
		System.out.println("This shorts has "+zippers+".");
		System.out.println("The coulour of this shorts is : "+colour);
	}

	public void shorts(int price, String colour) {

		System.out.println("This shorts has "+pockets+".");
		System.out.println("This shorts are madeout of "+rubber+".");
		System.out.println("This shorts has "+zippers+".");
		System.out.println("This shorts cost :- $"+price);
		System.out.println("The coulour of this shorts is : "+colour);

	}
	
	public void shorts(String logo, String colour) {

		System.out.println("This shorts has "+pockets+".");
		System.out.println("This shorts are madeout of "+rubber+".");
		System.out.println("This shorts has "+zippers+".");
		System.out.println("The logo of this shorts is : "+logo);
		System.out.println("The coulour of this shorts is : "+colour);

	}

}
