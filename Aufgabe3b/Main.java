import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import samples.tutorials.trunk.SendMoreMoney;

import static choco.Choco.*;

/**
 * Created by Paddy-Gaming on 31.05.2015.
 */

public class Main {
    public static void main(String[] args) {
        // Build model
        Model model = new CPModel();

        // Declare every letter as a variable
        IntegerVariable d = makeIntVar("d", 0, 9, Options.V_ENUM);
        IntegerVariable o = makeIntVar("o", 0, 9, Options.V_ENUM);
        IntegerVariable n = makeIntVar("n", 0, 9, Options.V_ENUM);
        IntegerVariable a = makeIntVar("a", 0, 9, Options.V_ENUM);
        IntegerVariable l = makeIntVar("l", 0, 9, Options.V_ENUM);
        IntegerVariable g = makeIntVar("g", 0, 9, Options.V_ENUM);
        IntegerVariable e = makeIntVar("e", 0, 9, Options.V_ENUM);
        IntegerVariable r = makeIntVar("r", 0, 9, Options.V_ENUM);
        IntegerVariable b = makeIntVar("b", 0, 9, Options.V_ENUM);
        IntegerVariable t = makeIntVar("t", 0, 9, Options.V_ENUM);

        // Erstellen von 5 Constraints fuer die Anzahl der Variablen? (DONALD = 5 GERALD = 5, zusammen = 10, deswegen 5 Constraints?)
        IntegerVariable c1 = makeIntVar("c1", 0, 1, Options.V_ENUM);
        IntegerVariable c2 = makeIntVar("c2", 0, 1, Options.V_ENUM);
        IntegerVariable c3 = makeIntVar("c3", 0, 1, Options.V_ENUM);
        IntegerVariable c4 = makeIntVar("c4", 0, 1, Options.V_ENUM);
        IntegerVariable c5 = makeIntVar("c5", 0, 1, Options.V_ENUM);

        //Declare every name as a variable
        IntegerVariable donald = makeIntVar("donald", 0, 1000000, Options.V_BOUND);
        IntegerVariable gerald = makeIntVar("gerald", 0, 1000000, Options.V_BOUND);
        IntegerVariable robert = makeIntVar("robert", 0, 1000000, Options.V_BOUND);

        //Array of coefficients
        int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};

        // Declare every combination of letter as an integer expression
        IntegerExpressionVariable donaldLetters = scalar(new IntegerVariable[]{d, o, n, a, l, d}, c);
        IntegerExpressionVariable geraldLetters = scalar(new IntegerVariable[]{g, e, r, a, l, d}, c);
        IntegerExpressionVariable robertLetters = scalar(new IntegerVariable[]{r, o, b, e, r, t}, c);

        // Add equality between name and letters combination model.
        model.addConstraint(eq(donaldLetters, donald));
        model.addConstraint(eq(geraldLetters, gerald));
        model.addConstraint(eq(robertLetters, robert));

        // Add constraint name sum
        model.addConstraint(eq(plus(donald, gerald), robert));

        // Add constraint of all different letters.
        model.addConstraint(allDifferent(new IntegerVariable[]{d, o, n, a, l, g, e, r, b, t}));

        // Build a solver, read the model and solve it
        Solver s = new CPSolver();
        s.read(model);
        s.solve();

        // Print name value
        System.out.println("donald = " + s.getVar(donald).getVal());
        System.out.println("gerald = " + s.getVar(gerald).getVal());
        System.out.println("robert = " + s.getVar(robert).getVal());
    }
}
