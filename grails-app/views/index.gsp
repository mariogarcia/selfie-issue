<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to Grails</h1>

        <g:uploadForm name="upload" url="[action:'upload',controller:'book']">
            <g:textField name="name" placeholder="name"/><br/>
            <input type="file" name="photo" /><br/>
            <g:submitButton name="update" value="Update" /><br/>
        </g:uploadForm>

    </section>
</div>

</body>
</html>
