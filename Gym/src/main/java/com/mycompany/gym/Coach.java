package com.mycompany.gym;


public class Coach extends Persona {
    public String especialidad;
    public int precio = 10;

    private void elif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public enum Especialidad {
        Cardio,
        MasaMuscular,
        Volumen,
        Definición,
        Calistenia;
    }
   
    public Coach(String nombre, float altura, float edad, String especialidad){
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.especialidad = especialidad;
    }
    
    public int calcularPrecios (double edad, double altura, double peso, String nombre, int precio)
    {
        if (nombre.equals("Jorge"))
        {
            precio = 20;
            
        elif (edad >= 15);
            precio = 20 + 40;
            
        elif (precio = 80);
        
        }
        if (edad < 20){
            precio = 100;}
        else 
                {
                    precio = 200;
                   
                }
        
        return precio;
    
 }
    
    public void Rutina(String nombre, String especialidad){
        if (especialidad.equals("Cardio")){
            System.out.print("Hola, yo soy" + nombre + "y mi especialidad es" + especialidad + "y me gusta salir a trotar");
        }
        
        if (especialidad.equals("MasaMuscular")){
            System.out.print("Hola, yo soy" + nombre + "y mi especialidad es" + especialidad + "y me gusta entrenar pesado y al fallo");
            }
        if (especialidad.equals("Volumen")){
            System.out.print("Hola, yo soy" + nombre + "y mi especialidad es" + especialidad + "y me gusta comer mucho y aumentar de peso");
        }
        
}
    
}
