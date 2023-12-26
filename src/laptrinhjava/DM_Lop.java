/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laptrinhjava;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static laptrinhjava.Program.con;



/**
 *
 * @author Admin
 */
public class DM_Lop extends javax.swing.JFrame {
    private static DM_Lop instance;    
    private String stt = "";
    private Object selected = new Object();
    
    public DM_Lop() {
        initComponents();
    }
    
    public static synchronized DM_Lop getInstance(){
        if(instance==null){
            instance = new DM_Lop();
            instance.setVisible(true);
        } else{
            instance.setVisible(true);
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ReloadBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        InsertBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        ConnectBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MaLopTF = new javax.swing.JTextField();
        TenLopTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 170));
        setSize(new java.awt.Dimension(0, 0));

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));
        JPanel1.setFont(new java.awt.Font("Futura Bk", 0, 18)); // NOI18N
        JPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Futura Bk", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ DANH MỤC LỚP HỌC");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel1.setOpaque(true);
        JPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 340, 40));

        ReloadBtn.setBackground(new java.awt.Color(204, 204, 204));
        ReloadBtn.setFont(new java.awt.Font("Futura Hv", 0, 18)); // NOI18N
        ReloadBtn.setText("Reload");
        ReloadBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadBtnActionPerformed(evt);
            }
        });
        JPanel1.add(ReloadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 100, 40));

        SaveBtn.setBackground(new java.awt.Color(204, 204, 204));
        SaveBtn.setFont(new java.awt.Font("Futura Hv", 0, 18)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        JPanel1.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 100, 40));

        EditBtn.setBackground(new java.awt.Color(204, 204, 204));
        EditBtn.setFont(new java.awt.Font("Futura Hv", 0, 18)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        JPanel1.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 100, 40));

        DeleteBtn.setBackground(new java.awt.Color(204, 204, 204));
        DeleteBtn.setFont(new java.awt.Font("Futura Hv", 0, 18)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        JPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 100, 40));

        InsertBtn.setBackground(new java.awt.Color(204, 204, 204));
        InsertBtn.setFont(new java.awt.Font("Futura Hv", 0, 18)); // NOI18N
        InsertBtn.setText("Insert");
        InsertBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });
        JPanel1.add(InsertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 100, 40));

        CloseBtn.setBackground(new java.awt.Color(204, 204, 204));
        CloseBtn.setFont(new java.awt.Font("Futura Hv", 0, 18)); // NOI18N
        CloseBtn.setText("Close");
        CloseBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });
        JPanel1.add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 100, 40));

        ConnectBtn.setBackground(new java.awt.Color(204, 204, 204));
        ConnectBtn.setFont(new java.awt.Font("Futura Hv", 0, 18)); // NOI18N
        ConnectBtn.setText("Connect");
        ConnectBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ConnectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectBtnActionPerformed(evt);
            }
        });
        JPanel1.add(ConnectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 100, 40));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Lớp", "Tên Lớp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(27);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
        jScrollPane2.setViewportView(jTable1);

        JPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 600, 240));

        MaLopTF.setText("Mã lớp");
        MaLopTF.setEnabled(false);
        MaLopTF.setMargin(new java.awt.Insets(2, 7, 3, 7));
        MaLopTF.setFont(new java.awt.Font("Futura Bk", 0, 19));
        //TenLopTF.setAlignmentX(CENTER_ALIGNMENT);
        MaLopTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaLopTFMouseClicked(evt);
            }
        });
        JPanel1.add(MaLopTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, 30));

        TenLopTF.setText("Tên lớp");
        TenLopTF.setEnabled(false);
        TenLopTF.setMargin(new java.awt.Insets(2, 7, 3, 7));
        TenLopTF.setFont(new java.awt.Font("Futura Bk", 0, 19));
        TenLopTF.setAlignmentX(CENTER_ALIGNMENT);
        TenLopTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TenLopTFMouseClicked(evt);
            }
        });
        JPanel1.add(TenLopTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 360, 30));

        jLabel2.setFont(new java.awt.Font("Futura Bk", 0, 18)); // NOI18N
        jLabel2.setText("Tên lớp");
        JPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 30));

        jLabel4.setFont(new java.awt.Font("Futura Bk", 0, 18)); // NOI18N
        jLabel4.setText("Mã lớp");
        JPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 30));

        jMenu1.setText("Danh Mục");

        jMenuItem3.setText("QL Thông Tin Sinh Viên");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Danh Mục Môn Học");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectBtnActionPerformed
        if(con != null){
            JOptionPane.showMessageDialog(this, "Đã kết nối!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://DUYANH\\SQLEXPRESS:1433;databaseName=LTJava;user=sa;password=123";
            con = DriverManager.getConnection(dbUrl);
            
            
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from Lop");
            // select MSSV, HoTen, NamSinh, Lop from SinhVien inner join Lop on SinhVien.MaLop = Lop.MaLop;
            
            String S ="";
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            m.setRowCount(0);
            while(rs.next()){
                S += "Mã lớp: " + rs.getString("MaLop")
                    +", Tên lớp: " + rs.getString("TenLop")
                    + "\n";
                
                Object[] obj = {rs.getString(1), rs.getString(2)};
                m.addRow(obj);
            }
            //con.close();
            s.close();
            System.out.println(S);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ConnectBtnActionPerformed

    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtnActionPerformed
        if(con == null){
            JOptionPane.showMessageDialog(this, "Vui lòng kết nối trước!", "Chưa kết nối", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        MaLopTF.setEnabled(true); MaLopTF.setText("Mã lớp");
        TenLopTF.setEnabled(true); TenLopTF.setText("Tên lớp");
        stt = "INSERT";
    }//GEN-LAST:event_InsertBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(con == null){
            JOptionPane.showMessageDialog(this, "Vui lòng kết nối trước!", "Chưa kết nối", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Statement s = con.createStatement();
            int r = jTable1.getSelectedRow();
            Object malop = jTable1.getModel().getValueAt(r, 0);
            Object tenlop = jTable1.getModel().getValueAt(r, 1);

            boolean x = s.execute("delete Lop where MaLop= N'" + malop + "'");
            System.out.println(x ? "Xoa that bai" : "Xoa thanh cong");
            if (x == false) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Da xoa: " + malop + " - " + tenlop);
            }
            s.close();
            ReloadBtn.doClick();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Xóa không thành công", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if(con == null){
            JOptionPane.showMessageDialog(this, "Vui lòng kết nối trước!", "Chưa kết nối", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int r = jTable1.getSelectedRow();
        if(r == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng cần chỉnh sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        try {
            Statement s = con.createStatement();
            Object malop = jTable1.getModel().getValueAt(r, 0);
            Object tenlop = jTable1.getModel().getValueAt(r, 1);
            
            MaLopTF.setText((String) malop);
            MaLopTF.setEnabled(true);
            TenLopTF.setText((String) tenlop);
            TenLopTF.setEnabled(true);
            stt="EDIT";
            selected = malop;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(con == null){
            JOptionPane.showMessageDialog(this, "Vui lòng kết nối trước!", "Chưa kết nối", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (stt.equalsIgnoreCase("INSERT")) {
            try {
                if(MaLopTF.getText().equals("")){
                    throw new Exception("Mã lớp rỗng");
                }
                Statement s = con.createStatement();
                int r = s.executeUpdate("insert into Lop values (N'" + MaLopTF.getText() + "',N'" + TenLopTF.getText() + "')");

                JOptionPane.showMessageDialog(this, "Đã thêm " + r + " lớp.", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                s.close();
                ReloadBtn.doClick();
                //Set các text field và combo box về default
                MaLopTF.setEnabled(false);
                MaLopTF.setText("Mã lớp");
                TenLopTF.setEnabled(false);
                TenLopTF.setText("Tên lớp");
                return;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Không thêm được lớp học này, vui lòng kiểm tra lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        
        if (stt.equalsIgnoreCase("EDIT")){
            try {
                if(MaLopTF.getText().equals("")){
                    throw new Exception("Mã lớp rỗng");
                }
                Statement s = con.createStatement();
                int r = s.executeUpdate("Update Lop "
                        + "set MaLop = N'" + MaLopTF.getText() + "', TenLop = N'" + TenLopTF.getText() + "' where MaLop = N'"+selected.toString()+"'");
                
                if (r > 0) {
                    System.out.println("Cập nhật thành công!");
                    JOptionPane.showMessageDialog(this, "Đã cập nhật " + r + " lớp.", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("Không có dữ liệu được cập nhật.");
                }
                s.close();
                ReloadBtn.doClick();
                
                //Set các text field và combo box về default
                MaLopTF.setEnabled(false);
                MaLopTF.setText("Mã lớp");
                TenLopTF.setEnabled(false);
                TenLopTF.setText("Tên lớp");
                return;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Không sửa được lớp học này, vui lòng kiểm tra lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ReloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadBtnActionPerformed
        if(con == null){
            JOptionPane.showMessageDialog(this, "Vui lòng kết nối trước!", "Chưa kết nối", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            //Set các jtextfield
            stt = "";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from Lop");
            // select MSSV, HoTen, NamSinh, Lop from SinhVien inner join Lop on SinhVien.MaLop = Lop.MaLop;
            
            String S ="";
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            m.setRowCount(0);
            while(rs.next()){
                S += "Mã lớp: " + rs.getString(1)
                    +", Tên lớp: " + rs.getString(2)
                    + "\n";
                
                Object[] obj = {rs.getString(1), rs.getString(2)};
                m.addRow(obj);
            }
            //con.close();
            s.close();
            System.out.println(S);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ReloadBtnActionPerformed

    private void MaLopTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaLopTFMouseClicked
        if(MaLopTF.getText().equals("Mã lớp") && MaLopTF.isEnabled()){
            MaLopTF.setText("");
        }
    }//GEN-LAST:event_MaLopTFMouseClicked

    private void TenLopTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TenLopTFMouseClicked
        if(TenLopTF.getText().equals("Tên lớp") && TenLopTF.isEnabled()){
            TenLopTF.setText("");
        }
    }//GEN-LAST:event_TenLopTFMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            DM_MonHoc.getInstance();
            if(con!=null)
                DM_MonHoc.getInstance().reloadMonHoc();
            this.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
//        try {
//            con.close();
//            System.out.println("Đóng kết nối!");
//            System.exit(0);
//        } catch (SQLException ex) {
//            Logger.getLogger(DM_Lop.class.getName()).log(Level.SEVERE, null, ex);
//        }
    try {
            this.setVisible(false);
            QLTTSV.getInstance();
            if(con!=null)
                QLTTSV.getInstance().reloadTTSV();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            QLTTSV.getInstance();
            if(con!=null)
                QLTTSV.getInstance().reloadTTSV();
            this.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void reloadLop(){
        ReloadBtn.doClick();
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HTQL_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HTQL_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HTQL_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HTQL_sv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HTQL_sv().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBtn;
    private javax.swing.JButton ConnectBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JTextField MaLopTF;
    private javax.swing.JButton ReloadBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField TenLopTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
