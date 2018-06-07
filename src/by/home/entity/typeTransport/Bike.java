package by.home.entity.typeTransport;

import by.home.entity.Transport;

public class Bike extends Transport{
	
	private String ann;
	
	public Bike(String name, String dvijitel, double speed, double cost, String ann){
	super(name, dvijitel, speed, cost);
	this.ann=ann;
	}
	
	public String getAnn() {
		return ann;
	}
	
	public void setAnn(String ann) {
		this.ann=ann;
	}

	@Override
	public void toReccomend() {
		System.out.println("Fot active life.");
		
	}


}
