/*
 * servation.java
 *
 * Created on __DATE__, __TIME__
 */

package uml.hotel.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uml.hotel.model.Reservation;
import uml.hotel.model.ReservationDAO;
import javax.swing.ImageIcon;

/**
 *
 * @author  __USER__
 */
public class servation extends JFrame {

	/** Creates new form servation */
	public servation() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jMenu1 = new javax.swing.JMenu();
		jScrollPane8 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jPanel6 = new javax.swing.JPanel();
		jLayeredPane1 = new javax.swing.JLayeredPane();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jScrollPane7 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel12 = new javax.swing.JLabel();
		jScrollPane9 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jTextField13 = new javax.swing.JTextField();
		jLabel23 = new javax.swing.JLabel();
		jTextField14 = new javax.swing.JTextField();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jTextField12 = new javax.swing.JTextField();
		jButton7 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		jComboBox3 = new javax.swing.JComboBox();
		jLabel14 = new javax.swing.JLabel();
		jComboBox4 = new javax.swing.JComboBox();
		jButton2 = new javax.swing.JButton();
		jScrollPane10 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jComboBox7 = new javax.swing.JComboBox();
		jLabel29 = new javax.swing.JLabel();
		jComboBox8 = new javax.swing.JComboBox();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextPane2 = new javax.swing.JTextPane();
		jLabel30 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jComboBox5 = new javax.swing.JComboBox();
		jLabel27 = new javax.swing.JLabel();
		jComboBox6 = new javax.swing.JComboBox();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextPane1 = new javax.swing.JTextPane();
		jLabel28 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();

		jMenu1.setText("Menu");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane8.setViewportView(jTable2);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(new java.awt.Color(204, 204, 204));
		setResizable(false);

		jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
		jTabbedPane1.setFont(new java.awt.Font("微软雅黑", 0, 24));

