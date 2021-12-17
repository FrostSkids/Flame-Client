// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.material;

public class Material
{
    private /* synthetic */ boolean requiresNoTool;
    private /* synthetic */ boolean canBurn;
    private /* synthetic */ boolean isAdventureModeExempt;
    private /* synthetic */ boolean replaceable;
    private static final /* synthetic */ int[] lIIlIlIlIIIIIl;
    private /* synthetic */ boolean isTranslucent;
    private final /* synthetic */ MapColor materialMapColor;
    private /* synthetic */ int mobilityFlag;
    
    public boolean isToolNotRequired() {
        return this.requiresNoTool;
    }
    
    private Material setTranslucent() {
        this.isTranslucent = (Material.lIIlIlIlIIIIIl[0] != 0);
        return this;
    }
    
    public Material setReplaceable() {
        this.replaceable = (Material.lIIlIlIlIIIIIl[0] != 0);
        return this;
    }
    
    private static void llIlIIIIIlIIlII() {
        (lIIlIlIlIIIIIl = new int[3])[0] = " ".length();
        Material.lIIlIlIlIIIIIl[1] = ((195 + 196 - 359 + 206 ^ 2 + 113 - 59 + 117) & (0x4B ^ 0x53 ^ (0xF9 ^ 0xA2) ^ -" ".length()));
        Material.lIIlIlIlIIIIIl[2] = "  ".length();
    }
    
    public boolean getCanBurn() {
        return this.canBurn;
    }
    
    public boolean isReplaceable() {
        return this.replaceable;
    }
    
    protected Material setBurning() {
        this.canBurn = (Material.lIIlIlIlIIIIIl[0] != 0);
        return this;
    }
    
    private static boolean llIlIIIIIlIIlIl(final int lllllllllllllIIllIlIIIIllIIIlIll) {
        return lllllllllllllIIllIlIIIIllIIIlIll != 0;
    }
    
    public boolean isLiquid() {
        return Material.lIIlIlIlIIIIIl[1] != 0;
    }
    
    protected Material setNoPushMobility() {
        this.mobilityFlag = Material.lIIlIlIlIIIIIl[0];
        return this;
    }
    
    public boolean blocksMovement() {
        return Material.lIIlIlIlIIIIIl[0] != 0;
    }
    
    public boolean blocksLight() {
        return Material.lIIlIlIlIIIIIl[0] != 0;
    }
    
    public boolean isSolid() {
        return Material.lIIlIlIlIIIIIl[0] != 0;
    }
    
    protected Material setAdventureModeExempt() {
        this.isAdventureModeExempt = (Material.lIIlIlIlIIIIIl[0] != 0);
        return this;
    }
    
    static {
        llIlIIIIIlIIlII();
        air = new MaterialTransparent(MapColor.airColor);
        grass = new Material(MapColor.grassColor);
        ground = new Material(MapColor.dirtColor);
        wood = new Material(MapColor.woodColor).setBurning();
        rock = new Material(MapColor.stoneColor).setRequiresTool();
        iron = new Material(MapColor.ironColor).setRequiresTool();
        anvil = new Material(MapColor.ironColor).setRequiresTool().setImmovableMobility();
        water = new MaterialLiquid(MapColor.waterColor).setNoPushMobility();
        lava = new MaterialLiquid(MapColor.tntColor).setNoPushMobility();
        leaves = new Material(MapColor.foliageColor).setBurning().setTranslucent().setNoPushMobility();
        plants = new MaterialLogic(MapColor.foliageColor).setNoPushMobility();
        vine = new MaterialLogic(MapColor.foliageColor).setBurning().setNoPushMobility().setReplaceable();
        sponge = new Material(MapColor.yellowColor);
        cloth = new Material(MapColor.clothColor).setBurning();
        fire = new MaterialTransparent(MapColor.airColor).setNoPushMobility();
        sand = new Material(MapColor.sandColor);
        circuits = new MaterialLogic(MapColor.airColor).setNoPushMobility();
        carpet = new MaterialLogic(MapColor.clothColor).setBurning();
        glass = new Material(MapColor.airColor).setTranslucent().setAdventureModeExempt();
        redstoneLight = new Material(MapColor.airColor).setAdventureModeExempt();
        tnt = new Material(MapColor.tntColor).setBurning().setTranslucent();
        coral = new Material(MapColor.foliageColor).setNoPushMobility();
        ice = new Material(MapColor.iceColor).setTranslucent().setAdventureModeExempt();
        packedIce = new Material(MapColor.iceColor).setAdventureModeExempt();
        snow = new MaterialLogic(MapColor.snowColor).setReplaceable().setTranslucent().setRequiresTool().setNoPushMobility();
        craftedSnow = new Material(MapColor.snowColor).setRequiresTool();
        cactus = new Material(MapColor.foliageColor).setTranslucent().setNoPushMobility();
        clay = new Material(MapColor.clayColor);
        gourd = new Material(MapColor.foliageColor).setNoPushMobility();
        dragonEgg = new Material(MapColor.foliageColor).setNoPushMobility();
        portal = new MaterialPortal(MapColor.airColor).setImmovableMobility();
        cake = new Material(MapColor.airColor).setNoPushMobility();
        web = new Material() {
            private static final /* synthetic */ int[] llIlIIllIlIlll;
            
            private static void lIIlIIlIlllllIIl() {
                (llIlIIllIlIlll = new int[1])[0] = ((0x4E ^ 0x69 ^ (0xE ^ 0x2)) & (131 + 115 - 171 + 57 ^ 154 + 143 - 228 + 106 ^ -" ".length()));
            }
            
            static {
                lIIlIIlIlllllIIl();
            }
            
            @Override
            public boolean blocksMovement() {
                return Material$1.llIlIIllIlIlll[0] != 0;
            }
        }.setRequiresTool().setNoPushMobility();
        piston = new Material(MapColor.stoneColor).setImmovableMobility();
        barrier = new Material(MapColor.airColor).setRequiresTool().setImmovableMobility();
    }
    
    public boolean isOpaque() {
        int blocksMovement;
        if (llIlIIIIIlIIlIl(this.isTranslucent ? 1 : 0)) {
            blocksMovement = Material.lIIlIlIlIIIIIl[1];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x4C ^ 0x5 ^ (0x30 ^ 0x61)) & (0xE8 ^ 0xC3 ^ (0x12 ^ 0x21) ^ -" ".length())) != 0x0;
            }
        }
        else {
            blocksMovement = (this.blocksMovement() ? 1 : 0);
        }
        return blocksMovement != 0;
    }
    
    protected Material setRequiresTool() {
        this.requiresNoTool = (Material.lIIlIlIlIIIIIl[1] != 0);
        return this;
    }
    
    public MapColor getMaterialMapColor() {
        return this.materialMapColor;
    }
    
    protected Material setImmovableMobility() {
        this.mobilityFlag = Material.lIIlIlIlIIIIIl[2];
        return this;
    }
    
    public Material(final MapColor lllllllllllllIIllIlIIIIllIlllIII) {
        this.requiresNoTool = (Material.lIIlIlIlIIIIIl[0] != 0);
        this.materialMapColor = lllllllllllllIIllIlIIIIllIlllIII;
    }
    
    public int getMaterialMobility() {
        return this.mobilityFlag;
    }
}
