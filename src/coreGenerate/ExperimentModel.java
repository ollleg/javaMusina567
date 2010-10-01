package coreGenerate;

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

    public void ExperimentModel(int N, int m) {
        //constructor for the model

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
        //to be created
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
