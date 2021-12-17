// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import java.util.Iterator;
import net.minecraft.util.EnumChatFormatting;
import java.util.Arrays;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.nbt.NBTBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagList;
import org.apache.logging.log4j.LogManager;
import net.minecraft.nbt.NBTTagCompound;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.WorldSavedData;

public class ScoreboardSaveData extends WorldSavedData
{
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] llIIllllIllIIl;
    private /* synthetic */ NBTTagCompound delayedInitNbt;
    private static final /* synthetic */ int[] llIIllllIllIll;
    private /* synthetic */ Scoreboard theScoreboard;
    
    public ScoreboardSaveData() {
        this(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[0]]);
    }
    
    static {
        lIIlIIIIIllIIlIl();
        lIIlIIIIIllIIlII();
        logger = LogManager.getLogger();
    }
    
    private static boolean lIIlIIIIIllIlIII(final int llllllllllllIllIlllIlIIIlIIIlIII) {
        return llllllllllllIllIlllIlIIIlIIIlIII != 0;
    }
    
    private static void lIIlIIIIIllIIlII() {
        (llIIllllIllIIl = new String[ScoreboardSaveData.llIIllllIllIll[58]])[ScoreboardSaveData.llIIllllIllIll[0]] = lIIlIIIIIllIIIIl("Zg6fISOYFHwi/SJWwAhJqw==", "jTfuH");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[1]] = lIIlIIIIIllIIIlI("DicJKBA1LBUoAA==", "AEcMs");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[3]] = lIIlIIIIIllIIIll("+vpdK2ca79HVbChKYHuMwQ==", "nKOUi");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[4]] = lIIlIIIIIllIIIIl("b5gMD2C8XH2yJlguygeNXw==", "QgESC");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[5]] = lIIlIIIIIllIIIll("aqgNhzjDvMaSn3WdLWaKKw==", "YunLG");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[6]] = lIIlIIIIIllIIIIl("4vIzWFg6DrE=", "OdmHd");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[8]] = lIIlIIIIIllIIIlI("FigIOyo=", "BMiVY");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[9]] = lIIlIIIIIllIIIIl("mbbEflGzYZI=", "qZLDa");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[11]] = lIIlIIIIIllIIIlI("PjwrOSIbLBYoIx8=", "zUXIN");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[7]] = lIIlIIIIIllIIIIl("HIiyPfDFB4lk4vMr8v+h0Q==", "mXODf");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[2]] = lIIlIIIIIllIIIll("7loCIyVwgNP3hrcqTzxkew==", "pZKAt");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[13]] = lIIlIIIIIllIIIlI("NAETMQoc", "dsvWc");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[14]] = lIIlIIIIIllIIIlI("PD0iDxsX", "oHDir");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[15]] = lIIlIIIIIllIIIll("aJDDnCt87RPSgY6B4YyJ0LpXgGvBpJ76", "hCZch");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[17]] = lIIlIIIIIllIIIll("fBA2Kl1dOiwUJLtXkuwGA/+oYwGghAVE", "BoJXN");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[18]] = lIIlIIIIIllIIIlI("CyogJQMxKisHHSEGKxUYKyYnDxQr", "XOEcq");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[10]] = lIIlIIIIIllIIIIl("psxNcGngoXlZLhCl8WzGzHPi7uoTHUiB", "MBKWi");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[19]] = lIIlIIIIIllIIIIl("0baUQnvdyNbTrnQXPukhUJo8XltjKacF", "WUIkB");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[20]] = lIIlIIIIIllIIIll("n++Z0PF+J+xD6Tl2n5m8xvUyvt4Z165i", "KVyGw");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[21]] = lIIlIIIIIllIIIll("1eHGz6ENV12ZVJoTddnkyqKtkv7T+1Gf", "YnQMk");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[22]] = lIIlIIIIIllIIIll("qH7F7YMWcFeeN9G5+1vP6st1k4MWQ11B", "MNuhf");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[23]] = lIIlIIIIIllIIIlI("IQsmMwgDFA==", "qgGJm");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[24]] = lIIlIIIIIllIIIll("NbI9VpaFiHU=", "xyoEC");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[25]] = lIIlIIIIIllIIIlI("ACsoNi8=", "sGGBp");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[26]] = lIIlIIIIIllIIIlI("JDAiHyEVKyolJQon", "gBKkD");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[27]] = lIIlIIIIIllIIIlI("HjksFQ==", "PXApk");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[28]] = lIIlIIIIIllIIIlI("EDo6Fzw1KgcGPTE=", "TSIgP");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[29]] = lIIlIIIIIllIIIlI("NCwvLiIUHTg6Ig==", "fIAJG");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[30]] = lIIlIIIIIllIIIlI("JhgYNCEdEwQ0", "izrQB");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[31]] = lIIlIIIIIllIIIll("Rxtwj0Pulpo=", "cgrku");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[33]] = lIIlIIIIIllIIIll("pWzkAvdOBME=", "yZjGV");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[34]] = lIIlIIIIIllIIIlI("JRgoOhYN", "iwKQs");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[12]] = lIIlIIIIIllIIIIl("0iVWtyalkt8=", "ePSUh");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[35]] = lIIlIIIIIllIIIIl("VH7T+5C8KFvmzt6KQ6ubuISFmwxvBFYF1ukiG7sjzLTCU041rwNWwdbdEEBTOLItjb8NB+HWthU=", "SmpQZ");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[36]] = lIIlIIIIIllIIIll("r8N6C3n13NL00ozHFbyhdQ==", "cLVFI");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[37]] = lIIlIIIIIllIIIll("J8fh1dY1/dJ/sj6iAcq9gQ==", "qDDmJ");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[38]] = lIIlIIIIIllIIIlI("Hy0zBDw=", "KHRiO");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[39]] = lIIlIIIIIllIIIlI("OSAYFA==", "wAuqn");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[40]] = lIIlIIIIIllIIIll("XYrXc5YrPKw/ft18lQJYmw==", "zGZoG");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[41]] = lIIlIIIIIllIIIlI("Eg4LNzUpBwUo", "FkjZv");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[32]] = lIIlIIIIIllIIIlI("GTA8NyMx", "IBYQJ");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[42]] = lIIlIIIIIllIIIIl("xBPVX+1UoNo=", "yquYv");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[43]] = lIIlIIIIIllIIIlI("KBYvHDkvCCoWIA0WOjUnGx8=", "izCsN");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[44]] = lIIlIIIIIllIIIIl("NKsY8tt2Pttwv7EMQjSKTMBRydHl4+MU", "pfUrZ");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[45]] = lIIlIIIIIllIIIll("6T0TLVSSix6MZIcCK5o+ettG0DQfrtPr", "XOoUz");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[46]] = lIIlIIIIIllIIIll("mLIizt7BQMKHfZZfSFjrLe65B80AJw9d", "oHqPv");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[47]] = lIIlIIIIIllIIIlI("Ij41IyIAIQ==", "rRTZG");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[48]] = lIIlIIIIIllIIIll("8OIa/nLGK/w=", "dwzIC");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[49]] = lIIlIIIIIllIIIll("dLhkIodg0/yz7vTyJAaHUw==", "nXYrx");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[50]] = lIIlIIIIIllIIIlI("CgwLAA==", "Dmfed");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[51]] = lIIlIIIIIllIIIlI("JzUkBTwWLiw/OAki", "dGMqY");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[52]] = lIIlIIIIIllIIIll("OAJmaH25Gt1jyxTsiktkmQ==", "xPmMX");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[53]] = lIIlIIIIIllIIIlI("HhE/LAQ+ICg4BA==", "LtQHa");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[54]] = lIIlIIIIIllIIIll("G/GLL3Fmw0E=", "IqHQT");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[55]] = lIIlIIIIIllIIIll("b0TXyAZUSERf8eOo3MTQSA==", "ugtcF");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[56]] = lIIlIIIIIllIIIlI("JxEaGRA=", "truku");
        ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[57]] = lIIlIIIIIllIIIll("sk69ljjQgzY=", "xPLSp");
    }
    
    protected void func_96502_a(final ScorePlayerTeam llllllllllllIllIlllIlIIlIlIlIIIl, final NBTTagList llllllllllllIllIlllIlIIlIlIlIlII) {
        int llllllllllllIllIlllIlIIlIlIlIIll = ScoreboardSaveData.llIIllllIllIll[0];
        "".length();
        if ((0x11 ^ 0x38 ^ (0x64 ^ 0x48)) == 0x0) {
            return;
        }
        while (!lIIlIIIIIllIlIlI(llllllllllllIllIlllIlIIlIlIlIIll, llllllllllllIllIlllIlIIlIlIlIlII.tagCount())) {
            this.theScoreboard.addPlayerToTeam(llllllllllllIllIlllIlIIlIlIlIlII.getStringTagAt(llllllllllllIllIlllIlIIlIlIlIIll), llllllllllllIllIlllIlIIlIlIlIIIl.getRegisteredName());
            "".length();
            ++llllllllllllIllIlllIlIIlIlIlIIll;
        }
    }
    
    private static String lIIlIIIIIllIIIll(final String llllllllllllIllIlllIlIIIlIllIlll, final String llllllllllllIllIlllIlIIIlIllIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlIIIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIlIIIlIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIlIIIlIlllIIl.init(ScoreboardSaveData.llIIllllIllIll[3], llllllllllllIllIlllIlIIIlIlllIlI);
            return new String(llllllllllllIllIlllIlIIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlIIIlIlllIII) {
            llllllllllllIllIlllIlIIIlIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIIIllIllII(final int llllllllllllIllIlllIlIIIlIIIIllI) {
        return llllllllllllIllIlllIlIIIlIIIIllI == 0;
    }
    
    private static boolean lIIlIIIIIllIIlll(final Object llllllllllllIllIlllIlIIIlIIIlIlI) {
        return llllllllllllIllIlllIlIIIlIIIlIlI == null;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIllIlllIlIIlIIIlIIII) {
        if (lIIlIIIIIllIIlll(this.theScoreboard)) {
            ScoreboardSaveData.logger.warn(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[35]]);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            llllllllllllIllIlllIlIIlIIIlIIII.setTag(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[36]], this.objectivesToNbt());
            llllllllllllIllIlllIlIIlIIIlIIII.setTag(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[37]], this.scoresToNbt());
            llllllllllllIllIlllIlIIlIIIlIIII.setTag(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[38]], this.func_96496_a());
            this.func_96497_d(llllllllllllIllIlllIlIIlIIIlIIII);
        }
    }
    
    protected NBTTagList func_96496_a() {
        final NBTTagList llllllllllllIllIlllIlIIlIIIIIllI = new NBTTagList();
        final float llllllllllllIllIlllIlIIIlllllllI = (float)this.theScoreboard.getTeams().iterator();
        "".length();
        if ("   ".length() <= " ".length()) {
            return null;
        }
        while (!lIIlIIIIIllIllII(((Iterator)llllllllllllIllIlllIlIIIlllllllI).hasNext() ? 1 : 0)) {
            final ScorePlayerTeam llllllllllllIllIlllIlIIlIIIIIlIl = ((Iterator<ScorePlayerTeam>)llllllllllllIllIlllIlIIIlllllllI).next();
            final NBTTagCompound llllllllllllIllIlllIlIIlIIIIIlII = new NBTTagCompound();
            llllllllllllIllIlllIlIIlIIIIIlII.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[39]], llllllllllllIllIlllIlIIlIIIIIlIl.getRegisteredName());
            llllllllllllIllIlllIlIIlIIIIIlII.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[40]], llllllllllllIllIlllIlIIlIIIIIlIl.getTeamName());
            if (lIIlIIIIIllIlIll(llllllllllllIllIlllIlIIlIIIIIlIl.getChatFormat().getColorIndex())) {
                llllllllllllIllIlllIlIIlIIIIIlII.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[41]], llllllllllllIllIlllIlIIlIIIIIlIl.getChatFormat().getFriendlyName());
            }
            llllllllllllIllIlllIlIIlIIIIIlII.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[32]], llllllllllllIllIlllIlIIlIIIIIlIl.getColorPrefix());
            llllllllllllIllIlllIlIIlIIIIIlII.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[42]], llllllllllllIllIlllIlIIlIIIIIlIl.getColorSuffix());
            llllllllllllIllIlllIlIIlIIIIIlII.setBoolean(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[43]], llllllllllllIllIlllIlIIlIIIIIlIl.getAllowFriendlyFire());
            llllllllllllIllIlllIlIIlIIIIIlII.setBoolean(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[44]], llllllllllllIllIlllIlIIlIIIIIlIl.getSeeFriendlyInvisiblesEnabled());
            llllllllllllIllIlllIlIIlIIIIIlII.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[45]], llllllllllllIllIlllIlIIlIIIIIlIl.getNameTagVisibility().field_178830_e);
            llllllllllllIllIlllIlIIlIIIIIlII.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[46]], llllllllllllIllIlllIlIIlIIIIIlIl.getDeathMessageVisibility().field_178830_e);
            final NBTTagList llllllllllllIllIlllIlIIlIIIIIIll = new NBTTagList();
            final boolean llllllllllllIllIlllIlIIIlllllIlI = (boolean)llllllllllllIllIlllIlIIlIIIIIlIl.getMembershipCollection().iterator();
            "".length();
            if ((0x6D ^ 0x26 ^ (0x3B ^ 0x74)) < 0) {
                return null;
            }
            while (!lIIlIIIIIllIllII(((Iterator)llllllllllllIllIlllIlIIIlllllIlI).hasNext() ? 1 : 0)) {
                final String llllllllllllIllIlllIlIIlIIIIIIlI = ((Iterator<String>)llllllllllllIllIlllIlIIIlllllIlI).next();
                llllllllllllIllIlllIlIIlIIIIIIll.appendTag(new NBTTagString(llllllllllllIllIlllIlIIlIIIIIIlI));
            }
            llllllllllllIllIlllIlIIlIIIIIlII.setTag(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[47]], llllllllllllIllIlllIlIIlIIIIIIll);
            llllllllllllIllIlllIlIIlIIIIIllI.appendTag(llllllllllllIllIlllIlIIlIIIIIlII);
        }
        return llllllllllllIllIlllIlIIlIIIIIllI;
    }
    
    protected void readDisplayConfig(final NBTTagCompound llllllllllllIllIlllIlIIlIlIIIIll) {
        int llllllllllllIllIlllIlIIlIlIIIlll = ScoreboardSaveData.llIIllllIllIll[0];
        "".length();
        if ("   ".length() != "   ".length()) {
            return;
        }
        while (!lIIlIIIIIllIlIlI(llllllllllllIllIlllIlIIlIlIIIlll, ScoreboardSaveData.llIIllllIllIll[21])) {
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIlIIIIll.hasKey(String.valueOf(new StringBuilder(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[24]]).append(llllllllllllIllIlllIlIIlIlIIIlll)), ScoreboardSaveData.llIIllllIllIll[11]) ? 1 : 0)) {
                final String llllllllllllIllIlllIlIIlIlIIIllI = llllllllllllIllIlllIlIIlIlIIIIll.getString(String.valueOf(new StringBuilder(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[25]]).append(llllllllllllIllIlllIlIIlIlIIIlll)));
                final ScoreObjective llllllllllllIllIlllIlIIlIlIIIlIl = this.theScoreboard.getObjective(llllllllllllIllIlllIlIIlIlIIIllI);
                this.theScoreboard.setObjectiveInDisplaySlot(llllllllllllIllIlllIlIIlIlIIIlll, llllllllllllIllIlllIlIIlIlIIIlIl);
            }
            ++llllllllllllIllIlllIlIIlIlIIIlll;
        }
    }
    
    protected void func_96497_d(final NBTTagCompound llllllllllllIllIlllIlIIIlllIllII) {
        final NBTTagCompound llllllllllllIllIlllIlIIIllllIIIl = new NBTTagCompound();
        boolean llllllllllllIllIlllIlIIIllllIIII = ScoreboardSaveData.llIIllllIllIll[0] != 0;
        int llllllllllllIllIlllIlIIIlllIllll = ScoreboardSaveData.llIIllllIllIll[0];
        "".length();
        if ((0x1D ^ 0x42 ^ (0x3C ^ 0x67)) == ("  ".length() & ("  ".length() ^ -" ".length()))) {
            return;
        }
        while (!lIIlIIIIIllIlIlI(llllllllllllIllIlllIlIIIlllIllll, ScoreboardSaveData.llIIllllIllIll[21])) {
            final ScoreObjective llllllllllllIllIlllIlIIIlllIlllI = this.theScoreboard.getObjectiveInDisplaySlot(llllllllllllIllIlllIlIIIlllIllll);
            if (lIIlIIIIIllIIllI(llllllllllllIllIlllIlIIIlllIlllI)) {
                llllllllllllIllIlllIlIIIllllIIIl.setString(String.valueOf(new StringBuilder(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[48]]).append(llllllllllllIllIlllIlIIIlllIllll)), llllllllllllIllIlllIlIIIlllIlllI.getName());
                llllllllllllIllIlllIlIIIllllIIII = (ScoreboardSaveData.llIIllllIllIll[1] != 0);
            }
            ++llllllllllllIllIlllIlIIIlllIllll;
        }
        if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIIllllIIII ? 1 : 0)) {
            llllllllllllIllIlllIlIIIlllIllII.setTag(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[49]], llllllllllllIllIlllIlIIIllllIIIl);
        }
    }
    
    protected NBTTagList scoresToNbt() {
        final NBTTagList llllllllllllIllIlllIlIIIllIlIIll = new NBTTagList();
        final int llllllllllllIllIlllIlIIIllIIllIl = (int)this.theScoreboard.getScores().iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return null;
        }
        while (!lIIlIIIIIllIllII(((Iterator)llllllllllllIllIlllIlIIIllIIllIl).hasNext() ? 1 : 0)) {
            final Score llllllllllllIllIlllIlIIIllIlIIlI = ((Iterator<Score>)llllllllllllIllIlllIlIIIllIIllIl).next();
            if (lIIlIIIIIllIIllI(llllllllllllIllIlllIlIIIllIlIIlI.getObjective())) {
                final NBTTagCompound llllllllllllIllIlllIlIIIllIlIIIl = new NBTTagCompound();
                llllllllllllIllIlllIlIIIllIlIIIl.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[54]], llllllllllllIllIlllIlIIIllIlIIlI.getPlayerName());
                llllllllllllIllIlllIlIIIllIlIIIl.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[55]], llllllllllllIllIlllIlIIIllIlIIlI.getObjective().getName());
                llllllllllllIllIlllIlIIIllIlIIIl.setInteger(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[56]], llllllllllllIllIlllIlIIIllIlIIlI.getScorePoints());
                llllllllllllIllIlllIlIIIllIlIIIl.setBoolean(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[57]], llllllllllllIllIlllIlIIIllIlIIlI.isLocked());
                llllllllllllIllIlllIlIIIllIlIIll.appendTag(llllllllllllIllIlllIlIIIllIlIIIl);
            }
        }
        return llllllllllllIllIlllIlIIIllIlIIll;
    }
    
    public void setScoreboard(final Scoreboard llllllllllllIllIlllIlIIlIllllIlI) {
        this.theScoreboard = llllllllllllIllIlllIlIIlIllllIlI;
        if (lIIlIIIIIllIIllI(this.delayedInitNbt)) {
            this.readFromNBT(this.delayedInitNbt);
        }
    }
    
    private static boolean lIIlIIIIIllIllIl(final int llllllllllllIllIlllIlIIIlIIlIIll, final int llllllllllllIllIlllIlIIIlIIlIIlI) {
        return llllllllllllIllIlllIlIIIlIIlIIll < llllllllllllIllIlllIlIIIlIIlIIlI;
    }
    
    protected NBTTagList objectivesToNbt() {
        final NBTTagList llllllllllllIllIlllIlIIIlllIIIIl = new NBTTagList();
        final char llllllllllllIllIlllIlIIIllIllIll = (char)this.theScoreboard.getScoreObjectives().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIlIIIIIllIllII(((Iterator)llllllllllllIllIlllIlIIIllIllIll).hasNext() ? 1 : 0)) {
            final ScoreObjective llllllllllllIllIlllIlIIIlllIIIII = ((Iterator<ScoreObjective>)llllllllllllIllIlllIlIIIllIllIll).next();
            if (lIIlIIIIIllIIllI(llllllllllllIllIlllIlIIIlllIIIII.getCriteria())) {
                final NBTTagCompound llllllllllllIllIlllIlIIIllIlllll = new NBTTagCompound();
                llllllllllllIllIlllIlIIIllIlllll.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[50]], llllllllllllIllIlllIlIIIlllIIIII.getName());
                llllllllllllIllIlllIlIIIllIlllll.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[51]], llllllllllllIllIlllIlIIIlllIIIII.getCriteria().getName());
                llllllllllllIllIlllIlIIIllIlllll.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[52]], llllllllllllIllIlllIlIIIlllIIIII.getDisplayName());
                llllllllllllIllIlllIlIIIllIlllll.setString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[53]], llllllllllllIllIlllIlIIIlllIIIII.getRenderType().func_178796_a());
                llllllllllllIllIlllIlIIIlllIIIIl.appendTag(llllllllllllIllIlllIlIIIllIlllll);
            }
        }
        return llllllllllllIllIlllIlIIIlllIIIIl;
    }
    
    public ScoreboardSaveData(final String llllllllllllIllIlllIlIIllIIIIIlI) {
        super(llllllllllllIllIlllIlIIllIIIIIlI);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIllIlllIlIIlIlllIllI) {
        if (lIIlIIIIIllIIlll(this.theScoreboard)) {
            this.delayedInitNbt = llllllllllllIllIlllIlIIlIlllIllI;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.readObjectives(llllllllllllIllIlllIlIIlIlllIllI.getTagList(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[1]], ScoreboardSaveData.llIIllllIllIll[2]));
            this.readScores(llllllllllllIllIlllIlIIlIlllIllI.getTagList(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[3]], ScoreboardSaveData.llIIllllIllIll[2]));
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIlllIllI.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[4]], ScoreboardSaveData.llIIllllIllIll[2]) ? 1 : 0)) {
                this.readDisplayConfig(llllllllllllIllIlllIlIIlIlllIllI.getCompoundTag(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[5]]));
            }
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIlllIllI.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[6]], ScoreboardSaveData.llIIllllIllIll[7]) ? 1 : 0)) {
                this.readTeams(llllllllllllIllIlllIlIIlIlllIllI.getTagList(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[8]], ScoreboardSaveData.llIIllllIllIll[2]));
            }
        }
    }
    
    private static String lIIlIIIIIllIIIIl(final String llllllllllllIllIlllIlIIIllIIIIlI, final String llllllllllllIllIlllIlIIIllIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), ScoreboardSaveData.llIIllllIllIll[11]), "DES");
            final Cipher llllllllllllIllIlllIlIIIllIIIllI = Cipher.getInstance("DES");
            llllllllllllIllIlllIlIIIllIIIllI.init(ScoreboardSaveData.llIIllllIllIll[3], llllllllllllIllIlllIlIIIllIIIlll);
            return new String(llllllllllllIllIlllIlIIIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlIIIllIIIlIl) {
            llllllllllllIllIlllIlIIIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIIIllIIlIl() {
        (llIIllllIllIll = new int[59])[0] = ((65 + 64 - 89 + 130 ^ 133 + 73 - 190 + 133) & (148 + 220 - 173 + 57 ^ 95 + 135 - 102 + 67 ^ -" ".length()));
        ScoreboardSaveData.llIIllllIllIll[1] = " ".length();
        ScoreboardSaveData.llIIllllIllIll[2] = (0xA7 ^ 0xAD);
        ScoreboardSaveData.llIIllllIllIll[3] = "  ".length();
        ScoreboardSaveData.llIIllllIllIll[4] = "   ".length();
        ScoreboardSaveData.llIIllllIllIll[5] = (0xAA ^ 0xAE);
        ScoreboardSaveData.llIIllllIllIll[6] = (0xC ^ 0x9);
        ScoreboardSaveData.llIIllllIllIll[7] = (0x50 ^ 0x31 ^ (0x2B ^ 0x43));
        ScoreboardSaveData.llIIllllIllIll[8] = (0x3E ^ 0x38);
        ScoreboardSaveData.llIIllllIllIll[9] = (((0x13 ^ 0x3E) & ~(0x33 ^ 0x1E)) ^ (0xC2 ^ 0xC5));
        ScoreboardSaveData.llIIllllIllIll[10] = (0x22 ^ 0x32);
        ScoreboardSaveData.llIIllllIllIll[11] = (0x28 ^ 0x1F ^ (0x8A ^ 0xB5));
        ScoreboardSaveData.llIIllllIllIll[12] = (0x46 ^ 0x66);
        ScoreboardSaveData.llIIllllIllIll[13] = (0x22 ^ 0x29);
        ScoreboardSaveData.llIIllllIllIll[14] = (0x26 ^ 0x2A);
        ScoreboardSaveData.llIIllllIllIll[15] = (0x24 ^ 0x7F ^ (0x62 ^ 0x34));
        ScoreboardSaveData.llIIllllIllIll[16] = (0xC7 ^ 0xAF ^ (0xA ^ 0x1));
        ScoreboardSaveData.llIIllllIllIll[17] = (0xB4 ^ 0xAF ^ (0x50 ^ 0x45));
        ScoreboardSaveData.llIIllllIllIll[18] = (0xB9 ^ 0xB6);
        ScoreboardSaveData.llIIllllIllIll[19] = (0xF ^ 0x3F ^ (0x6C ^ 0x4D));
        ScoreboardSaveData.llIIllllIllIll[20] = (0x46 ^ 0x54);
        ScoreboardSaveData.llIIllllIllIll[21] = (0xEC ^ 0x9A ^ (0xDC ^ 0xB9));
        ScoreboardSaveData.llIIllllIllIll[22] = (0x51 ^ 0x45);
        ScoreboardSaveData.llIIllllIllIll[23] = (0xAF ^ 0x88 ^ (0x36 ^ 0x4));
        ScoreboardSaveData.llIIllllIllIll[24] = (0xEC ^ 0xC3 ^ (0x56 ^ 0x6F));
        ScoreboardSaveData.llIIllllIllIll[25] = (0x8D ^ 0x85 ^ (0x2E ^ 0x31));
        ScoreboardSaveData.llIIllllIllIll[26] = (0xB0 ^ 0x93 ^ (0x1D ^ 0x26));
        ScoreboardSaveData.llIIllllIllIll[27] = (0xF3 ^ 0x9A ^ (0xCB ^ 0xBB));
        ScoreboardSaveData.llIIllllIllIll[28] = (0xD9 ^ 0xC3);
        ScoreboardSaveData.llIIllllIllIll[29] = (0x47 ^ 0x49 ^ (0x85 ^ 0x90));
        ScoreboardSaveData.llIIllllIllIll[30] = (12 + 208 - 185 + 181 ^ 188 + 77 - 78 + 9);
        ScoreboardSaveData.llIIllllIllIll[31] = (0x60 ^ 0x54 ^ (0xB3 ^ 0x9A));
        ScoreboardSaveData.llIIllllIllIll[32] = (0x14 ^ 0x50 ^ (0xE5 ^ 0x89));
        ScoreboardSaveData.llIIllllIllIll[33] = (0x30 ^ 0x2E);
        ScoreboardSaveData.llIIllllIllIll[34] = (0x9B ^ 0x84);
        ScoreboardSaveData.llIIllllIllIll[35] = (0x46 ^ 0x67);
        ScoreboardSaveData.llIIllllIllIll[36] = (0xD0 ^ 0x82 ^ (0x73 ^ 0x3));
        ScoreboardSaveData.llIIllllIllIll[37] = (0x29 ^ 0x53 ^ (0x52 ^ 0xB));
        ScoreboardSaveData.llIIllllIllIll[38] = (0x6C ^ 0x16 ^ (0xEA ^ 0xB4));
        ScoreboardSaveData.llIIllllIllIll[39] = (0x2D ^ 0x8);
        ScoreboardSaveData.llIIllllIllIll[40] = (0x43 ^ 0x65);
        ScoreboardSaveData.llIIllllIllIll[41] = (0x80 ^ 0xA7);
        ScoreboardSaveData.llIIllllIllIll[42] = (0xA3 ^ 0x8A);
        ScoreboardSaveData.llIIllllIllIll[43] = (0xFF ^ 0x94 ^ (0x9 ^ 0x48));
        ScoreboardSaveData.llIIllllIllIll[44] = (0x5B ^ 0x70);
        ScoreboardSaveData.llIIllllIllIll[45] = (0xE0 ^ 0xB9 ^ (0x42 ^ 0x37));
        ScoreboardSaveData.llIIllllIllIll[46] = (0x8 ^ 0x25);
        ScoreboardSaveData.llIIllllIllIll[47] = (0x2A ^ 0x15 ^ (0x2A ^ 0x3B));
        ScoreboardSaveData.llIIllllIllIll[48] = (0x32 ^ 0x1D);
        ScoreboardSaveData.llIIllllIllIll[49] = (0x65 ^ 0x17 ^ (0xD8 ^ 0x9A));
        ScoreboardSaveData.llIIllllIllIll[50] = (149 + 77 - 142 + 82 ^ 65 + 114 - 123 + 95);
        ScoreboardSaveData.llIIllllIllIll[51] = (0xA7 ^ 0x95);
        ScoreboardSaveData.llIIllllIllIll[52] = (0x22 ^ 0x11);
        ScoreboardSaveData.llIIllllIllIll[53] = (0x4 ^ 0x30);
        ScoreboardSaveData.llIIllllIllIll[54] = (0xD5 ^ 0x87 ^ (0x3D ^ 0x5A));
        ScoreboardSaveData.llIIllllIllIll[55] = (0x3E ^ 0x8);
        ScoreboardSaveData.llIIllllIllIll[56] = (40 + 24 - 31 + 106 ^ 62 + 12 - 8 + 122);
        ScoreboardSaveData.llIIllllIllIll[57] = (0x9F ^ 0xA7);
        ScoreboardSaveData.llIIllllIllIll[58] = (0x4F ^ 0x76 ^ ((0x8F ^ 0xB8) & ~(0x0 ^ 0x37)));
    }
    
    private static String lIIlIIIIIllIIIlI(String llllllllllllIllIlllIlIIIlIlIIIlI, final String llllllllllllIllIlllIlIIIlIlIIllI) {
        llllllllllllIllIlllIlIIIlIlIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlllIlIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIlIIIlIlIIlIl = new StringBuilder();
        final char[] llllllllllllIllIlllIlIIIlIlIIlII = llllllllllllIllIlllIlIIIlIlIIllI.toCharArray();
        int llllllllllllIllIlllIlIIIlIlIIIll = ScoreboardSaveData.llIIllllIllIll[0];
        final String llllllllllllIllIlllIlIIIlIIlllIl = (Object)llllllllllllIllIlllIlIIIlIlIIIlI.toCharArray();
        final char llllllllllllIllIlllIlIIIlIIlllII = (char)llllllllllllIllIlllIlIIIlIIlllIl.length;
        long llllllllllllIllIlllIlIIIlIIllIll = ScoreboardSaveData.llIIllllIllIll[0];
        while (lIIlIIIIIllIllIl((int)llllllllllllIllIlllIlIIIlIIllIll, llllllllllllIllIlllIlIIIlIIlllII)) {
            final char llllllllllllIllIlllIlIIIlIlIlIII = llllllllllllIllIlllIlIIIlIIlllIl[llllllllllllIllIlllIlIIIlIIllIll];
            llllllllllllIllIlllIlIIIlIlIIlIl.append((char)(llllllllllllIllIlllIlIIIlIlIlIII ^ llllllllllllIllIlllIlIIIlIlIIlII[llllllllllllIllIlllIlIIIlIlIIIll % llllllllllllIllIlllIlIIIlIlIIlII.length]));
            "".length();
            ++llllllllllllIllIlllIlIIIlIlIIIll;
            ++llllllllllllIllIlllIlIIIlIIllIll;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIlIIIlIlIIlIl);
    }
    
    private static boolean lIIlIIIIIllIlIIl(final int llllllllllllIllIlllIlIIIlIIIllll, final int llllllllllllIllIlllIlIIIlIIIlllI) {
        return llllllllllllIllIlllIlIIIlIIIllll > llllllllllllIllIlllIlIIIlIIIlllI;
    }
    
    protected void readObjectives(final NBTTagList llllllllllllIllIlllIlIIlIIllIIII) {
        int llllllllllllIllIlllIlIIlIIllIllI = ScoreboardSaveData.llIIllllIllIll[0];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIIlIIIIIllIlIlI(llllllllllllIllIlllIlIIlIIllIllI, llllllllllllIllIlllIlIIlIIllIIII.tagCount())) {
            final NBTTagCompound llllllllllllIllIlllIlIIlIIllIlIl = llllllllllllIllIlllIlIIlIIllIIII.getCompoundTagAt(llllllllllllIllIlllIlIIlIIllIllI);
            final IScoreObjectiveCriteria llllllllllllIllIlllIlIIlIIllIlII = IScoreObjectiveCriteria.INSTANCES.get(llllllllllllIllIlllIlIIlIIllIlIl.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[26]]));
            if (lIIlIIIIIllIIllI(llllllllllllIllIlllIlIIlIIllIlII)) {
                String llllllllllllIllIlllIlIIlIIllIIll = llllllllllllIllIlllIlIIlIIllIlIl.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[27]]);
                if (lIIlIIIIIllIlIIl(llllllllllllIllIlllIlIIlIIllIIll.length(), ScoreboardSaveData.llIIllllIllIll[10])) {
                    llllllllllllIllIlllIlIIlIIllIIll = llllllllllllIllIlllIlIIlIIllIIll.substring(ScoreboardSaveData.llIIllllIllIll[0], ScoreboardSaveData.llIIllllIllIll[10]);
                }
                final ScoreObjective llllllllllllIllIlllIlIIlIIllIIlI = this.theScoreboard.addScoreObjective(llllllllllllIllIlllIlIIlIIllIIll, llllllllllllIllIlllIlIIlIIllIlII);
                llllllllllllIllIlllIlIIlIIllIIlI.setDisplayName(llllllllllllIllIlllIlIIlIIllIlIl.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[28]]));
                llllllllllllIllIlllIlIIlIIllIIlI.setRenderType(IScoreObjectiveCriteria.EnumRenderType.func_178795_a(llllllllllllIllIlllIlIIlIIllIlIl.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[29]])));
            }
            ++llllllllllllIllIlllIlIIlIIllIllI;
        }
    }
    
    protected void readScores(final NBTTagList llllllllllllIllIlllIlIIlIIlIIIlI) {
        int llllllllllllIllIlllIlIIlIIlIIIIl = ScoreboardSaveData.llIIllllIllIll[0];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lIIlIIIIIllIlIlI(llllllllllllIllIlllIlIIlIIlIIIIl, llllllllllllIllIlllIlIIlIIlIIIlI.tagCount())) {
            final NBTTagCompound llllllllllllIllIlllIlIIlIIlIIIII = llllllllllllIllIlllIlIIlIIlIIIlI.getCompoundTagAt(llllllllllllIllIlllIlIIlIIlIIIIl);
            final ScoreObjective llllllllllllIllIlllIlIIlIIIlllll = this.theScoreboard.getObjective(llllllllllllIllIlllIlIIlIIlIIIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[30]]));
            String llllllllllllIllIlllIlIIlIIIllllI = llllllllllllIllIlllIlIIlIIlIIIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[31]]);
            if (lIIlIIIIIllIlIIl(llllllllllllIllIlllIlIIlIIIllllI.length(), ScoreboardSaveData.llIIllllIllIll[32])) {
                llllllllllllIllIlllIlIIlIIIllllI = llllllllllllIllIlllIlIIlIIIllllI.substring(ScoreboardSaveData.llIIllllIllIll[0], ScoreboardSaveData.llIIllllIllIll[32]);
            }
            final Score llllllllllllIllIlllIlIIlIIIlllIl = this.theScoreboard.getValueFromObjective(llllllllllllIllIlllIlIIlIIIllllI, llllllllllllIllIlllIlIIlIIIlllll);
            llllllllllllIllIlllIlIIlIIIlllIl.setScorePoints(llllllllllllIllIlllIlIIlIIlIIIII.getInteger(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[33]]));
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIIlIIIII.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[34]]) ? 1 : 0)) {
                llllllllllllIllIlllIlIIlIIIlllIl.setLocked(llllllllllllIllIlllIlIIlIIlIIIII.getBoolean(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[12]]));
            }
            ++llllllllllllIllIlllIlIIlIIlIIIIl;
        }
    }
    
    private static boolean lIIlIIIIIllIIllI(final Object llllllllllllIllIlllIlIIIlIIIllII) {
        return llllllllllllIllIlllIlIIIlIIIllII != null;
    }
    
    private static boolean lIIlIIIIIllIlIll(final int llllllllllllIllIlllIlIIIlIIIIlII) {
        return llllllllllllIllIlllIlIIIlIIIIlII >= 0;
    }
    
    protected void readTeams(final NBTTagList llllllllllllIllIlllIlIIlIllIlIlI) {
        int llllllllllllIllIlllIlIIlIllIlIIl = ScoreboardSaveData.llIIllllIllIll[0];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lIIlIIIIIllIlIlI(llllllllllllIllIlllIlIIlIllIlIIl, llllllllllllIllIlllIlIIlIllIlIlI.tagCount())) {
            final NBTTagCompound llllllllllllIllIlllIlIIlIllIlIII = llllllllllllIllIlllIlIIlIllIlIlI.getCompoundTagAt(llllllllllllIllIlllIlIIlIllIlIIl);
            String llllllllllllIllIlllIlIIlIllIIlll = llllllllllllIllIlllIlIIlIllIlIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[9]]);
            if (lIIlIIIIIllIlIIl(llllllllllllIllIlllIlIIlIllIIlll.length(), ScoreboardSaveData.llIIllllIllIll[10])) {
                llllllllllllIllIlllIlIIlIllIIlll = llllllllllllIllIlllIlIIlIllIIlll.substring(ScoreboardSaveData.llIIllllIllIll[0], ScoreboardSaveData.llIIllllIllIll[10]);
            }
            final ScorePlayerTeam llllllllllllIllIlllIlIIlIllIIllI = this.theScoreboard.createTeam(llllllllllllIllIlllIlIIlIllIIlll);
            String llllllllllllIllIlllIlIIlIllIIlIl = llllllllllllIllIlllIlIIlIllIlIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[11]]);
            if (lIIlIIIIIllIlIIl(llllllllllllIllIlllIlIIlIllIIlIl.length(), ScoreboardSaveData.llIIllllIllIll[12])) {
                llllllllllllIllIlllIlIIlIllIIlIl = llllllllllllIllIlllIlIIlIllIIlIl.substring(ScoreboardSaveData.llIIllllIllIll[0], ScoreboardSaveData.llIIllllIllIll[12]);
            }
            llllllllllllIllIlllIlIIlIllIIllI.setTeamName(llllllllllllIllIlllIlIIlIllIIlIl);
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIllIlIII.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[7]], ScoreboardSaveData.llIIllllIllIll[11]) ? 1 : 0)) {
                llllllllllllIllIlllIlIIlIllIIllI.setChatFormat(EnumChatFormatting.getValueByName(llllllllllllIllIlllIlIIlIllIlIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[2]])));
            }
            llllllllllllIllIlllIlIIlIllIIllI.setNamePrefix(llllllllllllIllIlllIlIIlIllIlIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[13]]));
            llllllllllllIllIlllIlIIlIllIIllI.setNameSuffix(llllllllllllIllIlllIlIIlIllIlIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[14]]));
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIllIlIII.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[15]], ScoreboardSaveData.llIIllllIllIll[16]) ? 1 : 0)) {
                llllllllllllIllIlllIlIIlIllIIllI.setAllowFriendlyFire(llllllllllllIllIlllIlIIlIllIlIII.getBoolean(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[17]]));
            }
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIllIlIII.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[18]], ScoreboardSaveData.llIIllllIllIll[16]) ? 1 : 0)) {
                llllllllllllIllIlllIlIIlIllIIllI.setSeeFriendlyInvisiblesEnabled(llllllllllllIllIlllIlIIlIllIlIII.getBoolean(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[10]]));
            }
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIllIlIII.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[19]], ScoreboardSaveData.llIIllllIllIll[11]) ? 1 : 0)) {
                final Team.EnumVisible llllllllllllIllIlllIlIIlIllIIlII = Team.EnumVisible.func_178824_a(llllllllllllIllIlllIlIIlIllIlIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[20]]));
                if (lIIlIIIIIllIIllI(llllllllllllIllIlllIlIIlIllIIlII)) {
                    llllllllllllIllIlllIlIIlIllIIllI.setNameTagVisibility(llllllllllllIllIlllIlIIlIllIIlII);
                }
            }
            if (lIIlIIIIIllIlIII(llllllllllllIllIlllIlIIlIllIlIII.hasKey(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[21]], ScoreboardSaveData.llIIllllIllIll[11]) ? 1 : 0)) {
                final Team.EnumVisible llllllllllllIllIlllIlIIlIllIIIll = Team.EnumVisible.func_178824_a(llllllllllllIllIlllIlIIlIllIlIII.getString(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[22]]));
                if (lIIlIIIIIllIIllI(llllllllllllIllIlllIlIIlIllIIIll)) {
                    llllllllllllIllIlllIlIIlIllIIllI.setDeathMessageVisibility(llllllllllllIllIlllIlIIlIllIIIll);
                }
            }
            this.func_96502_a(llllllllllllIllIlllIlIIlIllIIllI, llllllllllllIllIlllIlIIlIllIlIII.getTagList(ScoreboardSaveData.llIIllllIllIIl[ScoreboardSaveData.llIIllllIllIll[23]], ScoreboardSaveData.llIIllllIllIll[11]));
            ++llllllllllllIllIlllIlIIlIllIlIIl;
        }
    }
    
    private static boolean lIIlIIIIIllIlIlI(final int llllllllllllIllIlllIlIIIlIIlIlll, final int llllllllllllIllIlllIlIIIlIIlIllI) {
        return llllllllllllIllIlllIlIIIlIIlIlll >= llllllllllllIllIlllIlIIIlIIlIllI;
    }
}
