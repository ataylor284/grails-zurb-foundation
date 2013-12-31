<!DOCTYPE html>
    <head>
        <r:require modules="foundation"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title><g:layoutTitle default="Foundation"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
        <link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
        <link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
        <g:layoutHead/>
        <g:javascript library="application"/>
        <r:layoutResources />
    </head>
    <body>
        <g:layoutBody/>
        <r:layoutResources />
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
