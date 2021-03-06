/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package home.view;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EditLoVaccineDialog extends javax.swing.JDialog implements ActionListener {

    private HomeFrm homeFrm;
    private LoVaccine loVaccine;
    private List<Vaccine> Vaccines;
    private Vaccine vaccine;
    private LoVaccine loVaccine1;

    /**
     * Creates new form AddVaccineDialog
     */
    public EditLoVaccineDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        addActionListener();
        homeFrm = (HomeFrm) parent;
    }

    public EditLoVaccineDialog(java.awt.Frame parent, boolean modal, LoVaccine loVaccine, List<Vaccine> vaccines) {
        this(parent, modal);
        this.loVaccine = loVaccine;
        this.Vaccines= vaccines;
        setData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        btnCancelHS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEditIdLo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEditHSD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEditSearchIDVC = new javax.swing.JButton();
        txtEditCheckID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEditNSX = new javax.swing.JTextField();
        txtEditNameVC = new javax.swing.JTextField();
        txtEditNgayNhap = new javax.swing.JTextField();
        txtEditSoLuong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSoLuongConLai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("C???p nh???t l?? Vaccine");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("C???p nh???t");

        btnCancelHS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelHS.setText("H???y b???");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("C???P NH???T L?? VACCINE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("M?? Vaccine");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("M?? L?? Vaccine");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("HSD");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("NSX");

        txtEditIdLo.setEditable(false);
        txtEditIdLo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ng??y nh???p");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("S??? l?????ng");

        btnEditSearchIDVC.setText("T??m ki???m");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Vaccine");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("S??? l?????ng c??n l???i");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(btnCancelHS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtEditNgayNhap))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtEditHSD))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtEditNSX))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtEditIdLo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEditSoLuong)
                            .addComponent(txtSoLuongConLai)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtEditCheckID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditSearchIDVC, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addComponent(txtEditNameVC))))
                    .addGap(2, 2, 2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEditIdLo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEditNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEditHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEditNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEditSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSoLuongConLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancelHS))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtEditCheckID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditSearchIDVC))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtEditNameVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(272, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(EditLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLoVaccineDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditLoVaccineDialog dialog = new EditLoVaccineDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelHS;
    private javax.swing.JButton btnEditSearchIDVC;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEditCheckID;
    private javax.swing.JTextField txtEditHSD;
    private javax.swing.JTextField txtEditIdLo;
    private javax.swing.JTextField txtEditNSX;
    private javax.swing.JTextField txtEditNameVC;
    private javax.swing.JTextField txtEditNgayNhap;
    private javax.swing.JTextField txtEditSoLuong;
    private javax.swing.JTextField txtSoLuongConLai;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        var obj = e.getSource();
        if (obj.equals(btnUpdate)) {
            SuaHoSo();
        } else if (obj.equals(btnCancelHS)) {
            dispose();
        } else if(obj.equals(btnEditSearchIDVC)){
            TimIdVaccine();
        }
    }
    
    private void addActionListener() {
        btnUpdate.addActionListener(this);
        btnCancelHS.addActionListener(this);
        btnEditSearchIDVC.addActionListener(this);
    }
    
      
    private void SuaHoSo() {
           var idVaccine= txtEditCheckID.getText();
           var idLo= txtEditIdLo.getText();
           var ngaySX= txtEditNSX.getText();
           var hanSD=txtEditHSD.getText();
           var ngayNhap= txtEditNgayNhap.getText();
           var soLuong = txtEditSoLuong.getText();
           var soLuongConLai= txtSoLuongConLai.getText();
           if(idVaccine.isEmpty() || idLo.isEmpty() || ngaySX.isEmpty()
                   || hanSD.isEmpty() || ngayNhap.isEmpty() || soLuong.isEmpty() || soLuongConLai.isEmpty()){
               var msg = "Vui l??ng nh???p ?????y ????? th??ng tin l?? Vaccine!";
                showMessage(msg);
           }
           else{
               try {
                   loVaccine.setNgayNhap(ngayNhap);
                   loVaccine.setHsdDate(hanSD);
                   loVaccine.setNsxDate(ngaySX);
//              
               } catch (InvalidDobException ex) {
                    var msg= " .N??m sinh ph???i c?? d???ng dd/MM/yyyy. Trong ???? dd: ng??y sinh; MM: th??ng sinh";
                showMessage(ex.getMessage() + msg);
               }
               loVaccine.setVaccine(vaccine);
               loVaccine.setSoLuongConLai(Integer.parseInt(soLuongConLai));
               loVaccine.setSoluong(Integer.parseInt(soLuong));
               homeFrm.EditLoVcComeBack(loVaccine);
               
//  
                JOptionPane.showMessageDialog(rootPane, "C???p nh???t L?? Vaccine th??nh c??ng");
            dispose();
           }
        }
    
    private void showMessage(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }

    private void setData() {
        txtEditCheckID.setText(loVaccine.getVaccine().getId() +"");
        txtEditNameVC.setText(loVaccine.getVaccine().getName());
        txtEditIdLo.setText(loVaccine.getIdLo());
        var format = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat(format);
        txtEditNSX.setText(simpleDateFormat.format(loVaccine.getNsxDate()));
        txtEditHSD.setText(simpleDateFormat.format(loVaccine.getHsdDate()));
        txtEditNgayNhap.setText(simpleDateFormat.format(loVaccine.getNgayNhap()));
        txtEditSoLuong.setText(loVaccine.getSoluong() + "");
        txtSoLuongConLai.setText(loVaccine.getSoLuongConLai() +"");
    }
     private void TimIdVaccine() {
        vaccine = null;
        var vaccineId = txtEditCheckID.getText().trim();
        if (vaccineId.isEmpty()) {
            var msg = "Vui l??ng nh???p m?? Vaccine c???n t??m";
            showMessage(msg);
        } else {
            for (Vaccine v : Vaccines) {
                if (v.getId() == Integer.parseInt(vaccineId)) {
                    vaccine = v;
                    break;
                }
            }
            if (vaccine == null) {
                var msg = "Lo???i vaccine n??y kh??ng t???n t???i trong tr???m y t???!";
                showMessage(msg);
                txtEditCheckID.setText("");
                txtEditNameVC.setText("");
            } else {
                txtEditNameVC.setText(vaccine.getName());
            }
        }
}
}