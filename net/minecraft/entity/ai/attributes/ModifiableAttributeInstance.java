// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.UUID;
import java.util.Set;
import java.util.Map;

public class ModifiableAttributeInstance implements IAttributeInstance
{
    private final /* synthetic */ Map<Integer, Set<AttributeModifier>> mapByOperation;
    private /* synthetic */ double baseValue;
    private static final /* synthetic */ int[] llIlIIllllllIl;
    private /* synthetic */ double cachedValue;
    private final /* synthetic */ IAttribute genericAttribute;
    private final /* synthetic */ Map<UUID, AttributeModifier> mapByUUID;
    private final /* synthetic */ BaseAttributeMap attributeMap;
    private /* synthetic */ boolean needsUpdate;
    private static final /* synthetic */ String[] llIlIIllllllII;
    private final /* synthetic */ Map<String, Set<AttributeModifier>> mapByName;
    
    static {
        lIIlIIllIllIIIIl();
        lIIlIIllIllIIIII();
    }
    
    private static boolean lIIlIIllIllIIlIl(final Object llllllllllllIllIlIllIlIIIIllIlll) {
        return llllllllllllIllIlIllIlIIIIllIlll != null;
    }
    
    private static void lIIlIIllIllIIIII() {
        (llIlIIllllllII = new String[ModifiableAttributeInstance.llIlIIllllllIl[0]])[ModifiableAttributeInstance.llIlIIllllllIl[1]] = lIIlIIllIlIlllll("fqoKwify4g8mqrO0DB2O/22mlultF+sffju/e/AXFw90GNf7DNuph7K6nhsnssZc", "hOuXS");
    }
    
    @Override
    public boolean hasModifier(final AttributeModifier llllllllllllIllIlIllIlIIlIIlIIlI) {
        if (lIIlIIllIllIIlIl(this.mapByUUID.get(llllllllllllIllIlIllIlIIlIIlIIlI.getID()))) {
            return ModifiableAttributeInstance.llIlIIllllllIl[0] != 0;
        }
        return ModifiableAttributeInstance.llIlIIllllllIl[1] != 0;
    }
    
    @Override
    public void removeAllModifiers() {
        final Collection<AttributeModifier> llllllllllllIllIlIllIlIIIlllIIll = this.func_111122_c();
        if (lIIlIIllIllIIlIl(llllllllllllIllIlIllIlIIIlllIIll)) {
            final char llllllllllllIllIlIllIlIIIllIlllI = (char)Lists.newArrayList((Iterable)llllllllllllIllIlIllIlIIIlllIIll).iterator();
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
            while (!lIIlIIllIllIIlll(((Iterator)llllllllllllIllIlIllIlIIIllIlllI).hasNext() ? 1 : 0)) {
                final AttributeModifier llllllllllllIllIlIllIlIIIlllIIlI = ((Iterator<AttributeModifier>)llllllllllllIllIlIllIlIIIllIlllI).next();
                this.removeModifier(llllllllllllIllIlIllIlIIIlllIIlI);
            }
        }
    }
    
    private static boolean lIIlIIllIllIIlll(final int llllllllllllIllIlIllIlIIIIllIIIl) {
        return llllllllllllIllIlIllIlIIIIllIIIl == 0;
    }
    
    @Override
    public void applyModifier(final AttributeModifier llllllllllllIllIlIllIlIIlIIIlIlI) {
        if (lIIlIIllIllIIlIl(this.getModifier(llllllllllllIllIlIllIlIIlIIIlIlI.getID()))) {
            throw new IllegalArgumentException(ModifiableAttributeInstance.llIlIIllllllII[ModifiableAttributeInstance.llIlIIllllllIl[1]]);
        }
        Set<AttributeModifier> llllllllllllIllIlIllIlIIlIIIllII = this.mapByName.get(llllllllllllIllIlIllIlIIlIIIlIlI.getName());
        if (lIIlIIllIllIIllI(llllllllllllIllIlIllIlIIlIIIllII)) {
            llllllllllllIllIlIllIlIIlIIIllII = (Set<AttributeModifier>)Sets.newHashSet();
            this.mapByName.put(llllllllllllIllIlIllIlIIlIIIlIlI.getName(), llllllllllllIllIlIllIlIIlIIIllII);
            "".length();
        }
        this.mapByOperation.get(llllllllllllIllIlIllIlIIlIIIlIlI.getOperation()).add(llllllllllllIllIlIllIlIIlIIIlIlI);
        "".length();
        llllllllllllIllIlIllIlIIlIIIllII.add(llllllllllllIllIlIllIlIIlIIIlIlI);
        "".length();
        this.mapByUUID.put(llllllllllllIllIlIllIlIIlIIIlIlI.getID(), llllllllllllIllIlIllIlIIlIIIlIlI);
        "".length();
        this.flagForUpdate();
    }
    
