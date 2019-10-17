package com.gpd.wdr.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 状态
     */
    private Integer userState;

    /**
     * 创建时间
     */
    private Date userCtime;

    /**
     * 修改时间
     */
    private Date userMtime;

    /**
     * 真实姓名
     */
    private String userRealName;

    /**
     * 性别
     */
    private Integer userSex;

    /**
     * 手机号
     */
    private String userTel;

    /**
     * 邮箱
     */
    private String userEMaill;

    /**
     * 身份证号
     */
    private String userIdNumber;

    private String userPost;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Date getUserCtime() {
        return userCtime;
    }

    public void setUserCtime(Date userCtime) {
        this.userCtime = userCtime;
    }

    public Date getUserMtime() {
        return userMtime;
    }

    public void setUserMtime(Date userMtime) {
        this.userMtime = userMtime;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEMaill() {
        return userEMaill;
    }

    public void setUserEMaill(String userEMaill) {
        this.userEMaill = userEMaill;
    }

    public String getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserState() == null ? other.getUserState() == null : this.getUserState().equals(other.getUserState()))
            && (this.getUserCtime() == null ? other.getUserCtime() == null : this.getUserCtime().equals(other.getUserCtime()))
            && (this.getUserMtime() == null ? other.getUserMtime() == null : this.getUserMtime().equals(other.getUserMtime()))
            && (this.getUserRealName() == null ? other.getUserRealName() == null : this.getUserRealName().equals(other.getUserRealName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserEMaill() == null ? other.getUserEMaill() == null : this.getUserEMaill().equals(other.getUserEMaill()))
            && (this.getUserIdNumber() == null ? other.getUserIdNumber() == null : this.getUserIdNumber().equals(other.getUserIdNumber()))
            && (this.getUserPost() == null ? other.getUserPost() == null : this.getUserPost().equals(other.getUserPost()));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserState() == null) ? 0 : getUserState().hashCode());
        result = prime * result + ((getUserCtime() == null) ? 0 : getUserCtime().hashCode());
        result = prime * result + ((getUserMtime() == null) ? 0 : getUserMtime().hashCode());
        result = prime * result + ((getUserRealName() == null) ? 0 : getUserRealName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserEMaill() == null) ? 0 : getUserEMaill().hashCode());
        result = prime * result + ((getUserIdNumber() == null) ? 0 : getUserIdNumber().hashCode());
        result = prime * result + ((getUserPost() == null) ? 0 : getUserPost().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userState=").append(userState);
        sb.append(", userCtime=").append(userCtime);
        sb.append(", userMtime=").append(userMtime);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userTel=").append(userTel);
        sb.append(", userEMaill=").append(userEMaill);
        sb.append(", userIdNumber=").append(userIdNumber);
        sb.append(", userPost=").append(userPost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}