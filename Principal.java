import java.util.*;

import javax.swing.JOptionPane;

public class Principal {

    private static Scanner enter;

    public static void main(String[] args) {
        enter = new Scanner(System.in);
 Ascensor nuevos=new Ascensor();
int opcion=0;


System.out.println("Bienvenido al Ascensor.");
do{
    
    System.out.println("Recuerde que este edifico solo tiene 6 pisos y 2 sotanos");
    System.out.println("Este Ascensor atiende 7 pisos");
    System.out.println("Para inciar seleccione:");
    System.out.println(" escriba 1 para subir");
    System.out.println(" escriba 2 para bajar");
    System.out.println(" 0 desea salir");
    opcion=enter.nextInt();
    
    
    
    switch (opcion){
    case 1:
        
        Ascensor nuevo=new Ascensor();
        nuevo.asignarPiso("");
        
    nuevo.imprimir();
    
        nuevo.asignarSube("");
        
        break;
        
    case 2:
        Ascensor nuevo1=new Ascensor();
    nuevo1.asignarPiso("");
    nuevo1.imprimir();
    
        nuevo1.asignarbaja("");
        
        break;
    
}}while (opcion !=0);
    

}}

