package woolyung.skplanet.elements.effects.player.properties;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.util.Kleenean;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import woolyung.main.MineplanetPlot;
import woolyung.main.plot.Data.PlayerData;

public class EffPlayerAddMaxPlot extends Effect {

    static {
        Skript.registerEffect(EffPlayerAddMaxPlot.class, "add %integer% to %player% max plot");
    }

    private Expression<Integer> value;
    private Expression<Player> player;

    @Override
    protected void execute(Event event) {
        Integer v = value.getSingle(event);
        Player p = player.getSingle(event);

        if (v != null && p != null) {
            PlayerData playerData = MineplanetPlot.instance.getPlotDatabase().getPlayerData(p);
            MineplanetPlot.instance.getPlotDatabase().setMaxPlot(playerData.name, v + playerData.maxPlot);
        }
    }

    @Override
    public String toString(Event event, boolean b) {
        return "add player's max plot";
    }

    @Override
    public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        try {
            value = (Expression<Integer>) expressions[0];
            player = (Expression<Player>) expressions[1];
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
