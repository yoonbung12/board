package com.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.ReplyVO;
import com.board.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {

//	@Autowired쓰는방법으로도해봐야함 inject말고
//	@Autowired
//	BoardService service;
	
	@Inject
	private ReplyService replyService;
	
	//댓글 조회

	//댓글 작성	
	@RequestMapping(value= "/write", method = RequestMethod.POST)
	public String posttWrite(ReplyVO vo) throws Exception{
		
		replyService.write(vo);
		
		return "redirect:/board/view?bno=" + vo.getBno();
		
	}
	

	
	//댓글 수정
	
	//댓글 삭제
	
	
	
	
}
