package org.action;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.dao.HotelClassJYCDao;
import org.dao.HotelJYCDao;
import org.model.HotelJyc;




import com.opensymphony.xwork2.ActionSupport;

public class HotelJYCAction extends ActionSupport {
	private HotelJYCDao htdao;
	private HotelClassJYCDao htcdao;
	private List allhcJsp_hcs;
	private List allhtJsp_hts;
	private HotelJyc updateHt; 
	private List updatHt_hc;
	private HotelJyc updateHtbyid;

	
	public HotelJYCDao getHtdao() {
		return htdao;
	}
	public void setHtdao(HotelJYCDao htdao) {
		this.htdao = htdao;
	}
	public HotelClassJYCDao getHtcdao() {
		return htcdao;
	}
	public void setHtcdao(HotelClassJYCDao htcdao) {
		this.htcdao = htcdao;
	}
	
	
	public List getAllhcJsp_hcs() {
		return allhcJsp_hcs;
	}
	public void setAllhcJsp_hcs(List allhcJsp_hcs) {
		this.allhcJsp_hcs = allhcJsp_hcs;
	}
	public List getAllhtJsp_hts() {
		return allhtJsp_hts;
	}
	public void setAllhtJsp_hts(List allhtJsp_hts) {
		this.allhtJsp_hts = allhtJsp_hts;
	}
	public HotelJyc getUpdateHt() {
		return updateHt;
	}
	public void setUpdateHt(HotelJyc updateHt) {
		this.updateHt = updateHt;
	}
	public List getUpdatHt_hc() {
		return updatHt_hc;
	}
	public void setUpdatHt_hc(List updatHt_hc) {
		this.updatHt_hc = updatHt_hc;
	}
	
	
	/**
	 * 查询所有酒店类型
	 * @return
	 * @throws Exception
	 */
	public String selectAllHc() throws Exception{
		allhcJsp_hcs = htcdao.getAllHotelClass();
		return "success";
	}
	
	/**
	 * 查询所有酒店
	 * @return
	 * @throws Exception
	 */
	public String selectAllHt() throws Exception{
		allhtJsp_hts = htdao.getAllHotel();
		return "success";
	}
	
	/**
	 * 返回新增UI
	 * @return
	 */
	public String addUIHt(){
		updatHt_hc = htcdao.getAllHotelClass();
		return "success";
	}
	
	/**
	 * 新增酒店信息
	 * @return
	 */
	public String updateHt(){
		HotelJyc updateHtAction = new HotelJyc();
	//	System.out.println(updateHt.getHotelClassJyc().getHotelClassId());
		HttpServletRequest req = ServletActionContext.getRequest();
		System.out.println(req.getParameter("updateHt.hotelclass"));
		updateHtAction.setHotelClassJyc(htcdao.getOneClass(Integer.parseInt(req.getParameter("updateHt.hotelclass"))));
		updateHtAction.setHotelAddress(updateHt.getHotelAddress());
		updateHtAction.setHotelName(updateHt.getHotelName());
		htdao.addHotel(updateHtAction);
		return "success";
	}
	
	
	public HotelJyc getUpdateHtbyid() {
		return updateHtbyid;
	}
	public void setUpdateHtbyid(HotelJyc updateHtbyid) {
		this.updateHtbyid = updateHtbyid;
	}
	
	/**
	 * 修改用户UI
	 * @return
	 */
	public String updateHtbyidUI(){
		updatHt_hc = htcdao.getAllHotelClass();
		HttpServletRequest req = ServletActionContext.getRequest();
		System.out.println(req.getParameter("updateHtbyid.hotelId"));
		updateHtbyid = htdao.getOneHt(Integer.parseInt(req.getParameter("updateHtbyid.hotelId")));
		return "success";
	}
	
	public String updateHtbyid(){
		HotelJyc update_Ht = htdao.getOneHt(updateHtbyid.getHotelId());
		System.out.println(updateHtbyid.getHotelClassJyc());
		update_Ht.setHotelClassJyc(updateHtbyid.getHotelClassJyc());
		update_Ht.setHotelAddress(updateHtbyid.getHotelAddress());
		update_Ht.setHotelName(updateHtbyid.getHotelName());
		htdao.update(update_Ht);
		return "success";
	}
}
