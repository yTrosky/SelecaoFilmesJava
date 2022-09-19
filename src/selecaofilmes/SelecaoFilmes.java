//Pacote do programa.
package selecaofilmes;
//Herdando da classe JFrame
public class SelecaoFilmes extends javax.swing.JFrame {
    public SelecaoFilmes() {
        initComponents();
        setLocationRelativeTo(null); //Centralização da tela.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        acao_jcb = new javax.swing.JCheckBox();
        comedia_jcb = new javax.swing.JCheckBox();
        comediaR_jcb = new javax.swing.JCheckBox();
        ficcao_jcb = new javax.swing.JCheckBox();
        romance_jcb = new javax.swing.JCheckBox();
        suspense_jcb = new javax.swing.JCheckBox();
        terror_jcb = new javax.swing.JCheckBox();
        ok_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção de Filmes");

        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Seleção de Filmes");

        selecao.add(acao_jcb);
        acao_jcb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acao_jcb.setText("Ação");
        acao_jcb.setFocusPainted(false);
        acao_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acao_jcbActionPerformed(evt);
            }
        });

        selecao.add(comedia_jcb);
        comedia_jcb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comedia_jcb.setText("Comédia");

        selecao.add(comediaR_jcb);
        comediaR_jcb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comediaR_jcb.setText("Comédia Romântica");

        selecao.add(ficcao_jcb);
        ficcao_jcb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ficcao_jcb.setText("Ficção");

        selecao.add(romance_jcb);
        romance_jcb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        romance_jcb.setText("Romance");

        selecao.add(suspense_jcb);
        suspense_jcb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        suspense_jcb.setText("Suspense");

        selecao.add(terror_jcb);
        terror_jcb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        terror_jcb.setText("Terror");

        ok_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ok_btn.setText("OK");
        ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(ok_btn)
                        .addGap(41, 41, 41)
                        .addComponent(cancelar_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(terror_jcb)
                            .addComponent(suspense_jcb)
                            .addComponent(romance_jcb)
                            .addComponent(ficcao_jcb)
                            .addComponent(comediaR_jcb)
                            .addComponent(comedia_jcb)
                            .addComponent(acao_jcb)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(acao_jcb)
                .addGap(18, 18, 18)
                .addComponent(comedia_jcb)
                .addGap(18, 18, 18)
                .addComponent(comediaR_jcb)
                .addGap(18, 18, 18)
                .addComponent(ficcao_jcb)
                .addGap(18, 18, 18)
                .addComponent(romance_jcb)
                .addGap(18, 18, 18)
                .addComponent(suspense_jcb)
                .addGap(18, 18, 18)
                .addComponent(terror_jcb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_btn)
                    .addComponent(cancelar_btn))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
   
       //Condição de decisão para o botão "OK"
       if(acao_jcb.isSelected()){
       new FilmeAcao ().show(true);
       }
       else if(comedia_jcb.isSelected()){
       new FilmeComedia ().show(true);
       }
       else if(comediaR_jcb.isSelected()){
       new FilmeComediaR ().show(true);
       }
       else if(ficcao_jcb.isSelected()){
       new FilmeFiccao ().show(true);
       }
       else if(romance_jcb.isSelected()){
       new FilmeRomance ().show(true);
       }
       else if(suspense_jcb.isSelected()){
       new FilmeSuspense ().show(true);
       }
       else if(terror_jcb.isSelected()){
       new FilmeTerror ().show(true);
       }   
    }//GEN-LAST:event_ok_btnActionPerformed

    private void acao_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acao_jcbActionPerformed

    }//GEN-LAST:event_acao_jcbActionPerformed

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        System.exit(0); //Fecha o jframe.
    }//GEN-LAST:event_cancelar_btnActionPerformed

    //Pacote do núcleo de Java
    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
                new SelecaoFilmes().setVisible(true); //Janela Principal está sendo exibida. 
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acao_jcb;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JCheckBox comediaR_jcb;
    private javax.swing.JCheckBox comedia_jcb;
    private javax.swing.JCheckBox ficcao_jcb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok_btn;
    private javax.swing.JCheckBox romance_jcb;
    private javax.swing.ButtonGroup selecao;
    private javax.swing.JCheckBox suspense_jcb;
    private javax.swing.JCheckBox terror_jcb;
    // End of variables declaration//GEN-END:variables
}
