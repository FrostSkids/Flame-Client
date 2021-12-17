// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.resources.ResourcePackListEntry;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GuiResourcePackSelected extends GuiResourcePackList
{
    private static final /* synthetic */ int[] llIIIlIlIIIIIl;
    private static final /* synthetic */ String[] llIIIlIlIIIIII;
    
    static {
        lIIIlIIlIIllIIll();
        lIIIlIIlIIllIIlI();
    }
    
    private static String lIIIlIIlIIllIIIl(String llllllllllllIlllIlIlllIlIllIlIll, final String llllllllllllIlllIlIlllIlIllIlIlI) {
        llllllllllllIlllIlIlllIlIllIlIll = new String(Base64.getDecoder().decode(llllllllllllIlllIlIlllIlIllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlllIlIllIlllI = new StringBuilder();
        final char[] llllllllllllIlllIlIlllIlIllIllIl = llllllllllllIlllIlIlllIlIllIlIlI.toCharArray();
        int llllllllllllIlllIlIlllIlIllIllII = GuiResourcePackSelected.llIIIlIlIIIIIl[0];
        final short llllllllllllIlllIlIlllIlIllIIllI = (Object)llllllllllllIlllIlIlllIlIllIlIll.toCharArray();
        final short llllllllllllIlllIlIlllIlIllIIlIl = (short)llllllllllllIlllIlIlllIlIllIIllI.length;
        float llllllllllllIlllIlIlllIlIllIIlII = GuiResourcePackSelected.llIIIlIlIIIIIl[0];
        while (lIIIlIIlIIllIlII((int)llllllllllllIlllIlIlllIlIllIIlII, llllllllllllIlllIlIlllIlIllIIlIl)) {
            final char llllllllllllIlllIlIlllIlIlllIIIl = llllllllllllIlllIlIlllIlIllIIllI[llllllllllllIlllIlIlllIlIllIIlII];
            llllllllllllIlllIlIlllIlIllIlllI.append((char)(llllllllllllIlllIlIlllIlIlllIIIl ^ llllllllllllIlllIlIlllIlIllIllIl[llllllllllllIlllIlIlllIlIllIllII % llllllllllllIlllIlIlllIlIllIllIl.length]));
            "".length();
            ++llllllllllllIlllIlIlllIlIllIllII;
            ++llllllllllllIlllIlIlllIlIllIIlII;
            "".length();
            if (((0xAA ^ 0xB8) & ~(0x53 ^ 0x41)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlllIlIllIlllI);
    }
    
    private static void lIIIlIIlIIllIIlI() {
        (llIIIlIlIIIIII = new String[GuiResourcePackSelected.llIIIlIlIIIIIl[1]])[GuiResourcePackSelected.llIIIlIlIIIIIl[0]] = lIIIlIIlIIllIIIl("MD0wHSAwOyYiNCEzbQEwLj0gBjAmdjcbIS49", "BXCrU");
    }
    
    @Override
    protected String getListHeader() {
        return I18n.format(GuiResourcePackSelected.llIIIlIlIIIIII[GuiResourcePackSelected.llIIIlIlIIIIIl[0]], new Object[GuiResourcePackSelected.llIIIlIlIIIIIl[0]]);
    }
    
    public GuiResourcePackSelected(final Minecraft llllllllllllIlllIlIlllIlIlllllll, final int llllllllllllIlllIlIlllIlIllllllI, final int llllllllllllIlllIlIlllIllIIIIIlI, final List<ResourcePackListEntry> llllllllllllIlllIlIlllIllIIIIIIl) {
        super(llllllllllllIlllIlIlllIlIlllllll, llllllllllllIlllIlIlllIlIllllllI, llllllllllllIlllIlIlllIllIIIIIlI, llllllllllllIlllIlIlllIllIIIIIIl);
    }
    
    private static boolean lIIIlIIlIIllIlII(final int llllllllllllIlllIlIlllIlIllIIIII, final int llllllllllllIlllIlIlllIlIlIlllll) {
        return llllllllllllIlllIlIlllIlIllIIIII < llllllllllllIlllIlIlllIlIlIlllll;
    }
    
    private static void lIIIlIIlIIllIIll() {
        (llIIIlIlIIIIIl = new int[2])[0] = ((0x2E ^ 0x4F) & ~(0xA2 ^ 0xC3));
        GuiResourcePackSelected.llIIIlIlIIIIIl[1] = " ".length();
    }
}
