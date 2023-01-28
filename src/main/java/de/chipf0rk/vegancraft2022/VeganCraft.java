package de.chipf0rk.vegancraft2022;

import com.mojang.logging.LogUtils;
import de.chipf0rk.vegancraft2022.item.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(VeganCraft.MODID)
public class VeganCraft {
  // Define mod id in a common place for everything to reference
  public static final String MODID = "vegancraft2022";
  // Directly reference a slf4j logger
  private static final Logger LOGGER = LogUtils.getLogger();

  // Create a Deferred Register to hold Blocks which will all be registered under the "vegancraft2022" namespace
  public VeganCraft()
  {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    // Register our custom items
    Items.register(modEventBus);
    // Register the commonSetup method for modloading
    modEventBus.addListener(this::commonSetup);
    // Register ourselves for server and other game events we are interested in
    MinecraftForge.EVENT_BUS.register(this);

    LivingHurtEvent
  }

  private void commonSetup(final FMLCommonSetupEvent event)
  {
    // Some common setup code
    LOGGER.info("HELLO FROM COMMON SETUP");
    LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
  }

  // You can use SubscribeEvent and let the Event Bus discover methods to call
  @SubscribeEvent
  public void onServerStarting(ServerStartingEvent event)
  {
    LOGGER.info("HELLO from vegan server starting");
  }

  // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
  @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
  public static class ClientModEvents
  {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
      LOGGER.info("HELLO FROM vegan CLIENT SETUP");
      LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
  }
}
