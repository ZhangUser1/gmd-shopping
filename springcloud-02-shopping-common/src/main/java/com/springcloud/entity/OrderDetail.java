package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDERS����Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
 * 
 * @author asus-1005
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements java.io.Serializable {

	private static final long serialVersionUID = -7405309828011124128L;

	/**
	 * ������ϸ���
	 */
	private Integer orderDetailId;
	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;
	/**
	 * ��Ʒ����
	 */
	private String goodsName;
	/**
	 * ��Ʒ���׼۸�
	 */
	private Double transactionPrice;
	/**
	 * ��������
	 */
	private Integer transactionCount;

}