/*
 * Creado por Tatiana Ortega
 * Fecha 11-09-2022
 * Generacion de Clave Aleatoria entre 8 y 15 caracteres
 * que contenga minimo 2 mayusculas, 2 minusculas y 2 digitos
*/
package clavealeatoria;


public class ClaveAleatoria {

    
    public static void main(String[] args) {
        Clave clave = new Clave();
        //Almacena la cadena generada llamando al metodo
        String resultado = clave.generarClave();
        //Presenta en pantalla la clave aleatoria
        System.out.println("clave: "+resultado);
    }
    
}
