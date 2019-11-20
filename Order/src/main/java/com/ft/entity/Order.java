package com.ft.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * �ɹ�������
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "i_Order")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String orderId;// �������
	@ManyToOne(targetEntity = Employee.class)
	@JoinColumn(name = "empId")
	private String empId;// �ɹ���Ա���
	private Date orderDate;// �ɹ�ʱ��
	@ManyToOne(targetEntity = Goods.class)
	@JoinColumn(name = "goodsId")
	private String goodsId;// �ɹ���Ʒ���
	private int orderAmmount;// �ɹ�����

	public Order() {
		super();
	}

	public Order(String orderId, String empId, Date orderDate, String goodsId, int orderAmmount) {
		super();
		this.orderId = orderId;
		this.empId = empId;
		this.orderDate = orderDate;
		this.goodsId = goodsId;
		this.orderAmmount = orderAmmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public int getOrderAmmount() {
		return orderAmmount;
	}

	public void setOrderAmmount(int orderAmmount) {
		this.orderAmmount = orderAmmount;
	}

}
