/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Koneksi.Koneksi;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rizkytanjung
 */
public class FPerhitunganBIChecking extends javax.swing.JFrame {

    /**
     * Creates new form FDataBarang
     */
    private DefaultTableModel tabmode;
    private final Connection conn = new Koneksi().getConnection();
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private String sql;

    NumberFormat numberFormat = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public FPerhitunganBIChecking() {
        initComponents();

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width, screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        t_nama_nasabah.setEnabled(false);
        t_nik.setEnabled(false);

        kodeBi();
        view_data();
        tampilNasabah();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_nama_nasabah = new javax.swing.JTextField();
        b_save = new javax.swing.JButton();
        b_cancel = new javax.swing.JButton();
        b_refresh_table = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data_bi_Checking = new javax.swing.JTable();
        b_search = new javax.swing.JButton();
        t_search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        b_edit = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t_nik = new javax.swing.JTextField();
        c_kode_nasabah = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        t_biaya = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t_jumlah = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        c_status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(237, 229, 252));

        jPanel1.setBackground(new java.awt.Color(28, 64, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 46));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Perhitungan BI Checking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jLabel3.setText("Kode Nasabah");

        jLabel4.setText("Nama Nasabah");

        t_nama_nasabah.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        b_save.setText("SAVE");
        b_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveActionPerformed(evt);
            }
        });

        b_cancel.setText("CANCEL");
        b_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });

        b_refresh_table.setText("Refresh Table");
        b_refresh_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refresh_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refresh_tableActionPerformed(evt);
            }
        });

        tbl_data_bi_Checking.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_data_bi_Checking);

        b_search.setText("Search");
        b_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchActionPerformed(evt);
            }
        });

        t_search.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        t_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_searchKeyTyped(evt);
            }
        });

        b_edit.setText("Edit");
        b_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });

        b_delete.setText("Delete");
        b_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        jLabel5.setText("NIK");

        t_nik.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        c_kode_nasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_kode_nasabahActionPerformed(evt);
            }
        });

        jLabel11.setText("Pembiayaan di bank lain");

        t_biaya.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        jLabel12.setText("Jumlah");

        t_jumlah.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        jLabel13.setText("Status");

        c_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Lancar", "Tidak Lancar" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_search))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t_nama_nasabah)
                                    .addComponent(c_kode_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(t_nik, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(t_biaya, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(c_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_refresh_table, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(b_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(b_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(b_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(c_kode_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t_nama_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)))
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(c_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(b_refresh_table, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_search)
                                    .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String id_user, nama_user, idBiChecking;

    private void kodeBi() {
        try {
            statement = conn.createStatement();

            sql = "SELECT * FROM tb_perhitungan_bi_checking ORDER by id_checking DESC";
            resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String kbar = resultSet.getString("id_checking").substring(1);
                String AN = "" + (Integer.parseInt(kbar) + 1);
                String Nol = "";

                switch (AN.length()) {
                    case 1:
                        Nol = "0000";
                        break;
                    case 2:
                        Nol = "000";
                        break;
                    case 3:
                        Nol = "00";
                        break;
                    case 4:
                        Nol = "0";
                        break;
                    case 5:
                        Nol = "";
                        break;
                    default:
                        break;
                }
                idBiChecking = "B" + Nol + AN;
            } else {
                idBiChecking = "B00001";
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void tampilNasabah() {
        c_kode_nasabah.removeAllItems();
        try {
            sql = "SELECT * FROM tb_data_pemohon ORDER BY id_pemohon";
            statement = conn.createStatement();
            ResultSet hasil = statement.executeQuery(sql);
            c_kode_nasabah.addItem("--Pilih--");
            while (hasil.next()) {
                String kode = hasil.getString("id_pemohon");
                c_kode_nasabah.addItem(kode);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kode Nasabah TIDAK DITEMUKAN.\n" + e, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void listNasabah() {
        try {
            sql = "SELECT * FROM tb_data_pemohon WHERE id_pemohon = '" + c_kode_nasabah.getSelectedItem() + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                t_nama_nasabah.setText(rs.getString("nama_pemohon"));
                t_nik.setText(rs.getString("nik"));
            } else {
                t_nama_nasabah.setText(null);
                t_nik.setText(null);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void reset_text() {
        c_kode_nasabah.setSelectedItem("--Pilih--");
        t_nama_nasabah.setText("");
        t_nik.setText("");
        t_biaya.setText("");
        t_jumlah.setText("");
        c_status.setSelectedItem("--Pilih--");
    }

    private void view_data() {
        Object[] baris = {
            "ID BI Checking",
            "Kode nasabah",
            "Nama nasabah",
            "NIK",
            "Bank Lain",
            "Jumlah",
            "Status"
        };
        tabmode = new DefaultTableModel(null, baris);
        tbl_data_bi_Checking.setModel(tabmode);
        String search;
        if ("".equals(t_search.getText())) {
            search = "";
        } else {
            search = t_search.getText();
        }
        try {
            sql = "SELECT * FROM tb_perhitungan_bi_checking"
                    + " WHERE id_checking LIKE '%" + search + "%'";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String kodeBi = hasil.getString("id_checking");
                String kodeNasabah = hasil.getString("kode_nasabah");
                String namaNasabah = hasil.getString("nama_nasabah");
                String nik = hasil.getString("nik");
                String biaya = hasil.getString("biaya");
                String jumlah = hasil.getString("jumlah");
                String status = hasil.getString("status");

                String[] data = {
                    kodeBi,
                    kodeNasabah,
                    namaNasabah,
                    nik,
                    biaya,
                    jumlah,
                    status
                };
                tabmode.addRow(data);
                kodeBi();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL\n" + e, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        FUtama FormUtama = new FUtama();
        FormUtama.l_id_user.setText(id_user);
        FormUtama.l_nama_user.setText(nama_user);
        FormUtama.setVisible(true);
        this.setVisible(false);
//        JOptionPane.showMessageDialog(null, "Closing DISINI!","Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_formWindowClosing

    private void c_kode_nasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_kode_nasabahActionPerformed
        // TODO add your handling code here:
        listNasabah();
    }//GEN-LAST:event_c_kode_nasabahActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
        int row_count = tbl_data_bi_Checking.getRowCount();

        if (row_count <= 0) {
            JOptionPane.showMessageDialog(null, "Data yang akan dihapus KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int baris = tbl_data_bi_Checking.getSelectedRow();
            //JOptionPane.showMessageDialog(null,"Baris dipilih "+baris,"Info", JOptionPane.INFORMATION_MESSAGE);
            if (baris < 0) {
                JOptionPane.showMessageDialog(null, "Data yang akan dihapus BELUM DIPILIH!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String kode = (String) tbl_data_bi_Checking.getValueAt(baris, 0);
                int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data: " + kode + " ini..?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (ok == 0) {
                    try {
                        //panggil method koneksi
                        sql = "DELETE FROM tb_perhitungan_bi_checking WHERE id_checking ='" + kode + "'";
                        Statement st = conn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Menghapus data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
                        view_data();
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Meghapus data GAGAL" + ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
        // TODO add your handling code here:

        int row_count = tbl_data_bi_Checking.getRowCount();

        if (row_count <= 0) {
            JOptionPane.showMessageDialog(null, "Data yang akan diedit KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int baris = tbl_data_bi_Checking.getSelectedRow();
            if (baris < 0) {
                JOptionPane.showMessageDialog(null, "Data yang akan diedit BELUM DIPILIH!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String kodeBi = (String) tbl_data_bi_Checking.getValueAt(baris, 0);
                String kodeNasabah = (String) tbl_data_bi_Checking.getValueAt(baris, 1);
                String namaNasabah = (String) tbl_data_bi_Checking.getValueAt(baris, 2);
                String nik = (String) tbl_data_bi_Checking.getValueAt(baris, 3);
                String biaya = (String) tbl_data_bi_Checking.getValueAt(baris, 4);
                String jumlah = (String) tbl_data_bi_Checking.getValueAt(baris, 5);
                String status = (String) tbl_data_bi_Checking.getValueAt(baris, 6);
                b_save.setText("UPDATE");
                idBiChecking = kodeBi;
                c_kode_nasabah.setSelectedItem(kodeNasabah);
                t_nama_nasabah.setText(namaNasabah);
                t_nik.setText(nik);
                t_biaya.setText(biaya);
                t_jumlah.setText(jumlah);
                c_status.setSelectedItem(status);
                search_data_jaminan();
            }
        }
    }//GEN-LAST:event_b_editActionPerformed

    private void t_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_searchKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            view_data();
        }
    }//GEN-LAST:event_t_searchKeyTyped

    private void b_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchActionPerformed
        // TODO add your handling code here:
        view_data();
    }//GEN-LAST:event_b_searchActionPerformed

    private void b_refresh_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refresh_tableActionPerformed
        // TODO add your handling code here:
        view_data();
    }//GEN-LAST:event_b_refresh_tableActionPerformed

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        // TODO add your handling code here:
        reset_text();
    }//GEN-LAST:event_b_cancelActionPerformed

    private void b_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveActionPerformed
        // TODO add your handling code here:
        if ("--Pilih--".equals(c_kode_nasabah.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Kode Nasabah BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            c_kode_nasabah.requestFocus();
        } else if ("".equals(t_biaya.getText())) {
            JOptionPane.showMessageDialog(null, "Biaya BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            t_biaya.requestFocus();
        }else if ("".equals(t_jumlah.getText())) {
            JOptionPane.showMessageDialog(null, "Jumlah BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            t_jumlah.requestFocus();
        }else if ("--Pilih--".equals(c_status.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Status BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            c_status.requestFocus();
        }else {
            if ("SAVE".equals(b_save.getText())) {
                save_data();
            } else {
                update_data();
            }
        }
    }//GEN-LAST:event_b_saveActionPerformed

    private void save_data() {
        try {
            sql = "INSERT INTO tb_perhitungan_bi_checking VALUES"
                    + "("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";
            PreparedStatement stat;
            stat = conn.prepareStatement(sql);
            stat.setString(1, idBiChecking);
            stat.setString(2, c_kode_nasabah.getSelectedItem().toString());
            stat.setString(3, t_nama_nasabah.getText());
            stat.setString(4, t_nik.getText());
            stat.setString(5, t_biaya.getText());
            stat.setString(6, t_jumlah.getText());
            stat.setString(7, c_status.getSelectedItem().toString());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
            view_data();
            reset_text();
            c_kode_nasabah.requestFocus();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL.\n" + se, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void update_data() {
        try {
            sql = "UPDATE tb_perhitungan_bi_checking SET "
                    + "kode_nasabah = ?,"
                    + "nama_nasabah = ?,"
                    + "nik = ?,"
                    + "biaya = ?,"
                    + "jumlah = ?,"
                    + "status = ?"
                    + " WHERE id_checking = '" + idBiChecking + "'";
            PreparedStatement stat;
            stat = conn.prepareStatement(sql);
            stat.setString(1, c_kode_nasabah.getSelectedItem().toString());
            stat.setString(2, t_nama_nasabah.getText());
            stat.setString(3, t_nik.getText());
            stat.setString(4, t_biaya.getText());
            stat.setString(5, t_jumlah.getText());
            stat.setString(6, c_status.getSelectedItem().toString());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
            b_save.setText("SAVE");
            reset_text();
            view_data();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Update data GAGAL\n " + se, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void search_data_jaminan() {
        sql = ""
                + " SELECT *"
                + " FROM tb_perhitungan_bi_checking"
                + " WHERE id_checking = '" + idBiChecking + "'";
        try {
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                idBiChecking = resultSet.getString("id_checking");
            } else {
                JOptionPane.showMessageDialog(null, "Data Barang TIDAK DITEMUKAN", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pencarian Data jaminan GAGAL! \n" + e, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPerhitunganBIChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new FPerhitunganBIChecking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_edit;
    private javax.swing.JButton b_refresh_table;
    private javax.swing.JButton b_save;
    private javax.swing.JButton b_search;
    private javax.swing.JComboBox<String> c_kode_nasabah;
    private javax.swing.JComboBox<String> c_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t_biaya;
    private javax.swing.JTextField t_jumlah;
    private javax.swing.JTextField t_nama_nasabah;
    private javax.swing.JTextField t_nik;
    private javax.swing.JTextField t_search;
    private javax.swing.JTable tbl_data_bi_Checking;
    // End of variables declaration//GEN-END:variables
}
