package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotDataPlotSize extends SimplePropertyExpression<PlotDataEx, Integer> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotDataPlotSize.class, Integer.class, "plot size", "plotdata");
    }

    @Override
    protected String getPropertyName() {
        return "plot size of plot data";
    }

    @Override
    public Integer convert(PlotDataEx data) {
        if (data == null)
            return null;
        else
            return data.plotSize;
    }

    @Override
    public Class<? extends Integer> getReturnType() {
        return Integer.class;
    }

    @Override
    public Class<?>[] acceptChange(Changer.ChangeMode mode) {
        return null;
    }
}