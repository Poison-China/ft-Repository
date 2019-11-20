package com.ft.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ��Ʒ��Ϣ��
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "i_Goods")
public class Goods implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String goodsId;// ��Ʒ���
	private String goodsName;// ��Ʒ����
	@ManyToOne(targetEntity = Provider.class)
	@JoinColumn(name = "comId")
	private String comId;// ������Ӧ�̱��
	private String goodsWeight;// ��Ʒ����
	private double goodsPrice;// ��Ʒ����
	private String goodsColor;// ��Ʒ��ɫ

	public Goods() {
		super();
	}

	public Goods(String goodsId, String goodsName, String comId, String goodsWeight, double goodsPrice,
			String goodsColor) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.comId = comId;
		this.goodsWeight = goodsWeight;
		this.goodsPrice = goodsPrice;
		this.goodsColor = goodsColor;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public String getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(String goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsColor() {
		return goodsColor;
	}

	public void setGoodsColor(String goodsColor) {
		this.goodsColor = goodsColor;
	}

}