    private double computeValue() {
        double llllllllllllIllIlIllIlIIIllIIIll = this.getBaseValue();
        final byte llllllllllllIllIlIllIlIIIlIllIll = (byte)this.func_180375_b(ModifiableAttributeInstance.llIlIIllllllIl[1]).iterator();
        "".length();
        if ("  ".length() < 0) {
            return 0.0;
        }
        while (!lIIlIIllIllIIlll(((Iterator)llllllllllllIllIlIllIlIIIlIllIll).hasNext() ? 1 : 0)) {
            final AttributeModifier llllllllllllIllIlIllIlIIIllIIIlI = ((Iterator<AttributeModifier>)llllllllllllIllIlIllIlIIIlIllIll).next();
            llllllllllllIllIlIllIlIIIllIIIll += llllllllllllIllIlIllIlIIIllIIIlI.getAmount();
        }
        double llllllllllllIllIlIllIlIIIllIIIIl = llllllllllllIllIlIllIlIIIllIIIll;
        float llllllllllllIllIlIllIlIIIlIllIIl = (float)this.func_180375_b(ModifiableAttributeInstance.llIlIIllllllIl[0]).iterator();
        "".length();
        if (-" ".length() >= ((0x78 ^ 0x22) & ~(0x31 ^ 0x6B))) {
            return 0.0;
        }
        while (!lIIlIIllIllIIlll(((Iterator)llllllllllllIllIlIllIlIIIlIllIIl).hasNext() ? 1 : 0)) {
            final AttributeModifier llllllllllllIllIlIllIlIIIllIIIII = ((Iterator<AttributeModifier>)llllllllllllIllIlIllIlIIIlIllIIl).next();
            llllllllllllIllIlIllIlIIIllIIIIl += llllllllllllIllIlIllIlIIIllIIIll * llllllllllllIllIlIllIlIIIllIIIII.getAmount();
        }
        llllllllllllIllIlIllIlIIIlIllIIl = (float)this.func_180375_b(ModifiableAttributeInstance.llIlIIllllllIl[3]).iterator();
        "".length();
        if ((0x4A ^ 0x1D ^ (0xDF ^ 0x8C)) <= -" ".length()) {
            return 0.0;
        }
        while (!lIIlIIllIllIIlll(((Iterator)llllllllllllIllIlIllIlIIIlIllIIl).hasNext() ? 1 : 0)) {
            final AttributeModifier llllllllllllIllIlIllIlIIIlIlllll = ((Iterator<AttributeModifier>)llllllllllllIllIlIllIlIIIlIllIIl).next();
            llllllllllllIllIlIllIlIIIllIIIIl *= 1.0 + llllllllllllIllIlIllIlIIIlIlllll.getAmount();
        }
        return this.genericAttribute.clampValue(llllllllllllIllIlIllIlIIIllIIIIl);
    }
    
    @Override
    public Collection<AttributeModifier> func_111122_c() {
        final Set<AttributeModifier> llllllllllllIllIlIllIlIIlIlIIIlI = (Set<AttributeModifier>)Sets.newHashSet();
        int llllllllllllIllIlIllIlIIlIlIIIIl = ModifiableAttributeInstance.llIlIIllllllIl[1];
        "".length();
        if ((0x4A ^ 0x18 ^ (0x16 ^ 0x40)) < ((228 + 34 - 104 + 90 ^ 165 + 7 - 33 + 29) & (0x75 ^ 0x13 ^ (0x50 ^ 0x66) ^ -" ".length()))) {
            return null;
        }
        while (!lIIlIIllIllIIIlI(llllllllllllIllIlIllIlIIlIlIIIIl, ModifiableAttributeInstance.llIlIIllllllIl[2])) {
            llllllllllllIllIlIllIlIIlIlIIIlI.addAll(this.getModifiersByOperation(llllllllllllIllIlIllIlIIlIlIIIIl));
            "".length();
            ++llllllllllllIllIlIllIlIIlIlIIIIl;
        }
        return llllllllllllIllIlIllIlIIlIlIIIlI;
    }
    
