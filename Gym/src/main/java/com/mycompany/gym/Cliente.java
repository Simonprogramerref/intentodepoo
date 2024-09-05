package com.mycompany.gym;

public class Cliente extends Persona {
    private String coach;
    private int presupuesto;
    private Gustos gustos;

    public enum Gustos {
        Cardio,
        MasaMuscular,
        Volumen,
        Definicion,
        Calistenia
    }

    public Cliente(String coach, String nombre, float altura, float peso, double edad, Gustos gustos, int presupuesto) {
        super(nombre, altura, peso, edad);
        this.coach = coach;
        this.gustos = gustos;
        this.presupuesto = presupuesto;
    }

    public String getCoach() {
        return coach;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public Gustos getGustos() {
        return gustos;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setGustos(Gustos gustos) {
        this.gustos = gustos;
    }
}