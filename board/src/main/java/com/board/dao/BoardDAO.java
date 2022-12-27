package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
//	BoardVO를 리스트 형식으로  가져와야
	public List<BoardVO> list() throws Exception;
	
}
