def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def foundationPlugins = [
    'abide', 'accordion', 'alert', 'clearing', 'dropdown', 'interchange', 
    'joyride', 'magellan', 'offcanvas', 'orbit', 'reveal', 'tab', 'tooltip',
    'topbar'
]

modules = {
    'foundation' {
        dependsOn 'jquery,modernizr'
        defaultBundle false
        if (dev) {
            resource url: [plugin: 'zurb-foundation', dir: 'css', file: 'foundation.css'], nominify: !dev
            resource url: [plugin: 'zurb-foundation', dir: 'js/foundation', file: 'foundation.js'], nominify: !dev
            foundationPlugins.each { plugin ->
                resource url: [plugin: 'zurb-foundation', dir: 'js/foundation', file: "foundation.${plugin}.js"], nominify: !dev
            }
        } else {
            resource url: [plugin: 'zurb-foundation', dir: 'css', file: 'foundation.min.css'], nominify: !dev
            resource url: [plugin: 'zurb-foundation', dir: 'js', file: 'foundation.min.js'], nominify: !dev
        }
    }
}
