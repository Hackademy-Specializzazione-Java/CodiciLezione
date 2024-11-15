Array
- Collezione di elementi dello stesso tipo, ordinati quindi organizzati in una sequenza indicizzata
- posizione 0 + offset*indice (offset = spostamento)

Collection (collection framework)
- Collezione di dati
- Sono delle struutre dati che ci permettono di gestire un insieme di elementi

Metodi delle collection
- add -> aggiunge un dato
    public boolean add(Object o);
- addAll -> aggiunge una mole di dati tutta insieme
    public boolean addAll(Object o);
- clear -> svuota la collection
    public void clear();
- contains -> verifica se il dato è presente nella collection
    public boolean contains(Collection c);
- containsAll -> verifica se più dati sono presenti nella collection
    public boolean containsAll(Collection c);
- isEmpty() -> verifica se la collection è vuota
    public boolean isEmpty();
- remove -> rimuove un dato dalla collection
    public boolean remove(Object o);
- removeAll -> rimuove più dati dalla collection
    public boolean removeAll(Collection c);
- size -> restituisce la lunghezza della collectin
    public int size();
- toArray -> trasforma una collection in array
    public Object[] toArray();

List
- Lista di elementi
- List è un modo di gestire gli elementi in realtà caratterizza il modo di gestirli in memoria
- Gli elementi di una lista vengono sempre caratterizzati da un indice
- List essendo una interfaccia (che ricordiamo detta le regole) le sue implementazioni (che applicano le regole) sono:
    - ArrayList
    - LinkedList

(spoiler sono le più utilizzate)

ArrayList
- Implementazione dell'interfaccia List
- Gli oggetti vengono memorizzati in locazioni contigue in memoria
- Le operazioni di ricerca sono molto lente
- Le operazioni di scrittura sono veloci
- Un array list però ha un importante limite, in memoria se non esistono locazioni contigue per un nuovo elemento, verrà copiato l'intero array, spostato poi in una nuova locazione di memoria dove è possibile manetere l'ordine di locazioni contigue, il vecchio array list poi verrà cancellato liberando la memoria precedentemente occupata

Le collection implementano unainterfaccia chiamata iterable, vuol dire che tutte le collection sono iterabili (ciclabili)

iteratore possiede due metodi 
- hasNext() -> restotuisce un booleano risultato del controllo se l'elemento ha un successivo o meno
- next() -> restituise l'elemento successivo che per quanto riguarda l'inizio della collection corrisponde al primo

LinkedList
- Ha le setsse regole dell'ArrayList 
- la differenza principale è sull'utilizzo della memoria
- in una linked list gli oggetti non bengono memorizzati in locazioni contigue ma sono sparsi in giro per la memoria

addFirst() -> aggiunge un elemento in testa
addLast() -> aggiunge un elemento in coda
removeFirst() -> rimuove un elemento in testa
removeLast() -> rimuove un elemento in coda
getFirst() -> ritorna il primo elemento
getLast() -> ritorna l'ultimo elemento

per poter aggiungere un elemento al centro di una linkedList possiamo utilizzare la add(index, Object o);




