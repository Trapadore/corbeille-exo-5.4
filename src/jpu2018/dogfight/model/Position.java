package jpu2018.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public class Position extends Mobile{
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public Position(double x, double maxX, double y, double maxY) {
		super(null, null, null, 0, null);
	}
	public Position(Position position) {
		super(null, position, null, 0, null);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
}
