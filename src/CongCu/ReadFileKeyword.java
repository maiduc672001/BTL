package CongCu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileKeyword {

	public String getLineKeyword(String line, String keyword) {
		if (keyword == null)
			return null;
		else {
			boolean check = true;

			if (!line.toUpperCase().contains(keyword.toUpperCase())) {
				check = false;

			}
			if (check)
				return line;
			return null;
		}
	}

	public String[] getFileKeyword(String keyword) {
		String[] fileKeyWord = new String[1000];
		int countLine = 0;
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Downloads\\Bai Tap Lon\\dulieu\\data.txt"));

			while ((line = br.readLine()) != null) {
				String lineKeyword = getLineKeyword(line, keyword);
				if (lineKeyword != null) {
					for (int i = 0; i < lineKeyword.length(); i++) {
						fileKeyWord[countLine] = lineKeyword;
					}
					countLine++;
				}
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
		return fileKeyWord;
	}



}
