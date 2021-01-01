package woolyung.skplanet.elements.events;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.registrations.EventValues;
import ch.njol.skript.util.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import woolyung.angleronplot.datas.CaughtFishData;
import woolyung.angleronplot.fishingsystem.FishingFinishEvent;

public class EvtFishingFinish extends SkriptEvent {

    static {
        Skript.registerEvent("Fishing Finish Event", EvtFishingFinish.class, FishingFinishEvent.class, "[on] fishing finish [event]");
        EventValues.registerEventValue(FishingFinishEvent.class, CaughtFishData.class, new Getter<CaughtFishData, FishingFinishEvent>() {
            @Override
            public CaughtFishData get(FishingFinishEvent event) {
                return event.getFish();
            }
        }, 0);
        EventValues.registerEventValue(FishingFinishEvent.class, Player.class, new Getter<Player, FishingFinishEvent>() {
            @Override
            public Player get(FishingFinishEvent event) {
                return event.getPlayer();
            }
        }, 0);
        EventValues.registerEventValue(FishingFinishEvent.class, FishingFinishEvent.Result.class, new Getter<FishingFinishEvent.Result, FishingFinishEvent>() {
            @Override
            public FishingFinishEvent.Result get(FishingFinishEvent event) {
                return event.getResult();
            }
        }, 0);
    }

    @Override
    public boolean init(Literal<?>[] literals, int i, SkriptParser.ParseResult parseResult) {
        return true;
    }

    @Override
    public boolean check(Event event) {
        return event instanceof FishingFinishEvent;
    }

    @Override
    public String toString(Event event, boolean b) {
        return "fishing finish event";
    }
}