package com.rpg;

// Subclase que hereda de Personaje
public class Mago extends Personaje {

    private int inteligencia;
    private int mana;

    public Mago(String nombre, int vida, int nivel, int inteligencia, int mana) {
        super(nombre, vida, nivel);
        this.inteligencia = inteligencia;
        this.mana = mana;
    }

    // Polimorfismo: si tiene mana realiza un ataque magico potente, si no, un ataque basico
    @Override
    public int atacar() {
        if (mana >= 10) {
            mana -= 10;
            return inteligencia * 2;
        } else {
            return 5;
        }
    }

    @Override
    public String toString() {
        return "MAGO -> " + super.toString() +
               " | Inteligencia: " + inteligencia +
               " | Mana: " + mana;
    }
}