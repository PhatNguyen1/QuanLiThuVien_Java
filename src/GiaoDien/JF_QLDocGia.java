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
public class JF_QLDocGia extends javax.swing.JFrame {
    DefaultTableModel tblModel;
    /**
     * Creates new form JF_QLDocGia
     */ 
    
    public JF_QLDocGia(){ 
        initComponents();
        initTable() ;
        loadKhachHang();
        
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MaKhach","TenKhach","DiaChi","Sdt"});
        tableDG.setModel(tblModel);
    }
    private void loadKhachHang(){ 
        String sql = "select * from KhachHang ";
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
                String[] row = new String[]{rs.getString("MaKhach"),rs.getString("TenKhach"),rs.getString("DiaChi"),rs.getString("Sdt")} ;
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        RadioDG = new javax.swing.JRadioButton();
        RadioTenDocGia = new javax.swing.JRadioButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnResettimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDG = new javax.swing.JTable();
        btBack1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        madocgia = new javax.swing.JLabel();
        tendocgia = new javax.swing.JLabel();
        diachi = new javax.swing.JLabel();
        abd = new javax.swing.JLabel();
        txtDG = new javax.swing.JTextField();
        txtTenDG = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin độc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(124, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm độc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        buttonGroup1.add(RadioDG);
        RadioDG.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RadioDG.setText("Mã Khách");

        buttonGroup1.add(RadioTenDocGia);
        RadioTenDocGia.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RadioTenDocGia.setText("Tên Khách");

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnTimKiem.setText("Tìm kiếm ");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnResettimkiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnResettimkiem.setText("Reset");
        btnResettimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResettimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(RadioDG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioTenDocGia)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiem)
                .addGap(20, 20, 20)
                .addComponent(btnResettimkiem)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioDG)
                    .addComponent(RadioTenDocGia))
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(btnResettimkiem))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tableDG.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tableDG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MaKhách", "TenKhach", "Địachỉ", "SĐT"
            }
        ));
        tableDG.setGridColor(new java.awt.Color(0, 153, 153));
        tableDG.setMaximumSize(new java.awt.Dimension(30, 64));
        tableDG.setRowHeight(23);
        tableDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDG);

        btBack1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBack1.setForeground(new java.awt.Color(255, 0, 51));
        btBack1.setText("Thoát");
        btBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btBack1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lý độc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(255, 51, 0))); // NOI18N

        madocgia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        madocgia.setText("Mã khách");

        tendocgia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tendocgia.setText("Tên Khách");

        diachi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        diachi.setText("Địa chỉ");

        abd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        abd.setText("SĐT");

        txtDG.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtTenDG.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tendocgia)
                    .addComponent(diachi)
                    .addComponent(abd)
                    .addComponent(btnThem)
                    .addComponent(madocgia))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDG)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnSua)
                        .addGap(41, 41, 41)
                        .addComponent(btnReset)
                        .addGap(13, 13, 13))
                    .addComponent(txtDiaChi)
                    .addComponent(txtTenDG)
                    .addComponent(txtSDT))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(madocgia)
                    .addComponent(txtDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tendocgia)
                    .addComponent(txtTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diachi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abd)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnReset))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Quản Lý Độc Giả");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

 if (txtDG.getText().isEmpty() || txtTenDG.getText().isEmpty() || txtDiaChi.getText().isEmpty() || txtSDT.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin độc giả.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if (!txtSDT.getText().trim().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Số điện thoại chỉ được chứa số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if (isMaKhachExist(txtDG.getText())) {
        JOptionPane.showMessageDialog(this, "Mã Khach hàng đã tồn tại trong CSDL.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
         String sql = "INSERT INTO KhachHang (MaKhach, TenKhach, DiaChi, Sdt) VALUES (?, ?, ?, ?)";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            psta.setString(1, txtDG.getText());
            psta.setString(2, txtTenDG.getText());
            psta.setString(3, txtDiaChi.getText());
            psta.setString(4, txtSDT.getText());
            psta.executeUpdate();
            System.out.println("Them khach hang thanh cong");
            JOptionPane.showMessageDialog(this ,  "Them khach hang thanh cong"); 

            // Clear input fields
            txtDG.setText("");
            txtTenDG.setText("");
            txtDiaChi.setText("");
            txtSDT.setText("");

            // Reload table data
            loadKhachHang();
        } catch (Exception e) {
            System.out.println("Them khach hang khong thanh cong");
            JOptionPane.showMessageDialog(this ,  "Them khach hang không thanh cong"); 
            e.printStackTrace();
        }
    }                                       

    private boolean isMaKhachExist(String maKhach) {
    String sql = "SELECT COUNT(*) FROM KhachHang WHERE MaKhach = ?";
    try (
        Connection con = Code.DataBaseHelper.openConnection();
        PreparedStatement psta = con.prepareStatement(sql);
    ) {
        psta.setString(1, maKhach);
        ResultSet rs = psta.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnResettimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResettimkiemActionPerformed
        // TODO add your handling code here:
        txtTimKiem.setText("");
        loadKhachHang();
       

    }//GEN-LAST:event_btnResettimkiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String timKiem = txtTimKiem.getText().trim();
        String column = RadioDG.isSelected() ? "MaKhach" : "TenKhach"; // Chọn cột dựa vào radio button được chọn

        String sql = "SELECT * FROM KhachHang WHERE " + column + " LIKE ?";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            psta.setString(1, "%" + timKiem + "%");
            ResultSet rs = psta.executeQuery();

            tblModel.setRowCount(0); // Xóa dữ liệu cũ trong bảng

            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString("MaKhach"),
                    rs.getString("TenKhach"),
                    rs.getString("DiaChi"),
                    rs.getString("Sdt")
                };
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Lỗi khi tìm kiếm Khach hang: " + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tableDGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDGMouseClicked
        // TODO add your handling code here:
        int r = tableDG.getSelectedRow() ; 
        if(r < 0 )
        {
            return  ; 
        }
        txtDG.setText(tableDG.getValueAt(r, 0).toString()); 
        txtTenDG.setText(tableDG.getValueAt(r, 1).toString()); 
        txtDiaChi.setText(tableDG.getValueAt(r, 2).toString()); 
        txtSDT.setText(tableDG.getValueAt(r, 3).toString()); 
    }//GEN-LAST:event_tableDGMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String maNV = txtDG.getText().trim();

        if (maNV.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên cần xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM KhachHang WHERE MaKhach LIKE ?";
            try (
                Connection con = Code.DataBaseHelper.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);
            ) {
                psta.setString(1, "%" + maNV + "%");
                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.");
                    // Sau khi xóa, cập nhật lại bảng
                    loadKhachHang();
                } else {
                    JOptionPane.showMessageDialog(this, "Không có nhân viên nào được xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                System.out.println("Lỗi khi xóa nhân viên: " + ex.getMessage());
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Xóa nhân viên không thành công.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (!txtSDT.getText().trim().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Số điện thoại chỉ được chứa số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if(JOptionPane.showConfirmDialog(this,"Do you want to Update? ") == JOptionPane.NO_OPTION) 
         {
             return  ; 
         }
         String sql = "update KhachHang set TenKhach=?,DiaChi=?,Sdt=? where MaKhach=?" ; 
         try
        (
            Connection con = Code.DataBaseHelper.openConnection();  
            PreparedStatement pstm = con.prepareStatement(sql) ; 
        )
        {
            pstm.setString(4,txtDG.getText()); 
            pstm.setString(1,txtTenDG.getText());  
            pstm.setString(2,txtDiaChi.getText()); 
            pstm.setString(3,txtSDT.getText());
            pstm.executeUpdate() ; 
            loadKhachHang(); 
            JOptionPane.showMessageDialog(this ,  "Độc giả mới đã được cập nhập"); 
        } catch (Exception e) {
        }
    
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        
        txtDG.setText("");
        txtTenDG.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtDG.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(JF_QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_QLDocGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioDG;
    private javax.swing.JRadioButton RadioTenDocGia;
    private javax.swing.JLabel abd;
    private javax.swing.JButton btBack1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResettimkiem;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel diachi;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel madocgia;
    private javax.swing.JTable tableDG;
    private javax.swing.JLabel tendocgia;
    private javax.swing.JTextField txtDG;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenDG;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
