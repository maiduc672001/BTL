/*
 * Created by JFormDesigner on Thu Jun 11 12:40:57 ICT 2020
 */

package GiaoDien;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import CongCu.ReadFileKeyword;

/**
 * @author Trần Đức Long
 */
public class GiaoDien5 extends JFrame {
	

	public GiaoDien5() {
		initComponents();
	}

	public static String[] button1ActionPerformed() {
		String s = textField1.getText();
		ReadFileKeyword a = new ReadFileKeyword();
		return a.getFileKeyword(s);
	}

	private void textField1InputMethodTextChanged(InputMethodEvent e) {
		// TODO add your code here
	}

	private void button1ActionPerformed(ActionEvent e) {
		// TODO add your code here
		GiaoDien6 a = new GiaoDien6();
		a.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Trần Đức Long
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		panel1 = new JPanel();
		textField1 = new JTextField();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		okButton = new JButton();
		buttonBar = new JPanel();
		button1 = new JButton();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
			EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
			. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
			java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
			{ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
			throw new RuntimeException( ); }} );
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setLayout(null);

				//======== panel1 ========
				{
					panel1.setLayout(null);

					//---- textField1 ----
					textField1.addInputMethodListener(new InputMethodListener() {
						@Override
						public void caretPositionChanged(InputMethodEvent e) {}
						@Override
						public void inputMethodTextChanged(InputMethodEvent e) {
							textField1InputMethodTextChanged(e);
						}
					});
					panel1.add(textField1);
					textField1.setBounds(0, 0, 185, 45);

					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < panel1.getComponentCount(); i++) {
							Rectangle bounds = panel1.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = panel1.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						panel1.setMinimumSize(preferredSize);
						panel1.setPreferredSize(preferredSize);
					}
				}
				contentPanel.add(panel1);
				panel1.setBounds(new Rectangle(new Point(80, 75), panel1.getPreferredSize()));

				//---- label1 ----
				label1.setText("M\u1edcI NH\u1eacP T\u1eea KH\u00d3A T\u00ccM KI\u1ebeM");
				label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				contentPanel.add(label1);
				label1.setBounds(65, 35, 270, 23);

				//---- label2 ----
				label2.setText("NH\u1eeeNG T\u1eea KH\u00d3A V\u1eeaA NH\u1eacP :");
				label2.setFont(new Font("Times New Roman", Font.BOLD, 10));
				contentPanel.add(label2);
				label2.setBounds(5, 175, 150, 25);

				//---- label3 ----
				label3.setText(" ");
				contentPanel.add(label3);
				label3.setBounds(180, 180, 170, label3.getPreferredSize().height);

				//---- okButton ----
				okButton.setText("TH\u00caM");
				okButton.addActionListener(e -> {
			okButtonActionPerformed(e);

		});
				contentPanel.add(okButton);
				okButton.setBounds(280, 90, 80, okButton.getPreferredSize().height);

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
				buttonBar.setLayout(new GridBagLayout());
				((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
				((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

				//---- button1 ----
				button1.setText("T\u00ccM");
				button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				button1.addActionListener(e -> {
			button1ActionPerformed(e);
		});
				buttonBar.add(button1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	private void okButtonActionPerformed(ActionEvent e) {
		ArrayList<String> a = new ArrayList<String>();
		String s = textField1.getText();
		a.add(s);
		label3.setText(s);

		// TODO add your code here
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Trần Đức Long
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JPanel panel1;
	private static JTextField textField1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JButton okButton;
	private JPanel buttonBar;
	private JButton button1;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
