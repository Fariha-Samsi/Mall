package makeupStore;

public class Sephora_Constructor {

	/*
	 * A Constructor is a special method. That has the same name as the name of the class.
	 * Since its a special method it not require the method type. Ex: void/return type.
	 * Constructor is a way to pass down values to the class.
	 * If a Constructor is not created its there by default. Which is called a default constructor.
	 * There is two types of constructor 
	 * 		1. Default Constructor
	 * 		2. Parameterized Constructor
	 * 
	 * When we create a object then the constructor get called.
	 * We can create multiple constructor.
	 * 
	 */

	String lipStickBrands;
	String foundationBrands;
	String eyeShadowBrands;
	String nailPolishBrands;
	String blusherBrands;


	public Sephora_Constructor(String lipStickBrands,String foundationBrands,
			String eyeShadowBrands,String nailPolishBrands,String blusherBrands) {
		this.lipStickBrands = lipStickBrands;
		this.eyeShadowBrands = eyeShadowBrands;
		this.foundationBrands = foundationBrands;
		this.nailPolishBrands = nailPolishBrands;
		this.blusherBrands = blusherBrands;

	}

	public void lipStick() {

		System.out.println("We sell this brand of lipstick: "+lipStickBrands+ ".");

	}

	public void foundation() {

		System.out.println("We sell this brand of lipstick: "+foundationBrands+ ".");

	}
	public void eyeShadow() {

		System.out.println("We sell this brand of lipstick: "+eyeShadowBrands+ ".");

	}
	public void nailPolish() {

		System.out.println("We sell this brand of lipstick: "+nailPolishBrands+ ".");

	}
	public void blusher() {
		
		System.out.println("We sell this brand of lipstick: "+blusherBrands+ ".");
		
		}



}
