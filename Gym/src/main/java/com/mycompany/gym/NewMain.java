package com.mycompany.gym;

public class NewMain {
    public static void main(String[] args) {
        Coach coach1 = new Coach("José", 1.80f, 80f, 35, Coach.Especialidad.Cardio);
        Cliente cliente1 = new Cliente("José", "Juan", 1.75f, 70f, 25, Cliente.Gustos.Cardio, 1000);
        
        coach1.rutina();
        cliente1.decirNombre();
        
        System.out.println("El IMC del cliente es: " + cliente1.getImc());
        System.out.println("La especialidad del coach es: " + coach1.getEspecialidad());
    }
}