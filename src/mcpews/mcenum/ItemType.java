package mcpews.mcenum;

import java.util.HashMap;

/**
 *
 * @author Jocopa3
 */
public enum ItemType {
    // NOTE: This doesn't contain all blocks! Use BlockType for specific blocks
    // In this enum, if a block has an item form, only the item form is listed

    STONE("stone", 1),
    STONE_GRANITE("stone", "granite", 1, 1),
    STONE_GRANITESMOOTH("stone", "graniteSmooth", 1, 2),
    STONE_DIORITE("stone", "diorite", 1, 3),
    STONE_DIORITESMOOTH("stone", "dioriteSmooth", 1, 4),
    STONE_ANDESITE("stone", "andesite", 1, 5),
    STONE_ANDESITESMOOTH("stone", "andesiteSmooth", 1, 6),
    GRASS("grass", 2),
    DIRT("dirt", 3),
    COBBLESTONE("cobblestone", 4),
    PLANKS_OAK("planks", "oak", 5, 0),
    PLANKS_SPRUCE("planks", "spruce", 5, 1),
    PLANKS_BIRCH("planks", "birch", 5, 2),
    PLANKS_JUNGLE("planks", "jungle", 5, 3),
    PLANKS_ACACIA("planks", "acacia", 5, 4),
    PLANKS_BIG_OAK("planks", "big_oak", 5, 5),
    SAPLING_OAK("sapling", "oak", 6, 0),
    SAPLING_SPRUCE("sapling", "spruce", 6, 1),
    SAPLING_BIRCH("sapling", "birch", 6, 2),
    SAPLING_JUNGLE("sapling", "jungle", 6, 3),
    SAPLING_ACACIA("sapling", "acacia", 6, 4),
    SAPLING_BIG_OAK("sapling", "big_oak", 6, 5),
    BEDROCK("bedrock", 7),
    SAND("sand", 12),
    SAND_RED("sand", "red", 12, 1),
    GRAVEL("gravel", 13),
    GOLD_ORE("gold_ore", 14),
    IRON_ORE("iron_ore", 15),
    COAL_ORE("coal_ore", 16),
    LOG_OAK("log", "oak", 17, 0),
    LOG_SPRUCE("log", "spruce", 17, 1),
    LOG_BIRCH("log", "birch", 17, 2),
    LOG_JUNGLE("log", "jungle", 17, 3),
    LEAVES_OAK("leaves", "oak", 18, 0),
    LEAVES_SPRUCE("leaves", "spruce", 18, 1),
    LEAVES_BIRCH("leaves", "birch", 18, 2),
    LEAVES_JUNGLE("leaves", "jungle", 18, 3),
    SPONGE_DRY("sponge", "dry", 19, 0),
    SPONGE_WET("sponge", "wet", 19, 1),
    GLASS("glass", 20),
    LAPIS_ORE("lapis_ore", 21),
    LAPIS_BLOCK("lapis_block", 22),
    DISPENSER("dispenser", 23),
    SANDSTONE("sandstone", 24),
    SANDSTONE_CHISELED("sandstone", "chiseled", 24, 1),
    SANDSTONE_SMOOTH("sandstone", "smooth", 24, 2),
    NOTEBLOCK("noteblock", 25),
    GOLDEN_RAIL("golden_rail", 27),
    DETECTOR_RAIL("detector_rail", 28),
    STICKY_PISTON("sticky_piston", 29),
    WEB("web", 30),
    TALLGRASS_GRASS("tallgrass", "grass", 31, 1),
    TALLGRASS_FERN("tallgrass", "fern", 31, 2),
    DEADBUSH("deadbush", 32),
    PISTON("piston", 33),
    WOOL("wool", 35),
    WOOL_WHITE("wool", "white", 35, 0),
    WOOL_ORANGE("wool", "orange", 35, 1),
    WOOL_MAGENTA("wool", "magenta", 35, 2),
    WOOL_LIGHTBLUE("wool", "lightBlue", 35,  3),
    WOOL_YELLOW("wool", "yellow", 35, 4),
    WOOL_LIME("wool", "lime", 35, 5),
    WOOL_PINK("wool", "pink", 35, 6),
    WOOL_GRAY("wool", "gray", 35, 7),
    WOOL_SILVER("wool", "silver", 35, 8),
    WOOL_CYAN("wool", "cyan", 35, 9),
    WOOL_PURPLE("wool", "purple", 35, 10),
    WOOL_BLUE("wool", "blue", 35, 11),
    WOOL_BROWN("wool", "brown", 35, 12),
    WOOL_GREEN("wool", "green", 35, 13),
    WOOL_RED("wool", "red", 35, 14),
    WOOL_BLACK("wool", "black", 35, 15),
    YELLOW_FLOWER("yellow_flower", 37),
    RED_FLOWER_POPPY("red_flower", "poppy", 38, 0),
    RED_FLOWER_BLUEORCHID("red_flower", "blueOrchid", 38, 1),
    RED_FLOWER_ALLIUM("red_flower", "allium", 38, 2),
    RED_FLOWER_HOUSTONIA("red_flower", "houstonia", 38, 3),
    RED_FLOWER_TULIPRED("red_flower", "tulipRed", 38, 4),
    RED_FLOWER_TULIPORANGE("red_flower", "tulipOrange", 38, 5),
    RED_FLOWER_TULIPWHITE("red_flower", "tulipWhite", 38, 6),
    RED_FLOWER_TULIPPINK("red_flower", "tulipPink", 38, 7),
    RED_FLOWER_OXEYEDAISY("red_flower", "oxeyeDaisy", 38, 8),
    BROWN_MUSHROOM("brown_mushroom", 39),
    RED_MUSHROOM("red_mushroom", 40),
    GOLD_BLOCK("gold_block", 41),
    IRON_BLOCK("iron_block", 42),
    DOUBLE_STONE_SLAB_STONE("double_stone_slab", "stone", 43, 0),
    DOUBLE_STONE_SLAB_SAND("double_stone_slab", "sand", 43, 1),
    DOUBLE_STONE_SLAB_WOOD("double_stone_slab", "wood", 43, 2),
    DOUBLE_STONE_SLAB_COBBLE("double_stone_slab", "cobble", 43, 3),
    DOUBLE_STONE_SLAB_BRICK("double_stone_slab", "brick", 43, 4),
    DOUBLE_STONE_SLAB_SMOOTHSTONEBRICK("double_stone_slab", "smoothStoneBrick", 43, 5),
    DOUBLE_STONE_SLAB_QUARTZ("double_stone_slab", "quartz", 43, 6),
    DOUBLE_STONE_SLAB_NETHER_BRICK("double_stone_slab", "nether_brick", 43, 7),
    STONE_SLAB_STONE("stone_slab", "stone", 44, 0),
    STONE_SLAB_SAND("stone_slab", "sand", 44, 1),
    STONE_SLAB_WOOD("stone_slab", "wood", 44, 2),
    STONE_SLAB_COBBLE("stone_slab", "cobble", 44, 3),
    STONE_SLAB_BRICK("stone_slab", "brick", 44, 4),
    STONE_SLAB_SMOOTHSTONEBRICK("stone_slab", "smoothStoneBrick", 44, 5),
    STONE_SLAB_QUARTZ("stone_slab", "quartz", 44, 6),
    STONE_SLAB_NETHER_BRICK("stone_slab", "nether_brick", 44, 7),
    BRICK_BLOCK("brick_block", 45),
    TNT("tnt", 46),
    BOOKSHELF("bookshelf", 47),
    MOSSY_COBBLESTONE("mossy_cobblestone", 48),
    OBSIDIAN("obsidian", 49),
    TORCH("torch", 50),
    FIRE("fire", 51),
    MOB_SPAWNER("mob_spawner", 52),
    OAK_STAIRS("oak_stairs", 53),
    CHEST("chest", 54),
    REDSTONE_WIRE("redstone_wire", 55),
    DIAMOND_ORE("diamond_ore", 56),
    DIAMOND_BLOCK("diamond_block", 57),
    CRAFTING_TABLE("crafting_table", 58),
    FARMLAND("farmland", 60),
    FURNACE("furnace", 61),
    LADDER("ladder", 65),
    RAIL("rail", 66),
    STONE_STAIRS("stone_stairs", 67),
    WALL_SIGN("wall_sign", 68),
    LEVER("lever", 69),
    STONE_PRESSURE_PLATE("stone_pressure_plate", 70),
    WOODEN_PRESSURE_PLATE("wooden_pressure_plate", 72),
    REDSTONE_ORE("redstone_ore", 73),
    STONE_BUTTON("stone_button", 77),
    SNOW_LAYER("snow_layer", 78),
    ICE("ice", 79),
    SNOW("snow", 80),
    CACTUS("cactus", 81),
    CLAY("clay", 82),
    FENCE("fence", 85),
    FENCE_SPRUCEFENCE("fence", "spruceFence", 85, 1),
    FENCE_BIRCHFENCE("fence", "birchFence", 85, 2),
    FENCE_JUNGLEFENCE("fence", "jungleFence", 85, 3),
    FENCE_ACACIAFENCE("fence", "acaciaFence", 85, 4),
    FENCE_DARKOAKFENCE("fence", "darkOakFence", 85, 5),
    PUMPKIN("pumpkin", 86),
    NETHERRACK("netherrack", 87),
    SOUL_SAND("soul_sand", 88),
    GLOWSTONE("glowstone", 89),
    LIT_PUMPKIN("lit_pumpkin", 91),
    TRAPDOOR("trapdoor", 96),
    MONSTER_EGG("monster_egg", 97),
    MONSTER_EGG_STONE("monster_egg", "stone", 97, 0),
    MONSTER_EGG_COBBLE("monster_egg", "cobble", 97, 1),
    MONSTER_EGG_BRICK("monster_egg", "brick", 97, 2),
    MONSTER_EGG_MOSSYBRICK("monster_egg", "mossybrick", 97, 3),
    MONSTER_EGG_CRACKEDBRICK("monster_egg", "crackedbrick", 97, 4),
    MONSTER_EGG_CHISELEDBRICK("monster_egg", "chiseledbrick", 97, 5),
    STONEBRICK("stonebrick", 98),
    STONEBRICK_MOSSY("stonebrick", "mossy", 98, 1),
    STONEBRICK_CRACKED("stonebrick", "cracked", 98, 2),
    STONEBRICK_CHISELED("stonebrick", "chiseled", 98, 3),
    STONEBRICK_SMOOTH("stonebrick", "smooth", 98, 4),
    BROWN_MUSHROOM_BLOCK("brown_mushroom_block", 99),
    RED_MUSHROOM_BLOCK("red_mushroom_block", 100),
    IRON_BARS("iron_bars", 101),
    GLASS_PANE("glass_pane", 102),
    MELON_BLOCK("melon_block", 103),
    PUMPKIN_STEM("pumpkin_stem", 104),
    MELON_STEM("melon_stem", 105),
    VINE("vine", 106),
    FENCE_GATE("fence_gate", 107),
    BRICK_STAIRS("brick_stairs", 108),
    STONE_BRICK_STAIRS("stone_brick_stairs", 109),
    MYCELIUM("mycelium", 110),
    WATERLILY("waterlily", 111),
    NETHER_BRICK("nether_brick", 112),
    NETHER_BRICK_FENCE("nether_brick_fence", 113),
    NETHER_BRICK_STAIRS("nether_brick_stairs", 114),
    ENCHANTING_TABLE("enchanting_table", 116),
    END_PORTAL("end_portal", 119),
    END_PORTAL_FRAME("end_portal_frame", 120),
    END_STONE("end_stone", 121),
    DRAGON_EGG("dragon_egg", 122),
    REDSTONE_LAMP("redstone_lamp", 123),
    DROPPER("dropper", 125),
    ACTIVATOR_RAIL("activator_rail", 126),
    COCOA("cocoa", 127),
    SANDSTONE_STAIRS("sandstone_stairs", 128),
    EMERALD_ORE("emerald_ore", 129),
    ENDER_CHEST("ender_chest", 130),
    TRIPWIRE_HOOK("tripwire_hook", 131),
    TRIPWIRE("tripWire", 132),
    EMERALD_BLOCK("emerald_block", 133),
    SPRUCE_STAIRS("spruce_stairs", 134),
    BIRCH_STAIRS("birch_stairs", 135),
    JUNGLE_STAIRS("jungle_stairs", 136),
    COMMAND_BLOCK("command_block", 137),
    BEACON("beacon", 138),
    COBBLESTONE_WALL("cobblestone_wall", 139),
    COBBLESTONE_WALL_MOSSY("cobblestone_wall", "mossy", 139, 1),
    WOODEN_BUTTON("wooden_button", 143),
    ANVIL_INTACT("anvil", "intact", 145, 0),
    ANVIL_SLIGHTLYDAMAGED("anvil", "slightlyDamaged", 145, 4),
    ANVIL_VERYDAMAGED("anvil", "veryDamaged", 145, 8),
    TRAPPED_CHEST("trapped_chest", 146),
    LIGHT_WEIGHTED_PRESSURE_PLATE("light_weighted_pressure_plate", 147),
    HEAVY_WEIGHTED_PRESSURE_PLATE("heavy_weighted_pressure_plate", 148),
    DAYLIGHT_DETECTOR("daylight_detector", 151),
    REDSTONE_BLOCK("redstone_block", 152),
    QUARTZ_ORE("quartz_ore", 153),
    QUARTZ_BLOCK("quartz_block", 155),
    QUARTZ_BLOCK_CHISELED("quartz_block", "chiseled", 155, 1),
    QUARTZ_BLOCK_LINES("quartz_block", "lines", 155, 2),
    QUARTZ_STAIRS("quartz_stairs", 156),
    DOUBLE_WOODEN_SLAB_OAK("double_wooden_slab", "oak", 157, 0),
    DOUBLE_WOODEN_SLAB_SPRUCE("double_wooden_slab", "spruce", 157, 1),
    DOUBLE_WOODEN_SLAB_BIRCH("double_wooden_slab", "birch", 157, 2),
    DOUBLE_WOODEN_SLAB_JUNGLE("double_wooden_slab", "jungle", 157, 3),
    DOUBLE_WOODEN_SLAB_ACACIA("double_wooden_slab", "acacia", 157, 4),
    DOUBLE_WOODEN_SLAB_BIG_OAK("double_wooden_slab", "big_oak", 157, 5),
    WOODEN_SLAB_OAK("wooden_slab", "oak", 158, 0),
    WOODEN_SLAB_SPRUCE("wooden_slab", "spruce", 158, 1),
    WOODEN_SLAB_BIRCH("wooden_slab", "birch", 158, 2),
    WOODEN_SLAB_JUNGLE("wooden_slab", "jungle", 158, 3),
    WOODEN_SLAB_ACACIA("wooden_slab", "acacia", 158, 4),
    WOODEN_SLAB_BIG_OAK("wooden_slab", "big_oak", 158, 5),
    STAINED_HARDENED_CLAY_WHITE("stained_hardened_clay", "white", 159, 0),
    STAINED_HARDENED_CLAY_ORANGE("stained_hardened_clay", "orange", 159, 1),
    STAINED_HARDENED_CLAY_MAGENTA("stained_hardened_clay", "magenta", 159, 2),
    STAINED_HARDENED_CLAY_LIGHTBLUE("stained_hardened_clay", "lightBlue", 159, 3),
    STAINED_HARDENED_CLAY_YELLOW("stained_hardened_clay", "yellow", 159, 4),
    STAINED_HARDENED_CLAY_LIME("stained_hardened_clay", "lime", 159, 5),
    STAINED_HARDENED_CLAY_PINK("stained_hardened_clay", "pink", 159, 6),
    STAINED_HARDENED_CLAY_GRAY("stained_hardened_clay", "gray", 159, 7),
    STAINED_HARDENED_CLAY_SILVER("stained_hardened_clay", "silver", 159, 8),
    STAINED_HARDENED_CLAY_CYAN("stained_hardened_clay", "cyan", 159, 9),
    STAINED_HARDENED_CLAY_PURPLE("stained_hardened_clay", "purple", 159, 10),
    STAINED_HARDENED_CLAY_BLUE("stained_hardened_clay", "blue", 159, 11),
    STAINED_HARDENED_CLAY_BROWN("stained_hardened_clay", "brown", 159, 12),
    STAINED_HARDENED_CLAY_GREEN("stained_hardened_clay", "green", 159, 13),
    STAINED_HARDENED_CLAY_RED("stained_hardened_clay", "red", 159, 14),
    STAINED_HARDENED_CLAY_BLACK("stained_hardened_clay", "black", 159, 15),
    LEAVES2_ACACIA("leaves2", "acacia", 161, 0),
    LEAVES2_BIG_OAK("leaves2", "big_oak", 161, 1),
    LOG2_ACACIA("log2", "acacia", 162, 0),
    LOG2_BIG_OAK("log2", "big_oak", 162, 1),
    ACACIA_STAIRS("acacia_stairs", 163),
    DARK_OAK_STAIRS("dark_oak_stairs", 164),
    SLIME("slime", 165),
    IRON_TRAPDOOR("iron_trapdoor", 167),
    PRISMARINE_ROUGH("prismarine", "rough", 168, 0),
    PRISMARINE_DARK("prismarine", "dark", 168, 1),
    PRISMARINE_BRICKS("prismarine", "bricks", 168, 2),
    SEALANTERN("seaLantern", 169),
    HAY_BLOCK("hay_block", 170),
    CARPET("carpet", 171),
    CARPET_WHITE("carpet", "white", 171, 0),
    CARPET_ORANGE("carpet", "orange", 171, 1),
    CARPET_MAGENTA("carpet", "magenta", 171, 2),
    CARPET_LIGHTBLUE("carpet", "lightBlue", 171, 3),
    CARPET_YELLOW("carpet", "yellow", 171, 4),
    CARPET_LIME("carpet", "lime", 171, 5),
    CARPET_PINK("carpet", "pink", 171, 6),
    CARPET_GRAY("carpet", "gray", 171, 7),
    CARPET_SILVER("carpet", "silver", 171, 8),
    CARPET_CYAN("carpet", "cyan", 171, 9),
    CARPET_PURPLE("carpet", "purple", 171, 10),
    CARPET_BLUE("carpet", "blue", 171, 11),
    CARPET_BROWN("carpet", "brown", 171, 12),
    CARPET_GREEN("carpet", "green", 171, 13),
    CARPET_RED("carpet", "red", 171, 14),
    CARPET_BLACK("carpet", "black", 171, 15),
    HARDENED_CLAY("hardened_clay", 172),
    COAL_BLOCK("coal_block", 173),
    PACKED_ICE("packed_ice", 174),
    DOUBLE_PLANT_SUNFLOWER("double_plant", "sunflower", 175, 0),
    DOUBLE_PLANT_SYRINGA("double_plant", "syringa", 175, 1),
    DOUBLE_PLANT_GRASS("double_plant", "grass", 175, 2),
    DOUBLE_PLANT_FERN("double_plant", "fern", 175, 3),
    DOUBLE_PLANT_ROSE("double_plant", "rose", 175, 4),
    DOUBLE_PLANT_PAEONIA("double_plant", "paeonia", 175, 5),
    RED_SANDSTONE("red_sandstone", 179),
    RED_SANDSTONE_CHISELED("red_sandstone", "chiseled", 179, 1),
    RED_SANDSTONE_SMOOTH("red_sandstone", "smooth", 179, 2),
    RED_SANDSTONE_STAIRS("red_sandstone_stairs", 180),
    DOUBLE_STONE_SLAB2_RED_SANDSTONE("double_stone_slab2", "red_sandstone", 181, 0),
    DOUBLE_STONE_SLAB2_PURPUR("double_stone_slab2", "purpur", 181, 1),
    STONE_SLAB2_RED_SANDSTONE("stone_slab2", "red_sandstone", 182, 0),
    STONE_SLAB2_PURPUR("stone_slab2", "purpur", 182, 1),
    SPRUCE_FENCE_GATE("spruce_fence_gate", 183),
    BIRCH_FENCE_GATE("birch_fence_gate", 184),
    JUNGLE_FENCE_GATE("jungle_fence_gate", 185),
    DARK_OAK_FENCE_GATE("dark_oak_fence_gate", 186),
    ACACIA_FENCE_GATE("acacia_fence_gate", 187),
    REPEATING_COMMAND_BLOCK("repeating_command_block", 188),
    CHAIN_COMMAND_BLOCK("chain_command_block", 189),
    GRASS_PATH("grass_path", 198),
    CHORUS_FLOWER("chorus_flower", 200),
    PURPUR_BLOCK("purpur_block", 201),
    PURPUR_BLOCK_CHISELED("purpur_block", "chiseled", 201, 1),
    PURPUR_BLOCK_LINES("purpur_block", "lines", 201, 2),
    PURPUR_STAIRS("purpur_stairs", 203),
    END_BRICKS("end_bricks", 206),
    END_ROD("end_rod", 208),
    ALLOW("allow", 210),
    DENY("deny", 211),
    BORDER_BLOCK("border_block", 212),
    CHORUS_PLANT("chorus_plant", 240),
    PODZOL("podzol", 243),
    STONECUTTER("stonecutter", 245),
    OBSERVER("observer", 251),
    
