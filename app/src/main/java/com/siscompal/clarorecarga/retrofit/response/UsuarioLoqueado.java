
package com.siscompal.clarorecarga.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsuarioLoqueado {

    @SerializedName("efecty")
    @Expose
    private Boolean efecty;
    @SerializedName("fec_cre")
    @Expose
    private String fecCre;
    @SerializedName("fec_upd")
    @Expose
    private String fecUpd;
    @SerializedName("_id")
    @Expose
    private String id;
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
    private Integer cel;
    @SerializedName("porcentaje")
    @Expose
    private Integer porcentaje;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("user")
    @Expose
    private Object user;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("saldo_actual")
    @Expose
    private Integer saldoActual;
    @SerializedName("comision_actual")
    @Expose
    private Integer comisionActual;
    @SerializedName("incentivo_actual")
    @Expose
    private Integer incentivoActual;
    @SerializedName("efectyId")
    @Expose
    private String efectyId;
    @SerializedName("__v")
    @Expose
    private Integer v;

    /**
     * No args constructor for use in serialization
     *
     */
    public UsuarioLoqueado() {
    }

    /**
     *
     * @param efecty
     * @param fecCre
     * @param status
     * @param fecUpd
     * @param lastname
     * @param incentivoActual
     * @param comisionActual
     * @param iden
     * @param password
     * @param city
     * @param porcentaje
     * @param id
     * @param v
     * @param saldoActual
     * @param username
     * @param email
     * @param dir
     * @param cel
     * @param name
     * @param role
     * @param user
     * @param efectyId
     */
    public UsuarioLoqueado(Boolean efecty, String fecCre, String fecUpd, String id, String name, String lastname, String iden, String email, String username, String password, String city, String dir, Integer cel, Integer porcentaje, Boolean status, Object user, String role, Integer saldoActual, Integer comisionActual, Integer incentivoActual, String efectyId, Integer v) {
        super();
        this.efecty = efecty;
        this.fecCre = fecCre;
        this.fecUpd = fecUpd;
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.iden = iden;
        this.email = email;
        this.username = username;
        this.password = password;
        this.city = city;
        this.dir = dir;
        this.cel = cel;
        this.porcentaje = porcentaje;
        this.status = status;
        this.user = user;
        this.role = role;
        this.saldoActual = saldoActual;
        this.comisionActual = comisionActual;
        this.incentivoActual = incentivoActual;
        this.efectyId = efectyId;
        this.v = v;
    }

    public Boolean getEfecty() {
        return efecty;
    }

    public void setEfecty(Boolean efecty) {
        this.efecty = efecty;
    }

    public String getFecCre() {
        return fecCre;
    }

    public void setFecCre(String fecCre) {
        this.fecCre = fecCre;
    }

    public String getFecUpd() {
        return fecUpd;
    }

    public void setFecUpd(String fecUpd) {
        this.fecUpd = fecUpd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getCel() {
        return cel;
    }

    public void setCel(Integer cel) {
        this.cel = cel;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Integer saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Integer getComisionActual() {
        return comisionActual;
    }

    public void setComisionActual(Integer comisionActual) {
        this.comisionActual = comisionActual;
    }

    public Integer getIncentivoActual() {
        return incentivoActual;
    }

    public void setIncentivoActual(Integer incentivoActual) {
        this.incentivoActual = incentivoActual;
    }

    public String getEfectyId() {
        return efectyId;
    }

    public void setEfectyId(String efectyId) {
        this.efectyId = efectyId;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}
