package JavaWeek02.GLCcode;

    

public class ClassA 

{

    public static void main(String args[])

    {

     X x = new X() ;
     X xy = new Y();   
     xy.classXMethod();
     xy.commonMethod();
     //xy.classYMethod();
     

    }

    
    
}

class X {
	public void classXMethod() {
		System.out.println("Class X Method");
	}
	
	void commonMethod() {
		System.out.println("Class X Common Method");
	}
}

class Y extends X{
	public void classYMethod() {
		System.out.println("Class Y Method");
	}
	
	void commonMethod() {
		System.out.println("Class Y Common Method");
	}
}