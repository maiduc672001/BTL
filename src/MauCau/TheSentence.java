package MauCau;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.*;

public class TheSentence {

    Random random = new Random();

    public String chooseCoPhieu(ThuocTinh  thuocTinh){
        int i = random.nextInt(6);
        switch (i){
            case 1:
                return new CoPhieu1(thuocTinh).printSentence();
            case 2:
                return new CoPhieu2(thuocTinh).printSentence();
            case 3:
                return new CoPhieu3(thuocTinh).printSentence();
            case 4:
                return new CoPhieu4(thuocTinh).printSentence();
            case 5:
                return new CoPhieu5(thuocTinh).printSentence();
            case 0:
                return new CoPhieu7(thuocTinh).printSentence();
            default:
                return "";
        }
    }

    public static String generateSentence() {
        List<ThuocTinh> list = new TheSentence().readCsvToModel();
        StringBuffer stringBuffer = new StringBuffer();
        for (ThuocTinh thuocTinh : list){
            stringBuffer.append(new TheSentence().chooseCoPhieu(thuocTinh) + "\n");
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ADMIN\\Downloads\\Bai Tap Lon\\dulieu\\data.txt", true));
            bw.write(stringBuffer.toString());
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public List<ThuocTinh> readCsvToModel(){
        BufferedReader br = null;
        List<ThuocTinh> listThuocTinh = new ArrayList<ThuocTinh>();
        try {
            String line;
            br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Downloads\\Bai Tap Lon\\dulieu\\datagoc.csv"));

            // Đọc từng dòng trong csv và chuyển về model
            while ((line = br.readLine()) != null) {
                List<String> list = parseCsvLine(line);
                ThuocTinh thuocTinh = new ThuocTinh();
                thuocTinh.setName(list.get(1));
                thuocTinh.setValue1(Double.parseDouble(list.get(2)));
                thuocTinh.setValue2(Double.parseDouble(list.get(3)));
                thuocTinh.setLocation("Hà Nội");
                thuocTinh.setTime(list.get(0));
                listThuocTinh.add(thuocTinh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return listThuocTinh;
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(new TheSentence().generateSentence());
    }

}

