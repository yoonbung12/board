package com.board.controller;

import java.util.List;

import javax.inject.Inject;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

//	@Autowired쓰는방법으로도해봐야함 inject말고
//	@Autowired
//	BoardService service;
	
	@Inject
	BoardService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void getList(Model model) throws Exception {
		
			List<BoardVO> list= null;
			list = service.list();
			
			model.addAttribute("list" , list);
			
	}

}
