// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.world.World;

public class StructureMineshaftStart extends StructureStart
{
    private static final /* synthetic */ int[] lIIlllIllIIIIl;
    
    public StructureMineshaftStart(final World lllllllllllllIIlIIlllIIlllIIIlIl, final Random lllllllllllllIIlIIlllIIllIlllllI, final int lllllllllllllIIlIIlllIIlllIIIIll, final int lllllllllllllIIlIIlllIIlllIIIIlI) {
        super(lllllllllllllIIlIIlllIIlllIIIIll, lllllllllllllIIlIIlllIIlllIIIIlI);
        final StructureMineshaftPieces.Room lllllllllllllIIlIIlllIIlllIIIIIl = new StructureMineshaftPieces.Room(StructureMineshaftStart.lIIlllIllIIIIl[0], lllllllllllllIIlIIlllIIllIlllllI, (lllllllllllllIIlIIlllIIlllIIIIll << StructureMineshaftStart.lIIlllIllIIIIl[1]) + StructureMineshaftStart.lIIlllIllIIIIl[2], (lllllllllllllIIlIIlllIIlllIIIIlI << StructureMineshaftStart.lIIlllIllIIIIl[1]) + StructureMineshaftStart.lIIlllIllIIIIl[2]);
        this.components.add(lllllllllllllIIlIIlllIIlllIIIIIl);
        "".length();
        lllllllllllllIIlIIlllIIlllIIIIIl.buildComponent(lllllllllllllIIlIIlllIIlllIIIIIl, this.components, lllllllllllllIIlIIlllIIllIlllllI);
        this.updateBoundingBox();
        this.markAvailableHeight(lllllllllllllIIlIIlllIIlllIIIlIl, lllllllllllllIIlIIlllIIllIlllllI, StructureMineshaftStart.lIIlllIllIIIIl[3]);
    }
    
    public StructureMineshaftStart() {
    }
    
    static {
        llIlllIIIIIIlll();
    }
    
    private static void llIlllIIIIIIlll() {
        (lIIlllIllIIIIl = new int[4])[0] = ((204 + 46 - 195 + 159 ^ 70 + 8 + 9 + 46) & (63 + 193 - 219 + 207 ^ 43 + 159 - 167 + 132 ^ -" ".length()));
        StructureMineshaftStart.lIIlllIllIIIIl[1] = (0x6E ^ 0x6A);
        StructureMineshaftStart.lIIlllIllIIIIl[2] = "  ".length();
        StructureMineshaftStart.lIIlllIllIIIIl[3] = (0x76 ^ 0x4C ^ (0x10 ^ 0x20));
    }
}
