/*
 * main.java
 *
 * Created on __DATE__, __TIME__
 */

package uml.hotel.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import javax.swing.JOptionPane;

import uml.hotel.model.Room;
import uml.hotel.model.RoomDAO;
import uml.hotel.model.WalkIn;
import uml.hotel.model.WalkInDAO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class walk_in extends javax.swing.JFrame {

	/** Creates new form main */
	public walk_in() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel3 = new javax.swing.JPanel();
		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jLabel15 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextPane1 = new javax.swing.JTextPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextPane2 = new javax.swing.JTextPane();
		jLabel9 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel14 = new javax.swing.JLabel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);

		jButton2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 24));
		jButton2.setText("\u53d6\u6d88");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(380, 420, 90, 41);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 24));
		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(90, 420, 90, 41);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel7.setForeground(new java.awt.Color(255, 0, 0));
		jLabel7.setBounds(450, 80, 60, 20);
		jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 24));
		jLabel1.setText("\u6563\u5ba2\u5165\u4f4f");
		jLabel1.setBounds(210, 10, 96, 33);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel6.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 14));
		jLabel6.setText("\u623f\u95f4\u4ef7\u683c:");
		jLabel6.setBounds(370, 80, 60, 19);
		jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel5.setForeground(new java.awt.Color(255, 0, 0));
		jLabel5.setBounds(270, 80, 80, 20);
		jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel4.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 14));
		jLabel4.setText("\u623f\u95f4\u7c7b\u578b\uff1a");
		jLabel4.setBounds(200, 80, 70, 19);
		jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel3.setForeground(new java.awt.Color(255, 0, 0));
		jLabel3.setBounds(90, 80, 70, 20);
		jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 14));
		jLabel2.setText("\u623f\u95f4\u53f7\uff1a");
		jLabel2.setBounds(30, 80, 56, 19);
		jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTabbedPane1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));

		jPanel2.setBackground(java.awt.SystemColor.textHighlight);
		jPanel2.setName("");

		jLabel15.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel15.setText("\u59d3      \u540d");

		jLabel16.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel16.setText("\u8eab\u4efd\u8bc1\u53f7");

		jLabel17.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel17.setText("\u8054\u7cfb\u7535\u8bdd");

		jLabel18.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel18.setText("\u5907\u6ce8\u4fe1\u606f");

		jScrollPane1.setViewportView(jTextPane1);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel15)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jTextField7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				103,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel16)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jTextField8,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				103,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel17)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jTextField9,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				103,
																				Short.MAX_VALUE)))
										.addGap(58, 58, 58)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel18)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																172,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(36, 36, 36)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(34, 34, 34)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jLabel15)
																		.addComponent(
																				jLabel18)))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				28,
																				28,
																				28)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel16)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				32,
																				32,
																				32)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel17)
																						.addComponent(
																								jTextField9,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				3,
																				3,
																				3)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				107,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(44, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u987e\u5ba2\u4fe1\u606f", jPanel2);

		jPanel1.setBackground(java.awt.SystemColor.textHighlight);

		jLabel10.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel10.setText("\u5165\u4f4f\u65f6\u95f4");

		jLabel11.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel11.setText("\u5165\u4f4f\u5929\u6570");

		jLabel13.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel13.setText("\u8ba2  \u5355  \u53f7");

		jLabel8.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel8.setText("\u5907\u6ce8\u4fe1\u606f");

		jScrollPane2.setViewportView(jTextPane2);

		jLabel9.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel9.setText("\u79bb\u5f00\u65f6\u95f4");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel10,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												77,
																												Short.MAX_VALUE)
																										.addGap(
																												9,
																												9,
																												9))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel12)
																										.addGap(
																												2,
																												2,
																												2)
																										.addComponent(
																												jLabel13,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												79,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel9)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel11)
																		.addGap(
																				14,
																				14,
																				14)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																107,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(40, 40, 40)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																181,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8))
										.addGap(39, 39, 39)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(34, 34, 34)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel10)
														.addComponent(jLabel8)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(9, 9, 9)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(8, 8, 8)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				39,
																				39,
																				39)
																		.addComponent(
																				jLabel12))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel11)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel13)
																						.addComponent(
																								jTextField4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(49, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(59, Short.MAX_VALUE)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												103,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(50, 50, 50)));

		jTabbedPane1.addTab("\u623f\u95f4\u4fe1\u606f", jPanel1);

		jTabbedPane1.setBounds(40, 140, 470, 250);
		jLayeredPane1.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel14.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 14));
		jLabel14.setIcon(new ImageIcon(walk_in.class.getResource("/uml/hotel/view/meigong/\u80CC\u666F4.jpg"))); // NOI18N
		jLabel14.setBounds(0, 0, 560, 510);
		jLayeredPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	//œ‘ æø™µ•∑øº‰µƒ–≈œ¢
	public void show(String room_id) {
		String myRoom_id = room_id;
		RoomDAO rd = new RoomDAO();
		Room rm = new Room();
		List a = rd.findByRoomId(myRoom_id);
		rm = (Room) a.get(0);

		jLabel3.setText(rm.getRoomId());
		jLabel5.setText(rm.getDescription());
		jLabel7.setText(rm.getPrice().toString());

		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date curDate = new Date(System.currentTimeMillis());//ªÒ»°µ±«∞ ±º‰     
		String nowTime = formatter.format(curDate);

		jTextField1.setText(nowTime);
		jTextField2.setText(nowTime);
		jTextField3.setText("0");

		SimpleDateFormat form = new SimpleDateFormat("yyyyMMddhhmmss");
		Date cDate = new Date(System.currentTimeMillis());//ªÒ»°µ±«∞ ±º‰     
		String booking_id = form.format(cDate);
		jTextField4.setText(booking_id);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String id = jTextField8.getText().toString();
		String call = jTextField9.getText().toString();
		boolean isNum1 = id.matches("(^\\d{15}$)|(^\\d{17}([0-9]|X|x|)$)");
		boolean isNum2 = call.matches("(^\\d{11}$)");

		if (!isNum1) {
			JOptionPane.showMessageDialog(this, "…Ì∑›÷§∫≈¬Î ‰»Î≤ª’˝»∑£°", "œ˚œ¢",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (!isNum2) {
			JOptionPane.showMessageDialog(this, " ÷ª˙∫≈¬Î ‰»Î≤ª’˝»∑£°", "œ˚œ¢",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			WalkIn wi = new WalkIn();
			wi.setBookingId(jTextField4.getText().toString());
			wi.setCustomerId(jTextField8.getText().toString());
			wi.setName(jTextField7.getText().toString());
			wi.setRoomId(jLabel3.getText().toString());
			wi.setStartTime(jTextField1.getText().toString());
			wi.setEndTime(jTextField2.getText().toString());
			wi.setLiveDate(Integer.parseInt(jTextField3.getText().toString()));

			WalkInDAO WD = new WalkInDAO();
			WD.save(wi); //±£¥ÊµΩ ˝æ›ø‚
			this.dispose();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new walk_in().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
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
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private javax.swing.JTextPane jTextPane1;
	private javax.swing.JTextPane jTextPane2;
	// End of variables declaration//GEN-END:variables

}