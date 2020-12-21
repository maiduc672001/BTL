package MauCau;

import org.apache.commons.lang3.StringUtils;

import TagList.Constant;

public class CoPhieu7 extends CoPhieu {

	public CoPhieu7(ThuocTinh thuocTinh) {
		super(thuocTinh);
	}

	@Override
	public String printSentence() {
		StringBuffer tag = new StringBuffer();
		if (StringUtils.isNoneEmpty(super.time)) {
			tag.append(chooseTime());
		}
		tag.append(chooseSymbol() + " ");
		if (diff > 0) {
			tag.append(Constant.increaseTag[rd.nextInt(Constant.increaseTag.length)] + " ");
		} else {
			tag.append(Constant.decreaseTag[rd.nextInt(Constant.decreaseTag.length)] + " ");
		}
		String mauCau[] = { "từ " + this.value1 + " triệu đồng lên " + this.value2 + " triệu đồng",
				diff + " triệu đồng" };

		tag.append(mauCau[rd.nextInt(mauCau.length)]);

		return tag.toString();
	}
}
