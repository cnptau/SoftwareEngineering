/*
 * check_in.java
 *
 * Created on __DATE__, __TIME__
 */

package uml.hotel.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import uml.hotel.model.CheckIn;
import uml.hotel.model.CheckInDAO;
import uml.hotel.model.Reservation;
import uml.hotel.model.ReservationDAO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class check_in extends javax.swing.JFrame {

	/** Creates new form check_in */
	public check_in() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextPane1 = new javax.swing.JTextPane();
		jLabel10 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
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
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);

		jButton3.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton3.setText("\u8fd4\u56de");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jButton3.setBounds(220, 430, 90, 41);
		jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton2.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton2.setText("\u53d6\u6d88");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(430, 370, 90, 41);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(430, 290, 90, 41);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextPane1.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jScrollPane1.setViewportView(jTextPane1);

		jScrollPane1.setBounds(40, 290, 310, 130);
		jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel10.setText("\u5165\u4f4f\u4fe1\u606f\u8bf4\u660e");
		jLabel10.setBounds(30, 240, 144, 33);
		jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField6.setBounds(400, 200, 130, 23);
		jLayeredPane1.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel9.setText("\u5165\u4f4f\u5355\u53f7");
		jLabel9.setBounds(290, 190, 96, 33);
		jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField5.setBounds(400, 160, 130, 23);
		jLayeredPane1.add(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel8.setText("\u5165\u4f4f\u5929\u6570");
		jLabel8.setBounds(290, 150, 96, 33);
		jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField4.setBounds(400, 120, 130, 23);
		jLayeredPane1.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel7.setText("\u79bb\u5f00\u65f6\u95f4");
		jLabel7.setBounds(290, 110, 96, 33);
		jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField3.setBounds(400, 80, 130, 23);
		jLayeredPane1.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel6.setText("\u5165\u4f4f\u65f6\u95f4");
		jLabel6.setBounds(290, 70, 96, 33);
		jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});
		jComboBox2.setBounds(120, 200, 130, 23);
		jLayeredPane1.add(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel5.setText("\u623f  \u95f4  \u53f7");
		jLabel5.setBounds(10, 190, 100, 33);
		jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "标准单人间", "标准双人间", "豪华单人间", "豪华双人间", "商务套房", "总统套房" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});
		jComboBox1.setBounds(120, 160, 130, 23);
		jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel4.setText("\u623f\u95f4\u89c4\u683c");
		jLabel4.setBounds(10, 150, 96, 33);
		jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jTextField2.setBounds(120, 120, 130, 23);
		jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel3.setText("\u8eab\u4efd\u8bc1\u53f7");
		jLabel3.setBounds(10, 110, 96, 33);
		jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jTextField1.setBounds(120, 80, 130, 23);
		jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel2.setText("\u987e\u5ba2\u59d3\u540d");
		jLabel2.setBounds(10, 70, 96, 33);
		jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 36));
		jLabel1.setText("\u9884\u8ba2\u987e\u5ba2\u5165\u4f4f");
		jLabel1.setBounds(170, 10, 216, 49);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel11.setIcon(new ImageIcon(check_in.class.getResource("/uml/hotel/view/meigong/\u80CC\u666F10.jpg"))); // NOI18N
		jLabel11.setBounds(0, 0, 560, 490);
		jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE));

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

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(null);
		jTextField2.setText(null);
		jTextField3.setText(null);
		jTextField4.setText(null);
		jTextField5.setText(null);
		jTextField6.setText(null);
		jComboBox1.setSelectedItem(null);
		jComboBox1.setSelectedItem(null);
		jTextPane1.setText("已取消入住信息，请重新输入信息！");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField1.getText().toString();
		String ID = jTextField2.getText().toString();
		String room_id = jComboBox2.getSelectedItem().toString();

		ReservationDAO r = new ReservationDAO(); //从数据库中查找到要删除的订单
		List a = r.findByCustomerId(ID);
		Reservation rs = new Reservation();
		int j = a.size();
		int m = 0;
		for (int i = 0; i < j; i++) {
			Reservation myrs = (Reservation) ((java.util.List) a).get(i);
			if ((myrs.getCustomerId().compareTo(ID) == 0)
					&& (myrs.getName().compareTo(name) == 0)
					&& (myrs.getRoomId().compareTo(room_id)) == 0) {
				m = 1;
				rs = myrs;
				break;
			}
		}

		if (m == 0) {
			jTextPane1.setText("对不起，该人的房间预订信息与入住信息不相符！");
		} else {
			r.delete(rs); //从数据库中删除该预订信息
			save();
			jTextPane1.setText("入住成功！");
		}

	}

	//将数据存储到数据库
	public void save() {
		String name = jTextField1.getText().toString();
		String ID = jTextField2.getText().toString();
		String room_id = jComboBox2.getSelectedItem().toString();
		String start_time = jTextField3.getText().toString();
		String end_time = jTextField4.getText().toString();
		String live_date = jTextField5.getText().toString();
		String booking_id = jTextField6.getText().toString();

		CheckIn CI = new CheckIn();
		CI.setBookingId(booking_id);
		CI.setName(name);
		CI.setCustomerId(ID);
		CI.setRoomId(room_id);
		CI.setStartTime(start_time);
		CI.setEndTime(end_time);
		CI.setLiveDate(Integer.parseInt(live_date));

		CheckInDAO cd = new CheckInDAO();
		cd.save(CI);
	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date curDate = new Date(System.currentTimeMillis());//获取当前时间     
		String str = formatter.format(curDate);
		jTextField3.setText(str);
		jTextField4.setText(str); //显示当前时间
		jTextField5.setText("0");

		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyyMMddHHmmss");
		Date cuDate = new Date(System.currentTimeMillis());//获取当前时间     
		String str1 = formatter1.format(cuDate);
		jTextField6.setText(str1);
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String name = jTextField1.getText().toString();
		String ID = jTextField2.getText().toString();

		ReservationDAO r = new ReservationDAO(); //从数据库中查找到要删除的订单
		List a = r.findByCustomerId(ID);
		int j = a.size();
		int m = 0;
		for (int i = 0; i < j; i++) {
			Reservation myrs = (Reservation) ((java.util.List) a).get(i);
			if ((myrs.getCustomerId().compareTo(ID) == 0)
					&& (myrs.getName().compareTo(name) == 0)) {
				m = 1;
				break;
			}
		}
		if (m == 0) {
			jTextPane1.setText("对不起，没有该人的预订信息！");
		} else {
			jTextPane1.setText("");

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

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new check_in().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
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
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextPane jTextPane1;
	// End of variables declaration//GEN-END:variables

}