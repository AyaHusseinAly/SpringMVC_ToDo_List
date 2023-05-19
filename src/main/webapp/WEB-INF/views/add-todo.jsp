<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>ToDo!!</title>
        <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body{
                background-color:FloralWhite;
            }
        </style>
    </head>
    <body>
        <div class="container m-5 p-5">
            <h4>Adding new item to do:</h4>
            <form:form action="/add-todo" method="post" commandName="todo" class="m-5">
                <fieldset class="form-group">
                    <form:label path="name">Name</form:label>
                    <form:input path="name" type="text" class="form-control" required="required"/>
                    <form:errors path="name" cssClass="text-warning" />
                </fieldset>
                <fieldset class="form-group">
                    <form:label path="desc">Description</form:label>
                    <form:input path="desc" type="text" class="form-control" required="required"/>
                    <form:errors path="desc" cssClass="text-warning" />
                </fieldset>
            </form:form>
        </div>

        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    </body>
</html>