/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class JF_QLNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form JF_QLNhanVien
     */
    DefaultTableModel tblModel, tblModel1;
    public JF_QLNhanVien() {
        initComponents();
        initTableNhanVien();
        loadNhanvien();
        initTablePhanQuyen();
        loadPhanQuyen();
    }
    private void initTableNhanVien(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MaNhanVien","TenNhanVien","Dịachi","Sdt"});
        tblTTNV.setModel(tblModel);
    }
   
    private void loadNhanvien(){ 
       String sql = "SELECT * FROM NhanVien";
        try (
            Connection con = Code.DataBaseHelper.openConnection();  
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            System.out.println("Ket noi thanh cong");
            ResultSet rs = psta.executeQuery();
            tblModel.setRowCount(0); // Clear existing data
            while (rs.next()) {
                String[] row = new String[] {
                    rs.getString("MaNV"),
                    rs.getString("TenNV"),
                    rs.getString("DiaChi"),
                    rs.getString("Sdt")
                };
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
            e.printStackTrace();
        }
    }
    
    private void initTablePhanQuyen(){
        tblModel1 = new DefaultTableModel();
        tblModel1.setColumnIdentifiers(new String[]{"MaNhanVien","Pass","Phanquyen"});
        tblPhanQuyen.setModel(tblModel1);
        
//        comboPQ = new JComboBox<>(new String[] {"admin", "nhân viên"});
//        comboPQ.setSelectedIndex(-1); // Để không có giá trị nào được chọn sẵn
    }
    
    private void loadPhanQuyen(){ 
       String sql = "SELECT * FROM PhanQuyen";
        try (
            Connection con = Code.DataBaseHelper.openConnection();  
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            System.out.println("Ket noi thanh cong");
            ResultSet rs = psta.executeQuery();
            tblModel1.setRowCount(0); // Clear existing data
            while (rs.next()) {
                String[] row = new String[] {
                    rs.getString("MaNV"),
                    rs.getString("pass"),
                    rs.getString("phanquyen")
                };
                tblModel1.addRow(row);
            }
            tblModel1.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
            e.printStackTrace();
        }
    }
    
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnResetNV = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bntXoaPQ = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPhanQuyen = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaNVPQ = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtPQ = new javax.swing.JTextField();
        bntSuaPQ = new javax.swing.JButton();
        bntThemPQ = new javax.swing.JButton();
        btnResetPQ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        radioMaNV = new javax.swing.JRadioButton();
        radioTenNV = new javax.swing.JRadioButton();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        btnResetTimKiem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTTNV = new javax.swing.JTable();
        btBack1 = new javax.swing.JButton();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Quản lý nhân viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Địa chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("SDT");

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnResetNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetNV.setText("Reset");
        btnResetNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetNVActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Quản lý phân quyền"));

        bntXoaPQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntXoaPQ.setText("Xóa");
        bntXoaPQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaPQActionPerformed(evt);
            }
        });

        tblPhanQuyen.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPhanQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhanQuyenMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPhanQuyen);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Mã nhân viên");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Phân quyền ");

        txtMaNVPQ.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtPQ.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        bntSuaPQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntSuaPQ.setText("Sửa");
        bntSuaPQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSuaPQActionPerformed(evt);
            }
        });

        bntThemPQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntThemPQ.setText("Thêm");
        bntThemPQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemPQActionPerformed(evt);
            }
        });

        btnResetPQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetPQ.setText("Reset");
        btnResetPQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMaNVPQ))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPQ)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bntThemPQ)
                                .addGap(45, 45, 45)
                                .addComponent(bntXoaPQ)
                                .addGap(45, 45, 45)
                                .addComponent(bntSuaPQ)
                                .addGap(55, 55, 55)
                                .addComponent(btnResetPQ)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNVPQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntXoaPQ)
                    .addComponent(bntThemPQ)
                    .addComponent(bntSuaPQ)
                    .addComponent(btnResetPQ))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(txtMaNV))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(76, 76, 76)
                                .addComponent(txtDiaChi))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(93, 93, 93)
                                .addComponent(txtSDT))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnThem)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtTenNV))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua)
                                .addGap(56, 56, 56)
                                .addComponent(btnResetNV)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3))
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnResetNV))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhân viên"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm nhân viên"));

        buttonGroup1.add(radioMaNV);
        radioMaNV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioMaNV.setText("Mã nhân viên ");

        buttonGroup1.add(radioTenNV);
        radioTenNV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioTenNV.setText("Tên nhân viên");

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnTimkiem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTimkiem.setText("Tìm kiếm ");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        btnResetTimKiem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnResetTimKiem.setText("Reset");
        btnResetTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResetTimKiem)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(radioMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioTenNV)
                .addGap(60, 60, 60))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMaNV)
                    .addComponent(radioTenNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimkiem)
                    .addComponent(btnResetTimKiem))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tblTTNV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblTTNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Địa Chỉ", "SDT"
            }
        ));
        tblTTNV.setRowHeight(23);
        tblTTNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTTNVMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTTNV);

        btBack1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBack1.setForeground(new java.awt.Color(255, 42, 42));
        btBack1.setText("Thoát");
        btBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBack1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetNVActionPerformed
        // TODO add your handling code here:
        txtMaNV.setText("");
        txtMaNV.setEditable(true);
        txtTenNV.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtMaNV.requestFocus();
    }//GEN-LAST:event_btnResetNVActionPerformed

    private void btnResetTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTimKiemActionPerformed
        // TODO add your handling code here:
        txtTimkiem.setText("");
        loadNhanvien();
    }//GEN-LAST:event_btnResetTimKiemActionPerformed

    private void tblTTNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTTNVMouseClicked
        // TODO add your handling code here:
        int r = tblTTNV.getSelectedRow();
        if ( r < 0){
            return;
        }
        
        txtMaNV.setText(tblTTNV.getValueAt(r, 0).toString());
        txtTenNV.setText(tblTTNV.getValueAt(r, 1).toString());
        txtDiaChi.setText(tblTTNV.getValueAt(r, 2).toString());
        txtSDT.setText(tblTTNV.getValueAt(r, 3).toString());
    }//GEN-LAST:event_tblTTNVMouseClicked

    private void tblPhanQuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhanQuyenMouseClicked
        // TODO add your handling code here:
        int r = tblPhanQuyen.getSelectedRow();
        if ( r < 0){
            return;
        }
        txtMaNVPQ.setText(tblPhanQuyen.getValueAt(r, 0).toString());
        txtPass.setText(tblPhanQuyen.getValueAt(r, 1).toString());
        txtPQ.setText(tblPhanQuyen.getValueAt(r, 2).toString());
        String pqValue = tblPhanQuyen.getValueAt(r, 2).toString();
