package ntu.ist.core.service;

import java.util.List;

import ntu.ist.core.po.BaseDict;

public interface BaseDictService {
	
	//数据字典Service接口
	//根据类别代码查询数据字典
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
