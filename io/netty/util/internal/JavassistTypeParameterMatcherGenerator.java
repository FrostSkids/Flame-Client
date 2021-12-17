// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import javassist.NotFoundException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.lang.reflect.Method;
import javassist.CtClass;
import javassist.ClassPath;
import javassist.ClassClassPath;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLogger;
import javassist.ClassPool;

public final class JavassistTypeParameterMatcherGenerator
{
    private static final /* synthetic */ int[] lIIlIIIIIllIlI;
    private static final /* synthetic */ String[] lIIlIIIIIllIIl;
    private static final /* synthetic */ ClassPool classPool;
    private static final /* synthetic */ InternalLogger logger;
    
    private static String llIIlIIlIIlIlll(String lllllllllllllIIlllIlllIlIllIlIlI, final String lllllllllllllIIlllIlllIlIllIlIIl) {
        lllllllllllllIIlllIlllIlIllIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlllIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIlllIlIllIllIl = new StringBuilder();
        final char[] lllllllllllllIIlllIlllIlIllIllII = lllllllllllllIIlllIlllIlIllIlIIl.toCharArray();
        int lllllllllllllIIlllIlllIlIllIlIll = JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[0];
        final String lllllllllllllIIlllIlllIlIllIIlIl = (Object)lllllllllllllIIlllIlllIlIllIlIlI.toCharArray();
        final int lllllllllllllIIlllIlllIlIllIIlII = lllllllllllllIIlllIlllIlIllIIlIl.length;
        short lllllllllllllIIlllIlllIlIllIIIll = (short)JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[0];
        while (llIIlIIlIIllllI(lllllllllllllIIlllIlllIlIllIIIll, lllllllllllllIIlllIlllIlIllIIlII)) {
            final char lllllllllllllIIlllIlllIlIlllIIII = lllllllllllllIIlllIlllIlIllIIlIl[lllllllllllllIIlllIlllIlIllIIIll];
            lllllllllllllIIlllIlllIlIllIllIl.append((char)(lllllllllllllIIlllIlllIlIlllIIII ^ lllllllllllllIIlllIlllIlIllIllII[lllllllllllllIIlllIlllIlIllIlIll % lllllllllllllIIlllIlllIlIllIllII.length]));
            "".length();
            ++lllllllllllllIIlllIlllIlIllIlIll;
            ++lllllllllllllIIlllIlllIlIllIIIll;
            "".length();
            if ((0x73 ^ 0x4 ^ (0xFE ^ 0x8D)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIlllIlIllIllIl);
    }
    
    static {
        llIIlIIlIIllIlI();
        llIIlIIlIIllIIl();
        logger = InternalLoggerFactory.getInstance(JavassistTypeParameterMatcherGenerator.class);
        (classPool = new ClassPool((boolean)(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1] != 0))).appendClassPath((ClassPath)new ClassClassPath((Class)NoOpTypeParameterMatcher.class));
        "".length();
    }
    
    public static TypeParameterMatcher generate(final Class<?> lllllllllllllIIlllIlllIllIIIlIll, final ClassLoader lllllllllllllIIlllIlllIllIIIIllI) {
        final String lllllllllllllIIlllIlllIllIIIlIIl = typeName(lllllllllllllIIlllIlllIllIIIlIll);
        final String lllllllllllllIIlllIlllIllIIIlIII = String.valueOf(new StringBuilder().append(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[0]]).append(lllllllllllllIIlllIlllIllIIIlIIl).append(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1]]));
        try {
            try {
                return (TypeParameterMatcher)Class.forName(lllllllllllllIIlllIlllIllIIIlIII, (boolean)(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1] != 0), lllllllllllllIIlllIlllIllIIIIllI).newInstance();
            }
            catch (Exception lllllllllllllIIlllIlllIllIIlIIlI) {
                final CtClass lllllllllllllIIlllIlllIllIIlIIIl = JavassistTypeParameterMatcherGenerator.classPool.getAndRename(NoOpTypeParameterMatcher.class.getName(), lllllllllllllIIlllIlllIllIIIlIII);
                lllllllllllllIIlllIlllIllIIlIIIl.setModifiers(lllllllllllllIIlllIlllIllIIlIIIl.getModifiers() | JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[2]);
                lllllllllllllIIlllIlllIllIIlIIIl.getDeclaredMethod(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[3]]).setBody(String.valueOf(new StringBuilder().append(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[4]]).append(lllllllllllllIIlllIlllIllIIIlIIl).append(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[5]])));
                final byte[] lllllllllllllIIlllIlllIllIIlIIII = lllllllllllllIIlllIlllIllIIlIIIl.toBytecode();
                lllllllllllllIIlllIlllIllIIlIIIl.detach();
                final Class<ClassLoader> clazz = ClassLoader.class;
                final String name = JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[6]];
                final Class[] parameterTypes = new Class[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[5]];
                parameterTypes[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[0]] = String.class;
                parameterTypes[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1]] = byte[].class;
                parameterTypes[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[3]] = Integer.TYPE;
                parameterTypes[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[4]] = Integer.TYPE;
                final Method lllllllllllllIIlllIlllIllIIIllll = clazz.getDeclaredMethod(name, (Class[])parameterTypes);
                lllllllllllllIIlllIlllIllIIIllll.setAccessible((boolean)(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1] != 0));
                final Method method = lllllllllllllIIlllIlllIllIIIllll;
                final Object[] args = new Object[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[5]];
                args[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[0]] = lllllllllllllIIlllIlllIllIIIlIII;
                args[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1]] = lllllllllllllIIlllIlllIllIIlIIII;
                args[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[3]] = JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[0];
                args[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[4]] = lllllllllllllIIlllIlllIllIIlIIII.length;
                final Class<?> lllllllllllllIIlllIlllIllIIIlllI = (Class<?>)method.invoke(lllllllllllllIIlllIlllIllIIIIllI, args);
                if (llIIlIIlIIlllII(lllllllllllllIIlllIlllIllIIIlIll, Object.class)) {
                    JavassistTypeParameterMatcherGenerator.logger.debug(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[7]], lllllllllllllIIlllIlllIllIIIlllI.getName());
                }
                return (TypeParameterMatcher)lllllllllllllIIlllIlllIllIIIlllI.newInstance();
            }
        }
        catch (RuntimeException lllllllllllllIIlllIlllIllIIIllIl) {
            throw lllllllllllllIIlllIlllIllIIIllIl;
        }
        catch (Exception lllllllllllllIIlllIlllIllIIIllII) {
            throw new RuntimeException(lllllllllllllIIlllIlllIllIIIllII);
        }
    }
    
    private static boolean llIIlIIlIIllIll(final Object lllllllllllllIIlllIlllIlIlIIlIll) {
        return lllllllllllllIIlllIlllIlIlIIlIll == null;
    }
    
    public static void appendClassPath(final ClassPath lllllllllllllIIlllIlllIllIlIIlII) {
        JavassistTypeParameterMatcherGenerator.classPool.appendClassPath(lllllllllllllIIlllIlllIllIlIIlII);
        "".length();
    }
    
    private static void llIIlIIlIIllIlI() {
        (lIIlIIIIIllIlI = new int[10])[0] = ((0x7F ^ 0x6A) & ~(0x96 ^ 0x83));
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1] = " ".length();
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[2] = ("  ".length() ^ (0x15 ^ 0x7));
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[3] = "  ".length();
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[4] = "   ".length();
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[5] = (0x3A ^ 0x3E);
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[6] = (0xA ^ 0x1E ^ (0x19 ^ 0x8));
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[7] = (128 + 112 - 175 + 69 ^ 111 + 73 - 90 + 34);
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[8] = (0xFB ^ 0xC7 ^ (0x9F ^ 0xA4));
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[9] = (0xA8 ^ 0xA0);
    }
    
    private static String typeName(final Class<?> lllllllllllllIIlllIlllIlIllllllI) {
        if (llIIlIIlIIlllIl(lllllllllllllIIlllIlllIlIllllllI.isArray() ? 1 : 0)) {
            return String.valueOf(new StringBuilder().append(typeName(lllllllllllllIIlllIlllIlIllllllI.getComponentType())).append(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[8]]));
        }
        return lllllllllllllIIlllIlllIlIllllllI.getName();
    }
    
    private static boolean llIIlIIlIIllllI(final int lllllllllllllIIlllIlllIlIlIlIIlI, final int lllllllllllllIIlllIlllIlIlIlIIIl) {
        return lllllllllllllIIlllIlllIlIlIlIIlI < lllllllllllllIIlllIlllIlIlIlIIIl;
    }
    
    private static void llIIlIIlIIllIIl() {
        (lIIlIIIIIllIIl = new String[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[9]])[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[0]] = llIIlIIlIIlIlll("KyNlIjI2ODJiIjYlJ2I+LDguPjkjIGUTCC8tPy8/Jz44Ewhs", "BLKLW");
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[1]] = llIIlIIlIIlIlll("GRgxBA0xCw==", "TyEge");
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[3]] = llIIlIIlIIlIlll("LwYSFBg=", "Bgfwp");
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[4]] = llIIlIIlIIllIII("CYc9z7LYRoppmZUXBJW11bzfKQymk6Bh", "uWPFk");
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[5]] = llIIlIIlIIllIII("EN38Nn6OCIQ=", "ZjmUS");
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[6]] = llIIlIIlIIlIlll("Aw8BCC8CKQsAMhQ=", "gjgaA");
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[7]] = llIIlIIlIIllIII("wWhjQ2BsijwWM3x3lJhhMw==", "hEZpO");
        JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIIl[JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[8]] = llIIlIIlIIlIlll("Fw0=", "LPAtc");
    }
    
    private static boolean llIIlIIlIIlllII(final Object lllllllllllllIIlllIlllIlIlIIlllI, final Object lllllllllllllIIlllIlllIlIlIIllIl) {
        return lllllllllllllIIlllIlllIlIlIIlllI != lllllllllllllIIlllIlllIlIlIIllIl;
    }
    
    private JavassistTypeParameterMatcherGenerator() {
    }
    
    private static String llIIlIIlIIllIII(final String lllllllllllllIIlllIlllIlIlIllIII, final String lllllllllllllIIlllIlllIlIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlllIlIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[9]), "DES");
            final Cipher lllllllllllllIIlllIlllIlIlIlllII = Cipher.getInstance("DES");
            lllllllllllllIIlllIlllIlIlIlllII.init(JavassistTypeParameterMatcherGenerator.lIIlIIIIIllIlI[3], lllllllllllllIIlllIlllIlIlIlllIl);
            return new String(lllllllllllllIIlllIlllIlIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlllIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlllIlIlIllIll) {
            lllllllllllllIIlllIlllIlIlIllIll.printStackTrace();
            return null;
        }
    }
    
    public static void appendClassPath(final String lllllllllllllIIlllIlllIllIlIIIlI) throws NotFoundException {
        JavassistTypeParameterMatcherGenerator.classPool.appendClassPath(lllllllllllllIIlllIlllIllIlIIIlI);
        "".length();
    }
    
    public static TypeParameterMatcher generate(final Class<?> lllllllllllllIIlllIlllIllIIlllII) {
        ClassLoader lllllllllllllIIlllIlllIllIIlllIl = PlatformDependent.getContextClassLoader();
        if (llIIlIIlIIllIll(lllllllllllllIIlllIlllIllIIlllIl)) {
            lllllllllllllIIlllIlllIllIIlllIl = PlatformDependent.getSystemClassLoader();
        }
        return generate(lllllllllllllIIlllIlllIllIIlllII, lllllllllllllIIlllIlllIllIIlllIl);
    }
    
    private static boolean llIIlIIlIIlllIl(final int lllllllllllllIIlllIlllIlIlIIlIIl) {
        return lllllllllllllIIlllIlllIlIlIIlIIl != 0;
    }
}
