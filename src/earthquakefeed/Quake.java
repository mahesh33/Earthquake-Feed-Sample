package earthquakefeed;

import java.sql.Date;

/*
 * This class holds data about the occurrence of an earthquake as provided by the US Geological Services 
 * RSS feed the date, a descriptor string called details that describes the location,
 * the location in terms of latitude and longitude the magnitude, 
 * as a number on the Richter scale and a link to further information.
 */
public class Quake {

	// Fields for quake information
	private Date date;
	private String details;
	private String location;
	private double magnitude;
	private String link;

	/**
	 * It just initializes the initial values
	 * 
	 * @param date
	 *            date of occurrence
	 * @param details
	 *            details of the quake
	 * @param location
	 *            where does that occurred
	 * @param magnitude
	 *            magnitude of the quake
	 * @param link
	 *            and finally the link.
	 */
	public Quake(Date date, String details, String location, double magnitude, String link) {
		super();
		this.date = date;
		this.details = details;
		this.location = location;
		this.magnitude = magnitude;
		this.link = link;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
