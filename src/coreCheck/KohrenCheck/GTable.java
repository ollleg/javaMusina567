package coreCheck.KohrenCheck;

/**
 * Created by IntelliJ IDEA.
 * User: Ollleg
 * Date: 05.10.2010
 * Time: 1:07:03
 * To change this template use File | Settings | File Templates.
 */
public class GTable {
    private static GTableRow[] rows = { new GTableRow(2,2,9750,0.05),
                                        new GTableRow(2,3,8709,0.05),
                                        new GTableRow(2,4,7679,0.05),
                                        new GTableRow(2,5,6838,0.05),
                                        new GTableRow(2,6,6161,0.05),
                                        new GTableRow(2,7,5612,0.05)};

    public static int getG(int F1, int F2, double q) throws NoSuchFieldException {
        GTableRow row;
        for(int i=0;i<rows.length;i++) {
            row = rows[i];
            if(row.getF1()==F1 && row.getF2()==F2 && row.getQ()==q)
                return row.getG();
        }
        throw new NoSuchFieldException();
    }
}