    // Items

    IRON_SHOVEL("iron_shovel", 256),
    IRON_PICKAXE("iron_pickaxe", 257),
    IRON_AXE("iron_axe", 258),
    FLINT_AND_STEEL("flint_and_steel", 259),
    APPLE("apple", 260),
    BOW("bow", 261),
    ARROW("arrow", 262),
    COAL("coal", 263),
    COAL_CHARCOAL("coal", "charcoal", 263, 1),
    DIAMOND("diamond", 264),
    IRON_INGOT("iron_ingot", 265),
    GOLD_INGOT("gold_ingot", 266),
    IRON_SWORD("iron_sword", 267),
    WOODEN_SWORD("wooden_sword", 268),
    WOODEN_SHOVEL("wooden_shovel", 269),
    WOODEN_PICKAXE("wooden_pickaxe", 270),
    WOODEN_AXE("wooden_axe", 271),
    STONE_SWORD("stone_sword", 272),
    STONE_SHOVEL("stone_shovel", 273),
    STONE_PICKAXE("stone_pickaxe", 274),
    STONE_AXE("stone_axe", 275),
    DIAMOND_SWORD("diamond_sword", 276),
    DIAMOND_SHOVEL("diamond_shovel", 277),
    DIAMOND_PICKAXE("diamond_pickaxe", 278),
    DIAMOND_AXE("diamond_axe", 279),
    STICK("stick", 280),
    BOWL("bowl", 281),
    MUSHROOM_STEW("mushroom_stew", 282),
    GOLDEN_SWORD("golden_sword", 283),
    GOLDEN_SHOVEL("golden_shovel", 284),
    GOLDEN_PICKAXE("golden_pickaxe", 285),
    GOLDEN_AXE("golden_axe", 286),
    STRING("string", 287),
    FEATHER("feather", 288),
    GUNPOWDER("gunpowder", 289),
    WOODEN_HOE("wooden_hoe", 290),
    STONE_HOE("stone_hoe", 291),
    IRON_HOE("iron_hoe", 292),
    DIAMOND_HOE("diamond_hoe", 293),
    GOLDEN_HOE("golden_hoe", 294),
    WHEAT_SEEDS("wheat_seeds", 295),
    WHEAT("wheat", 296),
    BREAD("bread", 297),
    LEATHER_HELMET("leather_helmet", 298),
    LEATHER_CHESTPLATE("leather_chestplate", 299),
    LEATHER_LEGGINGS("leather_leggings", 300),
    LEATHER_BOOTS("leather_boots", 301),
    CHAINMAIL_HELMET("chainmail_helmet", 302),
    CHAINMAIL_CHESTPLATE("chainmail_chestplate", 303),
    CHAINMAIL_LEGGINGS("chainmail_leggings", 304),
    CHAINMAIL_BOOTS("chainmail_boots", 305),
    IRON_HELMET("iron_helmet", 306),
    IRON_CHESTPLATE("iron_chestplate", 307),
    IRON_LEGGINGS("iron_leggings", 308),
    IRON_BOOTS("iron_boots", 309),
    DIAMOND_HELMET("diamond_helmet", 310),
    DIAMOND_CHESTPLATE("diamond_chestplate", 311),
    DIAMOND_LEGGINGS("diamond_leggings", 312),
    DIAMOND_BOOTS("diamond_boots", 313),
    GOLDEN_HELMET("golden_helmet", 314),
    GOLDEN_CHESTPLATE("golden_chestplate", 315),
    GOLDEN_LEGGINGS("golden_leggings", 316),
    GOLDEN_BOOTS("golden_boots", 317),
    FLINT("flint", 318),
    PORKCHOP("porkchop", 319),
    COOKED_PORKCHOP("cooked_porkchop", 320),
    PAINTING("painting", 321),
    GOLDEN_APPLE("golden_apple", 322),
    SIGN("sign", 323),
    WOODEN_DOOR("wooden_door", 324),
    BUCKET_EMPTY("bucket", "empty", 325, 0),
    BUCKET_MILK("bucket", "milk", 325, 1),
    BUCKET_BUCKET_WATER("bucket", "bucketWater", 325, 8),
    BUCKET_BUCKET_LAVA("bucket", "bucketLava", 325, 10),
    MINECART("minecart", 328),
    SADDLE("saddle", 329),
    IRON_DOOR("iron_door", 330),
    REDSTONE("redstone", 331),
    SNOWBALL("snowball", 332),
    BOAT_OAK("boat", "oak", 333, 0),
    BOAT_SPRUCE("boat", "spruce", 333, 1),
    BOAT_BIRCH("boat", "birch", 333, 2),
    BOAT_JUNGLE("boat", "jungle", 333, 3),
    BOAT_ACACIA("boat", "acacia", 333, 4),
    BOAT_BIG_OAK("boat", "big_oak", 333, 5),
    LEATHER("leather", 334),
    BRICK("brick", 336),
    CLAY_BALL("clay_ball", 337),
    REEDS("reeds", 338),
    PAPER("paper", 339),
    BOOK("book", 340),
    SLIME_BALL("slime_ball", 341),
    CHEST_MINECART("chest_minecart", 342),
    EGG("egg", 344),
    COMPASS("compass", 345),
    FISHING_ROD("fishing_rod", 346),
    CLOCK("clock", 347),
    GLOWSTONE_DUST("glowstone_dust", 348),
    FISH("fish", 349),
    COOKED_FISH("cooked_fish", 350),
    DYE_BLACK("dye", "black", 351, 0),
    DYE_RED("dye", "red", 351, 1),
    DYE_GREEN("dye", "green", 351, 2),
    DYE_BROWN("dye", "brown", 351, 3),
    DYE_BLUE("dye", "blue", 351, 4),
    DYE_PURPLE("dye", "purple", 351, 5),
    DYE_CYAN("dye", "cyan", 351, 6),
    DYE_SILVER("dye", "silver", 351, 7),
    DYE_GRAY("dye", "gray", 351, 8),
    DYE_PINK("dye", "pink", 351, 9),
    DYE_LIME("dye", "lime", 351, 10),
    DYE_YELLOW("dye", "yellow", 351, 11),
    DYE_LIGHT_BLUE("dye", "lightBlue", 351, 12),
    DYE_MAGENTA("dye", "magenta", 351, 13),
    DYE_ORANGE("dye", "orange", 351, 14),
    DYE_WHITE("dye", "white", 351, 15),
    BONE("bone", 352),
    SUGAR("sugar", 353),
    CAKE("cake", 354),
    BED("bed", 355),
    REPEATER("repeater", 356),
    COOKIE("cookie", 357),
    MAP_FILLED("map_filled", 358),
    SHEARS("shears", 359),
    MELON("melon", 360),
    PUMPKIN_SEEDS("pumpkin_seeds", 361),
    MELON_SEEDS("melon_seeds", 362),
    BEEF("beef", 363),
    COOKED_BEEF("cooked_beef", 364),
    CHICKEN("chicken", 365),
    COOKED_CHICKEN("cooked_chicken", 366),
    ROTTEN_FLESH("rotten_flesh", 367),
    ENDER_PEARL("ender_pearl", 368),
    BLAZE_ROD("blaze_rod", 369),
    GHAST_TEAR("ghast_tear", 370),
    GOLD_NUGGET("gold_nugget", 371),
    NETHER_WART("nether_wart", 372),
    POTION("potion", 373),
    GLASS_BOTTLE("glass_bottle", 374),
    SPIDER_EYE("spider_eye", 375),
    FERMENTED_SPIDER_EYE("fermented_spider_eye", 376),
    BLAZE_POWDER("blaze_powder", 377),
    MAGMA_CREAM("magma_cream", 378),
    BREWING_STAND("brewing_stand", 379),
    CAULDRON("cauldron", 380),
    ENDER_EYE("ender_eye", 381),
    SPECKLED_MELON("speckled_melon", 382),
    SPAWN_EGG("spawn_egg", 383),
    EXPERIENCE_BOTTLE("experience_bottle", 384),
    FIREBALL("fireball", 385),
    EMERALD("emerald", 388),
    FRAME("frame", 389),
    FLOWER_POT("flower_pot", 390),
    CARROT("carrot", 391),
    POTATO("potato", 392),
    BAKED_POTATO("baked_potato", 393),
    POISONOUS_POTATO("poisonous_potato", 394),
    EMPTY_MAP("emptyMap", 395),
    GOLDEN_CARROT("golden_carrot", 396),
    SKULL_SKELETON("skull", "skeleton", 397, 0),
    SKULL_WITHER("skull", "wither", 397, 1),
    SKULL_ZOMBIE("skull", "zombie", 397, 2),
    SKULL_PLAYER("skull", "player", 397, 3),
    SKULL_CREEPER("skull", "creeper", 397, 4),
    SKULL_DRAGON("skull", "dragon", 397, 5),
    CARROT_ON_A_STICK("carrotOnAStick", 398),
    NETHER_STAR("netherStar", 399),
    PUMPKIN_PIE("pumpkin_pie", 400),
    ENCHANTED_BOOK("enchanted_book", 403),
    COMPARATOR("comparator", 404),
    NETHERBRICK("netherbrick", 405),
    QUARTZ("quartz", 406),
    TNT_MINECART("tnt_minecart", 407),
    HOPPER_MINECART("hopper_minecart", 408),
    PRISMARINE_SHARD("prismarine_shard", 409),
    HOPPER("hopper", 410),
    RABBIT("rabbit", 411),
    COOKED_RABBIT("cooked_rabbit", 412),
    RABBIT_STEW("rabbit_stew", 413),
    RABBIT_FOOT("rabbit_foot", 414),
    RABBIT_HIDE("rabbit_hide", 415),
    HORSE_ARMOR_LEATHER("horsearmorleather", 416),
    HORSE_ARMOR_IRON("horsearmoriron", 417),
    HORSE_ARMOR_GOLD("horsearmorgold", 418),
    HORSE_ARMOR_DIAMOND("horsearmordiamond", 419),
    LEAD("lead", 420),
    NAME_TAG("nameTag", 421),
    PRISMARINE_CRYSTALS("prismarine_crystals", 422),
    MUTTON_RAW("muttonRaw", 423),
    MUTTON_COOKED("muttonCooked", 424),
    END_CRYSTAL("end_crystal", 426),
    SPRUCE_DOOR("spruce_door", 427),
    BIRCH_DOOR("birch_door", 428),
    JUNGLE_DOOR("jungle_door", 429),
    ACACIA_DOOR("acacia_door", 430),
    DARK_OAK_DOOR("dark_oak_door", 431),
    CHORUS_FRUIT("chorus_fruit", 432),
    CHORUS_FRUIT_POPPED("chorus_fruit_popped", 433),
    DRAGON_BREATH("dragon_breath", 437),
    SPLASH_POTION("splash_potion", 438),
    LINGERING_POTION("lingering_potion", 441),
    COMMAND_BLOCK_MINECART("command_block_minecart", 443),
    ELYTRA("elytra", 444),
    SHULKER_SHELL("shulker_shell", 445),
    BOARD_ONE_BY_ONE("board", "oneByOne", 454, 0),
    BOARD_TWO_BY_ONE("board", "twoByOne", 454, 1),
    BOARD_THREE_BY_TWO("board", "threeByTwo", 454, 2),
    PORTFOLIO("portfolio", 456),
    BEETROOT("beetroot", 457),
    BEETROOT_SEEDS("beetroot_seeds", 458),
    BEETROOT_SOUP("beetroot_soup", 459),
    SALMON("salmon", 460),
    CLOWNFISH("clownfish", 461),
    PUFFERFISH("pufferfish", 462),
    COOKED_SALMON("cooked_salmon", 463),
    APPLE_ENCHANTED("appleEnchanted", 466),
    CAMERA("camera", 498);

