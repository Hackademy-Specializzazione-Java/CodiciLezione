import java.util.Scanner;

public class HelloWorld{
    //punto di entrata di un file java
    //visibilita = public
    //tipologia di funzione = static
    //tipo di ritorno della funzione = void , vuol dire che questa funzione non restituirà alcun tipo di dato ma eseguirà solo delle azioni
    //In Java abbiamo l'obbligo di definire il tipo di ritorno della funzione
    //nome della funzione = main, e si deve chiamare cosi
    //La funzione main deve possedere un parametro chiamato args che nn è altro che un array di stringhe
    public static void main(String[] args){
        //Stampa in console di una string
        //System = viene chiamata una classe di sistema del linguaggio java
        //della classe di sistema viene chiamato il metodo out
        //dal sistema di out prendi il print line, cioè stampa la scritta
        // System.out.println("Hello world");//statement o comando

        // String c = "a";

        // System.out.println(c);

        // CASTING ESPLICITO
        // double numeroDouble = 5.67;
        // int numeroIntero = (int) numeroDouble; // Casting esplicito da double a int

        //!CONVERSIONI DI TIPO
        // byte b = 19;
        // short x = (short) b;
        // int i = (int) x;
        // long l = (long) i;
        // double d = (double) l;

        // float f = 1.77f;
        // double dd = (double) f;
        
        // char c = 'c';
        // int cc = (int) c;

        // System.out.println(cc);

        // System.out.println(numeroIntero);

        // CASTING IMPLICITO
        // int numeroIntero = 42;
        // double numeroDouble = numeroIntero; // Casting implicito da int a double
        
        // Casting tra tipi incompatibili
        // String testo = "123";
        // int numero = Integer.parseInt(testo); // Conversione da stringa a int
        // int numero = testo;

        // System.out.println(numero);
        
        // Type inference
        // //!TYPE INFERENCE
        // var score = 0; // int di default
        // var hello = "hello world";

        // System.out.println(hello);

        // "hello world".isEmpty();

        // String hello2 = "hello world";

        // String hello = new String("Hello world");

        // String name = "   Alek   ";

        // boolean result = name.equals("Alekko");

        // System.out.println(name.trim());

        //CONCATENAZIONE DI STRINGHE
        // System.out.println("Ciao bello"+" sono io");

        // String name1 = "primoNome";

        // name1 = "secondoNome";

        // name1 = "terzoNome";

        // name1 = "quartoNome";

        // name1 = "quintoNome";

        // int[] array1 = new int[5];

        //int[] array2 = {1,2,3,4,5};

        // array2[0] = 1;
        // array2[1] = 45;
        // array2[2] = 32;
        // array2[3] = 21;
        // array2[4] = 15;
        // array2[5] = 78;

        //Input da tastiera
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Inserisci una string:");
        // String input = scanner.nextLine();
        // // Integer input = scanner.nexInt();
        // System.out.println("Hai inserito "+ input);

        // //Inserite qui le operazioni

        // scanner.close();

        //Input da comando
        //System.out.println(args[2]);

        }
}