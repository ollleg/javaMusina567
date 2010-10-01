import coreGenerate.ExperimentModel;

/**
 * Created by IntelliJ IDEA.
 * User: Andrew
 * Date: 30.09.2010
 * Time: 15:02:46
 * To change this template use File | Settings | File Templates.
 */
public interface ICheck {
    public void attachTo(ExperimentModel e);

    public boolean performCheck();
}
