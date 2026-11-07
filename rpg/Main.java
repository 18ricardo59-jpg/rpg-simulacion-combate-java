package com.rpg;

public class Main {

    public static void main(String[] args) {

        // Instanciacion de la arena con capacidad para 5 combatientes
        Arena arena = new Arena(5);

        // Creacion de instancias de distintas subclases (Polimorfismo en uso)
        Guerrero g1 = new Guerrero("Ilia Topuria", 100, 3, 20, 5);
        Mago m1 = new Mago("Harry Potter", 80, 4, 25, 50);
        Arquero a1 = new Arquero("Legolas", 90, 6, 18);

        // Registro de los participantes en la arena
        arena.agregarPersonaje(g1);
        arena.agregarPersonaje(m1);
        arena.agregarPersonaje(a1);

        // Estado inicial
        arena.mostrarPersonajes();

        // Ejecucion de un combate (Guerrero vs Mago)
        arena.combate(0, 1);

        // Estado final tras el combate
        System.out.println("\nEstado final:");
        arena.mostrarPersonajes();
    }
}