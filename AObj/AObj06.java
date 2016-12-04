package AObj;
public class AObj06 {
	static String c = new String("aoeu");
	static int storage(String s) {
		return s.length() * 2;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = AObj06.storage(c);
		System.out.println("2*len(y)="+y);
	}
}
