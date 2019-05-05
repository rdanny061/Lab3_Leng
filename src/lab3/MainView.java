package lab3;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny Rojas Arguedas
 */
public class MainView extends javax.swing.JFrame {

    DefaultListModel<String> lista = new DefaultListModel<>();
    Lab3 consulta = new Lab3();

    public MainView() {
        initComponents();
        this.setTitle("Ruta Corta - Danny Rojas Arguedas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAnnadir = new javax.swing.JButton();
        comboOrigen = new javax.swing.JComboBox<>();
        botonCalcular = new javax.swing.JButton();
        comboDestino = new javax.swing.JComboBox<>();
        comboEscalas = new javax.swing.JComboBox<>();
        labelOrigen = new javax.swing.JLabel();
        labelDestino = new javax.swing.JLabel();
        labelEscalas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        escalasView = new javax.swing.JList<>();
        labelSeleccionadas = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        botonAnnadir.setBackground(new java.awt.Color(51, 255, 0));
        botonAnnadir.setText("Añadir Escala");
        botonAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnnadirActionPerformed(evt);
            }
        });

        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "panama", "costa_rica", "nicaragua", "salvador", "honduras", "guatemala", "belice" }));

        botonCalcular.setBackground(new java.awt.Color(51, 255, 0));
        botonCalcular.setText("Calcular Ruta");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "panama", "costa_rica", "nicaragua", "salvador", "honduras", "guatemala", "belice" }));

        comboEscalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "panama", "costa_rica", "nicaragua", "salvador", "honduras", "guatemala", "belice" }));

        labelOrigen.setText("Origen");

        labelDestino.setText("Destino");

        labelEscalas.setText("Escalas");

        jScrollPane1.setViewportView(escalasView);

        labelSeleccionadas.setText("Escalas seleccionadas:");

        botonLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelEscalas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboEscalas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelSeleccionadas)
                                .addGap(407, 407, 407))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAnnadir, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrigen)
                    .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDestino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEscalas)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboEscalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonAnnadir)))
                        .addGap(18, 18, 18)
                        .addComponent(labelSeleccionadas))
                    .addComponent(botonLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCalcular)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnnadirActionPerformed
        String item = comboEscalas.getItemAt(comboEscalas.getSelectedIndex());
        if (!lista.contains(item)) {
            lista.addElement(item);
            escalasView.setModel(lista);
        }
    }//GEN-LAST:event_botonAnnadirActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        String origen = comboOrigen.getItemAt(comboOrigen.getSelectedIndex());
        String destino = comboDestino.getItemAt(comboDestino.getSelectedIndex());
        String escalas = "";
        for (int i = 0; i < escalasView.getModel().getSize(); i++) {
            if (i == 0) {
                escalas = escalas + escalasView.getModel().getElementAt(i);
            }
            escalas = escalas + "," + escalasView.getModel().getElementAt(i);
        }
        String[] mejorRuta = consulta.consulta(origen, destino, escalas);
        String ruta = "";
        if (mejorRuta == null) {
            ruta = "No fue posible calcular la ruta seleccionada";
        } else {
            for (int i = 0; i < mejorRuta.length; i++) {
                if (i == 0) {
                    ruta = ruta + "Peso ruta: " + mejorRuta[i] + "\nRuta: ";
                } else {
                    if (i + 1 == mejorRuta.length) {
                        ruta = ruta + mejorRuta[i];
                    } else {
                        ruta = ruta + mejorRuta[i] + " -";
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(this, ruta);
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        lista.clear();
    }//GEN-LAST:event_botonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnnadir;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboEscalas;
    private javax.swing.JComboBox<String> comboOrigen;
    private javax.swing.JList<String> escalasView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelEscalas;
    private javax.swing.JLabel labelOrigen;
    private javax.swing.JLabel labelSeleccionadas;
    // End of variables declaration//GEN-END:variables
}
