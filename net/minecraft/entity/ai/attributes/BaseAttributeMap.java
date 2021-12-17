// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

import java.util.Iterator;
import com.google.common.collect.HashMultimap;
import net.minecraft.server.management.LowerStringMap;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import com.google.common.collect.Multimap;

public abstract class BaseAttributeMap
{
    protected final /* synthetic */ Multimap<IAttribute, IAttribute> field_180377_c;
    protected final /* synthetic */ Map<IAttribute, IAttributeInstance> attributes;
    private static final /* synthetic */ String[] lIIlIIIlIlIlII;
    private static final /* synthetic */ int[] lIIlIIIlIllllI;
    protected final /* synthetic */ Map<String, IAttributeInstance> attributesByName;
    
    private static String llIIlIlIlllIIII(final String lllllllllllllIIlllIIlIlIIIllIIIl, final String lllllllllllllIIlllIIlIlIIIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIlIIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIlIlIIIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIlIlIIIllIIll.init(BaseAttributeMap.lIIlIIIlIllllI[2], lllllllllllllIIlllIIlIlIIIllIlII);
            return new String(lllllllllllllIIlllIIlIlIIIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIlIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIlIIIllIIlI) {
            lllllllllllllIIlllIIlIlIIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    public IAttributeInstance registerAttribute(final IAttribute lllllllllllllIIlllIIlIlIIllIIIII) {
        if (llIIlIllIIllIIl(this.attributesByName.containsKey(lllllllllllllIIlllIIlIlIIllIIIII.getAttributeUnlocalizedName()) ? 1 : 0)) {
            throw new IllegalArgumentException(BaseAttributeMap.lIIlIIIlIlIlII[BaseAttributeMap.lIIlIIIlIllllI[0]]);
        }
        final IAttributeInstance lllllllllllllIIlllIIlIlIIlIlllll = this.func_180376_c(lllllllllllllIIlllIIlIlIIllIIIII);
        this.attributesByName.put(lllllllllllllIIlllIIlIlIIllIIIII.getAttributeUnlocalizedName(), lllllllllllllIIlllIIlIlIIlIlllll);
        "".length();
        this.attributes.put(lllllllllllllIIlllIIlIlIIllIIIII, lllllllllllllIIlllIIlIlIIlIlllll);
        "".length();
        IAttribute lllllllllllllIIlllIIlIlIIlIllllI = lllllllllllllIIlllIIlIlIIllIIIII.func_180372_d();
        "".length();
        if (-"   ".length() >= 0) {
            return null;
        }
        while (!llIIlIllIIllIlI(lllllllllllllIIlllIIlIlIIlIllllI)) {
            this.field_180377_c.put((Object)lllllllllllllIIlllIIlIlIIlIllllI, (Object)lllllllllllllIIlllIIlIlIIllIIIII);
            "".length();
            lllllllllllllIIlllIIlIlIIlIllllI = lllllllllllllIIlllIIlIlIIlIllllI.func_180372_d();
        }
        return lllllllllllllIIlllIIlIlIIlIlllll;
    }
    
    public IAttributeInstance getAttributeInstance(final IAttribute lllllllllllllIIlllIIlIlIIllIlllI) {
        return this.attributes.get(lllllllllllllIIlllIIlIlIIllIlllI);
    }
    
    private static boolean llIIlIllIIllIIl(final int lllllllllllllIIlllIIlIlIIIlIIllI) {
        return lllllllllllllIIlllIIlIlIIIlIIllI != 0;
    }
    
    public void func_180794_a(final IAttributeInstance lllllllllllllIIlllIIlIlIIlIlIlIl) {
    }
    
    private static void llIIlIlIlllIIIl() {
        (lIIlIIIlIlIlII = new String[BaseAttributeMap.lIIlIIIlIllllI[1]])[BaseAttributeMap.lIIlIIIlIllllI[0]] = llIIlIlIlllIIII("z8jEYdMdEg26OZ184Jzy1lrNBPnFDaftKKl9izNulO5OpLArVa/IGA==", "OjQhs");
    }
    
    static {
        llIIlIllIIllIII();
        llIIlIlIlllIIIl();
    }
    
    private static void llIIlIllIIllIII() {
        (lIIlIIIlIllllI = new int[3])[0] = ((0x5B ^ 0x6D ^ (0x7E ^ 0x6)) & (0xAD ^ 0x8C ^ (0xC5 ^ 0xAA) ^ -" ".length()));
        BaseAttributeMap.lIIlIIIlIllllI[1] = " ".length();
        BaseAttributeMap.lIIlIIIlIllllI[2] = "  ".length();
    }
    
    private static boolean llIIlIllIIlllII(final int lllllllllllllIIlllIIlIlIIIlIIlII) {
        return lllllllllllllIIlllIIlIlIIIlIIlII == 0;
    }
    
    private static boolean llIIlIllIIllIlI(final Object lllllllllllllIIlllIIlIlIIIlIlIII) {
        return lllllllllllllIIlllIIlIlIIIlIlIII == null;
    }
    
    protected abstract IAttributeInstance func_180376_c(final IAttribute p0);
    
    public void removeAttributeModifiers(final Multimap<String, AttributeModifier> lllllllllllllIIlllIIlIlIIlIIlllI) {
        final int lllllllllllllIIlllIIlIlIIlIIlIII = (int)lllllllllllllIIlllIIlIlIIlIIlllI.entries().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIlIllIIlllII(((Iterator)lllllllllllllIIlllIIlIlIIlIIlIII).hasNext() ? 1 : 0)) {
            final Map.Entry<String, AttributeModifier> lllllllllllllIIlllIIlIlIIlIIllIl = ((Iterator<Map.Entry<String, AttributeModifier>>)lllllllllllllIIlllIIlIlIIlIIlIII).next();
            final IAttributeInstance lllllllllllllIIlllIIlIlIIlIIllII = this.getAttributeInstanceByName(lllllllllllllIIlllIIlIlIIlIIllIl.getKey());
            if (llIIlIllIIllIll(lllllllllllllIIlllIIlIlIIlIIllII)) {
                lllllllllllllIIlllIIlIlIIlIIllII.removeModifier(lllllllllllllIIlllIIlIlIIlIIllIl.getValue());
            }
        }
    }
    
    public Collection<IAttributeInstance> getAllAttributes() {
        return this.attributesByName.values();
    }
    
    private static boolean llIIlIllIIllIll(final Object lllllllllllllIIlllIIlIlIIIlIlIlI) {
        return lllllllllllllIIlllIIlIlIIIlIlIlI != null;
    }
    
    public IAttributeInstance getAttributeInstanceByName(final String lllllllllllllIIlllIIlIlIIllIlIII) {
        return this.attributesByName.get(lllllllllllllIIlllIIlIlIIllIlIII);
    }
    
    public void applyAttributeModifiers(final Multimap<String, AttributeModifier> lllllllllllllIIlllIIlIlIIlIIIIII) {
        final short lllllllllllllIIlllIIlIlIIIlllIlI = (short)lllllllllllllIIlllIIlIlIIlIIIIII.entries().iterator();
        "".length();
        if (" ".length() == "  ".length()) {
            return;
        }
        while (!llIIlIllIIlllII(((Iterator)lllllllllllllIIlllIIlIlIIIlllIlI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, AttributeModifier> lllllllllllllIIlllIIlIlIIIllllll = ((Iterator<Map.Entry<String, AttributeModifier>>)lllllllllllllIIlllIIlIlIIIlllIlI).next();
            final IAttributeInstance lllllllllllllIIlllIIlIlIIIlllllI = this.getAttributeInstanceByName(lllllllllllllIIlllIIlIlIIIllllll.getKey());
            if (llIIlIllIIllIll(lllllllllllllIIlllIIlIlIIIlllllI)) {
                lllllllllllllIIlllIIlIlIIIlllllI.removeModifier(lllllllllllllIIlllIIlIlIIIllllll.getValue());
                lllllllllllllIIlllIIlIlIIIlllllI.applyModifier(lllllllllllllIIlllIIlIlIIIllllll.getValue());
            }
        }
    }
    
    public BaseAttributeMap() {
        this.attributes = (Map<IAttribute, IAttributeInstance>)Maps.newHashMap();
        this.attributesByName = new LowerStringMap<IAttributeInstance>();
        this.field_180377_c = (Multimap<IAttribute, IAttribute>)HashMultimap.create();
    }
}
