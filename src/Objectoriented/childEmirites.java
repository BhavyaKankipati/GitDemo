package Objectoriented;

public class childEmirites extends ParentAirCraft {
	
	public static void main(String args[]) {
		childEmirites c=new childEmirites();
		c.engine();
		c.bodyColour();
		c.safetyGuidelines();
		
		//we cannot instantiate abstract class
		
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Aircraft colour is green");
		
		
	}

}
