package interfacespackage;

public class AustraliaTraffic implements CentralTraffic,continentalTraffic{

	public static void main(String[] args) {
		
		CentralTraffic a=new AustraliaTraffic(); //can get methods of central traffic interface only
		a.greenGo();
		a.flashYellow();
		a.redStop();
		
		AustraliaTraffic at=new AustraliaTraffic();//can get methods of australiTraffic class only
		at.walkOnSymbol();
		
		continentalTraffic ct=new AustraliaTraffic();//can get methods of continentalTraffic interface only
		ct.trainSymbol();
		

	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("geeengo implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
	}
	
	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yelow implementation");
	}
	
	public void walkOnSymbol() {
		System.out.println("walk on symbol");
	}
	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train implementation");
		
	}

}
