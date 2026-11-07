package com.rpg;

// Subclase que hereda de Personaje
public class Arquero extends Personaje {

    private int precision;

    public Arquero(String nombre, int vida, int nivel, int precision) {
        super(nombre, vida, nivel);
        this.precision = precision;
    }

    // Polimorfismo: el arquero obtiene un bonificador de daño si supera el nivel 5
    @Override
    public int atacar() {
        int danio = 15;
        if (nivel > 5) {
            danio += 10;
        }
        return danio;
    }

    @Override
    public String toString() {
        return "ARQUERO -> " + super.toString() +
               " | Precision: " + precision;
    }
}