package com.board.dao;

import java.util.List;

import javax.inject.Inject;

//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

//	한번 바꿔서도 해봐야함
//	private  static final String NAME_SPACE="boardMapper";
//	
//	private SqlSessionTemplate template = null;
//	
//	@Autowired
//	public BoardDAOImpl(SqlSessionTemplate template) {
//		this.template = template;
//	}
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.board";
	
	
	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {
		
		return sql.selectList(namespace + ".list");
	}

	//게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		
		sql.insert(namespace + ".write" , vo );
	}
	//게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		
		
		return sql.selectOne(namespace + ".view", bno);
	}

	//게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		
		sql.update(namespace + ".modify" , vo);
		
	}
	
	
	

	

}
