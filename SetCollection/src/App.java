import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Set<Pointer3D> points = Set.of(
        //     new Pointer3D(10,10,5),
        //     new Pointer3D(10,10,5),
        //     new Pointer3D(20,10,5),
        //     new Pointer3D(30,10,5),
        //     new Pointer3D(40,10,5)
        // );

        //points.add( new Pointer3D(0,0,0));

        // System.out.println( new Pointer3D(10,10,5).hashCode());
        // System.out.println( new Pointer3D(10,10,5).hashCode());

        //HashSet
        // Set<Pointer3D> points = new HashSet<Pointer3D>(
        //     //of() metodo statico della classe Set
        //     Set.of(new Pointer3D(10,10,5),
        //     new Pointer3D(20,10,5),
        //     new Pointer3D(30,10,5),
        //     new Pointer3D(40,10,5)
        //     )
        // );

        // points.add( new Pointer3D(0,0,0));


        //TreeSet
        Set<Pointer3D> points = new TreeSet<Pointer3D>(
            //of() metodo statico della classe Set
            Set.of(new Pointer3D(10,10,5),
            new Pointer3D(20,10,5),
            new Pointer3D(30,10,5),
            new Pointer3D(40,10,5)
            )
        );

        points.add( new Pointer3D(0,0,0));
    }
}
