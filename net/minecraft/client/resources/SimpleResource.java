// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import com.google.common.collect.Maps;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonParser;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.gson.JsonObject;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.ResourceLocation;
import java.io.InputStream;
import net.minecraft.client.resources.data.IMetadataSection;
import java.util.Map;

public class SimpleResource implements IResource
{
    private final /* synthetic */ Map<String, IMetadataSection> mapMetadataSections;
    private final /* synthetic */ InputStream resourceInputStream;
    private final /* synthetic */ String resourcePackName;
    private /* synthetic */ boolean mcmetaJsonChecked;
    private static final /* synthetic */ int[] llIIIlllIIllIl;
    private final /* synthetic */ InputStream mcmetaInputStream;
    private final /* synthetic */ ResourceLocation srResourceLocation;
    private final /* synthetic */ IMetadataSerializer srMetadataSerializer;
    private /* synthetic */ JsonObject mcmetaJson;
    
    @Override
    public boolean hasMetadata() {
        if (lIIIlIlIllIlIllI(this.mcmetaInputStream)) {
            return SimpleResource.llIIIlllIIllIl[0] != 0;
        }
        return SimpleResource.llIIIlllIIllIl[1] != 0;
    }
    
    static {
        lIIIlIlIllIlIlIl();
    }
    
    private static void lIIIlIlIllIlIlIl() {
        (llIIIlllIIllIl = new int[3])[0] = " ".length();
        SimpleResource.llIIIlllIIllIl[1] = ((0x78 ^ 0x5C ^ (0x3B ^ 0x5E)) & (0x70 ^ 0x33 ^ "  ".length() ^ -" ".length()));
        SimpleResource.llIIIlllIIllIl[2] = (0x39 ^ 0x26);
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlllIlIIIIllIIlIIlII) {
        if (lIIIlIlIllIllIIl(this, llllllllllllIlllIlIIIIllIIlIIlII)) {
            return SimpleResource.llIIIlllIIllIl[0] != 0;
        }
        if (lIIIlIlIllIlIlll((llllllllllllIlllIlIIIIllIIlIIlII instanceof SimpleResource) ? 1 : 0)) {
            return SimpleResource.llIIIlllIIllIl[1] != 0;
        }
        final SimpleResource llllllllllllIlllIlIIIIllIIlIIIll = (SimpleResource)llllllllllllIlllIlIIIIllIIlIIlII;
        if (lIIIlIlIllIlIllI(this.srResourceLocation)) {
            if (lIIIlIlIllIlIlll(this.srResourceLocation.equals(llllllllllllIlllIlIIIIllIIlIIIll.srResourceLocation) ? 1 : 0)) {
                return SimpleResource.llIIIlllIIllIl[1] != 0;
            }
        }
        else if (lIIIlIlIllIlIllI(llllllllllllIlllIlIIIIllIIlIIIll.srResourceLocation)) {
            return SimpleResource.llIIIlllIIllIl[1] != 0;
        }
        if (lIIIlIlIllIlIllI(this.resourcePackName)) {
            if (lIIIlIlIllIlIlll(this.resourcePackName.equals(llllllllllllIlllIlIIIIllIIlIIIll.resourcePackName) ? 1 : 0)) {
                return SimpleResource.llIIIlllIIllIl[1] != 0;
            }
        }
        else if (lIIIlIlIllIlIllI(llllllllllllIlllIlIIIIllIIlIIIll.resourcePackName)) {
            return SimpleResource.llIIIlllIIllIl[1] != 0;
        }
        return SimpleResource.llIIIlllIIllIl[0] != 0;
    }
    
    private static boolean lIIIlIlIllIllIIl(final Object llllllllllllIlllIlIIIIllIIIlIlIl, final Object llllllllllllIlllIlIIIIllIIIlIlII) {
        return llllllllllllIlllIlIIIIllIIIlIlIl == llllllllllllIlllIlIIIIllIIIlIlII;
    }
    
    private static boolean lIIIlIlIllIlIllI(final Object llllllllllllIlllIlIIIIllIIIllIII) {
        return llllllllllllIlllIlIIIIllIIIllIII != null;
    }
    
    @Override
    public ResourceLocation getResourceLocation() {
        return this.srResourceLocation;
    }
    
    @Override
    public String getResourcePackName() {
        return this.resourcePackName;
    }
    
    private static boolean lIIIlIlIllIlIlll(final int llllllllllllIlllIlIIIIllIIIlIIII) {
        return llllllllllllIlllIlIIIIllIIIlIIII == 0;
    }
    
