<%-- 
    Document   : new_user.jsp
    Created on : Sep 4, 2017, 1:49:36 AM
    Author     : gaiproject
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/app/header.jsp"/>
<jsp:include page="/app/sidebar.jsp"/>
<jsp:include page="/app/topbar.jsp"/>
<div class="right_col" role="main" style="min-height: 949px;">
    <div class="">
        <div class="page-title">
            <div class="title_left">
                <h3>New User Role</h3>
            </div>

            <div class="title_right">
                <div class="col-md-4 col-sm-4 col-xs-12 pull-right">
                    <div class="">
                        <a href="app/role/list.jsp" class="btn btn-primary btn-block">All Roles</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="clearfix"></div>
        <c:if test="${created == true}">
            <div class="alert alert-success alert-dismissible fade in" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
                </button>
                <strong>Role created successfully!</strong> You can add another with the form below.
            </div>
        </c:if>
        <c:if test="${not empty errMsg}">
            <div class="alert alert-success alert-dismissible fade in" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
                </button>
                <strong>${errMsg}</strong>
            </div>
        </c:if>
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>New Role Form <small>Please fill in all the details</small></h2>
                        <ul class="nav navbar-right panel_toolbox">
                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#">Settings 1</a>
                                    </li>
                                    <li><a href="#">Settings 2</a>
                                    </li>
                                </ul>
                            </li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">

                        <br>
                        <jsp:include page="form.jsp"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/app/footer.jsp"/>
