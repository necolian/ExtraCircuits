package com.necolian.extracircuits.block.gui.screen;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.block.gui.container.PAMMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class PAMBlockScreen extends AbstractContainerScreen<PAMMenu> {

    private static final ResourceLocation precision_assembling_machine_texture = new ResourceLocation(ExtraCircuits.MODID,"textures/gui/container/precision_assembling_machine.png");

    private final PAMMenu menu;
    @Override
    protected void renderLabels(GuiGraphics graphics, int w, int h) {
        graphics.drawString(this.font, this.title, this.titleLabelX, this.titleLabelY, 0x000000, false);
        graphics.drawString(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY, 0x000000, false);
    }

    private final Component title;

    public PAMBlockScreen(PAMMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
        this.titleLabelX = 8;
        this.titleLabelY = 8;
        this.inventoryLabelX = 8;
        this.inventoryLabelY = 71;
        this.menu = menu;
        this.title = Component.translatable("container." + ExtraCircuits.MODID + ".precision_assembling_machine_tier" + menu.getTier());
    }

    @Override
    public void render(GuiGraphics graphics, int w, int h, float f) {
        super.render(graphics, w, h, f);
        int setW = (this.width - this.imageWidth) / 2;
        int setH = (this.height - this.imageHeight) / 2;
        graphics.drawString(this.font,"Energy:", setW + 105, setH + 73, 0x000000, false);
    }

    @Override
    protected void renderBg(GuiGraphics graphics, float f, int w, int h) {
        int setW = (this.width - this.imageWidth) / 2;
        int setH = (this.height - this.imageHeight) / 2;
        graphics.blit(precision_assembling_machine_texture, setW, setH, 0, 0, this.imageWidth, this.imageHeight);
    }


}
