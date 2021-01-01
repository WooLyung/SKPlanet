package woolyung.skplanet.elements.classinfos;

import ch.njol.skript.classes.ClassInfo;
import ch.njol.skript.classes.Parser;
import ch.njol.skript.classes.Serializer;
import ch.njol.skript.expressions.base.EventValueExpression;
import ch.njol.skript.lang.ParseContext;
import ch.njol.skript.lang.parser.ParserInstance;
import ch.njol.skript.registrations.Classes;
import ch.njol.yggdrasil.Fields;
import woolyung.main.plot.Data.PlotLocData;

import java.io.NotSerializableException;
import java.io.StreamCorruptedException;

public class PlotLocDataInfo {
    static {
        Classes.registerClass(new ClassInfo<>(PlotLocData.class, "plotlocdata")
                .user("plotlocdata?")
                .name("PlotLocData")
                .defaultExpression(new EventValueExpression<>(PlotLocData.class))
                .parser(new Parser<PlotLocData>() {
                    @Override
                    public PlotLocData parse(String s, ParseContext context, ParserInstance pi) {
                        return null;
                    }

                    @Override
                    public PlotLocData parse(String s, ParseContext context) {
                        return  null;
                    }

                    @Override
                    public boolean canParse(ParseContext context) {
                        return false;
                    }

                    @Override
                    public String toCommandString(PlotLocData o) {
                        return super.toCommandString(o);
                    }

                    @Override
                    public String getDebugMessage(PlotLocData o) {
                        return super.getDebugMessage(o);
                    }

                    @Override
                    public String toString(PlotLocData seed, int i) {
                        return toVariableNameString(seed);
                    }

                    @Override
                    public String toVariableNameString(PlotLocData locData) {
                        return "plot location data [" + locData.plotLocX + ":" + locData.plotLocZ + "]";
                    }

                    @Override
                    public String getVariableNamePattern() {
                        return ".+";
                    }
                }).serializer(new Serializer<PlotLocData>() {
                    @Override
                    public Fields serialize(PlotLocData spellSeed) throws NotSerializableException {
                        return null;
                    }

                    @Override
                    public void deserialize(PlotLocData spellSeed, Fields fields) throws StreamCorruptedException, NotSerializableException {
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
