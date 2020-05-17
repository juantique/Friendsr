package com.example.prueba.datos;

import com.example.prueba.R;

public class DataImagenes {
    private String nombre;
    private int idDrawable;
    private String strNombreCompleto;
    private String strFechaNacimiento;

    public DataImagenes(String nombre, int idDrawable, String strNombreCompleto, String strFechaNacimiento) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
        this.strNombreCompleto = strNombreCompleto;
        this.strFechaNacimiento = strFechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public String getNombreCompleto() {
        return strNombreCompleto;
    }

    public String getFechaNacimiento() {
        return strFechaNacimiento;
    }

    public static DataImagenes[] ITEMS = {
            new DataImagenes("Chandler", R.drawable.jaguar_f_type_2015, "Jaguar F-Type 2015", "Abril 8, 1969, 10 am"),
            new DataImagenes("Jory", R.drawable.mercedes_benz_amg_gt, "Mercedes AMG-GT", "Enero 10, 1970, 12 pm"),
            new DataImagenes("Mónica", R.drawable.mazda_mx5_2015, "Mazda MX-5", "Febrero 15, 2019, 1 pm"),
            new DataImagenes("Phoebe", R.drawable.porsche_911_gts, "Porsche 911 GTS", "Marzo 30, 1983, 4 am"),
            new DataImagenes("Roche", R.drawable.bmw_serie6_cabrio_2015, "BMW Serie 6", "Mayo 13, 1994, 6 am"),
            new DataImagenes("Ralph", R.drawable.ford_mondeo, "Ford Mondeo","Junio 6, 2005, 11 pm"),
            new DataImagenes("Volvo", R.drawable.volvo_v60_crosscountry, "Volvo V60 Cross Country", "Julio 21, 2015, 7 pm"),
            new DataImagenes("Jaguar", R.drawable.jaguar_xe, "Jaguar XE", "Agosto 7, 1970, 3 pm"),
            new DataImagenes("VW", R.drawable.volkswagen_golf_r_variant_2015, "VW Golf R Variant", "Septiembre 27, 1987, 6 am"),
            new DataImagenes("Seat", R.drawable.seat_leon_st_cupra, "Seat León ST Cupra", "Octubre 29, 1994, 2 pm"),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Coche
     */
    public static DataImagenes getItem(int id) {
        for (DataImagenes item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
