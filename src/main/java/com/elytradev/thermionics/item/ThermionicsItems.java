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
package com.elytradev.thermionics.item;

import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder("thermionics")
public class ThermionicsItems {
	@ObjectHolder("hammer.iron")
	public static final ItemHammer HAMMER_IRON = null;
	@ObjectHolder("hammer.gold")
	public static final ItemHammer HAMMER_GOLD = null;
	@ObjectHolder("hammer.diamond")
	public static final ItemHammer HAMMER_DIAMOND = null;
	
	@ObjectHolder("hammer.copper")
	public static final ItemHammer HAMMER_COPPER = null;
	@ObjectHolder("hammer.lead")
	public static final ItemHammer HAMMER_LEAD = null;
	@ObjectHolder("hammer.invar")
	public static final ItemHammer HAMMER_INVAR = null;
	
	@ObjectHolder("allomanticpowder")
	public static final ItemSubtyped<EnumAllomanticPowder> ALLOMANTIC_POWDER = null;
	
	@ObjectHolder("bauble.cloak")
	public static final ItemMistcloak MISTCLOAK = null;
}
