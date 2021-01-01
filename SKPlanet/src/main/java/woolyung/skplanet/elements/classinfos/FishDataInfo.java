package woolyung.skplanet.elements.classinfos;

import ch.njol.skript.classes.ClassInfo;
import ch.njol.skript.classes.Parser;
import ch.njol.skript.classes.Serializer;
import ch.njol.skript.expressions.base.EventValueExpression;
import ch.njol.skript.lang.ParseContext;
import ch.njol.skript.lang.parser.ParserInstance;
import ch.njol.skript.registrations.Classes;
import ch.njol.yggdrasil.Fields;
import woolyung.angleronplot.datas.CaughtFishData;

import java.io.NotSerializableException;
import java.io.StreamCorruptedException;

public class FishDataInfo {
    static {
        Classes.registerClass(new ClassInfo<>(CaughtFishData.class, "fishdata")
                .user("fishdata?")
                .name("FishData")
                .defaultExpression(new EventValueExpression<>(CaughtFishData.class))
                .parser(new Parser<CaughtFishData>() {
                    @Override
                    public CaughtFishData parse(String s, ParseContext context, ParserInstance pi) {
                        return null;
                    }

                    @Override
                    public CaughtFishData parse(String s, ParseContext context) {
                        return  null;
                    }

                    @Override
                    public boolean canParse(ParseContext context) {
                        return false;
                    }

                    @Override
                    public String toCommandString(CaughtFishData o) {
                        return super.toCommandString(o);
                    }

                    @Override
                    public String getDebugMessage(CaughtFishData o) {
                        return super.getDebugMessage(o);
                    }

                    @Override
                    public String toString(CaughtFishData seed, int i) {
                        return toVariableNameString(seed);
                    }

                    @Override
                    public String toVariableNameString(CaughtFishData fish) {
                        return "fish data (" + fish.name + ")";
                    }

                    @Override
                    public String getVariableNamePattern() {
                        return ".+";
                    }
                }).serializer(new Serializer<CaughtFishData>() {
                    @Override
                    public Fields serialize(CaughtFishData spellSeed) throws NotSerializableException {
                        return null;
                    }

                    @Override
                    public void deserialize(CaughtFishData spellSeed, Fields fields) throws StreamCorruptedException, NotSerializableException {
                        assert false;
                    }

                    @Override
                    public boolean mustSyncDeserialization() {
                        return false;
                    }

                    @Override
                    protected boolean canBeInstantiated() {
                        return false;
                    }
                }));
    }
}
