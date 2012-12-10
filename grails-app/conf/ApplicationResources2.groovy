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

    book {
        dependsOn 'core'
        defaultBundle 'book'
        fileSet(dir: '/templates/book', includes: '**/*.hbs').each { resource url: it, attrs: [type: 'js'], bundle: 'book' }
        fileSet(dir: '/js/app/book', includes: '**/*.coffee').each { resource url: it, bundle: 'book' }
        fileSet(dir: '/css/app/book', includes: '**/*.less').each { resource url: it }
        resource url: '/css/app/dummy.css'
    }

    author {
        dependsOn 'core'
        defaultBundle 'author'
        fileSet(dir: '/templates/author', includes: '**/*.hbs').each { resource url: it, attrs: [type: 'js'], bundle: 'author' }
        fileSet(dir: '/js/app/author', includes: '**/*.coffee').each { resource url: it, bundle: 'author' }
        fileSet(dir: '/css/app/author', includes: '**/*.less').each { resource url: it }
        resource url: '/css/app/dummy.css'
    }

    publisher {
        dependsOn 'core'
        defaultBundle 'publisher'
        fileSet(dir: '/templates/publisher', includes: '**/*.hbs').each { resource url: it, attrs: [type: 'js'], bundle: 'publisher' }
        fileSet(dir: '/js/app/publisher', includes: '**/*.coffee').each { resource url: it, bundle: 'publisher' }
        fileSet(dir: '/css/app/publisher', includes: '**/*.less').each { resource url: it }
        resource url: '/css/app/dummy.css'
    }
}