package test;

public class Test {
	public static void main(String[] args){
		String senten="Let it go!Let it go! Cannot hold it back anymore";
		senten=senten.replace("it", "\"her\"");
		senten=senten.replace("Cannot", "Can\'t");
		System.out.println(senten);
	}

}
