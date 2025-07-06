package com.necolian.extracircuits.block.machine.pam;

import com.necolian.extracircuits.block.machine.ExtraCircuitsBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PAM extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    private final int tier;
    public PAM(int tier) {
        super(BlockBehaviour.Properties.of()
                .requiresCorrectToolForDrops()
                .strength(2.0f));
        registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));

        this.tier = tier;
    }

    @Override
    public @NotNull RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return type == ExtraCircuitsBlockEntityTypes.precision_assembling_machine.get()
                ? (lvl, pos, st, be) -> PAMBlockEntity.tick(lvl, pos, st, (PAMBlockEntity) be)
                : null;
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean bool) {
        BlockEntity be = world.getBlockEntity(pos);
        PAMBlockEntity PAMBE = (PAMBlockEntity) be;
        super.onRemove(state, world, pos, newState, bool);
        Containers.dropContents(world, pos, PAMBE);
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        BlockEntity be = world.getBlockEntity(pos);
        PAMBlockEntity PAMBE = (PAMBlockEntity) be;

        if (!player.isSteppingCarefully() && !world.isClientSide) {
            MenuProvider provider = this.getMenuProvider(state, world, pos);
            player.openMenu(provider);
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PAMBlockEntity(pos, state, tier);
    }
}