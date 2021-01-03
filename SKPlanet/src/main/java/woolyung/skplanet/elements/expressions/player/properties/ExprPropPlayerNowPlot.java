package woolyung.skplanet.elements.expressions.player.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import org.bukkit.entity.Player;
import woolyung.main.MineplanetPlot;
import woolyung.main.plot.Data.PlayerData;
import woolyung.main.plot.Data.PlayerDataEx;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlayerNowPlot extends SimplePropertyExpression<Player, Integer> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlayerNowPlot.class, Integer.class, "now plot", "player");
    }

    @Override
    protected String getPropertyName() {
        return "now plot of player";
    }

    @Override
    public Integer convert(Player data) {
        if (data == null)
            return null;
        else {
            PlayerDataEx playerData = MineplanetPlot.instance.getPlotDatabase().getPlayerDataEx(data);
            return playerData.plotCount;
        }
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