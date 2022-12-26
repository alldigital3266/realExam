package kr.co.mook;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mook.dao.MemberDAO;
import kr.co.mook.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberDAOTest {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	MemberDAO dao;
	
	@Autowired
	SqlSession session;
	
    @Test
    public void sqlSessionTest() {
    	
    	System.out.println("+++++" + session);
    	assertNotNull(session);
    	
    }
	
	@Test
	public void selectMemberTest() {
		MemberVO vo1 = dao.selectMember("aaaa");
		
		
		List<MemberVO> list = dao.selectAllMember();

		for(MemberVO vo : list) {
			System.out.println(vo);
			
		}

		
		
		
	}
	
	

}
