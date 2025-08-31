package com.example.demo.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Board;
import com.example.demo.dto.Pager;

//create table board (
//	    bno number primary key,
//	    btitle varchar(200) not null,
//	    bcontent clob null,
//	    bdate date not null,
//	    mid varchar(20) references member not null,
//	    bhitcount number not null,
//	    battachoname varchar(100) null,
//	    battachsname varchar(100) null,
//	    battachtype varchar(100) null,
//	    battachdata blob null
//	);

@Mapper
public interface BoardDao {
	public int insert(Board board);
	public Board selectByBno(int bno);
	public List<Board> selectByPage(Pager pager);
	public void update(Board board);
	public int updateHitcount();
	public int delete(int bno);
	public int countAll();
}
