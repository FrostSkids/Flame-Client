// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;

public class ChatStyle
{
    private /* synthetic */ EnumChatFormatting color;
    private /* synthetic */ ChatStyle parentStyle;
    private /* synthetic */ Boolean bold;
    private /* synthetic */ HoverEvent chatHoverEvent;
    private /* synthetic */ Boolean italic;
    private /* synthetic */ ClickEvent chatClickEvent;
    private static final /* synthetic */ int[] llIlIIlIIlIllI;
    private /* synthetic */ String insertion;
    private static final /* synthetic */ String[] llIlIIlIIlIIIl;
    private static final /* synthetic */ ChatStyle rootStyle;
    private /* synthetic */ Boolean strikethrough;
    private /* synthetic */ Boolean underlined;
    private /* synthetic */ Boolean obfuscated;
    
    static /* synthetic */ void access$8(final ChatStyle llllllllllllIllIllIIIllIIIIlIIlI, final HoverEvent llllllllllllIllIllIIIllIIIIlIIIl) {
        llllllllllllIllIllIIIllIIIIlIIlI.chatHoverEvent = llllllllllllIllIllIIIllIIIIlIIIl;
    }
    
    public boolean getObfuscated() {
        boolean b;
        if (lIIlIIlIIllIIlIl(this.obfuscated)) {
            b = this.getParent().getObfuscated();
            "".length();
            if (null != null) {
                return ((0xA0 ^ 0x88) & ~(0xBC ^ 0x94)) != 0x0;
            }
        }
        else {
            b = this.obfuscated;
        }
        return b;
    }
    
    static /* synthetic */ void access$6(final ChatStyle llllllllllllIllIllIIIllIIIIllIlI, final String llllllllllllIllIllIIIllIIIIllIIl) {
        llllllllllllIllIllIIIllIIIIllIlI.insertion = llllllllllllIllIllIIIllIIIIllIIl;
    }
    
    static /* synthetic */ void access$2(final ChatStyle llllllllllllIllIllIIIllIIIlIlIlI, final Boolean llllllllllllIllIllIIIllIIIlIlIIl) {
        llllllllllllIllIllIIIllIIIlIlIlI.underlined = llllllllllllIllIllIIIllIIIlIlIIl;
    }
    
    public ChatStyle createDeepCopy() {
        final ChatStyle llllllllllllIllIllIIIllIIlIIIIIl = new ChatStyle();
        llllllllllllIllIllIIIllIIlIIIIIl.setBold(this.getBold());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setItalic(this.getItalic());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setStrikethrough(this.getStrikethrough());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setUnderlined(this.getUnderlined());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setObfuscated(this.getObfuscated());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setColor(this.getColor());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setChatClickEvent(this.getChatClickEvent());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setChatHoverEvent(this.getChatHoverEvent());
        "".length();
        llllllllllllIllIllIIIllIIlIIIIIl.setInsertion(this.getInsertion());
        "".length();
        return llllllllllllIllIllIIIllIIlIIIIIl;
    }
    
