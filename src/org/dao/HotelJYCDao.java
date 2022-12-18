package org.dao;

import java.util.List;

import org.model.HotelJyc;

public interface HotelJYCDao {
	/**
	 * �����Ƶ�
	 * @param hotel
	 */
	public void addHotel(HotelJyc hotel);
	
	/**
	 * ��ѯ���оƵ�
	 */
	public List getAllHotel();
	
	/**
	 * �޸ľƵ���Ϣ
	 * @param hotel
	 */
	public void update(HotelJyc hotel);
	
	/**
	 * ����id��ѯ�Ƶ���Ϣ
	 * @param HtId
	 * @return
	 */
	public HotelJyc getOneHt(Integer HtId);
}