    protected void flagForUpdate() {
        this.needsUpdate = (ModifiableAttributeInstance.llIlIIllllllIl[0] != 0);
        this.attributeMap.func_180794_a(this);
    }
    
    @Override
    public void setBaseValue(final double llllllllllllIllIlIllIlIIlIlIllll) {
        if (lIIlIIllIllIIlII(lIIlIIllIllIIIll(llllllllllllIllIlIllIlIIlIlIllll, this.getBaseValue()))) {
            this.baseValue = llllllllllllIllIlIllIlIIlIlIllll;
            this.flagForUpdate();
        }
    }
    
    @Override
    public IAttribute getAttribute() {
        return this.genericAttribute;
    }
    
    private Collection<AttributeModifier> func_180375_b(final int llllllllllllIllIlIllIlIIIlIIllIl) {
        final Set<AttributeModifier> llllllllllllIllIlIllIlIIIlIlIIIl = (Set<AttributeModifier>)Sets.newHashSet((Iterable)this.getModifiersByOperation(llllllllllllIllIlIllIlIIIlIIllIl));
        IAttribute llllllllllllIllIlIllIlIIIlIlIIII = this.genericAttribute.func_180372_d();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIlIIllIllIIllI(llllllllllllIllIlIllIlIIIlIlIIII)) {
            final IAttributeInstance llllllllllllIllIlIllIlIIIlIIllll = this.attributeMap.getAttributeInstance(llllllllllllIllIlIllIlIIIlIlIIII);
            if (lIIlIIllIllIIlIl(llllllllllllIllIlIllIlIIIlIIllll)) {
                llllllllllllIllIlIllIlIIIlIlIIIl.addAll(llllllllllllIllIlIllIlIIIlIIllll.getModifiersByOperation(llllllllllllIllIlIllIlIIIlIIllIl));
                "".length();
            }
            llllllllllllIllIlIllIlIIIlIlIIII = llllllllllllIllIlIllIlIIIlIlIIII.func_180372_d();
        }
        return llllllllllllIllIlIllIlIIIlIlIIIl;
    }
    
    public ModifiableAttributeInstance(final BaseAttributeMap llllllllllllIllIlIllIlIIlIlllIll, final IAttribute llllllllllllIllIlIllIlIIlIlllIlI) {
        this.mapByOperation = (Map<Integer, Set<AttributeModifier>>)Maps.newHashMap();
        this.mapByName = (Map<String, Set<AttributeModifier>>)Maps.newHashMap();
        this.mapByUUID = (Map<UUID, AttributeModifier>)Maps.newHashMap();
        this.needsUpdate = (ModifiableAttributeInstance.llIlIIllllllIl[0] != 0);
        this.attributeMap = llllllllllllIllIlIllIlIIlIlllIll;
        this.genericAttribute = llllllllllllIllIlIllIlIIlIlllIlI;
        this.baseValue = llllllllllllIllIlIllIlIIlIlllIlI.getDefaultValue();
        int llllllllllllIllIlIllIlIIlIllllIl = ModifiableAttributeInstance.llIlIIllllllIl[1];
        "".length();
        if (-" ".length() > "   ".length()) {
            throw null;
        }
        while (!lIIlIIllIllIIIlI(llllllllllllIllIlIllIlIIlIllllIl, ModifiableAttributeInstance.llIlIIllllllIl[2])) {
            this.mapByOperation.put(llllllllllllIllIlIllIlIIlIllllIl, Sets.newHashSet());
            "".length();
            ++llllllllllllIllIlIllIlIIlIllllIl;
        }
    }
    
    @Override
    public Collection<AttributeModifier> getModifiersByOperation(final int llllllllllllIllIlIllIlIIlIlIlIIl) {
        return this.mapByOperation.get(llllllllllllIllIlIllIlIIlIlIlIIl);
    }
    
    @Override
    public double getBaseValue() {
        return this.baseValue;
    }
    
    @Override
    public double getAttributeValue() {
        if (lIIlIIllIllIIlII(this.needsUpdate ? 1 : 0)) {
            this.cachedValue = this.computeValue();
            this.needsUpdate = (ModifiableAttributeInstance.llIlIIllllllIl[1] != 0);
        }
        return this.cachedValue;
    }
    
    private static void lIIlIIllIllIIIIl() {
        (llIlIIllllllIl = new int[5])[0] = " ".length();
        ModifiableAttributeInstance.llIlIIllllllIl[1] = ((0x6B ^ 0x49) & ~(0xE2 ^ 0xC0));
        ModifiableAttributeInstance.llIlIIllllllIl[2] = "   ".length();
        ModifiableAttributeInstance.llIlIIllllllIl[3] = "  ".length();
        ModifiableAttributeInstance.llIlIIllllllIl[4] = (82 + 54 + 5 + 26 ^ 142 + 29 - 42 + 46);
    }
    
    private static boolean lIIlIIllIllIIllI(final Object llllllllllllIllIlIllIlIIIIllIlIl) {
        return llllllllllllIllIlIllIlIIIIllIlIl == null;
    }
    
    private static boolean lIIlIIllIllIIlII(final int llllllllllllIllIlIllIlIIIIllIIll) {
        return llllllllllllIllIlIllIlIIIIllIIll != 0;
    }
    
    private static String lIIlIIllIlIlllll(final String llllllllllllIllIlIllIlIIIlIIIIII, final String llllllllllllIllIlIllIlIIIIllllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIllIlIIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIlIIIIllllll.getBytes(StandardCharsets.UTF_8)), ModifiableAttributeInstance.llIlIIllllllIl[4]), "DES");
            final Cipher llllllllllllIllIlIllIlIIIlIIIlII = Cipher.getInstance("DES");
            llllllllllllIllIlIllIlIIIlIIIlII.init(ModifiableAttributeInstance.llIlIIllllllIl[3], llllllllllllIllIlIllIlIIIlIIIlIl);
            return new String(llllllllllllIllIlIllIlIIIlIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIlIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllIlIIIlIIIIll) {
            llllllllllllIllIlIllIlIIIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public AttributeModifier getModifier(final UUID llllllllllllIllIlIllIlIIlIIllIlI) {
        return this.mapByUUID.get(llllllllllllIllIlIllIlIIlIIllIlI);
    }
    
    @Override
    public void removeModifier(final AttributeModifier llllllllllllIllIlIllIlIIlIIIIIII) {
        int llllllllllllIllIlIllIlIIIlllllll = ModifiableAttributeInstance.llIlIIllllllIl[1];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return;
        }
        while (!lIIlIIllIllIIIlI(llllllllllllIllIlIllIlIIIlllllll, ModifiableAttributeInstance.llIlIIllllllIl[2])) {
            final Set<AttributeModifier> llllllllllllIllIlIllIlIIIllllllI = this.mapByOperation.get(llllllllllllIllIlIllIlIIIlllllll);
            llllllllllllIllIlIllIlIIIllllllI.remove(llllllllllllIllIlIllIlIIlIIIIIII);
            "".length();
            ++llllllllllllIllIlIllIlIIIlllllll;
        }
        final Set<AttributeModifier> llllllllllllIllIlIllIlIIIlllllIl = this.mapByName.get(llllllllllllIllIlIllIlIIlIIIIIII.getName());
        if (lIIlIIllIllIIlIl(llllllllllllIllIlIllIlIIIlllllIl)) {
            llllllllllllIllIlIllIlIIIlllllIl.remove(llllllllllllIllIlIllIlIIlIIIIIII);
            "".length();
            if (lIIlIIllIllIIlII(llllllllllllIllIlIllIlIIIlllllIl.isEmpty() ? 1 : 0)) {
                this.mapByName.remove(llllllllllllIllIlIllIlIIlIIIIIII.getName());
                "".length();
            }
        }
        this.mapByUUID.remove(llllllllllllIllIlIllIlIIlIIIIIII.getID());
        "".length();
        this.flagForUpdate();
    }
    
    private static boolean lIIlIIllIllIIIlI(final int llllllllllllIllIlIllIlIIIIlllIlI, final int llllllllllllIllIlIllIlIIIIlllIIl) {
        return llllllllllllIllIlIllIlIIIIlllIlI >= llllllllllllIllIlIllIlIIIIlllIIl;
    }
    
    private static int lIIlIIllIllIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
}
