package ntu.ist.core.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ntu.ist.core.dao.BaseDictDao;
import ntu.ist.core.po.BaseDict;
import nut.ist.core.service.BaseDictService;
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {
	
	@Autowired
	private BaseDictDao baseDictDao;
	@Override
		//根据类别代码查询数据字典
		public List<BaseDict> findBaseDictByTypeCode(String typecode) 
		{
			return baseDictDao.selectBaseDictByTypeCode(typecode);
		}
	}
