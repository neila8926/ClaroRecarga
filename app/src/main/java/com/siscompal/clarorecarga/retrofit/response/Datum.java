package com.siscompal.clarorecarga.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

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
    @SerializedName("precio")
    @Expose
    private Integer precio;
    @SerializedName("codigo")
    @Expose
    private Integer codigo;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("incentivo")
    @Expose
    private Integer incentivo;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("__v")
    @Expose
    private Integer v;

    /**
     * No args constructor for use in serialization
     *
     */
    public Datum() {
    }

    /**
     *
     * @param codigo
     * @param id
     * @param v
     * @param precio
     * @param fecCre
     * @param status
     * @param fecUpd
     * @param tipo
     * @param name
     * @param descripcion
     * @param incentivo
     * @param user
     */
    public Datum(String fecCre, String fecUpd, String id, String name, Integer precio, Integer codigo, Boolean status, String tipo, String user, Integer incentivo, String descripcion, Integer v) {
        super();
        this.fecCre = fecCre;
        this.fecUpd = fecUpd;
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.codigo = codigo;
        this.status = status;
        this.tipo = tipo;
        this.user = user;
        this.incentivo = incentivo;
        this.descripcion = descripcion;
        this.v = v;
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

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(Integer incentivo) {
        this.incentivo = incentivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}