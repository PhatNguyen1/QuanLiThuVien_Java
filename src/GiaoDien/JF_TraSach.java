/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class JF_TraSach extends javax.swing.JFrame {

    /**
     * Creates new form JF_TraSach
     */
    DefaultTableModel tblModel;
    public JF_TraSach() {
        initComponents(); 
        initTable() ; 
        loadSach() ; 
    } 
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MaPhieu","MaSach","MaDocGia","NgayMuon","NgayTra"});
        tblSach.setModel(tblModel);
    }
     private void loadSach(){ 
        String sql = "SELECT pm.MaPhieu,ctp.MaSach, pm.MaKhach, ctp.NgayMuon, ctp.NgayTra FROM PhieuMuon pm JOIN Chitietphieumuon ctp ON pm.MaPhieu = ctp.MaPhieu WHERE ctp.TinhTrang = N'mượn'";
        try
        (
            Connection con = Code.DataBaseHelper.openConnection();  
            PreparedStatement psta = con.prepareStatement(sql) ;
        )
        {
            System.out.println("Ket noi thanh cong");
            ResultSet rs = psta.executeQuery() ;
            tblModel.setRowCount(0);
            while(rs.next())
            {
                String[] row = new String[]{rs.getString("MaPhieu"),rs.getString("MaSach"),rs.getString("MaKhach"),rs.getString("NgayMuon"),rs.getString("NgayTra")} ;
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTraSach = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnKTraDG = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        btTraSach = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        btBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnTraSach.setBackground(new java.awt.Color(255, 255, 255));
        pnTraSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(93, 151, 175));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý trả sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã đọc giả");

        btnKTraDG.setBackground(new java.awt.Color(51, 143, 144));
        btnKTraDG.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKTraDG.setForeground(new java.awt.Color(255, 255, 255));
        btnKTraDG.setToolTipText("");
        btnKTraDG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKTraDG.setLabel("Kiểm tra");
        btnKTraDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKTraDGActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã sách");

        txtMaDG.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtMaDG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMaSach.setEditable(false);
        txtMaSach.setBackground(new java.awt.Color(255, 255, 204));
        txtMaSach.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtMaSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btTraSach.setBackground(new java.awt.Color(51, 143, 144));
        btTraSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btTraSach.setForeground(new java.awt.Color(255, 255, 255));
        btTraSach.setText("Trả Sách");
        btTraSach.setToolTipText("");
        btTraSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnKTraDG, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKTraDG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204)), "Danh sách sách đang được mượn", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 153, 153))); // NOI18N

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu Mượn", "Mã Sách", "Mã Khách", "Ngày Mượn", "Ngày Trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSach.setRowHeight(23);
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btBack1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBack1.setForeground(new java.awt.Color(255, 0, 51));
        btBack1.setText("Thoát");
        btBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTraSachLayout = new javax.swing.GroupLayout(pnTraSach);
        pnTraSach.setLayout(pnTraSachLayout);
        pnTraSachLayout.setHorizontalGroup(
            pnTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnTraSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTraSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBack1)
                .addGap(28, 28, 28))
        );
        pnTraSachLayout.setVerticalGroup(
            pnTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTraSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btBack1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTraSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKTraDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKTraDGActionPerformed
        // TODO add your handling code here:
        String maDocGia = txtMaDG.getText().trim();
//        if (maDocGia.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã khách hàng", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        String sql =  "SELECT pm.MaPhieu,ctp.MaSach, pm.MaKhach, ctp.NgayMuon, ctp.NgayTra FROM PhieuMuon pm JOIN Chitietphieumuon ctp ON pm.MaPhieu = ctp.MaPhieu WHERE  pm.MaKhach = ? and ctp.TinhTrang = N'mượn'";;
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            psta.setString(1, maDocGia);
            ResultSet rs = psta.executeQuery();

           tblModel.setRowCount(0); // Xóa dữ liệu cũ trong bảng

            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString("MaPhieu"),
                    rs.getString("MaSach"),
                    rs.getString("MaKhach"),
                    rs.getString("NgayMuon"),
                    rs.getString("NgayTra")
                };
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
            
        } catch (Exception e) {
            System.out.println("Lỗi khi tìm kiếm nhân viên: " + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnKTraDGActionPerformed

    private void btTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraSachActionPerformed
        // TODO add your handling code here:  
            if (JOptionPane.showConfirmDialog(this, "Chắc chắn Trả Sách này?") == JOptionPane.NO_OPTION) {
            return;
        } 

        // Tạo câu lệnh SQL để cập nhật tình trạng của sách đã trả
        String sql = "UPDATE Chitietphieumuon SET TinhTrang = N'đã trả' WHERE MaSach = ? and MaPhieu = ?"; 

        try (Connection con = Code.DataBaseHelper.openConnection();
             PreparedStatement pstm = con.prepareStatement(sql)) {

            // Xóa hàng tương ứng từ mô hình bảng
            int selectedRow = tblSach.getSelectedRow();
            if (selectedRow != -1) {
                String maSach = tblModel.getValueAt(selectedRow, tblModel.findColumn("MaSach")).toString();
                String maPhieu = tblModel.getValueAt(selectedRow, tblModel.findColumn("MaPhieu")).toString();

                // Thiết lập tham số cho câu lệnh SQL
                pstm.setString(1, maSach);
                pstm.setString(2, maPhieu);

                // Thực thi câu lệnh SQL để cập nhật dữ liệu
                pstm.executeUpdate();           

                // Xóa hàng tương ứng từ mô hình bảng
                tblModel.removeRow(selectedRow);

                // Hiển thị thông báo khi sách đã được trả
                JOptionPane.showMessageDialog(this, "Sách đã được trả!!");
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một sách để trả!");
            }

            } catch (Exception e) {
                e.printStackTrace(); // Hiển thị thông báo lỗi nếu có
            }

    }//GEN-LAST:event_btTraSachActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        int row = tblSach.getSelectedRow() ; 
        if( row  >= 0 )
        {
            txtMaSach.setText(tblSach.getValueAt(row,1).toString());  
        }
    }//GEN-LAST:event_tblSachMouseClicked

    private void btBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBack1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btBack1ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_TraSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack1;
    private javax.swing.JButton btTraSach;
    private javax.swing.JButton btnKTraDG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnTraSach;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtMaSach;
    // End of variables declaration//GEN-END:variables
}
