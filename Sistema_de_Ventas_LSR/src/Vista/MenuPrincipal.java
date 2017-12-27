package Vista;/** @author Curso-09-04*/

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.ListaProdsVenta;
import modelo.ListaProductos;
import modelo.Producto;
import modelo.ProductoVenta;
import modelo.Venta;


public class MenuPrincipal extends javax.swing.JFrame  {
    private static MantenedorProductos mp;
    private Venta venta; // {<ProductosVenta>, total, efectivo, usuario}
    private ProductoVenta prodVent; // {Codigo, descripcion, cantidad, precio}
    private ArrayList<ProductoVenta> productosVenta;
    private ListaProdsVenta lpv;
    private final String usuario;
    private DefaultTableModel modeloTabla;
    private ListaProductos lp;
    private int total;
    private DefaultTableCellRenderer centrar;
    
    public  MenuPrincipal(String usuario) {
        this.usuario = usuario;
        initComponents();
        TablaVacia();
        lp = new ListaProductos();
        mp = new MantenedorProductos();
        mp.setVisible(false);
        btnNvaVenta.requestFocus();
        jspCant.getEditor().getComponent(0).addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    txtProd.requestFocus();
                }
            }
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    private void cargarModeloTablaVenta(ArrayList<ProductoVenta> lpv) {
        total = 0;
        String columnas[] = new String[]{"Código", "Producto", "Cantidad", "Precio", "SubTotal"};
        modeloTabla = new DefaultTableModel(null, columnas);
        for (int cont = 0;cont < lpv.size(); cont++) {
            Object datos[]=new Object[5];
            datos[0]= lpv.get(cont).getCod(); 
            datos[1]= lpv.get(cont).getDescrip();
            datos[2]= lpv.get(cont).getCant();
            datos[3]= "$ "+lpv.get(cont).getPrecio()+ ".-";
            datos[4]= "$ "+ (lpv.get(cont).getPrecio() * lpv.get(cont).getCant()) +".-";
            total = total + (lpv.get(cont).getPrecio() * lpv.get(cont).getCant());
            modeloTabla.addRow(datos);
            txtTotal.setText("$ "+ String.valueOf(total) +".-");
            tbVenta.setModel(modeloTabla);
            FormatoTabla();
        }
    }
    
    private void TablaVacia() {
        tbVenta.setModel(new DefaultTableModel(null, new String[]{"Código", "Producto", "Cantidad", "Precio", "SubTotal"}));
        FormatoTabla();
    }
    
    private void FormatoTabla() {
        centrar = new DefaultTableCellRenderer();
        centrar.setHorizontalAlignment(CENTER);
        tbVenta.getColumnModel().getColumn(0).setPreferredWidth(40);
        tbVenta.getColumnModel().getColumn(0).setCellRenderer(centrar);
        tbVenta.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbVenta.getColumnModel().getColumn(2).setPreferredWidth(40);
        tbVenta.getColumnModel().getColumn(2).setCellRenderer(centrar);
        tbVenta.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbVenta.getColumnModel().getColumn(3).setCellRenderer(centrar);
        tbVenta.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbVenta.getColumnModel().getColumn(4).setCellRenderer(centrar);
    }
    
    private void nuevaVenta() {
        productosVenta = new ArrayList<>();
        lpv = new ListaProdsVenta(productosVenta);
        txtProd.setEnabled(true);
        jspCant.setEnabled(true);
        txtProd.requestFocus();
        btnNvaVenta.setEnabled(false);
        btnGnrVenta.setEnabled(true);
        txtTotal.setText("$ 0.-");
        jfEfectivo.setValue((int)0);
        jfEfectivo.setEnabled(true);
        txtVuelto.setText("0");
        btnBrrVnta.setEnabled(true);
    }
    
    private void generarVenta() throws Exception {
        if (productosVenta.size() > 0) {
            Venta detalleVenta = new Venta(productosVenta, this.usuario);
            int efectivo = Integer.parseInt(jfEfectivo.getValue().toString());
            detalleVenta.setTotal(total);
            detalleVenta.setEfectivo(efectivo);
            txtVuelto.setText(String.valueOf(efectivo - total));
            System.out.println(detalleVenta.toString());
            txtProd.setText("");
            jspCant.setValue(1);
            txtProd.setEnabled(false);
            jspCant.setEnabled(false);
            btnQuitar.setEnabled(false);
            btnGnrVenta.setEnabled(false);
            btnNvaVenta.setEnabled(true);
            btnNvaVenta.requestFocus();
            total = 0;
            txtTotal.setText("$ 0.-");
            jfEfectivo.setValue(0);
            jfEfectivo.setEnabled(false);
            btnBrrVnta.setEnabled(false);
            TablaVacia();
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtProd = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtVuelto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVenta = new javax.swing.JTable();
        btnQuitar = new javax.swing.JButton();
        btnGnrVenta = new javax.swing.JButton();
        btnBrrVnta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jspCant = new javax.swing.JSpinner();
        btnNvaVenta = new javax.swing.JButton();
        jfEfectivo = new javax.swing.JFormattedTextField();
        btnConsulta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuProd = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        acercaDe = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas L.S.R. v 1.0");
        setResizable(false);

        txtProd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProd.setEnabled(false);
        txtProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdKeyPressed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtVuelto.setEditable(false);
        txtVuelto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtVuelto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tbVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbVenta);

        btnQuitar.setText("Quitar Producto");
        btnQuitar.setEnabled(false);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        btnGnrVenta.setText("Generar Venta");
        btnGnrVenta.setEnabled(false);
        btnGnrVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGnrVentaActionPerformed(evt);
            }
        });

        btnBrrVnta.setText("Desechar");
        btnBrrVnta.setEnabled(false);
        btnBrrVnta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrrVntaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Producto  : ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("TOTAL :");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Efectivo :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Vuelto :");

        btnCalc.setText("Calculadora");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad :");

        jspCant.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jspCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jspCant.setEnabled(false);

        btnNvaVenta.setText("Nueva Venta");
        btnNvaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvaVentaActionPerformed(evt);
            }
        });

        jfEfectivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jfEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jfEfectivo.setEnabled(false);
        jfEfectivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jfEfectivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jfEfectivoFocusGained(evt);
            }
        });
        jfEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfEfectivoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jfEfectivoKeyTyped(evt);
            }
        });

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        jMenu1.setText("Mantenedores");

        menuProd.setText("de Productos");
        menuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdActionPerformed(evt);
            }
        });
        jMenu1.add(menuProd);

        menuUser.setText("de Usuarios");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        jMenu1.add(menuUser);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editor");

        jMenuItem1.setText("Anular Venta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Ayuda");

        acercaDe.setText("Acerca de");
        acercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });
        jMenu5.add(acercaDe);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspCant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(btnQuitar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCalc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNvaVenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnBrrVnta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addComponent(jfEfectivo)
                    .addComponent(txtVuelto)
                    .addComponent(btnGnrVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6))
                    .addComponent(jspCant)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGnrVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBrrVnta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNvaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdActionPerformed
        mp.setLocationRelativeTo(null);
        mp.setVisible(true);
    }//GEN-LAST:event_menuProdActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        MantenedorUsuarios mu = new MantenedorUsuarios();
        mu.setVisible(true);
        mu.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuUserActionPerformed

    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed
        ImageIcon iconoAyuda = new ImageIcon(getClass().getResource("/imagenes/asia.gif"));
        JOptionPane.showMessageDialog(this, "Aplicación Modulo 7 \"LSR\" 1.0.0\n     /**  author Curso-09-04  */\n              Jaime Avaria\n","Acerca de", JOptionPane.INFORMATION_MESSAGE, iconoAyuda);
    }//GEN-LAST:event_acercaDeActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void txtProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtProd.getText())) {
                if (!"".equals( (MantenedorProductos.getLp().buscarProducto( txtProd.getText()).getCodigo()) )) { 
                    Producto prodTemp = MantenedorProductos.getLp().buscarProducto(txtProd.getText());
                    prodVent = new ProductoVenta(prodTemp.getCodigo(), prodTemp.getDescripcion(), (int)jspCant.getValue(), prodTemp.getPrecio());
                    lpv.agregarProdVenta(prodVent);
                    cargarModeloTablaVenta(lpv.getLpv());
                    btnQuitar.setEnabled(true);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
                txtProd.setText("");
                jspCant.setValue(1);
            } else {
                    Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_txtProdKeyPressed
      
    private void btnNvaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvaVentaActionPerformed
        nuevaVenta();
    }//GEN-LAST:event_btnNvaVentaActionPerformed

    private void btnGnrVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGnrVentaActionPerformed
        try {
            generarVenta();
        } catch (Exception ex) {
            System.out.println("Excepcion! en generar venta"); // COMPROBAR Y ELIMINAR *********************************** ////////////////////////
        }
    }//GEN-LAST:event_btnGnrVentaActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        Producto p = lp.buscarProducto(JOptionPane.showInputDialog(this, "Ingresar Código de producto :", "Consulta Producto", JOptionPane.QUESTION_MESSAGE));
        if (!"".equals(p.getCodigo())) {
            JOptionPane.showMessageDialog(this, p.toString(), "Detalle Producto ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "      Producto no existe", "No encontrado",JOptionPane.WARNING_MESSAGE);
        } if (txtProd.isEnabled()) {
            txtProd.requestFocus();
        } else { 
            btnNvaVenta.requestFocus();
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void jfEfectivoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jfEfectivoFocusGained
        SwingUtilities.invokeLater(() -> {
            jfEfectivo.selectAll();
        }); 
    }//GEN-LAST:event_jfEfectivoFocusGained

    private void btnBrrVntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrrVntaActionPerformed
        TablaVacia();
        txtTotal.setText("$ 0.-");
        productosVenta.clear();
        btnBrrVnta.setEnabled(false);
        btnGnrVenta.setEnabled(false);
        btnNvaVenta.setEnabled(true);
        btnQuitar.setEnabled(false);
        txtProd.setEnabled(false);
        jspCant.setEnabled(false);
        btnNvaVenta.requestFocus();
        jfEfectivo.setEnabled(false);
        txtProd.setText("");
        jspCant.setValue(1);
    }//GEN-LAST:event_btnBrrVntaActionPerformed

    private void jfEfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfEfectivoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {  try {generarVenta();} catch (Exception ex) {}   });  
        }
    }//GEN-LAST:event_jfEfectivoKeyPressed

    private void jfEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfEfectivoKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jfEfectivoKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Al anular una venta id_venta - 1
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if (!"".equals(txtProd.getText())) {
            char result = lpv.quitarProdVenta(txtProd.getText());
            switch (result) {
                case 'v': // si el array está vacio
                    btnQuitar.setEnabled(false);
                    TablaVacia();
                    txtTotal.setText("$ 0.-");
                    jfEfectivo.setValue(0);
                    break;
                case 'b': // si se eliminó un producto del array
                    cargarModeloTablaVenta(lpv.getLpv());
                    break;
                default: // si nó se encontró el producto
                    Toolkit.getDefaultToolkit().beep();
                    txtProd.requestFocus();
            }
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
        txtProd.setText("");
        txtProd.requestFocus();
    }//GEN-LAST:event_btnQuitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDe;
    private javax.swing.JButton btnBrrVnta;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnGnrVenta;
    private javax.swing.JButton btnNvaVenta;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jfEfectivo;
    private javax.swing.JSpinner jspCant;
    private javax.swing.JMenuItem menuProd;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JTable tbVenta;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVuelto;
    // End of variables declaration//GEN-END:variables
}