// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.xml;

import java.lang.reflect.InvocationTargetException;
import org.newdawn.slick.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.lang.reflect.Method;
import java.io.InputStream;
import org.newdawn.slick.util.ResourceLoader;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

public class ObjectTreeParser
{
    private static final /* synthetic */ int[] lIIllllIlIllll;
    private static final /* synthetic */ String[] lIIllllIlIlIII;
    private /* synthetic */ HashMap nameToClass;
    private /* synthetic */ String addMethod;
    private /* synthetic */ ArrayList ignored;
    private /* synthetic */ String defaultPackage;
    
    private Class mapPrimitive(final Class lllllllllllllIIlIIlIIlllIlllllIl) {
        if (llIllllIIIlIlll(lllllllllllllIIlIIlIIlllIlllllIl, Integer.TYPE)) {
            return Integer.class;
        }
        if (llIllllIIIlIlll(lllllllllllllIIlIIlIIlllIlllllIl, Double.TYPE)) {
            return Double.class;
        }
        if (llIllllIIIlIlll(lllllllllllllIIlIIlIIlllIlllllIl, Float.TYPE)) {
            return Float.class;
        }
        if (llIllllIIIlIlll(lllllllllllllIIlIIlIIlllIlllllIl, Boolean.TYPE)) {
            return Boolean.class;
        }
        if (llIllllIIIlIlll(lllllllllllllIIlIIlIIlllIlllllIl, Long.TYPE)) {
            return Long.class;
        }
        throw new RuntimeException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[20]]).append(lllllllllllllIIlIIlIIlllIlllllIl)));
    }
    
    private static String llIllllIIIIIIIl(final String lllllllllllllIIlIIlIIllIlllllIII, final String lllllllllllllIIlIIlIIllIllllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIllIlllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIllIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIIllIlllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIIllIlllllIlI.init(ObjectTreeParser.lIIllllIlIllll[2], lllllllllllllIIlIIlIIllIlllllIll);
            return new String(lllllllllllllIIlIIlIIllIlllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIllIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIllIlllllIIl) {
            lllllllllllllIIlIIlIIllIlllllIIl.printStackTrace();
            return null;
        }
    }
    
    public void setDefaultPackage(final String lllllllllllllIIlIIlIlIIIIIIIIIII) {
        this.defaultPackage = lllllllllllllIIlIIlIlIIIIIIIIIII;
    }
    
    private static boolean llIllllIIIlIIll(final Object lllllllllllllIIlIIlIIllIllIlllII) {
        return lllllllllllllIIlIIlIIllIllIlllII != null;
    }
    
    public void addIgnoredElement(final String lllllllllllllIIlIIlIlIIIIIIIllII) {
        this.ignored.add(lllllllllllllIIlIIlIlIIIIIIIllII);
        "".length();
    }
    
    public Object parseOnto(final String lllllllllllllIIlIIlIIllllllIIIll, final Object lllllllllllllIIlIIlIIllllllIIlIl) throws SlickXMLException {
        return this.parseOnto(lllllllllllllIIlIIlIIllllllIIIll, ResourceLoader.getResourceAsStream(lllllllllllllIIlIIlIIllllllIIIll), lllllllllllllIIlIIlIIllllllIIlIl);
    }
    
    private Object traverse(final XMLElement lllllllllllllIIlIIlIIllllIlllllI) throws SlickXMLException {
        return this.traverse(lllllllllllllIIlIIlIIllllIlllllI, null);
    }
    
    public Object parse(final String lllllllllllllIIlIIlIIlllllllIIll, final InputStream lllllllllllllIIlIIlIIlllllllIIlI) throws SlickXMLException {
        final XMLParser lllllllllllllIIlIIlIIlllllllIIIl = new XMLParser();
        final XMLElement lllllllllllllIIlIIlIIlllllllIIII = lllllllllllllIIlIIlIIlllllllIIIl.parse(lllllllllllllIIlIIlIIlllllllIIll, lllllllllllllIIlIIlIIlllllllIIlI);
        return this.traverse(lllllllllllllIIlIIlIIlllllllIIII);
    }
    
    private Method findMethod(final Class lllllllllllllIIlIIlIIlllIlIIllIl, final String lllllllllllllIIlIIlIIlllIlIlIIII, final Class lllllllllllllIIlIIlIIlllIlIIlIll) {
        final Method[] lllllllllllllIIlIIlIIlllIlIIlllI = lllllllllllllIIlIIlIIlllIlIIllIl.getDeclaredMethods();
        int lllllllllllllIIlIIlIIlllIlIlIIll = ObjectTreeParser.lIIllllIlIllll[0];
        while (llIllllIIIlIllI(lllllllllllllIIlIIlIIlllIlIlIIll, lllllllllllllIIlIIlIIlllIlIIlllI.length)) {
            if (llIllllIIIlIlII(lllllllllllllIIlIIlIIlllIlIIlllI[lllllllllllllIIlIIlIIlllIlIlIIll].getName().equalsIgnoreCase(lllllllllllllIIlIIlIIlllIlIlIIII) ? 1 : 0)) {
                final Method lllllllllllllIIlIIlIIlllIlIlIlIl = lllllllllllllIIlIIlIIlllIlIIlllI[lllllllllllllIIlIIlIIlllIlIlIIll];
                final Class[] lllllllllllllIIlIIlIIlllIlIlIlII = lllllllllllllIIlIIlIIlllIlIlIlIl.getParameterTypes();
                if (llIllllIIIllIII(lllllllllllllIIlIIlIIlllIlIlIlII.length, ObjectTreeParser.lIIllllIlIllll[1]) && llIllllIIIlIlII(lllllllllllllIIlIIlIIlllIlIlIlIl.getParameterTypes()[ObjectTreeParser.lIIllllIlIllll[0]].isAssignableFrom(lllllllllllllIIlIIlIIlllIlIIlIll) ? 1 : 0)) {
                    return lllllllllllllIIlIIlIIlllIlIlIlIl;
                }
            }
            ++lllllllllllllIIlIIlIIlllIlIlIIll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return null;
    }
    
    private Method getMethod(final Class lllllllllllllIIlIIlIIlllIIIllIll, final String lllllllllllllIIlIIlIIlllIIIlllIl, final Class[] lllllllllllllIIlIIlIIlllIIIllIIl) {
        try {
            return lllllllllllllIIlIIlIIlllIIIllIll.getMethod(lllllllllllllIIlIIlIIlllIIIlllIl, (Class[])lllllllllllllIIlIIlIIlllIIIllIIl);
        }
        catch (SecurityException lllllllllllllIIlIIlIIlllIIlIIIIl) {
            return null;
        }
        catch (NoSuchMethodException lllllllllllllIIlIIlIIlllIIlIIIII) {
            return null;
        }
    }
    
    public void setAddMethodName(final String lllllllllllllIIlIIlIlIIIIIIIIllI) {
        this.addMethod = lllllllllllllIIlIIlIlIIIIIIIIllI;
    }
    
    private static boolean llIllllIIIllIII(final int lllllllllllllIIlIIlIIllIlllIIIll, final int lllllllllllllIIlIIlIIllIlllIIIlI) {
        return lllllllllllllIIlIIlIIllIlllIIIll == lllllllllllllIIlIIlIIllIlllIIIlI;
    }
    
    private static String llIllllIIIIIIll(final String lllllllllllllIIlIIlIIllIlllIlIll, final String lllllllllllllIIlIIlIIllIlllIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIllIlllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIllIlllIlIII.getBytes(StandardCharsets.UTF_8)), ObjectTreeParser.lIIllllIlIllll[8]), "DES");
            final Cipher lllllllllllllIIlIIlIIllIlllIllIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIIllIlllIllIl.init(ObjectTreeParser.lIIllllIlIllll[2], lllllllllllllIIlIIlIIllIlllIlllI);
            return new String(lllllllllllllIIlIIlIIllIlllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIllIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIllIlllIllII) {
            lllllllllllllIIlIIlIIllIlllIllII.printStackTrace();
            return null;
        }
    }
    
    private Object typeValue(final String lllllllllllllIIlIIlIIllllIIIIIll, Class lllllllllllllIIlIIlIIllllIIIIIlI) throws SlickXMLException {
        if (llIllllIIIlIlll(lllllllllllllIIlIIlIIllllIIIIIlI, String.class)) {
            return lllllllllllllIIlIIlIIllllIIIIIll;
        }
        try {
            final Class mapPrimitive;
            lllllllllllllIIlIIlIIllllIIIIIlI = (mapPrimitive = this.mapPrimitive(lllllllllllllIIlIIlIIllllIIIIIlI));
            final Class[] parameterTypes = new Class[ObjectTreeParser.lIIllllIlIllll[1]];
            parameterTypes[ObjectTreeParser.lIIllllIlIllll[0]] = String.class;
            final Constructor<Object> constructor = mapPrimitive.getConstructor((Class<?>[])parameterTypes);
            final Object[] initargs = new Object[ObjectTreeParser.lIIllllIlIllll[1]];
            initargs[ObjectTreeParser.lIIllllIlIllll[0]] = lllllllllllllIIlIIlIIllllIIIIIll;
            return constructor.newInstance(initargs);
        }
        catch (Exception lllllllllllllIIlIIlIIllllIIIlIII) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[18]]).append(lllllllllllllIIlIIlIIllllIIIIIll).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[19]]).append(lllllllllllllIIlIIlIIllllIIIIIlI)), lllllllllllllIIlIIlIIllllIIIlIII);
        }
    }
    
    private Field findField(final Class lllllllllllllIIlIIlIIlllIlllIIll, final String lllllllllllllIIlIIlIIlllIlllIlIl) {
        final Field[] lllllllllllllIIlIIlIIlllIlllIlII = lllllllllllllIIlIIlIIlllIlllIIll.getDeclaredFields();
        int lllllllllllllIIlIIlIIlllIllllIII = ObjectTreeParser.lIIllllIlIllll[0];
        while (llIllllIIIlIllI(lllllllllllllIIlIIlIIlllIllllIII, lllllllllllllIIlIIlIIlllIlllIlII.length)) {
            if (llIllllIIIlIlII(lllllllllllllIIlIIlIIlllIlllIlII[lllllllllllllIIlIIlIIlllIllllIII].getName().equalsIgnoreCase(lllllllllllllIIlIIlIIlllIlllIlIl) ? 1 : 0)) {
                if (llIllllIIIlIlII(lllllllllllllIIlIIlIIlllIlllIlII[lllllllllllllIIlIIlIIlllIllllIII].getType().isPrimitive() ? 1 : 0)) {
                    return lllllllllllllIIlIIlIIlllIlllIlII[lllllllllllllIIlIIlIIlllIllllIII];
                }
                if (llIllllIIIlIlll(lllllllllllllIIlIIlIIlllIlllIlII[lllllllllllllIIlIIlIIlllIllllIII].getType(), String.class)) {
                    return lllllllllllllIIlIIlIIlllIlllIlII[lllllllllllllIIlIIlIIlllIllllIII];
                }
            }
            ++lllllllllllllIIlIIlIIlllIllllIII;
            "".length();
            if ((0x56 ^ 0x52) == -" ".length()) {
                return null;
            }
        }
        return null;
    }
    
    private static boolean llIllllIIIlIlII(final int lllllllllllllIIlIIlIIllIllIlIlII) {
        return lllllllllllllIIlIIlIIllIllIlIlII != 0;
    }
    
    private static void llIllllIIIlIIlI() {
        (lIIllllIlIllll = new int[32])[0] = ((28 + 22 - 25 + 156 ^ 80 + 118 - 80 + 18) & (0x27 ^ 0x1E ^ (0x96 ^ 0x92) ^ -" ".length()));
        ObjectTreeParser.lIIllllIlIllll[1] = " ".length();
        ObjectTreeParser.lIIllllIlIllll[2] = "  ".length();
        ObjectTreeParser.lIIllllIlIllll[3] = "   ".length();
        ObjectTreeParser.lIIllllIlIllll[4] = (8 + 77 + 47 + 54 ^ 62 + 8 + 58 + 62);
        ObjectTreeParser.lIIllllIlIllll[5] = (0x7B ^ 0x7E);
        ObjectTreeParser.lIIllllIlIllll[6] = (0xE7 ^ 0xC2 ^ (0x9C ^ 0xBF));
        ObjectTreeParser.lIIllllIlIllll[7] = (0xAF ^ 0xA8);
        ObjectTreeParser.lIIllllIlIllll[8] = (0x67 ^ 0x12 ^ (0xD4 ^ 0xA9));
        ObjectTreeParser.lIIllllIlIllll[9] = (0x28 ^ 0x30 ^ (0xA9 ^ 0xB8));
        ObjectTreeParser.lIIllllIlIllll[10] = (0x40 ^ 0x4A);
        ObjectTreeParser.lIIllllIlIllll[11] = (0x4A ^ 0x41);
        ObjectTreeParser.lIIllllIlIllll[12] = (0x6A ^ 0x5F ^ (0x71 ^ 0x48));
        ObjectTreeParser.lIIllllIlIllll[13] = (0xF8 ^ 0x9A ^ (0x0 ^ 0x6F));
        ObjectTreeParser.lIIllllIlIllll[14] = (0x73 ^ 0x2F ^ (0xCA ^ 0x98));
        ObjectTreeParser.lIIllllIlIllll[15] = (0x71 ^ 0x7E);
        ObjectTreeParser.lIIllllIlIllll[16] = (0x41 ^ 0x8 ^ (0xF8 ^ 0xA1));
        ObjectTreeParser.lIIllllIlIllll[17] = (0xB4 ^ 0xA5);
        ObjectTreeParser.lIIllllIlIllll[18] = (0x83 ^ 0x96 ^ (0x98 ^ 0x9F));
        ObjectTreeParser.lIIllllIlIllll[19] = (0x2F ^ 0x3C);
        ObjectTreeParser.lIIllllIlIllll[20] = (0x1D ^ 0x9);
        ObjectTreeParser.lIIllllIlIllll[21] = (129 + 83 - 165 + 110 ^ 28 + 29 + 49 + 30);
        ObjectTreeParser.lIIllllIlIllll[22] = (77 + 4 - 66 + 158 ^ 7 + 170 - 86 + 96);
        ObjectTreeParser.lIIllllIlIllll[23] = (0x6C ^ 0x7B);
        ObjectTreeParser.lIIllllIlIllll[24] = (0xB6 ^ 0xAE);
        ObjectTreeParser.lIIllllIlIllll[25] = (119 + 103 - 213 + 142 ^ 124 + 55 - 105 + 68);
        ObjectTreeParser.lIIllllIlIllll[26] = (0xC0 ^ 0x8E ^ (0xFB ^ 0xAF));
        ObjectTreeParser.lIIllllIlIllll[27] = (0x31 ^ 0x1E ^ (0x48 ^ 0x7C));
        ObjectTreeParser.lIIllllIlIllll[28] = (0x21 ^ 0x3D);
        ObjectTreeParser.lIIllllIlIllll[29] = (158 + 35 - 62 + 36 ^ 71 + 182 - 99 + 32);
        ObjectTreeParser.lIIllllIlIllll[30] = (0x2B ^ 0x35);
        ObjectTreeParser.lIIllllIlIllll[31] = (77 + 110 - 25 + 14 ^ 120 + 164 - 172 + 63);
    }
    
    public ObjectTreeParser() {
        this.nameToClass = new HashMap();
        this.ignored = new ArrayList();
        this.addMethod = ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[0]];
    }
    
    static {
        llIllllIIIlIIlI();
        llIllllIIIIlIIl();
    }
    
    public Object parse(final String lllllllllllllIIlIIlIIllllllllIlI) throws SlickXMLException {
        return this.parse(lllllllllllllIIlIIlIIllllllllIlI, ResourceLoader.getResourceAsStream(lllllllllllllIIlIIlIIllllllllIlI));
    }
    
    public void addElementMapping(final String lllllllllllllIIlIIlIlIIIIIIlIIll, final Class lllllllllllllIIlIIlIlIIIIIIlIlIl) {
        this.nameToClass.put(lllllllllllllIIlIIlIlIIIIIIlIIll, lllllllllllllIIlIIlIlIIIIIIlIlIl);
        "".length();
    }
    
    public Object parseOnto(final String lllllllllllllIIlIIlIIlllllIllIlI, final InputStream lllllllllllllIIlIIlIIlllllIlIIll, final Object lllllllllllllIIlIIlIIlllllIllIII) throws SlickXMLException {
        final XMLParser lllllllllllllIIlIIlIIlllllIlIlll = new XMLParser();
        final XMLElement lllllllllllllIIlIIlIIlllllIlIllI = lllllllllllllIIlIIlIIlllllIlIlll.parse(lllllllllllllIIlIIlIIlllllIllIlI, lllllllllllllIIlIIlIIlllllIlIIll);
        return this.traverse(lllllllllllllIIlIIlIIlllllIlIllI, lllllllllllllIIlIIlIIlllllIllIII);
    }
    
    private Method findMethod(final Class lllllllllllllIIlIIlIIlllIllIIIlI, final String lllllllllllllIIlIIlIIlllIllIIlII) {
        final Method[] lllllllllllllIIlIIlIIlllIllIIIll = lllllllllllllIIlIIlIIlllIllIIIlI.getDeclaredMethods();
        int lllllllllllllIIlIIlIIlllIllIIlll = ObjectTreeParser.lIIllllIlIllll[0];
        while (llIllllIIIlIllI(lllllllllllllIIlIIlIIlllIllIIlll, lllllllllllllIIlIIlIIlllIllIIIll.length)) {
            if (llIllllIIIlIlII(lllllllllllllIIlIIlIIlllIllIIIll[lllllllllllllIIlIIlIIlllIllIIlll].getName().equalsIgnoreCase(lllllllllllllIIlIIlIIlllIllIIlII) ? 1 : 0)) {
                final Method lllllllllllllIIlIIlIIlllIllIlIIl = lllllllllllllIIlIIlIIlllIllIIIll[lllllllllllllIIlIIlIIlllIllIIlll];
                final Class[] lllllllllllllIIlIIlIIlllIllIlIII = lllllllllllllIIlIIlIIlllIllIlIIl.getParameterTypes();
                if (llIllllIIIllIII(lllllllllllllIIlIIlIIlllIllIlIII.length, ObjectTreeParser.lIIllllIlIllll[1])) {
                    return lllllllllllllIIlIIlIIlllIllIlIIl;
                }
            }
            ++lllllllllllllIIlIIlIIlllIllIIlll;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return null;
    }
    
    private Class getClassForElementName(final String lllllllllllllIIlIIlIIlllllIIlIIl) {
        final Class lllllllllllllIIlIIlIIlllllIIlIII = this.nameToClass.get(lllllllllllllIIlIIlIIlllllIIlIIl);
        if (llIllllIIIlIIll(lllllllllllllIIlIIlIIlllllIIlIII)) {
            return lllllllllllllIIlIIlIIlllllIIlIII;
        }
        if (llIllllIIIlIIll(this.defaultPackage)) {
            try {
                return Class.forName(String.valueOf(new StringBuilder().append(this.defaultPackage).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[2]]).append(lllllllllllllIIlIIlIIlllllIIlIIl)));
            }
            catch (ClassNotFoundException ex) {}
        }
        return null;
    }
    
    private Object traverse(final XMLElement lllllllllllllIIlIIlIIllllIIlllII, Object lllllllllllllIIlIIlIIllllIIlIllI) throws SlickXMLException {
        final String lllllllllllllIIlIIlIIllllIIllIlI = lllllllllllllIIlIIlIIllllIIlllII.getName();
        if (llIllllIIIlIlII(this.ignored.contains(lllllllllllllIIlIIlIIllllIIllIlI) ? 1 : 0)) {
            return null;
        }
        Class lllllllllllllIIlIIlIIllllIIllIIl = null;
        if (llIllllIIIlIlIl(lllllllllllllIIlIIlIIllllIIlIllI)) {
            final Class lllllllllllllIIlIIlIIllllIllIIIl = this.getClassForElementName(lllllllllllllIIlIIlIIllllIIllIlI);
            "".length();
            if (((36 + 88 - 7 + 69 ^ 10 + 7 + 148 + 25) & (0x4 ^ 0x9 ^ (0x4D ^ 0x44) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            lllllllllllllIIlIIlIIllllIIllIIl = lllllllllllllIIlIIlIIllllIIlIllI.getClass();
        }
        if (llIllllIIIlIlIl(lllllllllllllIIlIIlIIllllIIllIIl)) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[3]]).append(lllllllllllllIIlIIlIIllllIIllIlI).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[4]])));
        }
        try {
            if (llIllllIIIlIlIl(lllllllllllllIIlIIlIIllllIIlIllI)) {
                lllllllllllllIIlIIlIIllllIIlIllI = lllllllllllllIIlIIlIIllllIIllIIl.newInstance();
                final Class lllllllllllllIIlIIlIIlllIIIllIll = lllllllllllllIIlIIlIIllllIIllIIl;
                final String lllllllllllllIIlIIlIIlllIIIlllIl = ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[5]];
                final Class[] lllllllllllllIIlIIlIIlllIIIllIIl = new Class[ObjectTreeParser.lIIllllIlIllll[1]];
                lllllllllllllIIlIIlIIlllIIIllIIl[ObjectTreeParser.lIIllllIlIllll[0]] = String.class;
                final Method lllllllllllllIIlIIlIIllllIllIIII = this.getMethod(lllllllllllllIIlIIlIIlllIIIllIll, lllllllllllllIIlIIlIIlllIIIlllIl, lllllllllllllIIlIIlIIlllIIIllIIl);
                if (llIllllIIIlIIll(lllllllllllllIIlIIlIIllllIllIIII)) {
                    final Method lllllllllllllIIlIIlIIlllIIlIllIl = lllllllllllllIIlIIlIIllllIllIIII;
                    final Object lllllllllllllIIlIIlIIlllIIlIllII = lllllllllllllIIlIIlIIllllIIlIllI;
                    final Object[] lllllllllllllIIlIIlIIlllIIlIlIll = new Object[ObjectTreeParser.lIIllllIlIllll[1]];
                    lllllllllllllIIlIIlIIlllIIlIlIll[ObjectTreeParser.lIIllllIlIllll[0]] = lllllllllllllIIlIIlIIllllIIllIlI;
                    this.invoke(lllllllllllllIIlIIlIIlllIIlIllIl, lllllllllllllIIlIIlIIlllIIlIllII, lllllllllllllIIlIIlIIlllIIlIlIll);
                }
                final Class lllllllllllllIIlIIlIIlllIIIllIll2 = lllllllllllllIIlIIlIIllllIIllIIl;
                final String lllllllllllllIIlIIlIIlllIIIlllIl2 = ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[6]];
                final Class[] lllllllllllllIIlIIlIIlllIIIllIIl2 = new Class[ObjectTreeParser.lIIllllIlIllll[1]];
                lllllllllllllIIlIIlIIlllIIIllIIl2[ObjectTreeParser.lIIllllIlIllll[0]] = String.class;
                final Method lllllllllllllIIlIIlIIllllIlIllll = this.getMethod(lllllllllllllIIlIIlIIlllIIIllIll2, lllllllllllllIIlIIlIIlllIIIlllIl2, lllllllllllllIIlIIlIIlllIIIllIIl2);
                if (llIllllIIIlIIll(lllllllllllllIIlIIlIIllllIlIllll)) {
                    final Method lllllllllllllIIlIIlIIlllIIlIllIl2 = lllllllllllllIIlIIlIIllllIlIllll;
                    final Object lllllllllllllIIlIIlIIlllIIlIllII2 = lllllllllllllIIlIIlIIllllIIlIllI;
                    final Object[] lllllllllllllIIlIIlIIlllIIlIlIll2 = new Object[ObjectTreeParser.lIIllllIlIllll[1]];
                    lllllllllllllIIlIIlIIlllIIlIlIll2[ObjectTreeParser.lIIllllIlIllll[0]] = lllllllllllllIIlIIlIIllllIIlllII.getContent();
                    this.invoke(lllllllllllllIIlIIlIIlllIIlIllIl2, lllllllllllllIIlIIlIIlllIIlIllII2, lllllllllllllIIlIIlIIlllIIlIlIll2);
                }
            }
            final String[] lllllllllllllIIlIIlIIllllIlIIIIl = lllllllllllllIIlIIlIIllllIIlllII.getAttributeNames();
            int lllllllllllllIIlIIlIIllllIlIIlll = ObjectTreeParser.lIIllllIlIllll[0];
            while (llIllllIIIlIllI(lllllllllllllIIlIIlIIllllIlIIlll, lllllllllllllIIlIIlIIllllIlIIIIl.length)) {
                final String lllllllllllllIIlIIlIIllllIlIlIIl = String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[7]]).append(lllllllllllllIIlIIlIIllllIlIIIIl[lllllllllllllIIlIIlIIllllIlIIlll]));
                final Method lllllllllllllIIlIIlIIllllIlIlIII = this.findMethod(lllllllllllllIIlIIlIIllllIIllIIl, lllllllllllllIIlIIlIIllllIlIlIIl);
                if (llIllllIIIlIlIl(lllllllllllllIIlIIlIIllllIlIlIII)) {
                    final Field lllllllllllllIIlIIlIIllllIlIllII = this.findField(lllllllllllllIIlIIlIIllllIIllIIl, lllllllllllllIIlIIlIIllllIlIIIIl[lllllllllllllIIlIIlIIllllIlIIlll]);
                    if (llIllllIIIlIIll(lllllllllllllIIlIIlIIllllIlIllII)) {
                        final String lllllllllllllIIlIIlIIllllIlIlllI = lllllllllllllIIlIIlIIllllIIlllII.getAttribute(lllllllllllllIIlIIlIIllllIlIIIIl[lllllllllllllIIlIIlIIllllIlIIlll]);
                        final Object lllllllllllllIIlIIlIIllllIlIllIl = this.typeValue(lllllllllllllIIlIIlIIllllIlIlllI, lllllllllllllIIlIIlIIllllIlIllII.getType());
                        this.setField(lllllllllllllIIlIIlIIllllIlIllII, lllllllllllllIIlIIlIIllllIIlIllI, lllllllllllllIIlIIlIIllllIlIllIl);
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return null;
                        }
                    }
                    else {
                        Log.info(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[8]]).append(lllllllllllllIIlIIlIIllllIIllIIl).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[9]]).append(lllllllllllllIIlIIlIIllllIlIIIIl[lllllllllllllIIlIIlIIllllIlIIlll])));
                    }
                    "".length();
                    if ("   ".length() == " ".length()) {
                        return null;
                    }
                }
                else {
                    final String lllllllllllllIIlIIlIIllllIlIlIll = lllllllllllllIIlIIlIIllllIIlllII.getAttribute(lllllllllllllIIlIIlIIllllIlIIIIl[lllllllllllllIIlIIlIIllllIlIIlll]);
                    final Object lllllllllllllIIlIIlIIllllIlIlIlI = this.typeValue(lllllllllllllIIlIIlIIllllIlIlIll, lllllllllllllIIlIIlIIllllIlIlIII.getParameterTypes()[ObjectTreeParser.lIIllllIlIllll[0]]);
                    final Method lllllllllllllIIlIIlIIlllIIlIllIl3 = lllllllllllllIIlIIlIIllllIlIlIII;
                    final Object lllllllllllllIIlIIlIIlllIIlIllII3 = lllllllllllllIIlIIlIIllllIIlIllI;
                    final Object[] lllllllllllllIIlIIlIIlllIIlIlIll3 = new Object[ObjectTreeParser.lIIllllIlIllll[1]];
                    lllllllllllllIIlIIlIIlllIIlIlIll3[ObjectTreeParser.lIIllllIlIllll[0]] = lllllllllllllIIlIIlIIllllIlIlIlI;
                    this.invoke(lllllllllllllIIlIIlIIlllIIlIllIl3, lllllllllllllIIlIIlIIlllIIlIllII3, lllllllllllllIIlIIlIIlllIIlIlIll3);
                }
                ++lllllllllllllIIlIIlIIllllIlIIlll;
                "".length();
                if (((0x4D ^ 0x7D ^ (0x13 ^ 0x27)) & (0x72 ^ 0x3C ^ (0xD1 ^ 0x9B) ^ -" ".length())) >= "  ".length()) {
                    return null;
                }
            }
            final XMLElementList lllllllllllllIIlIIlIIllllIlIIIII = lllllllllllllIIlIIlIIllllIIlllII.getChildren();
            int lllllllllllllIIlIIlIIllllIlIIIlI = ObjectTreeParser.lIIllllIlIllll[0];
            while (llIllllIIIlIllI(lllllllllllllIIlIIlIIllllIlIIIlI, lllllllllllllIIlIIlIIllllIlIIIII.size())) {
                final XMLElement lllllllllllllIIlIIlIIllllIlIIlII = lllllllllllllIIlIIlIIllllIlIIIII.get(lllllllllllllIIlIIlIIllllIlIIIlI);
                final Object lllllllllllllIIlIIlIIllllIlIIIll = this.traverse(lllllllllllllIIlIIlIIllllIlIIlII);
                if (llIllllIIIlIIll(lllllllllllllIIlIIlIIllllIlIIIll)) {
                    final String lllllllllllllIIlIIlIIllllIlIIllI = this.addMethod;
                    final Method lllllllllllllIIlIIlIIllllIlIIlIl = this.findMethod(lllllllllllllIIlIIlIIllllIIllIIl, lllllllllllllIIlIIlIIllllIlIIllI, lllllllllllllIIlIIlIIllllIlIIIll.getClass());
                    if (llIllllIIIlIlIl(lllllllllllllIIlIIlIIllllIlIIlIl)) {
                        Log.info(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[10]]).append(lllllllllllllIIlIIlIIllllIlIIIll).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[11]]).append(lllllllllllllIIlIIlIIllllIIllIIl)));
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return null;
                        }
                    }
                    else {
                        final Method lllllllllllllIIlIIlIIlllIIlIllIl4 = lllllllllllllIIlIIlIIllllIlIIlIl;
                        final Object lllllllllllllIIlIIlIIlllIIlIllII4 = lllllllllllllIIlIIlIIllllIIlIllI;
                        final Object[] lllllllllllllIIlIIlIIlllIIlIlIll4 = new Object[ObjectTreeParser.lIIllllIlIllll[1]];
                        lllllllllllllIIlIIlIIlllIIlIlIll4[ObjectTreeParser.lIIllllIlIllll[0]] = lllllllllllllIIlIIlIIllllIlIIIll;
                        this.invoke(lllllllllllllIIlIIlIIlllIIlIllIl4, lllllllllllllIIlIIlIIlllIIlIllII4, lllllllllllllIIlIIlIIlllIIlIlIll4);
                    }
                }
                ++lllllllllllllIIlIIlIIllllIlIIIlI;
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            return lllllllllllllIIlIIlIIllllIIlIllI;
        }
        catch (InstantiationException lllllllllllllIIlIIlIIllllIIlllll) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[12]]).append(lllllllllllllIIlIIlIIllllIIllIIl).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[13]]).append(lllllllllllllIIlIIlIIllllIIllIlI).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[14]])), lllllllllllllIIlIIlIIllllIIlllll);
        }
        catch (IllegalAccessException lllllllllllllIIlIIlIIllllIIllllI) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[15]]).append(lllllllllllllIIlIIlIIllllIIllIIl).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[16]]).append(lllllllllllllIIlIIlIIllllIIllIlI).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[17]])), lllllllllllllIIlIIlIIllllIIllllI);
        }
    }
    
    private static boolean llIllllIIIlIlIl(final Object lllllllllllllIIlIIlIIllIllIlIllI) {
        return lllllllllllllIIlIIlIIllIllIlIllI == null;
    }
    
    private void setField(final Field lllllllllllllIIlIIlIIlllIIlllIll, final Object lllllllllllllIIlIIlIIlllIIlllIlI, final Object lllllllllllllIIlIIlIIlllIIlllIIl) throws SlickXMLException {
        try {
            lllllllllllllIIlIIlIIlllIIlllIll.setAccessible((boolean)(ObjectTreeParser.lIIllllIlIllll[1] != 0));
            lllllllllllllIIlIIlIIlllIIlllIll.set(lllllllllllllIIlIIlIIlllIIlllIlI, lllllllllllllIIlIIlIIlllIIlllIIl);
            lllllllllllllIIlIIlIIlllIIlllIll.setAccessible((boolean)(ObjectTreeParser.lIIllllIlIllll[0] != 0));
            "".length();
            if ((8 + 163 - 147 + 169 ^ 69 + 4 + 60 + 64) < "  ".length()) {
                return;
            }
        }
        catch (IllegalArgumentException lllllllllllllIIlIIlIIlllIlIIIIIl) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[21]]).append(lllllllllllllIIlIIlIIlllIIlllIll).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[22]])), lllllllllllllIIlIIlIIlllIlIIIIIl);
        }
        catch (IllegalAccessException lllllllllllllIIlIIlIIlllIlIIIIII) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[23]]).append(lllllllllllllIIlIIlIIlllIIlllIll).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[24]])), lllllllllllllIIlIIlIIlllIlIIIIII);
        }
        finally {
            lllllllllllllIIlIIlIIlllIIlllIll.setAccessible((boolean)(ObjectTreeParser.lIIllllIlIllll[0] != 0));
        }
    }
    
    private static boolean llIllllIIIlIllI(final int lllllllllllllIIlIIlIIllIllIlllll, final int lllllllllllllIIlIIlIIllIllIllllI) {
        return lllllllllllllIIlIIlIIllIllIlllll < lllllllllllllIIlIIlIIllIllIllllI;
    }
    
    public ObjectTreeParser(final String lllllllllllllIIlIIlIlIIIIIIllIll) {
        this.nameToClass = new HashMap();
        this.ignored = new ArrayList();
        this.addMethod = ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[1]];
        this.defaultPackage = lllllllllllllIIlIIlIlIIIIIIllIll;
    }
    
    private static boolean llIllllIIIlIlll(final Object lllllllllllllIIlIIlIIllIllIllIIl, final Object lllllllllllllIIlIIlIIllIllIllIII) {
        return lllllllllllllIIlIIlIIllIllIllIIl == lllllllllllllIIlIIlIIllIllIllIII;
    }
    
    private void invoke(final Method lllllllllllllIIlIIlIIlllIIlIllIl, final Object lllllllllllllIIlIIlIIlllIIlIllII, final Object[] lllllllllllllIIlIIlIIlllIIlIlIll) throws SlickXMLException {
        try {
            lllllllllllllIIlIIlIIlllIIlIllIl.setAccessible((boolean)(ObjectTreeParser.lIIllllIlIllll[1] != 0));
            lllllllllllllIIlIIlIIlllIIlIllIl.invoke(lllllllllllllIIlIIlIIlllIIlIllII, lllllllllllllIIlIIlIIlllIIlIlIll);
            "".length();
            lllllllllllllIIlIIlIIlllIIlIllIl.setAccessible((boolean)(ObjectTreeParser.lIIllllIlIllll[0] != 0));
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        catch (IllegalArgumentException lllllllllllllIIlIIlIIlllIIllIIIl) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[25]]).append(lllllllllllllIIlIIlIIlllIIlIllIl).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[26]])), lllllllllllllIIlIIlIIlllIIllIIIl);
        }
        catch (IllegalAccessException lllllllllllllIIlIIlIIlllIIllIIII) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[27]]).append(lllllllllllllIIlIIlIIlllIIlIllIl).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[28]])), lllllllllllllIIlIIlIIlllIIllIIII);
        }
        catch (InvocationTargetException lllllllllllllIIlIIlIIlllIIlIllll) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[29]]).append(lllllllllllllIIlIIlIIlllIIlIllIl).append(ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[30]])), lllllllllllllIIlIIlIIlllIIlIllll);
        }
        finally {
            lllllllllllllIIlIIlIIlllIIlIllIl.setAccessible((boolean)(ObjectTreeParser.lIIllllIlIllll[0] != 0));
        }
    }
    
    private static void llIllllIIIIlIIl() {
        (lIIllllIlIlIII = new String[ObjectTreeParser.lIIllllIlIllll[31]])[ObjectTreeParser.lIIllllIlIllll[0]] = llIllllIIIIIIIl("rtAMgdkfvZc=", "HdOhD");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[1]] = llIllllIIIIIIIl("kpStnUsh7gY=", "BfAHO");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[2]] = llIllllIIIIIIll("HWFAFL+ffmY=", "ttGAm");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[3]] = llIllllIIIIIIIl("6+eQfQ0UW8ooHbOgNHXDiIirTr78sYH6", "WJlIS");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[4]] = llIllllIIIIIIIl("hrvHeVoO/n42k1AXqHmFXUK0R9QN3b/KB42D2wG9bqI=", "kNLEi");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[5]] = llIllllIIIIIIIl("w0m+Y9PLwwNeZVt2B5opYENt60X6wBb6", "akkpR");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[6]] = llIllllIIIIIlIl("ATQxFTU+FCkoFRc/MQ4XHCUgIww=", "rQEMx");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[7]] = llIllllIIIIIlIl("JRwd", "VyidO");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[8]] = llIllllIIIIIIIl("kF3uvlwjiydMNMmGWTdZKS4dsbUg3jB7AoPkUEdMkbY=", "IWIrr");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[9]] = llIllllIIIIIIll("zlefE8/+tfVmR/KNW+G9BIwyYRmHhBQ1", "LFHVN");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[10]] = llIllllIIIIIIIl("AbMqfkcODFjTvJ29dohO0976lb5ca5XuxoivAyCWoog=", "yommx");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[11]] = llIllllIIIIIIIl("5vigrGVE5uM=", "QrDMC");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[12]] = llIllllIIIIIIll("B9juum6+5LUGlwuOJvnTTlDJ6jb9BmW8", "aZqkV");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[13]] = llIllllIIIIIIIl("KocpyMTECDg8sACnwzWhFQ==", "pncKY");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[14]] = llIllllIIIIIIIl("rubTrYcAr+qo8UevAOZBSYAqPQnTow+dr6XbiDETNupW6G0lpEk88w==", "adwVF");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[15]] = llIllllIIIIIIIl("xpVIiaVDwbV+oxBGyxxEqNodbzHAo/00", "OetqS");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[16]] = llIllllIIIIIIll("Zjlo2g7Ddp8PgEMVGATePQ==", "cslUK");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[17]] = llIllllIIIIIIll("wCme+ubezVH4CY/jBnpGLuVluIEV8piGmo3zBGZaJ/WpgO5a0y5A0A==", "hSLAU");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[18]] = llIllllIIIIIlIl("CBclOzcqVjg4ci0ZIiE3PAJ2dw==", "NvLWR");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[19]] = llIllllIIIIIlIl("WR8JWjcRDkYfOwkOBQ4mHUsWCCoUAhITNRxLEgMzHFFG", "ykfzC");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[20]] = llIllllIIIIIIIl("8DdEYHBIx6ZFfjzHXnpJyjrduFiYR+DZ", "bTQME");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[21]] = llIllllIIIIIlIl("CBgvFAoqWTIXTz0cMkJP", "NyFxo");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[22]] = llIllllIIIIIlIl("Sw8FPEcKB0oWKidJCzoTGQAIOxMORUonFEsAHm4RCgUDKlg=", "kijNg");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[23]] = llIllllIIIIIlIl("CBIwGRYqUy0aUz0WLU9T", "NsYus");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[24]] = llIllllIIIIIlIl("SSgnE1IIIGg5PyVuKRUGGycqFAYMYmgIAUknPEEECCIhBU0=", "iNHar");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[25]] = llIllllIIIIIIll("vx1D/r4paaKicMKn6DC80wYgwApqZ43r", "abIQV");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[26]] = llIllllIIIIIlIl("djIiPVE3Om0XPBp0LDsFJD0vOgUzeG0mAnY9OW8HNzgkK04=", "VTMOq");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[27]] = llIllllIIIIIIIl("toVN4CcX1TCsaMMmOsP4f3DnCqt7jOES", "nCXiK");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[28]] = llIllllIIIIIIll("/ZQCAu0bFxGhDd89ypex0OZorrguQGaO/oBDn9en2oz8H9qB3/XKUQ==", "mWDnW");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[29]] = llIllllIIIIIIll("YqsYGgWJSDGtjvPs/CA9YNxwlTU/JVoW", "VSFwa");
        ObjectTreeParser.lIIllllIlIlIII[ObjectTreeParser.lIIllllIlIllll[30]] = llIllllIIIIIlIl("eSo1JHM4InoOHhVsOyInKyU4Iyc8YHo/IHklLnYlOCAzMmw=", "YLZVS");
    }
    
    private static String llIllllIIIIIlIl(String lllllllllllllIIlIIlIIlllIIIIlIII, final String lllllllllllllIIlIIlIIlllIIIIllII) {
        lllllllllllllIIlIIlIIlllIIIIlIII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIIlllIIIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIIlllIIIIlIll = new StringBuilder();
        final char[] lllllllllllllIIlIIlIIlllIIIIlIlI = lllllllllllllIIlIIlIIlllIIIIllII.toCharArray();
        int lllllllllllllIIlIIlIIlllIIIIlIIl = ObjectTreeParser.lIIllllIlIllll[0];
        final long lllllllllllllIIlIIlIIlllIIIIIIll = (Object)((String)lllllllllllllIIlIIlIIlllIIIIlIII).toCharArray();
        final int lllllllllllllIIlIIlIIlllIIIIIIlI = lllllllllllllIIlIIlIIlllIIIIIIll.length;
        boolean lllllllllllllIIlIIlIIlllIIIIIIIl = ObjectTreeParser.lIIllllIlIllll[0] != 0;
        while (llIllllIIIlIllI(lllllllllllllIIlIIlIIlllIIIIIIIl ? 1 : 0, lllllllllllllIIlIIlIIlllIIIIIIlI)) {
            final char lllllllllllllIIlIIlIIlllIIIIlllI = lllllllllllllIIlIIlIIlllIIIIIIll[lllllllllllllIIlIIlIIlllIIIIIIIl];
            lllllllllllllIIlIIlIIlllIIIIlIll.append((char)(lllllllllllllIIlIIlIIlllIIIIlllI ^ lllllllllllllIIlIIlIIlllIIIIlIlI[lllllllllllllIIlIIlIIlllIIIIlIIl % lllllllllllllIIlIIlIIlllIIIIlIlI.length]));
            "".length();
            ++lllllllllllllIIlIIlIIlllIIIIlIIl;
            ++lllllllllllllIIlIIlIIlllIIIIIIIl;
            "".length();
            if ("   ".length() < ((0x44 ^ 0x6) & ~(0xEF ^ 0xAD))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIIlllIIIIlIll);
    }
}
