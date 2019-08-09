<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/jsp/common/header.jspf"%>

    <!-- Begin Page Content -->
    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-4 text-gray-800">Users</h1>

        <!-- DataTables Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <a href="/users/add" class="btn btn-secondary btn-icon-split">
                                <span class="icon text-white-50">
                                  <i class="fas fa-plus-circle"></i>
                                </span>
                    <span class="text">Add User</span>
                </a>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">

                        <thead>
                            <tr>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>Profile</th>
                                <th>Username</th>
                                <th>Password</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Mobile</th>
                                <th>Gender</th>
                                <th>Company</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${users}" var="item">
                            <tr>
                                <td>${item.firstName}</td>
                                <td>${item.lastName}</td>
                                <td>${item.userProfileID}</td>
                                <td>${item.userName}</td>
                                <td>${item.password}</td>
                                <td>${item.email}</td>
                                <td>${item.phone}</td>
                                <td>${item.mobile}</td>
                                <td>${item.gender}</td>
                                <td>${item.companyID}</td>
                                <td><a href="/users/update?id=${item.userID}"><i class="fa fa-edit"></i></a></td>
                                <td><a href="/users/delete?id=${item.userID}"><i class="fa fa-trash"></i></a></td>
                            </tr>
                        </c:forEach>
                        </tbody>

                    </table>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container-fluid -->

    <%@include file="/WEB-INF/jsp/common/footer.jspf"%>
