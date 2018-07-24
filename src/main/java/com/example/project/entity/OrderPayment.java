package com.example.project.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单支付表
 * </p>
 *
 * @author liushiqiang
 * @since 2018-07-24
 */
@TableName("tl_order_payment")
public class OrderPayment extends Model<OrderPayment> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 支付方式
     */
    private Integer payId;
    /**
     * 支付流水号
     */
    private String tradeNo;
    /**
     * 支付金额
     */
    private Integer payAmount;
    /**
     * 支付json信息
     */
    private String payData;
    /**
     * 支付备注
     */
    private String payRemark;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 支付时间
     */
    private Date payDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayData() {
        return payData;
    }

    public void setPayData(String payData) {
        this.payData = payData;
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderPayment{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", payId=" + payId +
        ", tradeNo=" + tradeNo +
        ", payAmount=" + payAmount +
        ", payData=" + payData +
        ", payRemark=" + payRemark +
        ", createDate=" + createDate +
        ", payDate=" + payDate +
        "}";
    }
}
