package ProductCatalog;

public class Product {

	public static void main(String[] args) {
		int pid =Integer.parseInt(args[0]);
		String pname = args[1];
		int qty =Integer.parseInt(args[2]);
		int up =Integer.parseInt(args[3]);
		int stk =Integer.parseInt(args[4]);
		
		System.out.println("Product id :" +pid);
		System.out.println("Product name :" +pname);
		System.out.println("Quantity :" +qty);
		System.out.println("Unit Price :" +up);
		System.out.println("Stock :" +stk);
		if(qty<stk) {
			int tc = qty*up;
			System.out.println("Total Cost :" +tc);
			int rem = stk-qty;
			System.out.println("Remaining Stock :" +rem);
		}
		else {
			System.out.println("Out of Stock");
		}
		
	}

}
