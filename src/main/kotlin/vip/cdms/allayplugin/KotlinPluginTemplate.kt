package vip.cdms.allayplugin

import org.allaymc.api.plugin.Plugin
import org.slf4j.LoggerFactory

@Suppress("unused")
class KotlinPluginTemplate : Plugin() {
    private val log = LoggerFactory.getLogger(this::class.java)

    override fun onLoad() {
        super.onLoad()
        log.info("KotlinPluginTemplate loaded!")
    }

    override fun onEnable() {
        super.onEnable()
        log.info("KotlinPluginTemplate enabled!")
    }

    override fun onDisable() {
        super.onDisable()
        log.info("KotlinPluginTemplate disabled!")
    }
}
