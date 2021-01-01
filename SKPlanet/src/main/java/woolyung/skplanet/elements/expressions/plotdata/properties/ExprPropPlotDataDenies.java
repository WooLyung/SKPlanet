package woolyung.skplanet.elements.expressions.plotdata.properties;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.ExpressionType;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import org.bukkit.event.Event;
import woolyung.main.plot.Data.PlotDataEx;

import java.util.ArrayList;

public class ExprPropPlotDataDenies extends SimpleExpression<String> {

    static {
        Skript.registerExpression(ExprPropPlotDataDenies.class, String.class, ExpressionType.SIMPLE, "get denies of %plotdata%");
    }

    Expression<PlotDataEx> plotData;

    @Override
    protected String[] get(Event event) {
        ArrayList<String> values = plotData.getSingle(event).denies;

        return values.toArray(new String[values.size()]);
    }

    @Override
    public boolean isSingle() {
        return false;
    }

    @Override
    public Class<? extends String> getReturnType() {
        return String.class;
    }

    @Override
    public String toString(Event event, boolean b) {
        return "get denies in plot data";
    }

    @Override
    public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        try {
            plotData = (Expression<PlotDataEx>) expressions[0];
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}