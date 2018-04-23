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
		
	}
	public static int getWidthWithADierection(Direction direction) {
		
	}
	public static int getHeightWithADierection(Direction direction) {
		
	}
	public void move() {
		
	}
	public boolean isWeapon() {
		
	}
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}
}
