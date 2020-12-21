package MauCau;

public class CoPhieu4 extends CoPhieu {

    private double percent = Math.floor(Math.abs(100 * diff / value2)) / 100d;

    public CoPhieu4(ThuocTinh thuocTinh) {
        super(thuocTinh);
    }

    public String choosePercent() {
        String[] list = new String[3];
        list[0] = "(tương đương " + percent + "%)";
        list[1] = "(ứng với " + percent + "%)";
        list[2] = "(" + percent + "%" + ")";
        int a = rd.nextInt(3);
        return list[a];
    }

    @Override
    public String printSentence() {
        return super.printSentence() + " " + choosePercent();
    }

}
