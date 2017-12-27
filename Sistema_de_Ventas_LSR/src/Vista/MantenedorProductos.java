package Vista;  /**@author Curso-09-04*/

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.trim;
import modelo.ListaProductos;
import modelo.Producto;


public class MantenedorProductos extends javax.swing.JFrame {
    private static ListaProductos lp;
    private final  ArrayList<Producto> productos; //Declarada final por recomendación de NetBeans
    private DefaultTableModel modeloProductos;
    private DefaultTableCellRenderer centrar;
    
    public MantenedorProductos() {
        MantenedorProductos.lp = new ListaProductos();
        this.productos = new ArrayList<>();
        cargarModeloTabla();
        initComponents();
        limpiar();
    }

    public static ListaProductos getLp() {
        return lp;
    }
    
    private void FormatoTabla() {
        centrar = new DefaultTableCellRenderer();
        centrar.setHorizontalAlignment(CENTER);
        tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(30);
        tablaProductos.getColumnModel().getColumn(0).setCellRenderer(centrar);
        tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(120);
        tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(40);
        tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(40);
        tablaProductos.getColumnModel().getColumn(3).setCellRenderer(centrar);
        tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
        tablaProductos.getColumnModel().getColumn(4).setCellRenderer(centrar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCod = new javax.swing.JTextField();
        txtPrec = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnConsulta = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnElmininar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodKeyPressed(evt);
            }
        });

        txtPrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecActionPerformed(evt);
            }
        });

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        jLabel1.setText("Precio :");

        jLabel3.setText("Descripción :");

        jLabel4.setText("Código :");

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Mantenedor Productos");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        tablaProductos.setModel(modeloProductos);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnElmininar.setText("Eliminar");
        btnElmininar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElmininarActionPerformed(evt);
            }
        });

        jLabel6.setText("Stock :");

        txtStockMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockMinActionPerformed(evt);
            }
        });

        jLabel7.setText("Stock Mínimo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(48, 48, 48))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCod)
                                                .addGap(19, 19, 19)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnElmininar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnElmininar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtPrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecActionPerformed
    }//GEN-LAST:event_txtPrecActionPerformed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
    }//GEN-LAST:event_txtDescActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (validarTxt()) {
            crearProducto();
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String consulta = JOptionPane.showInputDialog(this, "Ingresar Código de Producto :", "Buscar", JOptionPane.QUESTION_MESSAGE);
        consultaPrecio(consulta);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void txtStockMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockMinActionPerformed
    }//GEN-LAST:event_txtStockMinActionPerformed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String consulta = txtCod.getText();
            consultaPrecio(consulta);
        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void btnElmininarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElmininarActionPerformed
        if (!txtCod.getText().equals("")){
            borrarProducto(txtCod.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Debes ingresar un código de producto válido", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnElmininarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validarTxt()) {
            editProd();
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
      ClickTabla(evt);      
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        System.out.println(evt.toString());
    }//GEN-LAST:event_formWindowStateChanged

    private void ClickTabla(java.awt.event.MouseEvent evt) {       
        int row = tablaProductos.rowAtPoint(evt.getPoint());
        if (row >= 0) {
            txtCod.setText(tablaProductos.getValueAt(row,0).toString());
            txtDesc.setText(tablaProductos.getValueAt(row,1).toString());
            txtPrec.setText(tablaProductos.getValueAt(row,2).toString());
            txtStock.setText(tablaProductos.getValueAt(row,3).toString());
            txtStockMin.setText(tablaProductos.getValueAt(row,4).toString());
        }
    }
    
    private boolean validarTxt() {
        return ( (!txtCod.getText().equals("")) && (!txtPrec.getText().equals("")) && (!txtDesc.getText().equals("")) 
                && (!txtStockMin.getText().equals("")) && (!txtStock.getText().equals("")) );
    }
    
    private void limpiar(){
        txtCod.setText(""); txtStock.setText(""); txtStockMin.setText("");
        txtPrec.setText(""); txtDesc.setText("");
        cargaTablaModelo(lp.getLp());
        tablaProductos.setModel(modeloProductos);
        txtCod.requestFocus();
        FormatoTabla();
    }
	
    private void consultaPrecio(String consulta) {
        if (!"".equals(consulta)) {
            if (!"".equals(lp.buscarProducto(consulta).getCodigo())) {
                Producto prodTemp = lp.buscarProducto(consulta);
                txtCod.setText(prodTemp.getCodigo()); 
                txtDesc.setText(prodTemp.getDescripcion());
                txtPrec.setText(Integer.toString(prodTemp.getPrecio()));
                txtStock.setText(Integer.toString(prodTemp.getStock()));
                txtStockMin.setText(Integer.toString(prodTemp.getStockMin()));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Producto no encontrado, completar datos para Crear");
                limpiar();
                txtCod.setText(consulta);
                txtDesc.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes ingresar un código", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
 
    private void cargaTablaModelo(ArrayList<Producto> productos) {
        String columnas[] = new String[]{"Código", "Descripción", "Precio", "Stock Actual", "Stock Mínimo"};
        modeloProductos = new DefaultTableModel(null, columnas);
        for (int cont = 0;cont < productos.size(); cont++) {
            Object datos[]=new Object[5];
            datos[0]=productos.get(cont).getCodigo(); 
            datos[1]=productos.get(cont).getDescripcion();
            datos[2]="$ "+productos.get(cont).getPrecio()+ ".-";
            datos[3]=productos.get(cont).getStock();
            datos[4]=productos.get(cont).getStockMin();
            modeloProductos.addRow(datos);
        }
    }
    
    private void crearProducto() {
        if ( validarPrecio() && validarStock() ) {
            if ( "".equals(lp.buscarProducto(txtCod.getText()).getCodigo())) {
                try {
                    Producto prodTemp = new Producto(txtCod.getText(), txtDesc.getText(), Integer.parseInt(txtPrec.getText()), Integer.parseInt(txtStock.getText()), Integer.parseInt(txtStockMin.getText()));
                    lp.crearProducto(txtCod.getText(), txtDesc.getText(), Integer.parseInt(txtPrec.getText()), Integer.parseInt(txtStock.getText()), Integer.parseInt(txtStockMin.getText()));
                    JOptionPane.showMessageDialog(this, prodTemp.toString(), "Producto Creado", 1 );
                    cargaTablaModelo(lp.getLp());
                    limpiar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Favor verificar datos ingresados", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El código ingresado ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor verificar datos ingresados", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarModeloTabla() {
        productos.add(new Producto("0001", "Perejíl sin hojas", 65000, 630, 400));
        productos.add(new Producto("0002", "Volantín de Cuero", 50, 3, 5));
        productos.add(new Producto("0003", "Hoyo del queque", 780000, 16, 10));
        productos.add(new Producto("0004", "Tarro con mas duraznos", 1200, 478, 300));
        lp.setLp(productos);
        cargaTablaModelo(lp.getLp());
    }

    private void borrarProducto(String cod) {
        if (lp.eliminarProducto(cod)) {
            JOptionPane.showMessageDialog(rootPane, "Producto eliminado!", "Borrar Producto", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Código ingresado no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void editProd() {
        if (validarPrecio() && validarStock()) {
            try {
                Producto editar = new Producto(txtCod.getText(), txtDesc.getText(), Integer.parseInt(txtPrec.getText()), Integer.parseInt(txtStock.getText()), Integer.parseInt(txtStockMin.getText()));
                if (lp.editarProducto(editar)) {
                    JOptionPane.showMessageDialog(this, "Producto editado", "Editar Producto", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Producto no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } catch ( NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Favor verificar datos ingresados", "Error!", JOptionPane.ERROR_MESSAGE);
            } 
        }   
    }
    
    private boolean validarPrecio() {
        boolean intValid = false;
        try {
            Integer.parseInt(txtPrec.getText());
            intValid = true;
            return intValid;
        } catch (NumberFormatException e){
            try {
                if (txtPrec.getText().charAt(1) == ' ') {
                    txtPrec.setText(txtPrec.getText().replace("$ ", ""));
                    txtPrec.setText(txtPrec.getText().replace(".-", ""));
                    txtPrec.setText(trim(txtPrec.getText()));
                    intValid = true;
                    return intValid;
                }
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(this, "Formato Precio no admitido.\nIngresar solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return intValid;
            }
        }
        JOptionPane.showMessageDialog(this, "Formato Precio no admitido.\nIngresar solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return intValid;
    }
    
    private boolean validarStock() {
        boolean intStockValid = false;
        try {
            Integer.parseInt(txtStock.getText());
            Integer.parseInt(txtStockMin.getText());
            intStockValid = true;
            return intStockValid;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de Stock o Stock Mínimo no admitidos.\nIngresar solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return intStockValid;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnElmininar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrec;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtStockMin;
    // End of variables declaration//GEN-END:variables
}
