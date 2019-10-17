package com.gpd.wdr.entity;

import java.io.Serializable;

/**
 * shopping_trolley
 * @author 
 */
public class ShoppingTrolleyKey implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;

    private Integer weddingdressId;

    private static final long serialVersionUID = 1L;

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
        ShoppingTrolleyKey other = (ShoppingTrolleyKey) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWeddingdressId() == null ? other.getWeddingdressId() == null : this.getWeddingdressId().equals(other.getWeddingdressId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getWeddingdressId() == null) ? 0 : getWeddingdressId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", weddingdressId=").append(weddingdressId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}