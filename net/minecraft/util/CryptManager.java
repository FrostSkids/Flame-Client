// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import org.apache.logging.log4j.LogManager;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.UnsupportedEncodingException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;
import java.security.PrivateKey;
import java.security.NoSuchAlgorithmException;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.Logger;

public class CryptManager
{
    private static final /* synthetic */ int[] llIIlIIIIlIIlI;
    private static final /* synthetic */ String[] llIIIllllllIIl;
    private static final /* synthetic */ Logger LOGGER;
    
    private static String lIIIlIlllIIlIIlI(final String llllllllllllIlllIIllIlllIIlIlllI, final String llllllllllllIlllIIllIlllIIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIlllIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIlllIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIllIlllIIllIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIllIlllIIllIIII.init(CryptManager.llIIlIIIIlIIlI[4], llllllllllllIlllIIllIlllIIllIIIl);
            return new String(llllllllllllIlllIIllIlllIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIlllIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIlllIIlIllll) {
            llllllllllllIlllIIllIlllIIlIllll.printStackTrace();
            return null;
        }
    }
    
    public static KeyPair generateKeyPair() {
        try {
            final KeyPairGenerator llllllllllllIlllIIllIllllIllllIl = KeyPairGenerator.getInstance(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[2]]);
            llllllllllllIlllIIllIllllIllllIl.initialize(CryptManager.llIIlIIIIlIIlI[3]);
            return llllllllllllIlllIIllIllllIllllIl.generateKeyPair();
        }
        catch (NoSuchAlgorithmException llllllllllllIlllIIllIllllIllllII) {
            llllllllllllIlllIIllIllllIllllII.printStackTrace();
            CryptManager.LOGGER.error(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[4]]);
            return null;
        }
    }
    
    private static byte[] digestOperation(final String llllllllllllIlllIIllIllllIlIIlll, final byte[]... llllllllllllIlllIIllIllllIlIIIIl) {
        try {
            final MessageDigest llllllllllllIlllIIllIllllIlIIlIl = MessageDigest.getInstance(llllllllllllIlllIIllIllllIlIIlll);
            final String llllllllllllIlllIIllIllllIIlllII = (Object)llllllllllllIlllIIllIllllIlIIIIl;
            final short llllllllllllIlllIIllIllllIIlllIl = (short)llllllllllllIlllIIllIllllIlIIIIl.length;
            long llllllllllllIlllIIllIllllIIllllI = CryptManager.llIIlIIIIlIIlI[0];
            "".length();
            if (" ".length() < ((0x6D ^ 0xC) & ~(0xFC ^ 0x9D))) {
                return null;
            }
            while (!lIIIlIlllIIlllIl((int)llllllllllllIlllIIllIllllIIllllI, llllllllllllIlllIIllIllllIIlllIl)) {
                final byte[] llllllllllllIlllIIllIllllIlIIlII = llllllllllllIlllIIllIllllIIlllII[llllllllllllIlllIIllIllllIIllllI];
                llllllllllllIlllIIllIllllIlIIlIl.update(llllllllllllIlllIIllIllllIlIIlII);
                ++llllllllllllIlllIIllIllllIIllllI;
            }
            return llllllllllllIlllIIllIllllIlIIlIl.digest();
        }
        catch (NoSuchAlgorithmException llllllllllllIlllIIllIllllIlIIIll) {
            llllllllllllIlllIIllIllllIlIIIll.printStackTrace();
            return null;
        }
    }
    
    public static byte[] decryptData(final Key llllllllllllIlllIIllIllllIIIIlII, final byte[] llllllllllllIlllIIllIllllIIIIIll) {
        return cipherOperation(CryptManager.llIIlIIIIlIIlI[4], llllllllllllIlllIIllIllllIIIIlII, llllllllllllIlllIIllIllllIIIIIll);
    }
    
    public static byte[] encryptData(final Key llllllllllllIlllIIllIllllIIIlIII, final byte[] llllllllllllIlllIIllIllllIIIIlll) {
        return cipherOperation(CryptManager.llIIlIIIIlIIlI[2], llllllllllllIlllIIllIllllIIIlIII, llllllllllllIlllIIllIllllIIIIlll);
    }
    
    public static SecretKey decryptSharedKey(final PrivateKey llllllllllllIlllIIllIllllIIlIIII, final byte[] llllllllllllIlllIIllIllllIIIllll) {
        return new SecretKeySpec(decryptData(llllllllllllIlllIIllIllllIIlIIII, llllllllllllIlllIIllIllllIIIllll), CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[9]]);
    }
    
    private static String lIIIlIllIlIllIII(final String llllllllllllIlllIIllIlllIIlllIll, final String llllllllllllIlllIIllIlllIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIlllIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIlllIIlllIlI.getBytes(StandardCharsets.UTF_8)), CryptManager.llIIlIIIIlIIlI[10]), "DES");
            final Cipher llllllllllllIlllIIllIlllIIllllIl = Cipher.getInstance("DES");
            llllllllllllIlllIIllIlllIIllllIl.init(CryptManager.llIIlIIIIlIIlI[4], llllllllllllIlllIIllIlllIIlllllI);
            return new String(llllllllllllIlllIIllIlllIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIlllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIlllIIllllII) {
            llllllllllllIlllIIllIlllIIllllII.printStackTrace();
            return null;
        }
    }
    
    public static PublicKey decodePublicKey(final byte[] llllllllllllIlllIIllIllllIIllIII) {
        try {
            final EncodedKeySpec llllllllllllIlllIIllIllllIIlIlll = new X509EncodedKeySpec(llllllllllllIlllIIllIllllIIllIII);
            final KeyFactory llllllllllllIlllIIllIllllIIlIllI = KeyFactory.getInstance(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[7]]);
            return llllllllllllIlllIIllIllllIIlIllI.generatePublic(llllllllllllIlllIIllIllllIIlIlll);
        }
        catch (NoSuchAlgorithmException llllllllllllIlllIIllIllllIIlIlII) {
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        catch (InvalidKeySpecException ex) {}
        CryptManager.LOGGER.error(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[8]]);
        return null;
    }
    
    public static byte[] getServerIdHash(final String llllllllllllIlllIIllIllllIllIIlI, final PublicKey llllllllllllIlllIIllIllllIllIIIl, final SecretKey llllllllllllIlllIIllIllllIllIlII) {
        try {
            final String llllllllllllIlllIIllIllllIlIIlll = CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[5]];
            final byte[][] llllllllllllIlllIIllIllllIlIIIIl = new byte[CryptManager.llIIlIIIIlIIlI[5]][];
            llllllllllllIlllIIllIllllIlIIIIl[CryptManager.llIIlIIIIlIIlI[0]] = llllllllllllIlllIIllIllllIllIIlI.getBytes(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[6]]);
            llllllllllllIlllIIllIllllIlIIIIl[CryptManager.llIIlIIIIlIIlI[2]] = llllllllllllIlllIIllIllllIllIlII.getEncoded();
            llllllllllllIlllIIllIllllIlIIIIl[CryptManager.llIIlIIIIlIIlI[4]] = llllllllllllIlllIIllIllllIllIIIl.getEncoded();
            return digestOperation(llllllllllllIlllIIllIllllIlIIlll, llllllllllllIlllIIllIllllIlIIIIl);
        }
        catch (UnsupportedEncodingException llllllllllllIlllIIllIllllIllIIll) {
            llllllllllllIlllIIllIllllIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIlllIIlIlII() {
        (llIIIllllllIIl = new String[CryptManager.llIIlIIIIlIIlI[13]])[CryptManager.llIIlIIIIlIIlI[0]] = lIIIlIllIlIllIII("tVL0TEzEUHc=", "RsJgI");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[2]] = lIIIlIllIlIllIII("cm+O2oiEYHM=", "EPqmM");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[4]] = lIIIlIlllIIlIIlI("qcP/l4MLdbcqaUmaj5PCtRlB6z7JHZUvP15qSrMJ/Xo=", "JyscW");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[5]] = lIIIlIlllIIlIIlI("dUcyGUE3Nwo=", "xEpsS");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[6]] = lIIIlIllIlIllIII("Xu/M+qBmlw5m33Zz2xLeqQ==", "qLTEw");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[7]] = lIIIlIllIlIllIII("eiUocnS0f1c=", "dKHcy");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[8]] = lIIIlIlllIIlIIll("HRwOFDguSQcdKG0bCRs+IxoYESU4HQlYNywAAB01bA==", "MilxQ");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[9]] = lIIIlIlllIIlIIll("IggE", "cMWeP");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[10]] = lIIIlIlllIIlIIlI("KdQdfPYNyR5dLFOYCxvYh6JrT6uOIp8K", "Oaxnf");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[11]] = lIIIlIlllIIlIIlI("lS1F5+JVncjp8s/BKK+JKHTd3+9hUaHO", "hFLDv");
        CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[12]] = lIIIlIllIlIllIII("MGguIoGYY1P35+e/C1p7VpP/iOAnfM9A", "GLfgb");
    }
    
    public static Cipher createNetCipherInstance(final int llllllllllllIlllIIllIlllIlIlllIl, final Key llllllllllllIlllIIllIlllIlIlllII) {
        try {
            final Cipher llllllllllllIlllIIllIlllIlIlllll = Cipher.getInstance(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[12]]);
            llllllllllllIlllIIllIlllIlIlllll.init(llllllllllllIlllIIllIlllIlIlllIl, llllllllllllIlllIIllIlllIlIlllII, new IvParameterSpec(llllllllllllIlllIIllIlllIlIlllII.getEncoded()));
            return llllllllllllIlllIIllIlllIlIlllll;
        }
        catch (GeneralSecurityException llllllllllllIlllIIllIlllIlIllllI) {
            throw new RuntimeException(llllllllllllIlllIIllIlllIlIllllI);
        }
    }
    
    private static boolean lIIIlIlllIIlllll(final int llllllllllllIlllIIllIlllIIlIIIlI, final int llllllllllllIlllIIllIlllIIlIIIIl) {
        return llllllllllllIlllIIllIlllIIlIIIlI < llllllllllllIlllIIllIlllIIlIIIIl;
    }
    
    private static boolean lIIIlIlllIIlllIl(final int llllllllllllIlllIIllIlllIIlIIllI, final int llllllllllllIlllIIllIlllIIlIIlIl) {
        return llllllllllllIlllIIllIlllIIlIIllI >= llllllllllllIlllIIllIlllIIlIIlIl;
    }
    
    private static void lIIIlIlllIIllIIl() {
        (llIIlIIIIlIIlI = new int[14])[0] = ((0x6F ^ 0x6B ^ (0x16 ^ 0x32)) & (181 + 20 - 130 + 117 ^ 54 + 11 + 48 + 43 ^ -" ".length()));
        CryptManager.llIIlIIIIlIIlI[1] = (0x7E ^ 0x28) + (0xDE ^ 0xBE) - (11 + 125 - 10 + 54) + (0x53 ^ 0x2D);
        CryptManager.llIIlIIIIlIIlI[2] = " ".length();
        CryptManager.llIIlIIIIlIIlI[3] = (0xFFFF9C56 & 0x67A9);
        CryptManager.llIIlIIIIlIIlI[4] = "  ".length();
        CryptManager.llIIlIIIIlIIlI[5] = "   ".length();
        CryptManager.llIIlIIIIlIIlI[6] = (0x8D ^ 0x9D ^ (0x8B ^ 0x9F));
        CryptManager.llIIlIIIIlIIlI[7] = (0x6 ^ 0x3);
        CryptManager.llIIlIIIIlIIlI[8] = (85 + 154 - 165 + 115 ^ 166 + 73 - 237 + 185);
        CryptManager.llIIlIIIIlIIlI[9] = (0xB1 ^ 0xBE ^ (0xB7 ^ 0xBF));
        CryptManager.llIIlIIIIlIIlI[10] = (0x23 ^ 0x2B);
        CryptManager.llIIlIIIIlIIlI[11] = (0x8F ^ 0x86);
        CryptManager.llIIlIIIIlIIlI[12] = (0x85 ^ 0x8F);
        CryptManager.llIIlIIIIlIIlI[13] = (0x86 ^ 0x8D);
    }
    
    private static String lIIIlIlllIIlIIll(String llllllllllllIlllIIllIlllIlIIlIll, final String llllllllllllIlllIIllIlllIlIIllll) {
        llllllllllllIlllIIllIlllIlIIlIll = new String(Base64.getDecoder().decode(llllllllllllIlllIIllIlllIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIllIlllIlIIlllI = new StringBuilder();
        final char[] llllllllllllIlllIIllIlllIlIIllIl = llllllllllllIlllIIllIlllIlIIllll.toCharArray();
        int llllllllllllIlllIIllIlllIlIIllII = CryptManager.llIIlIIIIlIIlI[0];
        final float llllllllllllIlllIIllIlllIlIIIllI = (Object)llllllllllllIlllIIllIlllIlIIlIll.toCharArray();
        final short llllllllllllIlllIIllIlllIlIIIlIl = (short)llllllllllllIlllIIllIlllIlIIIllI.length;
        byte llllllllllllIlllIIllIlllIlIIIlII = (byte)CryptManager.llIIlIIIIlIIlI[0];
        while (lIIIlIlllIIlllll(llllllllllllIlllIIllIlllIlIIIlII, llllllllllllIlllIIllIlllIlIIIlIl)) {
            final char llllllllllllIlllIIllIlllIlIlIIIl = llllllllllllIlllIIllIlllIlIIIllI[llllllllllllIlllIIllIlllIlIIIlII];
            llllllllllllIlllIIllIlllIlIIlllI.append((char)(llllllllllllIlllIIllIlllIlIlIIIl ^ llllllllllllIlllIIllIlllIlIIllIl[llllllllllllIlllIIllIlllIlIIllII % llllllllllllIlllIIllIlllIlIIllIl.length]));
            "".length();
            ++llllllllllllIlllIIllIlllIlIIllII;
            ++llllllllllllIlllIIllIlllIlIIIlII;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIllIlllIlIIlllI);
    }
    
    private static Cipher createTheCipherInstance(final int llllllllllllIlllIIllIlllIllIllll, final String llllllllllllIlllIIllIlllIllIlllI, final Key llllllllllllIlllIIllIlllIllIIllI) {
        try {
            final Cipher llllllllllllIlllIIllIlllIllIllII = Cipher.getInstance(llllllllllllIlllIIllIlllIllIlllI);
            llllllllllllIlllIIllIlllIllIllII.init(llllllllllllIlllIIllIlllIllIllll, llllllllllllIlllIIllIlllIllIIllI);
            return llllllllllllIlllIIllIlllIllIllII;
        }
        catch (InvalidKeyException llllllllllllIlllIIllIlllIllIlIll) {
            llllllllllllIlllIIllIlllIllIlIll.printStackTrace();
            "".length();
            if ((0xF2 ^ 0x97 ^ (0xE7 ^ 0x86)) == 0x0) {
                return null;
            }
        }
        catch (NoSuchAlgorithmException llllllllllllIlllIIllIlllIllIlIlI) {
            llllllllllllIlllIIllIlllIllIlIlI.printStackTrace();
            "".length();
            if (" ".length() < ((13 + 111 - 71 + 83 ^ 25 + 74 - 61 + 129) & (0x4C ^ 0x62 ^ " ".length() ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchPaddingException llllllllllllIlllIIllIlllIllIlIIl) {
            llllllllllllIlllIIllIlllIllIlIIl.printStackTrace();
        }
        CryptManager.LOGGER.error(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[11]]);
        return null;
    }
    
    public static SecretKey createNewSharedKey() {
        try {
            final KeyGenerator llllllllllllIlllIIllIlllllIIIIIl = KeyGenerator.getInstance(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[0]]);
            llllllllllllIlllIIllIlllllIIIIIl.init(CryptManager.llIIlIIIIlIIlI[1]);
            return llllllllllllIlllIIllIlllllIIIIIl.generateKey();
        }
        catch (NoSuchAlgorithmException llllllllllllIlllIIllIlllllIIIIII) {
            throw new Error(llllllllllllIlllIIllIlllllIIIIII);
        }
    }
    
    static {
        lIIIlIlllIIllIIl();
        lIIIlIlllIIlIlII();
        LOGGER = LogManager.getLogger();
    }
    
    private static byte[] cipherOperation(final int llllllllllllIlllIIllIlllIlllIlll, final Key llllllllllllIlllIIllIlllIlllIllI, final byte[] llllllllllllIlllIIllIlllIllllIlI) {
        try {
            return createTheCipherInstance(llllllllllllIlllIIllIlllIlllIlll, llllllllllllIlllIIllIlllIlllIllI.getAlgorithm(), llllllllllllIlllIIllIlllIlllIllI).doFinal(llllllllllllIlllIIllIlllIllllIlI);
        }
        catch (IllegalBlockSizeException llllllllllllIlllIIllIlllIllllIIl) {
            llllllllllllIlllIIllIlllIllllIIl.printStackTrace();
            "".length();
            if (" ".length() < ((0xDF ^ 0x84) & ~(0x50 ^ 0xB))) {
                return null;
            }
        }
        catch (BadPaddingException llllllllllllIlllIIllIlllIllllIII) {
            llllllllllllIlllIIllIlllIllllIII.printStackTrace();
        }
        CryptManager.LOGGER.error(CryptManager.llIIIllllllIIl[CryptManager.llIIlIIIIlIIlI[10]]);
        return null;
    }
}
