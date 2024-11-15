import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        int ageOfBob = map.get("Bob");
        System.out.println("L'età di Bob è: " + ageOfBob);

        if (map.containsKey("Alice")) {
            System.out.println("La mappa contiene la chiave 'Alice'.");
        }

        map.remove("Charlie");
        System.out.println("Contenuto della mappa dopo la rimozione: " + map);

        //Per la mappa per recuperare tutti i valori si utilizza il metodo entrySet()
        //Per il singolo elemento si utilizza un oggetto particolare chiamato Entry che fa parte della famiglia Map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
    }
}