		jPanel1.setBackground(java.awt.SystemColor.textHighlight);
		jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor(
				"RadioButtonMenuItem.selectionForeground"));

		jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel2.setText("\u5bbe\u5ba2\u59d3\u540d");

		jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel3.setText("\u8054\u7cfb\u7535\u8bdd");

		jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel4.setText("\u9884\u8ba2\u89c4\u683c");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "标准单人间", "标准双人间", "豪华单人间", "豪华双人间", "商务套房", "总统套房" }));
		jComboBox1.setToolTipText("1\n2\n3\n");
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel5.setText("\u623f  \u95f4  \u53f7");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel7.setText("\u9884\u8ba2\u65f6\u95f4");

		jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel8.setText("\u5165\u4f4f\u65f6\u95f4");

		jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel9.setText("\u8ba2\u5355\u53f7");

		jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel10.setText("\u5df2\u9884\u8ba2");

		jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel11.setText("\u7684\u5bbe\u5ba2");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null } },
				new String[] { "宾客姓名", "入住时间", "预离时间" }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane7.setViewportView(jTable1);

		jLabel12.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel12.setText("\u672c\u6b21\u9884\u8ba2\u623f\u95f4\u4fe1\u606f");

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null } }, new String[] { "预订规格", "房间号" }));
		jScrollPane9.setViewportView(jTable3);

		jButton1.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton1.setLabel("\u786e\u5b9a");
		jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jButton1StateChanged(evt);
			}
		});
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jLabel22.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel22.setText("\u9884\u79bb\u65f6\u95f4");

		jLabel23.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel23.setText("\u9884\u7559\u65f6\u95f4");

		jTextField14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField14ActionPerformed(evt);
			}
		});

		jLabel26.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel26.setText("\u8eab\u4efd\u8bc1\u53f7");

		jButton7.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton7.setText("\u53d6\u6d88");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

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
																		.addComponent(
																				jLabel7)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				jPanel1Layout
																						.createSequentialGroup()
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
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
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.LEADING)
																																														.addComponent(
																																																jLabel2)
																																														.addComponent(
																																																jLabel3,
																																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																																111,
																																																Short.MAX_VALUE))
																																										.addGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING,
																																												jPanel1Layout
																																														.createSequentialGroup()
																																														.addGroup(
																																																jPanel1Layout
																																																		.createParallelGroup(
																																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																																				false)
																																																		.addComponent(
																																																				jLabel26,
																																																				javax.swing.GroupLayout.Alignment.LEADING,
																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																				Short.MAX_VALUE)
																																																		.addComponent(
																																																				jLabel4,
																																																				javax.swing.GroupLayout.Alignment.LEADING,
																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																				Short.MAX_VALUE))
																																														.addPreferredGap(
																																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																																						.addGroup(
																																								jPanel1Layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jLabel8)
																																										.addGap(
																																												24,
																																												24,
																																												24)))
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel5)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jTextField4,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				149,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jComboBox1,
																																				0,
																																				149,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jTextField3,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				149,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jComboBox2,
																																				0,
																																				149,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jTextField12,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				149,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jTextField2,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				149,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jTextField1,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				149,
																																				Short.MAX_VALUE)))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												jPanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel9)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																56,
																																Short.MAX_VALUE)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				false)
																																		.addComponent(
																																				jTextField5)
																																		.addComponent(
																																				jTextField14)
																																		.addComponent(
																																				jTextField13,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				150,
																																				Short.MAX_VALUE))))
																						.addGap(
																								46,
																								46,
																								46))
																		.addComponent(
																				jLabel22,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				306,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel23))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				116,
																				116,
																				116)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel6)
																																						.addGap(
																																								0,
																																								0,
																																								0))
																																		.addComponent(
																																				jLabel21)
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel10)
																																						.addGap(
																																								5,
																																								5,
																																								5)
																																						.addComponent(
																																								jLabel25,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								39,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jLabel11)))
																														.addGap(
																																40,
																																40,
																																40)
																														.addComponent(
																																jLabel24))
																										.addComponent(
																												jLabel12)))
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addGap(
																								107,
																								107,
																								107)
																						.addComponent(
																								jButton7))
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jScrollPane9,
																								0,
																								0,
																								Short.MAX_VALUE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				304,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												30,
																												30,
																												30)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel2)
																														.addComponent(
																																jTextField1,
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
																																jLabel3)
																														.addComponent(
																																jTextField2,
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
																																jLabel26)
																														.addComponent(
																																jTextField12,
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
																																jLabel4)
																														.addComponent(
																																jComboBox1,
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
																																jComboBox2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel5)))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												22,
																												22,
																												22)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(
																																				jLabel21)
																																		.addComponent(
																																				jLabel10)
																																		.addComponent(
																																				jLabel24)
																																		.addComponent(
																																				jLabel25,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				24,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addComponent(
																																jLabel11))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jScrollPane7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												112,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel12))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jTextField4,
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
																								jLabel22)
																						.addComponent(
																								jTextField13,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel23)
																						.addComponent(
																								jTextField14,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel9)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField5,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												18,
																												18,
																												18)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jButton7)
																														.addComponent(
																																jButton1))
																										.addGap(
																												263,
																												263,
																												263)
																										.addComponent(
																												jLabel6))))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				234,
																				234,
																				234)
																		.addComponent(
																				jScrollPane9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				119,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u65b0\u589e\u9884\u8ba2", jPanel1);

		jPanel4.setBackground(java.awt.SystemColor.textHighlight);

		jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel13.setText("\u9884\u8ba2\u89c4\u683c");

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "标准单人间", "标准双人间", "豪华双人间", "豪华单人间", "商务套房", "总统套房" }));
		jComboBox3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox3ActionPerformed(evt);
			}
		});

		jLabel14.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel14.setText("\u623f\u95f4\u53f7");

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "" }));
		jComboBox4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox4ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton2.setLabel("\u786e\u5b9a");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTable4.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null } }, new String[] {
						"姓名", "电话号", "预订时间", "入住时间", "预离时间", "订单号" }));
		jScrollPane10.setViewportView(jTable4);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				12,
																				12,
																				12)
																		.addComponent(
																				jLabel13)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jComboBox3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				91,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				38,
																				38,
																				38)
																		.addComponent(
																				jLabel14)
																		.addGap(
																				36,
																				36,
																				36)
																		.addComponent(
																				jComboBox4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				107,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel4Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jScrollPane10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				576,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(47, Short.MAX_VALUE)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(30, 30, 30)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel13)
														.addComponent(
																jComboBox3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel14)
														.addComponent(jButton2)
														.addComponent(
																jComboBox4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane10,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												322,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(36, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u67e5\u770b\u9884\u8ba2\u4fe1\u606f", jPanel4);

		jPanel5.setBackground(java.awt.SystemColor.textHighlight);
		jPanel5.setFont(new java.awt.Font("微软雅黑", 0, 36));

		jLabel18.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel18.setText("\u9884\u8ba2\u89c4\u683c");

		jLabel19.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel19.setText("\u987e\u5ba2\u59d3\u540d");

		jTextField9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField9ActionPerformed(evt);
			}
		});

		jLabel20.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel20.setText("\u8eab\u4efd\u8bc1\u53f7");

		jButton5.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton5.setText("\u786e\u5b9a");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton6.setText("\u53d6\u6d88");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jComboBox7.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "标准单人间", "标准双人间", "豪华双人间", "豪华单人间", "商务套房", "总统套房" }));
		jComboBox7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox7ActionPerformed(evt);
			}
		});

		jLabel29.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel29.setText("\u623f  \u95f4  \u53f7");

		jComboBox8.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "" }));
		jComboBox8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox8ActionPerformed(evt);
			}
		});

		jTextPane2.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jScrollPane2.setViewportView(jTextPane2);

		jLabel30.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel30.setText("\u8bf4\u660e");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGap(
																				44,
																				44,
																				44)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel5Layout
																										.createSequentialGroup()
																										.addGap(
																												22,
																												22,
																												22)
																										.addGroup(
																												jPanel5Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel29)
																														.addComponent(
																																jLabel18)
																														.addComponent(
																																jLabel19)
																														.addGroup(
																																jPanel5Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addComponent(
																																				jLabel30)
																																		.addComponent(
																																				jLabel20)))
																										.addGap(
																												47,
																												47,
																												47)
																										.addGroup(
																												jPanel5Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addComponent(
																																jTextField9,
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jComboBox8,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																0,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jComboBox7,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																0,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField10,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																127,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel5Layout
																										.createSequentialGroup()
																										.addGap(
																												404,
																												404,
																												404)
																										.addGroup(
																												jPanel5Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jButton5,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jButton6,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																97,
																																Short.MAX_VALUE)))))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGap(
																				87,
																				87,
																				87)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				442,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(90, Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGap(
																				30,
																				30,
																				30)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel18)
																						.addComponent(
																								jComboBox7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								31,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel29)
																						.addComponent(
																								jComboBox8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel19)
																						.addComponent(
																								jTextField9,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								28,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				13,
																				13,
																				13)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField10,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								28,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel20)))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGap(
																				44,
																				44,
																				44)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				44,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				41,
																				41,
																				41)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel30)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												181, Short.MAX_VALUE)
										.addContainerGap()));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel5, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		jTabbedPane1.addTab("\u4fee\u6539\u9884\u8ba2", jPanel2);

		jPanel3.setBackground(java.awt.SystemColor.textHighlight);
		jPanel3.setFont(new java.awt.Font("微软雅黑", 0, 36));

		jLabel15.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel15.setText("\u9884\u8ba2\u89c4\u683c");

		jLabel16.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel16.setText("\u987e\u5ba2\u59d3\u540d");

		jLabel17.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel17.setText("\u8eab\u4efd\u8bc1\u53f7");

		jButton3.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton3.setText("\u786e\u5b9a");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jButton4.setText("\u8fd4\u56de");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jComboBox5.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "豪华双人间", "标准单人间", "标准双人间", "豪华单人间", "商务套房", "总统套房" }));
		jComboBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox5ActionPerformed(evt);
			}
		});

		jLabel27.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel27.setText("\u623f  \u95f4  \u53f7");

		jComboBox6.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "" }));
		jComboBox6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox6ActionPerformed(evt);
			}
		});

		jTextPane1.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jScrollPane1.setViewportView(jTextPane1);

		jLabel28.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel28.setText("\u8bf4\u660e");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(
																				44,
																				44,
																				44)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												22,
																												22,
																												22)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel27)
																														.addComponent(
																																jLabel15)
																														.addComponent(
																																jLabel16)
																														.addGroup(
																																jPanel3Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addComponent(
																																				jLabel28)
																																		.addComponent(
																																				jLabel17)))
																										.addGap(
																												47,
																												47,
																												47)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addComponent(
																																jTextField7,
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jComboBox6,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																0,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jComboBox5,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																0,
																																119,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField8,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																127,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												404,
																												404,
																												404)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jButton3,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jButton4,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																97,
																																Short.MAX_VALUE)))))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(
																				87,
																				87,
																				87)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				442,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(90, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(
																				30,
																				30,
																				30)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel15)
																						.addComponent(
																								jComboBox5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								31,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel27)
																						.addComponent(
																								jComboBox6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								33,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel16)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								28,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				13,
																				13,
																				13)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								28,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel17)))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(
																				44,
																				44,
																				44)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				44,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				41,
																				41,
																				41)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel28)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												186, Short.MAX_VALUE)
										.addContainerGap()));

		jButton3.getAccessibleContext().setAccessibleName("");

		jTabbedPane1.addTab("\u5220\u9664\u9884\u8ba2", jPanel3);

		jTabbedPane1.setBounds(120, 60, 640, 490);
		jLayeredPane1.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setFont(new java.awt.Font("黑体", 0, 36));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u9884\u8ba2\u7ba1\u7406");
		jLabel1.setBounds(350, 10, 144, 42);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel31.setIcon(new ImageIcon(servation.class.getResource("/uml/hotel/view/meigong/\u80CC\u666F5.jpg"))); // NOI18N
		jLabel31.setBounds(0, 0, 1060, 740);
		jLayeredPane1.add(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839,
				Short.MAX_VALUE));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel6Layout.createSequentialGroup().addComponent(
						jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
						725, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 600,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jComboBox7.getSelectedItem().toString().compareTo("标准单人间") == 0) {
			jComboBox8.removeAllItems();
			jComboBox8.addItem("BD001");
			jComboBox8.addItem("BD002");
			jComboBox8.addItem("BD003");
			jComboBox8.addItem("BD004");
			jComboBox8.addItem("BD005");
			jComboBox8.addItem("BD006");
			jComboBox8.addItem("BD007");
			jComboBox8.addItem("BD008");
			jComboBox8.addItem("BD009");

		}
		if (jComboBox7.getSelectedItem().toString().compareTo("标准双人间") == 0) {
			jComboBox8.removeAllItems();
			jComboBox8.addItem("BS001");
			jComboBox8.addItem("BS002");
			jComboBox8.addItem("BS003");
			jComboBox8.addItem("BS004");
			jComboBox8.addItem("BS005");
			jComboBox8.addItem("BS006");
			jComboBox8.addItem("BS007");
			jComboBox8.addItem("BS008");
			jComboBox8.addItem("BS009");
		}
		if (jComboBox7.getSelectedItem().toString().compareTo("豪华单人间") == 0) {
			jComboBox8.removeAllItems();
			jComboBox8.addItem("HD001");
			jComboBox8.addItem("HD002");
			jComboBox8.addItem("HD003");
			jComboBox8.addItem("HD004");
		}
		if (jComboBox7.getSelectedItem().toString().compareTo("豪华双人间") == 0) {
			jComboBox8.removeAllItems();
			jComboBox8.addItem("HS001");
			jComboBox8.addItem("HS002");
			jComboBox8.addItem("HS003");
			jComboBox8.addItem("HS004");
		}
		if (jComboBox7.getSelectedItem().toString().compareTo("商务套房") == 0) {
			jComboBox8.removeAllItems();
			jComboBox8.addItem("SW001");
			jComboBox8.addItem("SW002");
			jComboBox8.addItem("SW003");
			jComboBox8.addItem("SW004");
		}
		if (jComboBox7.getSelectedItem().toString().compareTo("总统套房") == 0) {
			jComboBox8.removeAllItems();
			jComboBox8.addItem("ZT001");
			jComboBox8.addItem("ZT002");
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String name = jTextField9.getText().toString();
		String ID = jTextField10.getText().toString();
		String room_id = jComboBox8.getSelectedItem().toString();

		ReservationDAO r = new ReservationDAO(); //从数据库中查找到要修改的订单
		List a = r.findByRoomId(room_id);
		int t = 0;
		int j = a.size();
		for (int i = 0; i < j; i++) {
			Reservation myrs = (Reservation) ((java.util.List) a).get(i);
			if ((myrs.getCustomerId().compareTo(ID) == 0)
					&& (myrs.getName().compareTo(name) == 0)) {
				t = 1; //当信息存在
				break;
			}
		}

		if (t == 0) {
			jTextPane2.setText("您要修改的订单信息不存在！请验证您输入的信息是否正确。");
		} else {
			jTextPane2.setText(null);
			showServation sv = new showServation();
			sv.show();
			sv.myshow(name, ID, room_id);
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String id = jTextField12.getText().toString();
		String call = jTextField2.getText().toString();
		boolean isNum1 = id.matches("(^\\d{15}$)|(^\\d{17}([0-9]|X|x|)$)");
		boolean isNum2 = call.matches("(^\\d{11}$)");
		if (!isNum1) {
			JOptionPane.showMessageDialog(this, "身份证号码输入不正确！", "消息",
					JOptionPane.INFORMATION_MESSAGE);
			//return;
		} else if (!isNum2) {
			JOptionPane.showMessageDialog(this, "手机号码输入不正确！", "消息",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Reservation re = new Reservation();
			re.setName(jTextField1.getText().toString());
			re.setCustomerId(jTextField12.getText().toString());
			re.setCallNumber(jTextField2.getText().toString());
			re.setRoomId(jComboBox2.getSelectedItem().toString());
			re.setBookingTime(jTextField3.getText().toString());
			re.setStartTime(jTextField4.getText().toString());
			re.setEndTime(jTextField13.getText().toString());
			re.setStayTime(jTextField14.getText().toString());
			re.setBookingId(jTextField5.getText().toString());

			ReservationDAO rd = new ReservationDAO();
			rd.save(re); //添加到数据库

			//显示已经预订该房间的信息
			jLabel25.setText(jComboBox2.getSelectedItem().toString());
			ReservationDAO r = new ReservationDAO();
			List a = r.findByRoomId(jComboBox2.getSelectedItem().toString());
			int j = a.size();
			Object o[][] = new Object[j + 4][3];
			for (int i = 0; i < j; i++) {
				Reservation rs = (Reservation) ((java.util.List) a).get(i);
				o[i][0] = rs.getName();
				o[i][1] = rs.getStartTime();
				o[i][2] = rs.getEndTime();
			}
			for (int i = 0; i < 4; i++) {
				o[j + i][0] = null;
				o[j + i][1] = null;
				o[j + i][2] = null;
			}
			String[] columNames = { " 姓名", "入住时间", "预离时间" };
			jTable1.setModel(new javax.swing.table.DefaultTableModel(o,
					columNames));

			//显示本次预订的信息

			Object ob[][] = new Object[j + 4][2];
			for (int i = 0; i < j; i++) {
				ob[i][0] = jComboBox1.getSelectedItem().toString();
				ob[i][1] = jComboBox2.getSelectedItem().toString();
			}
			for (int i = 0; i < 4; i++) {
				ob[j + i][0] = null;
				ob[j + i][1] = null;
			}
			String[] columName = { " 预订规格", "房间号" };
			jTable3.setModel(new javax.swing.table.DefaultTableModel(ob,
					columName));
		}

	}

	private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jComboBox5.getSelectedItem().toString().compareTo("标准单人间") == 0) {
			jComboBox6.removeAllItems();
			jComboBox6.addItem("BD001");
			jComboBox6.addItem("BD002");
			jComboBox6.addItem("BD003");
			jComboBox6.addItem("BD004");
			jComboBox6.addItem("BD005");
			jComboBox6.addItem("BD006");
			jComboBox6.addItem("BD007");
			jComboBox6.addItem("BD008");
			jComboBox6.addItem("BD009");

		}
		if (jComboBox5.getSelectedItem().toString().compareTo("标准双人间") == 0) {
			jComboBox6.removeAllItems();
			jComboBox6.addItem("BS001");
			jComboBox6.addItem("BS002");
			jComboBox6.addItem("BS003");
			jComboBox6.addItem("BS004");
			jComboBox6.addItem("BS005");
			jComboBox6.addItem("BS006");
			jComboBox6.addItem("BS007");
			jComboBox6.addItem("BS008");
			jComboBox6.addItem("BS009");
		}
		if (jComboBox5.getSelectedItem().toString().compareTo("豪华单人间") == 0) {
			jComboBox6.removeAllItems();
			jComboBox6.addItem("HD001");
			jComboBox6.addItem("HD002");
			jComboBox6.addItem("HD003");
			jComboBox6.addItem("HD004");
		}
		if (jComboBox5.getSelectedItem().toString().compareTo("豪华双人间") == 0) {
			jComboBox6.removeAllItems();
			jComboBox6.addItem("HS001");
			jComboBox6.addItem("HS002");
			jComboBox6.addItem("HS003");
			jComboBox6.addItem("HS004");
		}
		if (jComboBox5.getSelectedItem().toString().compareTo("商务套房") == 0) {
			jComboBox6.removeAllItems();
			jComboBox6.addItem("SW001");
			jComboBox6.addItem("SW002");
			jComboBox6.addItem("SW003");
			jComboBox6.addItem("SW004");
		}
		if (jComboBox5.getSelectedItem().toString().compareTo("总统套房") == 0) {
			jComboBox6.removeAllItems();
			jComboBox6.addItem("ZT001");
			jComboBox6.addItem("ZT002");
		}
	}

	private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jComboBox3.getSelectedItem().toString().compareTo("标准单人间") == 0) {
			jComboBox4.removeAllItems();
			jComboBox4.addItem("BD001");
			jComboBox4.addItem("BD002");
			jComboBox4.addItem("BD003");
			jComboBox4.addItem("BD004");
			jComboBox4.addItem("BD005");
			jComboBox4.addItem("BD006");
			jComboBox4.addItem("BD007");
			jComboBox4.addItem("BD008");
			jComboBox4.addItem("BD009");

		}
		if (jComboBox3.getSelectedItem().toString().compareTo("标准双人间") == 0) {
			jComboBox4.removeAllItems();
			jComboBox4.addItem("BS001");
			jComboBox4.addItem("BS002");
			jComboBox4.addItem("BS003");
			jComboBox4.addItem("BS004");
			jComboBox4.addItem("BS005");
			jComboBox4.addItem("BS006");
			jComboBox4.addItem("BS007");
			jComboBox4.addItem("BS008");
			jComboBox4.addItem("BS009");
		}
		if (jComboBox3.getSelectedItem().toString().compareTo("豪华单人间") == 0) {
			jComboBox4.removeAllItems();
			jComboBox4.addItem("HD001");
			jComboBox4.addItem("HD002");
			jComboBox4.addItem("HD003");
			jComboBox4.addItem("HD004");
		}
		if (jComboBox3.getSelectedItem().toString().compareTo("豪华双人间") == 0) {
			jComboBox4.removeAllItems();
			jComboBox4.addItem("HS001");
			jComboBox4.addItem("HS002");
			jComboBox4.addItem("HS003");
			jComboBox4.addItem("HS004");
		}
		if (jComboBox3.getSelectedItem().toString().compareTo("商务套房") == 0) {
			jComboBox4.removeAllItems();
			jComboBox4.addItem("SW001");
			jComboBox4.addItem("SW002");
			jComboBox4.addItem("SW003");
			jComboBox4.addItem("SW004");
		}
		if (jComboBox3.getSelectedItem().toString().compareTo("总统套房") == 0) {
			jComboBox4.removeAllItems();
			jComboBox4.addItem("ZT001");
			jComboBox4.addItem("ZT002");
		}
	}

	private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//显示预订信息
		ReservationDAO r = new ReservationDAO();
		List a = r.findByRoomId(jComboBox4.getSelectedItem().toString());
		int j = a.size();
		Object o[][] = new Object[j + 10][6];
		for (int i = 0; i < j; i++) {
			Reservation rs = (Reservation) ((java.util.List) a).get(i);
			o[i][0] = rs.getName();
			o[i][1] = rs.getCallNumber();
			o[i][2] = rs.getBookingId();
			o[i][3] = rs.getStartTime();
			o[i][4] = rs.getEndTime();
			o[i][5] = rs.getBookingId();
		}
		for (int i = 0; i < 10; i++) {
			o[j + i][0] = null;
			o[j + i][1] = null;
			o[j + i][2] = null;
			o[j + i][3] = null;
			o[j + i][4] = null;
			o[j + i][5] = null;
		}
		String[] columNames = { " 姓名", "电话号", "预订时间", "入住时间", "预离时间", "订单号" };
		jTable4
				.setModel(new javax.swing.table.DefaultTableModel(o, columNames));

	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void extracted2() {
		jButton1.setLabel("\u786e\u5b9a");
	}

	private void extracted11() {
		extracted11();
	}

	private void extracted1() {
		jButton2.setLabel("\u786e\u5b9a");
	}

	private void extracted() {
		extracted2();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField7.getText().toString();
		String ID = jTextField8.getText().toString();
		String room_id = jComboBox6.getSelectedItem().toString();
		Reservation rs = new Reservation();

		ReservationDAO r = new ReservationDAO(); //从数据库中查找到要删除的订单
		List a = r.findByRoomId(room_id);
		int j = a.size();
		int flag = 0;
		for (int i = 0; i < j; i++) {
			Reservation myrs = (Reservation) a.get(i);
			if ((myrs.getCustomerId().compareTo(ID) == 0)
					&& (myrs.getName().compareTo(name) == 0)) {
				flag = 1;
				rs = myrs;
				break;
			}
		}

		if (flag == 0) {
			jTextPane1.setText("对不起，你删除的信息不存在！请查看您输入的信息是否正确。");
		} else {
			ReservationDAO dl = new ReservationDAO();
			dl.delete(rs);

			jTextPane1.setText("                      删除的订单信息如下：\n "
					+ "       姓名：" + rs.getName() + "\n身份证号："
					+ rs.getCustomerId() + " \n    订单号：" + rs.getBookingId()
					+ "\n房间标准：" + jComboBox5.getSelectedItem().toString()
					+ "\n    房间号：" + rs.getRoomId());
		}

	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date curDate = new Date(System.currentTimeMillis());//获取当前时间     
		String str = formatter.format(curDate);
		jTextField3.setText(str);
		jTextField4.setText(str);
		jTextField13.setText(str); //显示当前时间
		jTextField14.setText(str);

		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyyMMddHHmmss");
		Date cuDate = new Date(System.currentTimeMillis());//获取当前时间     
		String str1 = formatter1.format(cuDate);
		jTextField5.setText(str1);
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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new servation().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox4;
	private javax.swing.JComboBox jComboBox5;
	private javax.swing.JComboBox jComboBox6;
	private javax.swing.JComboBox jComboBox7;
	private javax.swing.JComboBox jComboBox8;
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
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane10;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JScrollPane jScrollPane8;
	private javax.swing.JScrollPane jScrollPane9;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private javax.swing.JTextPane jTextPane1;
	private javax.swing.JTextPane jTextPane2;
	// End of variables declaration//GEN-END:variables

}