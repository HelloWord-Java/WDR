package com.gpd.wdr.entity;

import java.io.Serializable;

/**
 * model
 * @author 
 */
public class Model implements Serializable {
    private Integer modelId;

    private String modelName;

    private String modelRetailer;

    private static final long serialVersionUID = 1L;

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelRetailer() {
        return modelRetailer;
    }

    public void setModelRetailer(String modelRetailer) {
        this.modelRetailer = modelRetailer;
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
        Model other = (Model) that;
        return (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getModelName() == null ? other.getModelName() == null : this.getModelName().equals(other.getModelName()))
            && (this.getModelRetailer() == null ? other.getModelRetailer() == null : this.getModelRetailer().equals(other.getModelRetailer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getModelName() == null) ? 0 : getModelName().hashCode());
        result = prime * result + ((getModelRetailer() == null) ? 0 : getModelRetailer().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelId=").append(modelId);
        sb.append(", modelName=").append(modelName);
        sb.append(", modelRetailer=").append(modelRetailer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}