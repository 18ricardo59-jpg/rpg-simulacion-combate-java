# Simulador de Combate RPG (Java POO)

Aplicación de consola desarrollada en Java que simula un sistema de lucha por turnos entre diferentes tipos de personajes (Guerrero, Mago, Arquero), aplicando los pilares fundamentales de la Programación Orientada a Objetos.

## Características
* **Combate por turnos:** Lógica de enfrentamiento automático con cálculo dinámico de daño, reducción por defensa y subida de nivel tras la victoria.
* **Mecánicas por clase:** 
  * **Guerrero:** Mitigación de daño basada en atributo de defensa y ataque escalado por nivel.
  * **Mago:** Consumo de maná para ejecutar ataques mágicos de alto impacto.
  * **Arquero:** Daño base con bonificador especial al superar nivel 5.
* **Gestión de la Arena:** Almacenamiento y control de personajes en combate mediante arrays.

## Conceptos de POO Aplicados
* **Clase Abstracta (`Personaje`):** Plantilla base no instanciable que define los atributos y métodos comunes (`recibirDanio`, `estaVivo`, `subirNivel`).
* **Interfaz (`Atacante`):** Contrato que obliga a implementar la mecánica de ataque (`atacar()`).
* **Herencia (`extends`):** Reutilización de código compartida desde `Personaje` hacia las subclases `Guerrero`, `Mago` y `Arquero`.
* **Polimorfismo (`@Override`):** Redefinición personalizada de los métodos de ataque y cálculo de daño según el tipo de unidad.
* **Encapsulamiento:** Control de acceso a variables mediante visibilidad `protected` y `private`.

## structura de Clases
```text
com.rpg
├── Atacante.java       (Interfaz)
├── Personaje.java      (Clase abstracta base)
├── Guerrero.java       (Subclase de Personaje)
├── Mago.java           (Subclase de Personaje)
├── Arquero.java        (Subclase de Personaje)
├── Arena.java          (Gestión de combates y lista de unidades)
└── Main.java           (Punto de entrada y ejecución del programa)
