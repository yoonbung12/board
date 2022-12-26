-- 게시판 테이블 생성
create table board (
	idx int not null auto_increment,
    title varchar(50) not null,
    content text not null,
    writer varchar(30) not null,
    regdate timestamp default current_timestamp,
    viewcnt int default 0,
    primary key(idx)
);
-- 게시판 테이블 삭제
drop table board;

-- 게시판 데이터 넣기
insert into board(idx, title, content, writer, regdate)
	values(0, 'sss', 'sdfsdf', 'ybw', default); 

-- 게시판 데이터 확인
select * from board;     
-- 	-------------------------------------------
-- 회원 테이블 만들기
create table member(
	midx varchar(40) not null primary key,
    pw varchar(40) not null,
    mname varchar(40) not null,
	memail varchar(50) not null,
    phone varchar(50) not null
    );
    
--   회원 테이블 삭제
drop table member;
-- 	회원 데이터 넣기...
insert into member(midx,  pw, mname, memail, phone)
	values(0,  '123111', 'aaaa', '123222', 010-2222-222);

-- 회원 데이터 확인
select * from member;