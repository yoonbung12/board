package com.board.domain;

import java.util.Date;

public class ReplyVO {


	/* create table reply(
	rno int not null auto_increment,
    bno int not null,
    writer varchar(30) not null,
    content text not null,
    regdate timestamp not null default now(),
    primary key(rno, bno),
    foreign key(bno) references board(bno)
    ); */
	
	private int rno;
	private int bno;
	private String writer;
	private String content;
	private Date regDate;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
}
