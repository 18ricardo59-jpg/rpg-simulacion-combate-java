package com.rpg;

// Gestiona la lista de personajes y la logica de los enfrentamientos
public class Arena {

    private Personaje[] personajes;
    private int contador;

    public Arena(int capacidad) {
        personajes = new Personaje[capacidad];
        contador = 0;
    }

    // Agrega un nuevo personaje al array controlando el limite de capacidad
    public void agregarPersonaje(Personaje p) {
        if (contador < personajes.length) {
            personajes[contador] = p;
            contador++;
        } else {
            System.out.println("La arena está llena.");
        }
    }

    // Muestra por pantalla la lista actual de participantes
    public void mostrarPersonajes() {
        for (int i = 0; i < contador; i++) {
            System.out.println(i + " - " + personajes[i]);
        }
    }

    // Simula el combate por turnos entre dos personajes seleccionados por su indice
    public void combate(int i, int j) {

        // Validacion de indices
        if (i >= contador || j >= contador || i == j) {
            System.out.println("Índices inválidos.");
            return;
        }

        Personaje p1 = personajes[i];
        Personaje p2 = personajes[j];

        System.out.println("\n COMBATE ENTRE " + p1.nombre + " Y " + p2.nombre);

        // Bucle del combate por turnos hasta que uno quede fuera de combate
        while (p1.estaVivo() && p2.estaVivo()) {

            // Turno del personaje 1
            int danio1 = p1.atacar();
            p2.recibirDanio(danio1);
            System.out.println(p1.nombre + " hace " + danio1 + " de daño.");

            if (!p2.estaVivo()) break;

            // Turno del personaje 2
            int danio2 = p2.atacar();
            p1.recibirDanio(danio2);
            System.out.println(p2.nombre + " hace " + danio2 + " de daño.");
        }

        // Resolucion del ganador y subida de nivel
        if (p1.estaVivo()) {
            System.out.println("Gana " + p1.nombre);
            p1.subirNivel();
        } else {
            System.out.println("Gana " + p2.nombre);
            p2.subirNivel();
        }
    }
}