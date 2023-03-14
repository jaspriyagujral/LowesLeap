public class Priority extends Thread{
    public static void main(String[] args){
        Priority a = new Priority();
        a.setPriority(MAX_PRIORITY);
        a.setName("Thread_name");
        System.out.println(a.getPriority());
        System.out.println(a.getName());
    }
}