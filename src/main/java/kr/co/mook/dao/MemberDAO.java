package kr.co.mook.dao;

import java.util.List;

import kr.co.mook.vo.MemberVO;

public interface MemberDAO {

	int insertMember(MemberVO vo);

	int deleteMember(String memId);

	int deleteAllMember();

	MemberVO selectMember(String memId);

	List<MemberVO> selectAllMember();
	
	int getCount();

	int updateMember(MemberVO vo);

}
