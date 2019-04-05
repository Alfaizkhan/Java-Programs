package allinOne;


public class Stringconcepts {

		public static void main(String[] args) {
		    String S1 = new String("AlFAIZKHAN PATHAN");  //String Object
		    StringBuilder stringbuilder = new StringBuilder("JAVA DEVELOPER");
		    StringBuffer stringBuffer = new StringBuffer("Hello World");
		    
		    Object obj= new String("ALFAIZKHAN PATHAN");

		    System.out.println("Length of String :" +S1.length());
		    
		    
		    System.out.println("StringBuilder length = "+stringbuilder.length()); 
		    System.out.println("StringBuilder capacity = "+stringbuilder.capacity()); 
		    System.out.println("StringBuilder Insert = "+stringbuilder.insert(5,"Intern "));
		    
		    System.out.println("Buffer Lenght = " +stringBuffer.length());
		    System.out.println("Buffer Capcity = " +stringBuffer.capacity());
		    
		    System.out.println("Equals:" +obj.equals(S1));
		    System.out.println("Get class:" +obj.getClass());
		    
		    }
		
}


