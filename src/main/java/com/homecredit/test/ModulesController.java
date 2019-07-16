package com.homecredit.test;

import java.util.Hashtable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecredit.test.model.Modules;
import com.homecredit.test.model.ResponseApi;

@RestController
@RequestMapping("/modules")
public class ModulesController {

	@Autowired
	ModulesService ms;
	
	@RequestMapping("/all")
	public Hashtable<String, Modules> getAll() {
		return ms.getAll();
	}
	
	@RequestMapping("{userId}")
	public ResponseApi getModules(@PathVariable("userId") Long userId) {
		return ms.getModules(userId);
	}
}
