package com.example.dpo.buffetutn;

/**
 * Created by DPO on 12/7/2017.
 */

import java.util.Set;

public class PedidoUsuario {
    Usuario usuario;
    Set<Producto> pedido;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Producto> getPedido() {
        return pedido;
    }

    public void setPedido(Set<Producto> pedido) {
        this.pedido = pedido;
    }

    public PedidoUsuario(Usuario usuario, Set<Producto> pedido) {
        this.usuario = usuario;
        this.pedido = pedido;
    }

}
