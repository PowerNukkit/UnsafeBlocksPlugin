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

import cn.nukkit.block.Block;
import cn.nukkit.plugin.PluginBase;

/**
 * @author joserobjr
 * @since 1.0.0
 */
public class UnsafeBlocksPlugin extends PluginBase {
    @Override
    public void onEnable() {
        getLogger().warning("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        getLogger().warning("!!! ATTENTION SERVER OWNER !!!");
        getLogger().warning("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        getLogger().warning("The UnsafeBlockPlugins adds blocks that are not expected to be in game");
        getLogger().warning("these blocks can be replaced by Mojang at any time, the usage of this");
        getLogger().warning("plugin is discouraged but if you really want it, it's here for you.");
        
        saveDefaultConfig();
        boolean reserved6 = getConfig().getBoolean("enable.reserved6");
        boolean infoUpdate = getConfig().getBoolean("enable.info_update");
        boolean info_update2 = getConfig().getBoolean("enable.info_update2");
        if (!reserved6 && !infoUpdate && !info_update2) {
            getLogger().warning("---------------------------------------------------");
            getLogger().warning("No unsafe block was enabled in the config file, the plugin will be disabled.");
            getLogger().warning("You must enable the unsafe blocks you need in the UnsafeBlocks configuration file.");
            getLogger().warning("---------------------------------------------------");
            getPluginLoader().disablePlugin(this);
            return;
        }
        
        if (reserved6) {
            registerReserved6();
        }
        
        if (infoUpdate) {
            registerInfoUpdate();
        }

        if (infoUpdate) {
            registerInfoUpdate2();
        }
    }
    
    private void registerReserved6() {
        getLogger().warning("Registering minecraft:reserved6");
        Block.registerBlockImplementation(UnsafeBlockIDs.RESERVED6, UnsafeBlockReserved6.class, "minecraft:reserved6", false);
    }
    
    private void registerInfoUpdate() {
        getLogger().warning("Registering minecraft:info_update");
        Block.registerBlockImplementation(UnsafeBlockIDs.INFO_UPDATE, UnsafeBlockInfoUpdate.class, "minecraft:info_update", false);
    }

    private void registerInfoUpdate2() {
        getLogger().warning("Registering minecraft:info_update2");
        Block.registerBlockImplementation(UnsafeBlockIDs.INFO_UPDATE2, UnsafeBlockInfoUpdate2.class, "minecraft:info_update2", false);
    }
}
