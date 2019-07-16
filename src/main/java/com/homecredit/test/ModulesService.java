package com.homecredit.test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.homecredit.test.model.Modules;
import com.homecredit.test.model.ModulesResponse;
import com.homecredit.test.model.ResponseApi;

@Service
public class ModulesService {
	Hashtable<String, Modules> modullist = new Hashtable<String, Modules>();
	public ModulesService() {
		Modules m = new Modules();
		m.setUserId(1);
		m.setModuleName("PromoCard");
		m.setModuleOrder(1);
		modullist.put("1", m);
		
		m = new Modules();
		m.setUserId(1);
		m.setModuleName("CategoryCard");
		m.setModuleOrder(2);
		modullist.put("2", m);
		
		m = new Modules();
		m.setUserId(1);
		m.setModuleName("FlashSaleCard");
		m.setModuleOrder(3);
		modullist.put("3", m);
		
		m = new Modules();
		m.setUserId(1);
		m.setModuleName("HistoryCard");
		m.setModuleOrder(4);
		modullist.put("4", m);
		
		m = new Modules();
		m.setUserId(1);
		m.setModuleName("NewsCard");
		m.setModuleOrder(5);
		modullist.put("5", m);
		
		m = new Modules();
		m.setUserId(2);
		m.setModuleName("PromoCard");
		m.setModuleOrder(1);
		modullist.put("6", m);
		
		m = new Modules();
		m.setUserId(2);
		m.setModuleName("NewsCard");
		m.setModuleOrder(2);
		modullist.put("7", m);
		
		m = new Modules();
		m.setUserId(2);
		m.setModuleName("FlashSaleCard");
		m.setModuleOrder(3);
		modullist.put("8", m);
		
		m = new Modules();
		m.setUserId(2);
		m.setModuleName("CategoryCard");
		m.setModuleOrder(4);
		modullist.put("9", m);
		
		m = new Modules();
		m.setUserId(2);
		m.setModuleName("HistoryCard");
		m.setModuleOrder(5);
		modullist.put("10", m);
		
		m = new Modules();
		m.setUserId(3);
		m.setModuleName("PromoCard");
		m.setModuleOrder(1);
		modullist.put("11", m);
		
		m = new Modules();
		m.setUserId(3);
		m.setModuleName("FlashSaleCard");
		m.setModuleOrder(2);
		modullist.put("12", m);
		
		m = new Modules();
		m.setUserId(3);
		m.setModuleName("CategoryCard");
		m.setModuleOrder(3);
		modullist.put("13", m);
		
		m = new Modules();
		m.setUserId(3);
		m.setModuleName("NewsCard");
		m.setModuleOrder(4);
		modullist.put("14", m);
		
		m = new Modules();
		m.setUserId(3);
		m.setModuleName("HistoryCard");
		m.setModuleOrder(5);
		modullist.put("15", m);
	}
	
	public ResponseApi getModules(Long userId) {
		List<ResponseApi> response = new ArrayList<ResponseApi>();
		List<ModulesResponse> responselist = new ArrayList<ModulesResponse>();
		
		  for(Map.Entry<String, Modules> entry:modullist.entrySet()){
			  Modules m=entry.getValue();
			  if(m.getUserId() == userId) {
				  ModulesResponse mr = new ModulesResponse();
				  mr.setModuleName(m.getModuleName());
		          mr.setModuleOrder(m.getModuleOrder());
		          responselist.add(mr);
		      } 
		 }
		  
		  ResponseApi ra = new ResponseApi();
		  ra.setModules(responselist);
		  response.add(ra);
		  
		  return ra;
	}
	;
	public Hashtable<String, Modules> getAll() {
		return modullist;
	}
}
