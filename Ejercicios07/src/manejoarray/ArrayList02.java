/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class ArrayList02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }
    public static ArrayList<String> obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera=true;
        while (bandera) {
            System.out.println("Ingrese nombre del pais");
            String pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Si desea salir del ciclo escriba S");
            String opcion = entrada.nextLine();
            if (opcion.equals("S")) {
                bandera = false;
            }
        }
        return arreglo2;
    }
    public static String obtenerCadenaFinal(ArrayList<String> arreglo2) {
        String mensaje = "";
          for (int i = 0; i < arreglo2.size(); i++) {
            mensaje = mensaje + arreglo2.get(i)+"\n";
        }
        return mensaje;

    
    }
}


