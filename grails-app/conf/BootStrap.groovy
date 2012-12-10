import grails.util.Environment
import org.codehaus.groovy.grails.compiler.DirectoryWatcher

import javax.servlet.ServletContext

class BootStrap {

    def grailsApplication
    def pluginManager

    def init = { ServletContext servletContext ->

        if (Environment.isDevelopmentMode()) {
            def resourcesPlugin = pluginManager.getGrailsPlugin('resources').@plugin
            def watcher = new DirectoryWatcher()
            def listener = new DirectoryWatcher.FileChangeListener() {
                void onChange(File file) {}

                void onNew(File file) {
                    resourcesPlugin.triggerReload {
                        grailsApplication.mainContext.grailsResourceProcessor.reloadModules()
                    }
                }
            }
            watcher.addListener(listener)

            ['/css', '/js', '/templates'].each { String path ->
                path = path.replaceAll('\\\\', '/')
                File dir = new File(servletContext.getRealPath(path))
                watcher.addWatchDirectory(dir, '*')
            }

            watcher.start()
        }

    }

    def destroy = {
    }
}
