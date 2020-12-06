package main;

import ShoesStore.Boots;
import clothingStore.Polo;
import clothingStore.SummerCloths;
import clothingStore.WinterCloths;
import clothingStore.WorkoutCloths;

import makeupStore.Sephora_Constructor;

/*Polymorphism
 * Polymorphism means many form, we perform polymorphism through inheritance.
 * There are 2 ways to accomplish polymorphism, they are overloading and overriding also known as staic and dynamic.
 * Static happens during comple time, and dynamic happens during runtime.
 * Override we do through inheritance, without inheritance override cannot happen.
 * Overload ca happen with or without inheritance
 * Override: is when we inherit a class and give the function a new meaning.
 * Overload: is a function with the same name but different praameter.
 * 
 */
public class RunnerClass {

	public static void main(String[] args) {
		
		SummerCloths sc = new SummerCloths();
		WinterCloths wc = new WinterCloths();
		WorkoutCloths woc = new WorkoutCloths();	
		Polo p = new Polo();
		Boots b = new Boots();
		Sephora_Constructor spc = new Sephora_Constructor("Mac","HudaBeauty","ABH","OPI","Two faced");
		//SportShoes ss = new SportShoes();
		
		spc.lipStick();
		spc.foundation();
		spc.eyeShadow();
		spc.nailPolish();
		spc.blusher();
		
		
		
	
	}

}
