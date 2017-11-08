/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colada.morada;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ColadaMorada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int respuesta;
        
        System.out.println("Menu Colada Morada");
        System.out.println("ingrese el numero de la opcion que quiere saber");
        System.out.println("1. Ver ingredientes de la colada morada");
        System.out.println("2. Ver tiempo de horneado de las guaguas de pan");
        
        respuesta = entrada.nextInt();
        
        switch(respuesta){
            case 1:
                System.out.println("Los ingredientes de la colada morada son harina de maíz morado o maíz negro, frutas, especias y hierbas. Ponga las cáscaras de piña, el centro de la piña, la canela, clavo de olor, pimienta dulce y la panela en una olla grande con 8 tazas de agua");
                break;
            case 2:
                System.out.println("el horneado de las guaguas de pan son a 36 grados por 45 minutos");
                break;
            default:
                System.out.println(" responda nuevamente con las condiciones correspondientes ");
                break;
        }
        }
        
                
    }
    

