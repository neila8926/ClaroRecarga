package com.siscompal.clarorecarga.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.siscompal.clarorecarga.R;
import com.siscompal.clarorecarga.common.Constantes;
import com.siscompal.clarorecarga.common.SharedPreferencesManager;
import com.siscompal.clarorecarga.retrofit.ClaroRecargaClient;
import com.siscompal.clarorecarga.retrofit.RecargasClaroService;
import com.siscompal.clarorecarga.retrofit.request.RequestLogin;
import com.siscompal.clarorecarga.retrofit.response.ResponseAuth;
import com.siscompal.clarorecarga.ui.DashboardActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;
    TextView txtRegistro;
    EditText etUsuario, etPassword;
    ClaroRecargaClient claroRecargaClient;
    RecargasClaroService recargasClaroService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //quitar toolbar

        getSupportActionBar().hide();

        retrofitInit();
        findViews();
        events();


    }

    private void retrofitInit() {
        claroRecargaClient = ClaroRecargaClient.getInstance();
        recargasClaroService = claroRecargaClient.getRecargasClaroService();
    }

    private void findViews() {
        btnLogin = findViewById(R.id.buttonLogin);
        txtRegistro=findViewById(R.id.textViewregistro);
        etUsuario = findViewById(R.id.editTextUsuario);
        etPassword = findViewById(R.id.editTextPassword);
    }

    private void events() {
        btnLogin.setOnClickListener(this);
        txtRegistro.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.buttonLogin:
                goToLogin();
                break;
            case R.id.textViewregistro:
                goToRegistro();
                break;
        }

    }




    private void goToLogin() {
        String usuario = etUsuario.getText().toString();
        String password = etPassword.getText().toString();
        Boolean token=true;

        if(usuario.isEmpty()) {
            etUsuario.setError("El usuario es requerido");

        } else if(password.isEmpty()) {
            etPassword.setError("La contraseña es requerida");
        } else {

            RequestLogin requestLogin = new RequestLogin(usuario, password, true);
            Toast.makeText(this, "fdhjgjhghghjghjdf "+requestLogin.toString(), Toast.LENGTH_SHORT).show();

            Call<ResponseAuth> call = recargasClaroService.doLogin(requestLogin);

            Toast.makeText(this, "fdaaadfgjhghggjhjhghjghjjhjh "+call.request(), Toast.LENGTH_SHORT).show();


            call.enqueue(new Callback<ResponseAuth>() {
                @Override
                public void onResponse(Call<ResponseAuth> call, Response<ResponseAuth> response) {
                    if (response.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "Sesion iniciada correctamente ", Toast.LENGTH_SHORT).show();

                        SharedPreferencesManager.setSomeStringValue(Constantes.PREF_TOKEN, response.body().getToken());
                        //SharedPreferencesManager.setSomeStringValue(Constantes.PREF_EMAIL, response.body().getUsuarioLoqueado().getEmail());


                        Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                           startActivity(i);
                           // Destruimos este Activiy para que no se pueda volver.
                           finish();

                    } else {
                        Toast.makeText(MainActivity.this, "Algo fue mal, revise sus datos de acceso " , Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<ResponseAuth> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Problemas de conexion. Intentelo de nuevo", Toast.LENGTH_SHORT).show();
                }
            });

        }}

    private void goToRegistro() {

        Intent i = new Intent(MainActivity.this, SipnUpActivity.class);
        startActivity(i);
    }
}

