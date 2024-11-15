import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        // String[] names = {"Mario","Vito","Giuseppe"};

        // System.out.println(names[2]);

        //ArrayList<Person> list = new ArrayList<Person>();
        List<Person> list = new ArrayList<Person>();

        // if(list.add(new Person("Mario","Fiorelli", 25))){
        //     System.out.println("Oggetto inserito correttamente");
        // }else{
        //     System.out.println("Magarrrrrrrr");
        // }
        //- 1
        list.add(new Person("Mario","Fiorelli", 25));
        list.add(new Person("Vito","Campobasso", 21));
        list.add(new Person("Christian","D'agostino", 28));
        list.add(new Person("Mario","Fiorelli", 25));

        // for (int i = 0; i < list.size(); i++) {
        //     Person p = list.get(i);
        //     System.out.println(p);
        // }

        //dichiarazione dell'iteratore
        // Iterator<Person> it = list.iterator();

        //Verranno stamati elementi risultato di next() finchè hasNext restituisce true
        // while(it.hasNext()) {  
        //     Person p = it.next();  
        //     System.out.println(p);  
        // }
        
        //oppure
        // System.out.println("Prima della modifica");
        // for(Person p : list){
        //     System.out.println(p);  
        // }

        // list.set(1, new Person("Pippo","Pipponi", 23));

        // System.out.println("Dopo la modifica");
        // for(Person p : list){
        //     System.out.println(p);  
        // }

        list.remove(list.get(0));

        System.out.println("Dopo la cancellazione");
        for(Person p : list){
            System.out.println(p);  
        }


    }
}
