package jpu2018.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public class Missile extends Mobile{
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension) {
		super(direction, null, dimension, SPEED, IMAGE);
	}
	
	public static int getWidthWithADierection(Direction direction) {
		return WIDTH;
	}
	public static int getHeightWithADierection(Direction direction) {
		return HEIGHT;
	}
	
	public void move() {
		
	}
	public boolean isWeapon() {
		return false;
	}
	
}
