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
            switch (op) {
                case 1://crear
                    int tipo = 0;
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
                        if (personajes.get(i).getNombre().equals(nombre)) {
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
                            } else {
                                ver = false;
                            }
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
                    int estatura = leer.nextInt();
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
                    switch (tipo) {
                        case 1:
                            if (raza == 1) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(60), 97, 40, 5 + random.nextInt(15)));
                            } else if (raza == 2) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(60), 93, 65, 15 + random.nextInt(30)));
                            } else if (raza == 3) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(60), 101, 20, 5 + random.nextInt(10)));
                            } else if (raza == 4) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(60), 80, 50, 15 + random.nextInt(25)));
                            }

                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(nombre)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Clerigo");//Cambiar
                                    if (raza == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (raza == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (raza == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (raza == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (nat == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (nat == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (nat == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (nat == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (nat == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }

                                    break;
                                }
                            }//fin del for
                            break;
                        case 2:
                            if (raza == 1) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        80 + random.nextInt(100), 97, 40, 5 + random.nextInt(15)));
                            } else if (raza == 2) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        80 + random.nextInt(100), 93, 65, 15 + random.nextInt(30)));
                            } else if (raza == 3) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        80 + random.nextInt(100), 101, 20, 5 + random.nextInt(10)));
                            } else if (raza == 4) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        80 + random.nextInt(100), 80, 50, 15 + random.nextInt(25)));
                            }

                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(nombre)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Bárbaro");//Cambiar
                                    if (raza == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (raza == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (raza == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (raza == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (nat == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (nat == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (nat == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (nat == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (nat == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }

                                    break;
                                }
                            }//fin del for
                            break;
                        case 3:
                            if (raza == 1) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(70), 97, 40, 5 + random.nextInt(15)));
                            } else if (raza == 2) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(70), 93, 65, 15 + random.nextInt(30)));
                            } else if (raza == 3) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(70), 101, 20, 5 + random.nextInt(10)));
                            } else if (raza == 4) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        50 + random.nextInt(70), 80, 50, 15 + random.nextInt(25)));
                            }

                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(nombre)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Mago");//Cambiar
                                    if (raza == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (raza == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (raza == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (raza == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (nat == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (nat == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (nat == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (nat == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (nat == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }

                                    break;
                                }
                            }//fin del for
                            break;
                        case 4:
                            if (raza == 1) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        40 + random.nextInt(75), 97, 40, 5 + random.nextInt(15)));
                            } else if (raza == 2) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        40 + random.nextInt(75), 93, 65, 15 + random.nextInt(30)));
                            } else if (raza == 3) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        40 + random.nextInt(75), 101, 20, 5 + random.nextInt(10)));
                            } else if (raza == 4) {
                                personajes.add(new Personaje(tipo, nombre, raza, estatura, peso, edad, desc, nat,
                                        40 + random.nextInt(75), 80, 50, 15 + random.nextInt(25)));
                            }

                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(nombre)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Pícaro");//Cambiar
                                    if (raza == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (raza == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (raza == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (raza == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (nat == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (nat == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (nat == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (nat == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (nat == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }

                                    break;
                                }
                            }//fin del for
                            break;
                    }//fin de switch interno
                    break;
                case 2://modificar

                    break;
                case 3://vér
                    System.out.println("Ingrese el nombre del personaje que desea ver los atributos: ");
                    String name = leer.nextLine();
                    int t = 0,
                     n = 0,
                     r = 0;
                    for (int i = 0; i < personajes.size(); i++) {
                        if (personajes.get(i).getNombre().equals(name)) {
                            t = personajes.get(i).getTipo();
                            n = personajes.get(i).getNacionalidad();
                            r = personajes.get(i).getRaza();
                            break;
                        } else {
                            System.out.println("Ese personaje no existe o nombre incorrecto.");
                            break;
                        }
                    }

                    switch (t) {
                        case 1:
                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(name)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Clerigo");//Cambiar
                                    if (r == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (r == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (r == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (r == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (n == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (n == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (n == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (n == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (n == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }
                                    break;
                                }
                            }//fin del for
                            break;
                        case 2:
                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(name)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Bárbaro");//Cambiar
                                    if (r == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (r == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (r == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (r == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (n == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (n == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (n == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (n == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (n == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }

                                    break;
                                }
                            }//fin del for
                            break;
                        case 3:
                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(name)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Mago");//Cambiar
                                    if (r == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (r == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (r == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (r == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (n == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (n == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (n == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (n == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (n == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }

                                    break;
                                }
                            }//fin del for
                            break;
                        case 4:
                            System.out.println("Estos son los atributos de su personajes: ");
                            for (int i = 0; i < personajes.size(); i++) {
                                if (personajes.get(i).getNombre().equals(name)) {
                                    System.out.println(personajes.get(i));
                                    System.out.println("tipo= Pícaro");//Cambiar
                                    if (r == 1) {
                                        System.out.println("raza= Mediano");//Cambiar
                                    } else if (r == 2) {
                                        System.out.println("raza= Enano");//Cambiar
                                    } else if (r == 3) {
                                        System.out.println("raza= Elfo");//Cambiar
                                    } else if (r == 4) {
                                        System.out.println("raza= Humano");//Cambiar
                                    }
                                    if (n == 1) {
                                        System.out.println("nacionalidad= Norfair");//Cambiar
                                    } else if (n == 2) {
                                        System.out.println("nacionalidad= Brinstar");//Cambiar
                                    } else if (n == 3) {
                                        System.out.println("nacionalidad= Maridia");//Cambiar
                                    } else if (n == 4) {
                                        System.out.println("nacionalidad= Zebes");//Cambiar
                                    } else if (n == 5) {
                                        System.out.println("nacionalidad= Crateria");//Cambiar
                                    }

                                    break;
                                }
                            }//fin del for
                            break;
                    }//fin de switch interno
                    break;
                case 4://elimnar
                    System.out.println("Ingrese el nombre del personaje que desea ver los atributos: ");
                    String nom = leer.nextLine();
                    for (int i = 0; i < personajes.size(); i++) {
                        if (personajes.get(i).getNombre().equals(nom)) {
                            personajes.remove(i);
                            System.out.println("Personaje eliminado con exito");
                            break;
                        } else {
                            System.out.println("Ese personaje no existe o nombre incorrecto.");
                            break;
                        }
                    }
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
