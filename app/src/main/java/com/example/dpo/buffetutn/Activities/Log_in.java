package com.example.dpo.buffetutn.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.text.TextUtils;

import com.example.dpo.buffetutn.BtnIngresarListener;
import com.example.dpo.buffetutn.Controladores.ControladorLog_in;
import com.example.dpo.buffetutn.R;
import com.example.dpo.buffetutn.Vistas.VistaLog_in;

public class Log_in extends AppCompatActivity {
    // EditText mail;
    //  EditText contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        VistaLog_in v = new VistaLog_in(this);
        ControladorLog_in c = new ControladorLog_in(this, v);
        v.setControlador(c);

    }
}
