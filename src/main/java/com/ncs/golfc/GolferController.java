package com.ncs.golfc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.GolferService;
import vo.GolferVO;

@Controller
public class GolferController {
	
	@Autowired
	GolferService service;
	
	@RequestMapping(value = "/golferList")
	public ModelAndView golferList(ModelAndView mv) {
		List<GolferVO> list = service.selectList();
		if (list != null) {
			mv.addObject("Ping", list);
		} else {
			mv.addObject("message", "검색된 자료가 없습니다.");
		}
		mv.setViewName("golfer/golferList");
		return mv;
	} // golferList
}