package com.necolian.extracircuits.block.gui.container;

import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class PAMMenu extends AbstractContainerMenu {

    private final Container container;
    private int tier;

    public PAMMenu(int i, Inventory inventory, Container container) {
        super(ExtraCircuitsContainerTypes.precision_assembling_machine.get(),i);
        this.container = container;
        checkContainerSize(container, 7);
        container.startOpen(inventory.player);

        this.addSlot(new Slot(container, 0,33, 29)); //slot 0
        this.addSlot(new Slot(container, 1,51, 29)); //slot 1
        this.addSlot(new Slot(container, 2,69, 29)); //slot 2
        this.addSlot(new Slot(container, 3,33, 47)); //slot 3
        this.addSlot(new Slot(container, 4,51, 47)); //slot 4
        this.addSlot(new Slot(container, 5,69, 47)); //slot 5
        this.addSlot(new Slot(container, 6,126, 37)); //slot 6

        for(int k = 0; k < 3; ++k) {
            for(int i1 = 0; i1 < 9; ++i1) {
                this.addSlot(new Slot(inventory, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18));
            }
        }

        for(int l = 0; l < 9; ++l) {
            this.addSlot(new Slot(inventory, l, 8 + l * 18, 142));
        }
    }

    public PAMMenu(int i, Inventory inventory) {
        this(i, inventory, new SimpleContainer(7));
    }

    public PAMMenu(int i, Inventory inventory, Container container, int tier) {
        this(i, inventory, container);
        this.tier = tier;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int a) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(a);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (a < this.container.getContainerSize() * 9) {
                if (!this.moveItemStackTo(itemstack1, this.container.getContainerSize() * 9, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, this.container.getContainerSize() * 9, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemstack;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }

    public int getTier() {
        return tier;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.container.startOpen(player);
    }
}
