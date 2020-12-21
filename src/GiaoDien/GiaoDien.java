/*
 * Created by JFormDesigner on Sun Jun 07 19:01:48 ICT 2020
 */

package GiaoDien;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.*;

import MauCau.TheSentence;

public class GiaoDien extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GiaoDien(Window owner) {
		super(owner);
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) throws FileNotFoundException {
		// TODO add your code
		String name = JOptionPane.showInputDialog("Mời nhập tên cổ phiếu :");

		String a = "";
		File file = new File("C:\\Users\\ADMIN\\Downloads\\Bai Tap Lon\\dulieu\\DataChungKhoan.csv");
		Scanner sc = new Scanner(file);
		try {
			while (!(a = sc.next()).equals(name)) {
			}
		} catch (NoSuchElementException e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Không tồn tại chứng khoán");
		}

		JOptionPane.showMessageDialog(null,
				"Hiện tại Cổ phiếu " + name + " đang có giá tham chiếu là : " + sc.nextDouble()
						+ " đang có giá trần là : " + sc.nextDouble() + " đang có giá sàn là : " + sc.nextDouble());

	}

	private void button2ActionPerformed(ActionEvent e) {
		// TODO add your code here
		GiaoDien2 a = new GiaoDien2(null);
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

	private void button3ActionPerformed(ActionEvent e) throws IOException {
		TheSentence.generateSentence();
		JOptionPane.showMessageDialog(null, "Dữ liệu đã được lưu vào file :C:\\Users\\ADMIN\\Downloads\\Bai Tap Lon\\dulieu\\data.txt");
		// TODO add your code here
	}

	private void button4ActionPerformed(ActionEvent e) {
		GiaoDien5 a = new GiaoDien5();
		a.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Trần Đức Long
		dialogPane = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		label1 = new JLabel();
		textField1 = new JTextField();
		button4 = new JButton();

		//======== this ========
		setForeground(SystemColor.activeCaption);
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setForeground(Color.yellow);
			dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
			. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing
			. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
			Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
			) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
			public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName (
			) )) throw new RuntimeException( ); }} );
			dialogPane.setLayout(null);

			//---- button1 ----
			button1.setText("T\u00caN CH\u1ee8NG KHO\u00c1N");
			button1.setBackground(Color.orange);
			button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			button1.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		});
			dialogPane.add(button1);
			button1.setBounds(0, 90, 190, 60);

			//---- button2 ----
			button2.setText("S\u1ef0 BI\u1ebeN \u0110\u1ed8NG");
			button2.setBackground(Color.orange);
			button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
			button2.addActionListener(e -> button2ActionPerformed(e));
			dialogPane.add(button2);
			button2.setBounds(0, 170, 190, 65);

			//---- button3 ----
			button3.setText("T\u1ef0 \u0110\u1ed8NG SINH C\u00c2U");
			button3.setBackground(Color.orange);
			button3.setFont(new Font("Times New Roman", Font.BOLD, 14));
			button3.addActionListener(e -> {
			try {
				button3ActionPerformed(e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});
			dialogPane.add(button3);
			button3.setBounds(0, 260, 190, 65);

			//---- label1 ----
			label1.setText("text");
			label1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\CK1.jpg"));
			label1.setFont(new Font("Times New Roman", Font.BOLD, 22));
			dialogPane.add(label1);
			label1.setBounds(195, 60, 425, 375);

			//---- textField1 ----
			textField1.setText("S\u00c0N TH\u00d4NG TIN V\u00c0 T\u00ccM KI\u1ebeM CH\u1ee8NG KHO\u00c1N ");
			textField1.setBackground(Color.blue);
			textField1.setForeground(Color.white);
			textField1.setFont(new Font("Times New Roman", Font.BOLD, 26));
			textField1.setHorizontalAlignment(SwingConstants.CENTER);
			dialogPane.add(textField1);
			textField1.setBounds(0, 5, 625, 55);

			//---- button4 ----
			button4.setText("T\u00ccM KI\u1ebeM");
			button4.setBackground(Color.orange);
			button4.setFont(new Font("Times New Roman", Font.BOLD, 14));
			button4.addActionListener(e -> {
			button4ActionPerformed(e);

		});
			dialogPane.add(button4);
			button4.setBounds(0, 350, 190, 56);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < dialogPane.getComponentCount(); i++) {
					Rectangle bounds = dialogPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = dialogPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				dialogPane.setMinimumSize(preferredSize);
				dialogPane.setPreferredSize(preferredSize);
			}
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	public static void main(String[] args) {
		GiaoDien h = new GiaoDien(null);
		h.setVisible(true);
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Trần Đức Long
	private JPanel dialogPane;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel label1;
	private JTextField textField1;
	private JButton button4;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
