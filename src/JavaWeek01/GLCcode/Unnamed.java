package JavaWeek01.GLCcode;

public class Unnamed {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("1-----------------------------------");
		Unnamed1.i = 10;
		Unnamed1.staticMethod();
		System.out.println("2-----------------------------------");
		Unnamed2 un2 = new Unnamed2();
		Unnamed2 un2_2 = new Unnamed2();
		System.out.println("3-----------------------------------");
		Unnamed3 un3 = new Unnamed3();
		un3.publicMethod();
	}

}

class Unnamed1 {
	
	/*
	 * when you create object then it will execute few things in sequence
		- static block
		- instance block
		- constructor
	 */

	public static int i = 0;
	
	/*
	 * static method will called when ...
	 *  - create an object of the class
	 *  - called static method
	 *  - called static variable
	 *  - it will called once
	 */
	static 	{ System.out.println("1. Static Unnamed"); 	}
	
	
	/*
	 * Unnamed method will called when ...
	 *  - create an object of the class
	 *  - for each object it will be called
	 */
			{ System.out.println("2. Unnamed");			}
	
			
	Unnamed1() { System.out.println("3. Constructor"); 	}
	
	public static void staticMethod() { System.out.println("4. Class Static Method"); }
	
	public void publicMethod() { System.out.println("4. Object Method"); }

}

class Unnamed2 {
	
	/*
	 * when you create object then it will execute few things in sequence
		- static block
		- instance block
		- constructor
	 */
	static 	{ System.out.println("1. Static Unnamed"); 	}
		
			{ System.out.println("2. Unnamed");			}
	
	Unnamed2() { System.out.println("3. Constructor"); 	}
	
	public static void staticMethod() { System.out.println("4. Class Static Method"); }
	
	public void publicMethod() { System.out.println("4. Object Method"); }

}

class Unnamed3 {
	
	/*
	 * when you create object then it will execute few things in sequence
		- static block
		- instance block
		- constructor
	 */
	static 	{ System.out.println("1. Static Unnamed"); 	}
		
			{ System.out.println("2. Unnamed");			}
	
	Unnamed3() { System.out.println("3. Constructor"); 	}
	
	public static void staticMethod() { System.out.println("4. Class Static Method"); }
	
	public void publicMethod() { System.out.println("4. Object Method"); }

}
