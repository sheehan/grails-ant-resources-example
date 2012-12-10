import static com.example.ResourcesPluginUtil.fileSet

modules = {

    core {
        defaultBundle 'core'
        dependsOn 'jquery, handlebars_runtime'
        resource url: '/css/app/core/mixins.less'
        resource url: '/css/app/core/layout.less'

        resource url: '/js/app/core/loader.coffee', bundle: 'core'
        resource url: '/js/app/core/main.coffee', bundle: 'core'
        resource url: '/css/app/dummy.css'
    }

    def module = { String name ->
        "$name" {
            dependsOn 'core'
            defaultBundle name
            fileSet(dir: "/templates/$name", includes: '**/*.hbs').each { resource url: it, attrs: [type: 'js'], bundle: name }
            fileSet(dir: "/js/app/$name", includes: '**/*.coffee').each { resource url: it, bundle: name }
            fileSet(dir: "/css/app/$name", includes: '**/*.less').each { resource url: it }
            resource url: '/css/app/dummy.css'
        }
    }

    module 'book'
    module 'author'
    module 'publisher'
}