public class MultiThreadThing implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+" "+Thread.currentThread().threadId());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
            }
        }
    public static void main(String[] args) {
     
            MultiThreadThing thing = new MultiThreadThing();
            Thread t = new Thread(thing);
            t.start();

    }
}
