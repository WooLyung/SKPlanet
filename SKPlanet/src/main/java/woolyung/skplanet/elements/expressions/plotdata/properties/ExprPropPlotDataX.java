package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotDataX extends SimplePropertyExpression<PlotDataEx, Integer> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotDataX.class, Integer.class, "plot data x-loc", "plotdata");
    }

    @Override
    protected String getPropertyName() {
        return "plot data x-loc of plot data";
    }

    @Override
    public Integer convert(PlotDataEx data) {
        if (data == null)
            return null;
        else
            return data.posX;
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