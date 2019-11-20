package com.ft.biz;

import java.util.List;

import com.ft.entity.Provider;

/**
 * 订单系统业务层接口
 * @author ml
 *
 */
public interface OperationBiz {
	/**
	 * 查询显示在合作的供应商信息列表
	 * @return
	 */
	List<Provider> findSupplierByStatus(int status);

}
