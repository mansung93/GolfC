package com.ncs.golfc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
//	@Autowired
//	GolferService golferService;
	
	@RequestMapping(value = "/boardList")
	public ModelAndView golferList(ModelAndView mv) {
//		List<GolferVO> list = golferService.selectList();
//		if (list != null) {
//			mv.addObject("Ping", list);
//		} else {
//			mv.addObject("message", "검색된 자료가 없습니다.");
//		}
		mv.setViewName("board/boardList");
		return mv;
	} // boardList
	
}