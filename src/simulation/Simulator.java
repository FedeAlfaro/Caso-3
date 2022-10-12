package simulation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import Huerta.planta.StatusManager;
import utils.*;


public class Simulator extends Observable implements Runnable, IConstants {
	private LocalTime startedTime;
	private boolean running = false;
	private StatusManager plantManager;
	private int currentRain;
	private int currentTemperature;
	private int currentSun;
	private LocalTime weatherLastUpdate;
	private int dayPass;
	private String currentSeason;
	
	
	public Simulator(StatusManager pManager) {
		this.plantManager = pManager;
	}
	
	@Override
	public void run() {
		startedTime = LocalTime.now();
		LocalDate currentTime;
		running = true;
		while (running) {
			try {

				//this.plantManager.evaluate(dayPass);				
				System.out.println("Han pasado "+dayPass+" dias");
				
				Thread.sleep(CHECKIN_TIME);
				dayPass = (int)ChronoUnit.MILLIS.between(startedTime, LocalTime.now()) / DAY_IN_MILLIS;
				
				currentRain=plantManager.getCurrentRain();
				currentTemperature=plantManager.getCurrentTemp();
				currentSun=plantManager.getCurrentSun();
				currentSeason=plantManager.getCurrentSeason();
				
				SimulatorReport report = new SimulatorReport();
				report.action = UPDATE_DAYS;
				report.days = dayPass;
				report.Rain=currentRain;               //Los siguientes 4 valores se notifican directamente al controller
				report.Temperature=currentTemperature; //no al status manager
				report.Sun=currentSun;
				report.Season=currentSeason;
				
				this.notifyObservers(report);
				
				
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
	
	/*
	// el hilo que va recorriendo las reglas del clima, cuando genera un cambio en el clima me lo reporta por este método
	public void updateWeather(){ //int pTemp, int pRain, int pSun) {
		this.weatherLastUpdate = LocalTime.now();
		
		SimulatorReport report = new SimulatorReport();
		report.action = UPDATE_WEATHER;
		report.days = dayPass;
		
		this.notifyObservers(report);
	}
	*/
	
	public void stop() {
		running = false;
	}
	
}
