package com.mycompany.gym;

public class Persona {
    protected String nombre;
    protected double edad;
    float altura;
    float peso;
    public float imc;
    
    public void decirNombre(){
        System.out.println(nombre);
    }
    
    public float calcularIMC(float altura, float peso){
        imc = peso / altura;
        return imc;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
    
}
