package woolyung.skplanet.elements.expressions.expressions;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.ExpressionType;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import org.bukkit.Location;
import org.bukkit.event.Event;
import woolyung.main.MineplanetPlot;
import woolyung.main.plot.Data.PlotDataEx;

public class ExprGetPlotData extends SimpleExpression<PlotDataEx> {

    static {
        Skript.registerExpression(ExprGetPlotData.class, PlotDataEx.class, ExpressionType.COMBINED, "get plot data %integer%, %integer%");
    }

    Expression<Integer> x;
    Expression<Integer> z;

    @Override
    protected PlotDataEx[] get(Event event) {
        Integer xi = x.getSingle(event);
        Integer zi = z.getSingle(event);

        PlotDataEx[] datas = new PlotDataEx[1];
        if (xi != null && zi != null) {
            datas[0] = MineplanetPlot.instance.getPlotDatabase().getPlotDataEx(xi, zi);
        }
        else {
            datas[0] = null;
        }

        return datas;
    }

    @Override
    public boolean isSingle() {
        return true;
    }

    @Override
    public Class<? extends PlotDataEx> getReturnType() {
        return PlotDataEx.class;
    }

    @Override
    public String toString(Event event, boolean b) {
        return "get plot data";
    }

    @Override
    public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        try {
            x = (Expression<Integer>) expressions[0];
            z = (Expression<Integer>) expressions[1];
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}