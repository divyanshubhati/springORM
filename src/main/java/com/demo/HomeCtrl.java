package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeCtrl {
	
	@Autowired
	private MobileDAO mobileDao;
	
	@RequestMapping("/add")
	public String add() {
		return "display.jsp";
	}
	
	@GetMapping("getMobiles")
	public ModelAndView getMobile() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", mobileDao.getMobile());
		return mv;
	}
	
	@RequestMapping("addMobile")
	public String addMobile(@ModelAttribute("result") Mobile m) {
		// model attribute fetch the object and mapp it to mobile object m, it aslo add it to model object
		mobileDao.addMobile(m);
		return "display.jsp";
	}
	
	@GetMapping("getMobile")
	public String getMobile(@RequestParam int mid, Model m) {
		m.addAttribute("result", mobileDao.getMobile(mid));
		return "display.jsp";
	}
}
