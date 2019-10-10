
package com.siscompal.clarorecarga.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseAuth {

    @SerializedName("token")
    @Expose
    private String token;
   // @SerializedName("usuarioLoqueado")
    //@Expose
    //private UsuarioLoqueado usuarioLoqueado;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseAuth() {
    }

    /**
     *
     * @param token
     //* @param usuarioLoqueado
     */
    public ResponseAuth(String token) {
        super();
        this.token = token;
        //this.usuarioLoqueado = usuarioLoqueado;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

   // public UsuarioLoqueado getUsuarioLoqueado() {
    //    return usuarioLoqueado;
   // }

  //public void setUsuarioLoqueado(UsuarioLoqueado usuarioLoqueado) {
       // this.usuarioLoqueado = usuarioLoqueado;
   //}

}
