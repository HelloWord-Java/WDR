package com.gpd.wdr.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * orderform
 * @author 
 */
public class Orderform implements Serializable {
    private Integer orderId;

    /**
     * 用户id
     */
    private Integer userId;

    private Integer weddingdressId;

    private Date orderStarttime;

    private Date orderPEndtime;

    private Date orderAEndtime;

    private Float orderBasicC;

    private Float orderTimeoutC;

    private Float orderDiscountC;

    private Float orderSumC;

    private String orderCreator;

    private Date orderCreatetime;

    private Integer orderStatus;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWeddingdressId() {
        return weddingdressId;
    }

    public void setWeddingdressId(Integer weddingdressId) {
        this.weddingdressId = weddingdressId;
    }

    public Date getOrderStarttime() {
        return orderStarttime;
    }

    public void setOrderStarttime(Date orderStarttime) {
        this.orderStarttime = orderStarttime;
    }

    public Date getOrderPEndtime() {
        return orderPEndtime;
    }

    public void setOrderPEndtime(Date orderPEndtime) {
        this.orderPEndtime = orderPEndtime;
    }

    public Date getOrderAEndtime() {
        return orderAEndtime;
    }

    public void setOrderAEndtime(Date orderAEndtime) {
        this.orderAEndtime = orderAEndtime;
    }

    public Float getOrderBasicC() {
        return orderBasicC;
    }

    public void setOrderBasicC(Float orderBasicC) {
        this.orderBasicC = orderBasicC;
    }

    public Float getOrderTimeoutC() {
        return orderTimeoutC;
    }

    public void setOrderTimeoutC(Float orderTimeoutC) {
        this.orderTimeoutC = orderTimeoutC;
    }

    public Float getOrderDiscountC() {
        return orderDiscountC;
    }

    public void setOrderDiscountC(Float orderDiscountC) {
        this.orderDiscountC = orderDiscountC;
    }

    public Float getOrderSumC() {
        return orderSumC;
    }

    public void setOrderSumC(Float orderSumC) {
        this.orderSumC = orderSumC;
    }

    public String getOrderCreator() {
        return orderCreator;
    }

    public void setOrderCreator(String orderCreator) {
        this.orderCreator = orderCreator;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orderform other = (Orderform) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWeddingdressId() == null ? other.getWeddingdressId() == null : this.getWeddingdressId().equals(other.getWeddingdressId()))
            && (this.getOrderStarttime() == null ? other.getOrderStarttime() == null : this.getOrderStarttime().equals(other.getOrderStarttime()))
            && (this.getOrderPEndtime() == null ? other.getOrderPEndtime() == null : this.getOrderPEndtime().equals(other.getOrderPEndtime()))
            && (this.getOrderAEndtime() == null ? other.getOrderAEndtime() == null : this.getOrderAEndtime().equals(other.getOrderAEndtime()))
            && (this.getOrderBasicC() == null ? other.getOrderBasicC() == null : this.getOrderBasicC().equals(other.getOrderBasicC()))
            && (this.getOrderTimeoutC() == null ? other.getOrderTimeoutC() == null : this.getOrderTimeoutC().equals(other.getOrderTimeoutC()))
            && (this.getOrderDiscountC() == null ? other.getOrderDiscountC() == null : this.getOrderDiscountC().equals(other.getOrderDiscountC()))
            && (this.getOrderSumC() == null ? other.getOrderSumC() == null : this.getOrderSumC().equals(other.getOrderSumC()))
            && (this.getOrderCreator() == null ? other.getOrderCreator() == null : this.getOrderCreator().equals(other.getOrderCreator()))
            && (this.getOrderCreatetime() == null ? other.getOrderCreatetime() == null : this.getOrderCreatetime().equals(other.getOrderCreatetime()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getWeddingdressId() == null) ? 0 : getWeddingdressId().hashCode());
        result = prime * result + ((getOrderStarttime() == null) ? 0 : getOrderStarttime().hashCode());
        result = prime * result + ((getOrderPEndtime() == null) ? 0 : getOrderPEndtime().hashCode());
        result = prime * result + ((getOrderAEndtime() == null) ? 0 : getOrderAEndtime().hashCode());
        result = prime * result + ((getOrderBasicC() == null) ? 0 : getOrderBasicC().hashCode());
        result = prime * result + ((getOrderTimeoutC() == null) ? 0 : getOrderTimeoutC().hashCode());
        result = prime * result + ((getOrderDiscountC() == null) ? 0 : getOrderDiscountC().hashCode());
        result = prime * result + ((getOrderSumC() == null) ? 0 : getOrderSumC().hashCode());
        result = prime * result + ((getOrderCreator() == null) ? 0 : getOrderCreator().hashCode());
        result = prime * result + ((getOrderCreatetime() == null) ? 0 : getOrderCreatetime().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", weddingdressId=").append(weddingdressId);
        sb.append(", orderStarttime=").append(orderStarttime);
        sb.append(", orderPEndtime=").append(orderPEndtime);
        sb.append(", orderAEndtime=").append(orderAEndtime);
        sb.append(", orderBasicC=").append(orderBasicC);
        sb.append(", orderTimeoutC=").append(orderTimeoutC);
        sb.append(", orderDiscountC=").append(orderDiscountC);
        sb.append(", orderSumC=").append(orderSumC);
        sb.append(", orderCreator=").append(orderCreator);
        sb.append(", orderCreatetime=").append(orderCreatetime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}