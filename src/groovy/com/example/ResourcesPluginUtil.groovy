package com.example

import groovy.io.FileType
import grails.util.Holders
import javax.servlet.ServletContext
import org.springframework.util.AntPathMatcher

class ResourcesPluginUtil {

    static Set fileSet(Map attr) {
        String dir = attr.dir
        String includes = attr.includes ?: '**/*'

        Set matches = []

        ServletContext servletContext = Holders.servletContext
        if (servletContext) {
            String basePath = servletContext.getRealPath(dir)
            File baseDir = new File(basePath)
            if (baseDir.exists()) {
                AntPathMatcher antPathMatcher = new AntPathMatcher()
                baseDir.eachFileRecurse(FileType.FILES) { File file ->
                    String path = file.path.replace(basePath, '')
                    path = path.replaceAll('\\\\', '/')
                    path = path[1..-1]
                    if (antPathMatcher.match(includes, path)) {
                        matches << "$dir/$path"
                    }
                }
            }
        }
        matches
    }
}
