/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ceque
 */
public class Metodos {
    PrintWriter esc=null;
    FileWriter fich;
    String ficheiro="libros.txt";
    Scanner sc;
    public void engadir(){
     try{
         String titulo=JOptionPane.showInputDialog(null,"Titulo del libro");
                String autor=JOptionPane.showInputDialog(null,"Autor del libro");
                float precio=Float.parseFloat(JOptionPane.showInputDialog(null,"Precio del libro"));
                int dorsal=Integer.parseInt(JOptionPane.showInputDialog(null,"Unidades del libro"));
         Libro x=new Libro(titulo,autor,precio,dorsal);
         
         fich=new FileWriter(ficheiro,true);
         esc =new PrintWriter(fich);
         esc.println(x);
         
     }catch(IOException ex){
         System.out.println("erro escribirNumeros"+ex.toString()); 
     }finally{
         esc.close();
     }
     
 }
    public void consultar(File fich){
        try {
            String busqueda=JOptionPane.showInputDialog(null,"Titulo del libro");
            ArrayList<Libro> lista = null;
            sc=new Scanner(fich).useDelimiter(",");
            while(sc.hasNextLine()){
                String b=sc.nextLine();
                String[]datos=b.split(",");
                String titulo=datos[0];
                String autor=datos[1];
                float precio=Float.parseFloat(datos[2]);
                int dorsal=Integer.parseInt(datos[4]);
                lista.add(new Libro());   
            
            }
            for(Libro lib:lista){
                 if (busqueda.equalsIgnoreCase(lib.getTitulo())) {
                    System.out.println(lib.toString());
                }
                 else{
                     System.out.println("Non temos ese libro");
                 }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLiñas"+ex.toString());
        }finally{sc.close();}
    }
    public void Amosar(File fich){
        try {
            sc=new Scanner(fich);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLiñas"+ex.toString());
        }finally{sc.close();}
    }
    public void borrar(File fich){
        try {            
            ArrayList<Libro> lista = null;
            sc=new Scanner(fich).useDelimiter(",");
            while(sc.hasNextLine()){
                String b=sc.nextLine();
                String[]datos=b.split(",");
                String titulo=datos[0];
                String autor=datos[1];
                float precio=Float.parseFloat(datos[2]);
                int dorsal=Integer.parseInt(datos[4]);
                lista.add(new Libro());   
            
            }
            int i=0;
            for(Libro lib:lista){
                 if (lib.getUnidades()>=0) {
                    lista.remove(i);
                }
                 else{
                    reescribir(lib);
                 }
            i++;     
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLiñas"+ex.toString());
        }finally{sc.close();}
    }
    public void reescribir(Libro x){
     try{
                 
         fich=new FileWriter(ficheiro,true);
         esc =new PrintWriter(fich);
         esc.println(x);
         
     }catch(IOException ex){
         System.out.println("erro escribirNumeros"+ex.toString()); 
     }finally{
         esc.close();
     }
     
     
 }
 public void Modificar(File fich){
        try {
            String busqueda=JOptionPane.showInputDialog(null,"Titulo del libro");
            ArrayList<Libro> lista = null;
            sc=new Scanner(fich).useDelimiter(",");
            while(sc.hasNextLine()){
                String b=sc.nextLine();
                String[]datos=b.split(",");
                String titulo=datos[0];
                String autor=datos[1];
                float precio=Float.parseFloat(datos[2]);
                int dorsal=Integer.parseInt(datos[4]);
                lista.add(new Libro());   
            
            }
            for(Libro lib:lista){
                 if (busqueda.equalsIgnoreCase(lib.getTitulo())) {
                    lib.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"Novo Precio")));
                }
                 reescribir(lib);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLiñas"+ex.toString());
        }finally{sc.close();}
    }   
    
    
}
