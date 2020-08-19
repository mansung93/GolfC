package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbcUtil.GolferDAO;
import vo.GolferVO;

@Service
public class GolferServiceImpl implements GolferService {
	@Autowired
	GolferDAO dao;
	
	@Override
	public List<GolferVO> selectList() {
		return dao.selectList();
	} // selectList

}
