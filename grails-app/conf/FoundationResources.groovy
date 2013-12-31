def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def foundationJsFile = dev ? 'foundation/foundation.js' : 'foundation.min.js'
def foundationCssFile = dev ? 'foundation.css' : 'foundation.min.css'

modules = {
    'foundation' {
        dependsOn 'jquery,modernizr'
        defaultBundle false
        resource url: [plugin: 'zurb-foundation', dir: 'js', file: foundationJsFile], nominify: !dev
        resource url: [plugin: 'zurb-foundation', dir: 'css', file: foundationCssFile], nominify: !dev
    }
}
