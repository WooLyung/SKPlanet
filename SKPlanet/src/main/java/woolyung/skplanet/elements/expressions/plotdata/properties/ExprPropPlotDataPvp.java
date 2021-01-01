package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotDataPvp extends SimplePropertyExpression<PlotDataEx, Boolean> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotDataPvp.class, Boolean.class, "pvp option", "plotdata");
    }

    @Override
    protected String getPropertyName() {
        return "pvp option of plot data";
    }

    @Override
    public Boolean convert(PlotDataEx data) {
        if (data == null)
            return null;
        else
            return data.pvp;
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