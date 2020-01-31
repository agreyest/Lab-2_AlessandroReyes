package lab.pkg2_alessandroreyes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_AlessandroReyes {
    
    static ArrayList<Personaje> personajes = new ArrayList();
    public static Random random = new Random();
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's') {
            System.out.println("Bienvenido a Codest"
                    + "\n1) Creacion de personajes"
                    + "\n2) Modificar personajes"
                    + "\n3) Ver atributos de un personaje"
                    + "\n4) Eliminar personajes"
                    + "\n5) Combate"
                    + "\n6) Salir");
            int op = leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Que tipo desea jugar (presione un numero): "
                            + "\n1) Clerigo"
                            + "\n2) Barbaro"
                            + "\n3) Mago"
                            + "\n4) Picaro");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    resp = 'n';
                    break;
                default:
                    
            }
            
        }

    }
    
}
