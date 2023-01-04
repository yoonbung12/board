-- 게시판 테이블 생성
create table board (
	bno int not null auto_increment,
    title varchar(50) not null,
    content text not null,
    writer varchar(30) not null,
    regdate timestamp default current_timestamp,
    viewcnt int default 0,
    primary key(bno)
);
-- 게시판 테이블 삭제
drop table board;


-- 게시판 데이터 넣기
insert into board(bno, title, content, writer, regdate)
	values(0, 'sss', 'sdfsdf', 'ybw', default);
insert into board(title, content, writer)
	values('테스트 2', '아이고 삽질중이다,...', '내가 누구인가');
    
insert into board(title, content, writer)
	values('테스트 1', 'ㅁㄴㅇㅁㄴㅇㅁㄴㅇ','병다리');

-- 게시판 데이터 확인
select * from board;
select bno, title, content, writer, regdate, viewcnt
	from board
    where bno=1;
select bno, title, content, writer, regdate, viewcnt
	from board;
-- 게시판 데이터 limit으로 구분해서 보기( 0~ 10번째 보는방법은 0, 10을 써주면 됨)
select bno, title, content, writer, regdate, viewcnt
	from board
    order by bno desc
    limit 1;
    
 
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

commit;