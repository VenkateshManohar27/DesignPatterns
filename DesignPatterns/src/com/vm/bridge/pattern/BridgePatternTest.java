package com.vm.bridge.pattern;

public class BridgePatternTest {

	public BridgePatternTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Product product = new CentralLocking("Central Locking System");
		Product productGear = new GearLocking("Gear Locking System");
		Car bigwheel = new BigWheel("BigWheel", productGear);
		Car bigwheel2 = new BigWheel("BigWheel", product);
		bigwheel.produceProduct();
		bigwheel.assemble();
		bigwheel.printDetails();

		System.out.println("================================================");

		bigwheel2.produceProduct();
		bigwheel2.assemble();
		bigwheel2.printDetails();

		System.out.println("================================================");

		Car motoren = new Motoren("Motoren", productGear);
		Car motoren2 = new Motoren("Motoren", product);
		motoren.produceProduct();
		motoren.assemble();
		motoren.printDetails();
		
		System.out.println("================================================");
		motoren2.produceProduct();
		motoren2.assemble();
		motoren2.printDetails();

	}
}
