/*
 * Created by JFormDesigner on Mon Jun 08 08:07:26 ICT 2020
 */

package GiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import MauCau.FindTool;

/**
 * @author Trần Đức Long
 */
public class GiaoDien3 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GiaoDien3() {
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		FindTool.printMaxValueStock();
		// TODO add your code here
	}

	private void button2ActionPerformed(ActionEvent e) {
		FindTool.printMinIncStock();
		// TODO add your code here
	}

	private void button3ActionPerformed(ActionEvent e) {
		FindTool.printIncStock();
		// TODO add your code here
	}

	private void okButtonActionPerformed(ActionEvent e) {
		System.exit(0);
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Trần Đức Long
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		buttonBar = new JPanel();
		okButton = new JButton();

		//======== this ========
		setTitle("XIN M\u1edcI CH\u1eccN LO\u1ea0I CH\u1ee8NG KHO\u00c1N T\u0102NG");
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setBackground(Color.black);
			dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
			border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER
			,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font
			. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener(
			new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order"
			.equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setBackground(Color.black);
				contentPanel.setLayout(null);

				//---- button1 ----
				button1.setText("T\u0103ng M\u1ea1nh Nh\u1ea5t");
				button1.setBackground(new Color(0, 204, 0));
				button1.setForeground(Color.white);
				button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				button1.addActionListener(e -> {
			button1ActionPerformed(e);

		});
				contentPanel.add(button1);
				button1.setBounds(200, 30, 305, 55);

				//---- button2 ----
				button2.setText("T\u0103ng \u00cdt Nh\u1ea5t");
				button2.setBackground(new Color(0, 204, 0));
				button2.setForeground(Color.white);
				button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
				button2.addActionListener(e -> {
			button2ActionPerformed(e);

		});
				contentPanel.add(button2);
				button2.setBounds(200, 110, 305, 56);

				//---- button3 ----
				button3.setText("T\u1ea5t C\u1ea3 Ch\u1ee9ng Kho\u00e1n T\u0103ng");
				button3.setBackground(new Color(0, 204, 0));
				button3.setForeground(Color.white);
				button3.setFont(new Font("Times New Roman", Font.BOLD, 14));
				button3.addActionListener(e -> button3ActionPerformed(e));
				contentPanel.add(button3);
				button3.setBounds(200, 200, 305, 55);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < contentPanel.getComponentCount(); i++) {
						Rectangle bounds = contentPanel.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = contentPanel.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					contentPanel.setMinimumSize(preferredSize);
					contentPanel.setPreferredSize(preferredSize);
				}
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
				buttonBar.setBackground(Color.black);
				buttonBar.setLayout(null);

				//---- okButton ----
				okButton.setText("OK");
				okButton.addActionListener(e -> okButtonActionPerformed(e));
				buttonBar.add(okButton);
				okButton.setBounds(649, 12, 80, okButton.getPreferredSize().height);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < buttonBar.getComponentCount(); i++) {
						Rectangle bounds = buttonBar.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = buttonBar.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					buttonBar.setMinimumSize(preferredSize);
					buttonBar.setPreferredSize(preferredSize);
				}
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Trần Đức Long
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel buttonBar;
	private JButton okButton;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
