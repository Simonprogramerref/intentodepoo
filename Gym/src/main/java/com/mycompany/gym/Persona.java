package com.mycompany.gym;

public class Persona {
    protected String nombre;
    protected double edad;
    protected float altura;
    protected float peso;
    protected float imc;

    public Persona(String nombre, float altura, float peso, double edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.imc = calcularIMC();
    }

    public void decirNombre() {
        System.out.println("Mi nombre es " + nombre);
    }

    public float calcularIMC() {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero");
        }
        imc = peso / (altura * altura);
        return imc;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getImc() {
        return imc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
        this.imc = calcularIMC();
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.imc = calcularIMC();
    }
}