package net.chaoticcreations.colorfulcampfires.compat;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.ModList;
import org.slf4j.Logger;

/**
 * Safe JEI integration handler that only loads JEI classes when JEI is present
 */
public class JEIIntegration {
    
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final String JEI_MOD_ID = "jei";
    
    /**
     * Check if JEI is loaded and available
     */
    public static boolean isJEILoaded() {
        return ModList.get().isLoaded(JEI_MOD_ID);
    }
    
    /**
     * Initialize JEI integration if JEI is available
     * This method is safe to call even if JEI is not present
     */
    public static void initializeJEI() {
        if (isJEILoaded()) {
            try {
                // JEI plugin is automatically loaded via @JeiPlugin annotation
                // No manual initialization needed
                LOGGER.info("JEI detected - recipe integration will be available");
            } catch (Exception e) {
                LOGGER.warn("Failed to initialize JEI integration: {}", e.getMessage());
            }
        }
    }
}
