<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <title>ToDo!!</title>
        <style>
            th, .table-success thead th{
            border:none;
            }
            table, .btn-outline-success{
                border-radius:10px;
                box-shadow: 5px 5px 13px -2px rgba(0,0,0,0.74);
                -webkit-box-shadow: 5px 5px 13px -2px rgba(0,0,0,0.74);
                -moz-box-shadow: 5px 5px 13px -2px rgba(0,0,0,0.74);
            }

            body{
                background-color:FloralWhite;
            }

        </style>
    </head>
    <body>
        <div style="margin:auto;margin-top:100px;width:85%">
            <h3>Spring MVC Simple App - ToDo List</h3>
            <a href="add-todo" class="btn btn-outline-success border-rounded float-right mb-3">New Item</a>
            <table class="table table-success table-striped table-hover" >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>is Done ?</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td><c:out value="${todo.id}"/></td>
                        <td><c:out value="${todo.name}"/></td>
                        <td><c:out value="${todo.desc}"/></td>
                        <td><c:out value="${todo.isCompleted}"/></td>
                        <td>
                            <a href="update-todo?id=${todo.id}" class="btn btn-outline-danger">Update</a>
                            <a href="todo?id=${todo.id}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>



        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>