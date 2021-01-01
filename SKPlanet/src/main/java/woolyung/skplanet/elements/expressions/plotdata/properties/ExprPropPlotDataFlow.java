package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotDataFlow extends SimplePropertyExpression<PlotDataEx, Boolean> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotDataFlow.class, Boolean.class, "flow option", "plotdata");
    }

    @Override
    protected String getPropertyName() {
        return "flow option of plot data";
    }

    @Override
    public Boolean convert(PlotDataEx data) {
        if (data == null)
            return null;
        else
            return data.flow;
    }

    @Override
    public Class<? extends Boolean> getReturnType() {
        return Boolean.class;
    }

    @Override
    public Class<?>[] acceptChange(Changer.ChangeMode mode) {
        return null;
    }
}