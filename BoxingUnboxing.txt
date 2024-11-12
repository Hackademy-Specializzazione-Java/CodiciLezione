Boxing unboxig
- Quando utilizzarlo:
    - sappiamo che un tipo primitivo non è un oggetto
    - int non sta istanziando un nuovo oggetto
    - int i = 0;
    - In java abbiamo bisogno di gestire casi in cui un dato può essere nullo o addirittura compiere delle operazioni su questo dato:
      - Per questo motivo sono state create le classi Wrapper:
        int -> Integer
        wrappare vuo dire adattare (trasformare)
        Integer è una classe quindi possiede attributi, costruttori e metodi

Classe wrapper Integer esempio

public class Integer{
    private int value;
    
    public Integer(int i){
        this.value = i;
    }

    //metodi di classe
    //getter e setter
}

Boxing
int -> Integer

Unboxing
Integer -> int