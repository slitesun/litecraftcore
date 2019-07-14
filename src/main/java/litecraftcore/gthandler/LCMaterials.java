package litecraftcore.gthandler;

import gregtech.api.GTValues;
import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import net.minecraftforge.fml.common.Loader;

import static com.google.common.collect.ImmutableList.of;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.type.DustMaterial.MatFlags.*;
import static gregtech.api.unification.material.type.GemMaterial.MatFlags.*;
import static gregtech.api.unification.material.type.IngotMaterial.MatFlags.*;
import static gregtech.api.unification.material.type.Material.MatFlags.*;
import static gregtech.api.unification.material.type.SolidMaterial.MatFlags.*;


@IMaterialHandler.RegisterMaterialHandler
public class LCMaterials {

    LCMaterials(){
        if (Loader.isModLoaded(ModNameValues.GalacticraftPlanets)) {
            gcMaterials();
        }
    }

    private static long CONSTRUCT_MATERIALS = GENERATE_PLATE | GENERATE_DENSE | GENERATE_BOLT_SCREW | GENERATE_ROD | GENERATE_LONG_ROD;
    private static long WIRE_MATEIALS = GENERATE_PLATE | GENERATE_FINE_WIRE;

    /**
     * Vanilla Materials
     */

    public static DustMaterial SoulSand = new DustMaterial(800, "soul_sand", 0x6B5E4F, MaterialIconSet.DULL, 0, of(), NO_SMASHING | NO_SMELTING | NO_WORKING);

    /**
     * PlusTiC Materials
     */

    public static IngotMaterial Alumite = new IngotMaterial(801, "alumite", 0xE9ADDA, MaterialIconSet.METALLIC, 1, of(new MaterialStack(Aluminium, 5), new MaterialStack(Iron, 2), new MaterialStack(Obsidian, 2)), GENERATE_PLATE, null, 8.0F, 7.0f, 768, 1000);

    /**
     * Project Red Materials
     */

