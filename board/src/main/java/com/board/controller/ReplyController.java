package com.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.board.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {

//	@Autowired쓰는방법으로도해봐야함 inject말고
//	@Autowired
//	BoardService service;
	
	@Inject
	private ReplyService service;
	
	//댓글 조회
	
	//댓글 작성
	
	//댓글 수정
	
	//댓글 삭제
	
	
	
	
}
