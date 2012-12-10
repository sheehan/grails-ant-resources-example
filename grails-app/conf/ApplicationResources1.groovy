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
        resource url: '/templates/book/edit/form.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/edit/menu.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/edit/page.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/edit/toolbar.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/list/list.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/list/menu.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/list/page.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/list/toolbar.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/show/show.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/show/menu.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/show/page.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/templates/book/show/toolbar.hbs', attrs: [type: 'js'], bundle: 'book'
        resource url: '/js/app/book/edit.coffee', bundle: 'book'
        resource url: '/js/app/book/list.coffee', bundle: 'book'
        resource url: '/js/app/book/show.coffee', bundle: 'book'
        resource url: '/css/app/book/book.less'
        resource url: '/css/app/dummy.css'

    }

    author {
        dependsOn 'core'
        defaultBundle 'author'
        resource url: '/templates/author/edit/form.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/edit/menu.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/edit/page.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/edit/toolbar.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/list/list.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/list/menu.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/list/page.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/list/toolbar.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/show/show.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/show/menu.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/show/page.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/templates/author/show/toolbar.hbs', attrs: [type: 'js'], bundle: 'author'
        resource url: '/js/app/author/edit.coffee', bundle: 'author'
        resource url: '/js/app/author/list.coffee', bundle: 'author'
        resource url: '/js/app/author/show.coffee', bundle: 'author'
        resource url: '/css/app/author/author.less'
        resource url: '/css/app/dummy.css'
    }

    publisher {
        dependsOn 'core'
        defaultBundle 'publisher'
        resource url: '/templates/publisher/edit/form.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/edit/menu.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/edit/page.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/edit/toolbar.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/list/list.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/list/menu.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/list/page.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/list/toolbar.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/show/show.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/show/menu.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/show/page.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/templates/publisher/show/toolbar.hbs', attrs: [type: 'js'], bundle: 'publisher'
        resource url: '/js/app/publisher/edit.coffee', bundle: 'publisher'
        resource url: '/js/app/publisher/list.coffee', bundle: 'publisher'
        resource url: '/js/app/publisher/show.coffee', bundle: 'publisher'
        resource url: '/css/app/publisher/publisher.less'
        resource url: '/css/app/dummy.css'
    }
}