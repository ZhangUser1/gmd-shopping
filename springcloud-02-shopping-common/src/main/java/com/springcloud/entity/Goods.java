package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS1���Ӧ��ʵ����
 * @author asus-1005
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 * ��Ʒ���
	 */
    private Integer goodsId;
    /**
	 * ��Ʒ����
	 */
    private String goodsName;
    /**
	 * ��Ʒ�۸�
	 */
    private Double goodsPrices;
    /**
	 * ��Ʒ�ۿۼ�
	 */
    private Double goodsDiscount;
    /**
	 * ��Ʒ״̬��0Ϊ�ϼܣ�1Ϊ�¼�
	 */
    private Integer goodsStatus;
    /**
	 * ��Ʒ����
	 */
    private Integer goodsCount;
    /**
	 * �Ƿ���Ʒ��0����Ʒ��1������Ʒ
	 */
    private Integer goodsIsNew;
    /**
	 * ������0Ϊ������1Ϊ������
	 */
    private Integer goodsIsHot;
    /**
	 * �ȼ���0Ϊ1�ǣ�1Ϊ2�ǣ�2Ϊ3�ǣ�3��4�ǣ�4��5��
	 */
    private Integer goodsLevel;
    /**
	 * ��Ʒ���
	 */
    private String goodsBrief;
    /**
	 * ����
	 */
    private String goodsDetails;
    /**
	 * ��ƷͼƬ
	 */
    private String goodsPhoto;
    /**
	 * ���2�ı��
	 */
    private Integer class2Id;
    
    /**
     * 	��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMin;
    /**
     * 	��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMax;
    
    /**
     * 	��ѯ������һ���������
     */
    private Integer class1Id;
    
    /**
     * ��Ʒ���������ڱ���ͳ�Ʒ���Ľ��
     */
    private Integer goodsSum;
}