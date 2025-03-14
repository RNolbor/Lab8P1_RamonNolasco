/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_ramonnolasco;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ramon
 */

public class Lab8P1_RamonNolasco {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        ArrayList<Personaje> personajes = new ArrayList<>();
        ArrayList<Mapa> mapas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("---------------- MENU -----------------");
            System.out.println("1 <- Crear Personaje");
            System.out.println("2 <- Crear Mapa");
            System.out.println("3 <- Ver Lista de Personajes");
            System.out.println("4 <- Ver Lista de Mapas");
            System.out.println("5 <- Borrar Personaje");
            System.out.println("6 <- Borrar Mapa");
            System.out.println("7 <- Simulacion");
            
            System.out.println("8 <- Salir");
            
            System.out.print("Elige una opcion: ");
            opcion = input.nextInt();
            
            input.nextLine(); 

            switch (opcion) {
                
                
                
                case 1:
                    System.out.println("--------------CREAR PERSONAJE---------------");
                    System.out.print("Ingrese nombre: ");
                    String nombre = input.nextLine();
                    
                    System.out.println("1 - VANGUARD");
                    System.out.println("2 - DPS");
                    System.out.println("3 - STRATEGIST");
                    System.out.println("Seleccione un rol: ");
                    int rolS = input.nextInt(); 
                    String rol = "";
                    switch (rolS){
                        case 1:
                            rol = "VANGUARD";
                            break;
                        case 2:
                            rol = "DPS";
                            break;
                        case 3:
                            rol = "STRATEGIST";
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida: ");
                            rolS = input.nextInt();                           
                    }
                                                                       
                    System.out.print("Ingrese vida: ");
                    int vida = input.nextInt();                    
                    if (rolS == 1){
                        while (vida < 200 || vida > 350){
                            System.out.println("Valor de vida invalido para VANGUARD. Intente de nuevo.");
                            System.out.println("Ingrese vida: ");
                            vida = input.nextInt();
                        }
                    }else if (rolS == 2){
                        while (vida < 100 || vida > 150){
                            System.out.println("Valor de vida invalido para DPS. Intente de nuevo.");
                            System.out.println("Ingrese vida: ");
                            vida = input.nextInt();
                        }                        
                    }else if (rolS == 3){
                        while (vida < 150 || vida > 200){
                            System.out.println("Valor de vida invalido para STRATEGIST. Intente de nuevo.");
                            System.out.println("Ingrese vida: ");
                            vida = input.nextInt();
                        }                        
                    }
                    int vidaMax = vida;
                    
                    System.out.println("Ingrese danio: ");
                    int daño = input.nextInt();
                    if (rolS == 1){
                        while (daño < 10 || daño > 20){
                            System.out.println("Valor de daño invalido para VANGUARD. Intente de nuevo.");
                            System.out.println("Ingrese daño: ");
                            daño = input.nextInt();
                        }
                    }else if (rolS == 2){
                        while (daño < 50 || daño > 60){
                            System.out.println("Valor de daño invalido para DPS. Intente de nuevo.");
                            System.out.println("Ingrese daño: ");
                            daño = input.nextInt();
                        }                        
                    }else if (rolS == 3){
                        while (daño < 30 || daño > 40){
                            System.out.println("Valor de daño invalido para STRATEGIST. Intente de nuevo.");
                            System.out.println("Ingrese daño: ");
                            daño = input.nextInt();
                        }                       
                    }                                     
                    personajes.add(new Personaje(nombre, rol, vida, vidaMax, daño));           
                    System.out.println("Personaje creado con exito.");
                    break;
                    
                    
                    
                case 2:
                    System.out.println("--------------CREAR MAPA---------------");                    
                    System.out.print("Ingrese nombre: ");
                    String mapaNombre = input.nextLine();
                    System.out.print("Ingrese rondas: ");
                    int rounds = input.nextInt();
                    while (rounds < 1 || rounds > 10){
                        System.out.println("Valor de rounds no es valido ( 1 - 10 )");
                        rounds = input.nextInt();
                    }                   
                    mapas.add(new Mapa(mapaNombre, rounds));
                    System.out.println("Mapa creado con exito.");
                    break;
                    
                case 3:
                    
                    System.out.println("-------------PERSONAJES-------------");
                    imprimirLista(personajes);
                    break;
                    
                case 4:
                    
                    System.out.println("----------------MAPAS----------------");                    
                    imprimirLista(mapas);
                    break;
                    
                case 5:
                    
                    eliminarElemento(personajes, "personaje");
                    break;
                            
                case 6:
                    
                    eliminarElemento(mapas, "mapa");
                    break;
                    
                case 7:
                    
                    
                    break;
                    
                case 8:
                    
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 8);
       
    }

    public static <T> void imprimirLista(ArrayList<T> lista) {
        
        if (lista.isEmpty()){
            System.out.println("No hay elementos en la lista.");
        }else{
            for (int i = 0; i < lista.size(); i++){
                System.out.println(i+1 + ". " + lista.get(i));
            }
        }
    }

    public static <T> void eliminarElemento(ArrayList<T> lista, String tipo) {
        Scanner input = new Scanner(System.in);
        if (lista.isEmpty()) {
            System.out.println("No hay " + tipo + "s para eliminar.");
            return;
        }       
        imprimirLista(lista);      
        System.out.print("Ingrese el indice del " + tipo + " a eliminar: ");
        
        int index = input.nextInt()-1;
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            System.out.println(tipo + " eliminado con exito.");
        } else {
            System.out.println("Indice invalido.");
        }
    }
}
