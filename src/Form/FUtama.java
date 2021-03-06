/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Koneksi.Koneksi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rizkytanjung
 */
public class FUtama extends javax.swing.JFrame {

    /**
     * Creates new form f_utama
     */
    private final Connection conn = new Koneksi().getConnection();
    public FUtama() {
        initComponents();

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width, screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        DateNow();
        DigitalHourNow();
    }

    private void DateNow() {
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd-MM-yyyy");
        l_tanggal.setText(kal.format(sekarang));
    }

    private void DigitalHourNow() {
        // ActionListener untuk Keperluan Timer
        ActionListener taskPerformer = (ActionEvent evt) -> {
            String nol_jam = "";
            String nol_menit = "";
            String nol_detik = "";
            // Membuat Date
            Date dt = new Date();
            // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
            int nilai_jam = dt.getHours();
            int nilai_menit = dt.getMinutes();
            int nilai_detik = dt.getSeconds();
            // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
            if (nilai_jam <= 9) {
                // Tambahkan "0" didepannya
                nol_jam = "0";
            }
            // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
            if (nilai_menit <= 9) {
                // Tambahkan "0" didepannya
                nol_menit = "0";
            }
            // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
            if (nilai_detik <= 9) {
                // Tambahkan "0" didepannya
                nol_detik = "0";
            }
            // Membuat String JAM, MENIT, DETIK
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
            // Menampilkan pada Layar
            l_jam.setText(jam + ":" + menit + ":" + detik);
        };
        // Timer
        new Timer(1000, taskPerformer).start();
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
        LBackgroundHome = new javax.swing.JLabel();
        l_jam = new javax.swing.JLabel();
        l_tanggal = new javax.swing.JLabel();
        l_id_admin1 = new javax.swing.JLabel();
        l_id_user = new javax.swing.JLabel();
        l_nama_user = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b_data_pemohon = new javax.swing.JButton();
        b_data_jaminan = new javax.swing.JButton();
        b_data_bi_checking = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        b_kesesuaian_data = new javax.swing.JButton();
        b_hasil_perhitungan_bi_checking = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        jMenuItemProfile = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        DataNasabah = new javax.swing.JMenuItem();
        DataJaminan = new javax.swing.JMenuItem();
        BIChecking = new javax.swing.JMenuItem();
        PerhitunganBIChecking = new javax.swing.JMenuItem();
        AnalisaNasabah = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        About = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SYSTEM KREDIT KEPEMILIKAN RUMAH");

        jPanel1.setBackground(new java.awt.Color(177, 217, 217));

        LBackgroundHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBackgroundHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/WhatsApp Image 2021-09-02 at 11.20.28.jpeg"))); // NOI18N

        l_jam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_jam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_jam.setText("JAM");

        l_tanggal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_tanggal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_tanggal.setText("TANGGAL");

        l_id_admin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_id_admin1.setText("Pengguna :");

        l_id_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_id_user.setText("Admin");

        l_nama_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_nama_user.setText("Admin");

        jPanel2.setBackground(new java.awt.Color(177, 217, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Master", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        b_data_pemohon.setText("Data Pemohon");
        b_data_pemohon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_data_pemohon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_data_pemohonActionPerformed(evt);
            }
        });

