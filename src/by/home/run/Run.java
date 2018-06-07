package by.home.run;

import by.home.entity.Transport;
import by.home.entity.manager.ManagerOfTransport;
import by.home.entity.typeTransport.Bike;
import by.home.entity.typeTransport.Car;
import by.home.entity.typeTransport.Metro;
import by.home.entity.typeTransport.MotorBike;

public class Run {

	public static void main(String[] args) {
		Bike bike1=new Bike("Bike","nogi", 15, 150, "good");
		MotorBike motorBike1=new MotorBike("MotorBike", "dvigatel", 40, 1500, true);
		Car car1=new Car("Car", "dvigatel", 80, 15000, 5);
		Metro metro1=new Metro("Metro", "electrocity", 120, 1, "Only in Minsk");
		Transport[] transpToChoose1= {bike1, motorBike1, car1,  metro1};
		
		ManagerOfTransport managerOfTransport1=new ManagerOfTransport(transpToChoose1);
		
		for (int i=0; i<transpToChoose1.length; i++) {
			System.out.println(transpToChoose1[i]);
		}
		
//		System.out.println();
//		printTransport();
//		toDoChoose();
		
		for(int i=0; i<transpToChoose1.length; i++) {
				for(int j=0; j<transpToChoose1.length; j++) {
				if (transpToChoose1[i].getCost()<transpToChoose1[j].getCost()) {
					Transport temp=transpToChoose1[i];
					transpToChoose1[i]=transpToChoose1[j];
					transpToChoose1[j]=temp;
				}
				}
			}
		
		for (int i=0; i<transpToChoose1.length; i++) {
			System.out.println(transpToChoose1[i]);
		}
		
		toDoChoose(transpToChoose1);
//		printTransport(transpToChoose1);
		
//		ManagerOfTransport manOfTr1=new ManagerOfTransport(transpToChoose1);
		
//		Transport=Transport.toDoChoose();
		

	}


}
