package org.dao;

import java.util.List;

import org.model.HotelClassJyc;

public interface HotelClassJYCDao {
	/**
	 * ��ѯ���оƵ�����
	 * @return
	 */
	public List getAllHotelClass();
	
	/**
	 * ����id��ѯ�����Ƶ���Ϣ
	 * @param hotelclassid
	 * @return
	 */
	public HotelClassJyc getOneClass(int hotelclassid);
}
