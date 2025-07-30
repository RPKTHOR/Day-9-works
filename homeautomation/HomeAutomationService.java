package com.homeautomation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeAutomationService {
	@Autowired
	private User user;
	@Autowired
	private Device device;
	
	public void controlDevice() {
		System.out.println("User: "+user.getName() +" controling the device");
		device.turnOff();
		device.turnOn();
	}
}
