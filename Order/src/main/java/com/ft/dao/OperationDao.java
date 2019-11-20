package com.ft.dao;
/**
 * 订单接口
 * @author ml
 *
 */

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ft.entity.Order;
import com.ft.entity.Provider;

public interface OperationDao extends JpaRepository<Order	, String>{
	/**
	 * 查询显示在合作的供应商信息列表
	 * @return
	 */
	@Query("from Supplier where comStatus = ?1")
	List<Provider> findSupplierByStatus(int status);

}
