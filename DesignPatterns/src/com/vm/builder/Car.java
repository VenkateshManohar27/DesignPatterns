package com.vm.builder;

public final class Car {

	private String bodyStyle;
	private String power;
	private String engine;
	private String breaks;
	private String seats;
	private String windows;
	private String fuelType;
	private String carType;
	
	public Car(String carType) {
		// TODO Auto-generated constructor stub
		this.carType = carType;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getBreaks() {
		return breaks;
	}

	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getWindows() {
		return windows;
	}

	public void setWindows(String windows) {
		this.windows = windows;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [bodyStyle=");
		builder.append(bodyStyle);
		builder.append(", power=");
		builder.append(power);
		builder.append(", engine=");
		builder.append(engine);
		builder.append(", breaks=");
		builder.append(breaks);
		builder.append(", seats=");
		builder.append(seats);
		builder.append(", windows=");
		builder.append(windows);
		builder.append(", fuelType=");
		builder.append(fuelType);
		builder.append(", carType=");
		builder.append(carType);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
