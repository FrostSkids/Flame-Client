// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ChatComponentSelector extends ChatComponentStyle
{
    private static final /* synthetic */ String[] lIlIIllIllIIIl;
    private final /* synthetic */ String selector;
    private static final /* synthetic */ int[] lIlIIllIllIIlI;
    
    static {
        lllIlIIIIlIIIII();
        lllIlIIIIIlllll();
    }
    
    public ChatComponentSelector(final String lllllllllllllIIIllIIlIlIIIlIIIII) {
        this.selector = lllllllllllllIIIllIIlIlIIIlIIIII;
    }
    
    private static boolean lllIlIIIIlIIIll(final int lllllllllllllIIIllIIlIIlllIlIIlI) {
        return lllllllllllllIIIllIIlIIlllIlIIlI != 0;
    }
    
    private static boolean lllIlIIIIlIIIIl(final int lllllllllllllIIIllIIlIIlllIlIIII) {
        return lllllllllllllIIIllIIlIIlllIlIIII == 0;
    }
    
    public String getSelector() {
        return this.selector;
    }
    
    private static String lllIlIIIIIllllI(String lllllllllllllIIIllIIlIIlllllIIIl, final String lllllllllllllIIIllIIlIIlllllIIII) {
        lllllllllllllIIIllIIlIIlllllIIIl = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIIlIIlllllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIlIIlllllIlII = new StringBuilder();
        final char[] lllllllllllllIIIllIIlIIlllllIIll = lllllllllllllIIIllIIlIIlllllIIII.toCharArray();
        int lllllllllllllIIIllIIlIIlllllIIlI = ChatComponentSelector.lIlIIllIllIIlI[1];
        final Exception lllllllllllllIIIllIIlIIllllIllII = (Object)((String)lllllllllllllIIIllIIlIIlllllIIIl).toCharArray();
        final boolean lllllllllllllIIIllIIlIIllllIlIll = lllllllllllllIIIllIIlIIllllIllII.length != 0;
        long lllllllllllllIIIllIIlIIllllIlIlI = ChatComponentSelector.lIlIIllIllIIlI[1];
        while (lllIlIIIIlIIlII((int)lllllllllllllIIIllIIlIIllllIlIlI, lllllllllllllIIIllIIlIIllllIlIll ? 1 : 0)) {
            final char lllllllllllllIIIllIIlIIlllllIlll = lllllllllllllIIIllIIlIIllllIllII[lllllllllllllIIIllIIlIIllllIlIlI];
            lllllllllllllIIIllIIlIIlllllIlII.append((char)(lllllllllllllIIIllIIlIIlllllIlll ^ lllllllllllllIIIllIIlIIlllllIIll[lllllllllllllIIIllIIlIIlllllIIlI % lllllllllllllIIIllIIlIIlllllIIll.length]));
            "".length();
            ++lllllllllllllIIIllIIlIIlllllIIlI;
            ++lllllllllllllIIIllIIlIIllllIlIlI;
            "".length();
            if ("   ".length() <= ((0xAD ^ 0x87 ^ (0x92 ^ 0x9B)) & (140 + 25 - 161 + 146 ^ 137 + 141 - 178 + 81 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIlIIlllllIlII);
    }
    
    private static boolean lllIlIIIIlIIlII(final int lllllllllllllIIIllIIlIIlllIllIIl, final int lllllllllllllIIIllIIlIIlllIllIII) {
        return lllllllllllllIIIllIIlIIlllIllIIl < lllllllllllllIIIllIIlIIlllIllIII;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(ChatComponentSelector.lIlIIllIllIIIl[ChatComponentSelector.lIlIIllIllIIlI[1]]).append(this.selector).append((char)ChatComponentSelector.lIlIIllIllIIlI[2]).append(ChatComponentSelector.lIlIIllIllIIIl[ChatComponentSelector.lIlIIllIllIIlI[0]]).append(this.siblings).append(ChatComponentSelector.lIlIIllIllIIIl[ChatComponentSelector.lIlIIllIllIIlI[3]]).append(this.getChatStyle()).append((char)ChatComponentSelector.lIlIIllIllIIlI[4]));
    }
    
    @Override
    public ChatComponentSelector createCopy() {
        final ChatComponentSelector lllllllllllllIIIllIIlIlIIIIlIlII = new ChatComponentSelector(this.selector);
        lllllllllllllIIIllIIlIlIIIIlIlII.setChatStyle(this.getChatStyle().createShallowCopy());
        "".length();
        final short lllllllllllllIIIllIIlIlIIIIIllll = (short)this.getSiblings().iterator();
        "".length();
        if ((68 + 9 + 43 + 10 ^ 117 + 38 - 103 + 82) < "   ".length()) {
            return null;
        }
        while (!lllIlIIIIlIIIIl(((Iterator)lllllllllllllIIIllIIlIlIIIIIllll).hasNext() ? 1 : 0)) {
            final IChatComponent lllllllllllllIIIllIIlIlIIIIlIIll = ((Iterator<IChatComponent>)lllllllllllllIIIllIIlIlIIIIIllll).next();
            lllllllllllllIIIllIIlIlIIIIlIlII.appendSibling(lllllllllllllIIIllIIlIlIIIIlIIll.createCopy());
            "".length();
        }
        return lllllllllllllIIIllIIlIlIIIIlIlII;
    }
    
    private static void lllIlIIIIlIIIII() {
        (lIlIIllIllIIlI = new int[7])[0] = " ".length();
        ChatComponentSelector.lIlIIllIllIIlI[1] = ((0x98 ^ 0x9E ^ (0xC9 ^ 0xC7)) & (84 + 85 - 60 + 65 ^ 2 + 1 + 10 + 153 ^ -" ".length()));
        ChatComponentSelector.lIlIIllIllIIlI[2] = (0x15 ^ 0x32);
        ChatComponentSelector.lIlIIllIllIIlI[3] = "  ".length();
        ChatComponentSelector.lIlIIllIllIIlI[4] = (0xF0 ^ 0xAF ^ (0xB4 ^ 0x96));
        ChatComponentSelector.lIlIIllIllIIlI[5] = "   ".length();
        ChatComponentSelector.lIlIIllIllIIlI[6] = (0xBE ^ 0xB6);
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIllIIlIlIIIIIIlll) {
        if (lllIlIIIIlIIIlI(this, lllllllllllllIIIllIIlIlIIIIIIlll)) {
            return ChatComponentSelector.lIlIIllIllIIlI[0] != 0;
        }
        if (lllIlIIIIlIIIIl((lllllllllllllIIIllIIlIlIIIIIIlll instanceof ChatComponentSelector) ? 1 : 0)) {
            return ChatComponentSelector.lIlIIllIllIIlI[1] != 0;
        }
        final ChatComponentSelector lllllllllllllIIIllIIlIlIIIIIlIIl = (ChatComponentSelector)lllllllllllllIIIllIIlIlIIIIIIlll;
        if (lllIlIIIIlIIIll(this.selector.equals(lllllllllllllIIIllIIlIlIIIIIlIIl.selector) ? 1 : 0) && lllIlIIIIlIIIll(super.equals(lllllllllllllIIIllIIlIlIIIIIIlll) ? 1 : 0)) {
            return ChatComponentSelector.lIlIIllIllIIlI[0] != 0;
        }
        return ChatComponentSelector.lIlIIllIllIIlI[1] != 0;
    }
    
    @Override
    public String getUnformattedTextForChat() {
        return this.selector;
    }
    
    private static void lllIlIIIIIlllll() {
        (lIlIIllIllIIIl = new String[ChatComponentSelector.lIlIIllIllIIlI[5]])[ChatComponentSelector.lIlIIllIllIIlI[1]] = lllIlIIIIIlllIl("DK1PdlcG8VEQ8aINAwgtaMl9MLEbQiZBGIeUbYGi2ZM=", "IPSrd");
        ChatComponentSelector.lIlIIllIllIIIl[ChatComponentSelector.lIlIIllIllIIlI[0]] = lllIlIIIIIlllIl("AHs6Em4a/Dc9qXDpJgKJHA==", "XSFuO");
        ChatComponentSelector.lIlIIllIllIIIl[ChatComponentSelector.lIlIIllIllIIlI[3]] = lllIlIIIIIllllI("bXQiFR4tMWw=", "ATQag");
    }
    
    private static boolean lllIlIIIIlIIIlI(final Object lllllllllllllIIIllIIlIIlllIlIlIl, final Object lllllllllllllIIIllIIlIIlllIlIlII) {
        return lllllllllllllIIIllIIlIIlllIlIlIl == lllllllllllllIIIllIIlIIlllIlIlII;
    }
    
    private static String lllIlIIIIIlllIl(final String lllllllllllllIIIllIIlIIlllIlllll, final String lllllllllllllIIIllIIlIIllllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIIllllIIIII.getBytes(StandardCharsets.UTF_8)), ChatComponentSelector.lIlIIllIllIIlI[6]), "DES");
            final Cipher lllllllllllllIIIllIIlIIllllIIIll = Cipher.getInstance("DES");
            lllllllllllllIIIllIIlIIllllIIIll.init(ChatComponentSelector.lIlIIllIllIIlI[3], lllllllllllllIIIllIIlIIllllIIlII);
            return new String(lllllllllllllIIIllIIlIIllllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIIllllIIIlI) {
            lllllllllllllIIIllIIlIIllllIIIlI.printStackTrace();
            return null;
        }
    }
}
