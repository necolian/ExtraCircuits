package com.necolian.extracircuits.datagen.model;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.item.ExtraCircuitsItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExtraCircuitsItemModelProvider extends ItemModelProvider {
    public ExtraCircuitsItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExtraCircuits.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ExtraCircuitsItems.basis.get());
        basicItem(ExtraCircuitsItems.assembled_basis.get());
        basicItem(ExtraCircuitsItems.universal_connector.get());

        //condenser
        basicItem(ExtraCircuitsItems.condenser_tier1.get());
        basicItem(ExtraCircuitsItems.condenser_tier2.get());
        basicItem(ExtraCircuitsItems.condenser_tier3.get());
        basicItem(ExtraCircuitsItems.condenser_tier4.get());
        basicItem(ExtraCircuitsItems.condenser_tier5.get());

        //resistor
        basicItem(ExtraCircuitsItems.resistor_tier1.get());
        basicItem(ExtraCircuitsItems.resistor_tier2.get());
        basicItem(ExtraCircuitsItems.resistor_tier3.get());
        basicItem(ExtraCircuitsItems.resistor_tier4.get());
        basicItem(ExtraCircuitsItems.resistor_tier5.get());

        //robot_arm
        basicItem(ExtraCircuitsItems.robot_arm_tier1.get());
        basicItem(ExtraCircuitsItems.robot_arm_tier2.get());
        basicItem(ExtraCircuitsItems.robot_arm_tier3.get());
        basicItem(ExtraCircuitsItems.robot_arm_tier4.get());
        basicItem(ExtraCircuitsItems.robot_arm_tier5.get());

        //transistor
        basicItem(ExtraCircuitsItems.transistor_tier1.get());
        basicItem(ExtraCircuitsItems.transistor_tier2.get());
        basicItem(ExtraCircuitsItems.transistor_tier3.get());
        basicItem(ExtraCircuitsItems.transistor_tier4.get());
        basicItem(ExtraCircuitsItems.transistor_tier5.get());

        //uec
        basicItem(ExtraCircuitsItems.uec_tier1.get());
        basicItem(ExtraCircuitsItems.uec_tier2.get());
        basicItem(ExtraCircuitsItems.uec_tier3.get());
        basicItem(ExtraCircuitsItems.uec_tier4.get());
        basicItem(ExtraCircuitsItems.uec_tier5.get());

        //universal ic
        basicItem(ExtraCircuitsItems.universal_ic_tier1.get());
        basicItem(ExtraCircuitsItems.universal_ic_tier2.get());
        basicItem(ExtraCircuitsItems.universal_ic_tier3.get());
        basicItem(ExtraCircuitsItems.universal_ic_tier4.get());
        basicItem(ExtraCircuitsItems.universal_ic_tier5.get());

        //universal sensor
        basicItem(ExtraCircuitsItems.universal_sensor_tier1.get());
        basicItem(ExtraCircuitsItems.universal_sensor_tier2.get());
        basicItem(ExtraCircuitsItems.universal_sensor_tier3.get());
        basicItem(ExtraCircuitsItems.universal_sensor_tier4.get());
        basicItem(ExtraCircuitsItems.universal_sensor_tier5.get());

    }
}
