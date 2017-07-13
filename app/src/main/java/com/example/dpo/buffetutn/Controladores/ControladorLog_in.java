package com.example.dpo.buffetutn.Controladores;

/**
 * Created by DPO on 13/7/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import com.example.dpo.buffetutn.BtnIngresarListener;
import com.example.dpo.buffetutn.Menu;
import com.example.dpo.buffetutn.Vistas.VistaLog_in;

import static android.R.attr.start;

public class ControladorLog_in {
    BtnIngresarListener l;
    Handler h;
    VistaLog_in v;
    Activity a;

    public ControladorLog_in(Activity a, VistaLog_in v) {
        l = new BtnIngresarListener();
        l.setControlador(this);
        this.v = v;
        this.a = a;


/*
        mail = (EditText)findViewById(R.id.mail);
        contraseña = (EditText)findViewById(R.id.contraseña);

        mail.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if (!isValidMail(s))
                {
                    mail.setError( getResources().getString(R.string.log_in_invalid_mail_msg));
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
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });
        */

    }

    public BtnIngresarListener getL() {
        return l;
    }

    public void ingresar() {
        if (v.getMail().equals("a@a.com") && v.getContraseña().equals("1")) {
            //Log.d("login","login exitoso"); ;
            Intent i = new Intent(this.a, Menu.class);
            a.startActivity(i);


        } else {
            Log.d("login", "login fallido");
        }
    }





/*
    public final static boolean isValidMail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
    */

}
