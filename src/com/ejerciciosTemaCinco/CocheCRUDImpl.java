package com.ejerciciosTemaCinco;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(CocheCRUD cocheCRUD) {
        System.out.println("Coche Guardado");
    }

    @Override
    public List<CocheCRUD> findAll() {
        System.out.println("Lista de todos los elementos");
        return null;
    }

    @Override
    public void delete(CocheCRUD CocheCRUD) {
        System.out.println("Coche Eliminado");
    }
}
