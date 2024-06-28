package com.ligabetplay.model;

import java.util.HashMap;

public interface UserManager extends DataManager<Usuario>{

    @Override
    default void agregar(HashMap<Integer,Usuario> usuarios,Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    @Override
    default void buscar(Usuario entidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    default void eliminar(Usuario entidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    default void listar(Usuario entidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    default void modificar(HashMap<Integer,Usuario> usuarios, int idUsuario) {
        //...
    }
    
}
