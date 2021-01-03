package woolyung.skplanet.elements.expressions.player.properties;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.ExpressionType;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import woolyung.main.MineplanetPlot;
import woolyung.main.plot.Data.PlayerDataEx;
import woolyung.main.plot.Data.PlotDataEx;
import woolyung.skplanet.elements.expressions.plotdata.properties.ExprPropPlotDataHelpers;

import java.util.ArrayList;

public class ExprPropPlayerPlots extends SimpleExpression<String> {

    static {
        Skript.registerExpression(ExprPropPlayerPlots.class, String.class, ExpressionType.SIMPLE, "get plots of %player%");
    }

    Expression<Player> player;

    @Override
    protected String[] get(Event event) {
        Player p = player.getSingle(event);
        PlayerDataEx dataEx = MineplanetPlot.instance.getPlotDatabase().getPlayerDataEx(p);

        ArrayList<String> values = dataEx.plots;

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
        return "get plots of player";
    }

    @Override
    public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        try {
            player = (Expression<Player>) expressions[0];
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
