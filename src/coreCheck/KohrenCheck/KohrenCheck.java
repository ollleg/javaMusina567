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
    public boolean performCheck() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
