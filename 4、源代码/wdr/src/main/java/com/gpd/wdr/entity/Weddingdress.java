package com.gpd.wdr.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * weddingdress
 * @author 
 */
public class Weddingdress implements Serializable {
    private Integer weddingdressId;

    /**
     * 婚纱名称
     */
    private String weddingdressName;

    /**
     * 婚纱颜色
     */
    private String weddingdressColor;

    /**
     * 上市年份
     */
    private Date weddingdressTtm;

    /**
     * 尺码
     */
    private String weddingdressSize;

    /**
     * 面料名称
     */
    private String weddingdressFabricname;

    /**
     * 产地
     */
    private String weddingdressOrigin;

    /**
     * 建议零售价
     */
    private String weddingdressPrice;

    /**
     * 主面料成分
     */
    private String weddingdressIngredient;

    /**
     * 已售数量
     */
    private Integer weddingdressNum;

    /**
     * 押金
     */
    private Double weddingdressDeposit;

    /**
     * 日租金
     */
    private Double weddingdressDailym;

    /**
     * 超时租金
     */
    private Double weddingdressOvertime;

    private static final long serialVersionUID = 1L;

    public Integer getWeddingdressId() {
        return weddingdressId;
    }

    public void setWeddingdressId(Integer weddingdressId) {
        this.weddingdressId = weddingdressId;
    }

    public String getWeddingdressName() {
        return weddingdressName;
    }

    public void setWeddingdressName(String weddingdressName) {
        this.weddingdressName = weddingdressName;
    }

    public String getWeddingdressColor() {
        return weddingdressColor;
    }

    public void setWeddingdressColor(String weddingdressColor) {
        this.weddingdressColor = weddingdressColor;
    }

    public Date getWeddingdressTtm() {
        return weddingdressTtm;
    }

    public void setWeddingdressTtm(Date weddingdressTtm) {
        this.weddingdressTtm = weddingdressTtm;
    }

    public String getWeddingdressSize() {
        return weddingdressSize;
    }

    public void setWeddingdressSize(String weddingdressSize) {
        this.weddingdressSize = weddingdressSize;
    }

    public String getWeddingdressFabricname() {
        return weddingdressFabricname;
    }

    public void setWeddingdressFabricname(String weddingdressFabricname) {
        this.weddingdressFabricname = weddingdressFabricname;
    }

    public String getWeddingdressOrigin() {
        return weddingdressOrigin;
    }

    public void setWeddingdressOrigin(String weddingdressOrigin) {
        this.weddingdressOrigin = weddingdressOrigin;
    }

    public String getWeddingdressPrice() {
        return weddingdressPrice;
    }

    public void setWeddingdressPrice(String weddingdressPrice) {
        this.weddingdressPrice = weddingdressPrice;
    }

    public String getWeddingdressIngredient() {
        return weddingdressIngredient;
    }

    public void setWeddingdressIngredient(String weddingdressIngredient) {
        this.weddingdressIngredient = weddingdressIngredient;
    }

    public Integer getWeddingdressNum() {
        return weddingdressNum;
    }

    public void setWeddingdressNum(Integer weddingdressNum) {
        this.weddingdressNum = weddingdressNum;
    }

    public Double getWeddingdressDeposit() {
        return weddingdressDeposit;
    }

    public void setWeddingdressDeposit(Double weddingdressDeposit) {
        this.weddingdressDeposit = weddingdressDeposit;
    }

    public Double getWeddingdressDailym() {
        return weddingdressDailym;
    }

    public void setWeddingdressDailym(Double weddingdressDailym) {
        this.weddingdressDailym = weddingdressDailym;
    }

    public Double getWeddingdressOvertime() {
        return weddingdressOvertime;
    }

