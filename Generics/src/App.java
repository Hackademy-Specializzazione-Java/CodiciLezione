public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        GenericClass<String> stringa = new GenericClass<String>("Il parametro è davvero generico");
        System.out.println(stringa.getData());

        GenericClass<Integer> intero = new GenericClass<Integer>(3);
        System.out.println(intero.getData());

        NewGenericClass ng = new NewGenericClass();

        ng.<String>print("Ciao");
        ng.<Integer>print(3);

    }
}
