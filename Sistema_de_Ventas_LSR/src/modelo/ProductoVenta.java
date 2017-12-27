package modelo;         /**     @author FuzanToko       */

public class ProductoVenta {
    private String cod;
    private String descrip;
    private int cant;
    private int precio;

    public ProductoVenta(String cod, String descrip, int cant, int precio) {
        this.cod = cod;
        this.descrip = descrip;
        this.cant = cant;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\bItem Código: " + cod +"\n"+ descrip + "\nDetalle: " + cant + " x $ " + precio + ".-\n\n";
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
   
}
