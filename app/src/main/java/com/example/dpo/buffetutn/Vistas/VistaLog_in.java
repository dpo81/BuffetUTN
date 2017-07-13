package com.example.dpo.buffetutn.Vistas;

/**
 * Created by DPO on 13/7/2017.
 */

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dpo.buffetutn.Controladores.ControladorLog_in;
import com.example.dpo.buffetutn.R;

public class VistaLog_in {
    Button btnIngresar;
    ControladorLog_in c;
    EditText mail;
    EditText contraseña;

    public VistaLog_in(Activity a) {

        btnIngresar = (Button) a.findViewById(R.id.btnIngresar);
        mail = (EditText) a.findViewById(R.id.mail);
        contraseña = (EditText) a.findViewById(R.id.contraseña);
    }

    public void setControlador(ControladorLog_in controlador) {
        this.c = controlador;
        btnIngresar.setOnClickListener(c.getL());
    }

    public String getMail() {
        return mail.getText().toString();
    }

    public String getContraseña() {
        return contraseña.getText().toString();
    }
}
