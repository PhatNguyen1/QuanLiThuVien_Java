/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DELL
 */
public class JF_MuonSach extends javax.swing.JFrame {
    DefaultTableModel tblModel, tblModel1 ;
    /**
     * Creates new form JF_MuonSach
     */
    public JF_MuonSach() {
        initComponents(); 
        initTable(); 
        loadSach() ; 
        initTableSach() ; 
        loadSach1(); 
        
    }
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MaSach","TenSach","TacGia","TinhTrang"});
        tableThongTinSachMuon.setModel(tblModel);
    }
     private void initTableSach(){
        tblModel1 = new DefaultTableModel();
        tblModel1.setColumnIdentifiers(new String[]{"MaSach","TenSach","TacGia","NamXB"}); 
        tblSach1.setModel(tblModel1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnMuonSach = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btKTraDG = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JTextField();
        txtTenDG = new javax.swing.JTextField();
        txtSLSachDangMuon = new javax.swing.JTextField();
        lbCheckMaDG = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btKTraTuaSach = new javax.swing.JButton();
        txtTenSachTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableThongTinSachMuon = new javax.swing.JTable();
        btMuonSach = new javax.swing.JButton();
        btXoaSM = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNgaytra = new javax.swing.JTextField();
        btBack = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMuonSach.setBackground(new java.awt.Color(255, 255, 255));
        pnMuonSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(226, 137, 95));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý mượn sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(93, 151, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153), null, new java.awt.Color(0, 153, 153)));

        jLabel2.setText("Mã đọc giả");

        btKTraDG.setBackground(new java.awt.Color(51, 143, 144));
        btKTraDG.setForeground(new java.awt.Color(255, 255, 255));
        btKTraDG.setToolTipText("");
        btKTraDG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btKTraDG.setLabel("Kiểm tra");
        btKTraDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKTraDGActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên đọc giả");

        jLabel4.setText("Số lượng sách đang mượn");

        txtMaDG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaDG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTenDG.setEditable(false);
        txtTenDG.setBackground(new java.awt.Color(204, 204, 204));
        txtTenDG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenDG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTenDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDGActionPerformed(evt);
            }
        });

        txtSLSachDangMuon.setEditable(false);
        txtSLSachDangMuon.setBackground(new java.awt.Color(204, 204, 204));
        txtSLSachDangMuon.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtSLSachDangMuon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCheckMaDG.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbCheckMaDG.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbCheckMaDG))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btKTraDG, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSLSachDangMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaDG)
                    .addComponent(txtTenDG)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCheckMaDG)
                .addGap(24, 24, 24)
                .addComponent(btKTraDG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSLSachDangMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 191, 161));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 255), new java.awt.Color(0, 204, 204), null));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Nhập tên sách muốn mượn");

        btKTraTuaSach.setBackground(new java.awt.Color(0, 153, 153));
        btKTraTuaSach.setForeground(new java.awt.Color(255, 255, 255));
        btKTraTuaSach.setText("Tìm ");
        btKTraTuaSach.setToolTipText("");
        btKTraTuaSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btKTraTuaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKTraTuaSachActionPerformed(evt);
            }
        });

        txtTenSachTimKiem.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtTenSachTimKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableThongTinSachMuon.setBackground(new java.awt.Color(175, 235, 225));
        tableThongTinSachMuon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        tableThongTinSachMuon.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tableThongTinSachMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableThongTinSachMuon.setRowHeight(23);
        tableThongTinSachMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThongTinSachMuonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableThongTinSachMuon);

        btMuonSach.setBackground(new java.awt.Color(51, 143, 144));
        btMuonSach.setForeground(new java.awt.Color(255, 255, 255));
        btMuonSach.setText("Mượn sách");
        btMuonSach.setToolTipText("");
        btMuonSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMuonSachActionPerformed(evt);
            }
        });

        btXoaSM.setBackground(new java.awt.Color(51, 143, 144));
        btXoaSM.setForeground(new java.awt.Color(255, 255, 255));
        btXoaSM.setText("Reset");
        btXoaSM.setToolTipText("");
        btXoaSM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoaSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaSMActionPerformed(evt);
            }
        });

        tblSach1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSach1.setRowHeight(23);
        tblSach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSach1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSach1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ngày trả");

        btBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 51, 51));
        btBack.setText("Thoát");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTenSachTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btKTraTuaSach))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btXoaSM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btMuonSach))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenSachTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btKTraTuaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btXoaSM, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnMuonSachLayout = new javax.swing.GroupLayout(pnMuonSach);
        pnMuonSach.setLayout(pnMuonSachLayout);
        pnMuonSachLayout.setHorizontalGroup(
            pnMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMuonSachLayout.createSequentialGroup()
                .addGroup(pnMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMuonSachLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMuonSachLayout.setVerticalGroup(
            pnMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMuonSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
//        JF_Menu home = new JF_Menu();

//        home.setVisible(true);
//        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed
    private void loadSach(){ 
        String sql = "SELECT s.MaSach, s.TenSach, s.TacGia, ctpm.TinhTrang FROM Sach s JOIN Chitietphieumuon ctpm ON s.MaSach = ctpm.MaSach JOIN PhieuMuon pm ON ctpm.MaPhieu = pm.MaPhieu WHERE pm.MaKhach = ?";
        String maDocGia = txtMaDG.getText().trim();
        try
        (
            Connection con = Code.DataBaseHelper.openConnection();  
            PreparedStatement psta = con.prepareStatement(sql) ;
        )
        {
            
            System.out.println("Ket noi thanh cong");
            psta.setString(1, maDocGia);
            ResultSet rs = psta.executeQuery() ;
            tblModel.setRowCount(0);
            while(rs.next())
            {
                String[] row = new String[]{rs.getString("Masach"),rs.getString("Tensach"),rs.getString("Tacgia"),rs.getString("TinhTrang")} ;
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
            e.printStackTrace();
        }
    }
    private void loadSach1(){ 
        String sql = "select MaSach,TenSach,TacGia,NamXB from Sach";
        try
        (
            Connection con = Code.DataBaseHelper.openConnection();  
            PreparedStatement psta = con.prepareStatement(sql) ;
        )
        {
            
            System.out.println("Ket noi thanh cong");
            ResultSet rs = psta.executeQuery() ;
            tblModel1.setRowCount(0);
            while(rs.next())
            {
                String[] row = new String[]{rs.getString("Masach"),rs.getString("Tensach"),rs.getString("Tacgia"),rs.getString("NamXB")} ;
                tblModel1.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
            e.printStackTrace();
        }
    }
    private void btKTraDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKTraDGActionPerformed
        loadSach();
        String sql = "select TenKhach from KhachHang where MaKhach=?";
        try
        (
            Connection con = Code.DataBaseHelper.openConnection();  
            PreparedStatement psta = con.prepareStatement(sql) ;
        )
        {
             String maDocGia = txtMaDG.getText().trim();
                psta.setString(1, maDocGia);
                ResultSet rs = psta.executeQuery();

                if (rs.next()) {
                    // Lấy giá trị của cột "TenKhach" từ ResultSet
                    String tenKhach = rs.getString("TenKhach");
                    // Gán giá trị đó cho text field txtTenDG
                    txtTenDG.setText(tenKhach);
                } else {
                    // Nếu không tìm thấy mã độc giả
                    txtTenDG.setText("Không tìm thấy độc giả");
                }
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
            e.printStackTrace();
        }
        String sql1 = "SELECT pm.MaKhach, COUNT(ctpm.MaSach) AS TongSoSachMuon FROM PhieuMuon pm JOIN Chitietphieumuon ctpm ON pm.MaPhieu = ctpm.MaPhieu WHERE pm.MaKhach = ? AND ctpm.TinhTrang = N'mượn' GROUP BY pm.MaKhach";

        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement psta = con.prepareStatement(sql1);
        ) {
        String maDocGia = txtMaDG.getText().trim();
        psta.setString(1, maDocGia);
        ResultSet rs = psta.executeQuery();

        if (rs.next()) {
            // Lấy giá trị của cột "TongSoSachMuon" từ ResultSet
            int tongSoSachMuon = rs.getInt("TongSoSachMuon");
            // Gán giá trị đó cho text field txtSLSachDangMuon
            txtSLSachDangMuon.setText(String.valueOf(tongSoSachMuon));
        } else {
            // Nếu không tìm thấy mã độc giả hoặc không có sách mượn
            txtSLSachDangMuon.setText("0");
            JOptionPane.showMessageDialog(this,"Không tìm thấy độc giả hoặc không có sách mượn");
        }
    } catch (Exception e) {
        System.out.println("Ket noi khong thanh cong");
        e.printStackTrace();
    }
    }//GEN-LAST:event_btKTraDGActionPerformed

    private void btKTraTuaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKTraTuaSachActionPerformed
        //        if(txtMaDG.getText().equals("") || lbCheckMaDG.getText().equals("MaDG không tồn tại!")){
            //            JOptionPane.showMessageDialog(rootPane, "Chọn thon tin độc giả cần mượn sách trước!\n");
        String tenSachTimKiem = txtTenSachTimKiem.getText().trim();

    if (tenSachTimKiem.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập tên sách.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "SELECT MaSach, TenSach, TacGia, NamXB FROM Sach WHERE TenSach LIKE ?";
    try (
        Connection con = Code.DataBaseHelper.openConnection();
        PreparedStatement psta = con.prepareStatement(sql);
    ) {
        // Sử dụng dấu % để tìm kiếm theo tên sách
        psta.setString(1, "%" + tenSachTimKiem + "%");
        ResultSet rs = psta.executeQuery();
        tblModel1.setRowCount(0);
        while (rs.next()) {
            String[] row = new String[]{
                rs.getString("MaSach"),
                rs.getString("TenSach"),
                rs.getString("TacGia"),
                rs.getString("NamXB")
            };
            tblModel1.addRow(row);
        }
        
        if (tblModel1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sách với tên " + tenSachTimKiem, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        System.out.println("Lỗi khi tìm kiếm sách: " + e.getMessage());
        e.printStackTrace();
    }
        
      

    }//GEN-LAST:event_btKTraTuaSachActionPerformed

    private void tableThongTinSachMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThongTinSachMuonMouseClicked
      
    }//GEN-LAST:event_tableThongTinSachMuonMouseClicked

    private void btMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMuonSachActionPerformed
        
      String maDocGia = txtMaDG.getText().trim();
        String tenSach = txtTenSachTimKiem.getText().trim();
        String ngayTra = txtNgaytra.getText().trim();

        if (maDocGia.isEmpty() || tenSach.isEmpty() || ngayTra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String ngayMuon = LocalDate.now().toString(); // Lấy ngày hiện tại

        // Parse ngayTra to LocalDate
        LocalDate ngayTraDate;
        try {
            ngayTraDate = LocalDate.parse(ngayTra);

                   
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Ngày trả không hợp lệ", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (ngayTraDate.isBefore(LocalDate.parse(ngayMuon))) {
            JOptionPane.showMessageDialog(this, "Ngày trả không được nhỏ hơn ngày mượn", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        // Check if ngayTra is earlier than ngayMuon
        

        String sqlGetMaSach = "SELECT MaSach FROM Sach WHERE TenSach = ?";
        String sqlCheckPhieuMuon = "SELECT MaPhieu FROM PhieuMuon WHERE MaKhach = ?";
        String sqlCheckChitietphieumuon = "SELECT * FROM Chitietphieumuon WHERE MaPhieu = ? AND MaSach = ?";
        String sqlUpdateChitietphieumuon = "UPDATE Chitietphieumuon SET TinhTrang = N'mượn', NgayTra = ? WHERE MaPhieu = ? AND MaSach = ?";
        String sqlAdd = "INSERT INTO Chitietphieumuon (MaPhieu ,TinhTrang, NgayTra, MaSach) VALUES (?,?,?,? )";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement pstaGetMaSach = con.prepareStatement(sqlGetMaSach);
            PreparedStatement pstaCheckPhieuMuon = con.prepareStatement(sqlCheckPhieuMuon);
            PreparedStatement pstaCheckChitietphieumuon = con.prepareStatement(sqlCheckChitietphieumuon);
            PreparedStatement pstaUpdateChitietphieumuon = con.prepareStatement(sqlUpdateChitietphieumuon);
            PreparedStatement pstaAddChitietphieumuon = con.prepareStatement(sqlAdd);
        ) {
            
            // Lấy MaSach từ TenSach
            pstaGetMaSach.setString(1, tenSach);
            ResultSet rsMaSach = pstaGetMaSach.executeQuery();

            if (!rsMaSach.next()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sách", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String maSach = rsMaSach.getString("MaSach");

            pstaCheckPhieuMuon.setString(1, maDocGia);
            ResultSet rsPhieuMuon = pstaCheckPhieuMuon.executeQuery();

            String maPhieu;
            if (rsPhieuMuon.next()) {
                maPhieu = rsPhieuMuon.getString("MaPhieu");
            } else {
                maPhieu = generateMaPhieu();  // Tạo một MaPhieu mới
                // Thêm mới phiếu mượn
            }

            pstaCheckChitietphieumuon.setString(1, maPhieu);
            pstaCheckChitietphieumuon.setString(2, maSach);
            ResultSet rsChitietphieumuon = pstaCheckChitietphieumuon.executeQuery();

            if (!rsChitietphieumuon.next()) //có ma sach nhưng sách chưa được mượn
            {
                // Thêm mới chi tiết phiếu mượn
                pstaAddChitietphieumuon.setString(2, "mượn");
                pstaAddChitietphieumuon.setString(3, ngayTra);
                pstaAddChitietphieumuon.setString(1, maPhieu);
                pstaAddChitietphieumuon.setString(4, maSach);
                pstaAddChitietphieumuon.executeUpdate();
                loadSach();
                JOptionPane.showMessageDialog(this, "Mượn sách thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Cập nhật trạng thái sách thành "mượn"
                if (rsChitietphieumuon.getString("TinhTrang").equals("mượn")) {
                    JOptionPane.showMessageDialog(this, "Mượn không thành công. Sách đã được mượn", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                pstaUpdateChitietphieumuon.setString(1, ngayTra);
                pstaUpdateChitietphieumuon.setString(2, maPhieu);
                pstaUpdateChitietphieumuon.setString(3, maSach);
                pstaUpdateChitietphieumuon.executeUpdate();
                loadSach();
                JOptionPane.showMessageDialog(this, "Mượn sách thành công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }

            // Cập nhật số lượng sách đang mượn
            updateSLSachDangMuon(maPhieu);
            loadSach();
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btMuonSachActionPerformed

     private void updateSLSachDangMuon(String maPhieu) {
        String sqlUpdateCount = "SELECT COUNT(*) AS TongSoSachMuon FROM Chitietphieumuon WHERE MaPhieu = ? AND TinhTrang = N'mượn'";
        try (
            Connection con = Code.DataBaseHelper.openConnection();
            PreparedStatement pstaUpdateCount = con.prepareStatement(sqlUpdateCount);
        ) {
            pstaUpdateCount.setString(1, maPhieu);
            ResultSet rsCount = pstaUpdateCount.executeQuery();

            if (rsCount.next()) {
                int tongSoSachMuon = rsCount.getInt("TongSoSachMuon");
                txtSLSachDangMuon.setText(String.valueOf(tongSoSachMuon));
            }
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
            e.printStackTrace();
        }
    }

    private String generateMaPhieu() {
        // Logic để tạo MaPhieu mới
        return "MP" + System.currentTimeMillis();  // Ví dụ sử dụng thời gian hiện tại bằng milliseconds
    }
    private void btXoaSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaSMActionPerformed
         txtTenSachTimKiem.setText("");
         loadSach1();
        
    }//GEN-LAST:event_btXoaSMActionPerformed

    private void tblSach1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSach1MouseClicked
        // TODO add your handling code here:
        int row = tblSach1.getSelectedRow() ; 
        if( row  >= 0 )
        {
            txtTenSachTimKiem.setText(tblSach1.getValueAt(row,1).toString());  
        }
    }//GEN-LAST:event_tblSach1MouseClicked

    private void txtTenDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDGActionPerformed

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
            java.util.logging.Logger.getLogger(JF_MuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_MuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_MuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_MuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_MuonSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btKTraDG;
    private javax.swing.JButton btKTraTuaSach;
    private javax.swing.JButton btMuonSach;
    private javax.swing.JButton btXoaSM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCheckMaDG;
    private javax.swing.JPanel pnMuonSach;
    private javax.swing.JTable tableThongTinSachMuon;
    private javax.swing.JTable tblSach1;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtNgaytra;
    private javax.swing.JTextField txtSLSachDangMuon;
    private javax.swing.JTextField txtTenDG;
    private javax.swing.JTextField txtTenSachTimKiem;
    // End of variables declaration//GEN-END:variables
}
