package com.bridgelabz.designpattern.behaviraldesignpattern.mediaterdesignpattern;

public interface IATCMediater {
	
	public void registerRunway(Runway runway);
	
	public void registerFlight(Flight flight);
	
	public boolean isLandingOk();
	
	public void setLandingStatus(boolean status);
	
}
