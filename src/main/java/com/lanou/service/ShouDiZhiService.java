package com.lanou.service;


import com.lanou.entity.ShouDiZhi;

import java.util.List;

public interface ShouDiZhiService {

	public  List<ShouDiZhi> findShouDiZhi(Integer uId);
	public boolean addShouDiZhi(String sName,String sArea,String sAddress,String sZip,String sPhone,Integer user_id);
	public  boolean deleteShouDiZhi(Integer sId,Integer user_id);
}
