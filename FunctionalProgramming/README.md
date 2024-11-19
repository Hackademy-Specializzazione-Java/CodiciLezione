- Programmazione imperativa
    - Diamo al programma tutte le istruzioni, passo dopo passo, per eseguire un algoritmo DETTAGLIANDO come raggiungere il risultato

    numbers = [1,2,3,4,5];
    Integer[] result = [];
    for(Integer n : numbers){
        if(n % 2 == 0){
            result.add(n);
        } 
    }

- Programmazione dichiarativa

    - Indichiamo al programma cosa vogliamo ottenere, NON IL COME. Sarà il programma a manipolare indati secondo delle logiche contenute in delle funzioni esistenti.

    SQL: select * from books;

    - con questo approccio si tende ad astrarre il dato ricevuto, non lavorando mai direttamente sul dato stesso, ma esegunedo quelle che vengono chiamate funzioni pure.

    - le funzioni pure non hanno side effect, non modificano lo stato di una entità presente all'interno della memoria

    function somma(num1, num2) {console.log(num1+num2)} 
    Funzione pura?????????? NO modifica lo stato della console

    function somma(num1, num2) {return num1+num2}
    Funzione pura? SI non modifca lo stato di niente

PROGRAMMAZIONE FUNZIONALE
- Nel programmazione funzionale andremo ad usare ma analizzare l'approccio dichiarativo
NOTA: Non sempre riusciremo a risolvere tutti i problemi con questo approccio

- Si tende ad utilizzare quanto più possibile le funzioni pure se causare il cambio di stato
- E' molto utile mantenere lo stato iniziale soprattuto per quella che viene chiamata programmazione concorrenziale
- Prendiamo uno stato, lo ellaboriamo e restituiamo un nuovo valore senza modificare lo stato iniziale

LAMBDA EXPRESSION
- Introdotte in java a partire dalla verisone 8
- Una lambda expression è una funzione anonima che prende in input un dato lo elabora e restituisce qualcosa senza manipolare lo stato originale del dato stesso

el -> el * 2;
parameter -> expression(predicate);

prende un el e lo moltiplica per 2.

a -> a * 2; //type inference
(int a) -> a * 2; //static typing

//Con più righe di codice
a -> {
    ...code
    return //OBBLIGATORIA
}

Ma anche con più parametri
(parameter1, parameter2) -> {
    ...code
    return something;
}

nelle due casistiche precedenti la return è d'obbligo


STREAM
- E' un flusso di dati
- Nastro traportatore
- Stiamo dicendo allo stream di prendere dalla lista un elemento alla volta e farci qualcosa
- Lo stream è apllicabile a qualsiasi collection
- Ma non è applicabile alle MAP

Programmazione funzionale
- Si basa tutta su lambda expression
- Le funzioni sono first class value (first class citizens), le funzioni possono essere trattate come qualsiasi altro tipo di dato
    Caratteristiche:
    - Assagnate a variabili (la variabile chiama la funzione non il suo risultato)
    - Passate come argomenti di altre funzioni (es callback)
    - Restituite da altre funzioni
    - Inserite in strutture dati (nella struttura dati ci finisce il risultato della funzione)