package modelo;      /**         @author FuzanToko      */

import java.util.ArrayList;


public class ListaProductos {
    
    private static ArrayList<Producto> lp;

    public ListaProductos() {
    }

    public ListaProductos(ArrayList<Producto> lp) {
        ListaProductos.lp = lp;
    }

    public ArrayList<Producto> getLp() {
        return lp;
    }

    public void setLp(ArrayList<Producto> lp) {
        ListaProductos.lp = lp;
    }
    
    public void crearProducto(String codigo, String descripcion, int precio, int stock, int stockMin ) {
        Producto prod = new Producto(codigo, descripcion, precio, stock, stockMin);
        ListaProductos.lp.add(prod);
    }
    
    public Producto buscarProducto(String codigo) {
        for (int i = 0; i < lp.size(); i++) {
            if ( lp.get(i).getCodigo().equals(codigo) ) {
                return lp.get(i);
            }
        }
        Producto productoNoExiste = new Producto("","",0,0,0);
        return productoNoExiste;
    }
    
    public boolean eliminarProducto(String codigo) {
        return lp.remove(buscarProducto(codigo));  
    }
    
    public boolean editarProducto(Producto editarProd) {
        if ( !"".equals((buscarProducto(editarProd.getCodigo())).getCodigo()) ) {
            buscarProducto(editarProd.getCodigo()).setDescripcion(editarProd.getDescripcion());
            buscarProducto(editarProd.getCodigo()).setPrecio(editarProd.getPrecio());
            buscarProducto(editarProd.getCodigo()).setStock(editarProd.getStock());
            buscarProducto(editarProd.getCodigo()).setStockMin(editarProd.getStockMin());
            return true;
        } else {
            return false;
        }
    }
    
    
}
