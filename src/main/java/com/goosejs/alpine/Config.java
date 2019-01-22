package com.goosejs.alpine;

import net.minecraftforge.common.config.Configuration;

public class Config
{

    public static void readConfig()
    {
        Configuration cfg = AlpineProxy.config;
        try
        {
            cfg.load();
            // cfg.addCustomCategoryComment("category", "description");
            // cfg.getBoolean("value", "category", defaultValue, "description");
        }
        catch (Exception e)
        {
            // TODO: Log this?
        }
        finally
        {
            if (cfg.hasChanged())
                cfg.save();
        }
    }

}