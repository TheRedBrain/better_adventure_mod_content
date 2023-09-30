package com.github.theredbrain.bamcontent.registry;

public class EntityRegistry {

//    public static final EntityType<CentaurMountEntity> CENTAUR_MOUNT = Registry.register(Registries.ENTITY_TYPE,
//            RPGMod.identifier("centaur_mount"), FabricEntityTypeBuilder.create(SpawnGroup.MISC, CentaurMountEntity::new)
//                    .dimensions(EntityDimensions.fixed(1/*1.3964844f*/, 1.6f)).build());

    public static void init() {
        registerEntityAttributes();
    }

    private static void registerEntityAttributes() {
//        FabricDefaultAttributeRegistry.register(CENTAUR_MOUNT, MountEntity.createMountAttributes());
    }
}
