package com.mycompany.gym;

public class Coach extends Persona {
    private Especialidad especialidad;
    private int precio = 10;

    public enum Especialidad {
        Cardio,
        MasaMuscular,
        Volumen,
        Definicion,
        Calistenia
    }

    public Coach(String nombre, float altura, float peso, double edad, Especialidad especialidad) {
        super(nombre, altura, peso, edad);
        this.especialidad = especialidad;
    }

    public int calcularPrecios(double edad, String nombre) {
        int precioCalculado = this.precio;
        if (nombre.equals("Jorge")) {
            precioCalculado = 20;
        } else if (edad >= 15) {
            precioCalculado = 60;
        } else {
            precioCalculado = 80;
        }

        if (edad < 20) {
            precioCalculado = 100;
        } else {
            precioCalculado = 200;
        }

        return precioCalculado;
    }

    public void rutina() {
        String mensaje = String.format("Hola, yo soy %s y mi especialidad es %s y me gusta ", this.nombre, this.especialidad);

        switch (this.especialidad) {
            case Cardio:
                mensaje += "salir a trotar";
                break;
            case MasaMuscular:
                mensaje += "entrenar pesado y al fallo";
                break;
            case Volumen:
                mensaje += "comer mucho y aumentar de peso";
                break;
            default:
                mensaje += "entrenar";
                break;
        }

        System.out.println(mensaje);
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}