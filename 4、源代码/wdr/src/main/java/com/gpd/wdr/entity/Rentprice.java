package com.gpd.wdr.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * rentprice
 * @author 
 */
public class Rentprice implements Serializable {
    private Integer rentpriceId;

    private Integer weddingdressId;

    private Float rentpriceDeposit;

    private Float rentpriceDailym;

    private Float rentpriceOvertime;

    private Boolean rentpriceStatus;

    private Date rentpriceCreatetime;

    private String rentpriceCreator;

    private static final long serialVersionUID = 1L;

    public Integer getRentpriceId() {
        return rentpriceId;
    }

    public void setRentpriceId(Integer rentpriceId) {
        this.rentpriceId = rentpriceId;
    }

    public Integer getWeddingdressId() {
        return weddingdressId;
    }

    public void setWeddingdressId(Integer weddingdressId) {
        this.weddingdressId = weddingdressId;
    }

    public Float getRentpriceDeposit() {
        return rentpriceDeposit;
    }

    public void setRentpriceDeposit(Float rentpriceDeposit) {
        this.rentpriceDeposit = rentpriceDeposit;
    }

    public Float getRentpriceDailym() {
        return rentpriceDailym;
    }

    public void setRentpriceDailym(Float rentpriceDailym) {
        this.rentpriceDailym = rentpriceDailym;
    }

    public Float getRentpriceOvertime() {
        return rentpriceOvertime;
    }

    public void setRentpriceOvertime(Float rentpriceOvertime) {
        this.rentpriceOvertime = rentpriceOvertime;
    }

    public Boolean getRentpriceStatus() {
        return rentpriceStatus;
    }

    public void setRentpriceStatus(Boolean rentpriceStatus) {
        this.rentpriceStatus = rentpriceStatus;
    }

    public Date getRentpriceCreatetime() {
        return rentpriceCreatetime;
    }

    public void setRentpriceCreatetime(Date rentpriceCreatetime) {
        this.rentpriceCreatetime = rentpriceCreatetime;
    }

    public String getRentpriceCreator() {
        return rentpriceCreator;
    }

    public void setRentpriceCreator(String rentpriceCreator) {
        this.rentpriceCreator = rentpriceCreator;
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
        Rentprice other = (Rentprice) that;
        return (this.getRentpriceId() == null ? other.getRentpriceId() == null : this.getRentpriceId().equals(other.getRentpriceId()))
            && (this.getWeddingdressId() == null ? other.getWeddingdressId() == null : this.getWeddingdressId().equals(other.getWeddingdressId()))
            && (this.getRentpriceDeposit() == null ? other.getRentpriceDeposit() == null : this.getRentpriceDeposit().equals(other.getRentpriceDeposit()))
            && (this.getRentpriceDailym() == null ? other.getRentpriceDailym() == null : this.getRentpriceDailym().equals(other.getRentpriceDailym()))
            && (this.getRentpriceOvertime() == null ? other.getRentpriceOvertime() == null : this.getRentpriceOvertime().equals(other.getRentpriceOvertime()))
            && (this.getRentpriceStatus() == null ? other.getRentpriceStatus() == null : this.getRentpriceStatus().equals(other.getRentpriceStatus()))
            && (this.getRentpriceCreatetime() == null ? other.getRentpriceCreatetime() == null : this.getRentpriceCreatetime().equals(other.getRentpriceCreatetime()))
            && (this.getRentpriceCreator() == null ? other.getRentpriceCreator() == null : this.getRentpriceCreator().equals(other.getRentpriceCreator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRentpriceId() == null) ? 0 : getRentpriceId().hashCode());
        result = prime * result + ((getWeddingdressId() == null) ? 0 : getWeddingdressId().hashCode());
        result = prime * result + ((getRentpriceDeposit() == null) ? 0 : getRentpriceDeposit().hashCode());
        result = prime * result + ((getRentpriceDailym() == null) ? 0 : getRentpriceDailym().hashCode());
        result = prime * result + ((getRentpriceOvertime() == null) ? 0 : getRentpriceOvertime().hashCode());
        result = prime * result + ((getRentpriceStatus() == null) ? 0 : getRentpriceStatus().hashCode());
        result = prime * result + ((getRentpriceCreatetime() == null) ? 0 : getRentpriceCreatetime().hashCode());
        result = prime * result + ((getRentpriceCreator() == null) ? 0 : getRentpriceCreator().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rentpriceId=").append(rentpriceId);
        sb.append(", weddingdressId=").append(weddingdressId);
        sb.append(", rentpriceDeposit=").append(rentpriceDeposit);
        sb.append(", rentpriceDailym=").append(rentpriceDailym);
        sb.append(", rentpriceOvertime=").append(rentpriceOvertime);
        sb.append(", rentpriceStatus=").append(rentpriceStatus);
        sb.append(", rentpriceCreatetime=").append(rentpriceCreatetime);
        sb.append(", rentpriceCreator=").append(rentpriceCreator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}