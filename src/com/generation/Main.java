package com.generation;

public class Main {


    public static void main(String[] args) {
	// write your code here
        String nombre="Carlos";
        //new es para la creación de un nuevo objeto
        Perro lomito=new Perro();
        lomito.nombre="chems";
        lomito.edad=1;
        lomito.raza="mestizo";
        lomito.tamanio="grande";
        lomito.caracteristicas();
        lomito.comer();

        Perro lomito2=new Perro();
        lomito2.nombre="firulais";
        lomito2.edad=2;
        lomito2.raza="pug";
        lomito2.tamanio="chico";
        lomito2.caracteristicas();
        lomito2.comer();

        Perro lomito3=new Perro();
        lomito3.nombre="Milaneso";

        Perro lomito4=new Perro("Sr. Kawamura", "Husky", 4,"gigante");
        lomito4.caracteristicas();
    }
}
