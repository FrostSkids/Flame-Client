// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Sets;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Set;
import com.google.common.collect.ForwardingSet;

public class JsonSerializableSet extends ForwardingSet<String> implements IJsonSerializable
{
    private final /* synthetic */ Set<String> underlyingSet;
    
    public JsonElement getSerializableElement() {
        final JsonArray lllllllllllllIlIIlIIllIlIIIlIIlI = new JsonArray();
        final double lllllllllllllIlIIlIIllIlIIIIllIl = (double)this.iterator();
        "".length();
        if ("   ".length() < "   ".length()) {
            return null;
        }
        while (!lIlllIllIllIIlI(((Iterator)lllllllllllllIlIIlIIllIlIIIIllIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIlIIlIIllIlIIIlIIIl = ((Iterator<String>)lllllllllllllIlIIlIIllIlIIIIllIl).next();
            lllllllllllllIlIIlIIllIlIIIlIIlI.add((JsonElement)new JsonPrimitive(lllllllllllllIlIIlIIllIlIIIlIIIl));
        }
        return (JsonElement)lllllllllllllIlIIlIIllIlIIIlIIlI;
    }
    
    public void fromJson(final JsonElement lllllllllllllIlIIlIIllIlIIIlllIl) {
        if (lIlllIllIllIIIl(lllllllllllllIlIIlIIllIlIIIlllIl.isJsonArray() ? 1 : 0)) {
            final byte lllllllllllllIlIIlIIllIlIIIllIII = (byte)lllllllllllllIlIIlIIllIlIIIlllIl.getAsJsonArray().iterator();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
            while (!lIlllIllIllIIlI(((Iterator)lllllllllllllIlIIlIIllIlIIIllIII).hasNext() ? 1 : 0)) {
                final JsonElement lllllllllllllIlIIlIIllIlIIIlllII = ((Iterator<JsonElement>)lllllllllllllIlIIlIIllIlIIIllIII).next();
                this.add((Object)lllllllllllllIlIIlIIllIlIIIlllII.getAsString());
                "".length();
            }
        }
    }
    
    protected Set<String> delegate() {
        return this.underlyingSet;
    }
    
    private static boolean lIlllIllIllIIlI(final int lllllllllllllIlIIlIIllIlIIIIIIlI) {
        return lllllllllllllIlIIlIIllIlIIIIIIlI == 0;
    }
    
    public JsonSerializableSet() {
        this.underlyingSet = (Set<String>)Sets.newHashSet();
    }
    
    private static boolean lIlllIllIllIIIl(final int lllllllllllllIlIIlIIllIlIIIIIlII) {
        return lllllllllllllIlIIlIIllIlIIIIIlII != 0;
    }
}
