//package com.ft.controller;
//
//import java.util.List;
//
//import javax.swing.JSpinner.ListEditor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.ft.biz.OperationBiz;
//import com.ft.entity.Supplier;
//
//@Controller
//@RequestMapping("/order")
//public class OperationController {
//	@Autowired
//	@Qualifier("orderBiz")
//	private OperationBiz orderBiz;
//	@RequestMapping("/findSupplierStatus")
//	private String findSupplierStatus() {
//		System.out.println("----------");
//		List<Supplier> list = orderBiz.findSupplierByStatus(1);
//		System.out.println(list);
//		return "suc";
//	}
//	
//
//}
