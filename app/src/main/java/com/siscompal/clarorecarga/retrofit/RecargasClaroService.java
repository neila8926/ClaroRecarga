package com.siscompal.clarorecarga.retrofit;

import com.siscompal.clarorecarga.retrofit.request.RequestLogin;
import com.siscompal.clarorecarga.retrofit.request.RequestSignup;
import com.siscompal.clarorecarga.retrofit.response.ResponseAuth;
import com.siscompal.clarorecarga.retrofit.response.UsuarioLoqueado;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RecargasClaroService {
    @POST("login")
    Call<ResponseAuth> doLogin(@Body RequestLogin requestLogin);

    @POST("register")
    Call<ResponseAuth> doSignUp(@Body RequestSignup requestSignup);


}