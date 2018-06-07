package by.home.entity.manager;

import by.home.entity.Transport;

public class ManagerOfTransport {
	private Transport[] transpToChoose;
	
	public ManagerOfTransport(Transport[] transpToChoose) {
		this.transpToChoose=transpToChoose;
	}
	
	public void printTransport() {
		for (int i=0; i<transpToChoose.length; i++) {
			System.out.println(transpToChoose[i]);
		}	
	}
	
	public void toDoChoose(Transport[] transpToChoose) {
		for(int i=0; i<transpToChoose.length; i++) {
			for(int j=0; j<transpToChoose.length; j++) {
			if (transpToChoose[i].getCost()<transpToChoose[j].getCost()) {
				Transport temp=transpToChoose[i];
				transpToChoose[i]=transpToChoose[j];
				transpToChoose[j]=temp;
			}
			}
		}
		this.transpToChoose=transpToChoose;
	}
	
}

