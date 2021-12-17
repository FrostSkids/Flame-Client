// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.resources.ResourcePackListEntry;
import java.util.List;
import net.minecraft.client.Minecraft;

public class GuiResourcePackAvailable extends GuiResourcePackList
{
    private static final /* synthetic */ String[] llIIIllIlIIIlI;
    private static final /* synthetic */ int[] llIIIllIlIIlII;
    
    public GuiResourcePackAvailable(final Minecraft llllllllllllIlllIlIIlIlIIlllIIlI, final int llllllllllllIlllIlIIlIlIIlllIIIl, final int llllllllllllIlllIlIIlIlIIllIlIll, final List<ResourcePackListEntry> llllllllllllIlllIlIIlIlIIllIlIlI) {
        super(llllllllllllIlllIlIIlIlIIlllIIlI, llllllllllllIlllIlIIlIlIIlllIIIl, llllllllllllIlllIlIIlIlIIllIlIll, llllllllllllIlllIlIIlIlIIllIlIlI);
    }
    
    private static String lIIIlIlIIlIllIll(String llllllllllllIlllIlIIlIlIIlIllIIl, final String llllllllllllIlllIlIIlIlIIlIlllIl) {
        llllllllllllIlllIlIIlIlIIlIllIIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIIlIlIIlIllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIlIlIIlIlllII = new StringBuilder();
        final char[] llllllllllllIlllIlIIlIlIIlIllIll = llllllllllllIlllIlIIlIlIIlIlllIl.toCharArray();
        int llllllllllllIlllIlIIlIlIIlIllIlI = GuiResourcePackAvailable.llIIIllIlIIlII[0];
        final byte llllllllllllIlllIlIIlIlIIlIlIlII = (Object)((String)llllllllllllIlllIlIIlIlIIlIllIIl).toCharArray();
        final boolean llllllllllllIlllIlIIlIlIIlIlIIll = llllllllllllIlllIlIIlIlIIlIlIlII.length != 0;
        boolean llllllllllllIlllIlIIlIlIIlIlIIlI = GuiResourcePackAvailable.llIIIllIlIIlII[0] != 0;
        while (lIIIlIlIIllIIIII(llllllllllllIlllIlIIlIlIIlIlIIlI ? 1 : 0, llllllllllllIlllIlIIlIlIIlIlIIll ? 1 : 0)) {
            final char llllllllllllIlllIlIIlIlIIlIlllll = llllllllllllIlllIlIIlIlIIlIlIlII[llllllllllllIlllIlIIlIlIIlIlIIlI];
            llllllllllllIlllIlIIlIlIIlIlllII.append((char)(llllllllllllIlllIlIIlIlIIlIlllll ^ llllllllllllIlllIlIIlIlIIlIllIll[llllllllllllIlllIlIIlIlIIlIllIlI % llllllllllllIlllIlIIlIlIIlIllIll.length]));
            "".length();
            ++llllllllllllIlllIlIIlIlIIlIllIlI;
            ++llllllllllllIlllIlIIlIlIIlIlIIlI;
            "".length();
            if (((8 + 131 - 27 + 88 ^ 68 + 10 - 57 + 112) & (0x7D ^ 0x71 ^ (0x22 ^ 0x63) ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIlIlIIlIlllII);
    }
    
    static {
        lIIIlIlIIlIlllll();
        lIIIlIlIIlIlllII();
    }
    
    private static void lIIIlIlIIlIlllII() {
        (llIIIllIlIIIlI = new String[GuiResourcePackAvailable.llIIIllIlIIlII[1]])[GuiResourcePackAvailable.llIIIllIlIIlII[0]] = lIIIlIlIIlIllIll("PiwBHRE+KhciBS8iXBMSLSAeEwYgLFwGDTglFw==", "LIrrd");
    }
    
    @Override
    protected String getListHeader() {
        return I18n.format(GuiResourcePackAvailable.llIIIllIlIIIlI[GuiResourcePackAvailable.llIIIllIlIIlII[0]], new Object[GuiResourcePackAvailable.llIIIllIlIIlII[0]]);
    }
    
    private static void lIIIlIlIIlIlllll() {
        (llIIIllIlIIlII = new int[2])[0] = ((91 + 28 - 3 + 23 ^ 58 + 88 - 82 + 135) & (0x72 ^ 0x11 ^ (0x68 ^ 0x47) ^ -" ".length()));
        GuiResourcePackAvailable.llIIIllIlIIlII[1] = " ".length();
    }
    
    private static boolean lIIIlIlIIllIIIII(final int llllllllllllIlllIlIIlIlIIlIIlllI, final int llllllllllllIlllIlIIlIlIIlIIllIl) {
        return llllllllllllIlllIlIIlIlIIlIIlllI < llllllllllllIlllIlIIlIlIIlIIllIl;
    }
}
