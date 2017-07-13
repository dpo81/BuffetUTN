package com.example.dpo.buffetutn;

import android.util.Log;
import android.view.View;

/**
 * Created by DPO on 13/7/2017.
 */

import android.app.Activity;
import android.widget.EditText;

import com.example.dpo.buffetutn.Controladores.ControladorLog_in;

public class BtnIngresarListener implements View.OnClickListener {
    ControladorLog_in controlador;

    public void setControlador(ControladorLog_in c) {
        this.controlador = c;
    }

    @Override
    public void onClick(View v) {
      controlador.ingresar();
    }
}