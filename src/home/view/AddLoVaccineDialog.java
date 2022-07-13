/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package home.view;

import KTPM.controller.InfoFilterImp;
import KTPM.exception.InvalidCmndException;
import KTPM.exception.InvalidDobException;
import KTPM.exception.InvalidNameException;
import KTPM.exception.InvalidPersonIdException;
import KTPM.exception.InvalidSdtException;
import KTPMfinal.model.LoVaccine;
import KTPMfinal.model.Vaccine;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import KTPMfinal.model.Person;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AddLoVaccineDialog extends javax.swing.JDialog implements ActionListener {
    
    private HomeFrm homeFrm;
    private List<LoVaccine> loVaccines;
    private List<Vaccine> vaccines;
    private Vaccine vaccine;

    /**
     * Creates new form AddVaccineDialog
     */
    public AddLoVaccineDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        addActionListener();
        homeFrm = (HomeFrm) parent;
    }
    
    public AddLoVaccineDialog(java.awt.Frame parent, boolean modal, List<LoVaccine> loVaccines, List<Vaccine> vaccines) {
        this(parent, modal);
        this.loVaccines = loVaccines;
        this.vaccines = vaccines;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCheckID = new javax.swing.JTextField();
        txtAddNSX = new javax.swing.JTextField();
        txtAddNgayNhap = new javax.swing.JTextField();
        txtAddSoLuong = new javax.swing.JTextField();
        btnAddLo = new javax.swing.JButton();
        btnClearLoVC = new javax.swing.JButton();
        btnCancelLoVC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAddIdLo = new javax.swing.JTextField();
        txtAddHSD = new javax.swing.JTextField();
        btnSearchIDVC = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNameVC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM MỚI HỒ SƠ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM MỚI LÔ VACCINE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã Vaccine");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã Lô Vaccine");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("NSX");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày nhập");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng");

        btnAddLo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddLo.setText("Thêm mới");

        btnClearLoVC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClearLoVC.setText("Xóa dữ liệu");

        btnCancelLoVC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelLoVC.setText("Hủy bỏ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("HSD");

        btnSearchIDVC.setText("Tìm kiếm");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Vaccine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddLo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnClearLoVC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btnCancelLoVC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddSoLuong)
                            .addComponent(txtAddNgayNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddNSX, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddHSD)
                            .addComponent(txtAddIdLo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCheckID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchIDVC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNameVC))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCheckID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchIDVC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNameVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddIdLo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddLo)
                    .addComponent(btnClearLoVC)
                    .addComponent(btnCancelLoVC))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AddLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddLoVaccineDialog dialog = new AddLoVaccineDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLo;
    private javax.swing.JButton btnCancelLoVC;
    private javax.swing.JButton btnClearLoVC;
    private javax.swing.JButton btnSearchIDVC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddHSD;
    private javax.swing.JTextField txtAddIdLo;
    private javax.swing.JTextField txtAddNSX;
    private javax.swing.JTextField txtAddNgayNhap;
    private javax.swing.JTextField txtAddSoLuong;
    private javax.swing.JTextField txtCheckID;
    private javax.swing.JTextField txtNameVC;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        var obj = e.getSource();
        if (obj.equals(btnAddLo)) {
            ThemLoVaccine();
        } else if (obj.equals(btnCancelLoVC)) {
            dispose();
        } else if (obj.equals(btnClearLoVC)) {
            ClearInputData();
        } else if (obj.equals(btnSearchIDVC)) {
            TimIdVaccine();
        }
    }
    
    private void addActionListener() {
        btnAddLo.addActionListener(this);
        btnCancelLoVC.addActionListener(this);
        btnClearLoVC.addActionListener(this);
        btnSearchIDVC.addActionListener(this);
    }
    
    private void ClearInputData() {
        var textEmpty = "";
        txtCheckID.setText(textEmpty);
        txtAddNgayNhap.setText(textEmpty);
        txtAddIdLo.setText(textEmpty);
        txtAddSoLuong.setText(textEmpty);
        txtAddNSX.setText(textEmpty);
        txtAddHSD.setText(textEmpty);
        txtNameVC.setText(textEmpty);
    }
    
    private void ThemLoVaccine() {
        if (vaccine == null) {
            var msg = "Vui lòng nhập mã Vaccine cần tìm!";
            showMessage(msg);
        } else {
            var idLoVc = txtAddIdLo.getText();
            var nsx = txtAddNSX.getText();
            var hsd = txtAddHSD.getText();
            var soLuong = txtAddSoLuong.getText();
            var ngayNhap = txtAddNgayNhap.getText();
            if (idLoVc.isEmpty() || nsx.isEmpty() || hsd.isEmpty() || soLuong.isEmpty() || ngayNhap.isEmpty()) {
                var msg = "Vui lòng nhập đầy đủ thông tin lô Vaccine!";
                showMessage(msg);
            } else {
               
                try {
                    LoVaccine loVaccine = new LoVaccine(vaccine, idLoVc, ngayNhap, nsx, hsd, Integer.parseInt(soLuong));
                    var checker = new InfoFilterImp();
                    if (checker.isRecordExit(loVaccines, loVaccine) ) {
                        var msg = "Lô Vacine " + idLoVc + " đã tồn tại trong danh sách!";
                        showMessage(msg);
                    } else {
                        homeFrm.AddLoVacineComeBack(loVaccine);
                        var msg = "Thêm mới 1 lô Vaccine thành công!";
                        showMessage(msg);
                        dispose();
                    }
                } catch (InvalidDobException ex) {
                    var msg = " .Định dạng thời gian phải ở dạng dd/MM/yyyy. Trong đó dd: ngày sinh; MM: tháng sinh";
                    showMessage(ex.getMessage() + msg);
                }
                
            }
        }
    }
    
    private void showMessage(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }

    private void TimIdVaccine() {
        vaccine = null;
        var vaccineId = txtCheckID.getText().trim();
        if (vaccineId.isEmpty()) {
            var msg = "Vui lòng nhập mã Vaccine cần tìm";
            showMessage(msg);
        } else {
            for (Vaccine v : vaccines) {
                if (v.getId() == Integer.parseInt(vaccineId)) {
                    vaccine = v;
                    break;
                }
            }
            if (vaccine == null) {
                var msg = "Loại vaccine này không tồn tại trong trạm y tế!";
                showMessage(msg);
                txtCheckID.setText("");
                txtNameVC.setText("");
            } else {
                txtNameVC.setText(vaccine.getName());
            }
        }
        
    }
}
