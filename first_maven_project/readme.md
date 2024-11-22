- SNAPSHOT -> indica che una libreria (progetto) è ancora in fase di sviluppo quindi potrebbe subire modifiche
- Dependecies -> è la parte che contiene tutte le librerie di cui il nosgtro progetto ha bisogno per funzionare, con grupId cioè il nome del pacchetto, artifactId cioè il nome del progetto, version cioè la versione, poi lo scope cioè indica quando quella librerie deve essere compresa all'interno del pacchetto avviato, ad esempi junit che viene compresa nel pacchetto solo quando il codice è in fase di test

Inversion of control
- Non saremo più noi ad istanziare gli oggetti tramite le new ma sarà il framework a farlo per noi quando ne avremo bisogno

Config
Quando abbiamo una classe con un nome e ne creiamo un'altra con nome <nome della classe>Config verrà inteso dal framework che quella classe contiene tutte le configurazioni utili alla classe con il nome senza "Config" finale

ApplicationContext
- Questa è un'interfaccia che ha come implementazione AnnotationConfigApplicationContext

Patterns
- Singleton -> In memoria esiste un unica istanza di un tipo di oggetto
    - Tutte le volte che richiamo l'oggetto è sempre lo stesso
- Prototype -> In memoria esistono più oggettidi un tipo specifico

In spring framework per gestire i due pattern esistono gli scope:
- scope_signleton
- scope_prototype


STRUTTURA PROGETTO SPRING
- I MODEL -> Sono oggetti che ci cosentono di gestire i dati presenti nelle tabelle dei database
- I REPOSITORY -> Sono le uniche classi che possono avere accesso al database, ci consetiranno di effettuare le query
- I SERVICE -> Sono classi che contengono la logica di business, conterranno tutte le nostre logiche e quando avranno bisogno di dati faranno richiesta ai repository
- I CONTROLLER -> Sono la vera interfaccia web, quella che gestisce la comunicazione con il FE
TUTTO QUESTO E' IL CORE DEL BE


BEST PRACTICE
- Se di una interfaccia esiste una unica implementazione, il nome dell'implementazione deve comprendere la parola "Impl"


SINGLE RESPONSABILITY
-Singola responsabilità -> Un classe si deve occupare di una cosa SOLO E SOLTANTO quella

@Autowired dove metterlo
- direttamente al di sopra delle proprietà
- direttamente al di sompra dei setter della proprietà
- direttamente al di sopra del costruttore se c'è