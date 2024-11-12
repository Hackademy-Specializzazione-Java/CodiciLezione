public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int i = 0;

        Integer j = null;

        //Boxing
        //Integer k = (Integer) i;
        Integer k = i;


        //Unboxing
        int y = j;

        System.out.println(k);

        int number = 53;

        Integer box = Integer.valueOf(number);

        // Integer v = y;
        // if(v.equals(null)){
        //     System.out.println("Che vuoi da me????");
        // }else{
        //     System.out.println(v);
        // }
        

    }
}
