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
import com.siscompal.clarorecarga.retrofit.ClaroRecargaClient;
import com.siscompal.clarorecarga.retrofit.RecargasClaroService;
import com.siscompal.clarorecarga.retrofit.request.RequestSignup;
import com.siscompal.clarorecarga.retrofit.response.ResponseAuth;
import com.siscompal.clarorecarga.ui.DashboardActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SipnUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRegistro;
    TextView tvGologin;
    EditText etnombre, etapellido, etidentificacion, etcorreo, etusuario, etpassword, etconfirmarpassword, etciudad, etdireccion, etcelular;
    ClaroRecargaClient claroRecargaClient;
    RecargasClaroService recargasClaroService;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sipn_up );

        getSupportActionBar().hide();

        retrofitInit();
        findViews();
        events();

    }

    private void retrofitInit() {
        claroRecargaClient=ClaroRecargaClient.getInstance();
        recargasClaroService=claroRecargaClient.getRecargasClaroService();


    }

    private void findViews() {
        btnRegistro=findViewById(R.id.buttonReg);
        tvGologin=findViewById(R.id.goToLogin);
        etnombre = findViewById(R.id.editTextnombre);
        etapellido=findViewById(R.id.editText2apelli);
        etidentificacion=findViewById(R.id.editText3ident);
        etcorreo=findViewById(R.id.editTextCorreo);
        etusuario=findViewById(R.id.editTextUsuario2);
        etpassword=findViewById(R.id.editTextPass);
        etconfirmarpassword=findViewById(R.id.editTextPass2);
        etciudad=findViewById(R.id.editTextCiudad);
        etdireccion=findViewById(R.id.editTextDirecc);
        etcelular=findViewById(R.id.editTextCelular);
    }

    private void events() {
        btnRegistro.setOnClickListener(this);
        tvGologin.setOnClickListener(this);


    }




    @Override
    public void onClick(View view) {

        int id= view.getId();
        switch (id){
            case R.id.buttonReg:
                    goToSingUp();

                break;
            case R.id.goToLogin:
                goToLoginn();
                break;



        }


    }

    private void goToSingUp() {
        String nombre= etnombre.getText().toString();
        String apellido=etapellido.getText().toString();
        String identi=etidentificacion.getText().toString();
        String correo=etcorreo.getText().toString();
        String usuario=etusuario.getText().toString();
        String pass1=etpassword.getText().toString();
        String pass2=etconfirmarpassword.getText().toString();
        String ciudad= etciudad.getText().toString();
        String direccion=etdireccion.getText().toString();
        String celular=etcelular.getText().toString();

        if(nombre.isEmpty()) {
            etnombre.setError("El Campo nombre es requerido");
        }else if(apellido.isEmpty()){
            etapellido.setError("El campo apellido es requerido");
        }else if(identi.isEmpty()){
            etidentificacion.setError("El Campo identidicación es Requerido");
        }else if(correo.isEmpty()){
            etcorreo.setError("El Campo Identificación es Requerido");
        }else if(celular.isEmpty()){
            etcelular.setError("El campo Celular Es Requerido");
        }else if(pass1.isEmpty() || pass1.length()<4){
            etpassword.setError("El Campo Contraseña es Requerido");
        }else if(pass2.isEmpty() || pass2.length()<4){
            etconfirmarpassword.setError("El Campo Confirmar Contraseña es Requerido y debe tener almenos 4 caracteres");
        }else if(pass1.equals(pass2)==false){
            etpassword.setError("Las Contraseñas no Coinciden");
        }else{

        RequestSignup requestSignup = new RequestSignup(nombre,apellido,identi,correo,usuario, pass1, ciudad,direccion, celular);
        Call<ResponseAuth> call = recargasClaroService.doSignUp(requestSignup);

        call.enqueue(new Callback<ResponseAuth>() {
            @Override
            public void onResponse(Call<ResponseAuth> call, Response<ResponseAuth> response) {
                if(response.isSuccessful()){





                    Intent intent = new Intent(SipnUpActivity.this, DashboardActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(SipnUpActivity.this, "Algo anda Mal, revise sus datos", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseAuth> call, Throwable t) {

                Toast.makeText(SipnUpActivity.this, "Error de Conexión, Intente nuevamente", Toast.LENGTH_SHORT).show();;

            }
        });
    }}


    private void goToLoginn() {

    Intent i = new Intent(SipnUpActivity.this, MainActivity.class);
    startActivity(i);
    finish();
    }
}



