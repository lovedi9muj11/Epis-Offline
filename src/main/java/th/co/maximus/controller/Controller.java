package th.co.maximus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import th.co.maximus.bean.BeanClass;
import th.co.maximus.service.impl.ServiceImpl;

@RestController
@RequestMapping("/controller")
public class Controller {
	
	@Autowired ServiceImpl serviceImpl;
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	@ResponseBody
	public String testMethod(@RequestBody BeanClass req) {
		return serviceImpl.testMethod(req.getName());
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public List<BeanClass> testAll() {
		return serviceImpl.allBeanClass();
	}
	
	@RequestMapping(value = "/xxx", method = RequestMethod.GET)
	@ResponseBody
	public String xxxTest() {
		return "Test xxx :: xxx";
	}

}
