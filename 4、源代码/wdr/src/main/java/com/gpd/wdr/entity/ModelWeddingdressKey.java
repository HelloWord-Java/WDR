package com.gpd.wdr.entity;

import java.io.Serializable;

/**
 * model_weddingdress
 * @author 
 */
public class ModelWeddingdressKey implements Serializable {
    private Integer modelId;

    private Integer weddingdressId;

    private static final long serialVersionUID = 1L;

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
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
        ModelWeddingdressKey other = (ModelWeddingdressKey) that;
        return (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getWeddingdressId() == null ? other.getWeddingdressId() == null : this.getWeddingdressId().equals(other.getWeddingdressId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getWeddingdressId() == null) ? 0 : getWeddingdressId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelId=").append(modelId);
        sb.append(", weddingdressId=").append(weddingdressId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}