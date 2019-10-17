package com.gpd.wdr.entity;

import java.io.Serializable;

/**
 * store
 * @author 
 */
public class Store implements Serializable {
    private Integer storeId;

    private String storeName;

    private String storeSite;

    private String storeTel;

    private String storeOpeninghours;

    private String storeStatus;

    private static final long serialVersionUID = 1L;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreSite() {
        return storeSite;
    }

    public void setStoreSite(String storeSite) {
        this.storeSite = storeSite;
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel;
    }

    public String getStoreOpeninghours() {
        return storeOpeninghours;
    }

    public void setStoreOpeninghours(String storeOpeninghours) {
        this.storeOpeninghours = storeOpeninghours;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
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
        Store other = (Store) that;
        return (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getStoreSite() == null ? other.getStoreSite() == null : this.getStoreSite().equals(other.getStoreSite()))
            && (this.getStoreTel() == null ? other.getStoreTel() == null : this.getStoreTel().equals(other.getStoreTel()))
            && (this.getStoreOpeninghours() == null ? other.getStoreOpeninghours() == null : this.getStoreOpeninghours().equals(other.getStoreOpeninghours()))
            && (this.getStoreStatus() == null ? other.getStoreStatus() == null : this.getStoreStatus().equals(other.getStoreStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreSite() == null) ? 0 : getStoreSite().hashCode());
        result = prime * result + ((getStoreTel() == null) ? 0 : getStoreTel().hashCode());
        result = prime * result + ((getStoreOpeninghours() == null) ? 0 : getStoreOpeninghours().hashCode());
        result = prime * result + ((getStoreStatus() == null) ? 0 : getStoreStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeId=").append(storeId);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeSite=").append(storeSite);
        sb.append(", storeTel=").append(storeTel);
        sb.append(", storeOpeninghours=").append(storeOpeninghours);
        sb.append(", storeStatus=").append(storeStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}