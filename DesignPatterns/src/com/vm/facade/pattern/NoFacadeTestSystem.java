package com.vm.facade.pattern;

public class NoFacadeTestSystem {

	public NoFacadeTestSystem() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		System.out.println("Starting the system ");
		Samsung5220 samsung5220 = new Samsung5220();
		SamsungProjector sp = new SamsungProjector();
		SonyAudioSystem sony = new SonyAudioSystem();
		samsung5220.startSpeakers();
		samsung5220.increaseVolume();
		sp.startProjector();
		sp.increaseBrightness();
		sony.ejectDisk();
		sony.insertDisk();
		sony.play();
		System.out.println("stopping the system ");
		sony.decreaseVolume();
		sony.ejectDisk();
		sony.switchOffAudioSystem();
		sp.decreaseBrightness();
		sp.switchOffProjector();
		samsung5220.decreaseVolume();
		samsung5220.switchOffSpeakers();
	}
}
