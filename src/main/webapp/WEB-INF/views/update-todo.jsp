<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>ToDo!!</title>
        <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body{
                background-color:floralWhite;
            }
            .container{
              border-radius:10px;
              box-shadow: 5px 5px 13px -2px rgba(0,0,0,0.4);
              -webkit-box-shadow: 5px 5px 13px -2px rgba(0,0,0,0.4);
              -moz-box-shadow: 5px 5px 13px -2px rgba(0,0,0,0.4);
              background-color:lavenderblush;
            }
        </style>
    </head>
    <body>
        <div class="container m-5 p-5">
            <a href="todo-list" class="float-right mb-3">Back to List</a>

            <h4>Adding new item to do:</h4>
            <form:form action="update-todo?id=${todo.id}" method="post" commandName="todo" class="m-5">
                <fieldset class="form-group">
                    <form:label path="name">Name</form:label>
                    <form:input path="name" type="text" class="form-control"/>
                    <form:errors path="name" cssClass="text-danger" />
                </fieldset>
                <fieldset class="form-group">
                    <form:label path="desc">Description</form:label>
                    <form:input path="desc" type="text" class="form-control"/>
                    <form:errors path="desc" cssClass="text-danger" />
                </fieldset>
                <fieldset class="form-group">
                    <form:label path="isCompleted">Is this done yet?</form:label>
                    <form:checkbox path="isCompleted" class="form-control"/>
                    <form:errors path="isCompleted" cssClass="text-danger" />
                </fieldset>
                <button type="submit" class="btn btn-outline-success float-right">Update Item</button>
            </form:form>
        </div>

        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    </body>
</html>