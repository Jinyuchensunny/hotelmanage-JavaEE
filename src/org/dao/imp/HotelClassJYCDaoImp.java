package org.dao.imp;

import java.util.List;

import org.dao.HotelClassJYCDao;
import org.model.HotelClassJyc;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HotelClassJYCDaoImp extends HibernateDaoSupport implements
		HotelClassJYCDao {

	public List getAllHotelClass() {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from HotelClassJyc order by hotelClassId");
		return list;
	}
	public HotelClassJyc getOneClass(int hotelclassid){
		List list=getHibernateTemplate().find("from HotelClassJyc where id=?",hotelclassid);
		if(list.size()>0){
			return (HotelClassJyc)list.get(0);
		}else{
			return null;
		}
	}
}
