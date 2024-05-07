package org.phone;

public class InternalStorage {
	
	
	private void processorName() {
		// TODO Auto-generated method stub
		System.out.println("Processor Name:\n"+"\tMediatek Dimensity 6020 Chipset\n");

	}
	private void ramSize() {
		// TODO Auto-generated method stub
		System.out.println("RAM size:\n"+"\t8 GB\n");
		

	}
	
	public static void main(String[] args) {
		
		ExternalStorage eS = new ExternalStorage();
		InternalStorage iS = new InternalStorage();
		
		eS.size();
		iS.processorName();
		iS.ramSize();
		
		
		}
	
}
