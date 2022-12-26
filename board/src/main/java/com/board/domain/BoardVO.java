package com.board.domain;

import java.util.Date;

public class BoardVO {
/* 게시판 테이블vo만들기
 * create table board (
			idx int not null auto_increment,
		    title varchar(50) not null,
		    content text not null,
		    writer varchar(30) not null,
		    regdate timestamp default current_timestamp,
		    viewcnt int default 0,
		    primary key(idx)
		);
*/	
	private int idx;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	
}
