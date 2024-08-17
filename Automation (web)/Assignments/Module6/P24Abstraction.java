package Java_Assignment;

abstract class Parent {
	abstract void message(); 
	} class FirstSubClass extends Parent { 
		@Override 
       void message()
		{ System.out.println("This is First Subclass");
		} 
		}
	 class SecondSubClass extends Parent {
		 @Override
		 void message()
		 { System.out.println("This is Second Subclass");
		 }
		 } 


public class P24Abstraction {
	public static void main(String[] args) {
		FirstSubClass obj = new FirstSubClass();
		obj.message(); 
		
		SecondSubClass obj1 = new SecondSubClass();
		obj1.message(); 
		 
}
}
	
