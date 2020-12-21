package MauCau;

public class CoPhieu5 extends CoPhieu {

    public CoPhieu5(ThuocTinh thuocTinh) {
        super(thuocTinh);
    }

    @Override
    public String printSentence() {
        int i = rd.nextInt(4);
        switch (i) {
            case 0:
                return chooseTime() + " " + choosePlace() + " " + chooseSymbol() + " " + valuationResult();
            case 1:
                return choosePlace() + " " + chooseTime() + " " + chooseSymbol() + " " + valuationResult();
            case 2:
                return chooseSymbol() + " " + choosePlace() + " " + chooseTime() + " " + valuationResult();
            case 3:
                return chooseSymbol() + " " + valuationResult() + " " + chooseTime() + " " + choosePlace();
            default:
                return "";
        }
    }
}
