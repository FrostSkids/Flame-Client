// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ChatComponentText extends ChatComponentStyle
{
    private static final /* synthetic */ int[] lllIlIIIIIIlll;
    private final /* synthetic */ String text;
    private static final /* synthetic */ String[] lllIlIIIIIIllI;
    
    private static String lIlIIIIlIlIIlllI(String llllllllllllIlIlllIIllllIlIlIllI, final String llllllllllllIlIlllIIllllIlIllIlI) {
        llllllllllllIlIlllIIllllIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIllllIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIllllIlIllIIl = new StringBuilder();
        final char[] llllllllllllIlIlllIIllllIlIllIII = llllllllllllIlIlllIIllllIlIllIlI.toCharArray();
        int llllllllllllIlIlllIIllllIlIlIlll = ChatComponentText.lllIlIIIIIIlll[1];
        final double llllllllllllIlIlllIIllllIlIlIIIl = (Object)llllllllllllIlIlllIIllllIlIlIllI.toCharArray();
        final float llllllllllllIlIlllIIllllIlIlIIII = llllllllllllIlIlllIIllllIlIlIIIl.length;
        boolean llllllllllllIlIlllIIllllIlIIllll = ChatComponentText.lllIlIIIIIIlll[1] != 0;
        while (lIlIIIIlIlIlIlIl(llllllllllllIlIlllIIllllIlIIllll ? 1 : 0, (int)llllllllllllIlIlllIIllllIlIlIIII)) {
            final char llllllllllllIlIlllIIllllIlIlllII = llllllllllllIlIlllIIllllIlIlIIIl[llllllllllllIlIlllIIllllIlIIllll];
            llllllllllllIlIlllIIllllIlIllIIl.append((char)(llllllllllllIlIlllIIllllIlIlllII ^ llllllllllllIlIlllIIllllIlIllIII[llllllllllllIlIlllIIllllIlIlIlll % llllllllllllIlIlllIIllllIlIllIII.length]));
            "".length();
            ++llllllllllllIlIlllIIllllIlIlIlll;
            ++llllllllllllIlIlllIIllllIlIIllll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIllllIlIllIIl);
    }
    
    private static String lIlIIIIlIlIIllll(final String llllllllllllIlIlllIIllllIlIIIllI, final String llllllllllllIlIlllIIllllIlIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllllIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllllIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIllllIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIllllIlIIlIII.init(ChatComponentText.lllIlIIIIIIlll[3], llllllllllllIlIlllIIllllIlIIlIIl);
            return new String(llllllllllllIlIlllIIllllIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllllIlIIIlll) {
            llllllllllllIlIlllIIllllIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIlIlIlIlIl(final int llllllllllllIlIlllIIllllIIlllllI, final int llllllllllllIlIlllIIllllIIllllIl) {
        return llllllllllllIlIlllIIllllIIlllllI < llllllllllllIlIlllIIllllIIllllIl;
    }
    
    public String getChatComponentText_TextValue() {
        return this.text;
    }
    
    private static boolean lIlIIIIlIlIlIIll(final Object llllllllllllIlIlllIIllllIIlllIlI, final Object llllllllllllIlIlllIIllllIIlllIIl) {
        return llllllllllllIlIlllIIllllIIlllIlI == llllllllllllIlIlllIIllllIIlllIIl;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(ChatComponentText.lllIlIIIIIIllI[ChatComponentText.lllIlIIIIIIlll[1]]).append(this.text).append((char)ChatComponentText.lllIlIIIIIIlll[2]).append(ChatComponentText.lllIlIIIIIIllI[ChatComponentText.lllIlIIIIIIlll[0]]).append(this.siblings).append(ChatComponentText.lllIlIIIIIIllI[ChatComponentText.lllIlIIIIIIlll[3]]).append(this.getChatStyle()).append((char)ChatComponentText.lllIlIIIIIIlll[4]));
    }
    
    @Override
    public String getUnformattedTextForChat() {
        return this.text;
    }
    
    private static boolean lIlIIIIlIlIlIIlI(final int llllllllllllIlIlllIIllllIIllIlIl) {
        return llllllllllllIlIlllIIllllIIllIlIl == 0;
    }
    
    private static boolean lIlIIIIlIlIlIlII(final int llllllllllllIlIlllIIllllIIllIlll) {
        return llllllllllllIlIlllIIllllIIllIlll != 0;
    }
    
    @Override
    public ChatComponentText createCopy() {
        final ChatComponentText llllllllllllIlIlllIIllllIllllIIl = new ChatComponentText(this.text);
        llllllllllllIlIlllIIllllIllllIIl.setChatStyle(this.getChatStyle().createShallowCopy());
        "".length();
        final Exception llllllllllllIlIlllIIllllIlllIlII = (Exception)this.getSiblings().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIIIIlIlIlIIlI(((Iterator)llllllllllllIlIlllIIllllIlllIlII).hasNext() ? 1 : 0)) {
            final IChatComponent llllllllllllIlIlllIIllllIllllIII = ((Iterator<IChatComponent>)llllllllllllIlIlllIIllllIlllIlII).next();
            llllllllllllIlIlllIIllllIllllIIl.appendSibling(llllllllllllIlIlllIIllllIllllIII.createCopy());
            "".length();
        }
        return llllllllllllIlIlllIIllllIllllIIl;
    }
    
    public ChatComponentText(final String llllllllllllIlIlllIIlllllIIIIlIl) {
        this.text = llllllllllllIlIlllIIlllllIIIIlIl;
    }
    
    private static void lIlIIIIlIlIlIIIl() {
        (lllIlIIIIIIlll = new int[6])[0] = " ".length();
        ChatComponentText.lllIlIIIIIIlll[1] = (" ".length() & (" ".length() ^ -" ".length()));
        ChatComponentText.lllIlIIIIIIlll[2] = (24 + 100 - 107 + 146 ^ 113 + 83 - 149 + 85);
        ChatComponentText.lllIlIIIIIIlll[3] = "  ".length();
        ChatComponentText.lllIlIIIIIIlll[4] = (220 + 83 - 123 + 54 ^ 131 + 42 - 31 + 9);
        ChatComponentText.lllIlIIIIIIlll[5] = "   ".length();
    }
    
    static {
        lIlIIIIlIlIlIIIl();
        lIlIIIIlIlIlIIII();
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlIlllIIllllIllIllll) {
        if (lIlIIIIlIlIlIIll(this, llllllllllllIlIlllIIllllIllIllll)) {
            return ChatComponentText.lllIlIIIIIIlll[0] != 0;
        }
        if (lIlIIIIlIlIlIIlI((llllllllllllIlIlllIIllllIllIllll instanceof ChatComponentText) ? 1 : 0)) {
            return ChatComponentText.lllIlIIIIIIlll[1] != 0;
        }
        final ChatComponentText llllllllllllIlIlllIIllllIllIlllI = (ChatComponentText)llllllllllllIlIlllIIllllIllIllll;
        if (lIlIIIIlIlIlIlII(this.text.equals(llllllllllllIlIlllIIllllIllIlllI.getChatComponentText_TextValue()) ? 1 : 0) && lIlIIIIlIlIlIlII(super.equals(llllllllllllIlIlllIIllllIllIllll) ? 1 : 0)) {
            return ChatComponentText.lllIlIIIIIIlll[0] != 0;
        }
        return ChatComponentText.lllIlIIIIIIlll[1] != 0;
    }
    
    private static void lIlIIIIlIlIlIIII() {
        (lllIlIIIIIIllI = new String[ChatComponentText.lllIlIIIIIIlll[5]])[ChatComponentText.lllIlIIIIIIlll[1]] = lIlIIIIlIlIIlllI("Fz0XNhcsNR8tOiY2GzkgJiAbf3M=", "CXoBT");
        ChatComponentText.lllIlIIIIIIllI[ChatComponentText.lllIlIIIIIIlll[0]] = lIlIIIIlIlIIllll("CLX7lyztukChXRkXsKsQHA==", "dqwfX");
        ChatComponentText.lllIlIIIIIIllI[ChatComponentText.lllIlIIIIIIlll[3]] = lIlIIIIlIlIIllll("3P6NyQbMRJQ7xwqMm2IRSg==", "bqVQn");
    }
}
