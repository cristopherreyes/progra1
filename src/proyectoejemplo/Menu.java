 package proyectoejemplo;

import java.util.Scanner;

public class Menu {
  
    int opt=0;
    Scanner in=new Scanner(System.in);
		
    do{
	
    System.out.println("Ingresar Opcion");
	System.out.println("1.-");
	System.out.println("2.-");
	System.out.println("3.-");
        System.out.println("3.-");
	System.out.println("4.-");

	int opcion=Integer.parseInt(in.nextLine());
	
        switch(opcion){
            
            case 1:{
                
            break;
			}
            case 2:{
            break;
			}
            case 3:{
            break;

			}
            case 4:{
                break;

			}
			
		}
	System.out.println("Continuar 1:si/2:no");
            opt=Integer.parseInt(in.nextLine());
        
        }while(opt==1);{
        	System.out.println("Saliendo");
        }
    }    
		

    

