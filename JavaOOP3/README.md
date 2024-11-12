INTERFACCE
- Permettono di definire un insieme di metodi comuni che diverse classi (anche figlie di diversi padri) devono implementare.
- Grazie alle interfacce abbiamo che il nostro codice è coerente e facilita la riutilizzabilità 
- Le interfacce SUPPORTANO il polimorfismo, permettendo a diverse classi di rispondere alle stesse esigenze in diversi modi.

Le interfacce vengono utilizzate per aggiungere funzionalità
Una interfaccia NON PUò avere metodi concreti

Anche se dalla versione 8 di Java e stata aggiunta la possibilità di utilizzare metodi concreti nelle classi chiamati DEFAULT

Una interfaccia:
- non ha attributi
- non ha un costruttore
- possiede SOLO ED ESCLUSIVAMENTE metodi astratti chiamati "firme dei metodi"


Un classe può ESTENDERE una sola classe astratta (o concreta) ma infinite interfacce

Una interfaccia può ereditare da un'altra interfaccia
public interface MoveSet extends Paperino{
    //Eredita solo la firma dei metodi
}