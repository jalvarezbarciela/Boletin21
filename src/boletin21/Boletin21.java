/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author ceque
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodos obx=new Metodos();
       File fich=new File("libros.txt");
        int opcion;        
         do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("     Menu      "
                                                             + "\n1.Engadir Libro"
                                                             + "\n2.Amosar"                            
                                                             + "\n3.Precio consultado"
                                                             + "\n4.Modificar"
                                                             + "\n5.Borrar"
                                                             + "\n6.Sair"));
            switch(opcion){                
                case 1:obx.engadir();break;
                case 2:obx.Amosar(fich);break;
                case 3:obx.consultar(fich); break;
                case 4:obx.Modificar(fich);break;
                case 5:obx.borrar(fich);break;
                case 6:break;
                
            }
        }while(opcion!=6);
    }
    
}
