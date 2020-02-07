package com.bridgelabz.designpattern.behaviraldesignpattern.mediaterdesignpattern;

public class Runway implements Command {

	private IATCMediater iatcMediator;

	public Runway(IATCMediater iatcMediator) {
		this.iatcMediator = iatcMediator;
		iatcMediator.setLandingStatus(true);
	}

	@Override
	public void land() {
		System.out.println("Landing permision granted");
		iatcMediator.setLandingStatus(true);
	}

}
