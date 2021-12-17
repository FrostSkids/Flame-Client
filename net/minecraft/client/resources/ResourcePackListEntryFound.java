// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import net.minecraft.client.gui.GuiScreenResourcePacks;

public class ResourcePackListEntryFound extends ResourcePackListEntry
{
    private final /* synthetic */ ResourcePackRepository.Entry field_148319_c;
    
    @Override
    protected String func_148311_a() {
        return this.field_148319_c.getTexturePackDescription();
    }
    
    @Override
    protected void func_148313_c() {
        this.field_148319_c.bindTexturePackIcon(this.mc.getTextureManager());
    }
    
    public ResourcePackRepository.Entry func_148318_i() {
        return this.field_148319_c;
    }
    
    @Override
    protected String func_148312_b() {
        return this.field_148319_c.getResourcePackName();
    }
    
    @Override
    protected int func_183019_a() {
        return this.field_148319_c.func_183027_f();
    }
    
    public ResourcePackListEntryFound(final GuiScreenResourcePacks llllllllllllIllIlIIIIIIlllIIlIll, final ResourcePackRepository.Entry llllllllllllIllIlIIIIIIlllIIlIlI) {
        super(llllllllllllIllIlIIIIIIlllIIlIll);
        this.field_148319_c = llllllllllllIllIlIIIIIIlllIIlIlI;
    }
}
