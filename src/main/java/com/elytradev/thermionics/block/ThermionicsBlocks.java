/**
 * MIT License
 *
 * Copyright (c) 2017 Isaac Ellingson (Falkreon) and contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.elytradev.thermionics.block;

import com.elytradev.thermionics.Thermionics;
import com.elytradev.thermionics.tileentity.TileEntityBattery;
import com.elytradev.thermionics.tileentity.TileEntityBatteryCreative;
import com.elytradev.thermionics.tileentity.TileEntityCableHeat;
import com.elytradev.thermionics.tileentity.TileEntityCableRF;
import com.elytradev.thermionics.tileentity.TileEntityConvectionMotor;
import com.elytradev.thermionics.tileentity.TileEntityDrum;
import com.elytradev.thermionics.tileentity.TileEntityFirebox;
import com.elytradev.thermionics.tileentity.TileEntityHammerMill;
import com.elytradev.thermionics.tileentity.TileEntityOven;
import com.elytradev.thermionics.tileentity.TileEntitySerger;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ThermionicsBlocks {
	//Cabling
	public static BlockCableRF         CABLE_RF;
	public static BlockHeatPipe        CABLE_HEAT;
	
	//Fluid Storage
	public static BlockDrum            DRUM;
	
	//Heatmachines
	public static BlockFirebox         FIREBOX;
	public static BlockOven            OVEN;
	
	//Motors
	public static BlockConvectionMotor MOTOR_CONVECTION;
	
	//Gears & Meshing
	public static BlockGearbox         GEARBOX;
	public static BlockAxle            AXLE_WOOD;
	public static BlockAxle            AXLE_IRON;
	
	//Rotarymachines
	public static BlockHammerMill      HAMMER_MILL;
	public static BlockSerger          SERGER;
	
	//RFmachines
	public static BlockBattery         BATTERY_LEAD;
	public static BlockBatteryCreative BATTERY_CREATIVE;
	
	//Explosives
	public static BlockTNTCreative     TNT_CREATIVE;
	
	//Randoms
	public static BlockScaffold        SCAFFOLD_BASIC;
	public static BlockRoad            ROAD;
	public static BlockRoad            ROAD_COMPRESSED;
	
	
	@SubscribeEvent
	public static void onRegister(RegistryEvent.Register<Block> event) {
		//Thermionics.LOG.info("Registering blocks");
		IForgeRegistry<Block> r = event.getRegistry();
		
		//Cabling
		ThermionicsBlocks.CABLE_RF         = block(r, new BlockCableRF("rf"));
		ThermionicsBlocks.CABLE_HEAT       = block(r, new BlockHeatPipe());
		
		//Fluid Storage
		ThermionicsBlocks.DRUM             = block(r, new BlockDrum());
		
		//Heatmachines
		ThermionicsBlocks.FIREBOX          = block(r, new BlockFirebox());
		ThermionicsBlocks.OVEN             = block(r, new BlockOven());
		
		//Motors
		ThermionicsBlocks.MOTOR_CONVECTION = block(r, new BlockConvectionMotor());
		
		//Gears & Meshing
		ThermionicsBlocks.GEARBOX          = block(r, new BlockGearbox());
		ThermionicsBlocks.AXLE_WOOD        = block(r, new BlockAxle(Material.WOOD, "wood")).withHardness(1.0f).withHarvestLevel("axe", 0);
		ThermionicsBlocks.AXLE_IRON        = block(r, new BlockAxle(Material.IRON, "iron"));
		
		//Rotarymachines
		ThermionicsBlocks.HAMMER_MILL      = block(r, new BlockHammerMill());
		ThermionicsBlocks.SERGER           = block(r, new BlockSerger());
		
		//RFmachines
		ThermionicsBlocks.BATTERY_LEAD     = block(r, new BlockBattery("lead"));
		ThermionicsBlocks.BATTERY_CREATIVE = block(r, new BlockBatteryCreative());
		
		//Explosives
		ThermionicsBlocks.TNT_CREATIVE     = block(r, new BlockTNTCreative());
		
		//Randoms
		ThermionicsBlocks.SCAFFOLD_BASIC   = block(r, new BlockScaffold("basic"));
		ThermionicsBlocks.ROAD             = block(r, new BlockRoad(0));
		ThermionicsBlocks.ROAD_COMPRESSED  = block(r, new BlockRoad(1));

		//TODO: Fix battery item registration
		//registerBlockAndItem(leadBattery, new ItemBlockBattery(leadBattery));
		//registerBlockAndItem(creativeBattery, new ItemBlockBattery(creativeBattery));
			
		//registerBlock(new BlockMotorBase("redstone"));
		
		
		
		GameRegistry.registerTileEntity(TileEntityCableRF.class,         "thermionics:cable");
		GameRegistry.registerTileEntity(TileEntityBattery.class,         "thermionics:battery.lead");
		GameRegistry.registerTileEntity(TileEntityBatteryCreative.class, "thermionics:battery.creative");
		GameRegistry.registerTileEntity(TileEntityDrum.class,            "thermionics:drum");
		GameRegistry.registerTileEntity(TileEntityFirebox.class,         "thermionics:machine.firebox");
		GameRegistry.registerTileEntity(TileEntityOven.class,            "thermionics:machine.oven");
		GameRegistry.registerTileEntity(TileEntityCableHeat.class,       "thermionics:cable.heat");
		GameRegistry.registerTileEntity(TileEntityConvectionMotor.class, "thermionics:machine.convectionmotor");
		GameRegistry.registerTileEntity(TileEntityHammerMill.class,      "thermionics:machine.hammermill");
		GameRegistry.registerTileEntity(TileEntitySerger.class,          "thermionics:machine.serger");
		//GameRegistry.registerTileEntity(TileEntityCableSignal.class, "thermionics:cable.signal");
	}
	
	public static <T extends Block> T block(IForgeRegistry<Block> registry, T t) {
		registry.register(t);
		Thermionics.instance().needItemRegistration.add(t);
		return t;
	}
}
