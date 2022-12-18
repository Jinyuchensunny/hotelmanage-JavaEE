package org.dao;

import java.util.List;

import org.model.HotelJyc;

public interface HotelJYCDao {
	/**
	 * 新增酒店
	 * @param hotel
	 */
	public void addHotel(HotelJyc hotel);
	
	/**
	 * 查询所有酒店
	 */
	public List getAllHotel();
	
	/**
	 * 修改酒店信息
	 * @param hotel
	 */
	public void update(HotelJyc hotel);
	
	/**
	 * 根据id查询酒店信息
	 * @param HtId
	 * @return
	 */
	public HotelJyc getOneHt(Integer HtId);
}


