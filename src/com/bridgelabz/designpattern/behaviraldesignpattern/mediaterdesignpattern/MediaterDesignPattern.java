package com.bridgelabz.designpattern.behaviraldesignpattern.mediaterdesignpattern;

public class MediaterDesignPattern {

	public static void main(String[] args) {
		IATCMediater iatcMediator = new ATCMediater();
		Flight spiceJet = new Flight(iatcMediator);
		Runway onRunway = new Runway(iatcMediator);

		iatcMediator.registerFlight(spiceJet);
		iatcMediator.registerRunway(onRunway);

		spiceJet.getReady();
		onRunway.land();
		spiceJet.land();

	}

}
