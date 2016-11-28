package com.vm.facade.pattern;

public class SonyAudioSystem {

	public SonyAudioSystem() {
		// TODO Auto-generated constructor stub
	}

	public void startAudioSystem() {
		System.out.println("AudioSystem started");
	}

	public void switchOffAudioSystem() {
		System.out.println("AudioSystem turned off");
	}

	public void insertDisk() {
		System.out.println("Disk inserted");
	}

	public void ejectDisk() {
		System.out.println("Disk ejected");
	}

	public void decreaseVolume() {
		System.out.println("Volume decreased");

	}

	public void increaseVolume() {
		System.out.println("Increase Volume");
	}

	public void play() {
		System.out.println("Playing the disk");
	}

	public void pause() {
		System.out.println("Paused the disk");
	}
}
