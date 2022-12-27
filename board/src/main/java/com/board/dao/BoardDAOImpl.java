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
	
	
	
	@Override
	public List<BoardVO> list() throws Exception {
		
		return sql.selectList(namespace + ".list");
	}

}
