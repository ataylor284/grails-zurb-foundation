Zurb Foundation for Grails
==========================

This plugin provides the [Zurb Foundation](http://foundation.zurb.com)
framework.  Zurb Foundation is a responsive design framework designed
for building mobile-first websites.

Getting Started
---------------

Add zurb-foundation to plugins in your BuildConfig.groovy:

    plugins {
        ...
        runtime ":zurb-foundation:5.0.2.1"
    }


Using Zurb Foundation
---------------------

The easiest way to start using foundation is to use the provided
"foundation" layout.

    <!DOCTYPE html>
    <html>
        <head>
            <meta name="layout" content="foundation"/>
        </head>
        <body>
            <div class="panel">Hello World!</div>
        </body>
    </html>

For a real application, you'll probably want to create you're own
layout.  Use the provided layout at
https://github.com/ataylor284/grails-zurb-foundation/blob/master/grails-app/views/layouts/foundation.gsp
as a starting point.
