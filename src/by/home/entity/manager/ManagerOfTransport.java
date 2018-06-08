package by.home.entity.manager;

import by.home.entity.Transport;

public class ManagerOfTransport {
	private Transport[] transpToChoose1;
	private Transport[] transpToChoose2;
	
	public ManagerOfTransport(Transport[] transpToChoose11, Transport[] transpToChoose22) {
		this.transpToChoose1=transpToChoose11;
		this.transpToChoose2=transpToChoose22;
	}
	
	public void printTransport() {
		for (int i=0; i<transpToChoose1.length; i++) {
			Transport tToCh1=transpToChoose1[i];
			System.out.println("TranspToChoose1: "+tToCh1);
		}	
		System.out.println("the second massive");
		for (int i=0; i<transpToChoose2.length; i++) {
			Transport tToCh2=transpToChoose2[i];
			System.out.println("TranspToChoose2: "+tToCh2);
		}
	}
	
//	public toReccomend();
	
	public void toDoChooseByCost() {
		for(int i=transpToChoose1.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
			if (transpToChoose1[j].getCost()>transpToChoose1[j+1].getCost()) {
				Transport temp=transpToChoose1[j];
				transpToChoose1[j]=transpToChoose1[j+1];
				transpToChoose1[j+1]=temp;
			}
			}
		}
		for(int i=transpToChoose2.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
			if (transpToChoose2[j].getCost()>transpToChoose2[j+1].getCost()) {
				Transport temp=transpToChoose2[j];
				transpToChoose2[j]=transpToChoose2[j+1];
				transpToChoose2[j+1]=temp;
			}
			}
		}
	
	}
	
	public void toReccomend() {
		for(Transport t:  transpToChoose1) {
		t.toReccomend();
		}
		for(Transport t:  transpToChoose2) {
		t.toReccomend();
		}
	
}
}

