
package com.siscompal.clarorecarga.retrofit.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestSignup {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("iden")
    @Expose
    private String iden;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("cel")
    @Expose
    private String cel;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestSignup() {
    }

    /**
     * 
     * @param username
     * @param dir
     * @param email
     * @param cel
     * @param name
     * @param lastname
     * @param password
     * @param iden
     * @param city
     */
    public RequestSignup(String name, String lastname, String iden, String email, String username, String password, String city, String dir, String cel) {
        super();
        this.name = name;
        this.lastname = lastname;
        this.iden = iden;
        this.email = email;
        this.username = username;
        this.password = password;
        this.city = city;
        this.dir = dir;
        this.cel = cel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

}