    public void setWeddingdressOvertime(Double weddingdressOvertime) {
        this.weddingdressOvertime = weddingdressOvertime;
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
        Weddingdress other = (Weddingdress) that;
        return (this.getWeddingdressId() == null ? other.getWeddingdressId() == null : this.getWeddingdressId().equals(other.getWeddingdressId()))
            && (this.getWeddingdressName() == null ? other.getWeddingdressName() == null : this.getWeddingdressName().equals(other.getWeddingdressName()))
            && (this.getWeddingdressColor() == null ? other.getWeddingdressColor() == null : this.getWeddingdressColor().equals(other.getWeddingdressColor()))
            && (this.getWeddingdressTtm() == null ? other.getWeddingdressTtm() == null : this.getWeddingdressTtm().equals(other.getWeddingdressTtm()))
            && (this.getWeddingdressSize() == null ? other.getWeddingdressSize() == null : this.getWeddingdressSize().equals(other.getWeddingdressSize()))
            && (this.getWeddingdressFabricname() == null ? other.getWeddingdressFabricname() == null : this.getWeddingdressFabricname().equals(other.getWeddingdressFabricname()))
            && (this.getWeddingdressOrigin() == null ? other.getWeddingdressOrigin() == null : this.getWeddingdressOrigin().equals(other.getWeddingdressOrigin()))
            && (this.getWeddingdressPrice() == null ? other.getWeddingdressPrice() == null : this.getWeddingdressPrice().equals(other.getWeddingdressPrice()))
            && (this.getWeddingdressIngredient() == null ? other.getWeddingdressIngredient() == null : this.getWeddingdressIngredient().equals(other.getWeddingdressIngredient()))
            && (this.getWeddingdressNum() == null ? other.getWeddingdressNum() == null : this.getWeddingdressNum().equals(other.getWeddingdressNum()))
            && (this.getWeddingdressDeposit() == null ? other.getWeddingdressDeposit() == null : this.getWeddingdressDeposit().equals(other.getWeddingdressDeposit()))
            && (this.getWeddingdressDailym() == null ? other.getWeddingdressDailym() == null : this.getWeddingdressDailym().equals(other.getWeddingdressDailym()))
            && (this.getWeddingdressOvertime() == null ? other.getWeddingdressOvertime() == null : this.getWeddingdressOvertime().equals(other.getWeddingdressOvertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWeddingdressId() == null) ? 0 : getWeddingdressId().hashCode());
        result = prime * result + ((getWeddingdressName() == null) ? 0 : getWeddingdressName().hashCode());
        result = prime * result + ((getWeddingdressColor() == null) ? 0 : getWeddingdressColor().hashCode());
        result = prime * result + ((getWeddingdressTtm() == null) ? 0 : getWeddingdressTtm().hashCode());
        result = prime * result + ((getWeddingdressSize() == null) ? 0 : getWeddingdressSize().hashCode());
        result = prime * result + ((getWeddingdressFabricname() == null) ? 0 : getWeddingdressFabricname().hashCode());
        result = prime * result + ((getWeddingdressOrigin() == null) ? 0 : getWeddingdressOrigin().hashCode());
        result = prime * result + ((getWeddingdressPrice() == null) ? 0 : getWeddingdressPrice().hashCode());
        result = prime * result + ((getWeddingdressIngredient() == null) ? 0 : getWeddingdressIngredient().hashCode());
        result = prime * result + ((getWeddingdressNum() == null) ? 0 : getWeddingdressNum().hashCode());
        result = prime * result + ((getWeddingdressDeposit() == null) ? 0 : getWeddingdressDeposit().hashCode());
        result = prime * result + ((getWeddingdressDailym() == null) ? 0 : getWeddingdressDailym().hashCode());
        result = prime * result + ((getWeddingdressOvertime() == null) ? 0 : getWeddingdressOvertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", weddingdressId=").append(weddingdressId);
        sb.append(", weddingdressName=").append(weddingdressName);
        sb.append(", weddingdressColor=").append(weddingdressColor);
        sb.append(", weddingdressTtm=").append(weddingdressTtm);
        sb.append(", weddingdressSize=").append(weddingdressSize);
        sb.append(", weddingdressFabricname=").append(weddingdressFabricname);
        sb.append(", weddingdressOrigin=").append(weddingdressOrigin);
        sb.append(", weddingdressPrice=").append(weddingdressPrice);
        sb.append(", weddingdressIngredient=").append(weddingdressIngredient);
        sb.append(", weddingdressNum=").append(weddingdressNum);
        sb.append(", weddingdressDeposit=").append(weddingdressDeposit);
        sb.append(", weddingdressDailym=").append(weddingdressDailym);
        sb.append(", weddingdressOvertime=").append(weddingdressOvertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}