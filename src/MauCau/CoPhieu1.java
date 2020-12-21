package MauCau;

public class CoPhieu1 extends CoPhieu {

	public CoPhieu1(ThuocTinh thuocTinh) {
		super(thuocTinh);
	}

	@Override
    public String printSentence() {
    	String[] list = new String[3];
    	list[0] = chooseTime() + chooseSymbol2() + " " + comparisonResult() + ", " + valuationResult();
    	list[1] = chooseTime() + chooseSymbol2() + " " + valuationResult() + ", " + comparisonResult();
    	list[2] = super.printSentence() + chooseTime2();
    	
    	int a = rd.nextInt(list.length);
    	return list[a];

    }
	
}
