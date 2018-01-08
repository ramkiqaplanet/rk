package p1;

public class A {

		int x=15;
		void show(){
			int y=20;
			System.out.println(y);
		}
		public static void main(String[] args) {
			int z=30;
			A p=new A();
		p.show();
			System.out.println(z);
			System.out.println(new A().x);
			System.out.println();
			
		}
}
