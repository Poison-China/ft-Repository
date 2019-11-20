package com.ft.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ��Ӧ�̱�
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "i_Provider")
public class Provider implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String comId;// ��Ӧ�̱��
	private String comName;// ��Ӧ������
	private String comPersonName;// ��Ӧ�̸���������
	private String comPhone;// ��Ӧ�̵绰
	private int comStatus;// ��Ӧ�̺���״̬(1��ʾ������0��ʾû�к���)

	public Provider() {
		super();
	}

	public Provider(String comId, String comName, String comPersonName, String comPhone, int comStatus) {
		super();
		this.comId = comId;
		this.comName = comName;
		this.comPersonName = comPersonName;
		this.comPhone = comPhone;
		this.comStatus = comStatus;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComPersonName() {
		return comPersonName;
	}

	public void setComPersonName(String comPersonName) {
		this.comPersonName = comPersonName;
	}

	public String getComPhone() {
		return comPhone;
	}

	public void setComPhone(String comPhone) {
		this.comPhone = comPhone;
	}

	public int getComStatus() {
		return comStatus;
	}

	public void setComStatus(int comStatus) {
		this.comStatus = comStatus;
	}

}
