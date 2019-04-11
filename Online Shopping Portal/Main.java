public class Main {
	public static void main(String[] args) {
		Customers c1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
		Customers c2 = new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
		Suppliers s1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
		Suppliers s2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7, "Unpaid",4.35f);
		c1.display();
		c2.display();
		s1.display();
		s2.display();
		c1.editAddress("Coimbatore");
		s1.editAddress("Delhi");
		c1.placeOrder();
		s1.increaseStock(5);
		s2.increaseStock(10);

	}
}
class Users {
	int id;
	String name;
	long no;
	String address;
	public void editAddress(String newAddress) {
		System.out.println(name+", "+address);
		address = newAddress;
		System.out.println(name+", "+address);
	}
	public void display(){
		System.out.println(name+", "+no);
	}
}
class Customers extends Users{
	String dob;
	char gender;
	String history;
	public Customers(int id,String name,long no,String address, String dob,char gender,String history) {
		this.id = id;
		this.name = name;
		this.no = no;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.history = history;
	}
	public void placeOrder() {
		System.out.println("Order placed successfully!");
	}
}
class Suppliers extends Users {
	int stock;
	String payment;
	float feedback;
	public Suppliers(int id,String name,long no,String address,int stock,String payment,float feedback) {
		this.id = id;
		this.name = name;
		this.no = no;
		this.address = address;
		this.stock = stock;
		this.payment = payment;
		this.feedback = feedback;
	}
	public void increaseStock(int newStock) {
		System.out.println(name+", "+(stock+newStock));
	}
}