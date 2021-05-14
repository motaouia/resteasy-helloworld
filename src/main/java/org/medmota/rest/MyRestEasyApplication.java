package org.medmota.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MyRestEasyApplication extends Application{
	
	private Set<Object> singletons = new HashSet<Object>();
	 
    public MyRestEasyApplication() {
        singletons.add(new HelloWorldRestService());
    }
 
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
