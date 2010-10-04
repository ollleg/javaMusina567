package coreCheck.KohrenCheck;

/**
 * Created by IntelliJ IDEA.
 * User: Ollleg
 * Date: 05.10.2010
 * Time: 0:57:24
 * To change this template use File | Settings | File Templates.
 */
public class GTableRow {

    private int F1;
    private int F2;
    private int G;
    private double Q;

    public GTableRow(int f1, int f2, int g, double q) {
        F1 = f1;
        F2 = f2;
        G = g;
        Q = q;
    }

    public double getQ() {
        return Q;
    }

    public void setQ(double q) {
        Q = q;
    }

    public int getF1() {
        return F1;
    }

    public void setF1(int f1) {
        F1 = f1;
    }

    public int getF2() {
        return F2;
    }

    public void setF2(int f2) {
        F2 = f2;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }
}
