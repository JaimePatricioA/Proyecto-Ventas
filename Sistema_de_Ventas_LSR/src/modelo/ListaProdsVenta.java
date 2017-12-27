package modelo;     /**     @author FuzanToko   */

import java.util.ArrayList;


public class ListaProdsVenta { //El proposito de esta clase es gestionar las cantidades de productos del array... 
    
    private  ArrayList<ProductoVenta>  lpv;

    public ListaProdsVenta() {}

    public ListaProdsVenta(ArrayList<ProductoVenta> lpv) {
        this.lpv = lpv;
    }

    public ArrayList<ProductoVenta> getLpv() {
        return lpv;
    }

    public void setLpv(ArrayList<ProductoVenta> lpv) {
        this.lpv = lpv;
    }
    
    public char quitarProdVenta(String codigo) {
        char result = 'a';
        for (int i = 0; i < lpv.size(); i++) {
            if ( lpv.get(i).getCod().equals(codigo) ) {
                lpv.remove(i);
                result = 'b';
            } else {
                result = 'n';
            }
        } 
        if (lpv.isEmpty()) {
            result = 'v';
        }
        return result;
    }
        
    public void agregarProdVenta(ProductoVenta prodVenta) { // Busca si existe el producto en el ArrayProductosVenta lpv
        boolean nuevo = true;
            if (lpv.isEmpty()) {
                lpv.add(prodVenta);
            } else {
                for (int i = 0; i < lpv.size(); i++) {
                    if ( lpv.get(i).getCod().equals(prodVenta.getCod()) ) {
                        nuevo = false;
                        lpv.get(i).setCant(lpv.get(i).getCant() + prodVenta.getCant()); // Si existe suma sus cantidades
                    }
                } if (nuevo == true) { 
                    lpv.add(prodVenta); // Si no existe agrega el productoVenta al ArrayProductosVenta lpv
                }
            }
    }

    @Override
    public String toString() {
        return "ListaProdsVenta{" + "lpv=" + lpv + '}';
    }
    
    
    
}
