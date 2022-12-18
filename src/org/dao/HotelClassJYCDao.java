package org.dao;

import java.util.List;

import org.model.HotelClassJyc;

public interface HotelClassJYCDao {
	/**
	 * 查询所有酒店类型
	 * @return
	 */
	public List getAllHotelClass();
	
	/**
	 * 根据id查询单条酒店信息
	 * @param hotelclassid
	 * @return
	 */
	public HotelClassJyc getOneClass(int hotelclassid);
}
