/**
 * 
 */
package com.partha.vaccine;

import java.awt.Toolkit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

import com.partha.vaccine.pojo.CenterResponse;
import com.partha.vaccine.pojo.Sessions;

/**
 * @author Partha Pratim Das<partha.783380@gmail.com>
 */
public class Driver {
	
	
	public static void main(String[] args) {
		
		
		Timer timer = new Timer();
		ScheduledTask st = new ScheduledTask(args); 
        timer.schedule(st, 0, 30000); 
		
	}

	public static void task(String[] args) {

		String districtID = null;
		String ageGroup = null;
		if (args.length != 0) {
			districtID = args[0];
			ageGroup = args[1];
		}

		for (int i = 0; i < 7; i++) {
			try {
				Sessions sessions = new Http().getRequest(getDate(i), districtID, ageGroup);
				for (CenterResponse center : sessions.getSessions()) {

					System.out.println("Center Name " + center.getName());
					System.out.println("Center Slots Available " + center.getSlots());
					System.out.println("Date : " + getDate(i));

					String msg = "Center Name " + center.getName() + "\n" + "Center Slots Available "
							+ center.getSlots() + "\n" + "Date : " + getDate(i);
					
					sendAlertMessage(msg);

				}
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e.getMessage() + " | date : " + getDate(i));
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		
		System.out.println("\n _________________________________________________________\n");

	}

	public static String getDate(int day_gap) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		// Getting current date
		Calendar cal = Calendar.getInstance();
		// System.out.println("Current Date: " + sdf.format(cal.getTime()));

		// Number of Days to add
		cal.add(Calendar.DAY_OF_MONTH, day_gap);
		// Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());
		// System.out.println("Date after Addition: " + newDate);

		return newDate;

	}

	public static void sendAlertMessage(String message) throws IOException {
		
		Toolkit.getDefaultToolkit().beep();
		
	}
}
