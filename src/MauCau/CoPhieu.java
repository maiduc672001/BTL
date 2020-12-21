package MauCau;

import java.util.Random;

import TagList.Constant;


public class CoPhieu {

    protected String name;
    protected double value1;
    protected double value2;
    protected double diff;
    protected String time;
    protected String location;

    protected Random rd = new Random();

    public CoPhieu(ThuocTinh thuocTinh) {
        this.name = thuocTinh.getName();
        this.value1 = thuocTinh.getValue1();
        this.value2 = thuocTinh.getValue2();
        this.diff = Math.floor((thuocTinh.getValue2() - thuocTinh.getValue1())*100) / 100d;
        this.time = thuocTinh.getTime();
        this.location = thuocTinh.getLocation();
    }

    public CoPhieu() {
		// TODO Auto-generated constructor stub
	}

	public String chooseSymbol() {
        int a = rd.nextInt(Constant.symbolTag.length);
        return Constant.symbolTag[a] + " " + name;
    }

    public String chooseSymbol2() {
        int a = rd.nextInt(Constant.symbolTag2.length);
        return Constant.symbolTag2[a] + " " + name;
    }

    public String choosePlace() {
        int a = rd.nextInt(Constant.placeTag.length);
        return Constant.placeTag[a] + " " + name;
    }

    public String chooseTime() {
        int a = rd.nextInt(Constant.timeTag.length);
        return Constant.timeTag[a] + " " + time +", ";
    }

    public String chooseTime2() {
        int a = rd.nextInt(Constant.timeTag2.length);
        return Constant.timeTag2[a] + " " + time +".";
    }

    public String comparisonResult() {
        if (diff > 0) {
            int a = rd.nextInt(Constant.increaseTag.length);
			return Constant.increaseTag[a] + " " + diff + " triệu đồng";
        } else {
            int a = rd.nextInt(Constant.decreaseTag.length);
            return Constant.decreaseTag[a] + " " + diff + " triệu đồng";
        }
    }

    public String valuationResult() {
        if (diff > 0) {
            int a = rd.nextInt(Constant.increaseResultTag.length);
            return Constant.increaseResultTag[a] + " " + value2 + " triệu đồng";
        } else {
            int a = rd.nextInt(Constant.decreaseResultTag.length);
            return Constant.decreaseResultTag[a] + " " + value2 + " triệu đồng";
        }
    }

    public String printSentence() {
        String[] list = new String[2];
        list[0] = chooseSymbol2() + " " + comparisonResult() + ", " + valuationResult() + ".";
        list[1] = chooseSymbol2() + " " + valuationResult() + ", " + comparisonResult() + ".";
        int a = rd.nextInt(list.length);
        return list[a];
    }
}
