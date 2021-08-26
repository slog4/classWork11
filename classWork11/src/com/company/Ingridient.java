package com.company;

public class Ingridient {
	public Ingridient(String title, double col, Units units, String description) {
		this.title = title;
		this.col = col;
		this.units = units;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ingridient{" +
				"title='" + title + '\'' + col + units +
				'}';
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCol() {
		return col;
	}

	public void setCol(float col) {
		this.col = col;
	}

	public Units getUnits() {
		return units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String title;
	private double col;
	private Units units;
	private String description;

}
