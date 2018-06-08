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
		
		Bike bike2=new Bike("Bike","nogi", 15, 888, "good");
		MotorBike motorBike2=new MotorBike("MotorBike", "dvigatel", 40, 8888, true);
		Car car2=new Car("Car", "dvigatel", 80, 88888, 5);
		Metro metro2=new Metro("Metro", "electrocity", 120, 8, "Only in Minsk");
		Transport[] transpToChoose2= {bike2, motorBike2, car2,  metro2};
		
		ManagerOfTransport managerOfTransport1=new ManagerOfTransport(transpToChoose1, transpToChoose2);
		
		managerOfTransport1.printTransport(); 
		System.out.println();
		
//		rabotaet		
//		for (int i=0; i<transpToChoose1.length; i++) {
//			System.out.println(transpToChoose1[i]);
//		}
		
		bike1.toReccomend(); 
		System.out.println();
		
		managerOfTransport1.toReccomend();
		System.out.println();
		
		
//		rabotaet
//		for(Transport t:  transpToChoose1) {
//			t.toReccomend();
//			}
	
//		rabotaet
//		for(ManagerOfTransport m:  managerOfTransport1) {
//			m.toReccomend();
//			}
		
	
		managerOfTransport1.toDoChooseByCost();
		
		System.out.println("Posle sortirovki: ");
		managerOfTransport1.printTransport(); 
	}


}
