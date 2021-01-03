package woolyung.skplanet.elements.expressions.player.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import org.bukkit.entity.Player;
import woolyung.main.MineplanetPlot;
import woolyung.main.plot.Data.PlayerData;
import woolyung.skplanet.SKPlanet;

public class ExprPropPlayerMaxPlot extends SimplePropertyExpression<Player, Integer> {

    static {
        SKPlanet.registerPropExpr(ExprPropPlayerMaxPlot.class, Integer.class, "max plot", "player");
    }

    @Override
    protected String getPropertyName() {
        return "max plot of player";
    }

    @Override
    public Integer convert(Player data) {
        if (data == null)
            return null;
        else {
            PlayerData playerData = MineplanetPlot.instance.getPlotDatabase().getPlayerData(data);
            return playerData.maxPlot;
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