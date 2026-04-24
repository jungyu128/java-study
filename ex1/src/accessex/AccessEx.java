package accessex;


class Sample{
	public int a;
	private int b;
	int c;
	void sampleE() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class AccessEx {
public static void main(String[] args) {
	Sample sample = new Sample();
	sample.a = 10;
	//sample.b = 10; //b는 private는 내 클래스가되서 다른데서 못가져다쓴다.
	sample.c = 10;
	sample.sampleE();
}
}
 