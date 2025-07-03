package demo8;


public class scopedemo8{
	static int classVar=10;
	int instanceVar=20;
	public void method() {
		int methodVar=30;
		if(true) {
			int blockVar=40;
			System.out.println(blockVar);
		}
		System.out.println(methodVar);
	}
	public static void main(String[] args) {
		System.out.println(classVar);
		scopeDemo obj=new scopeDemo();
		System.out.println(obj.instanceVar);
		obj.method();
	}

}
