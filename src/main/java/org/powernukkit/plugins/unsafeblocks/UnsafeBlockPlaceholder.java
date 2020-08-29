/*
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <https://www.gnu.org/licenses/>
 */
package org.powernukkit.plugins.unsafeblocks;

import cn.nukkit.block.BlockSolid;
import cn.nukkit.utils.BlockColor;

/**
 * @author good777LUCKY, joserobjr
 * @since 1.0.0
 */
public abstract class UnsafeBlockPlaceholder extends BlockSolid implements UnsafeBlock  {
    @Override
    public int getId() {
        return RESERVED6;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.DIRT_BLOCK_COLOR;
    }

    @Override
    public double getHardness() {
        return 1;
    }

    @Override
    public double getResistance() {
        return 1;
    }

    @Override
    public int getToolType() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean canHarvestWithHand() {
        return true;
    }
}
