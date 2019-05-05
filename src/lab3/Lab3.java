package lab3;

import org.jpl7.*;

/**
 *
 * @author Danny Rojas Arguedas
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Query q1
                = new Query(
                        "consult",
                        new Term[]{new Atom("test.pl")}
                );
        System.out.println("consult " + (q1.hasSolution() ? "succeeded" : "failed"));
        Query q2
                = new Query(
                        "child_of",
                        new Term[]{new Atom("joe"), new Atom("mary")}
                );
        System.out.println(
                "child_of(joe,mary) is "
                + (q2.hasSolution() ? "provable" : "not provable")
        );
        Query q3
                = new Query(
                        "descendent_of",
                        new Term[]{new Atom("steve"), new Atom("ralf")}
                );
        System.out.println(
                "descendent_of(joe,ralf) is "
                + (q3.hasSolution() ? "provable" : "not provable")
        );
    }

}
