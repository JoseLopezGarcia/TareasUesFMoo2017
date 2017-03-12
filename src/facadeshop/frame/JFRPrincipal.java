/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeshop.frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jose Lopez Garcia
 */
public final class JFRPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFRPrincipal
     * UN SOLO COMENTARIO
     */
    boolean ventas, compras, productos, proveedores;
    boolean apagado;
    public JFRPrincipal() {
        initComponents();
        ventas = compras = productos = proveedores = apagado = false;
        btnVentas.setBorder(null);
        btnCompras.setBorder(null);
        btnProductos.setBorder(null);
        btnProveedores.setBorder(null);
        apagado2();
        habilitarPrincipal();
        suspenderCompras();
        suspenderVentas();
        suspenderProductos();
        suspenderProveedores();
    }
  
    public void suspenderPrincipal(){
        if(!jpnProveedores.isVisible()){
        lblMitad1.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        }else{
      }
    }
    public void habilitarPrincipal(){
        if(!jpnProveedores.isVisible()){
        lblMitad1.setVisible(true);
        lbl3.setVisible(true);
        lbl4.setVisible(true);
        lbl5.setVisible(true);
        lbl6.setVisible(true);
        lbl7.setVisible(true);
        }else{
      }
    }
    public void suspenderCompras(){
        if(!jpnProveedores.isVisible()){
        lblMitad2.setVisible(false);
        lbl11.setVisible(false);
        lbl12.setVisible(false);
        lbl13.setVisible(false);
        lbl14.setVisible(false);
        lbl15.setVisible(false);
        }else{
      }
    }
    public void habilitarCompras(){
        if(!jpnProveedores.isVisible()){
        lblMitad2.setVisible(true);
        lbl11.setVisible(true);
        lbl12.setVisible(true);
        lbl13.setVisible(true);
        lbl14.setVisible(true);
        lbl15.setVisible(true);
        }else{
      }
    }
    public void suspenderVentas(){
        if(!jpnProveedores.isVisible()){
        lblMitad3.setVisible(false);
        lbl21.setVisible(false);
        lbl22.setVisible(false);
        lbl23.setVisible(false);
        lbl24.setVisible(false);
        lbl25.setVisible(false);
        }else{
      }
    }
    public void habilitarVentas(){
        if(!jpnProveedores.isVisible()){
        lblMitad3.setVisible(true);
        lbl21.setVisible(true);
        lbl22.setVisible(true);
        lbl23.setVisible(true);
        lbl24.setVisible(true);
        lbl25.setVisible(true);
        }else{
      }
    }
    public void suspenderProductos(){
        if(!jpnProveedores.isVisible()){
        lblMitad4.setVisible(false);
        lbl31.setVisible(false);
        lbl32.setVisible(false);
        lbl33.setVisible(false);
        lbl34.setVisible(false);
        lbl35.setVisible(false);
        }else{
      }
    }
    public void habilitarProductos(){
        if(!jpnProveedores.isVisible()){
        lblMitad4.setVisible(true);
        lbl31.setVisible(true);
        lbl32.setVisible(true);
        lbl33.setVisible(true);
        lbl34.setVisible(true);
        lbl35.setVisible(true);
        }else{
      }
    }
    public void suspenderProveedores(){
        if(!jpnProveedores.isVisible()){
        lblMitad5.setVisible(false);
        lbl41.setVisible(false);
        lbl42.setVisible(false);
        lbl43.setVisible(false);
        lbl44.setVisible(false);
        lbl45.setVisible(false);
        }else{
      }
    }
    public void habilitarProveedores(){
        if(!jpnProveedores.isVisible()){
        lblMitad5.setVisible(true);
        lbl41.setVisible(true);
        lbl42.setVisible(true);
        lbl43.setVisible(true);
        lbl44.setVisible(true);
        lbl45.setVisible(true);
        }else{
      }
    }
    public void apagado(){
        apagado = true;
        jpnPrincipal.setVisible(false);
        
    }
    public void apagado2(){
        jpnProveedores.setVisible(false);
        jpnAgregarProv.setVisible(false);
        jpnVentas.setVisible(false);
        jpnProductos.setVisible(false);
        jpnBuscarProducto.setVisible(false);
        jpnNuevoProducto.setVisible(false);
        jpnRegistroCompra.setVisible(false);
        jpnCompras.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCompras = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnHome = new javax.swing.JLabel();
        jpnPrincipal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lblMitad5 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lblMitad4 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lblMitad3 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lblMitad1 = new javax.swing.JLabel();
        lblMitad2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jpnProveedores = new javax.swing.JPanel();
        btnEliminarProveedor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblProveedores = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpnAgregarProv = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtIDProveedor = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        btnGuardarProveedor = new javax.swing.JButton();
        btnAtrasProveedores = new javax.swing.JButton();
        jpnVentas = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        txtCodigoBarraVender = new javax.swing.JTextField();
        txtIdVenta = new javax.swing.JTextField();
        btnBuscarProductoVenta = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtNombreProductoVender = new javax.swing.JTextField();
        txtCantidadVender = new javax.swing.JTextField();
        btnAgregarProductoVenta = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductosVender = new javax.swing.JTable();
        btnVender = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtPrecioProductoVender = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        lblProveedores1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jpnBuscarProducto = new javax.swing.JPanel();
        rbtnNombreProducto = new javax.swing.JRadioButton();
        rbtnCodBarraProducto = new javax.swing.JRadioButton();
        lblSeleccionFiltro = new javax.swing.JLabel();
        lblCodBarraFlitrosProductos = new javax.swing.JLabel();
        txtCodBarraFiltroProductos = new javax.swing.JTextField();
        lblNombreFiltrosProductos = new javax.swing.JLabel();
        txtNombreFiltrosProductos = new javax.swing.JTextField();
        lblCodBarraFiltroAlternativa = new javax.swing.JLabel();
        cmbCodBarraFiltrosProductos = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cmbNombreFiltrosProductos = new javax.swing.JComboBox<>();
        btnBuscarFiltrosProductos = new javax.swing.JButton();
        lblFiltrosProductos = new javax.swing.JLabel();
        btnEditarFiltrosProductos = new javax.swing.JButton();
        btnEliminarFiltroProductos = new javax.swing.JButton();
        btnSalirFiltroProducto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtblBuscarFiltroProductos = new javax.swing.JTable();
        jPanel36 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jpnProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblProductos = new javax.swing.JTable();
        btnNuevoProducto = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        lblProveedores2 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jpnNuevoProducto = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtCodBarraProductos = new javax.swing.JTextField();
        txtNombreProductos = new javax.swing.JTextField();
        txtPrecioProductos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSalirProductos = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jpnRegistroCompra = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jpnIdCompra = new javax.swing.JPanel();
        lblIdCompra = new javax.swing.JLabel();
        txtIdCompra = new javax.swing.JTextField();
        jpnProveedor = new javax.swing.JPanel();
        lblProveedor = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox();
        jpnCabezeraTablaCompra = new javax.swing.JPanel();
        lblIdProducto = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        jpnTotal = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jpnFecha = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jpnCompras = new javax.swing.JPanel();
        jpnCabeceraTabla = new javax.swing.JPanel();
        lblCabeceraTabla = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        btnAgregarCompra = new javax.swing.JButton();
        jpnRegistrarCompras = new javax.swing.JPanel();
        lblRegistrarCompra = new javax.swing.JLabel();
        jpnVerDetalle = new javax.swing.JPanel();
        lblVerDetalle = new javax.swing.JLabel();
        btnVerDetalle = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        lblProveedores3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/buscar48.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, -2, 50, 60));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 10));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 190, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/exit32.png"))); // NOI18N
        jLabel6.setToolTipText("Salir");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/config48.png"))); // NOI18N
        jLabel5.setToolTipText("Ajustes del Sistema");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 55));

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/mas32.png"))); // NOI18N
        lblMenu.setText("Menu");
        jPanel2.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 15, 90, 50));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/compras.png"))); // NOI18N
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
        });
        jPanel3.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 20, 180, 40));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/productos.png"))); // NOI18N
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        jPanel3.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 120, 180, 40));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/ventas.png"))); // NOI18N
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        jPanel3.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 70, 180, 40));

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/proveedores.png"))); // NOI18N
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseExited(evt);
            }
        });
        jPanel3.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 170, 180, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 190, 230));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/Home48.png"))); // NOI18N
        btnHome.setToolTipText("Inicio");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 600));

        jpnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl41.setForeground(new java.awt.Color(255, 255, 255));
        lbl41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/Entypo_e78e(0)_32.png"))); // NOI18N
        lbl41.setText("Proveedores");
        jPanel4.add(lbl41, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 160, -1));

        lbl42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl42.setForeground(new java.awt.Color(102, 102, 102));
        lbl42.setText("¿Deseas nuevas alianzas?");
        jPanel4.add(lbl42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        lbl43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl43.setForeground(new java.awt.Color(102, 102, 102));
        lbl43.setText("¡Estamos para eso!");
        jPanel4.add(lbl43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 30));

        lbl44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl44.setForeground(new java.awt.Color(102, 102, 102));
        lbl44.setText("Usa esta opción y agrega");
        jPanel4.add(lbl44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 160, -1));

        lbl45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl45.setForeground(new java.awt.Color(102, 102, 102));
        lbl45.setText("a tus nuevos proveedores.");
        jPanel4.add(lbl45, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 30));

        lblMitad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad5.jpg"))); // NOI18N
        jPanel4.add(lblMitad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 480));
        lblMitad5.getAccessibleContext().setAccessibleName("lblMitad5");

        lbl31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl31.setForeground(new java.awt.Color(255, 255, 255));
        lbl31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/Entypo_e738(1)_32.png"))); // NOI18N
        lbl31.setText("Productos");
        jPanel4.add(lbl31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, -1));

        lbl32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl32.setForeground(new java.awt.Color(102, 102, 102));
        lbl32.setText("Podrás manejar los productos");
        jPanel4.add(lbl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, -1));

        lbl33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl33.setForeground(new java.awt.Color(102, 102, 102));
        lbl33.setText("de tu sistema de Tienda.");
        jPanel4.add(lbl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        lbl34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl34.setForeground(new java.awt.Color(102, 102, 102));
        lbl34.setText("Usa esta opción para modificar,");
        jPanel4.add(lbl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, -1));

        lbl35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl35.setForeground(new java.awt.Color(102, 102, 102));
        lbl35.setText("agregar o eliminar Productos.");
        jPanel4.add(lbl35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 30));

        lblMitad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad4.jpg"))); // NOI18N
        jPanel4.add(lblMitad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 220, 480));

        lbl21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl21.setForeground(new java.awt.Color(255, 255, 255));
        lbl21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/Entypo_e789(2)_32.png"))); // NOI18N
        lbl21.setText("Ventas");
        jPanel4.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 100, -1));

        lbl22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl22.setForeground(new java.awt.Color(102, 102, 102));
        lbl22.setText("Podrás manejar los ingresos");
        jPanel4.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        lbl23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl23.setForeground(new java.awt.Color(102, 102, 102));
        lbl23.setText("que obtiene tu tienda.");
        jPanel4.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 30));

        lbl24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl24.setForeground(new java.awt.Color(102, 102, 102));
        lbl24.setText("Usa esta opción y maneja");
        jPanel4.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 160, -1));

        lbl25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl25.setForeground(new java.awt.Color(102, 102, 102));
        lbl25.setText("el sistema de Ventas.");
        jPanel4.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, 30));

        lblMitad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad3.jpg"))); // NOI18N
        lblMitad3.setText("jLabel2");
        jPanel4.add(lblMitad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 480));

        lbl11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/Entypo_e73d(0)_32.png"))); // NOI18N
        lbl11.setText("Compras");
        jPanel4.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, -1));

        lbl12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl12.setForeground(new java.awt.Color(102, 102, 102));
        lbl12.setText("Podrás realizar compras y ");
        jPanel4.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lbl13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl13.setForeground(new java.awt.Color(102, 102, 102));
        lbl13.setText("abastecer tu Tienda.");
        jPanel4.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        lbl14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl14.setForeground(new java.awt.Color(102, 102, 102));
        lbl14.setText("Usa esta opción para manejar");
        jPanel4.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, -1));

        lbl15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl15.setForeground(new java.awt.Color(102, 102, 102));
        lbl15.setText("el sistema de Compras.");
        jPanel4.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        lblMitad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad.jpg"))); // NOI18N
        jPanel4.add(lblMitad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 480));

        lblMitad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad2.jpg"))); // NOI18N
        jPanel4.add(lblMitad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 220, 480));

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/Entypo_e776(0)_48.png"))); // NOI18N
        jPanel4.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 60));

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("iShop");
        jPanel4.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 50, -1));

        lbl7.setBackground(new java.awt.Color(153, 153, 153));
        lbl7.setForeground(new java.awt.Color(102, 102, 102));
        lbl7.setText("Versión 1.0");
        jPanel4.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(102, 102, 102));
        lbl5.setText("Te damos la bienvenida a tu");
        jPanel4.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        lbl6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(102, 102, 102));
        lbl6.setText("nuevo sistema de Tienda.");
        jPanel4.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, 20));

        jpnPrincipal.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 440, 480));

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.jpg"))); // NOI18N
        jpnPrincipal.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 740, 600));

        getContentPane().add(jpnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 750, 600));

        jpnProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/eliminar.png"))); // NOI18N
        btnEliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnProveedores.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 110, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProveedores.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblProveedores.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores.setText("Proveedores");
        jPanel5.add(lblProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 110, -1));

        jpnProveedores.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elimina a un proveedor:");
        jPanel6.add(jLabel2);

        jpnProveedores.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 170, -1));

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agrega a un nuevo proveedor:");
        jPanel7.add(jLabel3);

        jpnProveedores.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 210, -1));

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modifica la información de un proveedor:");
        jPanel8.add(jLabel4);

        jpnProveedores.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 270, -1));

        btnAgregarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/agregarprov.png"))); // NOI18N
        btnAgregarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProveedor.setFocusCycleRoot(true);
        btnAgregarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProveedorMouseClicked(evt);
            }
        });
        jpnProveedores.add(btnAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 110, 30));

        btnModificarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/modificar.png"))); // NOI18N
        btnModificarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnProveedores.add(btnModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 110, 30));

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idProveedor", "Nombre", "Teléfono", "Dirección", "NIT"
            }
        ));
        jScrollPane1.setViewportView(tblProveedores);

        jpnProveedores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 670, 330));

        jPanel9.setBackground(new java.awt.Color(102, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Listado de los Proveedores actuales:");
        jPanel9.add(jLabel7);

        jpnProveedores.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, -1));

        getContentPane().add(jpnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnAgregarProv.setPreferredSize(new java.awt.Dimension(95, 95));
        jpnAgregarProv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 5, -1, 20));

        jpnAgregarProv.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 50, 30));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Agrega un nuevo proveedor:");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 5, -1, 20));

        jpnAgregarProv.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 240, 30));

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NIT:");
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 5, -1, 20));

        jpnAgregarProv.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 110, 30));

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre:");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 5, -1, 20));

        jpnAgregarProv.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, 30));

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Teléfono:");
        jPanel14.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 5, -1, 20));

        jpnAgregarProv.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 30));

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dirección:");
        jPanel15.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, -1, 20));

        jpnAgregarProv.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 30));
        jpnAgregarProv.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 410, 30));

        txtIDProveedor.setEditable(false);
        jpnAgregarProv.add(txtIDProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 90, 30));
        jpnAgregarProv.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 230, 30));

        txtNombreProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpnAgregarProv.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 410, 30));
        jpnAgregarProv.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 230, 30));

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/guardarprov.png"))); // NOI18N
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnAgregarProv.add(btnGuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 110, 30));

        btnAtrasProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/atras.png"))); // NOI18N
        btnAtrasProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtrasProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasProveedoresMouseClicked(evt);
            }
        });
        jpnAgregarProv.add(btnAtrasProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 110, 30));

        getContentPane().add(jpnAgregarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 56, 730, 590));

        jpnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoBarraVender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodigoBarraVender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel16.add(txtCodigoBarraVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 30));

        txtIdVenta.setEditable(false);
        txtIdVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIdVenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel16.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 140, 30));

        btnBuscarProductoVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/buscar.png"))); // NOI18N
        btnBuscarProductoVenta.setBorder(null);
        btnBuscarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(btnBuscarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 110, 30));

        jPanel18.setBackground(new java.awt.Color(102, 0, 0));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Codigo de Barra");
        jPanel18.add(jLabel19);

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, -1));

        jPanel20.setBackground(new java.awt.Color(102, 0, 0));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ID Venta");
        jPanel20.add(jLabel20);

        jPanel16.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, -1));

        jpnVentas.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 741, 80));

        txtNombreProductoVender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnVentas.add(txtNombreProductoVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 360, 40));

        txtCantidadVender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnVentas.add(txtCantidadVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 80, 40));

        btnAgregarProductoVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/agregar2.png"))); // NOI18N
        btnAgregarProductoVenta.setBorder(null);
        btnAgregarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnVentas.add(btnAgregarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 195, 110, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpnVentas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 690, 10));

        tblProductosVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod Barra", "Producto", "Cantidad", "Precio Unitario", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductosVender.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProductosVender);

        jpnVentas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 710, 240));

        btnVender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnVentas.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 120, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/Eliminar.png"))); // NOI18N
        jButton4.setToolTipText("Eliminar Productos Seleccionados");
        jpnVentas.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 110, 30));

        txtPrecioProductoVender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnVentas.add(txtPrecioProductoVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 40));

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProveedores1.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblProveedores1.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores1.setText("Ventas");
        jPanel19.add(lblProveedores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, -1));

        jpnVentas.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 40));

        jPanel17.setBackground(new java.awt.Color(102, 0, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cantidad");
        jPanel17.add(jLabel16);

        jpnVentas.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 80, -1));

        jPanel21.setBackground(new java.awt.Color(102, 0, 0));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Producto");
        jPanel21.add(jLabel21);

        jpnVentas.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        jPanel22.setBackground(new java.awt.Color(102, 0, 0));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Precio");
        jPanel22.add(jLabel22);

        jpnVentas.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 80, -1));

        getContentPane().add(jpnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 600));

        jpnBuscarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnNombreProducto.setText("Nombre del producto");
        jpnBuscarProducto.add(rbtnNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        rbtnCodBarraProducto.setText("Código de barra");
        jpnBuscarProducto.add(rbtnCodBarraProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        lblSeleccionFiltro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSeleccionFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar Filtro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jpnBuscarProducto.add(lblSeleccionFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 290, 160));

        lblCodBarraFlitrosProductos.setText("Código de barra:");
        jpnBuscarProducto.add(lblCodBarraFlitrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));
        jpnBuscarProducto.add(txtCodBarraFiltroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 220, -1));

        lblNombreFiltrosProductos.setText("Nombre:");
        jpnBuscarProducto.add(lblNombreFiltrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));
        jpnBuscarProducto.add(txtNombreFiltrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 220, -1));

        lblCodBarraFiltroAlternativa.setText("Manera alternativa:");
        jpnBuscarProducto.add(lblCodBarraFiltroAlternativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        cmbCodBarraFiltrosProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpnBuscarProducto.add(cmbCodBarraFiltrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 220, -1));

        jLabel31.setText("Manera alternativa:");
        jpnBuscarProducto.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        cmbNombreFiltrosProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpnBuscarProducto.add(cmbNombreFiltrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 220, -1));

        btnBuscarFiltrosProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/buscar.png"))); // NOI18N
        btnBuscarFiltrosProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnBuscarProducto.add(btnBuscarFiltrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 110, 30));

        lblFiltrosProductos.setBackground(new java.awt.Color(102, 0, 0));
        lblFiltrosProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFiltrosProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jpnBuscarProducto.add(lblFiltrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 370, 240));

        btnEditarFiltrosProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/modificar.png"))); // NOI18N
        btnEditarFiltrosProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnBuscarProducto.add(btnEditarFiltrosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 551, 110, 30));

        btnEliminarFiltroProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/eliminar.png"))); // NOI18N
        btnEliminarFiltroProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnBuscarProducto.add(btnEliminarFiltroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 110, 30));

        btnSalirFiltroProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/salir.png"))); // NOI18N
        btnSalirFiltroProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirFiltroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirFiltroProductoActionPerformed(evt);
            }
        });
        jpnBuscarProducto.add(btnSalirFiltroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 110, 30));

        jtblBuscarFiltroProductos =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtblBuscarFiltroProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código de barra", "Nombre", "Precio"
            }
        ));
        jtblBuscarFiltroProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jtblBuscarFiltroProductos);

        jpnBuscarProducto.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 640, 200));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Buscar un Producto:");
        jPanel36.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));

        jpnBuscarProducto.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 240, 30));

        getContentPane().add(jpnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 750, 600));

        jpnProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblProductos =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código de Barra", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtblProductos);

        jpnProductos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 650, 260));

        btnNuevoProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/nuevo3.png"))); // NOI18N
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        jpnProductos.add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 110, 30));

        btnBuscarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/buscar.png"))); // NOI18N
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jpnProductos.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 110, 30));

        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/modificar.png"))); // NOI18N
        btnModificarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnProductos.add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 110, 30));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/eliminar.png"))); // NOI18N
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnProductos.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 110, 30));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProveedores2.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblProveedores2.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores2.setText("Productos");
        jPanel23.add(lblProveedores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jpnProductos.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 40));

        jPanel24.setBackground(new java.awt.Color(102, 0, 0));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Listado de los Productos:");
        jPanel24.add(jLabel14);

        jpnProductos.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, -1));

        jPanel25.setBackground(new java.awt.Color(102, 0, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Elimina un producto:");
        jPanel25.add(jLabel15);

        jpnProductos.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 140, -1));

        jPanel26.setBackground(new java.awt.Color(102, 0, 0));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Agrega un producto:");
        jPanel26.add(jLabel17);

        jpnProductos.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 150, -1));

        jPanel27.setBackground(new java.awt.Color(102, 0, 0));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Modifica un producto:");
        jPanel27.add(jLabel18);

        jpnProductos.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 150, -1));

        jPanel28.setBackground(new java.awt.Color(102, 0, 0));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Busca un producto:");
        jPanel28.add(jLabel23);

        jpnProductos.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 130, -1));

        getContentPane().add(jpnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 730, 600));

        jpnNuevoProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Agrega un nuevo producto:");
        jPanel29.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 0, 180, 30));

        jpnNuevoProducto.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 240, 30));

        jPanel30.setBackground(new java.awt.Color(102, 0, 0));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Precio:");
        jPanel30.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 0, 60, 30));

        jPanel31.setBackground(new java.awt.Color(102, 0, 0));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Código de barra:");
        jPanel31.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 5, -1, 20));

        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 30));

        jpnNuevoProducto.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 130, 30));
        jpnNuevoProducto.add(txtCodBarraProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 220, 30));
        jpnNuevoProducto.add(txtNombreProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 340, 30));
        jpnNuevoProducto.add(txtPrecioProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 70, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/agregar2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnNuevoProducto.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 110, 30));

        btnSalirProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/salir.png"))); // NOI18N
        btnSalirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProductosActionPerformed(evt);
            }
        });
        jpnNuevoProducto.add(btnSalirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 110, 30));

        jPanel32.setBackground(new java.awt.Color(102, 0, 0));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Código de barra:");
        jPanel32.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 5, -1, 20));

        jPanel33.setBackground(new java.awt.Color(102, 0, 0));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Código de barra:");
        jPanel33.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 5, -1, 20));

        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 30));

        jpnNuevoProducto.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 30));

        jPanel34.setBackground(new java.awt.Color(102, 0, 0));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Nombre:");
        jPanel34.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jPanel35.setBackground(new java.awt.Color(102, 0, 0));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Código de barra:");
        jPanel35.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 5, -1, 20));

        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 30));

        jpnNuevoProducto.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, 30));

        getContentPane().add(jpnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 750, 600));

        jpnRegistroCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpnRegistroCompra.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 5, -1, -1));

        jpnIdCompra.setBackground(new java.awt.Color(102, 0, 0));
        jpnIdCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblIdCompra.setText("Id Compra:");
        jpnIdCompra.add(lblIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        jpnRegistroCompra.add(jpnIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));

        txtIdCompra.setText("001");
        txtIdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCompraActionPerformed(evt);
            }
        });
        jpnRegistroCompra.add(txtIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 60, 30));

        jpnProveedor.setBackground(new java.awt.Color(102, 0, 0));
        jpnProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("Proveedor:");
        jpnProveedor.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        jpnRegistroCompra.add(jpnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 110, 30));

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pollo Indio", "SONY", "Niña Mirna" }));
        jpnRegistroCompra.add(cmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 200, 30));

        jpnCabezeraTablaCompra.setBackground(new java.awt.Color(102, 0, 0));
        jpnCabezeraTablaCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblIdProducto.setText("Id Producto");
        jpnCabezeraTablaCompra.add(lblIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 90, 20));

        lblProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Producto");
        jpnCabezeraTablaCompra.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 20));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("Cantidad");
        jpnCabezeraTablaCompra.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 80, 20));

        lblCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(255, 255, 255));
        lblCosto.setText("Costo");
        jpnCabezeraTablaCompra.add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 50, 20));

        jpnRegistroCompra.add(jpnCabezeraTablaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 660, 20));

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblCompra);

        jpnRegistroCompra.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 660, 230));

        jpnTotal.setBackground(new java.awt.Color(102, 0, 0));
        jpnTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total:");
        jpnTotal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jpnRegistroCompra.add(jpnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 60, 40));

        txtTotal.setText("$");
        jpnRegistroCompra.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 100, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/guardarprov.png"))); // NOI18N
        jpnRegistroCompra.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 110, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/atras.png"))); // NOI18N
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jpnRegistroCompra.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 110, 30));

        jpnFecha.setBackground(new java.awt.Color(102, 0, 0));
        jpnFecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha:");
        jpnFecha.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jpnRegistroCompra.add(jpnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, 30));
        jpnRegistroCompra.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 30));

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Agregar una Compra:");
        jPanel39.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));

        jpnRegistroCompra.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 240, 30));

        getContentPane().add(jpnRegistroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 55, 740, 600));

        jpnCompras.setName("jpnCompras"); // NOI18N
        jpnCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnCabeceraTabla.setBackground(new java.awt.Color(102, 0, 0));
        jpnCabeceraTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCabeceraTabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCabeceraTabla.setForeground(new java.awt.Color(255, 255, 255));
        lblCabeceraTabla.setText("Listado de Compras Efectuadas:");
        jpnCabeceraTabla.add(lblCabeceraTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jpnCompras.add(jpnCabeceraTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 640, 30));

        tblCompras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Compra 1"},
                {"Compra 2"},
                {"Compra 3"},
                {"Compra 4"}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane5.setViewportView(tblCompras);

        jpnCompras.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 640, 310));

        btnAgregarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/agregar.png"))); // NOI18N
        btnAgregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompraActionPerformed(evt);
            }
        });
        jpnCompras.add(btnAgregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 110, 30));

        jpnRegistrarCompras.setBackground(new java.awt.Color(102, 0, 0));
        jpnRegistrarCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarCompra.setText("Agregar nueva compra:");
        jpnRegistrarCompras.add(lblRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 30));

        jpnCompras.add(jpnRegistrarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 190, 30));

        jpnVerDetalle.setBackground(new java.awt.Color(102, 0, 0));
        jpnVerDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVerDetalle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVerDetalle.setForeground(new java.awt.Color(255, 255, 255));
        lblVerDetalle.setText("Ver detalle de compra:");
        jpnVerDetalle.add(lblVerDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        jpnCompras.add(jpnVerDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 160, 30));

        btnVerDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facadeshop/icons/detalles2.png"))); // NOI18N
        btnVerDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerDetalleMouseClicked(evt);
            }
        });
        btnVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetalleActionPerformed(evt);
            }
        });
        jpnCompras.add(btnVerDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 110, 30));

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProveedores3.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblProveedores3.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores3.setText("Compras");
        jPanel37.add(lblProveedores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, -1));

        jpnCompras.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 40));

        getContentPane().add(jpnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 55, 740, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        // TODO add your handling code here:
        if(!compras)
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnCompras);
        suspenderPrincipal();
        habilitarCompras();
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        // TODO add your handling code here:
        if(!compras)
        Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnCompras);
        habilitarPrincipal();
        suspenderCompras();
    }//GEN-LAST:event_btnComprasMouseExited

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        // TODO add your handling code here:
        if(!ventas)
            Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnVentas);
            suspenderPrincipal();
            habilitarVentas();
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        // TODO add your handling code here:
        if(!ventas)
            Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnVentas);  
            habilitarPrincipal();
            suspenderVentas();
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        // TODO add your handling code here:
        if(!productos)
            Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProductos);   
            suspenderPrincipal();
            habilitarProductos();
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        // TODO add your handling code here:
        if(!productos)
            Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnProductos); 
            habilitarPrincipal();
            suspenderProductos();
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        // TODO add your handling code here:
        if(!proveedores)
            Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProveedores);   
            suspenderPrincipal();
            habilitarProveedores();
    }//GEN-LAST:event_btnProveedoresMouseEntered

    private void btnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseExited
        // TODO add your handling code here:
     if(apagado==false){
     if(!proveedores)
            Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnProveedores); 
            habilitarPrincipal();
            suspenderProveedores();
     }else{}
                
    }//GEN-LAST:event_btnProveedoresMouseExited

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        // TODO add your handling code here:
        apagado();
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProveedores);  
        jpnProveedores.setVisible(true);
        jpnVentas.setVisible(false);
        jpnProductos.setVisible(false);
        jpnCompras.setVisible(false);
        
    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        apagado2();
        apagado = false;
        jpnPrincipal.setVisible(true);
        habilitarPrincipal();
        suspenderCompras();
        suspenderVentas();
        suspenderProductos();
        suspenderProveedores();
        
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnAgregarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProveedorMouseClicked
        // TODO add your handling code here:
        jpnProveedores.setVisible(false);
        jpnAgregarProv.setVisible(true);
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProveedores);  
    }//GEN-LAST:event_btnAgregarProveedorMouseClicked

    private void btnAtrasProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasProveedoresMouseClicked
        // TODO add your handling code here:
        jpnAgregarProv.setVisible(false);
        jpnProveedores.setVisible(true);
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProveedores); 
    }//GEN-LAST:event_btnAtrasProveedoresMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        // TODO add your handling code here:
        apagado();
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnVentas);  
        jpnVentas.setVisible(true);
        jpnProveedores.setVisible(false);
        jpnProductos.setVisible(false);
        jpnCompras.setVisible(false);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        jpnProductos.setVisible(false);
        jpnNuevoProducto.setVisible(true);

    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        jpnProductos.setVisible(false);
        jpnBuscarProducto.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProductosActionPerformed

            jpnNuevoProducto.setVisible(false);
            jpnProductos.setVisible(true);
    }//GEN-LAST:event_btnSalirProductosActionPerformed

    private void btnSalirFiltroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirFiltroProductoActionPerformed

            jpnBuscarProducto.setVisible(false);
            jpnProductos.setVisible(true);
    }//GEN-LAST:event_btnSalirFiltroProductoActionPerformed

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        // TODO add your handling code here:
        apagado();
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProductos);  
        jpnVentas.setVisible(false);
        jpnProveedores.setVisible(false);
        jpnCompras.setVisible(false);
        jpnProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnAgregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompraActionPerformed
        // TODO add your handling code here:
        jpnRegistroCompra.setVisible(true);
        jpnCompras.setVisible(false);
    }//GEN-LAST:event_btnAgregarCompraActionPerformed

    private void btnVerDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetalleMouseClicked
        // TODO add your handling code here:
        JFRDetalleCompra abrir = new JFRDetalleCompra();
        abrir.setVisible(true);
    }//GEN-LAST:event_btnVerDetalleMouseClicked

    private void btnVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerDetalleActionPerformed

    private void txtIdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCompraActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        jpnCompras.setVisible(true);
        jpnRegistroCompra.setVisible(false);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        // TODO add your handling code here:
        apagado();
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnCompras);  
        jpnVentas.setVisible(false);
        jpnProveedores.setVisible(false);
        jpnProductos.setVisible(false);
        jpnCompras.setVisible(true);
    }//GEN-LAST:event_btnComprasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCompra;
    private javax.swing.JButton btnAgregarProductoVenta;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnAtrasProveedores;
    private javax.swing.JButton btnBuscarFiltrosProductos;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarProductoVenta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEditarFiltrosProductos;
    private javax.swing.JButton btnEliminarFiltroProductos;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalirFiltroProducto;
    private javax.swing.JButton btnSalirProductos;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JComboBox<String> cmbCodBarraFiltrosProductos;
    private javax.swing.JComboBox<String> cmbNombreFiltrosProductos;
    private javax.swing.JComboBox cmbProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpnAgregarProv;
    private javax.swing.JPanel jpnBuscarProducto;
    private javax.swing.JPanel jpnCabeceraTabla;
    private javax.swing.JPanel jpnCabezeraTablaCompra;
    private javax.swing.JPanel jpnCompras;
    private javax.swing.JPanel jpnFecha;
    private javax.swing.JPanel jpnIdCompra;
    private javax.swing.JPanel jpnNuevoProducto;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JPanel jpnProductos;
    private javax.swing.JPanel jpnProveedor;
    private javax.swing.JPanel jpnProveedores;
    private javax.swing.JPanel jpnRegistrarCompras;
    private javax.swing.JPanel jpnRegistroCompra;
    private javax.swing.JPanel jpnTotal;
    private javax.swing.JPanel jpnVentas;
    private javax.swing.JPanel jpnVerDetalle;
    private javax.swing.JTable jtblBuscarFiltroProductos;
    private javax.swing.JTable jtblProductos;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lblCabeceraTabla;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodBarraFiltroAlternativa;
    private javax.swing.JLabel lblCodBarraFlitrosProductos;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFiltrosProductos;
    private javax.swing.JLabel lblIdCompra;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMitad1;
    private javax.swing.JLabel lblMitad2;
    private javax.swing.JLabel lblMitad3;
    private javax.swing.JLabel lblMitad4;
    private javax.swing.JLabel lblMitad5;
    private javax.swing.JLabel lblNombreFiltrosProductos;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblProveedores1;
    private javax.swing.JLabel lblProveedores2;
    private javax.swing.JLabel lblProveedores3;
    private javax.swing.JLabel lblRegistrarCompra;
    private javax.swing.JLabel lblSeleccionFiltro;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVerDetalle;
    private javax.swing.JRadioButton rbtnCodBarraProducto;
    private javax.swing.JRadioButton rbtnNombreProducto;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTable tblProductosVender;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCantidadVender;
    private javax.swing.JTextField txtCodBarraFiltroProductos;
    private javax.swing.JTextField txtCodBarraProductos;
    private javax.swing.JTextField txtCodigoBarraVender;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDProveedor;
    private javax.swing.JTextField txtIdCompra;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombreFiltrosProductos;
    private javax.swing.JTextField txtNombreProductoVender;
    private javax.swing.JTextField txtNombreProductos;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecioProductoVender;
    private javax.swing.JTextField txtPrecioProductos;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void setVisible(JPopupMenu MenuEmergente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
