package by.home.entity.typeTransport;

import by.home.entity.Transport;

public class MotorBike extends Transport{
	
	private boolean prava;
	
	public MotorBike(String name, String dvijitel, double speed, double cost, boolean prava){
	super(name, dvijitel, speed, cost);
	this.prava=prava;
	}
	
	public boolean getPrava() {
		return prava;
	}
	
	public void setPrava(boolean prava) {
		this.prava=prava;
	}

	@Override
	public void toReccomend() {
		System.out.println("Fot extrime life.");
		
	}


	
}
