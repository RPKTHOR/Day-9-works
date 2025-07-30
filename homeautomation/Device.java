package com.homeautomation;

import org.springframework.stereotype.Component;

@Component
public class Device {
	private String deviceType = "Washing Machine";
    private boolean status = false;

    public String getDeviceType() {
        return deviceType;
    }
    public boolean isStatus() {
        return status;
    }

    public void turnOn() {
        status = true;
        System.out.println(deviceType + " is turned ON.");
    }
    public void turnOff() {
        status = false;
        System.out.println(deviceType + " is turned OFF.");
    }
}
