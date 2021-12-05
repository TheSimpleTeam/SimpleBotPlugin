package net.thesimpleteam.simplebotplugin;

public abstract class BasePlugin {

    private IPluginLoader loader;

    /**
     * The name of the plugin should not be the same as the name of another plugin.
     * @return The name of the plugin.
     */
    public abstract String getName();
    public abstract String getAuthor();

    public abstract void onEnable();
    public abstract void onDisable();

    public String getDescription() {
        return "No description provided.";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getWebsite() {
        return "https://example.com";
    }

    public IPluginLoader getLoader() {
        return loader;
    }
}
