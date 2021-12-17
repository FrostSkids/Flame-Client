// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.properties;

import java.util.Iterator;
import com.google.common.collect.Maps;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.util.IStringSerializable;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

public class PropertyEnum<T extends Enum> extends PropertyHelper<T>
{
    private static final /* synthetic */ int[] lIIlllIIIlIIll;
    private final /* synthetic */ Map<String, T> nameToValue;
    private final /* synthetic */ ImmutableSet<T> allowedValues;
    private static final /* synthetic */ String[] lIIlllIIIlIIlI;
    
    @Override
    public String getName(final T lllllllllllllIIlIlIIIllIlIlIIlII) {
        return ((IStringSerializable)lllllllllllllIIlIlIIIllIlIlIIlII).getName();
    }
    
    static {
        llIllIlIlIlllIl();
        llIllIlIlIllIll();
    }
    
    public static <T extends java.lang.Enum> PropertyEnum<T> create(final String lllllllllllllIIlIlIIIllIlIlIIIII, final Class<T> lllllllllllllIIlIlIIIllIlIIlllll) {
        return create(lllllllllllllIIlIlIIIllIlIlIIIII, lllllllllllllIIlIlIIIllIlIIlllll, (com.google.common.base.Predicate<T>)Predicates.alwaysTrue());
    }
    
    private static void llIllIlIlIlllIl() {
        (lIIlllIIIlIIll = new int[3])[0] = ((38 + 108 - 118 + 111 ^ 132 + 72 - 64 + 21) & (118 + 100 - 47 + 13 ^ 51 + 16 - 25 + 104 ^ -" ".length()));
        PropertyEnum.lIIlllIIIlIIll[1] = " ".length();
        PropertyEnum.lIIlllIIIlIIll[2] = "  ".length();
    }
    
    private static boolean llIllIlIlIlllll(final int lllllllllllllIIlIlIIIllIIllIllIl) {
        return lllllllllllllIIlIlIIIllIIllIllIl == 0;
    }
    
    private static void llIllIlIlIllIll() {
        (lIIlllIIIlIIlI = new String[PropertyEnum.lIIlllIIIlIIll[2]])[PropertyEnum.lIIlllIIIlIIll[0]] = llIllIlIlIllIlI("7vHH6tQ3P0qpAIGld0GSe0eExpGCQdLl+VmaX/A3XnHxlN6KjbO9yA==", "tgmKr");
        PropertyEnum.lIIlllIIIlIIlI[PropertyEnum.lIIlllIIIlIIll[1]] = llIllIlIlIllIlI("WRWVUnmqalg=", "jcCqZ");
    }
    
    private static String llIllIlIlIllIlI(final String lllllllllllllIIlIlIIIllIIlllIllI, final String lllllllllllllIIlIlIIIllIIlllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIIllIIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIllIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIIIllIIllllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIIIllIIllllIII.init(PropertyEnum.lIIlllIIIlIIll[2], lllllllllllllIIlIlIIIllIIllllIIl);
            return new String(lllllllllllllIIlIlIIIllIIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIllIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIIllIIlllIlll) {
            lllllllllllllIIlIlIIIllIIlllIlll.printStackTrace();
            return null;
        }
    }
    
    public static <T extends java.lang.Enum> PropertyEnum<T> create(final String lllllllllllllIIlIlIIIllIlIIIIlII, final Class<T> lllllllllllllIIlIlIIIllIlIIIIllI, final Collection<T> lllllllllllllIIlIlIIIllIlIIIIIlI) {
        return new PropertyEnum<T>(lllllllllllllIIlIlIIIllIlIIIIlII, lllllllllllllIIlIlIIIllIlIIIIllI, lllllllllllllIIlIlIIIllIlIIIIIlI);
    }
    
    private static boolean llIllIlIlIllllI(final int lllllllllllllIIlIlIIIllIIllIllll) {
        return lllllllllllllIIlIlIIIllIIllIllll != 0;
    }
    
    public static <T extends java.lang.Enum> PropertyEnum<T> create(final String lllllllllllllIIlIlIIIllIlIIlIllI, final Class<T> lllllllllllllIIlIlIIIllIlIIlIlIl, final Predicate<T> lllllllllllllIIlIlIIIllIlIIlIlII) {
        return create(lllllllllllllIIlIlIIIllIlIIlIllI, lllllllllllllIIlIlIIIllIlIIlIlIl, Collections2.filter((Collection)Lists.newArrayList((Object[])lllllllllllllIIlIlIIIllIlIIlIlIl.getEnumConstants()), (Predicate)lllllllllllllIIlIlIIIllIlIIlIlII));
    }
    
    @Override
    public Collection<T> getAllowedValues() {
        return (Collection<T>)this.allowedValues;
    }
    
    public static <T extends java.lang.Enum> PropertyEnum<T> create(final String lllllllllllllIIlIlIIIllIlIIIllIl, final Class<T> lllllllllllllIIlIlIIIllIlIIIllII, final T... lllllllllllllIIlIlIIIllIlIIIlllI) {
        return create(lllllllllllllIIlIlIIIllIlIIIllIl, lllllllllllllIIlIlIIIllIlIIIllII, Lists.newArrayList((Object[])lllllllllllllIIlIlIIIllIlIIIlllI));
    }
    
    protected PropertyEnum(final String lllllllllllllIIlIlIIIllIlIlIllll, final Class<T> lllllllllllllIIlIlIIIllIlIlIlllI, final Collection<T> lllllllllllllIIlIlIIIllIlIlIllIl) {
        super(lllllllllllllIIlIlIIIllIlIlIllll, lllllllllllllIIlIlIIIllIlIlIlllI);
        this.nameToValue = (Map<String, T>)Maps.newHashMap();
        this.allowedValues = (ImmutableSet<T>)ImmutableSet.copyOf((Collection)lllllllllllllIIlIlIIIllIlIlIllIl);
        final String lllllllllllllIIlIlIIIllIlIlIlIll = (String)lllllllllllllIIlIlIIIllIlIlIllIl.iterator();
        "".length();
        if ("  ".length() < -" ".length()) {
            throw null;
        }
        while (!llIllIlIlIlllll(((Iterator)lllllllllllllIIlIlIIIllIlIlIlIll).hasNext() ? 1 : 0)) {
            final T lllllllllllllIIlIlIIIllIlIllIIlI = ((Iterator<T>)lllllllllllllIIlIlIIIllIlIlIlIll).next();
            final String lllllllllllllIIlIlIIIllIlIllIIIl = ((IStringSerializable)lllllllllllllIIlIlIIIllIlIllIIlI).getName();
            if (llIllIlIlIllllI(this.nameToValue.containsKey(lllllllllllllIIlIlIIIllIlIllIIIl) ? 1 : 0)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder(PropertyEnum.lIIlllIIIlIIlI[PropertyEnum.lIIlllIIIlIIll[0]]).append(lllllllllllllIIlIlIIIllIlIllIIIl).append(PropertyEnum.lIIlllIIIlIIlI[PropertyEnum.lIIlllIIIlIIll[1]])));
            }
            this.nameToValue.put(lllllllllllllIIlIlIIIllIlIllIIIl, lllllllllllllIIlIlIIIllIlIllIIlI);
            "".length();
        }
    }
}
