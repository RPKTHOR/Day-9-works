package com.homeautomation;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name = "rpk";
    private String homeId = "home236";

    public String getName() {
        return name;
    }
    public String getHomeId() {
        return homeId;
    }
}
