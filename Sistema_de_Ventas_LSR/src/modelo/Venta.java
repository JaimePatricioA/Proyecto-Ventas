package modelo;        /**         @author Curso-09-04         */

import java.util.ArrayList;
import java.util.Calendar;


public class Venta {

    private ArrayList<ProductoVenta> ProductosVenta;
    private int total;
    private final String fecha;
    private int efectivo;
    private final String usuario;
    private static int idVenta = 0;

    public Venta(ArrayList<ProductoVenta> ProductosVenta, String usuario) {
        this.ProductosVenta = ProductosVenta;
        this.total = 0;
        this.efectivo = 0;
        this.fecha = (Calendar.getInstance().getTime().toString()).replace("CLST", "");
        this.usuario = usuario;
        Venta.idVenta = ++idVenta;
    }

    public void setProductosVenta(ArrayList<ProductoVenta> ProductosVenta) {
        this.ProductosVenta = ProductosVenta;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public ArrayList<ProductoVenta> getProductosVenta() {
        return ProductosVenta;
    }

    public int getTotal() {
        return total;
    }

    public String getFecha() {
        return fecha;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public String getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Venta N° "+ idVenta +" Vend. "+ usuario +"\n"+ fecha +"\n______________________________\n"+
               "\nProductos :\n," + 
                ProductosVenta + "\b" +
               "\n\tTOTAL = $ "+ total +".-\n\n"+
               "Monto Cancelado = $ "+ efectivo +".-\n"+
               "Vuelto = $ "+ (efectivo - total) +".-\n______________________________\n"+
               "Gracias por preferirnos.\nHasta pronto!\n\n";      
    }

    public int getIdVenta() {
        return idVenta;
    }
    
}
