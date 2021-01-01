package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.main.MineplanetPlot;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlotDataOwner extends SimplePropertyExpression<PlotDataEx, String> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlotDataOwner.class, String.class, "plot owner", "plotdata");
    }

    @Override
    protected String getPropertyName() {
        return "plot owner of plot data";
    }

    @Override
    public String convert(PlotDataEx data) {
        if (data == null)
            return null;
        else
            return MineplanetPlot.instance.getPlotDatabase().getPlayerData(data.owner).name;
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