package org.dao.imp;

import java.util.List;

import org.dao.HotelJYCDao;
import org.model.HotelJyc;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HotelJYCDaoImp extends HibernateDaoSupport implements HotelJYCDao {

	public void addHotel(HotelJyc hotel) {
		// TODO Auto-generated method stub
		//新增酒店信息
		getHibernateTemplate().save(hotel);
	}

	public List getAllHotel() {
		// TODO Auto-generated method stub
		//根据酒店序号查询所有酒店
		List list = getHibernateTemplate().find("from HotelJyc");
		return list;
	}

	public void update(HotelJyc hotel) {
		// TODO Auto-generated method stub
		//更新酒店信息
		getHibernateTemplate().update(hotel);
	}

	public HotelJyc getOneHt(Integer HtId) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from HotelJyc where id=?",HtId);
		if(list.size()>0)
			return (HotelJyc)list.get(0);
		else 
			return null;
	}

}