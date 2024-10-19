package com.mycompany.mavenproject2;

public class Empleados extends Personas {
    private int id;
    private int salario;

    public Empleados(String nombre, String apellido, int cui, int id, int salario) {
        super(nombre, apellido, cui);
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public int getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}

