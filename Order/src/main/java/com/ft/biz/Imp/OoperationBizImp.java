package com.ft.biz.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ft.biz.OperationBiz;
import com.ft.dao.OperationDao;
import com.ft.entity.Provider;

@Service("operationBiz")
public class OoperationBizImp implements OperationBiz{
	@Autowired
	private OperationDao operationDao;
	
	@Override
	public List<Provider> findSupplierByStatus(int status) {
		List<Provider> list = operationDao.findSupplierByStatus(status);
		return list;
	}

}
