package org.model;

/**
 * HotelJyc entity. @author MyEclipse Persistence Tools
 */

public class HotelJyc implements java.io.Serializable {

	// Fields
	private Integer hotelId;
	private String hotelName;
	private String hotelAddress;
	private HotelClassJyc hotelClassJyc;

	// Constructors

	/** default constructor */
	public HotelJyc() {
	}

	/** full constructor */
	public HotelJyc(HotelClassJyc hotelClassJyc, String hotelName,
			String hotelAddress) {
		this.hotelClassJyc = hotelClassJyc;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
	}

	// Property accessors

	public Integer getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public HotelClassJyc getHotelClassJyc() {
		return hotelClassJyc;
	}

	public void setHotelClassJyc(HotelClassJyc hotelClassJyc) {
		this.hotelClassJyc = hotelClassJyc;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return this.hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}


}