        b_data_jaminan.setText("Data Jaminan");
        b_data_jaminan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_data_jaminan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_data_jaminanActionPerformed(evt);
            }
        });

        b_data_bi_checking.setText("Data BI Checking");
        b_data_bi_checking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_data_bi_checking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_data_bi_checkingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_data_pemohon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_data_jaminan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_data_bi_checking, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_data_pemohon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_data_jaminan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_data_bi_checking, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(177, 217, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        b_kesesuaian_data.setText("Kesesuain Data");
        b_kesesuaian_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_kesesuaian_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_kesesuaian_dataActionPerformed(evt);
            }
        });

        b_hasil_perhitungan_bi_checking.setText("Hasil Perhitungan BI Checking");
        b_hasil_perhitungan_bi_checking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_hasil_perhitungan_bi_checking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hasil_perhitungan_bi_checkingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_kesesuaian_data, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_hasil_perhitungan_bi_checking)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_kesesuaian_data, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_hasil_perhitungan_bi_checking, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l_id_admin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_id_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_nama_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_tanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_jam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBackgroundHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_jam)
                            .addComponent(l_tanggal)
                            .addComponent(l_id_admin1)
                            .addComponent(l_id_user)
                            .addComponent(l_nama_user)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBackgroundHome, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        File.setText("File");
        File.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        File.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jMenuItemProfile.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuItemProfile.setText("Profile");
        jMenuItemProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        File.add(jMenuItemProfile);

        jMenuItemExit.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuItemExit.setText("Exit");
        jMenuItemExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        File.add(jMenuItemExit);

        jMenuBar1.add(File);

        Laporan.setText("Laporan");
        Laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Laporan.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        DataNasabah.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        DataNasabah.setText("Lap. Data Nasabah");
        DataNasabah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DataNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNasabahActionPerformed(evt);
            }
        });
        Laporan.add(DataNasabah);

        DataJaminan.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        DataJaminan.setText("Lap. Data Jaminan");
        DataJaminan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DataJaminan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataJaminanActionPerformed(evt);
            }
        });
        Laporan.add(DataJaminan);

        BIChecking.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        BIChecking.setText("Lap. Data BI Checking");
        BIChecking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BIChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BICheckingActionPerformed(evt);
            }
        });
        Laporan.add(BIChecking);

        PerhitunganBIChecking.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        PerhitunganBIChecking.setText("Lap. Perhitungan BI Checking");
        PerhitunganBIChecking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PerhitunganBIChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerhitunganBICheckingActionPerformed(evt);
            }
        });
        Laporan.add(PerhitunganBIChecking);

        AnalisaNasabah.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        AnalisaNasabah.setText("Lap. Analisa Nasabah");
        AnalisaNasabah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AnalisaNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalisaNasabahActionPerformed(evt);
            }
        });
        Laporan.add(AnalisaNasabah);

        jMenuBar1.add(Laporan);

        Help.setText("Help");
        Help.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuBar1.add(Help);

        About.setText("About");
        About.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuBar1.add(About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("RAFLI");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_data_pemohonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_data_pemohonActionPerformed
        // TODO add your handling code here:
        FDataPemohon FormData = new FDataPemohon();
        FormData.id_user = l_id_user.getText();
        FormData.nama_user = l_nama_user.getText();
        FormData.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_data_pemohonActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void DataNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNasabahActionPerformed
        // TODO add your handling code here:
        try {
            HashMap parameter = new HashMap();
            InputStream file = getClass().getResourceAsStream("/report/DataNasabah.jrxml");
            JasperDesign JasperDesign = JRXmlLoader.load(file);
            JasperReport JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint JasperPrint = JasperFillManager.fillReport(JasperReport, parameter, conn );
            JasperViewer.viewReport(JasperPrint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_DataNasabahActionPerformed

    private void b_data_jaminanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_data_jaminanActionPerformed
        // TODO add your handling code here:
        FormDataJaminan FormData = new FormDataJaminan();
        FormData.id_user = l_id_user.getText();
        FormData.nama_user = l_nama_user.getText();
        FormData.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_data_jaminanActionPerformed

    private void DataJaminanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataJaminanActionPerformed
        // TODO add your handling code here:
        try {
            HashMap parameter = new HashMap();
            InputStream file = getClass().getResourceAsStream("/report/DataJaminan.jrxml");
            JasperDesign JasperDesign = JRXmlLoader.load(file);
            JasperReport JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint JasperPrint = JasperFillManager.fillReport(JasperReport, parameter, conn );
            JasperViewer.viewReport(JasperPrint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_DataJaminanActionPerformed

    private void b_data_bi_checkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_data_bi_checkingActionPerformed
        // TODO add your handling code here:
        FDataBIChecking FormData = new FDataBIChecking();
        FormData.id_user = l_id_user.getText();
        FormData.nama_user = l_nama_user.getText();
        FormData.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_data_bi_checkingActionPerformed

    private void BICheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BICheckingActionPerformed
        // TODO add your handling code here:
        try {
            HashMap parameter = new HashMap();
            InputStream file = getClass().getResourceAsStream("/report/DataBIChecking.jrxml");
            JasperDesign JasperDesign = JRXmlLoader.load(file);
            JasperReport JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint JasperPrint = JasperFillManager.fillReport(JasperReport, parameter, conn );
            JasperViewer.viewReport(JasperPrint, false);
        } catch (JRException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_BICheckingActionPerformed

    private void b_kesesuaian_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_kesesuaian_dataActionPerformed
        // TODO add your handling code here:
        FHasilAnalisaNasabah FormData = new FHasilAnalisaNasabah();
        FormData.id_user = l_id_user.getText();
        FormData.nama_user = l_nama_user.getText();
        FormData.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_b_kesesuaian_dataActionPerformed

    private void PerhitunganBICheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerhitunganBICheckingActionPerformed
        // TODO add your handling code here:
        try {
            HashMap parameter = new HashMap();
            InputStream file = getClass().getResourceAsStream("/report/DataPerhitunganBIChecking.jrxml");
            JasperDesign JasperDesign = JRXmlLoader.load(file);
            JasperReport JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint JasperPrint = JasperFillManager.fillReport(JasperReport, parameter, conn );
            JasperViewer.viewReport(JasperPrint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_PerhitunganBICheckingActionPerformed

    private void b_hasil_perhitungan_bi_checkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hasil_perhitungan_bi_checkingActionPerformed
        // TODO add your handling code here:
        FPerhitunganBIChecking FormData = new FPerhitunganBIChecking();
        FormData.id_user = l_id_user.getText();
        FormData.nama_user = l_nama_user.getText();
        FormData.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_hasil_perhitungan_bi_checkingActionPerformed

    private void AnalisaNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalisaNasabahActionPerformed
        // TODO add your handling code here:
        try {
            HashMap parameter = new HashMap();
            InputStream file = getClass().getResourceAsStream("/report/DataAnalisaNasabah.jrxml");
            JasperDesign JasperDesign = JRXmlLoader.load(file);
            JasperReport JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint JasperPrint = JasperFillManager.fillReport(JasperReport, parameter, conn );
            JasperViewer.viewReport(JasperPrint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_AnalisaNasabahActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FUtama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem AnalisaNasabah;
    private javax.swing.JMenuItem BIChecking;
    private javax.swing.JMenuItem DataJaminan;
    private javax.swing.JMenuItem DataNasabah;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JLabel LBackgroundHome;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem PerhitunganBIChecking;
    private javax.swing.JButton b_data_bi_checking;
    private javax.swing.JButton b_data_jaminan;
    private javax.swing.JButton b_data_pemohon;
    private javax.swing.JButton b_hasil_perhitungan_bi_checking;
    private javax.swing.JButton b_kesesuaian_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel l_id_admin1;
    public javax.swing.JLabel l_id_user;
    private javax.swing.JLabel l_jam;
    public javax.swing.JLabel l_nama_user;
    private javax.swing.JLabel l_tanggal;
    // End of variables declaration//GEN-END:variables
}