    @Override
    public <T extends IMetadataSection> T getMetadata(final String llllllllllllIlllIlIIIIllIIllIIlI) {
        if (lIIIlIlIllIlIlll(this.hasMetadata() ? 1 : 0)) {
            return null;
        }
        if (lIIIlIlIllIllIII(this.mcmetaJson) && lIIIlIlIllIlIlll(this.mcmetaJsonChecked ? 1 : 0)) {
            this.mcmetaJsonChecked = (SimpleResource.llIIIlllIIllIl[0] != 0);
            BufferedReader llllllllllllIlllIlIIIIllIIllIIIl = null;
            try {
                llllllllllllIlllIlIIIIllIIllIIIl = new BufferedReader(new InputStreamReader(this.mcmetaInputStream));
                this.mcmetaJson = new JsonParser().parse((Reader)llllllllllllIlllIlIIIIllIIllIIIl).getAsJsonObject();
                "".length();
                if (-" ".length() >= (0x78 ^ 0x7C)) {
                    return null;
                }
            }
            finally {
                IOUtils.closeQuietly((Reader)llllllllllllIlllIlIIIIllIIllIIIl);
            }
            IOUtils.closeQuietly((Reader)llllllllllllIlllIlIIIIllIIllIIIl);
        }
        T llllllllllllIlllIlIIIIllIIllIIII = (T)this.mapMetadataSections.get(llllllllllllIlllIlIIIIllIIllIIlI);
        if (lIIIlIlIllIllIII(llllllllllllIlllIlIIIIllIIllIIII)) {
            llllllllllllIlllIlIIIIllIIllIIII = this.srMetadataSerializer.parseMetadataSection(llllllllllllIlllIlIIIIllIIllIIlI, this.mcmetaJson);
        }
        return llllllllllllIlllIlIIIIllIIllIIII;
    }
    
    @Override
    public InputStream getInputStream() {
        return this.resourceInputStream;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (lIIIlIlIllIlIllI(this.resourcePackName)) {
            hashCode = this.resourcePackName.hashCode();
            "".length();
            if ((0x6D ^ 0x69) == " ".length()) {
                return (0xA6 ^ 0xA1) & ~(0x33 ^ 0x34);
            }
        }
        else {
            hashCode = SimpleResource.llIIIlllIIllIl[1];
        }
        int llllllllllllIlllIlIIIIllIIIlllII = hashCode;
        final int n = SimpleResource.llIIIlllIIllIl[2] * llllllllllllIlllIlIIIIllIIIlllII;
        int hashCode2;
        if (lIIIlIlIllIlIllI(this.srResourceLocation)) {
            hashCode2 = this.srResourceLocation.hashCode();
            "".length();
            if (" ".length() != " ".length()) {
                return (60 + 119 - 52 + 7 ^ 135 + 153 - 167 + 73) & (86 + 101 - 30 + 69 ^ 119 + 157 - 126 + 16 ^ -" ".length());
            }
        }
        else {
            hashCode2 = SimpleResource.llIIIlllIIllIl[1];
        }
        llllllllllllIlllIlIIIIllIIIlllII = n + hashCode2;
        return llllllllllllIlllIlIIIIllIIIlllII;
    }
    
    private static boolean lIIIlIlIllIllIII(final Object llllllllllllIlllIlIIIIllIIIlIIlI) {
        return llllllllllllIlllIlIIIIllIIIlIIlI == null;
    }
    
    public SimpleResource(final String llllllllllllIlllIlIIIIllIlIIlIll, final ResourceLocation llllllllllllIlllIlIIIIllIlIIlIlI, final InputStream llllllllllllIlllIlIIIIllIlIIlIIl, final InputStream llllllllllllIlllIlIIIIllIlIIlIII, final IMetadataSerializer llllllllllllIlllIlIIIIllIlIIIIIl) {
        this.mapMetadataSections = (Map<String, IMetadataSection>)Maps.newHashMap();
        this.resourcePackName = llllllllllllIlllIlIIIIllIlIIlIll;
        this.srResourceLocation = llllllllllllIlllIlIIIIllIlIIlIlI;
        this.resourceInputStream = llllllllllllIlllIlIIIIllIlIIlIIl;
        this.mcmetaInputStream = llllllllllllIlllIlIIIIllIlIIlIII;
        this.srMetadataSerializer = llllllllllllIlllIlIIIIllIlIIIIIl;
    }
}
