package woolyung.skplanet.elements.expressions.plotlocdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotLocData;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotLocDataZ extends SimplePropertyExpression<PlotLocData, Integer> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotLocDataZ.class, Integer.class, "plot loc data z-loc", "plotlocdata");
    }

    @Override
    protected String getPropertyName() {
        return "plot loc data z-loc of plot location data";
    }

    @Override
    public Integer convert(PlotLocData data) {
        if (data == null)
            return null;
        else
            return data.plotLocZ;
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