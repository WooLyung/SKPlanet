package woolyung.skplanet.elements.classinfos;

import ch.njol.skript.classes.ClassInfo;
import ch.njol.skript.classes.Parser;
import ch.njol.skript.classes.Serializer;
import ch.njol.skript.expressions.base.EventValueExpression;
import ch.njol.skript.lang.ParseContext;
import ch.njol.skript.lang.parser.ParserInstance;
import ch.njol.skript.registrations.Classes;
import ch.njol.yggdrasil.Fields;
import woolyung.main.plot.Data.PlotDataEx;

import java.io.NotSerializableException;
import java.io.StreamCorruptedException;

public class PlotDataInfo {
    static {
        Classes.registerClass(new ClassInfo<>(PlotDataEx.class, "plotdata")
                .user("plotdata?")
                .name("PlotData")
                .defaultExpression(new EventValueExpression<>(PlotDataEx.class))
                .parser(new Parser<PlotDataEx>() {
                    @Override
                    public PlotDataEx parse(String s, ParseContext context, ParserInstance pi) {
                        return null;
                    }

                    @Override
                    public PlotDataEx parse(String s, ParseContext context) {
                        return  null;
                    }

                    @Override
                    public boolean canParse(ParseContext context) {
                        return false;
                    }

                    @Override
                    public String toCommandString(PlotDataEx o) {
                        return super.toCommandString(o);
                    }

                    @Override
                    public String getDebugMessage(PlotDataEx o) {
                        return super.getDebugMessage(o);
                    }

                    @Override
                    public String toString(PlotDataEx seed, int i) {
                        return toVariableNameString(seed);
                    }

                    @Override
                    public String toVariableNameString(PlotDataEx data) {
                        return "plot data [" + data.posX + ":" + data.posZ + "]";
                    }

                    @Override
                    public String getVariableNamePattern() {
                        return ".+";
                    }
                }).serializer(new Serializer<PlotDataEx>() {
                    @Override
                    public Fields serialize(PlotDataEx spellSeed) throws NotSerializableException {
                        return null;
                    }

                    @Override
                    public void deserialize(PlotDataEx spellSeed, Fields fields) throws StreamCorruptedException, NotSerializableException {
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
