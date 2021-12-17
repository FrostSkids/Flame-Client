// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Arrays;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public abstract class TypeParameterMatcher
{
    private static final /* synthetic */ Object TEST_OBJECT;
    private static final /* synthetic */ int[] lIllIIllllllIl;
    private static final /* synthetic */ TypeParameterMatcher NOOP;
    private static final /* synthetic */ String[] lIllIIlllllIll;
    
    public static TypeParameterMatcher get(final Class<?> lllllllllllllIIIIIIIllIIlIIIIlII) {
        final Map<Class<?>, TypeParameterMatcher> lllllllllllllIIIIIIIllIIlIIIIllI = InternalThreadLocalMap.get().typeParameterMatcherGetCache();
        TypeParameterMatcher lllllllllllllIIIIIIIllIIlIIIIlIl = lllllllllllllIIIIIIIllIIlIIIIllI.get(lllllllllllllIIIIIIIllIIlIIIIlII);
        if (lllllIlllIIllII(lllllllllllllIIIIIIIllIIlIIIIlIl)) {
            if (lllllIlllIIllIl(lllllllllllllIIIIIIIllIIlIIIIlII, Object.class)) {
                lllllllllllllIIIIIIIllIIlIIIIlIl = TypeParameterMatcher.NOOP;
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            else if (lllllIlllIIlllI(PlatformDependent.hasJavassist() ? 1 : 0)) {
                try {
                    lllllllllllllIIIIIIIllIIlIIIIlIl = JavassistTypeParameterMatcherGenerator.generate(lllllllllllllIIIIIIIllIIlIIIIlII);
                    lllllllllllllIIIIIIIllIIlIIIIlIl.match(TypeParameterMatcher.TEST_OBJECT);
                    "".length();
                    "".length();
                    if ("   ".length() == " ".length()) {
                        return null;
                    }
                }
                catch (IllegalAccessError lllllllllllllIIIIIIIllIIlIIIlIIl) {
                    lllllllllllllIIIIIIIllIIlIIIIlIl = null;
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                }
                catch (Exception lllllllllllllIIIIIIIllIIlIIIlIII) {
                    lllllllllllllIIIIIIIllIIlIIIIlIl = null;
                }
            }
            if (lllllIlllIIllII(lllllllllllllIIIIIIIllIIlIIIIlIl)) {
                lllllllllllllIIIIIIIllIIlIIIIlIl = new ReflectiveMatcher(lllllllllllllIIIIIIIllIIlIIIIlII);
            }
            lllllllllllllIIIIIIIllIIlIIIIllI.put(lllllllllllllIIIIIIIllIIlIIIIlII, lllllllllllllIIIIIIIllIIlIIIIlIl);
            "".length();
        }
        return lllllllllllllIIIIIIIllIIlIIIIlIl;
    }
    
    private static boolean lllllIlllIIllII(final Object lllllllllllllIIIIIIIllIIIIIIIIll) {
        return lllllllllllllIIIIIIIllIIIIIIIIll == null;
    }
    
    public abstract boolean match(final Object p0);
    
    private static Class<?> fail(final Class<?> lllllllllllllIIIIIIIllIIIIlllIll, final String lllllllllllllIIIIIIIllIIIIllllII) {
        throw new IllegalStateException(String.valueOf(new StringBuilder().append(TypeParameterMatcher.lIllIIlllllIll[TypeParameterMatcher.lIllIIllllllIl[3]]).append(lllllllllllllIIIIIIIllIIIIllllII).append(TypeParameterMatcher.lIllIIlllllIll[TypeParameterMatcher.lIllIIllllllIl[4]]).append(lllllllllllllIIIIIIIllIIIIlllIll)));
    }
    
    private static boolean lllllIlllIIlllI(final int lllllllllllllIIIIIIIllIIIIIIIIIl) {
        return lllllllllllllIIIIIIIllIIIIIIIIIl != 0;
    }
    
    private static boolean lllllIlllIIllll(final int lllllllllllllIIIIIIIllIIIIIIlIlI, final int lllllllllllllIIIIIIIllIIIIIIlIIl) {
        return lllllllllllllIIIIIIIllIIIIIIlIlI < lllllllllllllIIIIIIIllIIIIIIlIIl;
    }
    
    private static boolean lllllIlllIIllIl(final Object lllllllllllllIIIIIIIllIIIIIIIllI, final Object lllllllllllllIIIIIIIllIIIIIIIlIl) {
        return lllllllllllllIIIIIIIllIIIIIIIllI == lllllllllllllIIIIIIIllIIIIIIIlIl;
    }
    
    static {
        lllllIlllIIlIll();
        lllllIlllIIlIII();
        NOOP = new NoOpTypeParameterMatcher();
        TEST_OBJECT = new Object();
    }
    
    private static void lllllIlllIIlIII() {
        (lIllIIlllllIll = new String[TypeParameterMatcher.lIllIIllllllIl[5]])[TypeParameterMatcher.lIllIIllllllIl[1]] = lllllIlllIIIllI("zUSoLLFbd6lUy5kI4k+XElJsfaeOhATgOv/XcltYhEo=", "fXQde");
        TypeParameterMatcher.lIllIIlllllIll[TypeParameterMatcher.lIllIIllllllIl[2]] = lllllIlllIIIlll("lnI3DALZWtU=", "EzytF");
        TypeParameterMatcher.lIllIIlllllIll[TypeParameterMatcher.lIllIIllllllIl[3]] = lllllIlllIIIlll("0NHo3+4yzqR3teJYiUcK7/niXkjZhTdO/vI2FtHKPfa1lrSYc3MdMCGKvoVqVURo2vk6D+1duXw=", "UVHPs");
        TypeParameterMatcher.lIllIIlllllIll[TypeParameterMatcher.lIllIIllllllIl[4]] = lllllIlllIIIlll("eOxLt3MySPo=", "bIZmC");
    }
    
    private static void lllllIlllIIlIll() {
        (lIllIIllllllIl = new int[7])[0] = -" ".length();
        TypeParameterMatcher.lIllIIllllllIl[1] = ((131 + 229 - 198 + 74 ^ 173 + 182 - 306 + 147) & (147 + 92 - 36 + 36 ^ 55 + 67 - 4 + 81 ^ -" ".length()));
        TypeParameterMatcher.lIllIIllllllIl[2] = " ".length();
        TypeParameterMatcher.lIllIIllllllIl[3] = "  ".length();
        TypeParameterMatcher.lIllIIllllllIl[4] = "   ".length();
        TypeParameterMatcher.lIllIIllllllIl[5] = (0x98 ^ 0x84 ^ (0x4C ^ 0x54));
        TypeParameterMatcher.lIllIIllllllIl[6] = (88 + 7 - 72 + 126 ^ 32 + 121 - 140 + 144);
    }
    
    protected TypeParameterMatcher() {
    }
    
    private static boolean lllllIlllIlIIIl(final int lllllllllllllIIIIIIIlIllllllllll) {
        return lllllllllllllIIIIIIIlIllllllllll == 0;
    }
    
    public static TypeParameterMatcher find(final Object lllllllllllllIIIIIIIllIIIllllIIl, final Class<?> lllllllllllllIIIIIIIllIIIlllIIIl, final String lllllllllllllIIIIIIIllIIIlllIlll) {
        final Map<Class<?>, Map<String, TypeParameterMatcher>> lllllllllllllIIIIIIIllIIIlllIllI = InternalThreadLocalMap.get().typeParameterMatcherFindCache();
        final Class<?> lllllllllllllIIIIIIIllIIIlllIlIl = lllllllllllllIIIIIIIllIIIllllIIl.getClass();
        Map<String, TypeParameterMatcher> lllllllllllllIIIIIIIllIIIlllIlII = lllllllllllllIIIIIIIllIIIlllIllI.get(lllllllllllllIIIIIIIllIIIlllIlIl);
        if (lllllIlllIIllII(lllllllllllllIIIIIIIllIIIlllIlII)) {
            lllllllllllllIIIIIIIllIIIlllIlII = new HashMap<String, TypeParameterMatcher>();
            lllllllllllllIIIIIIIllIIIlllIllI.put(lllllllllllllIIIIIIIllIIIlllIlIl, lllllllllllllIIIIIIIllIIIlllIlII);
            "".length();
        }
        TypeParameterMatcher lllllllllllllIIIIIIIllIIIlllIIll = lllllllllllllIIIIIIIllIIIlllIlII.get(lllllllllllllIIIIIIIllIIIlllIlll);
        if (lllllIlllIIllII(lllllllllllllIIIIIIIllIIIlllIIll)) {
            lllllllllllllIIIIIIIllIIIlllIIll = get(find0(lllllllllllllIIIIIIIllIIIllllIIl, lllllllllllllIIIIIIIllIIIlllIIIl, lllllllllllllIIIIIIIllIIIlllIlll));
            lllllllllllllIIIIIIIllIIIlllIlII.put(lllllllllllllIIIIIIIllIIIlllIlll, lllllllllllllIIIIIIIllIIIlllIIll);
            "".length();
        }
        return lllllllllllllIIIIIIIllIIIlllIIll;
    }
    
    private static String lllllIlllIIIllI(final String lllllllllllllIIIIIIIllIIIIIlllll, final String lllllllllllllIIIIIIIllIIIIIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIllIIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIllIIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIllIIIIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIllIIIIlIIlIl.init(TypeParameterMatcher.lIllIIllllllIl[3], lllllllllllllIIIIIIIllIIIIlIIlll);
            return new String(lllllllllllllIIIIIIIllIIIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIllIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIllIIIIlIIlII) {
            lllllllllllllIIIIIIIllIIIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static Class<?> find0(final Object lllllllllllllIIIIIIIllIIIlIlIlll, Class<?> lllllllllllllIIIIIIIllIIIlIlIIII, String lllllllllllllIIIIIIIllIIIlIIllll) {
        Class<?> lllllllllllllIIIIIIIllIIIlIlIIlI;
        final Class<?> lllllllllllllIIIIIIIllIIIlIlIIll = lllllllllllllIIIIIIIllIIIlIlIIlI = lllllllllllllIIIIIIIllIIIlIlIlll.getClass();
        while (true) {
            if (lllllIlllIIllIl(lllllllllllllIIIIIIIllIIIlIlIIlI.getSuperclass(), lllllllllllllIIIIIIIllIIIlIlIIII)) {
                int lllllllllllllIIIIIIIllIIIlIlllIl = TypeParameterMatcher.lIllIIllllllIl[0];
                final TypeVariable<?>[] lllllllllllllIIIIIIIllIIIlIlllII = lllllllllllllIIIIIIIllIIIlIlIIlI.getSuperclass().getTypeParameters();
                int lllllllllllllIIIIIIIllIIIllIIIII = TypeParameterMatcher.lIllIIllllllIl[1];
                while (lllllIlllIIllll(lllllllllllllIIIIIIIllIIIllIIIII, lllllllllllllIIIIIIIllIIIlIlllII.length)) {
                    if (lllllIlllIIlllI(lllllllllllllIIIIIIIllIIIlIIllll.equals(lllllllllllllIIIIIIIllIIIlIlllII[lllllllllllllIIIIIIIllIIIllIIIII].getName()) ? 1 : 0)) {
                        lllllllllllllIIIIIIIllIIIlIlllIl = lllllllllllllIIIIIIIllIIIllIIIII;
                        "".length();
                        if (((75 + 132 - 49 + 33 ^ 15 + 77 - 80 + 138) & (50 + 102 - 26 + 8 ^ 174 + 104 - 137 + 34 ^ -" ".length())) != 0x0) {
                            return null;
                        }
                        break;
                    }
                    else {
                        ++lllllllllllllIIIIIIIllIIIllIIIII;
                        "".length();
                        if (" ".length() <= 0) {
                            return null;
                        }
                        continue;
                    }
                }
                if (lllllIlllIlIIII(lllllllllllllIIIIIIIllIIIlIlllIl)) {
                    throw new IllegalStateException(String.valueOf(new StringBuilder().append(TypeParameterMatcher.lIllIIlllllIll[TypeParameterMatcher.lIllIIllllllIl[1]]).append(lllllllllllllIIIIIIIllIIIlIIllll).append(TypeParameterMatcher.lIllIIlllllIll[TypeParameterMatcher.lIllIIllllllIl[2]]).append(lllllllllllllIIIIIIIllIIIlIlIIII)));
                }
                final Type lllllllllllllIIIIIIIllIIIlIllIll = lllllllllllllIIIIIIIllIIIlIlIIlI.getGenericSuperclass();
                if (lllllIlllIlIIIl((lllllllllllllIIIIIIIllIIIlIllIll instanceof ParameterizedType) ? 1 : 0)) {
                    return Object.class;
                }
                final Type[] lllllllllllllIIIIIIIllIIIlIllIlI = ((ParameterizedType)lllllllllllllIIIIIIIllIIIlIllIll).getActualTypeArguments();
                Type lllllllllllllIIIIIIIllIIIlIllIII = lllllllllllllIIIIIIIllIIIlIllIlI[lllllllllllllIIIIIIIllIIIlIlllIl];
                if (lllllIlllIIlllI((lllllllllllllIIIIIIIllIIIlIllIII instanceof ParameterizedType) ? 1 : 0)) {
                    lllllllllllllIIIIIIIllIIIlIllIII = ((ParameterizedType)lllllllllllllIIIIIIIllIIIlIllIII).getRawType();
                }
                if (lllllIlllIIlllI((lllllllllllllIIIIIIIllIIIlIllIII instanceof Class) ? 1 : 0)) {
                    return (Class<?>)lllllllllllllIIIIIIIllIIIlIllIII;
                }
                if (lllllIlllIIlllI((lllllllllllllIIIIIIIllIIIlIllIII instanceof GenericArrayType) ? 1 : 0)) {
                    Type lllllllllllllIIIIIIIllIIIlIlllll = ((GenericArrayType)lllllllllllllIIIIIIIllIIIlIllIII).getGenericComponentType();
                    if (lllllIlllIIlllI((lllllllllllllIIIIIIIllIIIlIlllll instanceof ParameterizedType) ? 1 : 0)) {
                        lllllllllllllIIIIIIIllIIIlIlllll = ((ParameterizedType)lllllllllllllIIIIIIIllIIIlIlllll).getRawType();
                    }
                    if (lllllIlllIIlllI((lllllllllllllIIIIIIIllIIIlIlllll instanceof Class) ? 1 : 0)) {
                        return Array.newInstance((Class<?>)lllllllllllllIIIIIIIllIIIlIlllll, TypeParameterMatcher.lIllIIllllllIl[1]).getClass();
                    }
                }
                if (!lllllIlllIIlllI((lllllllllllllIIIIIIIllIIIlIllIII instanceof TypeVariable) ? 1 : 0)) {
                    return fail(lllllllllllllIIIIIIIllIIIlIlIIll, lllllllllllllIIIIIIIllIIIlIIllll);
                }
                final TypeVariable<?> lllllllllllllIIIIIIIllIIIlIllllI = (TypeVariable<?>)lllllllllllllIIIIIIIllIIIlIllIII;
                lllllllllllllIIIIIIIllIIIlIlIIlI = lllllllllllllIIIIIIIllIIIlIlIIll;
                if (lllllIlllIlIIIl((lllllllllllllIIIIIIIllIIIlIllllI.getGenericDeclaration() instanceof Class) ? 1 : 0)) {
                    return Object.class;
                }
                lllllllllllllIIIIIIIllIIIlIlIIII = (Class<?>)lllllllllllllIIIIIIIllIIIlIllllI.getGenericDeclaration();
                lllllllllllllIIIIIIIllIIIlIIllll = lllllllllllllIIIIIIIllIIIlIllllI.getName();
                if (!lllllIlllIIlllI(lllllllllllllIIIIIIIllIIIlIlIIII.isAssignableFrom(lllllllllllllIIIIIIIllIIIlIlIIll) ? 1 : 0)) {
                    return Object.class;
                }
                "".length();
                if ("   ".length() < "  ".length()) {
                    return null;
                }
                continue;
            }
            else {
                lllllllllllllIIIIIIIllIIIlIlIIlI = lllllllllllllIIIIIIIllIIIlIlIIlI.getSuperclass();
                if (lllllIlllIIllII(lllllllllllllIIIIIIIllIIIlIlIIlI)) {
                    return fail(lllllllllllllIIIIIIIllIIIlIlIIll, lllllllllllllIIIIIIIllIIIlIIllll);
                }
                continue;
            }
        }
    }
    
    private static boolean lllllIlllIlIIII(final int lllllllllllllIIIIIIIlIllllllllIl) {
        return lllllllllllllIIIIIIIlIllllllllIl < 0;
    }
    
    private static String lllllIlllIIIlll(final String lllllllllllllIIIIIIIllIIIIIlIIlI, final String lllllllllllllIIIIIIIllIIIIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIllIIIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIllIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), TypeParameterMatcher.lIllIIllllllIl[6]), "DES");
            final Cipher lllllllllllllIIIIIIIllIIIIIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIllIIIIIlIlII.init(TypeParameterMatcher.lIllIIllllllIl[3], lllllllllllllIIIIIIIllIIIIIlIlIl);
            return new String(lllllllllllllIIIIIIIllIIIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIllIIIIIlIIll) {
            lllllllllllllIIIIIIIllIIIIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static final class ReflectiveMatcher extends TypeParameterMatcher
    {
        private final /* synthetic */ Class<?> type;
        
        @Override
        public boolean match(final Object llllllllllllIllllllIllIlIIlllllI) {
            return this.type.isInstance(llllllllllllIllllllIllIlIIlllllI);
        }
        
        ReflectiveMatcher(final Class<?> llllllllllllIllllllIllIlIlIIIlII) {
            this.type = llllllllllllIllllllIllIlIlIIIlII;
        }
    }
}
