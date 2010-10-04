package coreGenerate;

import coreCheck.ICheck;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Andrew
 * Date: 30.09.2010
 * Time: 15:01:48
 * To change this template use File | Settings | File Templates.
 */
public class ExperimentModel {
    private ArrayList<ICheck> checkList;

    /**
     * The experiment table. It consists of the results of experiments. 
     */
    private double expTable [][];
    private int N;
    private int m;

    public void ExperimentModel(int N, int m) {
        this.N = N;
        this.m = m;
        expTable = new double[N][];
        for(int i=0;i<N;i++)
            expTable[i] = new double[m];
    }

    /**
     *
     * @param N - The number of experiment
     * @param m - The number of factor
     * @return The result(y) of N experiment from m factor
     */
    public double getExperimentResult(int N, int m) {
        return expTable[N][m];        
    }

    /**
     *
     * @return The number of experiments in the table.
     */
    public int getExperimentsCount(){
        return N;
    }

    /**
     *
     * @return The number of factors.
     */
    public int getFactorsCount(){
        return m;
    }

    /**
     * Sets bounds on X variable. Take a notice that it will appear normalized
     * in matrix anyway.
     *
     * @param min
     * @param max
     */
    public void setXBounds(int min, int max) {
        //git test
    }

    /**
     * Set bounds on Y variable. See ExperimentModel.setXBounds
     *
     * @param min
     * @param max
     */
    public void setYBounds(int min, int max) {
        //TODO create fields
        //TODO create code

    }

    /**
     * Adds an ICheck to a chain of model validation checkers
     *
     * @param c
     */
    public void addCheck(ICheck c) {

    }

    /**
     * Insterts an ICheck instance to a determined position
     *
     * @param c
     * @param pos
     */
    public void addCheck(ICheck c, int pos) {
        //TODO: create code
    }

    /**
     * Used to set number of experiments.
     * use it in case of validation fail
     *
     * @param m
     */
    public void setM(int m) {

    }
}
