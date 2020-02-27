/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

/**
 *
 * @author ceque
 */
public class Libro {
    private String Titulo;
    private String autor;
    private float precio;
    private int unidades;

    public Libro(String Titulo, String autor, float precio, int unidades) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public Libro() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return Titulo+", "+autor+", "+ precio + ", " + unidades+", " ;
    }
    
    
}
