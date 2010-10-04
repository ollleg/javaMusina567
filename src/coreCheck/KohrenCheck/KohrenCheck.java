package coreCheck.KohrenCheck;

import coreCheck.ICheck;
import coreGenerate.ExperimentModel;

/**
 * Created by IntelliJ IDEA.
 * User: Ollleg
 * Date: 05.10.2010
 * Time: 0:36:51
 * To change this template use File | Settings | File Templates.
 */
public class KohrenCheck implements ICheck {
    /**
     * The default level of significance.
     */
    private final double Q = 0.05;

    /**
     * The model of the experiment.
     */
    private ExperimentModel model;

    public KohrenCheck() {
    }

    public KohrenCheck(ExperimentModel model) {
        attachTo(model);
    }

    @Override
    public void attachTo(ExperimentModel e) {
        model = e;
        e.addCheck(this);
    }

    @Override
    public boolean performCheck() throws NoSuchFieldException {
        double[] srY; //The averages of experiment results.
        double[] S;   //The dispersions of experiment results.
        double Smax;  //The maximum of dispersions S.
        double Ssum;  //The amount of the elements of the array S
        double Gt,Gp;    //The values, which we need to compare.

        //Searching the Gt from G-Table.
        int F1 = model.getFactorsCount()-1;
        int F2 = model.getExperimentsCount();
        Gt = GTable.getG(F1,F2,Q);

        //Filling the srY array
        srY = new double[model.getExperimentsCount()];
        int m = model.getFactorsCount(),t;
        for(int i=0;i<srY.length;i++) {
            t = 0;
            for(int j=0;j<m;j++)
                t += model.getExperimentResult(i,j);
            srY[i] = t/m;
        }

        //Filling the S array.
        S = new double[model.getExperimentsCount()];
        Ssum = 0;
        for(int i=0;i<S.length;i++) {
            t = 0;
            for(int j=0;j<m;j++)
                t += Math.pow(srY[i] - model.getExperimentResult(i,j), 2);
            S[i] = t/m;
            Ssum += S[i];
        }

        //Searching the maximum of the S array
        Smax = 0;
        for(int i=0;i<S.length;i++)
            if(S[i]>Smax)
                Smax =  S[i];
        Gp = Smax / Ssum;

        return Gp<Gt;  
    }
}
