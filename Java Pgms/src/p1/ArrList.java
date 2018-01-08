package p1;

import java.util.ArrayList;

public class ArrList {

		public static void main(String[] args) {
			
				ArrayList<Integer> al=new ArrayList<Integer>();
				al.add(10);
				al.add(20);
				al.add(30);
				al.add(40);
				al.add(50);
				al.add(60);
				for (Integer Rk : al) {
					//System.out.println(Rk.equals(40));
					//System.out.println(al.size());
					if(Rk==40){
						System.out.println(Rk.longValue());
					}
				}
				
		}
}
