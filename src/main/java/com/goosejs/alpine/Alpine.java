package com.goosejs.alpine;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AlpineConstants.MODID, name = AlpineConstants.MODNAME, version = AlpineConstants.MODVERSION, useMetadata = true)
public class Alpine
{

    @SidedProxy(clientSide = "com.goosejs.alpine.ClientProxy", serverSide = "com.goosejs.Alpine.AlpineProxy")
    public static AlpineProxy proxy;

    @Mod.Instance
    public static Alpine instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}