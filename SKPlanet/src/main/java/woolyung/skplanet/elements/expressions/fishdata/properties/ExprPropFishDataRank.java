package woolyung.skplanet.elements.expressions.fishdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.angleronplot.datas.CaughtFishData;
import woolyung.skplanet.SKPlanet;

public class ExprPropFishDataRank extends SimplePropertyExpression<CaughtFishData, String> {

    static {
        SKPlanet.registerPropExpr(ExprPropFishDataRank.class, String.class, "rank", "string");
    }

    @Override
    protected String getPropertyName() {
        return "rank of fish data";
    }

    @Override
    public String convert(CaughtFishData data) {
        if (data == null)
            return null;
        else
            return data.rank.toString();
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