
public class AHA {
	protected int value;
	
	private static int counter = 1_000;
	
	public AHA(int value) {
		this.value = value;
		++counter;
	}
	public AHA() {
		this(50);
	}
	
	public void modify() {
		value += 1000;
	}
	
	@Override
	public String toString() {
		String str  = "A [value =" + value + "]"
				+ " counter " + counter;
		return str;
	}
}
