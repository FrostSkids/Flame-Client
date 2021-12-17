// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import net.minecraft.nbt.NBTBase;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.UUID;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.nbt.NBTTagCompound;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.logging.log4j.Logger;
import net.minecraft.entity.ai.attributes.IAttribute;

public class SharedMonsterAttributes
{
    private static final /* synthetic */ String[] lllIlllIIIllIl;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] lllIlllIIlllll;
    
    private static String lIlIIlIllIIIllII(String llllllllllllIlIllIIIIlIIllIIIlll, final String llllllllllllIlIllIIIIlIIllIIIllI) {
        llllllllllllIlIllIIIIlIIllIIIlll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIIlIIllIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIIlIIllIIlIlI = new StringBuilder();
        final char[] llllllllllllIlIllIIIIlIIllIIlIIl = llllllllllllIlIllIIIIlIIllIIIllI.toCharArray();
        int llllllllllllIlIllIIIIlIIllIIlIII = SharedMonsterAttributes.lllIlllIIlllll[0];
        final boolean llllllllllllIlIllIIIIlIIllIIIIlI = (Object)((String)llllllllllllIlIllIIIIlIIllIIIlll).toCharArray();
        final float llllllllllllIlIllIIIIlIIllIIIIIl = llllllllllllIlIllIIIIlIIllIIIIlI.length;
        long llllllllllllIlIllIIIIlIIllIIIIII = SharedMonsterAttributes.lllIlllIIlllll[0];
        while (lIlIIlIllIlIlIIl((int)llllllllllllIlIllIIIIlIIllIIIIII, (int)llllllllllllIlIllIIIIlIIllIIIIIl)) {
            final char llllllllllllIlIllIIIIlIIllIIllIl = llllllllllllIlIllIIIIlIIllIIIIlI[llllllllllllIlIllIIIIlIIllIIIIII];
            llllllllllllIlIllIIIIlIIllIIlIlI.append((char)(llllllllllllIlIllIIIIlIIllIIllIl ^ llllllllllllIlIllIIIIlIIllIIlIIl[llllllllllllIlIllIIIIlIIllIIlIII % llllllllllllIlIllIIIIlIIllIIlIIl.length]));
            "".length();
            ++llllllllllllIlIllIIIIlIIllIIlIII;
            ++llllllllllllIlIllIIIIlIIllIIIIII;
            "".length();
            if ("  ".length() == ((161 + 41 - 133 + 94 ^ 2 + 1 + 44 + 111) & (0x63 ^ 0x6E ^ (0x9A ^ 0xAA) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIIlIIllIIlIlI);
    }
    
    private static boolean lIlIIlIllIlIlIII(final int llllllllllllIlIllIIIIlIIlIlIllll, final int llllllllllllIlIllIIIIlIIlIlIlllI) {
        return llllllllllllIlIllIIIIlIIlIlIllll >= llllllllllllIlIllIIIIlIIlIlIlllI;
    }
    
    private static boolean lIlIIlIllIlIIllI(final Object llllllllllllIlIllIIIIlIIlIlIlIII) {
        return llllllllllllIlIllIIIIlIIlIlIlIII != null;
    }
    
    public static AttributeModifier readAttributeModifierFromNBT(final NBTTagCompound llllllllllllIlIllIIIIlIIlllIlIll) {
        final UUID llllllllllllIlIllIIIIlIIlllIlIlI = new UUID(llllllllllllIlIllIIIIlIIlllIlIll.getLong(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[24]]), llllllllllllIlIllIIIIlIIlllIlIll.getLong(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[25]]));
        try {
            return new AttributeModifier(llllllllllllIlIllIIIIlIIlllIlIlI, llllllllllllIlIllIIIIlIIlllIlIll.getString(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[26]]), llllllllllllIlIllIIIIlIIlllIlIll.getDouble(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[27]]), llllllllllllIlIllIIIIlIIlllIlIll.getInteger(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[28]]));
        }
        catch (Exception llllllllllllIlIllIIIIlIIlllIlIII) {
            SharedMonsterAttributes.logger.warn(String.valueOf(new StringBuilder(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[29]]).append(llllllllllllIlIllIIIIlIIlllIlIII.getMessage())));
            return null;
        }
    }
    
    private static boolean lIlIIlIllIlIIlll(final int llllllllllllIlIllIIIIlIIlIlIIllI) {
        return llllllllllllIlIllIIIIlIIlIlIIllI != 0;
    }
    
    private static void lIlIIlIllIIllIll() {
        (lllIlllIIIllIl = new String[SharedMonsterAttributes.lllIlllIIlllll[30]])[SharedMonsterAttributes.lllIlllIIlllll[0]] = lIlIIlIllIIIlIll("p8lNvhu4TBFdGxfnFd3WIl8KXKzIlFir", "ENMxh");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[1]] = lIlIIlIllIIIllII("GCM2bCEwIyI4AQ==", "UBNLi");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[2]] = lIlIIlIllIIIllIl("r1X+JUH8gUeakWXpJ9XSC3t2NWSrJdOQ", "edoFI");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[3]] = lIlIIlIllIIIlIll("mVsp2ta7qcu6hEE2Kicawg==", "EeJKM");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[4]] = lIlIIlIllIIIllIl("sqS/pRSJZ+rLBKbmNaFtUxCIb1QrIWICtAZGcZHY2tI=", "jeVTB");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[5]] = lIlIIlIllIIIllII("HSoiEyc0JS4bbAQhPhk/IiUjEyk=", "VDMpL");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[6]] = lIlIIlIllIIIllII("ACA/CzgOJn8DJREgPAskExYhCy8D", "gEQnJ");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[7]] = lIlIIlIllIIIlIll("wVrCoqPkuKzvjbGVFwqmSA==", "aAvcu");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[8]] = lIlIIlIllIIIlIll("NdwauhTGL6pLshuC5x7dJTxA2Enq3Mp8", "onROT");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[9]] = lIlIIlIllIIIllII("AQQJJA==", "OedAq");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[10]] = lIlIIlIllIIIllIl("yHr7OU/QRSo=", "dWwqQ");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[11]] = lIlIIlIllIIIllIl("OpAA99Acx8ub22CwYH9wsA==", "laCAZ");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[12]] = lIlIIlIllIIIlIll("1ECz/Rq848g=", "uYSEy");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[13]] = lIlIIlIllIIIlIll("/zX7CBoVibs=", "eDXBJ");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[14]] = lIlIIlIllIIIlIll("YDdUtBeeo7PF1Gw1GyyahA==", "EudxX");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[15]] = lIlIIlIllIIIllIl("YhMXom5gvCu1l1X0ljiSuA==", "ZFjpP");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[16]] = lIlIIlIllIIIlIll("Fz0bRf2/HpAHeFUDMaT6YA==", "KuvPi");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[17]] = lIlIIlIllIIIllII("ITcdJg==", "oVpCW");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[18]] = lIlIIlIllIIIlIll("NSXm5guKv+BtuJl2U1zsiPax6Q5dswa7huMVb6DPABE=", "MfJxj");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[19]] = lIlIIlIllIIIllIl("j+0xUVSvoks=", "DNdhC");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[20]] = lIlIIlIllIIIllIl("mvoJahQXrb0=", "HyBmq");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[21]] = lIlIIlIllIIIllII("NzsGFg==", "uZush");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[22]] = lIlIIlIllIIIllII("Bwk3KgMjAyEw", "JfSCe");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[23]] = lIlIIlIllIIIllIl("pY7EdsRZh31A97a7TWZvyg==", "QKHVV");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[24]] = lIlIIlIllIIIlIll("fSdBdDCPmOpNZS7R0nfShQ==", "wpcdm");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[25]] = lIlIIlIllIIIlIll("0kVPO1xlxcp5QtRJTsJ6Qg==", "GpOCB");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[26]] = lIlIIlIllIIIllII("DSw1IA==", "CMXEc");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[27]] = lIlIIlIllIIIllIl("QPQOEgciYBk=", "sFWsn");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[28]] = lIlIIlIllIIIllIl("WDA8fM6TkV5xvm8TJYPKHA==", "xyKaf");
        SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[29]] = lIlIIlIllIIIllIl("8GsbCU+M4p9sPn/7MSvdRSaevopyniSHfnoq9SHmMgk=", "xqBkp");
    }
    
    private static void lIlIIlIllIlIIlII() {
        (lllIlllIIlllll = new int[31])[0] = ((0x94 ^ 0xB0 ^ (0x7F ^ 0x1B)) & (0x86 ^ 0x91 ^ (0x24 ^ 0x73) ^ -" ".length()));
        SharedMonsterAttributes.lllIlllIIlllll[1] = " ".length();
        SharedMonsterAttributes.lllIlllIIlllll[2] = "  ".length();
        SharedMonsterAttributes.lllIlllIIlllll[3] = "   ".length();
        SharedMonsterAttributes.lllIlllIIlllll[4] = (0x93 ^ 0x97);
        SharedMonsterAttributes.lllIlllIIlllll[5] = (76 + 55 - 64 + 77 ^ 100 + 136 - 159 + 72);
        SharedMonsterAttributes.lllIlllIIlllll[6] = (0x7B ^ 0x7D);
        SharedMonsterAttributes.lllIlllIIlllll[7] = (0x5E ^ 0x53 ^ (0x95 ^ 0x9F));
        SharedMonsterAttributes.lllIlllIIlllll[8] = (0xB8 ^ 0xBC ^ (0x7A ^ 0x76));
        SharedMonsterAttributes.lllIlllIIlllll[9] = (0x31 ^ 0x38);
        SharedMonsterAttributes.lllIlllIIlllll[10] = (0x4 ^ 0xE);
        SharedMonsterAttributes.lllIlllIIlllll[11] = (0x8E ^ 0x85);
        SharedMonsterAttributes.lllIlllIIlllll[12] = (0x74 ^ 0x7F ^ (0x6F ^ 0x68));
        SharedMonsterAttributes.lllIlllIIlllll[13] = (0x2 ^ 0x2D ^ (0xB ^ 0x29));
        SharedMonsterAttributes.lllIlllIIlllll[14] = (0x3F ^ 0x31);
        SharedMonsterAttributes.lllIlllIIlllll[15] = (0xA ^ 0x5);
        SharedMonsterAttributes.lllIlllIIlllll[16] = (125 + 15 - 23 + 21 ^ 42 + 140 - 120 + 92);
        SharedMonsterAttributes.lllIlllIIlllll[17] = (0x40 ^ 0x26 ^ (0x53 ^ 0x24));
        SharedMonsterAttributes.lllIlllIIlllll[18] = (0x5D ^ 0x65 ^ (0xEC ^ 0xC6));
        SharedMonsterAttributes.lllIlllIIlllll[19] = (0x99 ^ 0xB8 ^ (0x1D ^ 0x2F));
        SharedMonsterAttributes.lllIlllIIlllll[20] = (0x80 ^ 0x94);
        SharedMonsterAttributes.lllIlllIIlllll[21] = (0x5A ^ 0x4F);
        SharedMonsterAttributes.lllIlllIIlllll[22] = (0x16 ^ 0x0);
        SharedMonsterAttributes.lllIlllIIlllll[23] = (0xE ^ 0x12 ^ (0x19 ^ 0x12));
        SharedMonsterAttributes.lllIlllIIlllll[24] = (0x0 ^ 0x18);
        SharedMonsterAttributes.lllIlllIIlllll[25] = (0xA3 ^ 0x95 ^ (0x67 ^ 0x48));
        SharedMonsterAttributes.lllIlllIIlllll[26] = (43 + 100 - 91 + 128 ^ 50 + 150 - 49 + 23);
        SharedMonsterAttributes.lllIlllIIlllll[27] = (101 + 148 - 171 + 88 ^ 175 + 144 - 147 + 17);
        SharedMonsterAttributes.lllIlllIIlllll[28] = (0x4B ^ 0x57);
        SharedMonsterAttributes.lllIlllIIlllll[29] = (0x47 ^ 0x4B ^ (0x6B ^ 0x7A));
        SharedMonsterAttributes.lllIlllIIlllll[30] = (0x42 ^ 0x5C);
    }
    
    private static String lIlIIlIllIIIllIl(final String llllllllllllIlIllIIIIlIIllIlllII, final String llllllllllllIlIllIIIIlIIllIllIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIlIIllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIlIIllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIIlIIllIllllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIIlIIllIllllI.init(SharedMonsterAttributes.lllIlllIIlllll[2], llllllllllllIlIllIIIIlIIllIlllll);
            return new String(llllllllllllIlIllIIIIlIIllIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIlIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIlIIllIlllIl) {
            llllllllllllIlIllIIIIlIIllIlllIl.printStackTrace();
            return null;
        }
    }
    
    public static void func_151475_a(final BaseAttributeMap llllllllllllIlIllIIIIlIlIIlIlIII, final NBTTagList llllllllllllIlIllIIIIlIlIIlIIllI) {
        int llllllllllllIlIllIIIIlIlIIlIIlII = SharedMonsterAttributes.lllIlllIIlllll[0];
        "".length();
        if (((0xD8 ^ 0x85) & ~(0x27 ^ 0x7A)) != 0x0) {
            return;
        }
        while (!lIlIIlIllIlIlIII(llllllllllllIlIllIIIIlIlIIlIIlII, llllllllllllIlIllIIIIlIlIIlIIllI.tagCount())) {
            final NBTTagCompound llllllllllllIlIllIIIIlIlIIlIIIll = llllllllllllIlIllIIIIlIlIIlIIllI.getCompoundTagAt(llllllllllllIlIllIIIIlIlIIlIIlII);
            final IAttributeInstance llllllllllllIlIllIIIIlIlIIlIIIlI = llllllllllllIlIllIIIIlIlIIlIlIII.getAttributeInstanceByName(llllllllllllIlIllIIIIlIlIIlIIIll.getString(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[17]]));
            if (lIlIIlIllIlIIllI(llllllllllllIlIllIIIIlIlIIlIIIlI)) {
                applyModifiersToAttributeInstance(llllllllllllIlIllIIIIlIlIIlIIIlI, llllllllllllIlIllIIIIlIlIIlIIIll);
                "".length();
                if ((14 + 172 - 83 + 72 ^ 7 + 130 + 33 + 1) != (75 + 69 - 23 + 23 ^ 52 + 41 - 66 + 121)) {
                    return;
                }
            }
            else {
                SharedMonsterAttributes.logger.warn(String.valueOf(new StringBuilder(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[18]]).append(llllllllllllIlIllIIIIlIlIIlIIIll.getString(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[19]])).append(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[20]])));
            }
            ++llllllllllllIlIllIIIIlIlIIlIIlII;
        }
    }
    
    private static boolean lIlIIlIllIlIIlIl(final int llllllllllllIlIllIIIIlIIlIlIIlII) {
        return llllllllllllIlIllIIIIlIIlIlIIlII == 0;
    }
    
    private static NBTTagCompound writeAttributeInstanceToNBT(final IAttributeInstance llllllllllllIlIllIIIIlIlIIlllllI) {
        final NBTTagCompound llllllllllllIlIllIIIIlIlIlIIIIll = new NBTTagCompound();
        final IAttribute llllllllllllIlIllIIIIlIlIlIIIIlI = llllllllllllIlIllIIIIlIlIIlllllI.getAttribute();
        llllllllllllIlIllIIIIlIlIlIIIIll.setString(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[9]], llllllllllllIlIllIIIIlIlIlIIIIlI.getAttributeUnlocalizedName());
        llllllllllllIlIllIIIIlIlIlIIIIll.setDouble(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[10]], llllllllllllIlIllIIIIlIlIIlllllI.getBaseValue());
        final Collection<AttributeModifier> llllllllllllIlIllIIIIlIlIlIIIIIl = llllllllllllIlIllIIIIlIlIIlllllI.func_111122_c();
        if (lIlIIlIllIlIIllI(llllllllllllIlIllIIIIlIlIlIIIIIl) && lIlIIlIllIlIIlIl(llllllllllllIlIllIIIIlIlIlIIIIIl.isEmpty() ? 1 : 0)) {
            final NBTTagList llllllllllllIlIllIIIIlIlIlIIIIII = new NBTTagList();
            final int llllllllllllIlIllIIIIlIlIIlllIII = (int)llllllllllllIlIllIIIIlIlIlIIIIIl.iterator();
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
            while (!lIlIIlIllIlIIlIl(((Iterator)llllllllllllIlIllIIIIlIlIIlllIII).hasNext() ? 1 : 0)) {
                final AttributeModifier llllllllllllIlIllIIIIlIlIIllllll = ((Iterator<AttributeModifier>)llllllllllllIlIllIIIIlIlIIlllIII).next();
                if (lIlIIlIllIlIIlll(llllllllllllIlIllIIIIlIlIIllllll.isSaved() ? 1 : 0)) {
                    llllllllllllIlIllIIIIlIlIlIIIIII.appendTag(writeAttributeModifierToNBT(llllllllllllIlIllIIIIlIlIIllllll));
                }
            }
            llllllllllllIlIllIIIIlIlIlIIIIll.setTag(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[11]], llllllllllllIlIllIIIIlIlIlIIIIII);
        }
        return llllllllllllIlIllIIIIlIlIlIIIIll;
    }
    
    static {
        lIlIIlIllIlIIlII();
        lIlIIlIllIIllIll();
        logger = LogManager.getLogger();
        maxHealth = new RangedAttribute(null, SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[0]], 20.0, 0.0, 1024.0).setDescription(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[1]]).setShouldWatch((boolean)(SharedMonsterAttributes.lllIlllIIlllll[1] != 0));
        followRange = new RangedAttribute(null, SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[2]], 32.0, 0.0, 2048.0).setDescription(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[3]]);
        knockbackResistance = new RangedAttribute(null, SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[4]], 0.0, 0.0, 1.0).setDescription(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[5]]);
        movementSpeed = new RangedAttribute(null, SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[6]], 0.699999988079071, 0.0, 1024.0).setDescription(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[7]]).setShouldWatch((boolean)(SharedMonsterAttributes.lllIlllIIlllll[1] != 0));
        attackDamage = new RangedAttribute(null, SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[8]], 2.0, 0.0, 2048.0);
    }
    
    private static void applyModifiersToAttributeInstance(final IAttributeInstance llllllllllllIlIllIIIIlIlIIIIlIlI, final NBTTagCompound llllllllllllIlIllIIIIlIIlllllIll) {
        llllllllllllIlIllIIIIlIlIIIIlIlI.setBaseValue(llllllllllllIlIllIIIIlIIlllllIll.getDouble(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[21]]));
        if (lIlIIlIllIlIIlll(llllllllllllIlIllIIIIlIIlllllIll.hasKey(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[22]], SharedMonsterAttributes.lllIlllIIlllll[9]) ? 1 : 0)) {
            final NBTTagList llllllllllllIlIllIIIIlIlIIIIIllI = llllllllllllIlIllIIIIlIIlllllIll.getTagList(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[23]], SharedMonsterAttributes.lllIlllIIlllll[10]);
            int llllllllllllIlIllIIIIlIlIIIIIlII = SharedMonsterAttributes.lllIlllIIlllll[0];
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
            while (!lIlIIlIllIlIlIII(llllllllllllIlIllIIIIlIlIIIIIlII, llllllllllllIlIllIIIIlIlIIIIIllI.tagCount())) {
                final AttributeModifier llllllllllllIlIllIIIIlIlIIIIIIlI = readAttributeModifierFromNBT(llllllllllllIlIllIIIIlIlIIIIIllI.getCompoundTagAt(llllllllllllIlIllIIIIlIlIIIIIlII));
                if (lIlIIlIllIlIIllI(llllllllllllIlIllIIIIlIlIIIIIIlI)) {
                    final AttributeModifier llllllllllllIlIllIIIIlIlIIIIIIII = llllllllllllIlIllIIIIlIlIIIIlIlI.getModifier(llllllllllllIlIllIIIIlIlIIIIIIlI.getID());
                    if (lIlIIlIllIlIIllI(llllllllllllIlIllIIIIlIlIIIIIIII)) {
                        llllllllllllIlIllIIIIlIlIIIIlIlI.removeModifier(llllllllllllIlIllIIIIlIlIIIIIIII);
                    }
                    llllllllllllIlIllIIIIlIlIIIIlIlI.applyModifier(llllllllllllIlIllIIIIlIlIIIIIIlI);
                }
                ++llllllllllllIlIllIIIIlIlIIIIIlII;
            }
        }
    }
    
    public static NBTTagList writeBaseAttributeMapToNBT(final BaseAttributeMap llllllllllllIlIllIIIIlIlIlIlIIlI) {
        final NBTTagList llllllllllllIlIllIIIIlIlIlIlIIIl = new NBTTagList();
        final String llllllllllllIlIllIIIIlIlIlIIllII = (String)llllllllllllIlIllIIIIlIlIlIlIIlI.getAllAttributes().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIIlIllIlIIlIl(((Iterator)llllllllllllIlIllIIIIlIlIlIIllII).hasNext() ? 1 : 0)) {
            final IAttributeInstance llllllllllllIlIllIIIIlIlIlIlIIII = ((Iterator<IAttributeInstance>)llllllllllllIlIllIIIIlIlIlIIllII).next();
            llllllllllllIlIllIIIIlIlIlIlIIIl.appendTag(writeAttributeInstanceToNBT(llllllllllllIlIllIIIIlIlIlIlIIII));
        }
        return llllllllllllIlIllIIIIlIlIlIlIIIl;
    }
    
    private static String lIlIIlIllIIIlIll(final String llllllllllllIlIllIIIIlIIlIllIlll, final String llllllllllllIlIllIIIIlIIlIllIlII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIlIIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIlIIlIllIlII.getBytes(StandardCharsets.UTF_8)), SharedMonsterAttributes.lllIlllIIlllll[8]), "DES");
            final Cipher llllllllllllIlIllIIIIlIIlIlllIIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIlIIlIlllIIl.init(SharedMonsterAttributes.lllIlllIIlllll[2], llllllllllllIlIllIIIIlIIlIlllIlI);
            return new String(llllllllllllIlIllIIIIlIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIlIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIlIIlIlllIII) {
            llllllllllllIlIllIIIIlIIlIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static NBTTagCompound writeAttributeModifierToNBT(final AttributeModifier llllllllllllIlIllIIIIlIlIIllIlIl) {
        final NBTTagCompound llllllllllllIlIllIIIIlIlIIllIlII = new NBTTagCompound();
        llllllllllllIlIllIIIIlIlIIllIlII.setString(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[12]], llllllllllllIlIllIIIIlIlIIllIlIl.getName());
        llllllllllllIlIllIIIIlIlIIllIlII.setDouble(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[13]], llllllllllllIlIllIIIIlIlIIllIlIl.getAmount());
        llllllllllllIlIllIIIIlIlIIllIlII.setInteger(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[14]], llllllllllllIlIllIIIIlIlIIllIlIl.getOperation());
        llllllllllllIlIllIIIIlIlIIllIlII.setLong(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[15]], llllllllllllIlIllIIIIlIlIIllIlIl.getID().getMostSignificantBits());
        llllllllllllIlIllIIIIlIlIIllIlII.setLong(SharedMonsterAttributes.lllIlllIIIllIl[SharedMonsterAttributes.lllIlllIIlllll[16]], llllllllllllIlIllIIIIlIlIIllIlIl.getID().getLeastSignificantBits());
        return llllllllllllIlIllIIIIlIlIIllIlII;
    }
    
    private static boolean lIlIIlIllIlIlIIl(final int llllllllllllIlIllIIIIlIIlIlIlIll, final int llllllllllllIlIllIIIIlIIlIlIlIlI) {
        return llllllllllllIlIllIIIIlIIlIlIlIll < llllllllllllIlIllIIIIlIIlIlIlIlI;
    }
}
