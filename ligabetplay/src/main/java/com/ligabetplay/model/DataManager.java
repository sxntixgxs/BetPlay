package com.ligabetplay.model;

import java.util.HashMap;

//Esta es la interface genérica sobre las que derivan las interfaces específicas para cada actor
//Para poderlo generalizar, usamos <T> para especificar que recibe algún objeto
public interface DataManager<T> {
    void agregar(HashMap<Integer,T> data,T entidad);
    void modificar(HashMap<Integer,T> data,T entidad);
    void eliminar(HashMap<Integer,T> data, T entidad);
    void listar(HashMap<Integer,T> data);
    void buscar(T entidad);
}
