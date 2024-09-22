package vip.cdms.allayplugin

import org.allaymc.api.plugin.Plugin

@Suppress("unused")
class KotlinPluginTemplate : Plugin() {
    override fun onLoad() = pluginLogger.info("KotlinPluginTemplate loaded!")
    override fun onEnable() = pluginLogger.info("KotlinPluginTemplate enabled!")
    override fun onDisable() = pluginLogger.info("KotlinPluginTemplate disabled!")
}
