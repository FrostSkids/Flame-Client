// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class TupleIntJsonSerializable
{
    private /* synthetic */ int integerValue;
    private /* synthetic */ IJsonSerializable jsonSerializableValue;
    
    public <T extends IJsonSerializable> T getJsonSerializableValue() {
        return (T)this.jsonSerializableValue;
    }
    
    public void setJsonSerializableValue(final IJsonSerializable llllllllllllIllIIlIlllIlIIIIIlll) {
        this.jsonSerializableValue = llllllllllllIllIIlIlllIlIIIIIlll;
    }
    
    public int getIntegerValue() {
        return this.integerValue;
    }
    
    public void setIntegerValue(final int llllllllllllIllIIlIlllIlIIIlIIII) {
        this.integerValue = llllllllllllIllIIlIlllIlIIIlIIII;
    }
}
