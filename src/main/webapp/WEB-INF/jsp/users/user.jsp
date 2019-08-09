<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/jsp/common/header.jspf"%>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->

    <form:form method="post" modelAttribute="user">
        <form:hidden path="userID" />

        <!-- Collapsable Card -->
        <div class="card shadow">
            <!-- Card Header - Accordion -->
            <a href="#collapseCardOrg" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseCardOrg">
                <h6 class="m-0 font-weight-bold text-primary">Organization</h6>
            </a>
            <!-- Card Content - Collapse -->
            <div class="collapse show" id="collapseCardOrg">
                <div class="card-body">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <fieldset class="form-group">
                                <form:label path="companyID">Company</form:label>
                                <form:input path="companyID" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                        <div class="form-group col-md-6">
                            <fieldset class="form-group">
                                <form:label path="userProfileID">Profile</form:label>
                                <form:input path="userProfileID" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br/>

        <!-- Collapsable Card -->
        <div class="card shadow">
            <!-- Card Header - Accordion -->
            <a href="#collapseCardPersonalInfo" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseCardPersonalInfo">
                <h6 class="m-0 font-weight-bold text-primary">Personal Information</h6>
            </a>
            <!-- Card Content - Collapse -->
            <div class="collapse show" id="collapseCardPersonalInfo">
                <div class="card-body">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <fieldset class="form-group">
                                <form:label path="firstName">Firstname</form:label>
                                <form:input path="firstName" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                        <div class="form-group col-md-6">
                            <fieldset class="form-group">
                                <form:label path="lastName">Lastname</form:label>
                                <form:input path="lastName" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <fieldset class="form-group">
                                <form:label path="userName">Username</form:label>
                                <form:input path="userName" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                        <div class="form-group col-md-6">
                            <fieldset class="form-group">
                                <form:label path="password">Password</form:label>
                                <form:input path="password" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br/>

        <!-- Collapsable Card -->
        <div class="card shadow">
            <!-- Card Header - Accordion -->
            <a href="#collapseCardOtherInfo" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="true" aria-controls="collapseCardOtherInfo">
                <h6 class="m-0 font-weight-bold text-primary">Other Information</h6>
            </a>
            <!-- Card Content - Collapse -->
            <div class="collapse show" id="collapseCardOtherInfo">
                <div class="card-body">
                    <div class="form-group">
                        <fieldset class="form-group">
                            <form:label path="email">Email</form:label>
                            <form:input path="email" type="text" class="form-control"/>
                        </fieldset>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <fieldset class="form-group">
                                <form:label path="phone">Phone</form:label>
                                <form:input path="phone" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                        <div class="form-group col-md-4">
                            <fieldset class="form-group">
                                <form:label path="mobile">Mobile</form:label>
                                <form:input path="mobile" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                        <div class="form-group col-md-4">
                            <fieldset class="form-group">
                                <form:label path="gender">Gender</form:label>
                                <form:input path="gender" type="text" class="form-control"/>
                            </fieldset>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br/>

        <button type="submit" class="btn btn-success">Submit</button>

    </form:form>

</div>
<!-- /.container-fluid -->

<%@include file="/WEB-INF/jsp/common/footer.jspf"%>