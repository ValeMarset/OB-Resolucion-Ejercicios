package com.ejerciciosTemaCinco;

import java.util.List;

public interface CocheCRUD {

    public void save (CocheCRUD cocheCRUD);

    public List<CocheCRUD> findAll();

    public void delete (CocheCRUD CocheCRUD);

}
