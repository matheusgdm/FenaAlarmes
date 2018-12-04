package View;

import Repository.CompraAtualRep;
import javax.swing.JOptionPane;
import model.Cliente;
import model.CompraAtual;

public class NovaCompra extends javax.swing.JFrame {

    CompraAtual c = new CompraAtual();
    Cliente clienteLogado;
    
    

    public NovaCompra() {
        initComponents();

        txtTotalDSC.setText(String.valueOf("Quantidade: " + c.getContadorCentralDSC()));
        txtJFL.setText(String.valueOf("Quantidade: " + c.getContadorCentralJFL()));
        txtTeclaDSC.setText(String.valueOf("Quantidade: " + c.getContadorTecladoDSC()));
        txtTeclaParadox.setText(String.valueOf("Quantidade: " + c.getContadorTecladoParadox()));
        txtBateIntel.setText(String.valueOf("Quantidade: " + c.getContadorBateriaIntel()));
        txtBateriaMoura.setText(String.valueOf("Quantidade: " + c.getContadorBateriaMoura()));
        txtSensorParadox.setText(String.valueOf("Quantidade: " + c.getContadorSensorParadox()));
        txtSensorPassivo.setText(String.valueOf("Quantidade: " + c.getContadorSensorIntel()));
        txtSireneGLK.setText(String.valueOf("Quantidade: " + c.getContadorSireneGlk()));
        txtSireneECP.setText(String.valueOf("Quantidade: " + c.getContadorSireneEcp()));
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));
    }
    
    public NovaCompra(Cliente clienteLogado) {
        this.clienteLogado = clienteLogado;
        initComponents();
        txtClienteLogado.setText("Cliente logado: ".concat(this.clienteLogado.getNome()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAddCentralDSC = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnRetiraCentralDSC = new javax.swing.JButton();
        btnAddCentralJFL = new javax.swing.JButton();
        btnRetiraCentralJFL = new javax.swing.JButton();
        btnAddTecladoDSC = new javax.swing.JButton();
        btnRetiraTecladoDSC = new javax.swing.JButton();
        btnRetiraTecladoParadox = new javax.swing.JButton();
        btnAddCentralParadox = new javax.swing.JButton();
        btnRetiraBateriaIntel = new javax.swing.JButton();
        btnAddBateriaIntel = new javax.swing.JButton();
        btnAddBateriaMoura = new javax.swing.JButton();
        btnRetiraBateriaMoura = new javax.swing.JButton();
        btnAddSensorParadox = new javax.swing.JButton();
        btnRetiraSensorParadox = new javax.swing.JButton();
        btnAddSensorIntelbras = new javax.swing.JButton();
        btnRetiraSensorJFL = new javax.swing.JButton();
        btnAddSireneGlk = new javax.swing.JButton();
        btnRetiraSireneGlk = new javax.swing.JButton();
        btnRetiraSireneEcp = new javax.swing.JButton();
        btnAddSireneEcp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtClienteLogado = new javax.swing.JLabel();
        txtTotalDSC = new javax.swing.JLabel();
        txtJFL = new javax.swing.JLabel();
        txtTeclaDSC = new javax.swing.JLabel();
        txtTeclaParadox = new javax.swing.JLabel();
        txtBateIntel = new javax.swing.JLabel();
        txtBateriaMoura = new javax.swing.JLabel();
        txtSensorParadox = new javax.swing.JLabel();
        txtSensorPassivo = new javax.swing.JLabel();
        txtSireneGLK = new javax.swing.JLabel();
        txtSireneECP = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(540, 230, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 740));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Central de Alarme DSC 1832 - R$ 260,00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Central de Alarme JFL Active 20 - R$ 200,00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Teclado DSC PK5500 LCD - R$ 119,00 ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Teclado Paradox K32 LCD");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Bateria Selada Intelbras 12v 7a");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Bateria Selada Gel Moura 7ah 12v");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Sensor paradox pro plus");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Sirene Ecp Monotonal 12v");

        btnAddCentralDSC.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddCentralDSC.setText("+");
        btnAddCentralDSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCentralDSCActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton19.setText("Finalizar compra!");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Sensor Infravermelho Passivo Intelbras");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Sirene Alarme Glk Compacta 12v");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setText("Produtos:");

        btnRetiraCentralDSC.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraCentralDSC.setText("-");
        btnRetiraCentralDSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraCentralDSCActionPerformed(evt);
            }
        });

        btnAddCentralJFL.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddCentralJFL.setText("+");
        btnAddCentralJFL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCentralJFLActionPerformed(evt);
            }
        });

        btnRetiraCentralJFL.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraCentralJFL.setText("-");
        btnRetiraCentralJFL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraCentralJFLActionPerformed(evt);
            }
        });

        btnAddTecladoDSC.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddTecladoDSC.setText("+");
        btnAddTecladoDSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTecladoDSCActionPerformed(evt);
            }
        });

        btnRetiraTecladoDSC.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraTecladoDSC.setText("-");
        btnRetiraTecladoDSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraTecladoDSCActionPerformed(evt);
            }
        });

        btnRetiraTecladoParadox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraTecladoParadox.setText("-");
        btnRetiraTecladoParadox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraTecladoParadoxActionPerformed(evt);
            }
        });

        btnAddCentralParadox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddCentralParadox.setText("+");
        btnAddCentralParadox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCentralParadoxActionPerformed(evt);
            }
        });

        btnRetiraBateriaIntel.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraBateriaIntel.setText("-");
        btnRetiraBateriaIntel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraBateriaIntelActionPerformed(evt);
            }
        });

        btnAddBateriaIntel.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddBateriaIntel.setText("+");
        btnAddBateriaIntel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBateriaIntelActionPerformed(evt);
            }
        });

        btnAddBateriaMoura.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddBateriaMoura.setText("+");
        btnAddBateriaMoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBateriaMouraActionPerformed(evt);
            }
        });

        btnRetiraBateriaMoura.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraBateriaMoura.setText("-");
        btnRetiraBateriaMoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraBateriaMouraActionPerformed(evt);
            }
        });

        btnAddSensorParadox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddSensorParadox.setText("+");
        btnAddSensorParadox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSensorParadoxActionPerformed(evt);
            }
        });

        btnRetiraSensorParadox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraSensorParadox.setText("-");
        btnRetiraSensorParadox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraSensorParadoxActionPerformed(evt);
            }
        });

        btnAddSensorIntelbras.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddSensorIntelbras.setText("+");
        btnAddSensorIntelbras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSensorIntelbrasActionPerformed(evt);
            }
        });

        btnRetiraSensorJFL.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraSensorJFL.setText("-");
        btnRetiraSensorJFL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraSensorJFLActionPerformed(evt);
            }
        });

        btnAddSireneGlk.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddSireneGlk.setText("+");
        btnAddSireneGlk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSireneGlkActionPerformed(evt);
            }
        });

        btnRetiraSireneGlk.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraSireneGlk.setText("-");
        btnRetiraSireneGlk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraSireneGlkActionPerformed(evt);
            }
        });

        btnRetiraSireneEcp.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnRetiraSireneEcp.setText("-");
        btnRetiraSireneEcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiraSireneEcpActionPerformed(evt);
            }
        });

        btnAddSireneEcp.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnAddSireneEcp.setText("+");
        btnAddSireneEcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSireneEcpActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jButton1.setText("Retorna ao menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtClienteLogado.setText("jLabel13");

        txtTotal.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddCentralJFL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetiraCentralJFL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAddTecladoDSC)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRetiraTecladoDSC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAddCentralParadox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRetiraTecladoParadox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAddBateriaIntel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRetiraBateriaIntel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddBateriaMoura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRetiraBateriaMoura, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAddSensorIntelbras)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRetiraSensorJFL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAddSensorParadox)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRetiraSensorParadox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAddSireneGlk)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRetiraSireneGlk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAddSireneEcp)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRetiraSireneEcp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddCentralDSC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetiraCentralDSC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTotalDSC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJFL, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtBateIntel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTeclaParadox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTeclaDSC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtSensorParadox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBateriaMoura, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSensorPassivo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSireneGLK, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSireneECP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtClienteLogado)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jButton1)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtClienteLogado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAddCentralDSC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnRetiraCentralDSC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(0, 1, Short.MAX_VALUE)
                                                        .addComponent(txtTotalDSC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAddCentralJFL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnRetiraCentralJFL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtJFL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnAddTecladoDSC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnRetiraTecladoDSC))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtTeclaDSC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnAddCentralParadox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnRetiraTecladoParadox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtTeclaParadox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAddBateriaIntel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRetiraBateriaIntel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtBateIntel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAddBateriaMoura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetiraBateriaMoura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBateriaMoura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAddSensorParadox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetiraSensorParadox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSensorParadox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAddSensorIntelbras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetiraSensorJFL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSensorPassivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAddSireneGlk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetiraSireneGlk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSireneGLK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddSireneEcp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRetiraSireneEcp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSireneECP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddCentralDSC, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCentralDSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCentralDSCActionPerformed

        c.setCentralDSC(c.getCentralDSC() + 260.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 260.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorCentralDSC(c.getContadorCentralDSC() + 1);
        txtTotalDSC.setText(String.valueOf("Quantidade: " + c.getContadorCentralDSC()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddCentralDSCActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        c.setTotalItens(c.getTotalItens());
        c.setPrecoTotalCompra(c.getPrecoTotalCompra());
        c.setContadorCentralDSC(c.getContadorCentralDSC());
        c.setContadorCentralJFL(c.getContadorCentralJFL());
        c.setContadorTecladoDSC(c.getContadorTecladoDSC());
        c.setContadorTecladoParadox(c.getContadorTecladoParadox());
        c.setContadorBateriaIntel(c.getContadorBateriaIntel());
        c.setContadorBateriaIntel(c.getContadorBateriaMoura());
        c.setContadorSensorIntel(c.getContadorSensorIntel());
        c.setContadorSensorJFL(c.getContadorSensorJFL());
        c.setContadorSireneGlk(c.getContadorSireneGlk());
        c.setContadorSireneEcp(c.getContadorSireneEcp());
        c.setIdClienteCompra(clienteLogado.getIdcadastroCliente());
        CompraAtualRep r = new CompraAtualRep();
        r.salvar(c);

        JOptionPane.showMessageDialog(rootPane, "Compra Finalizada, verificar pedido no menu de 'Minhas Compras!'");
        this.setVisible(false);
        new MenuInicial(clienteLogado).setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void btnRetiraCentralDSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraCentralDSCActionPerformed
        if (c.getCentralDSC() > 0) {
            c.setCentralDSC(c.getCentralDSC() - 260.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 260.00);
            txtTotal.setText(String.valueOf("Valor total: R$  " + c.getPrecoTotalCompra()));
            c.setContadorCentralDSC(c.getContadorCentralDSC() - 1);
            txtTotalDSC.setText(String.valueOf("Quantidade: " + c.getContadorCentralDSC()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraCentralDSCActionPerformed

    private void btnAddCentralJFLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCentralJFLActionPerformed
        c.setCentralJFL(c.getCentralJFL() + 200.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 200.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorCentralJFL(c.getContadorCentralJFL() + 1);
        txtJFL.setText(String.valueOf("Quantidade: " + c.getContadorCentralJFL()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddCentralJFLActionPerformed

    private void btnRetiraCentralJFLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraCentralJFLActionPerformed
        if (c.getCentralJFL() > 0) {
            c.setCentralJFL(c.getCentralJFL() - 200.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 200.00);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorCentralJFL(c.getContadorCentralJFL() - 1);
            txtJFL.setText(String.valueOf("Quantidade: " + c.getContadorCentralJFL()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraCentralJFLActionPerformed

    private void btnAddTecladoDSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTecladoDSCActionPerformed
        c.setTecladoDSC(c.getTecladoDSC() + 119.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 119.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorTecladoDSC(c.getContadorTecladoDSC() + 1);
        txtTeclaDSC.setText(String.valueOf("Quantidade: " + c.getContadorTecladoDSC()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddTecladoDSCActionPerformed

    private void btnRetiraTecladoDSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraTecladoDSCActionPerformed
        if (c.getTecladoDSC() > 0) {
            c.setTecladoDSC(c.getTecladoDSC() - 119.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 119.00);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorTecladoDSC(c.getContadorTecladoDSC() - 1);
            txtTeclaDSC.setText(String.valueOf("Quantidade: " + c.getContadorTecladoDSC()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraTecladoDSCActionPerformed

    private void btnRetiraTecladoParadoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraTecladoParadoxActionPerformed
        if (c.getTecladoParadox() > 0) {
            c.setTecladoParadox(c.getTecladoParadox() - 635.99);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 635.99);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorTecladoParadox(c.getContadorTecladoParadox() - 1);
            txtTeclaParadox.setText(String.valueOf("Quantidade: " + c.getContadorTecladoParadox()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraTecladoParadoxActionPerformed

    private void btnAddCentralParadoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCentralParadoxActionPerformed
        c.setTecladoParadox(c.getTecladoParadox() + 635.99);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 635.99);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorTecladoParadox(c.getContadorTecladoParadox() + 1);
        txtTeclaParadox.setText(String.valueOf("Quantidade: " + c.getContadorTecladoParadox()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddCentralParadoxActionPerformed

    private void btnRetiraBateriaIntelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraBateriaIntelActionPerformed
        if (c.getBateriaIntel() > 0) {
            c.setBateriaIntel(c.getBateriaIntel() - 62.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 62.00);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorBateriaIntel(c.getContadorBateriaIntel() - 1);
            txtBateIntel.setText(String.valueOf("Quantidade: " + c.getContadorBateriaIntel()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraBateriaIntelActionPerformed

    private void btnAddBateriaIntelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBateriaIntelActionPerformed
        c.setBateriaIntel(c.getBateriaIntel() + 62.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 62.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorBateriaIntel(c.getContadorBateriaIntel() + 1);
        txtBateIntel.setText(String.valueOf("Quantidade: " + c.getContadorBateriaIntel()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddBateriaIntelActionPerformed

    private void btnAddBateriaMouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBateriaMouraActionPerformed
        c.setBateriaMoura(c.getBateriaMoura() + 75.40);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 75.40);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorBateriaMoura(c.getContadorBateriaMoura() + 1);
        txtBateriaMoura.setText(String.valueOf("Quantidade: " + c.getContadorBateriaMoura()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddBateriaMouraActionPerformed

    private void btnRetiraBateriaMouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraBateriaMouraActionPerformed
        if (c.getBateriaMoura() > 0) {
            c.setBateriaMoura(c.getBateriaMoura() - 75.40);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 75.40);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorBateriaMoura(c.getContadorBateriaMoura() - 1);
            txtBateriaMoura.setText(String.valueOf("Quantidade: " + c.getContadorBateriaMoura()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraBateriaMouraActionPerformed

    private void btnAddSensorParadoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSensorParadoxActionPerformed
        c.setSensorPlus(c.getSensorPlus() + 345.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 345.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorSensorParadox(c.getContadorSensorParadox() + 1);
        txtSensorParadox.setText(String.valueOf("Quantidade: " + c.getContadorSensorParadox()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddSensorParadoxActionPerformed

    private void btnRetiraSensorParadoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraSensorParadoxActionPerformed
        if (c.getSensorPlus() > 0) {
            c.setSensorPlus(c.getSensorPlus() - 345.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 345.00);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorSensorParadox(c.getContadorSensorParadox() - 1);
            txtSensorParadox.setText(String.valueOf("Quantidade: " + c.getContadorSensorParadox()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraSensorParadoxActionPerformed

    private void btnAddSensorIntelbrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSensorIntelbrasActionPerformed
        c.setSensorPassivo(c.getSensorPassivo() + 22.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 22.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorSensorIntel(c.getContadorSensorIntel() + 1);
        txtSensorPassivo.setText(String.valueOf("Quantidade: " + c.getContadorSensorIntel()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddSensorIntelbrasActionPerformed

    private void btnRetiraSensorJFLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraSensorJFLActionPerformed
        if (c.getSensorPassivo() > 0) {
            c.setSensorPassivo(c.getSensorPassivo() - 22.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 22.00);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorSensorIntel(c.getContadorSensorIntel() - 1);
            txtSensorPassivo.setText(String.valueOf("Quantidade: " + c.getContadorSensorIntel()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraSensorJFLActionPerformed

    private void btnAddSireneGlkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSireneGlkActionPerformed
        c.setSireneGLK(c.getSireneGLK() + 16.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 16.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorSireneGlk(c.getContadorSireneGlk() + 1);
        txtSireneGLK.setText(String.valueOf("Quantidade: " + c.getContadorSireneGlk()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddSireneGlkActionPerformed

    private void btnRetiraSireneGlkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraSireneGlkActionPerformed
        if (c.getSireneGLK() > 0) {
            c.setSireneGLK(c.getSireneGLK() - 16.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 16.00);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorSireneGlk(c.getContadorSireneGlk() - 1);
            txtSireneGLK.setText(String.valueOf("Quantidade: " + c.getContadorSireneGlk()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraSireneGlkActionPerformed

    private void btnRetiraSireneEcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiraSireneEcpActionPerformed
        if (c.getSirenaECP() > 0) {
            c.setSirenaECP(c.getSirenaECP() - 18.00);
            c.setPrecoTotalCompra(c.getPrecoTotalCompra() - 18.00);
            txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

            c.setContadorSireneEcp(c.getContadorSireneEcp() - 1);
            txtSireneECP.setText(String.valueOf("Quantidade: " + c.getContadorSireneEcp()));
            c.setTotalItens(c.getTotalItens() - 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar retirada, produto não foi adicionado ao carrinho!");
        }
    }//GEN-LAST:event_btnRetiraSireneEcpActionPerformed

    private void btnAddSireneEcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSireneEcpActionPerformed
        c.setSirenaECP(c.getSirenaECP() + 18.00);
        c.setPrecoTotalCompra(c.getPrecoTotalCompra() + 18.00);
        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));

        c.setContadorSireneEcp(c.getContadorSireneEcp() + 1);
        txtSireneECP.setText(String.valueOf("Quantidade: " + c.getContadorSireneEcp()));
        c.setTotalItens(c.getTotalItens() + 1);
    }//GEN-LAST:event_btnAddSireneEcpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new MenuInicial(clienteLogado).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBateriaIntel;
    private javax.swing.JButton btnAddBateriaMoura;
    private javax.swing.JButton btnAddCentralDSC;
    private javax.swing.JButton btnAddCentralJFL;
    private javax.swing.JButton btnAddCentralParadox;
    private javax.swing.JButton btnAddSensorIntelbras;
    private javax.swing.JButton btnAddSensorParadox;
    private javax.swing.JButton btnAddSireneEcp;
    private javax.swing.JButton btnAddSireneGlk;
    private javax.swing.JButton btnAddTecladoDSC;
    private javax.swing.JButton btnRetiraBateriaIntel;
    private javax.swing.JButton btnRetiraBateriaMoura;
    private javax.swing.JButton btnRetiraCentralDSC;
    private javax.swing.JButton btnRetiraCentralJFL;
    private javax.swing.JButton btnRetiraSensorJFL;
    private javax.swing.JButton btnRetiraSensorParadox;
    private javax.swing.JButton btnRetiraSireneEcp;
    private javax.swing.JButton btnRetiraSireneGlk;
    private javax.swing.JButton btnRetiraTecladoDSC;
    private javax.swing.JButton btnRetiraTecladoParadox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txtBateIntel;
    private javax.swing.JLabel txtBateriaMoura;
    private javax.swing.JLabel txtClienteLogado;
    private javax.swing.JLabel txtJFL;
    private javax.swing.JLabel txtSensorParadox;
    private javax.swing.JLabel txtSensorPassivo;
    private javax.swing.JLabel txtSireneECP;
    private javax.swing.JLabel txtSireneGLK;
    private javax.swing.JLabel txtTeclaDSC;
    private javax.swing.JLabel txtTeclaParadox;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotalDSC;
    // End of variables declaration//GEN-END:variables
}
