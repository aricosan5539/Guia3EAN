import java.util.*;

import javax.swing.JOptionPane;
public class Ascensor {
	
	Scanner sc=new Scanner(System.in);
	

private int sube;
private int baja;
private int pisousd;
private String subir;
private String bajar;
private int nuevopiso;
private int i=1;
private int suma;
int termina=0;



public void imprimir(){
	
	System.out.println("piso actual "+pisousd);
	
	
}
	

public void asignarPiso (String pisoUsd){
	pisousd=Integer.parseInt(JOptionPane.showInputDialog("Escriba el piso en el que esta :"));
	if (i<=0){ 
	    pisousd=0;
	    System.out.println("piso incorrecto"+pisousd);}
	
} 
public void asiganrnuevop (int piso){
	nuevopiso=+pisousd;
}
public void asignarSube (String Arriba){
	subir=JOptionPane.showInputDialog(" 1 si desea subir");
	
	sube=Integer.parseInt(subir);
	for(i=1;i<=pisousd;i++);
	    if (i<=6){ 
				    
	        System.out.println("usted subio al piso: "+i);
	        
				} 				
				else {
				    
					System.out.println(" piso incorrecto");
				}
					}
					
									
					
	



public void asignarbaja (String abajo){
	bajar=JOptionPane.showInputDialog(" 2 si desea bajar");
	
	baja=Integer.parseInt(bajar);
	
	for(i=1;i<=pisousd;i++);
    if (i<=7){
			    suma=pisousd-1;
        System.out.println("usted bajo al piso: "+suma);
			} else {
			    
				System.out.println(" piso incorrecto");
			}
	
}
}


