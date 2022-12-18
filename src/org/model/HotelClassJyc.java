package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * HotelClassJyc entity. @author MyEclipse Persistence Tools
 */

public class HotelClassJyc implements java.io.Serializable {

	// Fields

	private Integer hotelClassId;
	private String hotelClassName;
	private Set hotelJycs = new HashSet(0);

	// Constructors

	/** default constructor */
	public HotelClassJyc() {
	}

	/** full constructor */
	public HotelClassJyc(String hotelClassName, Set hotelJycs) {
		this.hotelClassName = hotelClassName;
		this.hotelJycs = hotelJycs;
	}

	// Property accessors

	public Integer getHotelClassId() {
		return this.hotelClassId;
	}

	public void setHotelClassId(Integer hotelClassId) {
		this.hotelClassId = hotelClassId;
	}

	public String getHotelClassName() {
		return this.hotelClassName;
	}

	public void setHotelClassName(String hotelClassName) {
		this.hotelClassName = hotelClassName;
	}

	public Set getHotelJycs() {
		return this.hotelJycs;
	}

	public void setHotelJycs(Set hotelJycs) {
		this.hotelJycs = hotelJycs;
	}
	@Override
	public String toString() {
		return "HotelClassJyc [hotelClassId=" + hotelClassId
				+ ", hotelClassName=" + hotelClassName + "]";
	}


}