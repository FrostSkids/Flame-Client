// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonReader;
import java.util.Map;
import com.google.common.collect.Maps;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import java.util.Locale;
import com.google.gson.TypeAdapterFactory;

public class EnumTypeAdapterFactory implements TypeAdapterFactory
{
    private static final /* synthetic */ int[] llIIlIlllIIllI;
    
    private static boolean lIIIllIllllIIllI(final int llllllllllllIlllIIIlIIIlllllIllI) {
        return llllllllllllIlllIIIlIIIlllllIllI != 0;
    }
    
    private static boolean lIIIllIllllIIlIl(final int llllllllllllIlllIIIlIIIllllllIIl, final int llllllllllllIlllIIIlIIIllllllIII) {
        return llllllllllllIlllIIIlIIIllllllIIl >= llllllllllllIlllIIIlIIIllllllIII;
    }
    
    private static boolean lIIIllIllllIIlII(final int llllllllllllIlllIIIlIIIlllllIlII) {
        return llllllllllllIlllIIIlIIIlllllIlII == 0;
    }
    
    private String func_151232_a(final Object llllllllllllIlllIIIlIIlIIIIIIIII) {
        String s;
        if (lIIIllIllllIIllI((llllllllllllIlllIIIlIIlIIIIIIIII instanceof Enum) ? 1 : 0)) {
            s = ((Enum)llllllllllllIlllIIIlIIlIIIIIIIII).name().toLowerCase(Locale.US);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            s = llllllllllllIlllIIIlIIlIIIIIIIII.toString().toLowerCase(Locale.US);
        }
        return s;
    }
    
    public <T> TypeAdapter<T> create(final Gson llllllllllllIlllIIIlIIlIIIIlIIII, final TypeToken<T> llllllllllllIlllIIIlIIlIIIIIllll) {
        final Class<T> llllllllllllIlllIIIlIIlIIIIIlllI = (Class<T>)llllllllllllIlllIIIlIIlIIIIIllll.getRawType();
        if (lIIIllIllllIIlII(llllllllllllIlllIIIlIIlIIIIIlllI.isEnum() ? 1 : 0)) {
            return null;
        }
        final Map<String, T> llllllllllllIlllIIIlIIlIIIIIllIl = (Map<String, T>)Maps.newHashMap();
        final short llllllllllllIlllIIIlIIlIIIIIIlII;
        final char llllllllllllIlllIIIlIIlIIIIIIlIl = (char)((T[])(Object)(llllllllllllIlllIIIlIIlIIIIIIlII = (short)(Object)llllllllllllIlllIIIlIIlIIIIIlllI.getEnumConstants())).length;
        int llllllllllllIlllIIIlIIlIIIIIIllI = EnumTypeAdapterFactory.llIIlIlllIIllI[0];
        "".length();
        if (((0x75 ^ 0x42) & ~(0x95 ^ 0xA2)) >= "   ".length()) {
            return null;
        }
        while (!lIIIllIllllIIlIl(llllllllllllIlllIIIlIIlIIIIIIllI, llllllllllllIlllIIIlIIlIIIIIIlIl)) {
            final T llllllllllllIlllIIIlIIlIIIIIllII = llllllllllllIlllIIIlIIlIIIIIIlII[llllllllllllIlllIIIlIIlIIIIIIllI];
            llllllllllllIlllIIIlIIlIIIIIllIl.put(this.func_151232_a(llllllllllllIlllIIIlIIlIIIIIllII), llllllllllllIlllIIIlIIlIIIIIllII);
            "".length();
            ++llllllllllllIlllIIIlIIlIIIIIIllI;
        }
        return new TypeAdapter<T>() {
            private static boolean lIlIIIllIIlIIIIl(final Object llllllllllllIlIllIllIIIIlIlIlllI, final Object llllllllllllIlIllIllIIIIlIlIllIl) {
                return llllllllllllIlIllIllIIIIlIlIlllI == llllllllllllIlIllIllIIIIlIlIllIl;
            }
            
            private static boolean lIlIIIllIIlIIIII(final Object llllllllllllIlIllIllIIIIlIlIlIll) {
                return llllllllllllIlIllIllIIIIlIlIlIll == null;
            }
            
            public T read(final JsonReader llllllllllllIlIllIllIIIIlIllIIIl) throws IOException {
                if (lIlIIIllIIlIIIIl(llllllllllllIlIllIllIIIIlIllIIIl.peek(), JsonToken.NULL)) {
                    llllllllllllIlIllIllIIIIlIllIIIl.nextNull();
                    return null;
                }
                return llllllllllllIlllIIIlIIlIIIIIllIl.get(llllllllllllIlIllIllIIIIlIllIIIl.nextString());
            }
            
            public void write(final JsonWriter llllllllllllIlIllIllIIIIlIlllIll, final T llllllllllllIlIllIllIIIIlIlllIlI) throws IOException {
                if (lIlIIIllIIlIIIII(llllllllllllIlIllIllIIIIlIlllIlI)) {
                    llllllllllllIlIllIllIIIIlIlllIll.nullValue();
                    "".length();
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIllIllIIIIlIlllIll.value(EnumTypeAdapterFactory.this.func_151232_a(llllllllllllIlIllIllIIIIlIlllIlI));
                    "".length();
                }
            }
        };
    }
    
    static {
        lIIIllIllllIIIll();
    }
    
    private static void lIIIllIllllIIIll() {
        (llIIlIlllIIllI = new int[1])[0] = ((0x6 ^ 0x6C ^ (0xA ^ 0x53)) & (124 + 126 - 179 + 67 ^ 2 + 68 + 97 + 18 ^ -" ".length()));
    }
}
