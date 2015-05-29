package myclass;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Currencydb;
import dao.CurrencydbDAO;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modify extends JFrame {

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modify frame = new Modify();
					frame.setSize(540, 350);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Modify() {
		setResizable(false);
		setAutoRequestFocus(false);
		initComponents();
		CurrencydbDAO ser = new CurrencydbDAO();
		List<?> serlist = ser.findAll();
		setTableSer(serlist);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 539, 359);
		
	}
	public void setTableSer(List<?> Item) {

		int numItem = Item.size();
		Object o[][] = new Object[numItem][3];
		for (int i = 0; i < numItem; i++) {
			Currencydb sc = (Currencydb) ((java.util.List<?>) Item).get(i);
			o[i][0] = sc.getId();
			o[i][1] = sc.getCurrency();
			o[i][2] = sc.getExchangeRate();
		}
		String[] coluNames = { "–Ú∫≈", "±“÷÷", "ª„¬ " };
		jTable1.setModel(new javax.swing.table.DefaultTableModel(o, coluNames));

	}
	private void initComponents() {
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null } },
				new String[] { "Title 1", "Title 2", "Title 3" }));
		jScrollPane1.setViewportView(jTable1);
		
		JButton button = new JButton("\u66F4\u65B0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGap(39)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
					.addGap(203)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(197, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(24)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);

		pack();
	}
}
