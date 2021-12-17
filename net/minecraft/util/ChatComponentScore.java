// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChatComponentScore extends ChatComponentStyle
{
    private static final /* synthetic */ String[] lIlIIlIIIlIIll;
    private final /* synthetic */ String objective;
    private final /* synthetic */ String name;
    private /* synthetic */ String value;
    private static final /* synthetic */ int[] lIlIIlIIIlIlII;
    
    @Override
    public boolean equals(final Object lllllllllllllIIIlllIIlIllIIlllll) {
        if (lllIIlIlIIIlIll(this, lllllllllllllIIIlllIIlIllIIlllll)) {
            return ChatComponentScore.lIlIIlIIIlIlII[1] != 0;
        }
        if (lllIIlIlIIIlIlI((lllllllllllllIIIlllIIlIllIIlllll instanceof ChatComponentScore) ? 1 : 0)) {
            return ChatComponentScore.lIlIIlIIIlIlII[0] != 0;
        }
        final ChatComponentScore lllllllllllllIIIlllIIlIllIIllllI = (ChatComponentScore)lllllllllllllIIIlllIIlIllIIlllll;
        if (lllIIlIlIIIlIIl(this.name.equals(lllllllllllllIIIlllIIlIllIIllllI.name) ? 1 : 0) && lllIIlIlIIIlIIl(this.objective.equals(lllllllllllllIIIlllIIlIllIIllllI.objective) ? 1 : 0) && lllIIlIlIIIlIIl(super.equals(lllllllllllllIIIlllIIlIllIIlllll) ? 1 : 0)) {
            return ChatComponentScore.lIlIIlIIIlIlII[1] != 0;
        }
        return ChatComponentScore.lIlIIlIIIlIlII[0] != 0;
    }
    
    private static String lllIIlIlIIIIIll(final String lllllllllllllIIIlllIIlIllIIIlllI, final String lllllllllllllIIIlllIIlIllIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIlIllIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIIlIllIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIIlIllIIlIIII.init(ChatComponentScore.lIlIIlIIIlIlII[2], lllllllllllllIIIlllIIlIllIIlIIIl);
            return new String(lllllllllllllIIIlllIIlIllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIlIllIIIllll) {
            lllllllllllllIIIlllIIlIllIIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[3]]).append(this.name).append((char)ChatComponentScore.lIlIIlIIIlIlII[4]).append(ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[5]]).append(this.objective).append((char)ChatComponentScore.lIlIIlIIIlIlII[4]).append(ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[6]]).append(this.siblings).append(ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[7]]).append(this.getChatStyle()).append((char)ChatComponentScore.lIlIIlIIIlIlII[8]));
    }
    
    private static String lllIIlIlIIIIIlI(String lllllllllllllIIIlllIIlIlIllllIIl, final String lllllllllllllIIIlllIIlIlIllllIII) {
        lllllllllllllIIIlllIIlIlIllllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIlIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIIlIlIlllllII = new StringBuilder();
        final char[] lllllllllllllIIIlllIIlIlIllllIll = lllllllllllllIIIlllIIlIlIllllIII.toCharArray();
        int lllllllllllllIIIlllIIlIlIllllIlI = ChatComponentScore.lIlIIlIIIlIlII[0];
        final float lllllllllllllIIIlllIIlIlIlllIlII = (Object)lllllllllllllIIIlllIIlIlIllllIIl.toCharArray();
        final float lllllllllllllIIIlllIIlIlIlllIIll = lllllllllllllIIIlllIIlIlIlllIlII.length;
        byte lllllllllllllIIIlllIIlIlIlllIIlI = (byte)ChatComponentScore.lIlIIlIIIlIlII[0];
        while (lllIIlIlIIIllII(lllllllllllllIIIlllIIlIlIlllIIlI, (int)lllllllllllllIIIlllIIlIlIlllIIll)) {
            final char lllllllllllllIIIlllIIlIlIlllllll = lllllllllllllIIIlllIIlIlIlllIlII[lllllllllllllIIIlllIIlIlIlllIIlI];
            lllllllllllllIIIlllIIlIlIlllllII.append((char)(lllllllllllllIIIlllIIlIlIlllllll ^ lllllllllllllIIIlllIIlIlIllllIll[lllllllllllllIIIlllIIlIlIllllIlI % lllllllllllllIIIlllIIlIlIllllIll.length]));
            "".length();
            ++lllllllllllllIIIlllIIlIlIllllIlI;
            ++lllllllllllllIIIlllIIlIlIlllIIlI;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIIlIlIlllllII);
    }
    
    private static void lllIIlIlIIIIlll() {
        (lIlIIlIIIlIlII = new int[11])[0] = ((0xA7 ^ 0x9E ^ (0xCC ^ 0x94)) & (182 + 146 - 143 + 31 ^ 37 + 170 - 93 + 71 ^ -" ".length()));
        ChatComponentScore.lIlIIlIIIlIlII[1] = " ".length();
        ChatComponentScore.lIlIIlIIIlIlII[2] = "  ".length();
        ChatComponentScore.lIlIIlIIIlIlII[3] = "   ".length();
        ChatComponentScore.lIlIIlIIIlIlII[4] = (0x4E ^ 0x69);
        ChatComponentScore.lIlIIlIIIlIlII[5] = (0x8 ^ 0xC);
        ChatComponentScore.lIlIIlIIIlIlII[6] = (0x9C ^ 0x99);
        ChatComponentScore.lIlIIlIIIlIlII[7] = (0x4E ^ 0x47 ^ (0x7D ^ 0x72));
        ChatComponentScore.lIlIIlIIIlIlII[8] = (0xC2 ^ 0xBF);
        ChatComponentScore.lIlIIlIIIlIlII[9] = (78 + 39 - 46 + 76 ^ 36 + 72 - 85 + 125);
        ChatComponentScore.lIlIIlIIIlIlII[10] = (0x67 ^ 0x6F);
    }
    
    private static String lllIIlIlIIIIlII(final String lllllllllllllIIIlllIIlIlIllIlIIl, final String lllllllllllllIIIlllIIlIlIllIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIlIlIllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIlIllIlIII.getBytes(StandardCharsets.UTF_8)), ChatComponentScore.lIlIIlIIIlIlII[10]), "DES");
            final Cipher lllllllllllllIIIlllIIlIlIllIlIll = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIlIlIllIlIll.init(ChatComponentScore.lIlIIlIIIlIlII[2], lllllllllllllIIIlllIIlIlIllIllII);
            return new String(lllllllllllllIIIlllIIlIlIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIlIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIlIlIllIlIlI) {
            lllllllllllllIIIlllIIlIlIllIlIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIIlIlIIIIlll();
        lllIIlIlIIIIlIl();
    }
    
    private static boolean lllIIlIlIIIlIll(final Object lllllllllllllIIIlllIIlIlIlIllIll, final Object lllllllllllllIIIlllIIlIlIlIllIlI) {
        return lllllllllllllIIIlllIIlIlIlIllIll == lllllllllllllIIIlllIIlIlIlIllIlI;
    }
    
    @Override
    public String getUnformattedTextForChat() {
        final MinecraftServer lllllllllllllIIIlllIIlIllIllIlll = MinecraftServer.getServer();
        if (lllIIlIlIIIlIII(lllllllllllllIIIlllIIlIllIllIlll) && lllIIlIlIIIlIIl(lllllllllllllIIIlllIIlIllIllIlll.isAnvilFileSet() ? 1 : 0) && lllIIlIlIIIlIIl(StringUtils.isNullOrEmpty(this.value) ? 1 : 0)) {
            final Scoreboard lllllllllllllIIIlllIIlIllIllIllI = lllllllllllllIIIlllIIlIllIllIlll.worldServerForDimension(ChatComponentScore.lIlIIlIIIlIlII[0]).getScoreboard();
            final ScoreObjective lllllllllllllIIIlllIIlIllIllIlIl = lllllllllllllIIIlllIIlIllIllIllI.getObjective(this.objective);
            if (lllIIlIlIIIlIIl(lllllllllllllIIIlllIIlIllIllIllI.entityHasObjective(this.name, lllllllllllllIIIlllIIlIllIllIlIl) ? 1 : 0)) {
                final Score lllllllllllllIIIlllIIlIllIllIlII = lllllllllllllIIIlllIIlIllIllIllI.getValueFromObjective(this.name, lllllllllllllIIIlllIIlIllIllIlIl);
                final String format = ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[1]];
                final Object[] args = new Object[ChatComponentScore.lIlIIlIIIlIlII[1]];
                args[ChatComponentScore.lIlIIlIIIlIlII[0]] = lllllllllllllIIIlllIIlIllIllIlII.getScorePoints();
                this.setValue(String.format(format, args));
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            else {
                this.value = ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[2]];
            }
        }
        return this.value;
    }
    
    private static boolean lllIIlIlIIIlIIl(final int lllllllllllllIIIlllIIlIlIlIllIII) {
        return lllllllllllllIIIlllIIlIlIlIllIII != 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    private static void lllIIlIlIIIIlIl() {
        (lIlIIlIIIlIIll = new String[ChatComponentScore.lIlIIlIIIlIlII[9]])[ChatComponentScore.lIlIIlIIIlIlII[0]] = lllIIlIlIIIIIlI("", "zMMuZ");
        ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[1]] = lllIIlIlIIIIIll("3hqnWfT8AGo=", "BHdqi");
        ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[2]] = lllIIlIlIIIIIlI("", "oxHTx");
        ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[3]] = lllIIlIlIIIIIll("wCFn9+wpRqa8X8yOPNpEW5QzM9/r2BKP", "zGtGQ");
        ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[5]] = lllIIlIlIIIIIlI("Hi49DzQFJSEPalY=", "qLWjW");
        ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[6]] = lllIIlIlIIIIlII("dKvT8BarlbosOVnn4rrn+Q==", "ZwrKh");
        ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[7]] = lllIIlIlIIIIlII("j4yM/cyudJk51bKahdguRw==", "Tzbks");
    }
    
    private static boolean lllIIlIlIIIlIII(final Object lllllllllllllIIIlllIIlIlIlIllllI) {
        return lllllllllllllIIIlllIIlIlIlIllllI != null;
    }
    
    private static boolean lllIIlIlIIIlIlI(final int lllllllllllllIIIlllIIlIlIlIlIllI) {
        return lllllllllllllIIIlllIIlIlIlIlIllI == 0;
    }
    
    public ChatComponentScore(final String lllllllllllllIIIlllIIlIlllIIlIll, final String lllllllllllllIIIlllIIlIlllIIlIlI) {
        this.value = ChatComponentScore.lIlIIlIIIlIIll[ChatComponentScore.lIlIIlIIIlIlII[0]];
        this.name = lllllllllllllIIIlllIIlIlllIIlIll;
        this.objective = lllllllllllllIIIlllIIlIlllIIlIlI;
    }
    
    public void setValue(final String lllllllllllllIIIlllIIlIllIlllllI) {
        this.value = lllllllllllllIIIlllIIlIllIlllllI;
    }
    
    private static boolean lllIIlIlIIIllII(final int lllllllllllllIIIlllIIlIlIllIIIIl, final int lllllllllllllIIIlllIIlIlIllIIIII) {
        return lllllllllllllIIIlllIIlIlIllIIIIl < lllllllllllllIIIlllIIlIlIllIIIII;
    }
    
    public String getObjective() {
        return this.objective;
    }
    
    @Override
    public ChatComponentScore createCopy() {
        final ChatComponentScore lllllllllllllIIIlllIIlIllIlIlIIl = new ChatComponentScore(this.name, this.objective);
        lllllllllllllIIIlllIIlIllIlIlIIl.setValue(this.value);
        lllllllllllllIIIlllIIlIllIlIlIIl.setChatStyle(this.getChatStyle().createShallowCopy());
        "".length();
        final float lllllllllllllIIIlllIIlIllIlIIlII = (float)this.getSiblings().iterator();
        "".length();
        if ((18 + 166 - 102 + 95 ^ 120 + 82 - 77 + 55) == 0x0) {
            return null;
        }
        while (!lllIIlIlIIIlIlI(((Iterator)lllllllllllllIIIlllIIlIllIlIIlII).hasNext() ? 1 : 0)) {
            final IChatComponent lllllllllllllIIIlllIIlIllIlIlIII = ((Iterator<IChatComponent>)lllllllllllllIIIlllIIlIllIlIIlII).next();
            lllllllllllllIIIlllIIlIllIlIlIIl.appendSibling(lllllllllllllIIIlllIIlIllIlIlIII.createCopy());
            "".length();
        }
        return lllllllllllllIIIlllIIlIllIlIlIIl;
    }
}
