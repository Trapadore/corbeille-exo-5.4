package jpu2018.dogfight.model;

public interface IDogfightModel {
	public IArea getArea();
	public void buildArea(Dimension dimension);
	public void addMobile(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public IMobile getMobile();
	public IMobile getMobileByPlayer(int player);
	public void setMobileHavesMoved();
}
