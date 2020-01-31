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
                case 1://crear
                    int tipo =0;
                    System.out.println("Que tipo desea jugar (presione un numero): "
                            + "\n1) Clerigo"
                            + "\n2) Barbaro"
                            + "\n3) Mago"
                            + "\n4) Picaro");
                    tipo = leer.nextInt();
                    while (tipo < 1 || tipo > 4) {
                        System.out.println("Lo ingresado esta malo, vuelva a intentar"
                                + "\nQue tipo desea jugar (presione un numero): "
                                + "\n1) Clerigo"
                                + "\n2) Barbaro"
                                + "\n3) Mago"
                                + "\n4) Picaro");
                        tipo = leer.nextInt();
                    }
                    System.out.println("Ingrese el nombre de su personaje: ");
                    String nombre = leer.nextLine();
                    boolean ver = false;
                    for (int i = 0; i < personajes.size(); i++) {
                        if(personajes.get(i).getNombre().equals(nombre)){
                            ver = true;
                        }
                    }
                    while (ver) {
                        System.out.println("El nombre que ingreso ya existe"
                                + "\nIngrese el nombre de su personaje: ");
                        nombre = leer.nextLine();
                        for (int i = 0; i < personajes.size(); i++) {
                            if (personajes.get(i).getNombre().equals(nombre)) {
                                ver = true;
                                break;
                            }else
                                ver = false;
                        }
                    }
                    System.out.println("Que raza es su jugador (presione un numero): "
                            + "\n1) Mediano"
                            + "\n2) Enano"
                            + "\n3) Elfo"
                            + "\n4) Humano");
                    int raza = leer.nextInt();
                    while (raza < 1 || raza > 4) {
                        System.out.println("Lo ingresado esta malo, vuelva a intentar"
                                + "\nQue raza es su jugador (presione un numero): "
                                + "\n1) Mediano"
                                + "\n2) Enano"
                                + "\n3) Elfo"
                                + "\n4) Humano");
                        raza = leer.nextInt();
                    }
                    System.out.println("Ingrese la altura de su personaje: ");
                    int altura = leer.nextInt();
                    System.out.println("Ingrese el peso de su personaje: ");
                    int peso = leer.nextInt();
                    System.out.println("Ingrese la edad de su personaje: ");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese una leve descripcion de su personaje ");
                    String desc = leer.nextLine();
                    
                    System.out.println("Que nacionalidad es su jugador (presione un numero): "
                            + "\n1) Norfair"
                            + "\n2) Brinstar"
                            + "\n3) Maridia"
                            + "\n4) Zebes"
                            + "\n5) Crateria");
                    int nat = leer.nextInt();
                    while (nat < 1 || nat > 5) {
                        System.out.println("Lo ingresado esta malo, vuelva a intentar"
                                + "\nQue nacionalidad es su jugador (presione un numero): "
                                + "\n1) Norfair"
                                + "\n2) Brinstar"
                                + "\n3) Maridia"
                                + "\n4) Zebes"
                                + "\n5) Crateria");
                        nat = leer.nextInt();
                    }
                    
                    break;
                case 2://modificar
                    
                    break;
                case 3://vér
                    
                    break;
                case 4://elimnar
                    
                    break;
                case 5://combate
                    
                    break;
                case 6://salir
                    resp = 'n';
                    break;
                default:
                    
            }
            
        }

    }
    
}
