// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.spectator;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.gui.spectator.categories.TeleportToTeam;
import net.minecraft.client.gui.spectator.categories.TeleportToPlayer;
import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class BaseSpectatorGroup implements ISpectatorMenuView
{
    private final /* synthetic */ List<ISpectatorMenuObject> field_178671_a;
    private static final /* synthetic */ String[] lIIlllIIllllIl;
    private static final /* synthetic */ int[] lIIlllIIlllllI;
    
    static {
        llIllIllIlIIIlI();
        llIllIllIlIIIIl();
    }
    
    private static void llIllIllIlIIIIl() {
        (lIIlllIIllllIl = new String[BaseSpectatorGroup.lIIlllIIlllllI[1]])[BaseSpectatorGroup.lIIlllIIlllllI[0]] = llIllIllIlIIIII("PRASGwpNA1cDHBRCAwdZHgcbDRoZQhZIGgIPGgkXCU5XCRcJQhYPGAQMVxwWTRcEDVkEFlk=", "mbwhy");
    }
    
    private static String llIllIllIlIIIII(String lllllllllllllIIlIlIIIIIlIIlIlIlI, final String lllllllllllllIIlIlIIIIIlIIlIlIIl) {
        lllllllllllllIIlIlIIIIIlIIlIlIlI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIIIIIlIIlIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIIIIlIIlIllIl = new StringBuilder();
        final char[] lllllllllllllIIlIlIIIIIlIIlIllII = lllllllllllllIIlIlIIIIIlIIlIlIIl.toCharArray();
        int lllllllllllllIIlIlIIIIIlIIlIlIll = BaseSpectatorGroup.lIIlllIIlllllI[0];
        final String lllllllllllllIIlIlIIIIIlIIlIIlIl = (Object)((String)lllllllllllllIIlIlIIIIIlIIlIlIlI).toCharArray();
        final short lllllllllllllIIlIlIIIIIlIIlIIlII = (short)lllllllllllllIIlIlIIIIIlIIlIIlIl.length;
        double lllllllllllllIIlIlIIIIIlIIlIIIll = BaseSpectatorGroup.lIIlllIIlllllI[0];
        while (llIllIllIlIIIll((int)lllllllllllllIIlIlIIIIIlIIlIIIll, lllllllllllllIIlIlIIIIIlIIlIIlII)) {
            final char lllllllllllllIIlIlIIIIIlIIllIIII = lllllllllllllIIlIlIIIIIlIIlIIlIl[lllllllllllllIIlIlIIIIIlIIlIIIll];
            lllllllllllllIIlIlIIIIIlIIlIllIl.append((char)(lllllllllllllIIlIlIIIIIlIIllIIII ^ lllllllllllllIIlIlIIIIIlIIlIllII[lllllllllllllIIlIlIIIIIlIIlIlIll % lllllllllllllIIlIlIIIIIlIIlIllII.length]));
            "".length();
            ++lllllllllllllIIlIlIIIIIlIIlIlIll;
            ++lllllllllllllIIlIlIIIIIlIIlIIIll;
            "".length();
            if ((0x22 ^ 0x26) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIIIIlIIlIllIl);
    }
    
    public BaseSpectatorGroup() {
        this.field_178671_a = (List<ISpectatorMenuObject>)Lists.newArrayList();
        this.field_178671_a.add(new TeleportToPlayer());
        "".length();
        this.field_178671_a.add(new TeleportToTeam());
        "".length();
    }
    
    private static boolean llIllIllIlIIIll(final int lllllllllllllIIlIlIIIIIlIIIlllll, final int lllllllllllllIIlIlIIIIIlIIIllllI) {
        return lllllllllllllIIlIlIIIIIlIIIlllll < lllllllllllllIIlIlIIIIIlIIIllllI;
    }
    
    private static void llIllIllIlIIIlI() {
        (lIIlllIIlllllI = new int[2])[0] = ((0xA5 ^ 0x99) & ~(0x5C ^ 0x60));
        BaseSpectatorGroup.lIIlllIIlllllI[1] = " ".length();
    }
    
    @Override
    public IChatComponent func_178670_b() {
        return new ChatComponentText(BaseSpectatorGroup.lIIlllIIllllIl[BaseSpectatorGroup.lIIlllIIlllllI[0]]);
    }
    
    @Override
    public List<ISpectatorMenuObject> func_178669_a() {
        return this.field_178671_a;
    }
}
