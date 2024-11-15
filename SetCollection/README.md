Set (Insieme)
- E' una struttura dati che non ammette duplicati
- Set però è sempre un'interfaccia
- Set è una struttura dati immutabile, una volta inseriti i dati non en possiamo aggiungere di nuovi

Le sue implementazioni
- HashSet
    - Controlla l'esistenza dei duplicati in base ad una tabella chiamata Hash
    - Se nella tabella avvengono quelle che sono chiamate collisioni allora un dato è duplicato
    - è ottimizzata per gestire un grande numero di elementi
    - ma anche è ottimizzata per la ricerca
- TreeSet
    - E' ottimizzato solo per la ricerca perchè mantiene l'ordine naturale degli elementi
    - Per l'ordinamento utilizza o un ordinamento naturale oppure un ordinamento basato su un comparatore

Mentre Set ed HashSet fanno capo ai metodi equals e hashCode
TreeSet utilizza per l'ordinamento e il controllo di duplicati anche un comparatore
Per la scelta ricordiamoci di avere come arma il comparator
