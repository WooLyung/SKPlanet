package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotDataZ extends SimplePropertyExpression<PlotDataEx, Integer> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotDataZ.class, Integer.class, "plot data z-loc", "plotdata");
    }

    @Override
    protected String getPropertyName() {
        return "plot data z-loc of plot data";
    }

    @Override
    public Integer convert(PlotDataEx data) {
        if (data == null)
            return null;
        else
            return data.posZ;
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