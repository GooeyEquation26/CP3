
public class BAHA extends AHA{
	
	int[] values = new int[10];
	
	public BAHA(int value, int[] values) {
		super(value);
		this.values = values;
	}
	
	public BAHA() {
		// TODO Auto-generated constructor stub
		assignValues();
		
	}
	public void assignValues() {
		values[0] = 10;
		super.value = 6;
	}

	public String toString() {
		String str = super.toString();
			return str;
	}
}
