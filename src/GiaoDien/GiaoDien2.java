/*
 * Created by JFormDesigner on Sun Jun 07 18:38:47 ICT 2020
 */

package GiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Trần Đức Long
 */
public class GiaoDien2 extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GiaoDien2(Window owner) {
		super(owner);
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		// TODO add your code here
		GiaoDien3 a = new GiaoDien3();
		a.setVisible(true);
	}

	private void button2ActionPerformed(ActionEvent e) {
		// TODO add your code here
		GiaoDien4 a = new GiaoDien4();
		a.setVisible(true);
	}

	private void okButtonActionPerformed(ActionEvent e) {
		System.exit(0);
		// TODO add your code here
	}

	private void cancelButtonActionPerformed(ActionEvent e) {
		System.exit(0);
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Trần Đức Long
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		//======== this ========
		setTitle("CH\u1eccN S\u1ef0 BI\u1ebeN \u0110\u1ed4I");
		setBackground(Color.blue);
		setForeground(SystemColor.textHighlight);
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setBackground(SystemColor.desktop);
			dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
			border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax. swing .border . TitledBorder. CENTER
			,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dialo\u0067", java .awt . Font
			. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener(
			new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072"
			.equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setBackground(Color.black);
				contentPanel.setLayout(null);

				//---- button1 ----
				button1.setText("T\u0102NG");
				button1.setForeground(Color.white);
				button1.setBackground(new Color(0, 204, 0));
				button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				button1.addActionListener(e -> button1ActionPerformed(e));
				contentPanel.add(button1);
				button1.setBounds(320, 65, 240, 45);

				//---- button2 ----
				button2.setText("GI\u1ea2M");
				button2.setBackground(Color.red);
				button2.setForeground(Color.white);
				button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
				button2.addActionListener(e -> button2ActionPerformed(e));
				contentPanel.add(button2);
				button2.setBounds(320, 185, 240, 45);

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
				okButton.setBounds(720, 10, 80, okButton.getPreferredSize().height);

				//---- cancelButton ----
				cancelButton.setText("Cancel");
				cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
				buttonBar.add(cancelButton);
				cancelButton.setBounds(815, 10, 80, cancelButton.getPreferredSize().height);

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
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Trần Đức Long
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JButton button1;
	private JButton button2;
	private JPanel buttonBar;
	private JButton okButton;
	private JButton cancelButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
