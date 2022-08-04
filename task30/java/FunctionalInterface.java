package packager.corejava.task30.java;

 interface Sayable  {
public void Say(String msg); 
	
}
 class FunctionalInterface implements Sayable{


	public void Say(String msg) {
		System.out.println(msg);
		
	}
 
	public static void main(String[] args) {
		FunctionalInterface q=new FunctionalInterface();
		q.Say("hello");
	}
 }
