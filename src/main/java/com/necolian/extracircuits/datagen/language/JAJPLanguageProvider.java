package com.necolian.extracircuits.datagen.language;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.item.ExtraCircuitsItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, ExtraCircuits.MODID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(ExtraCircuitsItems.BASIS, "基盤");

        // ** 部品 **
        //コンデンサ
        addItem(ExtraCircuitsItems.condenser_tier1,"Tier1 コンデンサ");
        addItem(ExtraCircuitsItems.condenser_tier2,"Tier2 コンデンサ");
        addItem(ExtraCircuitsItems.condenser_tier3,"Tier3 コンデンサ");
        addItem(ExtraCircuitsItems.condenser_tier4,"Tier4 コンデンサ");
        addItem(ExtraCircuitsItems.condenser_tier5,"Tier5 コンデンサ");

        //resistor
        addItem(ExtraCircuitsItems.resistor_tier1,"Tier1 抵抗器");
        addItem(ExtraCircuitsItems.resistor_tier2,"Tier2 抵抗器");
        addItem(ExtraCircuitsItems.resistor_tier3,"Tier3 抵抗器");
        addItem(ExtraCircuitsItems.resistor_tier4,"Tier4 抵抗器");
        addItem(ExtraCircuitsItems.resistor_tier5,"Tier5 抵抗器");

        //robot arm
        addItem(ExtraCircuitsItems.robot_arm_tier1,"Tier1 ロボットアーム");
        addItem(ExtraCircuitsItems.robot_arm_tier2,"Tier2 ロボットアーム");
        addItem(ExtraCircuitsItems.robot_arm_tier3,"Tier3 ロボットアーム");
        addItem(ExtraCircuitsItems.robot_arm_tier4,"Tier4 ロボットアーム");
        addItem(ExtraCircuitsItems.robot_arm_tier5,"Tier5 ロボットアーム");
        
        //transistor
        addItem(ExtraCircuitsItems.transistor_tier1,"Tier1 トランジスタ");
        addItem(ExtraCircuitsItems.transistor_tier2,"Tier2 トランジスタ");
        addItem(ExtraCircuitsItems.transistor_tier3,"Tier3 トランジスタ");
        addItem(ExtraCircuitsItems.transistor_tier4,"Tier4 トランジスタ");
        addItem(ExtraCircuitsItems.transistor_tier5,"Tier5 トランジスタ");
        
        //uec
        addItem(ExtraCircuitsItems.uec_tier1,"Tier1 万能電子部品");
        addItem(ExtraCircuitsItems.uec_tier2,"Tier2 万能電子部品");
        addItem(ExtraCircuitsItems.uec_tier3,"Tier3 万能電子部品");
        addItem(ExtraCircuitsItems.uec_tier4,"Tier4 万能電子部品");
        addItem(ExtraCircuitsItems.uec_tier5,"Tier5 万能電子部品");
        
        //universal_ic
        addItem(ExtraCircuitsItems.universal_ic_tier1,"Tier1 万能IC");
        addItem(ExtraCircuitsItems.universal_ic_tier2,"Tier2 万能IC");
        addItem(ExtraCircuitsItems.universal_ic_tier3,"Tier3 万能IC");
        addItem(ExtraCircuitsItems.universal_ic_tier4,"Tier4 万能IC");
        addItem(ExtraCircuitsItems.universal_ic_tier5,"Tier5 万能IC");
        
        //universal_sensor
        addItem(ExtraCircuitsItems.universal_sensor_tier1,"Tier1 万能センサ");
        addItem(ExtraCircuitsItems.universal_sensor_tier2,"Tier2 万能センサ");
        addItem(ExtraCircuitsItems.universal_sensor_tier3,"Tier3 万能センサ");
        addItem(ExtraCircuitsItems.universal_sensor_tier4,"Tier4 万能センサ");
        addItem(ExtraCircuitsItems.universal_sensor_tier5,"Tier5 万能センサ");
    }
}
