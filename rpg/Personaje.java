package com.rpg;

// Clase abstracta base: define la estructura comun pero no puede instanciarse directamente
public abstract class Personaje implements Atacante {

    // Atributos protegidos para permitir el acceso directo desde las subclases
    protected String nombre;
    protected int vida;
    protected int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    // Procesa el daño recibido asegurando que la vida no baje de cero
    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        if (vida < 0) {
            vida = 0;
        }
    }

    // Comprueba el estado vital del personaje
    public boolean estaVivo() {
        return vida > 0;
    }

    // Incrementa estadisticas tras ganar un combate
    public void subirNivel() {
        nivel++;
        vida += 10;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               " | Vida: " + vida +
               " | Nivel: " + nivel;
    }
}