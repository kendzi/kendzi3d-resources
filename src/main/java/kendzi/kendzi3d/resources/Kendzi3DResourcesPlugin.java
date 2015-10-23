/*
 * This software is provided "AS IS" without a warranty of any kind. You use it
 * on your own risk and responsibility!!! This file is shared under BSD v3
 * license. See readme.txt and BSD3 file for details.
 */
package kendzi.kendzi3d.resources;

import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

/**
 * This class registering JOGL libraries in JOSM classLoader.
 *
 * @author Tomasz Kędziora (Kendzi)
 */
public class Kendzi3DResourcesPlugin extends Plugin {

    /**
     * Plugin loader instance.
     */
    private static Kendzi3DResourcesPlugin joglPlugin;

    /**
     * Setup instance.
     *
     * @param joglPlugin
     */
    private static void setInstance(Kendzi3DResourcesPlugin joglPlugin) {
        if (Kendzi3DResourcesPlugin.joglPlugin != null) {
            throw new RuntimeException("this plugin is liblary and it can be loaded only once!");
        }
        Kendzi3DResourcesPlugin.joglPlugin = joglPlugin;
    }

    /**
     * Constructor.
     *
     * @param info
     *            plug-in info
     */
    public Kendzi3DResourcesPlugin(PluginInformation info) {
        super(info);

        setInstance(this);
    }
}
