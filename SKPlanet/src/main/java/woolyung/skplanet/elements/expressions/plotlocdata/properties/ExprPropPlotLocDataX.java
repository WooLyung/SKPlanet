package woolyung.skplanet.elements.expressions.plotlocdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotLocData;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotLocDataX extends SimplePropertyExpression<PlotLocData, Integer> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotLocDataX.class, Integer.class, "plot loc data x-loc", "plotlocdata");
    }

    @Override
    protected String getPropertyName() {
        return "plot loc data x-loc of plot location data";
    }

    @Override
    public Integer convert(PlotLocData data) {
        if (data == null)
            return null;
        else
            return data.plotLocX;
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