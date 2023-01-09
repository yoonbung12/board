package com.board.controller;

import java.util.List;

import javax.inject.Inject;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.domain.Page;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

//	@Autowired쓰는방법으로도해봐야함 inject말고
//	@Autowired
//	BoardService service;
	
	@Inject
	BoardService service;
	
	//게시물 목록
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void getList(Model model) throws Exception {
		
			List<BoardVO> list= null;
			list = service.list();
			
			model.addAttribute("list" , list);
			
	}
	//게시물 작성
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public void getWrite(Model model)	throws Exception {
		
		
	}
	//게시물 작성
		@RequestMapping(value="/write", method = RequestMethod.POST)
		public String postWrite(BoardVO vo)	throws Exception {
			
			service.write(vo);
			return "redirect:/board/list";
			
		}
		
	//게시물 조회
	@RequestMapping(value = "/view" , method = RequestMethod.GET)
	public void getView(
			
				@RequestParam("bno") int bno,
				Model model
			
			
			) throws Exception {
		
		BoardVO vo = service.view(bno);
//		모댈이 있는게 까먹고 안써서 안된건지 확인할것1/2 
		model.addAttribute("view", vo);
		
	}
	//게시물 수정
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public void getModify(
			
			@RequestParam("bno") int bno,
			Model model
			
			) throws Exception{
		
			BoardVO vo = service.view(bno);
			model.addAttribute("view", vo);
	}
	//게시물 수정(post)설정도 추가할것
	@RequestMapping(value= "/modify", method = RequestMethod.POST)
	public String postModify(BoardVO vo) throws Exception {
		
		service.modify(vo);
		return "redirect:/board/view?bno=" + vo.getBno();
		
	}
	
	//게시물 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDelete(
			
			@RequestParam("bno") int bno,
			Model model
			) throws Exception {
				
		service.delete(bno);
		return "redirect:/board/list";
		
	}
	
	//게시물 목록 + 페이징추가
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void getListPage(Model model, @RequestParam("num") int num)throws Exception {
		
		Page page = new Page();
		
		page.setNum(num);
		page.setCount(service.count());

		List<BoardVO> list = null;
		list = service.listPage(page.getDisplayPost(), page.getPostNum() );
		
		model.addAttribute("list", list);
		
		
		//이부분은 page의 데이터다 그래서 삭제해도 상관없는 부분
//		model.addAttribute("pageNum", page.getPageNum());
//		
//		model.addAttribute("startPageNum", page.getStartPageNum());
//		model.addAttribute("endPageNum", page.getEndPageNum());
//		
//		model.addAttribute("prev", page.getPrev());
//		model.addAttribute("next", page.getNext());
		
		model.addAttribute("page", page);
		model.addAttribute("select", num);
		
		// ----------------------------------------- *******************************
		//class에서 처리해서 주석 처리해놨음
//		//게시물 총갯수
//		int count = service.count();
//		
//		//한페이지에 출력할 게시물 갯수
//		int postNum = 10;
//		
//		//하단 페이징 번호([게시물 총 갯수+ 한페이지에 출력할 갯수]의 소수점은 올림)
//		int pageNum = (int)Math.ceil((double)count/postNum);
//		
//		//출력할 게시물
//		int displayPost = (num - 1) * postNum;
//		
//		//한번에 표시할 페이징번호의 갯수
//		int pageNum_cnt = 10;
//		
//		//표시되는 페이지 번호중 마지막 번호
//		int endPageNum = (int)(Math.ceil((double)num / (double)pageNum_cnt) * pageNum_cnt);
//		
//		//표시되는 페이지 번호중 첫번째 번호
//		int startPageNum = endPageNum - (pageNum_cnt - 1);
//		
//		//마지막 페이지 번호 = ((올림)(현재 페이지 번호 / 한번에 표시할 페이지 번호의 갯수)) * 한번에 표시할 페이지 번호의 갯수
//		//마지막 번호 재계산
//		int endPageNum_tmp = (int)(Math.ceil((double)count  /  (double)pageNum_cnt));
//		
//		if(endPageNum > endPageNum_tmp) {
//			endPageNum = endPageNum_tmp;
//		}
//		
//		boolean prev = startPageNum == 1 ? false : true;
//		boolean next = endPageNum * pageNum_cnt >= count ? false : true;
//		
//		
//		List<BoardVO> list = null;
//		list = service.listPage(displayPost, postNum);
//		model.addAttribute("list", list);
//		model.addAttribute("pageNum", pageNum);
//		
//		//시작 및 끝 번호
//		model.addAttribute("startPageNum", startPageNum);
//		model.addAttribute("endPageNum", endPageNum);
//		
//		//이전 및 다음
//		model.addAttribute("prev", prev);
//		model.addAttribute("next", next);
//		
//		//현재 페이지 
//		model.addAttribute("select", num);
//		
	}
	//게시물 목록 + 페이징추가 + 검색
	@RequestMapping(value = "/listPageSearch", method = RequestMethod.GET)
	public void getListPageSearch(Model model, 
			
			@RequestParam("num") int num,
			@RequestParam(value = "searchType", required = false, defaultValue = "title") String searchType,
			@RequestParam( value="keyword", required = false, defaultValue = "") String keyword
			
			)throws Exception {

		
		Page page = new Page();
		//페이징을 만들때 가져오는 게시물의 갯수
		page.setCount(service.count());
		
		page.setNum(num);
		page.setCount(service.count());

		List<BoardVO> list = null;
		//list = service.listPage(page.getDisplayPost(), page.getPostNum() );
		list = service.listPageSearch(page.getDisplayPost(), page.getPostNum(), searchType, keyword);
		
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("select", num);
	
	}	
	
	
	
}
