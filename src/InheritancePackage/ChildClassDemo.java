package InheritancePackage;

public class ChildClassDemo extends ParentClassDemo {
	
	public void audioSystem() {
		
		System.out.println("New audio system");
	}
	
	public void engine() {
		System.out.println("New Engine");
		
	}
	public void colour() {
		System.out.println(colour);
	}
	
	//function overloading 
	//either argument count should be different or
	//argument data type should be different
	public void getData(int a) {
	
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		
		System.out.println(b);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassDemo pc=new ChildClassDemo();
		pc.colour();
		pc.engine();
		pc.breaks();
		pc.getData(2);
		pc.getData("bhavya");
		pc.audioSystem(); //function overriding -both methods having same name and same signature
		

	}

}
