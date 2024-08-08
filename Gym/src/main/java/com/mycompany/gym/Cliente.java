/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gym;

/**
 *
 * @author simon
 */
public class Cliente extends Persona{
    public String coach;
    public int presupuesto;
    public String gustos;
    
    
    
    public enum Gustos{
        Cardio,
        MasaMuscular,
        Volumen,
        Definición,
        Calistenia,
    }
    
    public Cliente(String coach, String nombre, float altura, float peso, int edad, String gustos){
        this.altura= altura;
        this.coach = coach;
        this.edad = edad;
        this.gustos = gustos;
        this.nombre = nombre;
    }

    public String getCoach() {
        return coach;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public String getGustos() {
        return gustos;
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

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setGustos(String gustos) {
        this.gustos = gustos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
    
    
    
    
}
