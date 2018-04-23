package jpu2018.dogfight.controller;

import jpu2018.dogfight.model.IDogfightModel;
import jpu2018.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	
	IViewSystem viewSystem;
	IDogfightModel dogfightModel;
	
	int TIME_SLEEP = 30;
	
	DogfightController(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	@Override
	public void orderPerform(UserOrder userOrder) {
		
	}
	
	public void play() {
		
	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	
	void lauchMissile(int player) {
		
	}
	
	void gameLoop() {
		
	}
}
