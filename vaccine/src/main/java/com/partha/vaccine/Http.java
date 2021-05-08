/**
 * 
 */
package com.partha.vaccine;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.partha.vaccine.pojo.Sessions;
import com.partha.vaccine.propreader.PropertyReader;

/**
 * @author Partha Pratim Das<partha.783380@gmail.com>
 */
public class Http {

	/**
	 * @throws IOException
	 * 
	 */

	String district;

	public Http() throws IOException, ParseException {
		this.district = PropertyReader.getProp("district.code");

	}

	public Sessions getRequest(String date, String districtID, String ageGroup) throws Exception {

		if (null != districtID && !districtID.isEmpty()) {
			this.district = districtID;
		}

		String url1 = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id="
				+ district + "&date=" + date;
		
		//System.out.println(url1);
		
		// Create a neat value object to hold the URL
		URL url = new URL(url1);
		
		// Open a connection(?) on the URL(??) and cast the response(???)
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(5000);
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

		// Now it's "open", we can set the request method, headers etc.
		connection.setRequestProperty("accept", "application/json");

		// This line makes the request

		InputStream responseStream = null;
		int retryCounter = 3;
		while (retryCounter > 0) {

			try {
				//System.out.println("Retry : "+retryCounter);
				responseStream = connection.getInputStream();
				if(responseStream!=null)
					break;
				Thread.sleep(500);
				
			} catch (Exception e) {
				retryCounter--;

			}
		}
		if (responseStream == null) {
			throw new Exception("API call failed , "+this.district);
		}

		// Manually converting the response body InputStream to APOD using Jackson
		ObjectMapper mapper = new ObjectMapper();
		Sessions sessions = mapper.readValue(responseStream, Sessions.class);
		// System.out.println(sessions.getSessions());

		filterCenter(sessions, ageGroup);

		if (!sessions.getSessions().isEmpty()) {

			return sessions;
		}

		throw new Exception("No Center Found , "+this.district);

	}

	public void filterCenter(Sessions sessions, String ageGroup) {
		Integer[] age = { 18 };
		if (null != ageGroup && !ageGroup.isEmpty()) {
			age[0] = Integer.valueOf(ageGroup);

		}

		if (!sessions.getSessions().isEmpty()) {
			sessions.setSessions(sessions.getSessions().stream()
					.filter(center -> (center.getMinAgeLimit() == age[0]) && (center.getAvailableCapacity()!=0))
					.collect(Collectors.toList()));
		}
	}

}
