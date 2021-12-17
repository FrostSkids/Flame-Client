// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import net.minecraft.command.CommandException;
import java.util.List;
import net.minecraft.command.EntityNotFoundException;
import net.minecraft.command.PlayerSelector;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChatComponentProcessor
{
    private static final /* synthetic */ int[] lIIIIIlIIIlIlI;
    private static final /* synthetic */ String[] lIIIIIlIIIlIII;
    
    private static boolean lIllIlIllIIlIlI(final int lllllllllllllIlIIllllIllllIlIIIl, final int lllllllllllllIlIIllllIllllIlIIII) {
        return lllllllllllllIlIIllllIllllIlIIIl >= lllllllllllllIlIIllllIllllIlIIII;
    }
    
    private static void lIllIlIllIIIIll() {
        (lIIIIIlIIIlIII = new String[ChatComponentProcessor.lIIIIIlIIIlIlI[2]])[ChatComponentProcessor.lIIIIIlIIIlIlI[1]] = lIllIlIllIIIIIl("ixpYt8rqwP0=", "Eipdt");
        ChatComponentProcessor.lIIIIIlIIIlIII[ChatComponentProcessor.lIIIIIlIIIlIlI[0]] = lIllIlIllIIIIlI("hlVHIcxtszc=", "iexjN");
    }
    
    private static void lIllIlIllIIIlII() {
        (lIIIIIlIIIlIlI = new int[4])[0] = " ".length();
        ChatComponentProcessor.lIIIIIlIIIlIlI[1] = ((0x5C ^ 0x45 ^ (0x39 ^ 0x29)) & (80 + 18 + 22 + 7 ^ (0xFC ^ 0x8A) ^ -" ".length()));
        ChatComponentProcessor.lIIIIIlIIIlIlI[2] = "  ".length();
        ChatComponentProcessor.lIIIIIlIIIlIlI[3] = (0x17 ^ 0x1F);
    }
    
    private static boolean lIllIlIllIIlIIl(final int lllllllllllllIlIIllllIllllIIlIII) {
        return lllllllllllllIlIIllllIllllIIlIII == 0;
    }
    
    private static boolean lIllIlIllIIlIII(final Object lllllllllllllIlIIllllIllllIIllII) {
        return lllllllllllllIlIIllllIllllIIllII == null;
    }
    
    private static boolean lIllIlIllIIIlll(final Object lllllllllllllIlIIllllIllllIIlllI) {
        return lllllllllllllIlIIllllIllllIIlllI != null;
    }
    
    static {
        lIllIlIllIIIlII();
        lIllIlIllIIIIll();
    }
    
    private static String lIllIlIllIIIIIl(final String lllllllllllllIlIIllllIllllIlIlll, final String lllllllllllllIlIIllllIllllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllllIllllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllllIllllIlIllI.getBytes(StandardCharsets.UTF_8)), ChatComponentProcessor.lIIIIIlIIIlIlI[3]), "DES");
            final Cipher lllllllllllllIlIIllllIllllIllIll = Cipher.getInstance("DES");
            lllllllllllllIlIIllllIllllIllIll.init(ChatComponentProcessor.lIIIIIlIIIlIlI[2], lllllllllllllIlIIllllIllllIlllII);
            return new String(lllllllllllllIlIIllllIllllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllllIllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllllIllllIllIlI) {
            lllllllllllllIlIIllllIllllIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlIllIIIlIl(final int lllllllllllllIlIIllllIllllIIlIlI) {
        return lllllllllllllIlIIllllIllllIIlIlI != 0;
    }
    
    public static IChatComponent processComponent(final ICommandSender lllllllllllllIlIIllllIllllllIlII, final IChatComponent lllllllllllllIlIIlllllIIIIIIIIII, final Entity lllllllllllllIlIIllllIllllllIIlI) throws CommandException {
        IChatComponent lllllllllllllIlIIllllIlllllllllI = null;
        if (lIllIlIllIIIlIl((lllllllllllllIlIIlllllIIIIIIIIII instanceof ChatComponentScore) ? 1 : 0)) {
            final ChatComponentScore lllllllllllllIlIIllllIllllllllIl = (ChatComponentScore)lllllllllllllIlIIlllllIIIIIIIIII;
            String lllllllllllllIlIIllllIllllllllII = lllllllllllllIlIIllllIllllllllIl.getName();
            if (lIllIlIllIIIlIl(PlayerSelector.hasArguments(lllllllllllllIlIIllllIllllllllII) ? 1 : 0)) {
                final List<Entity> lllllllllllllIlIIllllIlllllllIll = PlayerSelector.matchEntities(lllllllllllllIlIIllllIllllllIlII, lllllllllllllIlIIllllIllllllllII, (Class<? extends Entity>)Entity.class);
                if (lIllIlIllIIIllI(lllllllllllllIlIIllllIlllllllIll.size(), ChatComponentProcessor.lIIIIIlIIIlIlI[0])) {
                    throw new EntityNotFoundException();
                }
                lllllllllllllIlIIllllIllllllllII = lllllllllllllIlIIllllIlllllllIll.get(ChatComponentProcessor.lIIIIIlIIIlIlI[1]).getName();
            }
            IChatComponent chatComponent;
            if (lIllIlIllIIIlll(lllllllllllllIlIIllllIllllllIIlI) && lIllIlIllIIIlIl(lllllllllllllIlIIllllIllllllllII.equals(ChatComponentProcessor.lIIIIIlIIIlIII[ChatComponentProcessor.lIIIIIlIIIlIlI[1]]) ? 1 : 0)) {
                chatComponent = new ChatComponentScore(lllllllllllllIlIIllllIllllllIIlI.getName(), lllllllllllllIlIIllllIllllllllIl.getObjective());
                "".length();
                if (((0x42 ^ 0x45 ^ (0x4B ^ 0x78)) & (0x9 ^ 0x10 ^ (0x98 ^ 0xB5) ^ -" ".length())) > "   ".length()) {
                    return null;
                }
            }
            else {
                chatComponent = new ChatComponentScore(lllllllllllllIlIIllllIllllllllII, lllllllllllllIlIIllllIllllllllIl.getObjective());
            }
            lllllllllllllIlIIllllIlllllllllI = chatComponent;
            ((ChatComponentScore)lllllllllllllIlIIllllIlllllllllI).setValue(lllllllllllllIlIIllllIllllllllIl.getUnformattedTextForChat());
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIllIlIllIIIlIl((lllllllllllllIlIIlllllIIIIIIIIII instanceof ChatComponentSelector) ? 1 : 0)) {
            final String lllllllllllllIlIIllllIlllllllIlI = ((ChatComponentSelector)lllllllllllllIlIIlllllIIIIIIIIII).getSelector();
            lllllllllllllIlIIllllIlllllllllI = PlayerSelector.matchEntitiesToChatComponent(lllllllllllllIlIIllllIllllllIlII, lllllllllllllIlIIllllIlllllllIlI);
            if (lIllIlIllIIlIII(lllllllllllllIlIIllllIlllllllllI)) {
                lllllllllllllIlIIllllIlllllllllI = new ChatComponentText(ChatComponentProcessor.lIIIIIlIIIlIII[ChatComponentProcessor.lIIIIIlIIIlIlI[0]]);
                "".length();
                if (((0x1B ^ 0x2A ^ (0x3C ^ 0x13)) & (0 + 97 - 67 + 101 ^ 60 + 79 - 37 + 55 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
        }
        else if (lIllIlIllIIIlIl((lllllllllllllIlIIlllllIIIIIIIIII instanceof ChatComponentText) ? 1 : 0)) {
            lllllllllllllIlIIllllIlllllllllI = new ChatComponentText(((ChatComponentText)lllllllllllllIlIIlllllIIIIIIIIII).getChatComponentText_TextValue());
            "".length();
            if ("   ".length() > (0x59 ^ 0x5D)) {
                return null;
            }
        }
        else {
            if (lIllIlIllIIlIIl((lllllllllllllIlIIlllllIIIIIIIIII instanceof ChatComponentTranslation) ? 1 : 0)) {
                return lllllllllllllIlIIlllllIIIIIIIIII;
            }
            final Object[] lllllllllllllIlIIllllIlllllllIIl = ((ChatComponentTranslation)lllllllllllllIlIIlllllIIIIIIIIII).getFormatArgs();
            int lllllllllllllIlIIllllIlllllllIII = ChatComponentProcessor.lIIIIIlIIIlIlI[1];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
            while (!lIllIlIllIIlIlI(lllllllllllllIlIIllllIlllllllIII, lllllllllllllIlIIllllIlllllllIIl.length)) {
                final Object lllllllllllllIlIIllllIllllllIlll = lllllllllllllIlIIllllIlllllllIIl[lllllllllllllIlIIllllIlllllllIII];
                if (lIllIlIllIIIlIl((lllllllllllllIlIIllllIllllllIlll instanceof IChatComponent) ? 1 : 0)) {
                    lllllllllllllIlIIllllIlllllllIIl[lllllllllllllIlIIllllIlllllllIII] = processComponent(lllllllllllllIlIIllllIllllllIlII, (IChatComponent)lllllllllllllIlIIllllIllllllIlll, lllllllllllllIlIIllllIllllllIIlI);
                }
                ++lllllllllllllIlIIllllIlllllllIII;
            }
            lllllllllllllIlIIllllIlllllllllI = new ChatComponentTranslation(((ChatComponentTranslation)lllllllllllllIlIIlllllIIIIIIIIII).getKey(), lllllllllllllIlIIllllIlllllllIIl);
        }
        final ChatStyle lllllllllllllIlIIllllIllllllIllI = lllllllllllllIlIIlllllIIIIIIIIII.getChatStyle();
        if (lIllIlIllIIIlll(lllllllllllllIlIIllllIllllllIllI)) {
            lllllllllllllIlIIllllIlllllllllI.setChatStyle(lllllllllllllIlIIllllIllllllIllI.createShallowCopy());
            "".length();
        }
        final boolean lllllllllllllIlIIllllIlllllIlllI = (boolean)lllllllllllllIlIIlllllIIIIIIIIII.getSiblings().iterator();
        "".length();
        if (((0x83 ^ 0xAF ^ (0x0 ^ 0x74)) & (0x6B ^ 0x6E ^ (0x6D ^ 0x30) ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!lIllIlIllIIlIIl(((Iterator)lllllllllllllIlIIllllIlllllIlllI).hasNext() ? 1 : 0)) {
            final IChatComponent lllllllllllllIlIIllllIllllllIlIl = ((Iterator<IChatComponent>)lllllllllllllIlIIllllIlllllIlllI).next();
            lllllllllllllIlIIllllIlllllllllI.appendSibling(processComponent(lllllllllllllIlIIllllIllllllIlII, lllllllllllllIlIIllllIllllllIlIl, lllllllllllllIlIIllllIllllllIIlI));
            "".length();
        }
        return lllllllllllllIlIIllllIlllllllllI;
    }
    
    private static String lIllIlIllIIIIlI(final String lllllllllllllIlIIllllIlllllIIlII, final String lllllllllllllIlIIllllIlllllIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllllIlllllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllllIlllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllllIlllllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllllIlllllIlIII.init(ChatComponentProcessor.lIIIIIlIIIlIlI[2], lllllllllllllIlIIllllIlllllIlIIl);
            return new String(lllllllllllllIlIIllllIlllllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllllIlllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllllIlllllIIlll) {
            lllllllllllllIlIIllllIlllllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlIllIIIllI(final int lllllllllllllIlIIllllIllllIIIlIl, final int lllllllllllllIlIIllllIllllIIIlII) {
        return lllllllllllllIlIIllllIllllIIIlIl != lllllllllllllIlIIllllIllllIIIlII;
    }
}
