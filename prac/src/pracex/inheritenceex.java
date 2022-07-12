package pracex;

public class inheritenceex extends helpinheritance {
//	static int i=20;
//			i=super.i;
 void ex(int i) {
	System.out.println(this.i);
}
	public static void main(String[] args) {
		inheritenceex obj=new  inheritenceex (); 
		obj.ex(10);
	}

}
