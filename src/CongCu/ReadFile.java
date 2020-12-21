package CongCu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {
	public static void Read(String a) throws IOException {
		File file = new File(a);
		InputStream inputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader reader;
		reader = new BufferedReader(inputStreamReader);
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

	}

}
