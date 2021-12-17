// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;

public class LayerVillagerArmor extends LayerBipedArmor
{
    private static final /* synthetic */ int[] lIlIllIIlIIlII;
    
    public LayerVillagerArmor(final RendererLivingEntity<?> lllllllllllllIIIIlllIIIlIlIlIlll) {
        super(lllllllllllllIIIIlllIIIlIlIlIlll);
    }
    
    static {
        llllIIIIllIIlll();
    }
    
    @Override
    protected void initArmor() {
        this.field_177189_c = (T)new ModelZombieVillager(0.5f, 0.0f, (boolean)(LayerVillagerArmor.lIlIllIIlIIlII[0] != 0));
        this.field_177186_d = (T)new ModelZombieVillager(1.0f, 0.0f, (boolean)(LayerVillagerArmor.lIlIllIIlIIlII[0] != 0));
    }
    
    private static void llllIIIIllIIlll() {
        (lIlIllIIlIIlII = new int[1])[0] = " ".length();
    }
}
