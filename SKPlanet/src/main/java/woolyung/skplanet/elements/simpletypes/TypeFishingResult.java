package woolyung.skplanet.elements.simpletypes;

import woolyung.skplanet.elements.classinfos.EnumClassInfo;
import woolyung.angleronplot.fishingsystem.FishingFinishEvent;

public class TypeFishingResult {
    static {
        EnumClassInfo.create(FishingFinishEvent.Result.class, "fishingresult").register();
    }
}
