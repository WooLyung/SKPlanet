package woolyung.skplanet.elements.expressions.plotlocdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.plot.Data.PlotLocData;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotLocDataExtendSection extends SimplePropertyExpression<PlotLocData, String> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotLocDataExtendSection.class, String.class, "extend section", "plotlocdata");
    }

    @Override
    protected String getPropertyName() {
        return "extend section of plot location data";
    }

    @Override
    public String convert(PlotLocData data) {
        if (data == null)
            return null;
        else
            return data.extendSection.toString();
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