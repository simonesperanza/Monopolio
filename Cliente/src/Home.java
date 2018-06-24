/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author lexaf
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    Conexion _conn;
    DataOutputStream _out;
    DataInputStream _input;
    
    public Home() {
        initComponents();
        _conn = new Conexion();
        _conn.initClient(); 
        _out = _conn.getOut();
        _input = _conn.getInput();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablero = new javax.swing.JPanel();
        PiezaCarro = new javax.swing.JLabel();
        PiezaZapato = new javax.swing.JLabel();
        PiezaBarco = new javax.swing.JLabel();
        PiezaSombrero = new javax.swing.JLabel();
        Casa1 = new javax.swing.JLabel();
        Casa2 = new javax.swing.JLabel();
        Casa3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ImagenTablero = new javax.swing.JLabel();
        Controles = new javax.swing.JPanel();
        Perfil = new javax.swing.JPanel();
        PiezaPerfil = new javax.swing.JLabel();
        Jugador = new javax.swing.JLabel();
        Cash = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        PropiedadesCantidad = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Acciones = new javax.swing.JPanel();
        BotonDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonComprar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonVender = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Propiedades = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablero.setLayout(null);

        PiezaCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_piece75.png"))); // NOI18N
        Tablero.add(PiezaCarro);
        PiezaCarro.setBounds(740, 800, 70, 40);

        PiezaZapato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shoe_piece50.png"))); // NOI18N
        Tablero.add(PiezaZapato);
        PiezaZapato.setBounds(790, 800, 50, 40);

        PiezaBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boat_piece50.png"))); // NOI18N
        Tablero.add(PiezaBarco);
        PiezaBarco.setBounds(790, 750, 50, 40);

        PiezaSombrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hat_piece50.png"))); // NOI18N
        Tablero.add(PiezaSombrero);
        PiezaSombrero.setBounds(750, 130, 50, 40);

        Casa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Apartment_25px.png"))); // NOI18N
        Tablero.add(Casa1);
        Casa1.setBounds(710, 730, 30, 30);

        Casa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Home_Page_18px.png"))); // NOI18N
        Tablero.add(Casa2);
        Casa2.setBounds(670, 740, 20, 18);

        Casa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Home_Page_18px.png"))); // NOI18N
        Tablero.add(Casa3);
        Casa3.setBounds(690, 740, 20, 18);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green_Pacific Avenue.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        Tablero.add(jLabel4);
        jLabel4.setBounds(270, 200, 320, 410);

        ImagenTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/monopoly_board850.jpg"))); // NOI18N
        Tablero.add(ImagenTablero);
        ImagenTablero.setBounds(0, 0, 850, 850);

        getContentPane().add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 850));

        Controles.setBackground(new java.awt.Color(51, 102, 255));

        Perfil.setBackground(new java.awt.Color(255, 255, 255));

        PiezaPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hat_piece75.png"))); // NOI18N

        Jugador.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Jugador.setForeground(new java.awt.Color(51, 102, 255));
        Jugador.setText("Mr. Sombrero");

        Cash.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cash.setText("Cash:");

        jLabel10.setText("1700 $");

        jLabel12.setText("5700 $");

        Balance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Balance.setText("Balance:");

        PropiedadesCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PropiedadesCantidad.setText("Propiedades:");

        jLabel14.setText("3");

        javax.swing.GroupLayout PerfilLayout = new javax.swing.GroupLayout(Perfil);
        Perfil.setLayout(PerfilLayout);
        PerfilLayout.setHorizontalGroup(
            PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerfilLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(PiezaPerfil)
                .addGap(28, 28, 28)
                .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerfilLayout.createSequentialGroup()
                        .addComponent(Balance)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12))
                    .addGroup(PerfilLayout.createSequentialGroup()
                        .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jugador)
                            .addGroup(PerfilLayout.createSequentialGroup()
                                .addComponent(Cash)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addComponent(PropiedadesCantidad)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PerfilLayout.setVerticalGroup(
            PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerfilLayout.createSequentialGroup()
                .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PerfilLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PiezaPerfil))
                    .addGroup(PerfilLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Jugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cash)
                            .addComponent(jLabel10)
                            .addComponent(PropiedadesCantidad)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Balance)
                            .addComponent(jLabel12))))
                .addGap(50, 50, 50))
        );

        Acciones.setBackground(new java.awt.Color(255, 255, 255));

        BotonDados.setBackground(new java.awt.Color(235, 236, 238));
        BotonDados.setPreferredSize(new java.awt.Dimension(162, 103));
        BotonDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonDadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonDadosMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Dice_52px.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Dice_52px.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("LANZAR!");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BotonDadosLayout = new javax.swing.GroupLayout(BotonDados);
        BotonDados.setLayout(BotonDadosLayout);
        BotonDadosLayout.setHorizontalGroup(
            BotonDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonDadosLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(BotonDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonDadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonDadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)))
                .addGap(30, 30, 30))
        );
        BotonDadosLayout.setVerticalGroup(
            BotonDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonDadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(BotonDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonComprar.setBackground(new java.awt.Color(235, 236, 238));
        BotonComprar.setPreferredSize(new java.awt.Dimension(162, 51));
        BotonComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonComprarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonComprarMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_E-commerce_30px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("COMPRAR");

        javax.swing.GroupLayout BotonComprarLayout = new javax.swing.GroupLayout(BotonComprar);
        BotonComprar.setLayout(BotonComprarLayout);
        BotonComprarLayout.setHorizontalGroup(
            BotonComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonComprarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        BotonComprarLayout.setVerticalGroup(
            BotonComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotonComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        BotonVender.setBackground(new java.awt.Color(235, 236, 238));
        BotonVender.setPreferredSize(new java.awt.Dimension(162, 51));
        BotonVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonVenderMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonVenderMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Apartment_25px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("VENDER");

        javax.swing.GroupLayout BotonVenderLayout = new javax.swing.GroupLayout(BotonVender);
        BotonVender.setLayout(BotonVenderLayout);
        BotonVenderLayout.setHorizontalGroup(
            BotonVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonVenderLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        BotonVenderLayout.setVerticalGroup(
            BotonVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonVenderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BotonVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        javax.swing.GroupLayout AccionesLayout = new javax.swing.GroupLayout(Acciones);
        Acciones.setLayout(AccionesLayout);
        AccionesLayout.setHorizontalGroup(
            AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonDados, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AccionesLayout.setVerticalGroup(
            AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonDados, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addGroup(AccionesLayout.createSequentialGroup()
                        .addComponent(BotonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Propiedades.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Propiedad", "Casas", "Hoteles", "Renta", "Venta"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout PropiedadesLayout = new javax.swing.GroupLayout(Propiedades);
        Propiedades.setLayout(PropiedadesLayout);
        PropiedadesLayout.setHorizontalGroup(
            PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PropiedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        PropiedadesLayout.setVerticalGroup(
            PropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PropiedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ControlesLayout = new javax.swing.GroupLayout(Controles);
        Controles.setLayout(ControlesLayout);
        ControlesLayout.setHorizontalGroup(
            ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Propiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ControlesLayout.setVerticalGroup(
            ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Propiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(Acciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Controles, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 400, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Metodos para poner color/fondo a los botones en sus distintos estados.
    */
    public void setColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }
     
    public void setColor2(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(135, 135, 135));
    }

    public void resetColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(240,240,240));
    }
    private void BotonDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDadosMouseExited
        // TODO add your handling code here:
        resetColor(BotonDados);
    }//GEN-LAST:event_BotonDadosMouseExited

    private void BotonDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDadosMouseEntered
        // TODO add your handling code here:
        setColor(BotonDados);
    }//GEN-LAST:event_BotonDadosMouseEntered

    private void BotonDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDadosMousePressed
        // TODO add your handling code here:
        setColor2(BotonDados);
        try {
            _out.writeInt(2);
            System.out.println(_input.readInt());
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        // pedir la posicion en que queda el usuario
        // pedir el balance/cash
    }//GEN-LAST:event_BotonDadosMousePressed

    private void BotonComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonComprarMouseEntered
        // TODO add your handling code here:
        setColor(BotonComprar);
    }//GEN-LAST:event_BotonComprarMouseEntered

    private void BotonComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonComprarMouseExited
        // TODO add your handling code here:
        resetColor(BotonComprar);
    }//GEN-LAST:event_BotonComprarMouseExited

    // NO FUNCIONA AUN, arreglar
    /*public void DoSomethingAlpha(Jugador jug) {
      jug.getSaldo();
    }*/
    
    private void BotonComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonComprarMousePressed
        // TODO add your handling code here:
        setColor2(BotonComprar);
        
    }//GEN-LAST:event_BotonComprarMousePressed

    private void BotonVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderMouseEntered
        // TODO add your handling code here:
        setColor(BotonVender);
    }//GEN-LAST:event_BotonVenderMouseEntered

    private void BotonVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderMouseExited
        // TODO add your handling code here:
        resetColor(BotonVender);
    }//GEN-LAST:event_BotonVenderMouseExited

    private void BotonVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderMousePressed
        // TODO add your handling code here:
        setColor2(BotonVender);
        
    }//GEN-LAST:event_BotonVenderMousePressed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    
    /**
     * Para hacer que la screen del app se mueva al hacer dragg del panel
     * derecho (NO FUNCIONA TODAVIA, requiere modificaciones)
     */
    int xx,xy;
    
    private void ControlesMousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }                                    

    private void ControlesMouseDragged(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }                
    
    private void BotonDadosPressDown(java.awt.event.MouseEvent evt){
        try {
            _out.writeInt(2);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        // pedir la posicion en que queda el usuario
        // pedir el balance/cash
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acciones;
    private javax.swing.JLabel Balance;
    private javax.swing.JPanel BotonComprar;
    private javax.swing.JPanel BotonDados;
    private javax.swing.JPanel BotonVender;
    private javax.swing.JLabel Casa1;
    private javax.swing.JLabel Casa2;
    private javax.swing.JLabel Casa3;
    private javax.swing.JLabel Cash;
    private javax.swing.JPanel Controles;
    private javax.swing.JLabel ImagenTablero;
    private javax.swing.JLabel Jugador;
    private javax.swing.JPanel Perfil;
    private javax.swing.JLabel PiezaBarco;
    private javax.swing.JLabel PiezaCarro;
    private javax.swing.JLabel PiezaPerfil;
    private javax.swing.JLabel PiezaSombrero;
    private javax.swing.JLabel PiezaZapato;
    private javax.swing.JPanel Propiedades;
    private javax.swing.JLabel PropiedadesCantidad;
    private javax.swing.JPanel Tablero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
