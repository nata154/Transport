package by.home.entity.typeTransport;

import by.home.entity.Transport;

public class Car extends Transport{
	
	private int numOfSeats;
	
	public Car(String name, String dvijitel, double speed, double cost, int numOfSeats){
		super(name, dvijitel, speed, cost);
		this.numOfSeats=numOfSeats;
		}
		
		public int getNumOfSeats() {
			return numOfSeats;
		}
		
		public void setNumOfSeats( int numOfSeats) {
			this.numOfSeats=numOfSeats;
		}

		@Override
		public void toReccomend() {
			System.out.println("For a big family.");
			
		}

}
