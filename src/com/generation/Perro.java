package com.generation;

public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    public Perro(){
    }
    //Constructor: para inicializar un objeto. Se puede tener más de un constructor con el mismo nombre y solo se diferencia por el número y tipo de parámetros
    public Perro(String nombre){
        //este nombre hace referencia al atributo de la clase. Después del igual, nombre hace refrencia al parámetro
        this.nombre=nombre;
    }

    public Perro(String nombre, String raza, int edad, String tamanio){
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.tamanio=tamanio;
    }

    public void caracteristicas(){
        System.out.println("Hola, mi nombre es "+ this.nombre+ ", soy de raza "+this.raza+". Tengo "+ this.edad+" años. Soy de tamaño "+this.tamanio);
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
}
