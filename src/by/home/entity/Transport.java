package by.home.entity;

public abstract class Transport {
	
	private String name;
	private String dvijitel;
	private double speed;
	private double cost;
	String reccomend;
	
	public Transport(String name, String dvijitel, double speed, double cost) {
		this.name=name;
		this.dvijitel=dvijitel;
		this.speed=speed;
		this.cost=cost;
	}
	
	public Transport() {
	}
	
	public String getName() {
		return name;		
	}
	
	public void setName(String name) {
		this.name=name;		
	}
	
	public String getDvij() {
		return dvijitel;
	}
	
	public void setDvij(String dvijitel) {
		this.dvijitel=dvijitel;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed=speed;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost=cost;
	}
	
	public abstract void toReccomend();
	

	@Override
	public String toString() {
		return "Transport [name="+name+",  speed="+speed+".  it costs: "+cost+"$]";
	}

}
