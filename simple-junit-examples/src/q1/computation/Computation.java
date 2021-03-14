package q1.computation;

public class Computation {

	public Computation() {
		try {
         UtilProp.loadProperty();
      } catch (Exception e) {
         e.printStackTrace();
      }
	}
	
	public int getDiscount(int id, int rate) {
		return getDiscountByID(id) + getDiscountByRate(rate);
	}

	private int getDiscountByID(int id) {
		int ret = Integer.valueOf(UtilProp.getProp(String.valueOf(id)));
		System.out.println("By ID:" + id + ", RET: " + ret);
		return ret;
	}

	private int getDiscountByRate(int rate) {
		int ret = Integer.valueOf(UtilProp.getProp(String.valueOf(rate)));
		System.out.println("Rate: " + rate + ", RET: " + ret);
		return ret;
	}
}
