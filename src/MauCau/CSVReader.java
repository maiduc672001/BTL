package MauCau;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
		private static final String COMMA_DELIMITER = ",";
		String fileLocation;
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		
		public CSVReader( String str) {
			this.fileLocation=str;
		}
		 
		public static double stringToDouble(String str) {
			while (str.indexOf(" ") != -1) str = str.replaceAll(" ","");
			while (str.indexOf("\"") != -1) str = str.replaceAll("\"","");
			if (str.equals("")) return 0.0; else 
			return Double.parseDouble(str);
		}
		
		 // Phân tích 1 dòng
		public static List<String> parseLine(String Line){
			 List<String> result = new ArrayList<String>();
		        if (Line != null) {
		            String[] splitData = Line.split(COMMA_DELIMITER);
		            for (int i = 0; i < splitData.length; i++) {
		                result.add(splitData[i]);
		            }
		        }
		        return result;
		 }
		
		 //addStock trả về một đối tượng CoPhieu, cụ thể là một dòng trong file. csv
		
		public static CoPhieu addStock(List<String> stock) {
				
			 	CoPhieu sc1 = new CoPhieu();
				
				sc1.time= stock.get(0);
				sc1.name= stock.get(1);
				sc1.value1= stringToDouble(stock.get(2));
				sc1.value2= stringToDouble(stock.get(3));
				sc1.diff= sc1.value1 - sc1.value2;

				return sc1;
			}
			
		public String getFileLocation() {
			 	System.out.println(" INPUT FILE LOCATION, E.G: D:\\DATA.csv ");
			 	fileLocation = sc.nextLine();
			 	return fileLocation;
		 }
	
	    public ArrayList<CoPhieu> getData(){ 	
			ArrayList<CoPhieu> CPList= new ArrayList<CoPhieu>();
//test:		System.out.println("Danh sách mảng cổ phiếu sau khi phân tích file: ");
	    	
// 			Tách file theo từng dòng kết hợp xử lí ngoại lệ, trả về một List đối tượng cổ phiếu 
			try {
	            String line;
	            br = new BufferedReader(new FileReader(fileLocation));
	 
	            // How to read file in java line by line?
	            while ((line = br.readLine()) != null) {	            	
	            	CPList.add( addStock(parseLine(line)) );
             	}
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	        
	        	try {
	                if (br != null)
	                    br.close();
	            } catch (IOException crunchifyException) {
	                crunchifyException.printStackTrace();
	            }
	        }
		  return CPList;
	    }  
}

