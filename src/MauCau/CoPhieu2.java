package MauCau;

public class CoPhieu2 extends CoPhieu{

    public CoPhieu2(ThuocTinh thuocTinh) {
        super(thuocTinh);
    }

    @Override
    public String printSentence() {
        String[] list = new String[4];
        list[0] = "Từ mức giá " + value1 + " triệu đồng, " + chooseSymbol2() + " " + comparisonResult() + ", " + valuationResult();
        list[1] = "Từ " + value1 + " triệu đồng, " + chooseSymbol2() + " " + valuationResult() + ", " + comparisonResult();
        list[2] = chooseSymbol() + " " + valuationResult() + ", " + comparisonResult() + " từ mức giá " + value1 + " triệu đồng.";
        list[3] = chooseSymbol() + " " + valuationResult() + ", " + comparisonResult() + " từ " + value1 + " triệu đồng.";
        int a = rd.nextInt(list.length);
        return list[a];
    }
}
