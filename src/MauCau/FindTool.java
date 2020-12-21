package MauCau;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import MauCau.CSVReader;
import MauCau.CoPhieu;

public class FindTool {
	static CSVReader a = new CSVReader("C:\\Users\\ADMIN\\Downloads\\Bai Tap Lon\\dulieu\\datagoc.csv");
	static ArrayList<CoPhieu> lst1 = a.getData();
	static ArrayList<CoPhieu> lst = lst1;

	// constructor
	public FindTool(ArrayList<CoPhieu> lst1) {
		this.lst = lst1;
	}

	public static void printMaxValueStock() {
		double maxValue = 0;
		CoPhieu cpMaxValue = new CoPhieu();
		for (CoPhieu i : lst) {
			if (i.value1 > maxValue) {
				maxValue = i.value1;
				cpMaxValue = i;
			}
		}
		JOptionPane.showMessageDialog(null, "Cố phiếu tăng nhiều nhất:" + cpMaxValue.name);
		// return cpMaxValue;
	}

	public static void printMinValueStock() {
		double minValue = 100;
		CoPhieu cpMinValue = new CoPhieu();
		for (CoPhieu i : lst) {
			if (i.value1 < minValue) {
				minValue = i.value1;
				cpMinValue = i;
			}
		}
		JOptionPane.showMessageDialog(null, "Cố phiếu có giảm nhiều nhất: " + cpMinValue.name);

	}

	public static void printDecStock() {
		JOptionPane.showMessageDialog(null, "Danh sách cổ phiếu giảm giá: ");
		int count1 = 0;
		String a = "";
		for (CoPhieu i : lst) {
			count1++;
			if (i.value1 - i.value2 < 0) {
				a = a + "\n" + count1 + "." + i.name;
			}
		}
		JOptionPane.showMessageDialog(null, a);

	}

	public static void printIncStock() {
		JOptionPane.showMessageDialog(null, "Danh sách cổ phiếu tăng giá: ");
		int count2 = 0;
		String b = "";
		for (CoPhieu i : lst) {
			count2++;
			if (i.value1 - i.value2 > 0) {
				b = b + "\n" + count2 + "." + i.name;
			}
		}
		JOptionPane.showMessageDialog(null, b);

	}

	public static void printMinIncStock() {
		double minValue=100000000;
		String a="";
		CoPhieu minIncStock = new CoPhieu();
		for (CoPhieu i:lst) {
			if (i.value1 - i.value2 >0 && i.value1-i.value2 < minValue ) {
			   minValue = Math.abs(i.value1-i.value2);
			   minIncStock = i;
			}
		}
	   a = "Cố phiếu tăng giá ít nhất: " +  minIncStock.name + 
	       "\nThông tin về cổ phiếu: " + minIncStock.printSentence() ;
	   
	   JOptionPane.showMessageDialog(null, a);
	}
	// Tìm cổ phiếu giảm ít nhất
	public static void printMinDecStock () {
		double minValue = 100000000;
		String b="";
		CoPhieu minDecStock = new CoPhieu();
		for (CoPhieu i : lst) {
			if (i.value1 - i.value2 <0 && i.value1-i.value2 < minValue ) {
				   minValue = Math.abs(i.value1 - i.value2);
				   minDecStock = i;
				}
		}
	    b = "Cố phiếu tăng giá ít nhất: " +  minDecStock.name + 
			"\nThông tin về cổ phiếu: " + minDecStock.printSentence() ;
	   JOptionPane.showMessageDialog(null, b);
	}
	
	//phương thức Sinh Câu từ file
	public static void getSentenceList() {
		String prt1="";
		int index =0;
		for (CoPhieu i: lst) {
			index++;
			prt1+="\n"+ index +". " + i.printSentence();
		}
		
		System.out.println(prt1);
	}
}
