package jpu2018.dogfight.view;


import java.awt.event.KeyEvent;

import jpu2018.dogfight.controller.IOrderPerformer;
import jpu2018.dogfight.controller.UserOrder;
import jpu2018.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	public EventPerformer(IOrderPerformer orderPerformer) {
		
	}
	
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(int KeyCode) {
		return this.keyCodeToUserOrder(KeyCode);
	}
	
	
}
