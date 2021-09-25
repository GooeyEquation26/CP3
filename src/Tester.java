
public class Tester {
	public static void main(String[] args) {
		
		var a  = new AHA();
		a.modify();
		for (int i = 0; i < 5; ++i) {
			var aa = new AHA(i);
			System.out.println(aa);
		}
		var b = new BAHA();
		System.out.println(b);
		
		int[] ark = {1, 2, 3};
		var c = new CAHA(1, ark, "STEVE JOBS");
	}
}
