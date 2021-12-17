// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.EnumChatFormatting;
import com.google.gson.JsonParseException;
import net.minecraft.client.resources.data.PackMetadataSection;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;

public class ResourcePackListEntryDefault extends ResourcePackListEntry
{
    private static final /* synthetic */ String[] lIIIllIIllIIII;
    private static final /* synthetic */ int[] lIIIllIIllIIIl;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ ResourceLocation resourcePackIcon;
    private final /* synthetic */ IResourcePack field_148320_d;
    
    private static boolean llIIIIlllIIlIll(final int lllllllllllllIlIIIIIlIIlIIlIIllI, final int lllllllllllllIlIIIIIlIIlIIlIIlIl) {
        return lllllllllllllIlIIIIIlIIlIIlIIllI < lllllllllllllIlIIIIIlIIlIIlIIlIl;
    }
    
    public ResourcePackListEntryDefault(final GuiScreenResourcePacks lllllllllllllIlIIIIIlIIlIlllIlII) {
        super(lllllllllllllIlIIIIIlIIlIlllIlII);
        this.field_148320_d = this.mc.getResourcePackRepository().rprDefaultResourcePack;
        DynamicTexture lllllllllllllIlIIIIIlIIlIlllIIlI = null;
        try {
            final DynamicTexture lllllllllllllIlIIIIIlIIlIlllIIll = new DynamicTexture(this.field_148320_d.getPackImage());
            "".length();
            if (-" ".length() >= 0) {
                throw null;
            }
        }
        catch (IOException lllllllllllllIlIIIIIlIIlIlllIIIl) {
            lllllllllllllIlIIIIIlIIlIlllIIlI = TextureUtil.missingTexture;
        }
        this.resourcePackIcon = this.mc.getTextureManager().getDynamicTextureLocation(ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[0]], lllllllllllllIlIIIIIlIIlIlllIIlI);
    }
    
    @Override
    protected void func_148313_c() {
        this.mc.getTextureManager().bindTexture(this.resourcePackIcon);
    }
    
    @Override
    protected boolean func_148310_d() {
        return ResourcePackListEntryDefault.lIIIllIIllIIIl[0] != 0;
    }
    
    @Override
    protected boolean func_148308_f() {
        return ResourcePackListEntryDefault.lIIIllIIllIIIl[0] != 0;
    }
    
    private static String llIIIIlllIIIlIl(final String lllllllllllllIlIIIIIlIIlIIlIllII, final String lllllllllllllIlIIIIIlIIlIIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIIlIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIlIIlIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIlIIlIIllIIII.init(ResourcePackListEntryDefault.lIIIllIIllIIIl[2], lllllllllllllIlIIIIIlIIlIIllIIIl);
            return new String(lllllllllllllIlIIIIIlIIlIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIIlIIlIllll) {
            lllllllllllllIlIIIIIlIIlIIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIIlllIIlIlI(final Object lllllllllllllIlIIIIIlIIlIIlIIIll) {
        return lllllllllllllIlIIIIIlIIlIIlIIIll != null;
    }
    
    private static void llIIIIlllIIlIIl() {
        (lIIIllIIllIIIl = new int[9])[0] = ((0x60 ^ 0x35) & ~(0xE3 ^ 0xB6));
        ResourcePackListEntryDefault.lIIIllIIllIIIl[1] = " ".length();
        ResourcePackListEntryDefault.lIIIllIIllIIIl[2] = "  ".length();
        ResourcePackListEntryDefault.lIIIllIIllIIIl[3] = "   ".length();
        ResourcePackListEntryDefault.lIIIllIIllIIIl[4] = (0x53 ^ 0x57);
        ResourcePackListEntryDefault.lIIIllIIllIIIl[5] = ("  ".length() ^ (0x44 ^ 0x43));
        ResourcePackListEntryDefault.lIIIllIIllIIIl[6] = (62 + 84 - 108 + 93 ^ 96 + 67 - 101 + 71);
        ResourcePackListEntryDefault.lIIIllIIllIIIl[7] = (0xCD ^ 0xA0 ^ (0x43 ^ 0x29));
        ResourcePackListEntryDefault.lIIIllIIllIIIl[8] = (34 + 85 - 118 + 132 ^ 109 + 129 - 125 + 28);
    }
    
    @Override
    protected String func_148311_a() {
        try {
            final PackMetadataSection lllllllllllllIlIIIIIlIIlIllIlIII = this.field_148320_d.getPackMetadata(this.mc.getResourcePackRepository().rprMetadataSerializer, ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[1]]);
            if (llIIIIlllIIlIlI(lllllllllllllIlIIIIIlIIlIllIlIII)) {
                return lllllllllllllIlIIIIIlIIlIllIlIII.getPackDescription().getFormattedText();
            }
        }
        catch (JsonParseException lllllllllllllIlIIIIIlIIlIllIIlll) {
            ResourcePackListEntryDefault.logger.error(ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[2]], (Throwable)lllllllllllllIlIIIIIlIIlIllIIlll);
            "".length();
            if ((0x7D ^ 0x79) < ((0x9C ^ 0xC6) & ~(0x5D ^ 0x7) & ~((0xDC ^ 0x92) & ~(0xD1 ^ 0x9F)))) {
                return null;
            }
        }
        catch (IOException lllllllllllllIlIIIIIlIIlIllIIllI) {
            ResourcePackListEntryDefault.logger.error(ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[3]], (Throwable)lllllllllllllIlIIIIIlIIlIllIIllI);
        }
        return String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[4]]).append(ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[5]]).append(ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[6]]));
    }
    
    static {
        llIIIIlllIIlIIl();
        llIIIIlllIIlIII();
        logger = LogManager.getLogger();
    }
    
    @Override
    protected boolean func_148309_e() {
        return ResourcePackListEntryDefault.lIIIllIIllIIIl[0] != 0;
    }
    
    @Override
    protected String func_148312_b() {
        return ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[7]];
    }
    
    private static String llIIIIlllIIIlll(final String lllllllllllllIlIIIIIlIIlIlIlIIIl, final String lllllllllllllIlIIIIIlIIlIlIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIIlIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), ResourcePackListEntryDefault.lIIIllIIllIIIl[8]), "DES");
            final Cipher lllllllllllllIlIIIIIlIIlIlIlIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlIIlIlIlIlIl.init(ResourcePackListEntryDefault.lIIIllIIllIIIl[2], lllllllllllllIlIIIIIlIIlIlIlIllI);
            return new String(lllllllllllllIlIIIIIlIIlIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIIlIlIlIlII) {
            lllllllllllllIlIIIIIlIIlIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected boolean func_148314_g() {
        return ResourcePackListEntryDefault.lIIIllIIllIIIl[0] != 0;
    }
    
    private static String llIIIIlllIIIllI(String lllllllllllllIlIIIIIlIIlIIlllllI, final String lllllllllllllIlIIIIIlIIlIIllllIl) {
        lllllllllllllIlIIIIIlIIlIIlllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIlIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlIIlIlIIIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlIIlIlIIIIII = lllllllllllllIlIIIIIlIIlIIllllIl.toCharArray();
        int lllllllllllllIlIIIIIlIIlIIllllll = ResourcePackListEntryDefault.lIIIllIIllIIIl[0];
        final int lllllllllllllIlIIIIIlIIlIIlllIIl = (Object)lllllllllllllIlIIIIIlIIlIIlllllI.toCharArray();
        final char lllllllllllllIlIIIIIlIIlIIlllIII = (char)lllllllllllllIlIIIIIlIIlIIlllIIl.length;
        int lllllllllllllIlIIIIIlIIlIIllIlll = ResourcePackListEntryDefault.lIIIllIIllIIIl[0];
        while (llIIIIlllIIlIll(lllllllllllllIlIIIIIlIIlIIllIlll, lllllllllllllIlIIIIIlIIlIIlllIII)) {
            final char lllllllllllllIlIIIIIlIIlIlIIIlII = lllllllllllllIlIIIIIlIIlIIlllIIl[lllllllllllllIlIIIIIlIIlIIllIlll];
            lllllllllllllIlIIIIIlIIlIlIIIIIl.append((char)(lllllllllllllIlIIIIIlIIlIlIIIlII ^ lllllllllllllIlIIIIIlIIlIlIIIIII[lllllllllllllIlIIIIIlIIlIIllllll % lllllllllllllIlIIIIIlIIlIlIIIIII.length]));
            "".length();
            ++lllllllllllllIlIIIIIlIIlIIllllll;
            ++lllllllllllllIlIIIIIlIIlIIllIlll;
            "".length();
            if (-(105 + 89 - 191 + 138 ^ 25 + 60 - 20 + 72) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlIIlIlIIIIIl);
    }
    
    private static void llIIIIlllIIlIII() {
        (lIIIllIIllIIII = new String[ResourcePackListEntryDefault.lIIIllIIllIIIl[8]])[ResourcePackListEntryDefault.lIIIllIIllIIIl[0]] = llIIIIlllIIIlIl("Kvf4TXXr8zKXlz5LKEjyQQ==", "YrOsf");
        ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[1]] = llIIIIlllIIIllI("MiIHDg==", "BCdeT");
        ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[2]] = llIIIIlllIIIlIl("h0Z8at+XaraR5NRI1ZNMlvoExnhNd9fnj3bkBLuz2i0=", "Eqzbt");
        ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[3]] = llIIIIlllIIIlIl("TXFv9e6N5kW6LhVSdbjQkMUFAvB+2dA/unsTaFg2aSs=", "qhEDa");
        ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[4]] = llIIIIlllIIIllI("DwwrOCUsAng=", "BeXKL");
        ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[5]] = llIIIIlllIIIllI("ICICPn89IAwwJTE=", "PCaUQ");
        ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[6]] = llIIIIlllIIIlIl("4PJn0jYs28M=", "RZzUc");
        ResourcePackListEntryDefault.lIIIllIIllIIII[ResourcePackListEntryDefault.lIIIllIIllIIIl[7]] = llIIIIlllIIIlll("ZapONaCdNYw=", "pXOpL");
    }
    
    @Override
    protected int func_183019_a() {
        return ResourcePackListEntryDefault.lIIIllIIllIIIl[1];
    }
    
    @Override
    protected boolean func_148307_h() {
        return ResourcePackListEntryDefault.lIIIllIIllIIIl[0] != 0;
    }
}
