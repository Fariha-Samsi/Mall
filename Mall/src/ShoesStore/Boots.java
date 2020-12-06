package ShoesStore;

public class Boots extends AllShoes {

	public void snowBoots(){
		
		System.out.println("This shoes are made out of "+leather+".");
		System.out.println("This is a "+highTop+" shoes.");
		System.out.println("This shoes has "+getValpro()+".");
		setInsole("rubber insole");
		System.out.println("This shoes has "+getInsole()+".");
		System.out.println("This shoes has "+christySole+"." );
			
	}
	
	public void hikingBoots() {
		
		System.out.println("This shoes are made out of "+leather+".");
		System.out.println("This is a "+lowTop+" shoes.");
		System.out.println("This shoes has "+getShoelace()+".");
		System.out.println("THis shoes has "+laceHook+".");
		setInsole("leather insole");
		System.out.println("This shoes has "+getInsole()+".");
		System.out.println("This shoes has "+luggedSole+"." );
			
	}
	
}
