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

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder("thermionics")
public class ThermionicsBlocks {
	@ObjectHolder("scaffold.basic")
	public static final BlockScaffold SCAFFOLD_BASIC = null;
	
	@ObjectHolder("cable.rf")
	public static final BlockCableRF CABLE_RF = null;
	
	@ObjectHolder("cable.heat")
	public static final BlockHeatPipe CABLE_HEAT = null;
	
	@ObjectHolder("drum")
	public static final BlockDrum DRUM = null;
	
	@ObjectHolder("machine.firebox")
	public static final BlockFirebox FIREBOX = null;
	
	@ObjectHolder("machine.oven")
	public static final BlockOven OVEN = null;
	
	@ObjectHolder("machine.convectionmotor")
	public static final BlockConvectionMotor MOTOR_CONVECTION = null;
	
	@ObjectHolder("machine.hammermill")
	public static final BlockHammerMill HAMMER_MILL = null;
	
	@ObjectHolder("machine.gearbox")
	public static final BlockGearbox GEARBOX = null;
	
	@ObjectHolder("machine.serger")
	public static final BlockSerger SERGER = null;
	
	@ObjectHolder("axle.wood")
	public static final BlockAxle AXLE_WOOD = null;
	
	@ObjectHolder("axle.iron")
	public static final BlockAxle AXLE_IRON = null;

	@ObjectHolder("battery.lead")
	public static final Block BATTERY_LEAD = null;
	
	@ObjectHolder("road")
	public static final BlockRoad ROAD = null;
	
	@ObjectHolder("road.1")
	public static final BlockRoad ROAD_COMPRESSED = null;
}
