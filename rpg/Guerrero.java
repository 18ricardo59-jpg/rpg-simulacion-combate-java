package com.rpg;

// Subclase que hereda de Personaje
public class Guerrero extends Personaje {

    private int fuerza;
    private int defensa;

    public Guerrero(String nombre, int vida, int nivel, int fuerza, int defensa) {
        super(nombre, vida, nivel); // Llamada al constructor de la clase padre (Personaje)
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    // Polimorfismo: el ataque del guerrero escala con su fuerza y nivel
    @Override
    public int atacar() {
        return fuerza + (nivel * 2);
    }

    // Polimorfismo: el guerrero reduce el daño recibido mediante su atributo de defensa
    @Override
    public void recibirDanio(int cantidad) {
        int danioReducido = cantidad - defensa;
        if (danioReducido < 0) {
            danioReducido = 0;
        }
        super.recibirDanio(danioReducido);
    }

    @Override
    public String toString() {
        return "GUERRERO -> " + super.toString() +
               " | Fuerza: " + fuerza +
               " | Defensa: " + defensa;
    }
}