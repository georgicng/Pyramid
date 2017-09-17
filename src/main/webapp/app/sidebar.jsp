<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Pyramid Accounting!</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="assets/images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2><shiro:principal/></h2>
                <!--h2>John Doe</h2-->
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br>

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section active">
                <h3>General</h3>
                <ul class="nav side-menu" style="">
                    <li><a href="app/index.jsp"><i class="fa fa-home"></i>Dashboard</a></li>
                    <shiro:hasRole name="admin">
                  <li><a><i class="fa fa-sitemap"></i> Admin <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a href="app/role/list.jsp">Roles</a></li>
                        <li><a href="app/user/list.jsp">Users</a></li>
                        <li><a href="app/business_day/list.jsp">Business Day</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-sitemap"></i> Account Setup <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a>GL Accounts</a></li>
                        <li><a>Posting Setup</a></li>
                        <li><a>Expense Posting Setup</a></li>
                    </ul>
                  </li>
                  </shiro:hasRole>
                  <li><a><i class="fa fa-sitemap"></i> Posting Module <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a>Direct Posting</a></li>
                        <li><a>Expense Posting</a></li>
                    </ul>
                  </li>
                  
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="" data-original-title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="" data-original-title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="" data-original-title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="" href="logout.jsp" data-original-title="Logout">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>