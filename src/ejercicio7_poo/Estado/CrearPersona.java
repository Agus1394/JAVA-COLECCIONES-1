/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores. ^


//REVISAR//
 */
package ejercicio7_poo.Estado;

import java.util.Scanner;

/**
 *
 * @author AGUS
 */
public class CrearPersona {

    Scanner leer = new Scanner(System.in);

    public Persona Crearla() {
        String gen = " ";

        Persona p = new Persona();

        System.out.println(" # Ingrese su nombre: ");
        p.setNombre(leer.next());

        System.out.println("La edad");
        p.setEdad(leer.nextInt());

        System.out.println("Hombre, Mujer, Otro?");
        p.setSexo(leer.next());
        if (gen.equals("h") && gen.equals("m") && gen.equals("o")) {
            System.out.println("No es una respuesta.");
        } else {
            System.out.println("Siguiente...");
        }

        System.out.println("Su peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Y altura");
        p.setAltura(leer.nextDouble());

        return p;
    }

    public double calcularIMC(Persona p) { // peso/altura*altura
        double res, res1;
        res = (p.getPeso() / (p.getAltura() * p.getAltura()));
        if (res < 20) {
            System.out.println("Esta por debajo de su peso ideal :( ");
            res1 = -1;
        } else if (res >= 20 || res <= 25) {
            System.out.println("Es su peso ideal!");
            res1 = 0;
        } else {
            System.out.println("Esta en sobrepeso :( ");
            res1 = 1;
        }

        return res1;

    }

    public boolean MayorEdad(Persona p) { //si es mayor, verdad
        boolean MayorEdad = false;
        if (p.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
            MayorEdad = true;
        } else {
            System.out.println("No es mayor de edad");
        }
        return MayorEdad;

    }
}