    private String name;
    private String subName;
    private int id;
    private int data;

    private static HashMap<String, HashMap<Integer, ItemType>> fromName;
    private static HashMap<Integer, HashMap<Integer, ItemType>> fromId;

    static {
        fromName = new HashMap<>();
        fromId = new HashMap<>();

        for (ItemType item : values()) {
            HashMap<Integer, ItemType> itemMap = fromName.get(item.getName());

            if (itemMap == null) {
                itemMap = new HashMap<>();
                fromName.put(item.getName(), itemMap);
                fromId.put(item.getId(), itemMap);
            }

            itemMap.put(item.getData(), item);
        }
    }

    ItemType(String name, int id) {
        this.name = name;
        this.id = id;
        subName = "default";
        data = 0;
    }

    ItemType(String baseName, String subName, int id, int data) {
        name = baseName;
        this.subName = subName;
        this.id = id;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getSubName() {
        return subName;
    }

    public int getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public static ItemType fromString(String name) {
        return fromName.get(name).get(0);
    }

    public static ItemType fromString(String name, int data) {
        return fromName.get(name).get(data);
    }

    public static ItemType fromId(int id) {
        return fromId.get(id).get(0);
    }

    public static ItemType fromId(int id, int data) {
        return fromId.get(id).get(data);
    }
}
