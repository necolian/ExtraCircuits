package com.necolian.extracircuits.datagen.language;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.item.ExtraCircuitsItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, ExtraCircuits.MODID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(ExtraCircuitsItems.BASIS, "Basis");

        // ** 部品 **
        //condenser
        addItem(ExtraCircuitsItems.condenser_tier1,"Tier1 Condenser");
        addItem(ExtraCircuitsItems.condenser_tier2,"Tier2 Condenser");
        addItem(ExtraCircuitsItems.condenser_tier3,"Tier3 Condenser");
        addItem(ExtraCircuitsItems.condenser_tier4,"Tier4 Condenser");
        addItem(ExtraCircuitsItems.condenser_tier5,"Tier5 Condenser");

        //resistor
        addItem(ExtraCircuitsItems.resistor_tier1,"Tier1 Resistor");
        addItem(ExtraCircuitsItems.resistor_tier2,"Tier2 Resistor");
        addItem(ExtraCircuitsItems.resistor_tier3,"Tier3 Resistor");
        addItem(ExtraCircuitsItems.resistor_tier4,"Tier4 Resistor");
        addItem(ExtraCircuitsItems.resistor_tier5,"Tier5 Resistor");

        //robot arm
        addItem(ExtraCircuitsItems.robot_arm_tier1,"Tier1 Robot Arm");
        addItem(ExtraCircuitsItems.robot_arm_tier2,"Tier2 Robot Arm");
        addItem(ExtraCircuitsItems.robot_arm_tier3,"Tier3 Robot Arm");
        addItem(ExtraCircuitsItems.robot_arm_tier4,"Tier4 Robot Arm");
        addItem(ExtraCircuitsItems.robot_arm_tier5,"Tier5 Robot Arm");

        //transistor
        addItem(ExtraCircuitsItems.transistor_tier1,"Tier1 Transistor");
        addItem(ExtraCircuitsItems.transistor_tier2,"Tier2 Transistor");
        addItem(ExtraCircuitsItems.transistor_tier3,"Tier3 Transistor");
        addItem(ExtraCircuitsItems.transistor_tier4,"Tier4 Transistor");
        addItem(ExtraCircuitsItems.transistor_tier5,"Tier5 Transistor");

        //uec
        addItem(ExtraCircuitsItems.uec_tier1,"Tier1 Universal Electronic Component");
        addItem(ExtraCircuitsItems.uec_tier2,"Tier2 Universal Electronic Component");
        addItem(ExtraCircuitsItems.uec_tier3,"Tier3 Universal Electronic Component");
        addItem(ExtraCircuitsItems.uec_tier4,"Tier4 Universal Electronic Component");
        addItem(ExtraCircuitsItems.uec_tier5,"Tier5 Universal Electronic Component");

        //universal_ic
        addItem(ExtraCircuitsItems.universal_ic_tier1,"Tier1 Universal IC");
        addItem(ExtraCircuitsItems.universal_ic_tier2,"Tier2 Universal IC");
        addItem(ExtraCircuitsItems.universal_ic_tier3,"Tier3 Universal IC");
        addItem(ExtraCircuitsItems.universal_ic_tier4,"Tier4 Universal IC");
        addItem(ExtraCircuitsItems.universal_ic_tier5,"Tier5 Universal IC");

        //universal_sensor
        addItem(ExtraCircuitsItems.universal_sensor_tier1,"Tier1 Universal Sensor");
        addItem(ExtraCircuitsItems.universal_sensor_tier2,"Tier2 Universal Sensor");
        addItem(ExtraCircuitsItems.universal_sensor_tier3,"Tier3 Universal Sensor");
        addItem(ExtraCircuitsItems.universal_sensor_tier4,"Tier4 Universal Sensor");
        addItem(ExtraCircuitsItems.universal_sensor_tier5,"Tier5 Universal Sensor");
    }
}
