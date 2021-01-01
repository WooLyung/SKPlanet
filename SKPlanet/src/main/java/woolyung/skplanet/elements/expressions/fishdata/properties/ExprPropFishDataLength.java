package woolyung.skplanet.elements.expressions.fishdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.angleronplot.datas.CaughtFishData;
import woolyung.skplanet.SKPlanet;

public class ExprPropFishDataLength extends SimplePropertyExpression<CaughtFishData, Double> {

    static {
        SKPlanet.registerPropExpr(ExprPropFishDataLength.class, Double.class, "length", "fishdata");
    }

    @Override
    protected String getPropertyName() {
        return "length of fish data";
    }

    @Override
    public Double convert(CaughtFishData data) {
        if (data == null)
            return null;
        else
            return (double) data.length;
    }

    @Override
    public Class<? extends Double> getReturnType() {
        return Double.class;
    }

    @Override
    public Class<?>[] acceptChange(Changer.ChangeMode mode) {
        return null;
    }
}