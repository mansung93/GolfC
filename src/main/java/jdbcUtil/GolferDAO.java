package jdbcUtil;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.GolferVO;

@Repository
public class GolferDAO {
	
	@Autowired
	private SqlSession sqlsession;
	
	private static final String NS="golfc.mappers.golferMapper.";
	
	public List<GolferVO> selectList() {
		return sqlsession.selectList(NS+"selectList");
	}

}
