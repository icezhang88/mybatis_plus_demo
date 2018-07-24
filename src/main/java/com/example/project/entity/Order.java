package com.example.project.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author liushiqiang
 * @since 2018-07-24
 */
@TableName("tl_order")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    @TableId(value = "order_id", type = IdType.INPUT)
    private String orderId;
    /**
     * 订单状态，1未支付，2已支付
     */
    private Integer orderStatus;
    /**
     * 产品ID
     */
    private Integer productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 单价，单位分
     */
    private Integer unitPrice;
    /**
     * 订单总金额
     */
    private Integer orderAmount;
    /**
     * 用户ID
     */
    private Integer memberId;
    /**
     * 客户备注
     */
    private String orderRemark;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 支付时间
     */
    private Date payDate;
    /**
     * 更新时间
     */
    private Date modifyDate;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
        "orderId=" + orderId +
        ", orderStatus=" + orderStatus +
        ", productId=" + productId +
        ", productName=" + productName +
        ", count=" + count +
        ", unitPrice=" + unitPrice +
        ", orderAmount=" + orderAmount +
        ", memberId=" + memberId +
        ", orderRemark=" + orderRemark +
        ", createDate=" + createDate +
        ", payDate=" + payDate +
        ", modifyDate=" + modifyDate +
        "}";
    }
}