    public static GemMaterial Electrotine = new GemMaterial(802, "electrotine", 0x0E73AA, MaterialIconSet.RUBY, 1, of(new MaterialStack(Calcium, 2), new MaterialStack(Magnesium, 5), new MaterialStack(Silicon, 8), new MaterialStack(Oxygen, 22), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 2)), GENERATE_ORE | GENERATE_LENSE | NO_SMASHING | NO_SMELTING | HIGH_SIFTER_OUTPUT);
    public static IngotMaterial ElectrotineAlloy = new IngotMaterial(825, "electrotine_alloy", 0x6173AA, MaterialIconSet.DULL, 1, of(new MaterialStack(Iron, 1), new MaterialStack(Electrotine, 4)), GENERATE_PLATE);


    /**
     * Galacticraft Materials
     */

    public static IngotMaterial MeteoricIron;
    public static IngotMaterial Desh;

    public static void gcMaterials() {
        MeteoricIron = new IngotMaterial(803, "meteoric_iron", 0xA09589, MaterialIconSet.DULL, 1, of(new MaterialStack(Iron, 1)), GENERATE_ORE | GENERATE_PLATE, null, 8.0F, 7.0f, 512, 1000);
        Desh = new IngotMaterial(804, "desh", 0x313131, MaterialIconSet.DULL, 2, of(new MaterialStack(Tungsten, 1), new MaterialStack(Tellurium, 2)), GENERATE_ORE | GENERATE_PLATE, null, 10.0F, 8.0f, 1024, 3500);
    }

    /**
     * EnderIO Materials
     */

    public static IngotMaterial RedstoneAlloy = new IngotMaterial(805, "redstone_alloy", 0xEB5050, MaterialIconSet.METALLIC, 0, of(new MaterialStack(Copper, 1), new MaterialStack(Silicon, 1), new MaterialStack(Redstone, 1)), WIRE_MATEIALS );
    public static IngotMaterial ConductiveIron = new IngotMaterial(806, "conductive_iron", 0xDBB1AA, MaterialIconSet.DULL, 1, of(new MaterialStack(Invar, 2), new MaterialStack(Alumite, 1), new MaterialStack(Redstone, 1)), WIRE_MATEIALS);
    public static IngotMaterial EnergeticAlloy = new IngotMaterial(807, "energetic_alloy", 0xFCAF38, MaterialIconSet.SHINY, 1, of(new MaterialStack(Gold, 3), new MaterialStack(Manganese, 1), new MaterialStack(Glowstone, 1), new MaterialStack(Redstone, 1)), WIRE_MATEIALS, null, 2000);
    public static IngotMaterial PulsatingIron =  new IngotMaterial(808, "pulsating_iron", 0x749D7D, MaterialIconSet.METALLIC, 2, of(new MaterialStack(Iron, 1), new MaterialStack(Chrome, 1), new MaterialStack(Alumite, 1), new MaterialStack(EnderPearl, 1)), WIRE_MATEIALS, null, 3500);
    public static IngotMaterial VibrantAlloy = new IngotMaterial(809, "vibrant_alloy", 0xBAC63F, MaterialIconSet.SHINY, 3, of(new MaterialStack(EnergeticAlloy, 2), new MaterialStack(Platinum, 1), new MaterialStack(EnderPearl, 1)), WIRE_MATEIALS, null, 4200);

    public static IngotMaterial ConstructionAlloy = new IngotMaterial(810, "construction_alloy", 0x706E70, MaterialIconSet.DULL, 1, of(new MaterialStack(Silicon, 1), new MaterialStack(TinAlloy, 8)), DECOMPOSITION_BY_CENTRIFUGING | CONSTRUCT_MATERIALS, null, 6.0F, 3.0f, 512);
    public static IngotMaterial DarkSteel = new IngotMaterial(811, "dark_steel", 0x2B2B2B, MaterialIconSet.DULL, 2, of(new MaterialStack(VanadiumSteel, 6), new MaterialStack(BlackBronze, 2), new MaterialStack(Obsidian,1)), CONSTRUCT_MATERIALS, null, 12.0F, 9.0f, 1024, 2000);
    public static IngotMaterial ElectricalSteel = new IngotMaterial(812, "electrical_steel", 0x7F7F7F, MaterialIconSet.SHINY, 2, of(new MaterialStack(Steel, 7), new MaterialStack(Silicon, 1), new MaterialStack(Vanadium, 1), new MaterialStack(Neodymium, 1)), CONSTRUCT_MATERIALS, null, 9.0F, 8.0f, 900, 2000);
    public static IngotMaterial EndSteel = new IngotMaterial(813, "end_steel", 0xFCFDCA, MaterialIconSet.SHINY, 3, of(new MaterialStack(DarkSteel, 1), new MaterialStack(Titanium, 1), new MaterialStack(Endstone, 1)), CONSTRUCT_MATERIALS, null, 14.0F, 12.0f, 1536, 5000);
    public static IngotMaterial Soularium = new IngotMaterial(814, "soularium", 0x6B5E4F, MaterialIconSet.DULL, 2, of(new MaterialStack(Iron, 4), new MaterialStack(Gold, 1), new MaterialStack(SoulSand, 1)), CONSTRUCT_MATERIALS, null,1000);

    /**
     * Simply Jetpacks Material
     */
    public static IngotMaterial DarkSoularium = new IngotMaterial(815, "dark_soularium", 8221029, MaterialIconSet.DULL, 3, of(new MaterialStack(DarkSteel, 4), new MaterialStack(Soularium, 1), new MaterialStack(PulsatingIron, 1L)), CONSTRUCT_MATERIALS, null, 7000);


    /**
     * Tinker's Materials
     */

    public static IngotMaterial Ardite = new IngotMaterial(816, "ardite", 0xCD5117, MaterialIconSet.METALLIC, 2, of(new MaterialStack(Chrome, 3), new MaterialStack(Platinum, 1)), GENERATE_PLATE | GENERATE_ORE, null, 10.0F, 5.5f, 768,2000);
    public static IngotMaterial Manyullyn = new IngotMaterial(817, "manyullyn", 0xA97DE0, MaterialIconSet.DULL, 2, of(new MaterialStack(Cobalt, 1), new MaterialStack(Ardite, 1)), GENERATE_PLATE, null,  11.0F, 7.0F, 1024,3500);
    public static IngotMaterial AluminumBrass = new IngotMaterial(818, "alubrass", 0xF0D467, MaterialIconSet.DULL, 0, of(new MaterialStack(Aluminium, 3), new MaterialStack(Copper, 1)), GENERATE_PLATE);
    public static IngotMaterial Knightslime = new IngotMaterial(819, "knightslime", 0xD57DF4, MaterialIconSet.METALLIC, 1, of(), GENERATE_PLATE, null, 10.0F, 5F, 1024,3000);

    /**
     * Thermal Foundation Materials
     */

    public static IngotMaterial Signalum = new IngotMaterial(820, "signalum", 0xFF9118, MaterialIconSet.METALLIC, 2, of(new MaterialStack(Titanium, 12), new MaterialStack(Alumite, 4), new MaterialStack(Redstone, 4)), CONSTRUCT_MATERIALS, null, 12.0F, 12.0f, 1768,3500);
    public static IngotMaterial Lumium = new IngotMaterial(821, "lumium", 0xE2E79A, MaterialIconSet.DULL, 1, of(new MaterialStack(Platinum, 4), new MaterialStack(Lanthanum, 1), new MaterialStack(Lutetium, 1)), WIRE_MATEIALS, null, 2000);

    /**
     * Avaritia Materials
     */

    public static IngotMaterial CosmicNeutronium = new IngotMaterial(822, "cosmic_neutronium", 0x1C1C1C, MaterialIconSet.METALLIC, 5, of(), GENERATE_ORE | CONSTRUCT_MATERIALS, null, 20.0F, 20.0F, 3072, 9000);
    public static IngotMaterial Infinity         = new IngotMaterial(823, "infinity",          0xFFF0EA, MaterialIconSet.METALLIC, 3, of(), GENERATE_ORE | WIRE_MATEIALS,       null, 7200);
    public static IngotMaterial InfinityCatalyst = new IngotMaterial(824, "infinity_catalyst", 0xFEEDC5, MaterialIconSet.METALLIC, 4, of(), GENERATE_ORE | WIRE_MATEIALS,       null, 8000);


    /**
     * Extreme Reactors Material
     */

    public static GemMaterial Anglesite = new GemMaterial(826, "anglesite", 0xF0AC0A, MaterialIconSet.GEM_VERTICAL, 1, of(new MaterialStack(Lead, 1), new MaterialStack(Sulfur, 1), new MaterialStack(Oxygen, 4)), GENERATE_ORE | GENERATE_PLATE);
    public static GemMaterial Benitoite = new GemMaterial(827, "benitoite", 0x56CFF7, MaterialIconSet.GEM_VERTICAL, 1, of(new MaterialStack(Barium, 1), new MaterialStack(Titanium, 1), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 9)), GENERATE_ORE | GENERATE_PLATE | DISABLE_DECOMPOSITION);

    /**
     * Advanced Rocketry Materials
     */

    public static GemMaterial Dilithium = new GemMaterial(828, "dilithium", 0xE6E6E6, MaterialIconSet.GEM_VERTICAL, 1, of(), GENERATE_PLATE);
    public static IngotMaterial TitaniumAluminide = new IngotMaterial(829, "titanium_aluminide", 0x7C899D, MaterialIconSet.DULL, 4, of(new MaterialStack(Titanium, 7), new MaterialStack(Aluminium, 3)), GENERATE_BOLT_SCREW, null, 3000);
    public static IngotMaterial TitaniumIridium = new IngotMaterial(830, "titanium_iridium", 0x989DA1, MaterialIconSet.DULL, 4, of(new MaterialStack(Titanium, 1), new MaterialStack(Iridium, 1)), GENERATE_BOLT_SCREW, null, 4200);

    static {
        RedstoneAlloy.setCableProperties(GTValues.V[ULV], 2, 0);
        ConstructionAlloy.setCableProperties(GTValues.V[LV], 2, 1);
        ConductiveIron.setCableProperties(GTValues.V[MV], 4, 1);
        EnergeticAlloy.setCableProperties(GTValues.V[HV], 4, 1);
        PulsatingIron.setCableProperties(GTValues.V[EV], 4, 1);
        VibrantAlloy.setCableProperties(GTValues.V[IV], 4, 1);
        Lumium.setCableProperties(GTValues.V[LuV], 4, 1);
        Infinity.setCableProperties(GTValues.V[ZPM], 4, 1);
        InfinityCatalyst.setCableProperties(GTValues.V[UV], 4, 1);

        Electrotine.setOreMultiplier(2);
        Anglesite.setOreMultiplier(2);
        Benitoite.setOreMultiplier(2);

        Electrotine.addOreByProducts(SiliconDioxide, Kyanite);
        Ardite.addOreByProducts(Platinum, Lutetium);

        CosmicNeutronium.addOreByProducts(Ytterbium, Lutetium, Americium);
        Infinity.addOreByProducts(Gadolinium, Platinum, Iridium);
        InfinityCatalyst.addOreByProducts(Infinity, Promethium, Ytterbium);



        OrePrefix.ingot.setIgnored(LCMaterials.RedstoneAlloy);
        OrePrefix.ingot.setIgnored(LCMaterials.ConstructionAlloy);
        OrePrefix.ingot.setIgnored(LCMaterials.ConductiveIron);
        OrePrefix.ingot.setIgnored(LCMaterials.EnergeticAlloy);
        OrePrefix.ingot.setIgnored(LCMaterials.PulsatingIron);
        OrePrefix.ingot.setIgnored(LCMaterials.VibrantAlloy);
        OrePrefix.ingot.setIgnored(LCMaterials.DarkSteel);
        OrePrefix.ingot.setIgnored(LCMaterials.ElectricalSteel);
        OrePrefix.ingot.setIgnored(LCMaterials.EndSteel);
        OrePrefix.ingot.setIgnored(LCMaterials.Soularium);

        OrePrefix.ingot.setIgnored(LCMaterials.DarkSoularium);

        OrePrefix.ingot.setIgnored(LCMaterials.Ardite);
        OrePrefix.ingot.setIgnored(LCMaterials.AluminumBrass);
        OrePrefix.ingot.setIgnored(LCMaterials.Knightslime);
        OrePrefix.ingot.setIgnored(LCMaterials.Manyullyn);

        OrePrefix.ingot.setIgnored(LCMaterials.ElectrotineAlloy);

        OrePrefix.ingot.setIgnored(LCMaterials.InfinityCatalyst);

        OrePrefix.ingot.setIgnored(LCMaterials.Alumite);

        OrePrefix.gem.setIgnored(Anglesite);
        OrePrefix.gem.setIgnored(Benitoite);


        OrePrefix.nugget.setIgnored(LCMaterials.RedstoneAlloy);
        OrePrefix.nugget.setIgnored(LCMaterials.ConstructionAlloy);
        OrePrefix.nugget.setIgnored(LCMaterials.ConductiveIron);
        OrePrefix.nugget.setIgnored(LCMaterials.EnergeticAlloy);
        OrePrefix.nugget.setIgnored(LCMaterials.PulsatingIron);
        OrePrefix.nugget.setIgnored(LCMaterials.VibrantAlloy);
        OrePrefix.nugget.setIgnored(LCMaterials.DarkSteel);
        OrePrefix.nugget.setIgnored(LCMaterials.ElectricalSteel);
        OrePrefix.nugget.setIgnored(LCMaterials.EndSteel);
        OrePrefix.nugget.setIgnored(LCMaterials.Soularium);

        OrePrefix.nugget.setIgnored(LCMaterials.Ardite);
        OrePrefix.nugget.setIgnored(LCMaterials.AluminumBrass);
        OrePrefix.nugget.setIgnored(LCMaterials.Knightslime);
        OrePrefix.nugget.setIgnored(LCMaterials.Manyullyn);

        OrePrefix.nugget.setIgnored(LCMaterials.Alumite);


        OrePrefix.block.setIgnored(LCMaterials.RedstoneAlloy);
        OrePrefix.block.setIgnored(LCMaterials.ConstructionAlloy);
        OrePrefix.block.setIgnored(LCMaterials.ConductiveIron);
        OrePrefix.block.setIgnored(LCMaterials.EnergeticAlloy);
        OrePrefix.block.setIgnored(LCMaterials.PulsatingIron);
        OrePrefix.block.setIgnored(LCMaterials.VibrantAlloy);
        OrePrefix.block.setIgnored(LCMaterials.DarkSteel);
        OrePrefix.block.setIgnored(LCMaterials.ElectricalSteel);
        OrePrefix.block.setIgnored(LCMaterials.EndSteel);
        OrePrefix.block.setIgnored(LCMaterials.Soularium);

        OrePrefix.block.setIgnored(LCMaterials.Ardite);
        OrePrefix.block.setIgnored(LCMaterials.AluminumBrass);
        OrePrefix.block.setIgnored(LCMaterials.Knightslime);
        OrePrefix.block.setIgnored(LCMaterials.Manyullyn);

        OrePrefix.block.setIgnored(LCMaterials.Alumite);

        OrePrefix.block.setIgnored(LCMaterials.Soularium);

        if (Loader.isModLoaded(ModNameValues.GalacticraftPlanets)){

            MeteoricIron.addOreByProducts(Iron, Nickel);
            Desh.addOreByProducts(Lanthanum, Rutile);

            OrePrefix.ingot.setIgnored(LCMaterials.Desh);
            OrePrefix.ingot.setIgnored(LCMaterials.MeteoricIron);

            OrePrefix.block.setIgnored(LCMaterials.Desh);
            OrePrefix.block.setIgnored(LCMaterials.MeteoricIron);
        }
    }
}
