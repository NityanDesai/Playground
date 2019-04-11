class Model1 {
    int cp = 2;
    int d = 5;
    public Model1() {
    	System.out.println("Features of MyModel 1");
        System.out.println("Camera mega pixels: "+cp);
    }
}
class Model2 extends Model1 {
	int cp = 5;
    String lock = "Fingerprint";
    public Model2(){
    	System.out.println("Features of MyModel 2");
    	System.out.println("Camera mega pixels: "+cp);
    	System.out.println("Lock mechanism: "+lock);
    	System.out.println("Display size: "+d);
    }
}
class Model2T extends Model2
{
	int cp = 16;
	int d = 6;
    public Model2T(){
    	System.out.println("Features of MyModel 2T");
    	System.out.println("Camera mega pixels: "+cp);
    	System.out.println("Lock mechanism: "+lock);
    	System.out.println("Display size: "+d);
    } 
}
public class Main 
{
    public static void main(String[] args) 
    {
    	Model2T mobile = new Model2T();
    }
}