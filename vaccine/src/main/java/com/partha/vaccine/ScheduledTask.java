/**
 * 
 */
package com.partha.vaccine;

import java.util.TimerTask;

/**
 * @author Partha Pratim Das<partha.783380@gmail.com>
 */
public class ScheduledTask extends TimerTask{

	/**
	 * 
	 */
	
	String[] args;
	
	public ScheduledTask(String[] ar) {
		this.args=ar;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		Driver.task(args);
		
	}
	
	

}
