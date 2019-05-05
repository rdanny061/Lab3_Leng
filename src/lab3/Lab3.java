package lab3;

import java.util.HashMap;
import org.jpl7.*;

/**
 *
 * @author Danny Rojas Arguedas
 */
public class Lab3 {
    public String[] consulta(String Origen, String Destino, String Escalas) {
        Query consulta
                = new Query(
                        "consult",
                        new Term[]{new Atom("test.pl")}
                );
        System.out.println("consult " + (consulta.hasSolution() ? "succeeded" : "failed"));
        Query consultaMejorRuta = new Query("mainMethod("+Origen+","+Destino+",["+Escalas+"],MejorRuta).");
        if (!consultaMejorRuta.hasSolution()) {
            return null;
        }
        HashMap solucion = (HashMap) consultaMejorRuta.oneSolution();
        String h = solucion.toString();
        h = h.replace("'[|]'(", " ").
                replace(", '[]'", " ").
                replace("{MejorRuta= ", "").
                replace("}", "").
                replace(")", "");
        String[] ruta;
        ruta = h.split(",");
        return ruta;
    }
}
