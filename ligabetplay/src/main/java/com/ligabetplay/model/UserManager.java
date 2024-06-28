package com.ligabetplay.model;

import java.util.HashMap;

public interface UserManager extends DataManager<Usuario>{

    @Override
    default void agregar(HashMap<Integer,Usuario> usuarios,Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    @Override
    default static void buscar(Usuario entidad) {
        // TODO Auto-generated method stub

    }

    @Override
    default void eliminar(HashMap<Integer,Usuario> usuarios, Usuario usuario) {
        usuarios.remove(usuario.getId());
    }

    @Override
    default void listar(HashMap<Integer,Usuario> usuarios) {
        
    }

    @Override
    default void modificar(HashMap<Integer,Usuario> usuarios, Usuario usuario) {
        usuarios.put(usuario.getId(),usuario);//ya se debe pasar el usuario actualizado; se pueden modificar los datos excepto el id entonces funciona!
    }
    
}
