import edu.kit.iti.formal.kuromasu.*;
import org.sat4j.core.VecInt;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.TimeoutException;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Bitte beschreibe deine Implementierung.
 * @author  <DEIN NAME>
 */
public class MyKuromasuSolver extends KuromasuSolver {
    // Dieser Konstruktor ist notwendig für das automatisierte Testen.
    public MyKuromasuSolver(Kuromasu k) {
        super(k);
    }

    @Override
    public Solution solve() {
        // 1. Berechne die Klauselmenge für das in der Membervariable 'game' beschriebene Spiel

        // 2. Rufe den SAT-Solver in der Variable solver auf.

        // 3. Lese aus, welche Felder schwarz/weiß sind.

        //Angeben, ob eine Lösung vorliegt.

        //solution.setState(SolutionState.UNSAT);
        //solution.setState(SolutionState.SAT);

        // Weitere Dokumentation unter https://formal.kastel.kit.edu/teaching/FormSysWS2223/praxis1/javadoc

        // Have a lot of fun.

        return solution;
    }

    /**
     * Adds the given literals as one clause to the sat solver instance.
     * @param c the literals
     */
    private void addClause(int... c) {
        try {
            // Debugging:
            // System.out.println(Arrays.toString(c));
            solver.addClause(new VecInt(c));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
    }
}
