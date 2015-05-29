/*
 * showServation.java
 *
 * Created on __DATE__, __TIME__
 */

package uml.hotel.view;

import java.util.List;

import uml.hotel.model.Reservation;
import uml.hotel.model.ReservationDAO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class showServation extends javax.swing.JFrame {

	/** Creates new form showServation */
	public showServation() {
		initComponents();
	}

	private Reservation myr = new Reservation();

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLayeredPane1 = new javax.swing.JLayeredPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jTextField8 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(java.awt.SystemColor.textHighlight);
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 36));
		jLabel1.setText("\u9884\u5b9a\u4fee\u6539");
		jLabel1.setBounds(240, 10, 144, 49);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel2.setText("\u5bbe\u5ba2\u59d3\u540d");
		jLabel2.setBounds(40, 80, 96, 33);
		jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton2.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton2.setText("\u53d6\u6d88");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(470, 340, 90, 41);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(140, 340, 90, 41);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField8ActionPerformed(evt);
			}
		});
		jTextField8.setBounds(480, 260, 130, 23);
		jLayeredPane1.add(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField7.setBounds(480, 180, 130, 23);
		jLayeredPane1.add(jTextField7, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField6.setBounds(160, 130, 130, 23);
		jLayeredPane1.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel11.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel11.setText("\u8eab\u4efd\u8bc1\u53f7");
		jLabel11.setBounds(40, 120, 96, 33);
		jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel10.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel10.setText("\u4fdd\u7559\u65f6\u95f4");
		jLabel10.setBounds(360, 210, 96, 33);
		jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel9.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel9.setText("\u9884\u8ba2\u65f6\u95f4");
		jLabel9.setBounds(360, 80, 96, 33);
		jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField5.setBounds(480, 130, 130, 23);
		jLayeredPane1.add(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel8.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel8.setText("\u8ba2  \u5355  \u53f7");
		jLabel8.setBounds(360, 250, 100, 33);
		jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField4.setBounds(480, 90, 130, 23);
		jLayeredPane1.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel7.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel7.setText("\u9884\u79bb\u65f6\u95f4");
		jLabel7.setBounds(360, 170, 96, 33);
		jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField3.setBounds(480, 220, 130, 23);
		jLayeredPane1.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel6.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel6.setText("\u5165\u4f4f\u65f6\u95f4");
		jLabel6.setBounds(360, 120, 96, 40);
		jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jComboBox2
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"", "BD001", "BD002", "BD003", "BD004", "BD005",
						"BD006", "BD007", "BD008", "BD009", "HD004", "HD003",
						"HD002", "HD001", "BS001", "BS002", "BS003", "BS004",
						"BS005", "BS006", "BS007", "BS008", "BS009", "HS001",
						"HS002", "HS003", "HS004", "SW001", "SW002", "SW003",
						"SW004", "ZT001", "ZT002", "ZT003", "ZT004" }));
		jComboBox2.setBounds(160, 220, 130, 23);
		jLayeredPane1.add(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel5.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel5.setText("\u623f  \u95f4  \u53f7");
		jLabel5.setBounds(40, 210, 100, 33);
		jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "标准单人间", "标准双人间", "豪华双人间", "豪华单人间", "商务套房", "总统套房" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});
		jComboBox1.setBounds(160, 180, 130, 23);
		jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel4.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel4.setText("\u9884\u5b9a\u89c4\u683c");
		jLabel4.setBounds(40, 170, 96, 33);
		jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField2.setBounds(160, 260, 130, 23);
		jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel3.setText("\u8054\u7cfb\u7535\u8bdd");
		jLabel3.setBounds(40, 250, 96, 33);
		jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField1.setBounds(160, 90, 130, 23);
		jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel12.setIcon(new ImageIcon(showServation.class.getResource("/uml/hotel/view/meigong/\u80CC\u666F3.jpg"))); // NOI18N
		jLabel12.setBounds(0, 0, 650, 430);
		jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jComboBox1.getSelectedItem().toString().compareTo("标准单人间") == 0) {
			jComboBox2.removeAllItems();
			jComboBox2.addItem("BD001");
			jComboBox2.addItem("BD002");
			jComboBox2.addItem("BD003");
			jComboBox2.addItem("BD004");
			jComboBox2.addItem("BD005");
			jComboBox2.addItem("BD006");
			jComboBox2.addItem("BD007");
			jComboBox2.addItem("BD008");
			jComboBox2.addItem("BD009");

		}
		if (jComboBox1.getSelectedItem().toString().compareTo("标准双人间") == 0) {
			jComboBox2.removeAllItems();
			jComboBox2.addItem("BS001");
			jComboBox2.addItem("BS002");
			jComboBox2.addItem("BS003");
			jComboBox2.addItem("BS004");
			jComboBox2.addItem("BS005");
			jComboBox2.addItem("BS006");
			jComboBox2.addItem("BS007");
			jComboBox2.addItem("BS008");
			jComboBox2.addItem("BS009");
		}
		if (jComboBox1.getSelectedItem().toString().compareTo("豪华单人间") == 0) {
			jComboBox2.removeAllItems();
			jComboBox2.addItem("HD001");
			jComboBox2.addItem("HD002");
			jComboBox2.addItem("HD003");
			jComboBox2.addItem("HD004");
		}
		if (jComboBox1.getSelectedItem().toString().compareTo("豪华双人间") == 0) {
			jComboBox2.removeAllItems();
			jComboBox2.addItem("HS001");
			jComboBox2.addItem("HS002");
			jComboBox2.addItem("HS003");
			jComboBox2.addItem("HS004");
		}
		if (jComboBox1.getSelectedItem().toString().compareTo("商务套房") == 0) {
			jComboBox2.removeAllItems();
			jComboBox2.addItem("SW001");
			jComboBox2.addItem("SW002");
			jComboBox2.addItem("SW003");
			jComboBox2.addItem("SW004");
		}
		if (jComboBox1.getSelectedItem().toString().compareTo("总统套房") == 0) {
			jComboBox2.removeAllItems();
			jComboBox2.addItem("ZT001");
			jComboBox2.addItem("ZT002");
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		ReservationDAO rd = new ReservationDAO();
		rd.delete(myr);

		Reservation rs = new Reservation();
		rs.setBookingId(jTextField8.getText().toString());
		rs.setBookingTime(jTextField4.getText().toString());
		rs.setCallNumber(jTextField2.getText().toString());
		rs.setCustomerId(jTextField6.getText().toString());
		rs.setEndTime(jTextField7.getText().toString());
		rs.setName(jTextField1.getText().toString());
		rs.setRoomId(jComboBox2.getSelectedItem().toString());
		rs.setStartTime(jTextField5.getText().toString());
		rs.setStayTime(jTextField3.getText().toString());

		rd.save(rs); //将修改后的内容保存到数据库

		this.dispose();

	}

	//显示修改的信息
	public void myshow(String name, String ID, String room_id) {
		Reservation rs = new Reservation();
		ReservationDAO r = new ReservationDAO(); //从数据库中查找到要修改的订单
		List a = r.findByRoomId(room_id);
		int j = a.size();
		for (int i = 0; i < j; i++) {
			Reservation myrs = (Reservation) ((java.util.List) a).get(i);
			if ((myrs.getCustomerId().compareTo(ID) == 0)
					&& (myrs.getName().compareTo(name) == 0)) {
				rs = myrs;
				myr = myrs;
				break;
			}
		}

		jTextField1.setText(rs.getName());
		jTextField2.setText(rs.getCallNumber());
		jTextField6.setText(rs.getCustomerId());
		jTextField4.setText(rs.getBookingTime());
		jTextField5.setText(rs.getStartTime());
		jTextField3.setText(rs.getStayTime());
		jTextField7.setText(rs.getEndTime());
		jTextField8.setText(rs.getBookingId());
		jComboBox2.setSelectedItem(rs.getRoomId());

	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new showServation().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
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
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	// End of variables declaration//GEN-END:variables

}