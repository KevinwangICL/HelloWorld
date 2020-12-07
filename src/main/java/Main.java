public class Main {
    public static void main(String[] args){
        System.out.println("Good Morning, Universe!");

        for (int i=1; i < 10; i++){
            System.out.println(i);
        }
        int s = 0;
        for (int c=30; c<40; c++){
            s = s + c;
        }
        sum_storage S1 = new sum_storage(s);
        int output = S1.getSs();
        System.out.println(output);
    }
}
