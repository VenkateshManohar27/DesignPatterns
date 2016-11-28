package com.vm.facade.pattern;

public class HomeTheatreFacade {
	private final Samsung5220 samsung5220;
	private final SamsungProjector sp;
	private final SonyAudioSystem sony;
	public HomeTheatreFacade() {
		samsung5220 = new Samsung5220();
		sp = new SamsungProjector();
		sony = new SonyAudioSystem();
	}

	public void startSystem(){
		samsung5220.startSpeakers();
		samsung5220.increaseVolume();
		sp.startProjector();
		sp.increaseBrightness();
		sony.ejectDisk();
		sony.insertDisk();
		sony.play();
	}
	
	public void stopSystem(){
		sony.decreaseVolume();
		sony.ejectDisk();
		sony.switchOffAudioSystem();
		sp.decreaseBrightness();
		sp.switchOffProjector();
		samsung5220.decreaseVolume();
		samsung5220.switchOffSpeakers();
	}
	
	public static void main(String[] args) {
		HomeTheatreFacade htf = new HomeTheatreFacade();
		htf.startSystem();
		System.out.println();
		System.out.println("Stopping the system");
		htf.stopSystem();
	}
	
}