    private ChatStyle getParent() {
        ChatStyle chatStyle;
        if (lIIlIIlIIllIIlIl(this.parentStyle)) {
            chatStyle = ChatStyle.rootStyle;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        else {
            chatStyle = this.parentStyle;
        }
        return chatStyle;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[0]]);
        int b;
        if (lIIlIIlIIllIIlll(this.parentStyle)) {
            b = ChatStyle.llIlIIlIIlIllI[0];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            b = ChatStyle.llIlIIlIIlIllI[1];
        }
        return String.valueOf(sb.append((boolean)(b != 0)).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[2]]).append(this.color).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[3]]).append(this.bold).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[4]]).append(this.italic).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[5]]).append(this.underlined).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[6]]).append(this.obfuscated).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[7]]).append(this.getChatClickEvent()).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[8]]).append(this.getChatHoverEvent()).append(ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[9]]).append(this.getInsertion()).append((char)ChatStyle.llIlIIlIIlIllI[10]));
    }
    
    public ChatStyle setChatClickEvent(final ClickEvent llllllllllllIllIllIIIllIlIllIIIl) {
        this.chatClickEvent = llllllllllllIllIllIIIllIlIllIIIl;
        return this;
    }
    
    public ChatStyle setParentStyle(final ChatStyle llllllllllllIllIllIIIllIlIIlllll) {
        this.parentStyle = llllllllllllIllIllIIIllIlIIlllll;
        return this;
    }
    
    private static String lIIlIIlIIlIlllII(final String llllllllllllIllIllIIIlIlllllIlll, final String llllllllllllIllIllIIIlIlllllIlII) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlIllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIIlIllllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIIlIllllllIIl.init(ChatStyle.llIlIIlIIlIllI[2], llllllllllllIllIllIIIlIllllllIlI);
            return new String(llllllllllllIllIllIIIlIllllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlIllllllIII) {
            llllllllllllIllIllIIIlIllllllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIlIIllIIlIl(final Object llllllllllllIllIllIIIlIllIllllIl) {
        return llllllllllllIllIllIIIlIllIllllIl == null;
    }
    
    private static String lIIlIIlIIlIlIlll(String llllllllllllIllIllIIIlIllllIIIlI, final String llllllllllllIllIllIIIlIllllIIIIl) {
        llllllllllllIllIllIIIlIllllIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIllIIIlIllllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIIlIllllIIlIl = new StringBuilder();
        final char[] llllllllllllIllIllIIIlIllllIIlII = llllllllllllIllIllIIIlIllllIIIIl.toCharArray();
        int llllllllllllIllIllIIIlIllllIIIll = ChatStyle.llIlIIlIIlIllI[1];
        final Exception llllllllllllIllIllIIIlIlllIlllIl = (Object)llllllllllllIllIllIIIlIllllIIIlI.toCharArray();
        final float llllllllllllIllIllIIIlIlllIlllII = llllllllllllIllIllIIIlIlllIlllIl.length;
        String llllllllllllIllIllIIIlIlllIllIll = (String)ChatStyle.llIlIIlIIlIllI[1];
        while (lIIlIIlIIllIlIll((int)llllllllllllIllIllIIIlIlllIllIll, (int)llllllllllllIllIllIIIlIlllIlllII)) {
            final char llllllllllllIllIllIIIlIllllIlIII = llllllllllllIllIllIIIlIlllIlllIl[llllllllllllIllIllIIIlIlllIllIll];
            llllllllllllIllIllIIIlIllllIIlIl.append((char)(llllllllllllIllIllIIIlIllllIlIII ^ llllllllllllIllIllIIIlIllllIIlII[llllllllllllIllIllIIIlIllllIIIll % llllllllllllIllIllIIIlIllllIIlII.length]));
            "".length();
            ++llllllllllllIllIllIIIlIllllIIIll;
            ++llllllllllllIllIllIIIlIlllIllIll;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIIlIllllIIlIl);
    }
    
    private static boolean lIIlIIlIIllIlIll(final int llllllllllllIllIllIIIlIlllIIIllI, final int llllllllllllIllIllIIIlIlllIIIlIl) {
        return llllllllllllIllIllIIIlIlllIIIllI < llllllllllllIllIllIIIlIlllIIIlIl;
    }
    
    private static boolean lIIlIIlIIllIlIIl(final int llllllllllllIllIllIIIlIllIlllIIl) {
        return llllllllllllIllIllIIIlIllIlllIIl == 0;
    }
    
    private static boolean lIIlIIlIIllIlIlI(final int llllllllllllIllIllIIIlIlllIIlIlI, final int llllllllllllIllIllIIIlIlllIIlIIl) {
        return llllllllllllIllIllIIIlIlllIIlIlI == llllllllllllIllIllIIIlIlllIIlIIl;
    }
    
    public String getFormattingCode() {
        if (lIIlIIlIIllIIllI(this.isEmpty() ? 1 : 0)) {
            String formattingCode;
            if (lIIlIIlIIllIIlll(this.parentStyle)) {
                formattingCode = this.parentStyle.getFormattingCode();
                "".length();
                if (" ".length() <= -" ".length()) {
                    return null;
                }
            }
            else {
                formattingCode = ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[1]];
            }
            return formattingCode;
        }
        final StringBuilder llllllllllllIllIllIIIllIlIIllIIl = new StringBuilder();
        if (lIIlIIlIIllIIlll(this.getColor())) {
            llllllllllllIllIllIIIllIlIIllIIl.append(this.getColor());
            "".length();
        }
        if (lIIlIIlIIllIIllI(this.getBold() ? 1 : 0)) {
            llllllllllllIllIllIIIllIlIIllIIl.append(EnumChatFormatting.BOLD);
            "".length();
        }
        if (lIIlIIlIIllIIllI(this.getItalic() ? 1 : 0)) {
            llllllllllllIllIllIIIllIlIIllIIl.append(EnumChatFormatting.ITALIC);
            "".length();
        }
        if (lIIlIIlIIllIIllI(this.getUnderlined() ? 1 : 0)) {
            llllllllllllIllIllIIIllIlIIllIIl.append(EnumChatFormatting.UNDERLINE);
            "".length();
        }
        if (lIIlIIlIIllIIllI(this.getObfuscated() ? 1 : 0)) {
            llllllllllllIllIllIIIllIlIIllIIl.append(EnumChatFormatting.OBFUSCATED);
            "".length();
        }
        if (lIIlIIlIIllIIllI(this.getStrikethrough() ? 1 : 0)) {
            llllllllllllIllIllIIIllIlIIllIIl.append(EnumChatFormatting.STRIKETHROUGH);
            "".length();
        }
        return String.valueOf(llllllllllllIllIllIIIllIlIIllIIl);
    }
    
    public boolean getUnderlined() {
        boolean b;
        if (lIIlIIlIIllIIlIl(this.underlined)) {
            b = this.getParent().getUnderlined();
            "".length();
            if (-" ".length() == (0x31 ^ 0x35)) {
                return ((0x1E ^ 0x52) & ~(0xDD ^ 0x91)) != 0x0;
            }
        }
        else {
            b = this.underlined;
        }
        return b;
    }
    
    private static void lIIlIIlIIllIIlII() {
        (llIlIIlIIlIllI = new int[13])[0] = " ".length();
        ChatStyle.llIlIIlIIlIllI[1] = ((0x44 ^ 0x8) & ~(0x54 ^ 0x18));
        ChatStyle.llIlIIlIIlIllI[2] = "  ".length();
        ChatStyle.llIlIIlIIlIllI[3] = "   ".length();
        ChatStyle.llIlIIlIIlIllI[4] = (0xD7 ^ 0x8C ^ (0x4D ^ 0x12));
        ChatStyle.llIlIIlIIlIllI[5] = (0x9B ^ 0x9E);
        ChatStyle.llIlIIlIIlIllI[6] = (0x71 ^ 0x65 ^ (0xBE ^ 0xAC));
        ChatStyle.llIlIIlIIlIllI[7] = (0x52 ^ 0x5C ^ (0x7D ^ 0x74));
        ChatStyle.llIlIIlIIlIllI[8] = (0x6B ^ 0x63);
        ChatStyle.llIlIIlIIlIllI[9] = (0x6 ^ 0xF);
        ChatStyle.llIlIIlIIlIllI[10] = (0x4E ^ 0x33);
        ChatStyle.llIlIIlIIlIllI[11] = (0x6B ^ 0x63 ^ (0x13 ^ 0x4));
        ChatStyle.llIlIIlIIlIllI[12] = (0x2A ^ 0xA ^ (0x4A ^ 0x60));
    }
    
    public ChatStyle setObfuscated(final Boolean llllllllllllIllIllIIIllIlIllIlll) {
        this.obfuscated = llllllllllllIllIllIIIllIlIllIlll;
        return this;
    }
    
    private static String lIIlIIlIIlIllIII(final String llllllllllllIllIllIIIlIlllIlIIlI, final String llllllllllllIllIllIIIlIlllIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), ChatStyle.llIlIIlIIlIllI[8]), "DES");
            final Cipher llllllllllllIllIllIIIlIlllIlIlII = Cipher.getInstance("DES");
            llllllllllllIllIllIIIlIlllIlIlII.init(ChatStyle.llIlIIlIIlIllI[2], llllllllllllIllIllIIIlIlllIlIlIl);
            return new String(llllllllllllIllIllIIIlIlllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlIlllIlIIll) {
            llllllllllllIllIllIIIlIlllIlIIll.printStackTrace();
            return null;
        }
    }
    
    public boolean getItalic() {
        boolean b;
        if (lIIlIIlIIllIIlIl(this.italic)) {
            b = this.getParent().getItalic();
            "".length();
            if (-" ".length() >= "   ".length()) {
                return ((0 + 22 + 27 + 188 ^ 3 + 83 + 25 + 53) & (0x6E ^ 0x20 ^ (0x8A ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            b = this.italic;
        }
        return b;
    }
    
    public ChatStyle setUnderlined(final Boolean llllllllllllIllIllIIIllIlIlllIll) {
        this.underlined = llllllllllllIllIllIIIllIlIlllIll;
        return this;
    }
    
    public boolean isEmpty() {
        if (lIIlIIlIIllIIlIl(this.bold) && lIIlIIlIIllIIlIl(this.italic) && lIIlIIlIIllIIlIl(this.strikethrough) && lIIlIIlIIllIIlIl(this.underlined) && lIIlIIlIIllIIlIl(this.obfuscated) && lIIlIIlIIllIIlIl(this.color) && lIIlIIlIIllIIlIl(this.chatClickEvent) && lIIlIIlIIllIIlIl(this.chatHoverEvent)) {
            return ChatStyle.llIlIIlIIlIllI[0] != 0;
        }
        return ChatStyle.llIlIIlIIlIllI[1] != 0;
    }
    
    public ClickEvent getChatClickEvent() {
        ClickEvent clickEvent;
        if (lIIlIIlIIllIIlIl(this.chatClickEvent)) {
            clickEvent = this.getParent().getChatClickEvent();
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            clickEvent = this.chatClickEvent;
        }
        return clickEvent;
    }
    
    static /* synthetic */ void access$1(final ChatStyle llllllllllllIllIllIIIllIIIllIIlI, final Boolean llllllllllllIllIllIIIllIIIllIIII) {
        llllllllllllIllIllIIIllIIIllIIlI.italic = llllllllllllIllIllIIIllIIIllIIII;
    }
    
    public String getInsertion() {
        String s;
        if (lIIlIIlIIllIIlIl(this.insertion)) {
            s = this.getParent().getInsertion();
            "".length();
            if (-" ".length() == (0xA5 ^ 0x92 ^ (0x3B ^ 0x8))) {
                return null;
            }
        }
        else {
            s = this.insertion;
        }
        return s;
    }
    
    public ChatStyle setInsertion(final String llllllllllllIllIllIIIllIlIlIIlIl) {
        this.insertion = llllllllllllIllIllIIIllIlIlIIlIl;
        return this;
    }
    
    public ChatStyle createShallowCopy() {
        final ChatStyle llllllllllllIllIllIIIllIIlIlIIIl = new ChatStyle();
        llllllllllllIllIllIIIllIIlIlIIIl.bold = this.bold;
        llllllllllllIllIllIIIllIIlIlIIIl.italic = this.italic;
        llllllllllllIllIllIIIllIIlIlIIIl.strikethrough = this.strikethrough;
        llllllllllllIllIllIIIllIIlIlIIIl.underlined = this.underlined;
        llllllllllllIllIllIIIllIIlIlIIIl.obfuscated = this.obfuscated;
        llllllllllllIllIllIIIllIIlIlIIIl.color = this.color;
        llllllllllllIllIllIIIllIIlIlIIIl.chatClickEvent = this.chatClickEvent;
        llllllllllllIllIllIIIllIIlIlIIIl.chatHoverEvent = this.chatHoverEvent;
        llllllllllllIllIllIIIllIIlIlIIIl.parentStyle = this.parentStyle;
        llllllllllllIllIllIIIllIIlIlIIIl.insertion = this.insertion;
        return llllllllllllIllIllIIIllIIlIlIIIl;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIllIIIllIlIIIIIII) {
        if (lIIlIIlIIllIlIII(this, llllllllllllIllIllIIIllIlIIIIIII)) {
            return ChatStyle.llIlIIlIIlIllI[0] != 0;
        }
        if (lIIlIIlIIllIlIIl((llllllllllllIllIllIIIllIlIIIIIII instanceof ChatStyle) ? 1 : 0)) {
            return ChatStyle.llIlIIlIIlIllI[1] != 0;
        }
        final ChatStyle llllllllllllIllIllIIIllIIllllIll = (ChatStyle)llllllllllllIllIllIIIllIlIIIIIII;
        if (lIIlIIlIIllIlIlI(this.getBold() ? 1 : 0, llllllllllllIllIllIIIllIIllllIll.getBold() ? 1 : 0) && lIIlIIlIIllIlIII(this.getColor(), llllllllllllIllIllIIIllIIllllIll.getColor()) && lIIlIIlIIllIlIlI(this.getItalic() ? 1 : 0, llllllllllllIllIllIIIllIIllllIll.getItalic() ? 1 : 0) && lIIlIIlIIllIlIlI(this.getObfuscated() ? 1 : 0, llllllllllllIllIllIIIllIIllllIll.getObfuscated() ? 1 : 0) && lIIlIIlIIllIlIlI(this.getStrikethrough() ? 1 : 0, llllllllllllIllIllIIIllIIllllIll.getStrikethrough() ? 1 : 0) && lIIlIIlIIllIlIlI(this.getUnderlined() ? 1 : 0, llllllllllllIllIllIIIllIIllllIll.getUnderlined() ? 1 : 0)) {
            if (lIIlIIlIIllIIlll(this.getChatClickEvent())) {
                if (lIIlIIlIIllIlIIl(this.getChatClickEvent().equals(llllllllllllIllIllIIIllIIllllIll.getChatClickEvent()) ? 1 : 0)) {
                    "".length();
                    if (-" ".length() == "   ".length()) {
                        return ((0x59 ^ 0x0) & ~(0x4E ^ 0x17)) != 0x0;
                    }
                    return ChatStyle.llIlIIlIIlIllI[1] != 0;
                }
            }
            else if (lIIlIIlIIllIIlll(llllllllllllIllIllIIIllIIllllIll.getChatClickEvent())) {
                "".length();
                if (("  ".length() ^ (0xD ^ 0xB)) == 0x0) {
                    return ((0xEE ^ 0xA4 ^ (0xE2 ^ 0x83)) & (0x1C ^ 0x54 ^ (0xC0 ^ 0xA3) ^ -" ".length())) != 0x0;
                }
                return ChatStyle.llIlIIlIIlIllI[1] != 0;
            }
            if (lIIlIIlIIllIIlll(this.getChatHoverEvent())) {
                if (lIIlIIlIIllIlIIl(this.getChatHoverEvent().equals(llllllllllllIllIllIIIllIIllllIll.getChatHoverEvent()) ? 1 : 0)) {
                    "".length();
                    if (null != null) {
                        return ((0x40 ^ 0x72 ^ (0x6A ^ 0x71)) & (0x9A ^ 0xC0 ^ (0x7C ^ 0xF) ^ -" ".length())) != 0x0;
                    }
                    return ChatStyle.llIlIIlIIlIllI[1] != 0;
                }
            }
            else if (lIIlIIlIIllIIlll(llllllllllllIllIllIIIllIIllllIll.getChatHoverEvent())) {
                "".length();
                if ((0x1C ^ 0x18) <= 0) {
                    return ((0x29 ^ 0x6C) & ~(0x41 ^ 0x4)) != 0x0;
                }
                return ChatStyle.llIlIIlIIlIllI[1] != 0;
            }
            if (lIIlIIlIIllIIlll(this.getInsertion())) {
                if (!lIIlIIlIIllIIllI(this.getInsertion().equals(llllllllllllIllIllIIIllIIllllIll.getInsertion()) ? 1 : 0)) {
                    return ChatStyle.llIlIIlIIlIllI[1] != 0;
                }
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return ((0x44 ^ 0x67) & ~(0xE6 ^ 0xC5)) != 0x0;
                }
            }
            else {
                if (!lIIlIIlIIllIIlIl(llllllllllllIllIllIIIllIIllllIll.getInsertion())) {
                    return ChatStyle.llIlIIlIIlIllI[1] != 0;
                }
                "".length();
                if (-" ".length() >= ((0x72 ^ 0x63 ^ (0x42 ^ 0x70)) & (0x72 ^ 0x15 ^ (0x5D ^ 0x19) ^ -" ".length()))) {
                    return ((0x51 ^ 0x6E ^ (0x4B ^ 0x50)) & (0xA ^ 0x2D ^ "   ".length() ^ -" ".length())) != 0x0;
                }
            }
            final boolean llllllllllllIllIllIIIllIIlllllII = ChatStyle.llIlIIlIIlIllI[0] != 0;
            return llllllllllllIllIllIIIllIIlllllII;
        }
        final boolean llllllllllllIllIllIIIllIIllllllI = ChatStyle.llIlIIlIIlIllI[1] != 0;
        return llllllllllllIllIllIIIllIIllllllI;
    }
    
    public ChatStyle setChatHoverEvent(final HoverEvent llllllllllllIllIllIIIllIlIlIlIll) {
        this.chatHoverEvent = llllllllllllIllIllIIIllIlIlIlIll;
        return this;
    }
    
    static /* synthetic */ void access$3(final ChatStyle llllllllllllIllIllIIIllIIIlIIllI, final Boolean llllllllllllIllIllIIIllIIIlIIlIl) {
        llllllllllllIllIllIIIllIIIlIIllI.strikethrough = llllllllllllIllIllIIIllIIIlIIlIl;
    }
    
    public ChatStyle setBold(final Boolean llllllllllllIllIllIIIllIllIIllll) {
        this.bold = llllllllllllIllIllIIIllIllIIllll;
        return this;
    }
    
    static /* synthetic */ void access$7(final ChatStyle llllllllllllIllIllIIIllIIIIlIllI, final ClickEvent llllllllllllIllIllIIIllIIIIlIlIl) {
        llllllllllllIllIllIIIllIIIIlIllI.chatClickEvent = llllllllllllIllIllIIIllIIIIlIlIl;
    }
    
    private static boolean lIIlIIlIIllIIllI(final int llllllllllllIllIllIIIlIllIlllIll) {
        return llllllllllllIllIllIIIlIllIlllIll != 0;
    }
    
    private static boolean lIIlIIlIIllIIlll(final Object llllllllllllIllIllIIIlIlllIIIIll) {
        return llllllllllllIllIllIIIlIlllIIIIll != null;
    }
    
    static /* synthetic */ void access$4(final ChatStyle llllllllllllIllIllIIIllIIIlIIIlI, final Boolean llllllllllllIllIllIIIllIIIlIIIIl) {
        llllllllllllIllIllIIIllIIIlIIIlI.obfuscated = llllllllllllIllIllIIIllIIIlIIIIl;
    }
    
    private static boolean lIIlIIlIIllIlIII(final Object llllllllllllIllIllIIIlIlllIIIIII, final Object llllllllllllIllIllIIIlIllIllllll) {
        return llllllllllllIllIllIIIlIlllIIIIII == llllllllllllIllIllIIIlIllIllllll;
    }
    
    public HoverEvent getChatHoverEvent() {
        HoverEvent hoverEvent;
        if (lIIlIIlIIllIIlIl(this.chatHoverEvent)) {
            hoverEvent = this.getParent().getChatHoverEvent();
            "".length();
            if ((0x6A ^ 0x6E) <= "   ".length()) {
                return null;
            }
        }
        else {
            hoverEvent = this.chatHoverEvent;
        }
        return hoverEvent;
    }
    
    public EnumChatFormatting getColor() {
        EnumChatFormatting enumChatFormatting;
        if (lIIlIIlIIllIIlIl(this.color)) {
            enumChatFormatting = this.getParent().getColor();
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            enumChatFormatting = this.color;
        }
        return enumChatFormatting;
    }
    
    public boolean getBold() {
        boolean b;
        if (lIIlIIlIIllIIlIl(this.bold)) {
            b = this.getParent().getBold();
            "".length();
            if (null != null) {
                return ((2 + 226 - 124 + 132 ^ 31 + 148 - 28 + 18) & (1 + 107 - 105 + 129 ^ 190 + 36 - 225 + 192 ^ -" ".length())) != 0x0;
            }
        }
        else {
            b = this.bold;
        }
        return b;
    }
    
    static /* synthetic */ void access$5(final ChatStyle llllllllllllIllIllIIIllIIIIllllI, final EnumChatFormatting llllllllllllIllIllIIIllIIIIlllIl) {
        llllllllllllIllIllIIIllIIIIllllI.color = llllllllllllIllIllIIIllIIIIlllIl;
    }
    
    private static void lIIlIIlIIllIIIII() {
        (llIlIIlIIlIIIl = new String[ChatStyle.llIlIIlIIlIllI[12]])[ChatStyle.llIlIIlIIlIllI[1]] = lIIlIIlIIlIlIlll("", "Rpajj");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[0]] = lIIlIIlIIlIllIII("+Iae11q7R3Iw/uGs2REZszXlACWDmL+P", "YTTDK");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[2]] = lIIlIIlIIlIlIlll("eUERPCo6E08=", "UarSF");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[3]] = lIIlIIlIIlIlIlll("e20QGC8zcA==", "WMrwC");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[4]] = lIIlIIlIIlIllIII("PFkmk/QUbJd/AEFVORhVaQ==", "yJEHL");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[5]] = lIIlIIlIIlIllIII("327lrSobMl7CL1zlDicMFw==", "gZslU");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[6]] = lIIlIIlIIlIlllII("NiRGKC3gd13/iAWbKclp+A==", "PPFUF");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[7]] = lIIlIIlIIlIlllII("4HfTC7+T1sG6wSX0wpCy5w==", "JwkhT");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[8]] = lIIlIIlIIlIlIlll("YVkuBBcoCwMdBCMNew==", "MyFka");
        ChatStyle.llIlIIlIIlIIIl[ChatStyle.llIlIIlIIlIllI[9]] = lIIlIIlIIlIlIlll("aUM6LyogEScoNite", "EcSAY");
    }
    
    public ChatStyle setStrikethrough(final Boolean llllllllllllIllIllIIIllIllIIIIll) {
        this.strikethrough = llllllllllllIllIllIIIllIllIIIIll;
        return this;
    }
    
    public ChatStyle setItalic(final Boolean llllllllllllIllIllIIIllIllIIIlll) {
        this.italic = llllllllllllIllIllIIIllIllIIIlll;
        return this;
    }
    
    static {
        lIIlIIlIIllIIlII();
        lIIlIIlIIllIIIII();
        rootStyle = new ChatStyle() {
            private static final /* synthetic */ int[] llIllllllIllll;
            private static final /* synthetic */ String[] llIllllllIllII;
            
            private static void lIIllIlllIIIlIll() {
                (llIllllllIllll = new int[3])[0] = ((0x23 ^ 0x18) & ~(0x28 ^ 0x13));
                ChatStyle$1.llIllllllIllll[1] = " ".length();
                ChatStyle$1.llIllllllIllll[2] = "  ".length();
            }
            
            @Override
            public boolean getStrikethrough() {
                return ChatStyle$1.llIllllllIllll[0] != 0;
            }
            
            static {
                lIIllIlllIIIlIll();
                lIIllIlllIIIlIIl();
            }
            
            @Override
            public boolean getObfuscated() {
                return ChatStyle$1.llIllllllIllll[0] != 0;
            }
            
            @Override
            public ChatStyle setUnderlined(final Boolean llllllllllllIllIIIlIlIlIIIIllllI) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public String getFormattingCode() {
                return ChatStyle$1.llIllllllIllII[ChatStyle$1.llIllllllIllll[1]];
            }
            
            @Override
            public ChatStyle setItalic(final Boolean llllllllllllIllIIIlIlIlIIIlIIIlI) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public HoverEvent getChatHoverEvent() {
                return null;
            }
            
            @Override
            public String getInsertion() {
                return null;
            }
            
            @Override
            public ChatStyle setStrikethrough(final Boolean llllllllllllIllIIIlIlIlIIIlIIIII) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public boolean getUnderlined() {
                return ChatStyle$1.llIllllllIllll[0] != 0;
            }
            
            private static String lIIllIlllIIIIllI(final String llllllllllllIllIIIlIlIlIIIIIIllI, final String llllllllllllIllIIIlIlIlIIIIIIIll) {
                try {
                    final SecretKeySpec llllllllllllIllIIIlIlIlIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIlIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllIIIlIlIlIIIIIlIII = Cipher.getInstance("Blowfish");
                    llllllllllllIllIIIlIlIlIIIIIlIII.init(ChatStyle$1.llIllllllIllll[2], llllllllllllIllIIIlIlIlIIIIIlIIl);
                    return new String(llllllllllllIllIIIlIlIlIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIlIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllIIIlIlIlIIIIIIlll) {
                    llllllllllllIllIIIlIlIlIIIIIIlll.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public boolean getItalic() {
                return ChatStyle$1.llIllllllIllll[0] != 0;
            }
            
            @Override
            public EnumChatFormatting getColor() {
                return null;
            }
            
            @Override
            public boolean getBold() {
                return ChatStyle$1.llIllllllIllll[0] != 0;
            }
            
            @Override
            public ChatStyle setBold(final Boolean llllllllllllIllIIIlIlIlIIIlIIlII) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ChatStyle createDeepCopy() {
                return this;
            }
            
            @Override
            public ChatStyle setObfuscated(final Boolean llllllllllllIllIIIlIlIlIIIIlllII) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ClickEvent getChatClickEvent() {
                return null;
            }
            
            @Override
            public ChatStyle setColor(final EnumChatFormatting llllllllllllIllIIIlIlIlIIIlIIllI) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ChatStyle setParentStyle(final ChatStyle llllllllllllIllIIIlIlIlIIIIlIllI) {
                throw new UnsupportedOperationException();
            }
            
            private static void lIIllIlllIIIlIIl() {
                (llIllllllIllII = new String[ChatStyle$1.llIllllllIllll[2]])[ChatStyle$1.llIllllllIllll[0]] = lIIllIlllIIIIllI("r/YHjbyfrQ/gTT5pirXvMA==", "ZKmQx");
                ChatStyle$1.llIllllllIllII[ChatStyle$1.llIllllllIllll[1]] = lIIllIlllIIIIllI("IrG8m2JzxMA=", "uMiHU");
            }
            
            @Override
            public ChatStyle createShallowCopy() {
                return this;
            }
            
            @Override
            public ChatStyle setChatClickEvent(final ClickEvent llllllllllllIllIIIlIlIlIIIIllIlI) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public String toString() {
                return ChatStyle$1.llIllllllIllII[ChatStyle$1.llIllllllIllll[0]];
            }
            
            @Override
            public ChatStyle setChatHoverEvent(final HoverEvent llllllllllllIllIIIlIlIlIIIIllIII) {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    public ChatStyle setColor(final EnumChatFormatting llllllllllllIllIllIIIllIllIlIlIl) {
        this.color = llllllllllllIllIllIIIllIllIlIlIl;
        return this;
    }
    
    @Override
    public int hashCode() {
        int llllllllllllIllIllIIIllIIlIllIlI = this.color.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.bold.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.italic.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.underlined.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.strikethrough.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.obfuscated.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.chatClickEvent.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.chatHoverEvent.hashCode();
        llllllllllllIllIllIIIllIIlIllIlI = ChatStyle.llIlIIlIIlIllI[11] * llllllllllllIllIllIIIllIIlIllIlI + this.insertion.hashCode();
        return llllllllllllIllIllIIIllIIlIllIlI;
    }
    
    static /* synthetic */ void access$0(final ChatStyle llllllllllllIllIllIIIllIIIlllIIl, final Boolean llllllllllllIllIllIIIllIIIllIlll) {
        llllllllllllIllIllIIIllIIIlllIIl.bold = llllllllllllIllIllIIIllIIIllIlll;
    }
    
    public boolean getStrikethrough() {
        boolean b;
        if (lIIlIIlIIllIIlIl(this.strikethrough)) {
            b = this.getParent().getStrikethrough();
            "".length();
            if ((0x23 ^ 0x27) != (0x31 ^ 0x35)) {
                return ((0x65 ^ 0x7C) & ~(0x97 ^ 0x8E)) != 0x0;
            }
        }
        else {
            b = this.strikethrough;
        }
        return b;
    }
    
    public static class Serializer implements JsonDeserializer<ChatStyle>, JsonSerializer<ChatStyle>
    {
        private static final /* synthetic */ String[] llIIIIIIIllIII;
        private static final /* synthetic */ int[] llIIIIIIIlllII;
        
        private static boolean lIIIIllIlIlIllll(final Object llllllllllllIllllIIIIIllllllIlII) {
            return llllllllllllIllllIIIIIllllllIlII != null;
        }
        
        private static boolean lIIIIllIlIlIllIl(final int llllllllllllIllllIIIIIllllllIIII) {
            return llllllllllllIllllIIIIIllllllIIII != 0;
        }
        
        private static void lIIIIllIlIIlllll() {
            (llIIIIIIIllIII = new String[Serializer.llIIIIIIIlllII[35]])[Serializer.llIIIIIIIlllII[0]] = lIIIIllIlIIlllII("8662i5m0COw=", "fewpL");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[1]] = lIIIIllIlIIlllIl("Ro4nRtKm8UM=", "pbawH");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[2]] = lIIIIllIlIIlllIl("Hp+brz2hkyE=", "YFBIJ");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[3]] = lIIIIllIlIIlllII("I6plcH9nkpo=", "YSDcU");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[4]] = lIIIIllIlIIlllII("mJzTltxvvpgjTkjce9gz0A==", "UaXRI");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[5]] = lIIIIllIlIIlllII("MphAaGVISzo1C288DqSu+g==", "vRfiK");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[6]] = lIIIIllIlIIllllI("IwEjIhg1ATk5HCUSOQ==", "PuQKs");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[7]] = lIIIIllIlIIlllII("TMPlfzvSFdmjsQrIMKxVHg==", "KLuRU");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[8]] = lIIIIllIlIIlllII("+3jFOBwFS/WrRE0YOVezSQ==", "WckoS");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[9]] = lIIIIllIlIIlllIl("TO2tlSAFU3BICI6SELRDpA==", "QvfHU");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[10]] = lIIIIllIlIIllllI("NTcYGxM=", "VXtta");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[11]] = lIIIIllIlIIllllI("CjkrIRE=", "iVGNc");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[12]] = lIIIIllIlIIllllI("LT8cCTAwOAAC", "DQolB");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[13]] = lIIIIllIlIIlllIl("/LGm2FUhjArW7VVRded/TQ==", "VAWvb");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[14]] = lIIIIllIlIIllllI("DhQfGz0oDhMWIg==", "mxvxV");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[15]] = lIIIIllIlIIlllII("y0V5cUMcwQW9ZU6GzdWM0w==", "QbmZD");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[16]] = lIIIIllIlIIlllII("HfJCxjeqv58=", "xOJSH");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[17]] = lIIIIllIlIIlllII("FVafPhe3Cqs=", "heFOj");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[18]] = lIIIIllIlIIlllIl("IOx8YIO4C/pQelIAwndQ8A==", "pjheU");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[19]] = lIIIIllIlIIlllIl("KcCTmHV2UAvmD7UH4SkJwA==", "SrHQh");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[20]] = lIIIIllIlIIlllII("8sl3n2Bo3fA=", "pkSaN");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[21]] = lIIIIllIlIIlllII("WJz6mc/IhSc=", "DwbsR");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[22]] = lIIIIllIlIIlllIl("97X47ghK0Yo=", "PDrWc");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[23]] = lIIIIllIlIIlllIl("DgC5LkdT4hI=", "VvMAA");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[24]] = lIIIIllIlIIlllII("n91SJ1wj6P7LBfPYfaYPjQ==", "azxYO");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[25]] = lIIIIllIlIIllllI("ARE5BR8XESMeGwcCIw==", "reKlt");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[26]] = lIIIIllIlIIllllI("Cgw2JxYGDyQ3AQ==", "enPRe");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[27]] = lIIIIllIlIIlllIl("n91WShDVnr8=", "CsKSu");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[28]] = lIIIIllIlIIllllI("Jg0KNRQ7ChY+", "OcyPf");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[29]] = lIIIIllIlIIlllIl("hHNWaoEPVwM=", "DCOrk");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[30]] = lIIIIllIlIIlllII("1S+y6MmQxmU=", "zhGRl");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[31]] = lIIIIllIlIIlllII("tcuWdKEiaR4ED6YL35TWHw==", "eZuWk");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[32]] = lIIIIllIlIIlllIl("tLDZEzW53Tk=", "QfRfw");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[33]] = lIIIIllIlIIlllII("UX9sY9WsK7w=", "WBFSR");
            Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[34]] = lIIIIllIlIIlllIl("NQ4q7U4/Xkz6vZdJeJRyCw==", "RhcVd");
        }
        
        static {
            lIIIIllIlIlIllII();
            lIIIIllIlIIlllll();
        }
        
        private static String lIIIIllIlIIlllII(final String llllllllllllIllllIIIIlIIIIlIIIlI, final String llllllllllllIllllIIIIlIIIIlIIIll) {
            try {
                final SecretKeySpec llllllllllllIllllIIIIlIIIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), Serializer.llIIIIIIIlllII[8]), "DES");
                final Cipher llllllllllllIllllIIIIlIIIIlIIllI = Cipher.getInstance("DES");
                llllllllllllIllllIIIIlIIIIlIIllI.init(Serializer.llIIIIIIIlllII[2], llllllllllllIllllIIIIlIIIIlIIlll);
                return new String(llllllllllllIllllIIIIlIIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIIIlIIIIlIIlIl) {
                llllllllllllIllllIIIIlIIIIlIIlIl.printStackTrace();
                return null;
            }
        }
        
        public JsonElement serialize(final ChatStyle llllllllllllIllllIIIIlIIIlIIIlIl, final Type llllllllllllIllllIIIIlIIIlIIIlII, final JsonSerializationContext llllllllllllIllllIIIIlIIIIlllllI) {
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIIIlIl.isEmpty() ? 1 : 0)) {
                return null;
            }
            final JsonObject llllllllllllIllllIIIIlIIIlIIIIlI = new JsonObject();
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.bold)) {
                llllllllllllIllllIIIIlIIIlIIIIlI.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[22]], llllllllllllIllllIIIIlIIIlIIIlIl.bold);
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.italic)) {
                llllllllllllIllllIIIIlIIIlIIIIlI.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[23]], llllllllllllIllllIIIIlIIIlIIIlIl.italic);
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.underlined)) {
                llllllllllllIllllIIIIlIIIlIIIIlI.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[24]], llllllllllllIllllIIIIlIIIlIIIlIl.underlined);
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.strikethrough)) {
                llllllllllllIllllIIIIlIIIlIIIIlI.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[25]], llllllllllllIllllIIIIlIIIlIIIlIl.strikethrough);
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.obfuscated)) {
                llllllllllllIllllIIIIlIIIlIIIIlI.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[26]], llllllllllllIllllIIIIlIIIlIIIlIl.obfuscated);
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.color)) {
                llllllllllllIllllIIIIlIIIlIIIIlI.add(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[27]], llllllllllllIllllIIIIlIIIIlllllI.serialize((Object)llllllllllllIllllIIIIlIIIlIIIlIl.color));
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.insertion)) {
                llllllllllllIllllIIIIlIIIlIIIIlI.add(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[28]], llllllllllllIllllIIIIlIIIIlllllI.serialize((Object)llllllllllllIllllIIIIlIIIlIIIlIl.insertion));
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.chatClickEvent)) {
                final JsonObject llllllllllllIllllIIIIlIIIlIIIIIl = new JsonObject();
                llllllllllllIllllIIIIlIIIlIIIIIl.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[29]], llllllllllllIllllIIIIlIIIlIIIlIl.chatClickEvent.getAction().getCanonicalName());
                llllllllllllIllllIIIIlIIIlIIIIIl.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[30]], llllllllllllIllllIIIIlIIIlIIIlIl.chatClickEvent.getValue());
                llllllllllllIllllIIIIlIIIlIIIIlI.add(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[31]], (JsonElement)llllllllllllIllllIIIIlIIIlIIIIIl);
            }
            if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIIIlIl.chatHoverEvent)) {
                final JsonObject llllllllllllIllllIIIIlIIIlIIIIII = new JsonObject();
                llllllllllllIllllIIIIlIIIlIIIIII.addProperty(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[32]], llllllllllllIllllIIIIlIIIlIIIlIl.chatHoverEvent.getAction().getCanonicalName());
                llllllllllllIllllIIIIlIIIlIIIIII.add(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[33]], llllllllllllIllllIIIIlIIIIlllllI.serialize((Object)llllllllllllIllllIIIIlIIIlIIIlIl.chatHoverEvent.getValue()));
                llllllllllllIllllIIIIlIIIlIIIIlI.add(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[34]], (JsonElement)llllllllllllIllllIIIIlIIIlIIIIII);
            }
            return (JsonElement)llllllllllllIllllIIIIlIIIlIIIIlI;
        }
        
        private static void lIIIIllIlIlIllII() {
            (llIIIIIIIlllII = new int[36])[0] = ((0xE2 ^ 0xAE ^ 108 + 51 - 68 + 36) & (0x7B ^ 0x45 ^ (0x1C ^ 0x11) ^ -" ".length()));
            Serializer.llIIIIIIIlllII[1] = " ".length();
            Serializer.llIIIIIIIlllII[2] = "  ".length();
            Serializer.llIIIIIIIlllII[3] = "   ".length();
            Serializer.llIIIIIIIlllII[4] = (0x5B ^ 0x5F);
            Serializer.llIIIIIIIlllII[5] = (40 + 64 + 9 + 44 ^ 104 + 112 - 170 + 106);
            Serializer.llIIIIIIIlllII[6] = (0x20 ^ 0x26);
            Serializer.llIIIIIIIlllII[7] = (73 + 49 + 19 + 39 ^ 28 + 72 + 74 + 5);
            Serializer.llIIIIIIIlllII[8] = (0x95 ^ 0x9A ^ (0xB5 ^ 0xB2));
            Serializer.llIIIIIIIlllII[9] = (0x65 ^ 0x2D ^ (0x60 ^ 0x21));
            Serializer.llIIIIIIIlllII[10] = (48 + 119 - 80 + 42 ^ 137 + 13 - 128 + 117);
            Serializer.llIIIIIIIlllII[11] = (0xE7 ^ 0x87 ^ (0x48 ^ 0x23));
            Serializer.llIIIIIIIlllII[12] = (0x31 ^ 0x3D);
            Serializer.llIIIIIIIlllII[13] = (0xB ^ 0x6);
            Serializer.llIIIIIIIlllII[14] = (0x2B ^ 0x66 ^ (0xE2 ^ 0xA1));
            Serializer.llIIIIIIIlllII[15] = (0x24 ^ 0x2B);
            Serializer.llIIIIIIIlllII[16] = (0xA7 ^ 0xB7);
            Serializer.llIIIIIIIlllII[17] = (0x25 ^ 0x34);
            Serializer.llIIIIIIIlllII[18] = (0x58 ^ 0x4A);
            Serializer.llIIIIIIIlllII[19] = (15 + 177 - 141 + 128 ^ 94 + 1 + 34 + 31);
            Serializer.llIIIIIIIlllII[20] = (0x2C ^ 0x38);
            Serializer.llIIIIIIIlllII[21] = (0xD2 ^ 0xC7);
            Serializer.llIIIIIIIlllII[22] = (12 + 140 - 144 + 144 ^ 40 + 13 + 72 + 17);
            Serializer.llIIIIIIIlllII[23] = (0x88 ^ 0x9F);
            Serializer.llIIIIIIIlllII[24] = (60 + 65 - 17 + 19 ^ (0xC7 ^ 0xA0));
            Serializer.llIIIIIIIlllII[25] = (0xAB ^ 0xB2);
            Serializer.llIIIIIIIlllII[26] = (0x2A ^ 0x30);
            Serializer.llIIIIIIIlllII[27] = (0x39 ^ 0x5C ^ (0x2B ^ 0x55));
            Serializer.llIIIIIIIlllII[28] = (0xB5 ^ 0x81 ^ (0x89 ^ 0xA1));
            Serializer.llIIIIIIIlllII[29] = (0x24 ^ 0x7C ^ (0x5F ^ 0x1A));
            Serializer.llIIIIIIIlllII[30] = (0x52 ^ 0x4C);
            Serializer.llIIIIIIIlllII[31] = (0x41 ^ 0x5E);
            Serializer.llIIIIIIIlllII[32] = (36 + 110 - 65 + 53 ^ 5 + 108 - 50 + 103);
            Serializer.llIIIIIIIlllII[33] = (0x3A ^ 0x71 ^ (0xC8 ^ 0xA2));
            Serializer.llIIIIIIIlllII[34] = (0x5F ^ 0x7D);
            Serializer.llIIIIIIIlllII[35] = (0x41 ^ 0x62);
        }
        
        private static String lIIIIllIlIIlllIl(final String llllllllllllIllllIIIIlIIIIIlIlIl, final String llllllllllllIllllIIIIlIIIIIlIlII) {
            try {
                final SecretKeySpec llllllllllllIllllIIIIlIIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIIIIlIIIIIllIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllIIIIlIIIIIllIIl.init(Serializer.llIIIIIIIlllII[2], llllllllllllIllllIIIIlIIIIIllIlI);
                return new String(llllllllllllIllllIIIIlIIIIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIIIlIIIIIllIII) {
                llllllllllllIllllIIIIlIIIIIllIII.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIIllIlIIllllI(String llllllllllllIllllIIIIlIIIIIIIIlI, final String llllllllllllIllllIIIIlIIIIIIIllI) {
            llllllllllllIllllIIIIlIIIIIIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllllIIIIlIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIIIIlIIIIIIIlIl = new StringBuilder();
            final char[] llllllllllllIllllIIIIlIIIIIIIlII = llllllllllllIllllIIIIlIIIIIIIllI.toCharArray();
            int llllllllllllIllllIIIIlIIIIIIIIll = Serializer.llIIIIIIIlllII[0];
            final char llllllllllllIllllIIIIIllllllllIl = (Object)llllllllllllIllllIIIIlIIIIIIIIlI.toCharArray();
            final int llllllllllllIllllIIIIIllllllllII = llllllllllllIllllIIIIIllllllllIl.length;
            boolean llllllllllllIllllIIIIIlllllllIll = Serializer.llIIIIIIIlllII[0] != 0;
            while (lIIIIllIlIllIIII(llllllllllllIllllIIIIIlllllllIll ? 1 : 0, llllllllllllIllllIIIIIllllllllII)) {
                final char llllllllllllIllllIIIIlIIIIIIlIII = llllllllllllIllllIIIIIllllllllIl[llllllllllllIllllIIIIIlllllllIll];
                llllllllllllIllllIIIIlIIIIIIIlIl.append((char)(llllllllllllIllllIIIIlIIIIIIlIII ^ llllllllllllIllllIIIIlIIIIIIIlII[llllllllllllIllllIIIIlIIIIIIIIll % llllllllllllIllllIIIIlIIIIIIIlII.length]));
                "".length();
                ++llllllllllllIllllIIIIlIIIIIIIIll;
                ++llllllllllllIllllIIIIIlllllllIll;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIIIIlIIIIIIIlIl);
        }
        
        public ChatStyle deserialize(final JsonElement llllllllllllIllllIIIIlIIIllIIIIl, final Type llllllllllllIllllIIIIlIIIllIIIII, final JsonDeserializationContext llllllllllllIllllIIIIlIIIlIlIIlI) throws JsonParseException {
            if (!lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIllIIIIl.isJsonObject() ? 1 : 0)) {
                return null;
            }
            final ChatStyle llllllllllllIllllIIIIlIIIlIllllI = new ChatStyle();
            final JsonObject llllllllllllIllllIIIIlIIIlIlllIl = llllllllllllIllllIIIIlIIIllIIIIl.getAsJsonObject();
            if (lIIIIllIlIlIlllI(llllllllllllIllllIIIIlIIIlIlllIl)) {
                return null;
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[0]]) ? 1 : 0)) {
                ChatStyle.access$0(llllllllllllIllllIIIIlIIIlIllllI, llllllllllllIllllIIIIlIIIlIlllIl.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[1]]).getAsBoolean());
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[2]]) ? 1 : 0)) {
                ChatStyle.access$1(llllllllllllIllllIIIIlIIIlIllllI, llllllllllllIllllIIIIlIIIlIlllIl.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[3]]).getAsBoolean());
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[4]]) ? 1 : 0)) {
                ChatStyle.access$2(llllllllllllIllllIIIIlIIIlIllllI, llllllllllllIllllIIIIlIIIlIlllIl.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[5]]).getAsBoolean());
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[6]]) ? 1 : 0)) {
                ChatStyle.access$3(llllllllllllIllllIIIIlIIIlIllllI, llllllllllllIllllIIIIlIIIlIlllIl.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[7]]).getAsBoolean());
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[8]]) ? 1 : 0)) {
                ChatStyle.access$4(llllllllllllIllllIIIIlIIIlIllllI, llllllllllllIllllIIIIlIIIlIlllIl.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[9]]).getAsBoolean());
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[10]]) ? 1 : 0)) {
                ChatStyle.access$5(llllllllllllIllllIIIIlIIIlIllllI, (EnumChatFormatting)llllllllllllIllllIIIIlIIIlIlIIlI.deserialize(llllllllllllIllllIIIIlIIIlIlllIl.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[11]]), (Type)EnumChatFormatting.class));
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[12]]) ? 1 : 0)) {
                ChatStyle.access$6(llllllllllllIllllIIIIlIIIlIllllI, llllllllllllIllllIIIIlIIIlIlllIl.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[13]]).getAsString());
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[14]]) ? 1 : 0)) {
                final JsonObject llllllllllllIllllIIIIlIIIlIlllII = llllllllllllIllllIIIIlIIIlIlllIl.getAsJsonObject(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[15]]);
                if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIlllII)) {
                    final JsonPrimitive llllllllllllIllllIIIIlIIIlIllIll = llllllllllllIllllIIIIlIIIlIlllII.getAsJsonPrimitive(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[16]]);
                    ClickEvent.Action valueByCanonicalName;
                    if (lIIIIllIlIlIlllI(llllllllllllIllllIIIIlIIIlIllIll)) {
                        valueByCanonicalName = null;
                        "".length();
                        if (-" ".length() > 0) {
                            return null;
                        }
                    }
                    else {
                        valueByCanonicalName = ClickEvent.Action.getValueByCanonicalName(llllllllllllIllllIIIIlIIIlIllIll.getAsString());
                    }
                    final ClickEvent.Action llllllllllllIllllIIIIlIIIlIllIlI = valueByCanonicalName;
                    final JsonPrimitive llllllllllllIllllIIIIlIIIlIllIIl = llllllllllllIllllIIIIlIIIlIlllII.getAsJsonPrimitive(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[17]]);
                    String asString;
                    if (lIIIIllIlIlIlllI(llllllllllllIllllIIIIlIIIlIllIIl)) {
                        asString = null;
                        "".length();
                        if (" ".length() <= ("  ".length() & ("  ".length() ^ -" ".length()))) {
                            return null;
                        }
                    }
                    else {
                        asString = llllllllllllIllllIIIIlIIIlIllIIl.getAsString();
                    }
                    final String llllllllllllIllllIIIIlIIIlIllIII = asString;
                    if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIllIlI) && lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIllIII) && lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIllIlI.shouldAllowInChat() ? 1 : 0)) {
                        ChatStyle.access$7(llllllllllllIllllIIIIlIIIlIllllI, new ClickEvent(llllllllllllIllllIIIIlIIIlIllIlI, llllllllllllIllllIIIIlIIIlIllIII));
                    }
                }
            }
            if (lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlllIl.has(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[18]]) ? 1 : 0)) {
                final JsonObject llllllllllllIllllIIIIlIIIlIlIlll = llllllllllllIllllIIIIlIIIlIlllIl.getAsJsonObject(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[19]]);
                if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIlIlll)) {
                    final JsonPrimitive llllllllllllIllllIIIIlIIIlIlIllI = llllllllllllIllllIIIIlIIIlIlIlll.getAsJsonPrimitive(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[20]]);
                    HoverEvent.Action valueByCanonicalName2;
                    if (lIIIIllIlIlIlllI(llllllllllllIllllIIIIlIIIlIlIllI)) {
                        valueByCanonicalName2 = null;
                        "".length();
                        if (((0x50 ^ 0x57) & ~(0x7A ^ 0x7D)) < ((0x7A ^ 0x73) & ~(0x43 ^ 0x4A))) {
                            return null;
                        }
                    }
                    else {
                        valueByCanonicalName2 = HoverEvent.Action.getValueByCanonicalName(llllllllllllIllllIIIIlIIIlIlIllI.getAsString());
                    }
                    final HoverEvent.Action llllllllllllIllllIIIIlIIIlIlIlIl = valueByCanonicalName2;
                    final IChatComponent llllllllllllIllllIIIIlIIIlIlIlII = (IChatComponent)llllllllllllIllllIIIIlIIIlIlIIlI.deserialize(llllllllllllIllllIIIIlIIIlIlIlll.get(Serializer.llIIIIIIIllIII[Serializer.llIIIIIIIlllII[21]]), (Type)IChatComponent.class);
                    if (lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIlIlIl) && lIIIIllIlIlIllll(llllllllllllIllllIIIIlIIIlIlIlII) && lIIIIllIlIlIllIl(llllllllllllIllllIIIIlIIIlIlIlIl.shouldAllowInChat() ? 1 : 0)) {
                        ChatStyle.access$8(llllllllllllIllllIIIIlIIIlIllllI, new HoverEvent(llllllllllllIllllIIIIlIIIlIlIlIl, llllllllllllIllllIIIIlIIIlIlIlII));
                    }
                }
            }
            return llllllllllllIllllIIIIlIIIlIllllI;
        }
        
        private static boolean lIIIIllIlIllIIII(final int llllllllllllIllllIIIIIllllllIlll, final int llllllllllllIllllIIIIIllllllIllI) {
            return llllllllllllIllllIIIIIllllllIlll < llllllllllllIllllIIIIIllllllIllI;
        }
        
        private static boolean lIIIIllIlIlIlllI(final Object llllllllllllIllllIIIIIllllllIIlI) {
            return llllllllllllIllllIIIIIllllllIIlI == null;
        }
    }
}
