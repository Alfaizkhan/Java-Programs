class ThreadDemo extends Thread {
   private String threadName;
   
   ThreadDemo(String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
}