package woolyung.skplanet.elements.expressions.fishdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.angleronplot.datas.CaughtFishData;
import woolyung.skplanet.SKPlanet;

public class ExprPropFishDataName extends SimplePropertyExpression<CaughtFishData, String> {

    static {
        SKPlanet.registerPropExpr(ExprPropFishDataName.class, String.class, "name", "string");
    }

    @Override
    protected String getPropertyName() {
        return "name of fish data";
    }

    @Override
    public String convert(CaughtFishData data) {
        if (data == null)
            return null;
        else
            return data.name;
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