package by.home.entity.typeTransport;

import by.home.entity.Transport;

public class Metro extends Transport{
		
		private String position;
		
		public Metro(String name, String dvijitel, double speed, double cost, String position){
			super(name, dvijitel, speed, cost);
			this.position=position;
			}
			
			public String getPosition() {
				return position;
			}
			
			public void setPosition( String position) {
				this.position=position;
			}

			@Override
			public void toReccomend() {
				System.out.println("For getting to enother end of the city");
			}


}
