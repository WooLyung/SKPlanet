package woolyung.skplanet.elements.expressions.fishdata.properties;

import ch.njol.skript.classes.Changer;
import ch.njol.skript.expressions.base.SimplePropertyExpression;
import woolyung.angleronplot.datas.CaughtFishData;
import woolyung.skplanet.SKPlanet;

public class ExprPropFishDataIsMale extends SimplePropertyExpression<CaughtFishData, Boolean> {

    static {
        SKPlanet.registerPropExpr(ExprPropFishDataIsMale.class, Boolean.class, "isMale", "fishdata");
    }

    @Override
    protected String getPropertyName() {
        return "isMale of fish data";
    }

    @Override
    public Boolean convert(CaughtFishData data) {
        if (data == null)
            return null;
        else
            return data.isMale;
    }

    @Override
    public Class<? extends Boolean> getReturnType() {
        return Boolean.class;
    }

    @Override
    public Class<?>[] acceptChange(Changer.ChangeMode mode) {
        return null;
    }
}