package com.ligabetplay.model;

import java.util.HashMap;

public class UserStore implements DataManager {
    private HashMap<Integer, Usuario> usuarios;

    public UserStore() {
        this.usuarios = new HashMap<>();
    }

    @Override
    public void agregar(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    @Override
    public void modificar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public void eliminar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public void buscar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public void agregar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

 

    
}
