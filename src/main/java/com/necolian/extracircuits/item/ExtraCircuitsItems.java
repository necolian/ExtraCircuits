package com.necolian.extracircuits.item;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.block.ExtraCircuitsBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraCircuits.MODID);

    public static final RegistryObject<Item> basis = ITEMS.register("basis", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> assembled_basis = ITEMS.register("assembled_basis",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_connector = ITEMS.register("universal_connector",() -> new Item(new Item.Properties()));

    //condenser
    public static final RegistryObject<Item> condenser_tier1 = ITEMS.register("condenser_tier1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> condenser_tier2 = ITEMS.register("condenser_tier2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> condenser_tier3 = ITEMS.register("condenser_tier3", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> condenser_tier4 = ITEMS.register("condenser_tier4", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> condenser_tier5 = ITEMS.register("condenser_tier5", () -> new Item(new Item.Properties()));

    //resistor
    public static final RegistryObject<Item> resistor_tier1 = ITEMS.register("resistor_tier1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> resistor_tier2 = ITEMS.register("resistor_tier2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> resistor_tier3 = ITEMS.register("resistor_tier3", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> resistor_tier4 = ITEMS.register("resistor_tier4", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> resistor_tier5 = ITEMS.register("resistor_tier5", () -> new Item(new Item.Properties()));

    //robot_arm
    public static final RegistryObject<Item> robot_arm_tier1 = ITEMS.register("robot_arm_tier1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> robot_arm_tier2 = ITEMS.register("robot_arm_tier2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> robot_arm_tier3 = ITEMS.register("robot_arm_tier3", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> robot_arm_tier4 = ITEMS.register("robot_arm_tier4", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> robot_arm_tier5 = ITEMS.register("robot_arm_tier5", () -> new Item(new Item.Properties()));

    //transistor
    public static final RegistryObject<Item> transistor_tier1 = ITEMS.register("transistor_tier1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> transistor_tier2 = ITEMS.register("transistor_tier2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> transistor_tier3 = ITEMS.register("transistor_tier3", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> transistor_tier4 = ITEMS.register("transistor_tier4", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> transistor_tier5 = ITEMS.register("transistor_tier5", () -> new Item(new Item.Properties()));

    //universal_electronic_component (uec)
    public static final RegistryObject<Item> uec_tier1 = ITEMS.register("uec_tier1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> uec_tier2 = ITEMS.register("uec_tier2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> uec_tier3 = ITEMS.register("uec_tier3", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> uec_tier4 = ITEMS.register("uec_tier4", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> uec_tier5 = ITEMS.register("uec_tier5", () -> new Item(new Item.Properties()));

    //universal_ic
    public static final RegistryObject<Item> universal_ic_tier1 = ITEMS.register("universal_ic_tier1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_ic_tier2 = ITEMS.register("universal_ic_tier2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_ic_tier3 = ITEMS.register("universal_ic_tier3", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_ic_tier4 = ITEMS.register("universal_ic_tier4", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_ic_tier5 = ITEMS.register("universal_ic_tier5", () -> new Item(new Item.Properties()));

    //universal_sensor
    public static final RegistryObject<Item> universal_sensor_tier1 = ITEMS.register("universal_sensor_tier1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_sensor_tier2 = ITEMS.register("universal_sensor_tier2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_sensor_tier3 = ITEMS.register("universal_sensor_tier3", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_sensor_tier4 = ITEMS.register("universal_sensor_tier4", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> universal_sensor_tier5 = ITEMS.register("universal_sensor_tier5", () -> new Item(new Item.Properties()));

    //machine
    public static final RegistryObject<Item> precision_assembling_machine_tier1 = ITEMS.register("precision_assembling_machine_tier1", () -> new BlockItem(ExtraCircuitsBlocks.precision_assembling_machine_tier1.get(), new Item.Properties()));
    public static final RegistryObject<Item> precision_assembling_machine_tier2 = ITEMS.register("precision_assembling_machine_tier2", () -> new BlockItem(ExtraCircuitsBlocks.precision_assembling_machine_tier2.get(), new Item.Properties()));
    public static final RegistryObject<Item> precision_assembling_machine_tier3 = ITEMS.register("precision_assembling_machine_tier3", () -> new BlockItem(ExtraCircuitsBlocks.precision_assembling_machine_tier3.get(), new Item.Properties()));
    public static final RegistryObject<Item> precision_assembling_machine_tier4 = ITEMS.register("precision_assembling_machine_tier4", () -> new BlockItem(ExtraCircuitsBlocks.precision_assembling_machine_tier4.get(), new Item.Properties()));
    public static final RegistryObject<Item> precision_assembling_machine_tier5 = ITEMS.register("precision_assembling_machine_tier5", () -> new BlockItem(ExtraCircuitsBlocks.precision_assembling_machine_tier5.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

