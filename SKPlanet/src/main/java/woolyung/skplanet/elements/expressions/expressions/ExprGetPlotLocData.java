package woolyung.skplanet.elements.expressions.expressions;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.ExpressionType;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.util.Vector;
import woolyung.main.MineplanetPlot;
import woolyung.main.plot.Data.PlotLocData;

public class ExprGetPlotLocData extends SimpleExpression<PlotLocData> {

    static {
        Skript.registerExpression(ExprGetPlotLocData.class, PlotLocData.class, ExpressionType.COMBINED, "get plot location data in %location%");
    }

    Expression<Location> locationExpression;

    @Override
    protected PlotLocData[] get(Event event) {
        Location loc = locationExpression.getSingle(event);

        PlotLocData[] datas = new PlotLocData[1];
        datas[0] = MineplanetPlot.instance.getPlotWorld().getPlotLocData(loc.getBlockX(), loc.getBlockZ());

        return datas;
    }

    @Override
    public boolean isSingle() {
        return true;
    }

    @Override
    public Class<? extends PlotLocData> getReturnType() {
        return PlotLocData.class;
    }

    @Override
    public String toString(Event event, boolean b) {
        return "get plot location data";
    }

    @Override
    public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        try {
            locationExpression = (Expression<Location>) expressions[0];
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}