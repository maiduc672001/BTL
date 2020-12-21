package MauCau;

public class CoPhieu3 extends CoPhieu {

	public CoPhieu3(ThuocTinh thuocTinh) {
		super(thuocTinh);
	}

	@Override
	public String printSentence() {
		String[] list = new String[4];
		list[0] = chooseTime() + " " + choosePlace() + " " + chooseSymbol() + " " + comparisonResult() + ", "
				+ valuationResult();
		list[1] = chooseTime() + " " + choosePlace() + " " + chooseSymbol() + " " + valuationResult() + ", "
				+ comparisonResult();
		list[2] = choosePlace() + " " + chooseSymbol() + " " + valuationResult() + ", " + comparisonResult() + " "
				+ chooseTime2();
		list[3] = choosePlace() + " " + chooseSymbol() + " " + comparisonResult() + ", " + valuationResult() + " "
				+ chooseTime2();
		int a = rd.nextInt(list.length);
		return list[a];
	}
}
