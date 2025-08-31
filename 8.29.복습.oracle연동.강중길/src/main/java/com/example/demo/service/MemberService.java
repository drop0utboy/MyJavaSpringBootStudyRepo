package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mybatis.MemberDao;
import com.example.demo.dto.Member;

import io.micrometer.common.util.StringUtils;

@Service
public class MemberService {
	@Autowired
	private MemberDao memberDao;

	public void join(Member member) {
		memberDao.insert(member);
	}

	public Member getMember(String mid) {
		Member member = memberDao.selectByMid(mid);
		return member;
	}

	public Member modify(Member member) {
		Member dbMember = memberDao.selectByMid(member.getMid());
		if (dbMember == null) {
			return null;
		} else {
			if (StringUtils.isNotBlank(member.getMname())) {
				dbMember.setMname(member.getMname());
			}
			if (StringUtils.isNotBlank(member.getMpassword())) {
				dbMember.setMpassword(member.getMpassword());
			}
			if (StringUtils.isNotBlank(member.getMemail())) {
				dbMember.setMemail(member.getMemail());
			}

			int rows = memberDao.update(dbMember);
//			if (rows == 0) {
//				return null;
//			} else {
			return dbMember;

		}
	}
	
	
	 // 여기서 RemoveResult는 타입이다
	public enum RemoveResult {
		SUCCESS,
		FAIL
	}
	
	
	public RemoveResult remove(String mid) {
		int rows = memberDao.delete(mid);
		if (rows == 0) {
			return RemoveResult.FAIL;
			
		} else {
			return RemoveResult.SUCCESS;
		}
	}
}
