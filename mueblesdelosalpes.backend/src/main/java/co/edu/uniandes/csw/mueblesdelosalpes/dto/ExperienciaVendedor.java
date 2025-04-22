package co.edu.uniandes.csw.mueblesdelosalpes.dto;

import java.io.Serializable;

public class ExperienciaVendedor implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nombreEmpresa; // corregido el nombre
    private String cargo;
    private String descripcion;
    private int ano;

    public ExperienciaVendedor() {}

    public ExperienciaVendedor(long id, String nombreEmpresa, String cargo, String descripcion, int ano) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
