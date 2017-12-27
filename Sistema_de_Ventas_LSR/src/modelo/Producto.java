package modelo;     /**     @author Curso-09-04     */


public class Producto {
    private String codigo;
    private String descripcion;
    private int stock;
    private int stockMin;// Stock mínimo
    private int precio;

    public Producto() {
    }

    public Producto(String codigo, String descripcion, int precio, int stock, int stockMin) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.stockMin = stockMin;
    }


    @Override
    public String toString() {
        return "Producto Código: " + codigo + "\nDescripcion: " + descripcion + "\nPrecio: $ " + precio + ".-"+ "\nStock Actual: " + stock + "\nStock Mínimo: " + stockMin;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
}