package vinhnguyen.application.base_template

import android.app.Application
import vinhnguyen.application.base_template.data.AppContainer
import vinhnguyen.application.base_template.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
