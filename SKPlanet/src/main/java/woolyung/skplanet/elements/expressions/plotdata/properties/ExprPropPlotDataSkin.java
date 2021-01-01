package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotDataSkin extends SimplePropertyExpression<PlotDataEx, String> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotDataSkin.class, String.class, "skin", "string");
    }

    @Override
    protected String getPropertyName() {
        return "skin of plot data";
    }

    @Override
    public String convert(PlotDataEx data) {
        if (data == null)
            return null;
        else
            return data.skin;
    }

    @Override
    public Class<? extends String> getReturnType() {
        return String.class;
    }

    @Override
    public Class<?>[] acceptChange(Changer.ChangeMode mode) {
        return null;
    }
}