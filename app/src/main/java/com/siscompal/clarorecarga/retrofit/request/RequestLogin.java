
package com.siscompal.clarorecarga.retrofit.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestLogin {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("gettoken")
    @Expose
    private Boolean gettoken;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestLogin() {
    }

    @Override
    public String toString() {
        return "RequestLogin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gettoken=" + gettoken +
                '}';
    }

    /**
     * 
     * @param username
     * @param password
     * @param gettoken
     */
    public RequestLogin(String username, String password, Boolean gettoken) {
        super();
        this.username = username;
        this.password = password;
        this.gettoken = gettoken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getGettoken() {
        return gettoken;
    }

    public void setGettoken(Boolean gettoken) {
        this.gettoken = gettoken;
    }

}
