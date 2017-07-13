package com.example.dpo.buffetutn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    EditText nombre;
    EditText apellido;
    EditText dni;
    EditText mail;
    EditText contraseña;
    EditText confirmarContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        dni = (EditText) findViewById(R.id.dni);
        mail = (EditText) findViewById(R.id.mail);
        contraseña = (EditText) findViewById(R.id.contraseña);
        confirmarContraseña = (EditText) findViewById(R.id.confirmacionContraseña);

        nombre.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                              if(nombre.getText().toString().trim().equals("")){
                                  nombre.setError( getResources().getString(R.string.required_field_error_msg));
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

        apellido.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if(apellido.getText().toString().trim().equals("")){
                    apellido.setError( getResources().getString(R.string.required_field_error_msg));
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

        dni.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if(dni.getText().toString().trim().equals("")){
                    dni.setError( getResources().getString(R.string.required_field_error_msg));
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

        mail.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if (!isValidMail(s)) {
                    mail.setError(getResources().getString(R.string.log_in_invalid_mail_msg));
                }

                if(mail.getText().toString().trim().equals("")){
                    mail.setError( getResources().getString(R.string.required_field_error_msg));
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

                contraseña.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if(contraseña.getText().toString().trim().equals("")){
                    contraseña.setError( getResources().getString(R.string.required_field_error_msg));
                }

                if(contraseña.getText().toString().trim().equals(confirmarContraseña.getText().toString().trim())){
                    contraseña.setError( getResources().getString(R.string.required_field_error_msg));
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

        confirmarContraseña.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if(confirmarContraseña.getText().toString().trim().equals("")){
                    contraseña.setError( getResources().getString(R.string.required_field_error_msg));
                }

                if(confirmarContraseña.getText().toString().trim().equals(contraseña.getText().toString().trim())){
                    confirmarContraseña.setError( getResources().getString(R.string.invalid_password_msg));
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });


    }

    public final static boolean isValidMail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

}
