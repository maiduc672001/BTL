/*
 * Created by JFormDesigner on Thu Jun 11 13:47:47 ICT 2020
 */

package GiaoDien;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Trần Đức Long
 */
public class GiaoDien6 extends JFrame {
	public GiaoDien6() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Trần Đức Long
		scrollPane2 = new JScrollPane();
		textArea1 = new JTextArea();
		scrollPane3 = new JScrollPane();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== scrollPane2 ========
		{

			//---- textArea1 ----
			textArea1.setText("Text");
			textArea1.setFont(new Font("Times New Roman", Font.BOLD, 12));
			scrollPane2.setViewportView(textArea1);
			String w = "";
			for (String x : GiaoDien5.button1ActionPerformed()) {
				if(x != null) {
				w = w +"\n" + x;
			}
			}
			textArea1.setText(w);
		}
		contentPane.add(scrollPane2);
		scrollPane2.setBounds(5, 10, 955, 410);
		contentPane.add(scrollPane3);
		scrollPane3.setBounds(0, 0, 965, 425);

		{
			// compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Trần Đức Long
	private JScrollPane scrollPane2;
	private JTextArea textArea1;
	private JScrollPane scrollPane3;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
