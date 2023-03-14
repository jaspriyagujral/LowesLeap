package EmpDetails;

public class Emp {

	public static void main(String[] args) {
		int eid =Integer.parseInt(args[0]);
		String ename = args[1];
		int basic =Integer.parseInt(args[2]);
		int hra = 12*basic/100;
		int ta = 8*basic/100;
		int da = 9*basic/100;
		int gross = hra+ta+da+basic;
		System.out.println("Employee id :" +eid);
		System.out.println("Employee name :" +ename);
		System.out.println("hra :"+hra);
		System.out.println("ta :"+ta);
		System.out.println("da :"+da);
		System.out.println("gross :"+gross);
		if(gross>=25000) {
			System.out.println("A");
		}
		else if(gross>= 10000 && gross<25000) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
				
	}

}