//        comboPQ.setSelectedItem(pqValue); // Set the value of comboPQ
    }//GEN-LAST:event_tblPhanQuyenMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (txtMaNV.getText().isEmpty() || txtTenNV.getText().isEmpty() || txtDiaChi.getText().isEmpty() || txtSDT.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if (!txtSDT.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Số điện thoại chỉ được chứa số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if (isMaNVExist(txtMaNV.getText())) {
        JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại trong CSDL.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
         String sql = "INSERT INTO NhanVien (MaNV, TenNV, DiaChi, Sdt) VALUES (?, ?, ?, ?)";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            psta.setString(1, txtMaNV.getText());
            psta.setString(2, txtTenNV.getText());
            psta.setString(3, txtDiaChi.getText());
            psta.setString(4, txtSDT.getText());
            psta.executeUpdate();
            System.out.println("Them nhan vien thanh cong");

            // Clear input fields
            txtMaNV.setText("");
            txtTenNV.setText("");
            txtDiaChi.setText("");
            txtSDT.setText("");

            // Reload table data
            loadNhanvien();
            
        } catch (Exception e) {
            System.out.println("Them nhan vien khong thanh cong");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        String timKiem = txtTimkiem.getText().trim();
        String column = radioMaNV.isSelected() ? "MaNV" : "TenNV"; // Chọn cột dựa vào radio button được chọn

        String sql = "SELECT * FROM NhanVien WHERE " + column + " LIKE ?";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            psta.setString(1, "%" + timKiem + "%");
            ResultSet rs = psta.executeQuery();

            tblModel.setRowCount(0); // Xóa dữ liệu cũ trong bảng

            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString("MaNV"),
                    rs.getString("TenNV"),
                    rs.getString("DiaChi"),
                    rs.getString("Sdt")
                };
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Lỗi khi tìm kiếm nhân viên: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String maNV = txtMaNV.getText().trim();

        if (maNV.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên cần xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM NhanVien WHERE MaNV LIKE ?";
            try (
                Connection con = Code.DataBaseHelper.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);
            ) {
                psta.setString(1, "%" + maNV + "%");
                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.");
                    // Sau khi xóa, cập nhật lại bảng
                    loadNhanvien();
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
        String maNV = txtMaNV.getText().trim();
        txtMaNV.setEditable(false);
    if (maNV.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên cần sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    if (!txtSDT.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Số điện thoại chỉ được chứa số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
    
    // Lấy thông tin mới từ các trường dữ liệu trên form
    String tenNV = txtTenNV.getText().trim();
    String diaChi = txtDiaChi.getText().trim();
    String sdt = txtSDT.getText().trim();

    // Kiểm tra xem các trường thông tin mới có trống không
    if (tenNV.isEmpty() || diaChi.isEmpty() || sdt.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa thông tin nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        String sql = "UPDATE NhanVien SET TenNV = ?, DiaChi = ?, Sdt = ? WHERE MaNV LIKE ?";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            psta.setString(1, tenNV);
            psta.setString(2, diaChi);
            psta.setString(3, sdt);
            psta.setString(4, "%" + maNV + "%");
            int rowsAffected = psta.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thông tin nhân viên thành công.");
                // Sau khi sửa, cập nhật lại bảng
               loadNhanvien();
            } else {
                JOptionPane.showMessageDialog(this, "Không có nhân viên nào được sửa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi khi sửa thông tin nhân viên: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Sửa thông tin nhân viên không thành công.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void bntThemPQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemPQActionPerformed
        // TODO add your handling code here:
         if (txtMaNVPQ.getText().isEmpty() || txtPass.getText().isEmpty() || txtPQ.getText().isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
//        if (isMaNVExist(txtMaNV.getText())) {
//        JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại trong CSDL.", "Lỗi", JOptionPane.ERROR_MESSAGE);
//        return;
//        }
        
         String sql = "INSERT INTO PhanQuyen (MaNV, pass, phanquyen) VALUES (?, ?, ?)";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql);
        ) {
            psta.setString(1, txtMaNVPQ.getText());
            psta.setString(2, txtPass.getText());
//            psta.setString(3, comboPQ.getSelectedItem().toString());
            psta.executeUpdate();
            System.out.println("Them quyen nhan vien thanh cong");

            // Clear input fields
            txtMaNVPQ.setText("");
            txtPass.setText("");
            txtPQ.setText("");
          

            // Reload table data
           loadPhanQuyen();
            
        } catch (Exception e) {
            System.out.println("Them quyen nhan vien khong thanh cong");
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_bntThemPQActionPerformed

    private void btBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBack1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btBack1ActionPerformed

    private void bntXoaPQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaPQActionPerformed
        // TODO add your handling code here:
        String maNV = txtMaNVPQ.getText().trim();

        if (maNV.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên cần xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM PhanQuyen WHERE MaNV = ?";
            try (
                Connection con = Code.DataBaseHelper.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);
            ) {
                psta.setString(1, maNV);
                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa quyền nhân viên thành công.");
                    // Sau khi xóa, cập nhật lại bảng
                    loadPhanQuyen();
                } else {
                    JOptionPane.showMessageDialog(this, "Không có quyền nhân viên nào được xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                System.out.println("Lỗi khi xóa quyền nhân viên: " + ex.getMessage());
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Xóa quyền nhân viên không thành công.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bntXoaPQActionPerformed

    private void bntSuaPQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaPQActionPerformed
        // TODO add your handling code here:
        String maNV = txtMaNVPQ.getText().trim();
        String pass = txtPass.getText().trim();
        String phanquyen = txtPQ.getText().trim();

        if (maNV.isEmpty() || pass.isEmpty() || phanquyen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền tất cả các trường.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa quyền nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "UPDATE PhanQuyen SET phanquyen = ?,pass=? WHERE MaNV = ? ";
            try (
                Connection con = Code.DataBaseHelper.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);
            ) {
                psta.setString(1, phanquyen);
                psta.setString(2, pass);

                psta.setString(3, maNV);
                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Sửa quyền nhân viên thành công.");
                    // Sau khi sửa, cập nhật lại bảng
                    loadPhanQuyen();
                } else {
                    JOptionPane.showMessageDialog(this, "Không có quyền nhân viên nào được sửa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                System.out.println("Lỗi khi sửa quyền nhân viên: " + ex.getMessage());
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Sửa quyền nhân viên không thành công.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }//GEN-LAST:event_bntSuaPQActionPerformed

    private void btnResetPQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPQActionPerformed
        // TODO add your handling code here:
        txtMaNVPQ.setText("");
//        comboPQ.setSelectedIndex(-1);
        txtPass.setText("");
        txtMaNVPQ.requestFocus();
        
    }//GEN-LAST:event_btnResetPQActionPerformed

    private boolean isMaNVExist(String maNV) {
    String sql = "SELECT COUNT(*) FROM NhanVien WHERE MaNV = ?";
    try (
        Connection con = Code.DataBaseHelper.openConnection();
        PreparedStatement psta = con.prepareStatement(sql);
    ) {
        psta.setString(1, maNV);
        ResultSet rs = psta.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
    }
    
  
    
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
            java.util.logging.Logger.getLogger(JF_QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_QLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSuaPQ;
    private javax.swing.JButton bntThemPQ;
    private javax.swing.JButton bntXoaPQ;
    private javax.swing.JButton btBack1;
    private javax.swing.JButton btnResetNV;
    private javax.swing.JButton btnResetPQ;
    private javax.swing.JButton btnResetTimKiem;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton radioMaNV;
    private javax.swing.JRadioButton radioTenNV;
    private javax.swing.JTable tblPhanQuyen;
    private javax.swing.JTable tblTTNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaNVPQ;
    private javax.swing.JTextField txtPQ;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
