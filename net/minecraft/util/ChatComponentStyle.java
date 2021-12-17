// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Iterators;
import com.google.common.base.Function;
import java.util.Iterator;
import java.util.List;

public abstract class ChatComponentStyle implements IChatComponent
{
    protected /* synthetic */ List<IChatComponent> siblings;
    private static final /* synthetic */ int[] lIllllllllIlII;
    private static final /* synthetic */ String[] lIllllllllIIll;
    private /* synthetic */ ChatStyle style;
    
    @Override
    public final String getFormattedText() {
        final StringBuilder llllllllllllIllllIIIlIllIlllIlIl = new StringBuilder();
        final float llllllllllllIllllIIIlIllIlllIIII = (float)this.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIIIllIIlIIllll(((Iterator)llllllllllllIllllIIIlIllIlllIIII).hasNext() ? 1 : 0)) {
            final IChatComponent llllllllllllIllllIIIlIllIlllIlII = ((Iterator<IChatComponent>)llllllllllllIllllIIIlIllIlllIIII).next();
            llllllllllllIllllIIIlIllIlllIlIl.append(llllllllllllIllllIIIlIllIlllIlII.getChatStyle().getFormattingCode());
            "".length();
            llllllllllllIllllIIIlIllIlllIlIl.append(llllllllllllIllllIIIlIllIlllIlII.getUnformattedTextForChat());
            "".length();
            llllllllllllIllllIIIlIllIlllIlIl.append(EnumChatFormatting.RESET);
            "".length();
        }
        return String.valueOf(llllllllllllIllllIIIlIllIlllIlIl);
    }
    
    @Override
    public final String getUnformattedText() {
        final StringBuilder llllllllllllIllllIIIlIlllIIIIIII = new StringBuilder();
        final double llllllllllllIllllIIIlIllIllllIll = (double)this.iterator();
        "".length();
        if (" ".length() <= ((89 + 107 - 162 + 145 ^ 181 + 81 - 158 + 86) & (0x16 ^ 0x19 ^ "  ".length() ^ -" ".length()))) {
            return null;
        }
        while (!lIIIIllIIlIIllll(((Iterator)llllllllllllIllllIIIlIllIllllIll).hasNext() ? 1 : 0)) {
            final IChatComponent llllllllllllIllllIIIlIllIlllllll = ((Iterator<IChatComponent>)llllllllllllIllllIIIlIllIllllIll).next();
            llllllllllllIllllIIIlIlllIIIIIII.append(llllllllllllIllllIIIlIllIlllllll.getUnformattedTextForChat());
            "".length();
        }
        return String.valueOf(llllllllllllIllllIIIlIlllIIIIIII);
    }
    
    static {
        lIIIIllIIlIIlllI();
        lIIIIllIIlIIllIl();
    }
    
    public static Iterator<IChatComponent> createDeepCopyIterator(final Iterable<IChatComponent> llllllllllllIllllIIIlIllIllIlIll) {
        Iterator<IChatComponent> llllllllllllIllllIIIlIllIllIllII = (Iterator<IChatComponent>)Iterators.concat(Iterators.transform((Iterator)llllllllllllIllllIIIlIllIllIlIll.iterator(), (Function)new Function<IChatComponent, Iterator<IChatComponent>>() {
            public Iterator<IChatComponent> apply(final IChatComponent lllllllllllllIIIIIlllIIIlIllIIII) {
                return lllllllllllllIIIIIlllIIIlIllIIII.iterator();
            }
        }));
        llllllllllllIllllIIIlIllIllIllII = (Iterator<IChatComponent>)Iterators.transform((Iterator)llllllllllllIllllIIIlIllIllIllII, (Function)new Function<IChatComponent, IChatComponent>() {
            public IChatComponent apply(final IChatComponent llllllllllllIllIlIlIlllllIlIlIII) {
                final IChatComponent llllllllllllIllIlIlIlllllIlIlIIl = llllllllllllIllIlIlIlllllIlIlIII.createCopy();
                llllllllllllIllIlIlIlllllIlIlIIl.setChatStyle(llllllllllllIllIlIlIlllllIlIlIIl.getChatStyle().createDeepCopy());
                "".length();
                return llllllllllllIllIlIlIlllllIlIlIIl;
            }
        });
        return llllllllllllIllllIIIlIllIllIllII;
    }
    
    private static boolean lIIIIllIIlIIllll(final int llllllllllllIllllIIIlIllIIllIlll) {
        return llllllllllllIllllIIIlIllIIllIlll == 0;
    }
    
    @Override
    public IChatComponent setChatStyle(final ChatStyle llllllllllllIllllIIIlIlllIIlIIll) {
        this.style = llllllllllllIllllIIIlIlllIIlIIll;
        final String llllllllllllIllllIIIlIlllIIlIIIl = (String)this.siblings.iterator();
        "".length();
        if ("   ".length() == " ".length()) {
            return null;
        }
        while (!lIIIIllIIlIIllll(((Iterator)llllllllllllIllllIIIlIlllIIlIIIl).hasNext() ? 1 : 0)) {
            final IChatComponent llllllllllllIllllIIIlIlllIIlIlIl = ((Iterator<IChatComponent>)llllllllllllIllllIIIlIlllIIlIIIl).next();
            llllllllllllIllllIIIlIlllIIlIlIl.getChatStyle().setParentStyle(this.getChatStyle());
            "".length();
        }
        return this;
    }
    
    @Override
    public IChatComponent appendSibling(final IChatComponent llllllllllllIllllIIIlIlllIlIIlll) {
        llllllllllllIllllIIIlIlllIlIIlll.getChatStyle().setParentStyle(this.getChatStyle());
        "".length();
        this.siblings.add(llllllllllllIllllIIIlIlllIlIIlll);
        "".length();
        return this;
    }
    
    @Override
    public List<IChatComponent> getSiblings() {
        return this.siblings;
    }
    
    private static boolean lIIIIllIIlIlIIIl(final Object llllllllllllIllllIIIlIllIIlllllI, final Object llllllllllllIllllIIIlIllIIllllIl) {
        return llllllllllllIllllIIIlIllIIlllllI == llllllllllllIllllIIIlIllIIllllIl;
    }
    
    @Override
    public IChatComponent appendText(final String llllllllllllIllllIIIlIlllIIlllII) {
        return this.appendSibling(new ChatComponentText(llllllllllllIllllIIIlIlllIIlllII));
    }
    
    private static String lIIIIllIIlIIlIll(final String llllllllllllIllllIIIlIllIlIlIIIl, final String llllllllllllIllllIIIlIllIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIllIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIllIlIlIIII.getBytes(StandardCharsets.UTF_8)), ChatComponentStyle.lIllllllllIlII[5]), "DES");
            final Cipher llllllllllllIllllIIIlIllIlIlIlIl = Cipher.getInstance("DES");
            llllllllllllIllllIIIlIllIlIlIlIl.init(ChatComponentStyle.lIllllllllIlII[4], llllllllllllIllllIIIlIllIlIlIllI);
            return new String(llllllllllllIllllIIIlIllIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIllIlIlIlII) {
            llllllllllllIllllIIIlIllIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIIlIlIIlI(final int llllllllllllIllllIIIlIllIIlllIIl) {
        return llllllllllllIllllIIIlIllIIlllIIl != 0;
    }
    
    private static void lIIIIllIIlIIllIl() {
        (lIllllllllIIll = new String[ChatComponentStyle.lIllllllllIlII[4]])[ChatComponentStyle.lIllllllllIlII[1]] = lIIIIllIIlIIlIll("GRNKM0i6kRtKxSkSgbTLTrkQCtGm0Vba", "zznIH");
        ChatComponentStyle.lIllllllllIIll[ChatComponentStyle.lIllllllllIlII[0]] = lIIIIllIIlIIllII("jTi+4xjTlydd6m0kAjsZVw==", "DVpWk");
    }
    
    private static boolean lIIIIllIIlIlIIII(final Object llllllllllllIllllIIIlIllIIlllIll) {
        return llllllllllllIllllIIIlIllIIlllIll == null;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllllIIIlIllIllIIIlI) {
        if (lIIIIllIIlIlIIIl(this, llllllllllllIllllIIIlIllIllIIIlI)) {
            return ChatComponentStyle.lIllllllllIlII[0] != 0;
        }
        if (lIIIIllIIlIIllll((llllllllllllIllllIIIlIllIllIIIlI instanceof ChatComponentStyle) ? 1 : 0)) {
            return ChatComponentStyle.lIllllllllIlII[1] != 0;
        }
        final ChatComponentStyle llllllllllllIllllIIIlIllIllIIlII = (ChatComponentStyle)llllllllllllIllllIIIlIllIllIIIlI;
        if (lIIIIllIIlIlIIlI(this.siblings.equals(llllllllllllIllllIIIlIllIllIIlII.siblings) ? 1 : 0) && lIIIIllIIlIlIIlI(this.getChatStyle().equals(llllllllllllIllllIIIlIllIllIIlII.getChatStyle()) ? 1 : 0)) {
            return ChatComponentStyle.lIllllllllIlII[0] != 0;
        }
        return ChatComponentStyle.lIllllllllIlII[1] != 0;
    }
    
    public ChatComponentStyle() {
        this.siblings = (List<IChatComponent>)Lists.newArrayList();
    }
    
    @Override
    public Iterator<IChatComponent> iterator() {
        final ChatComponentStyle[] array = new ChatComponentStyle[ChatComponentStyle.lIllllllllIlII[0]];
        array[ChatComponentStyle.lIllllllllIlII[1]] = this;
        return (Iterator<IChatComponent>)Iterators.concat((Iterator)Iterators.forArray((Object[])array), (Iterator)createDeepCopyIterator(this.siblings));
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(ChatComponentStyle.lIllllllllIIll[ChatComponentStyle.lIllllllllIlII[1]]).append(this.style).append(ChatComponentStyle.lIllllllllIIll[ChatComponentStyle.lIllllllllIlII[0]]).append(this.siblings).append((char)ChatComponentStyle.lIllllllllIlII[3]));
    }
    
    @Override
    public int hashCode() {
        return ChatComponentStyle.lIllllllllIlII[2] * this.style.hashCode() + this.siblings.hashCode();
    }
    
    private static String lIIIIllIIlIIllII(final String llllllllllllIllllIIIlIllIlIIIlII, final String llllllllllllIllllIIIlIllIlIIIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIllIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIlIllIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIlIllIlIIlIII.init(ChatComponentStyle.lIllllllllIlII[4], llllllllllllIllllIIIlIllIlIIlIIl);
            return new String(llllllllllllIllllIIIlIllIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIllIlIIIlll) {
            llllllllllllIllllIIIlIllIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIllIIlIIlllI() {
        (lIllllllllIlII = new int[6])[0] = " ".length();
        ChatComponentStyle.lIllllllllIlII[1] = ((0x1C ^ 0x3A ^ (0x26 ^ 0x55)) & (173 + 180 - 173 + 33 ^ 98 + 84 - 67 + 13 ^ -" ".length()));
        ChatComponentStyle.lIllllllllIlII[2] = (0x6B ^ 0x74);
        ChatComponentStyle.lIllllllllIlII[3] = (0x40 ^ 0x46 ^ (0xDD ^ 0xA6));
        ChatComponentStyle.lIllllllllIlII[4] = "  ".length();
        ChatComponentStyle.lIllllllllIlII[5] = (186 + 161 - 230 + 87 ^ 132 + 168 - 204 + 100);
    }
    
    @Override
    public ChatStyle getChatStyle() {
        if (lIIIIllIIlIlIIII(this.style)) {
            this.style = new ChatStyle();
            final boolean llllllllllllIllllIIIlIlllIIIlIIl = (boolean)this.siblings.iterator();
            "".length();
            if (-" ".length() > (64 + 21 - 69 + 116 ^ 34 + 24 + 29 + 41)) {
                return null;
            }
            while (!lIIIIllIIlIIllll(((Iterator)llllllllllllIllllIIIlIlllIIIlIIl).hasNext() ? 1 : 0)) {
                final IChatComponent llllllllllllIllllIIIlIlllIIIllII = ((Iterator<IChatComponent>)llllllllllllIllllIIIlIlllIIIlIIl).next();
                llllllllllllIllllIIIlIlllIIIllII.getChatStyle().setParentStyle(this.style);
                "".length();
            }
        }
        return this.style;
    }
}
