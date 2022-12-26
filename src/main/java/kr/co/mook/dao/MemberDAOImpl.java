package kr.co.mook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mook.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession session;
	
	@Override
	public int insertMember(MemberVO vo) {
		return session.update("memberNS.addOne", vo);
	}
	
	@Override
	public int deleteMember(String memId) {
		return session.update("memberNS.delOne", memId);
		
	}
	
	@Override
	public int deleteAllMember() {
		return session.update("memberNS.delAll");
	}

	@Override
	public MemberVO selectMember(String memId) {
		return session.selectOne("memberNS.getOne", memId);
	}
	
	@Override
	public List<MemberVO> selectAllMember(){
		return session.selectList("memberNS.getAll");
		
	}

	@Override
	public int updateMember(MemberVO vo) {
		return session.update("memberNS.update", vo);
	}

	@Override
	public int getCount() {
		return session.selectOne("memberNS.getCount");
	}
	
}
