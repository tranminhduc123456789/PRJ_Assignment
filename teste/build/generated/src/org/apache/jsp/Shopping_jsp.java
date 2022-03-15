package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Shopping_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!-- Basic -->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Site Metas -->\n");
      out.write("    <title>Chickentique - Products</title>\n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <!-- Site Icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Site CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <!-- Responsive CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Start Main Top -->\n");
      out.write("    <div class=\"main-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"right-phone-box\">\n");
      out.write("                        <p>Call US :- <a href=\"tel:0929644051\"> +84 929 644 051</a></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"our-link\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">My Account</a></li>\n");
      out.write("                            <li><a href=\"login.html\">Login</a></li>\n");
      out.write("                            <li><a href=\"signup.html\">Register</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Main Top -->\n");
      out.write("\n");
      out.write("    <!-- Start Main Top -->\n");
      out.write("    <header class=\"main-header\">\n");
      out.write("        <!-- Start Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Start Header Navigation -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("                <!-- End Header Navigation -->\n");
      out.write("\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\n");
      out.write("                    <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\n");
      out.write("                        <li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.html\">Home</a></li>\n");
      out.write("                        <li class=\"dropdown megamenu-fw\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">Product</a>\n");
      out.write("                            <ul class=\"dropdown-menu megamenu-content\" role=\"menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-menu col-md-4\">\n");
      out.write("                                            <h6 class=\"title\">Top</h6>\n");
      out.write("                                                <ul class=\"menu-col\">\n");
      out.write("                                                    <li><a href=\"shop.html\">Jackets</a></li>\n");
      out.write("                                                    <li><a href=\"shop.html\">Shirts</a></li>\n");
      out.write("                                                    <li><a href=\"shop.html\">Sweaters & Cardigans</a></li>\n");
      out.write("                                                    <li><a href=\"shop.html\">T-shirts</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- end col-4 -->\n");
      out.write("                                        <div class=\"col-menu col-md-4\">\n");
      out.write("                                            <h6 class=\"title\">Bottom</h6>\n");
      out.write("                                                <ul class=\"menu-col\">\n");
      out.write("                                                    <li><a href=\"shop.html\">Jeans</a></li>\n");
      out.write("                                                    <li><a href=\"shop.html\">Trousers</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- end col-4 -->\n");
      out.write("                                        <div class=\"col-menu col-md-4\">\n");
      out.write("                                            <h6 class=\"title\">Accessories</h6>\n");
      out.write("                                                <ul class=\"menu-col\">\n");
      out.write("                                                    <li><a href=\"shop.html\">Sunglasses</a></li>\n");
      out.write("                                                    <li><a href=\"shop.html\">Wallets</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- end col-4 -->\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- end row -->\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">SHOP</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"cart.html\">Cart</a></li>\n");
      out.write("                                <li><a href=\"checkout.html\">Checkout</a></li>\n");
      out.write("                                <li><a href=\"my-account.html\">My Account</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("                <!-- Start Atribute Navigation -->\n");
      out.write("                <div class=\"attr-nav\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"search\"><a href=\"#\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                        <li class=\"side-menu\"><a href=\"cart.html\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-shopping-bag\"></i>\n");
      out.write("                            <span class=\"badge\">3</span>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- End Atribute Navigation -->\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        <!-- End Navigation -->\n");
      out.write("    </header>\n");
      out.write("    <!-- End Main Top -->\n");
      out.write("\n");
      out.write("    <!-- Start Top Search -->\n");
      out.write("    <div class=\"top-search\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-search\"></i></span>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                <span class=\"input-group-addon close-search\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Top Search -->\n");
      out.write("\n");
      out.write("    <!-- Start All Title Box -->\n");
      out.write("    <div class=\"all-title-box\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h2>Shop</h2>\n");
      out.write("                    <ul class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\">Shop</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("    <!-- Start Shop Page  -->\n");
      out.write("    <div class=\"shop-box-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-sm-12 col-xs-12 sidebar-shop-left\">\n");
      out.write("                    <div class=\"product-categori\">\n");
      out.write("                        <div class=\"search-product\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Search here...\" type=\"text\">\n");
      out.write("                                <button type=\"submit\"> <i class=\"fa fa-search\"></i> </button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"filter-sidebar-left\">\n");
      out.write("                            <div class=\"title-left\">\n");
      out.write("                                <h3>Categories</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"list-group list-group-collapse list-group-sm list-group-tree\" id=\"list-group-men\" data-children=\".sub-men\">\n");
      out.write("                                <div class=\"list-group-collapse sub-men\">\n");
      out.write("                                    <a class=\"list-group-item list-group-item-action\" href=\"#sub-men1\" data-toggle=\"collapse\" aria-expanded=\"true\" aria-controls=\"sub-men1\">Top <small class=\"text-muted\"></small>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    <div class=\"collapse show\" id=\"sub-men1\" data-parent=\"#list-group-men\">\n");
      out.write("                                        <div class=\"list-group\">\n");
      out.write("                                            <a href=\"#\" class=\"list-group-item list-group-item-action active\">Jackets<small class=\"text-muted\"></small></a>\n");
      out.write("                                            <a href=\"#\" class=\"list-group-item list-group-item-action\">Shirts <small class=\"text-muted\"></small></a>\n");
      out.write("                                            <a href=\"#\" class=\"list-group-item list-group-item-action\">Sweater & Cardigans<small class=\"text-muted\"></small></a>\n");
      out.write("                                            <a href=\"#\" class=\"list-group-item list-group-item-action\">T-Shirts <small class=\"text-muted\">(10)</small></a>                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"list-group-collapse sub-men\">\n");
      out.write("                                    <a class=\"list-group-item list-group-item-action\" href=\"#sub-men2\" data-toggle=\"collapse\" aria-expanded=\"false\" aria-controls=\"sub-men2\">Bottom\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">(50)</small>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    <div class=\"collapse\" id=\"sub-men2\" data-parent=\"#list-group-men\">\n");
      out.write("                                        <div class=\"list-group\">\n");
      out.write("                                            <a href=\"#\" class=\"list-group-item list-group-item-action\">Jeans<small class=\"text-muted\">(10)</small></a>\n");
      out.write("                                            <a href=\"#\" class=\"list-group-item list-group-item-action\">Trousers<small class=\"text-muted\">(20)</small></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"#\" class=\"list-group-item list-group-item-action\"> Men  <small class=\"text-muted\">(150) </small></a>\n");
      out.write("                                <a href=\"#\" class=\"list-group-item list-group-item-action\">Accessories <small class=\"text-muted\">(11)</small></a>\n");
      out.write("                                <a href=\"#\" class=\"list-group-item list-group-item-action\">Bags <small class=\"text-muted\">(22)</small></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                      \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-9 col-lg-9 col-sm-12 col-xs-12 shop-content-right\">\n");
      out.write("                    <div class=\"right-product-box\">\n");
      out.write("                        <div class=\"product-item-filter row\">\n");
      out.write("                            <div class=\"col-12 col-sm-8 text-center text-sm-left\">\n");
      out.write("                                <div class=\"toolbar-sorter-right\">\n");
      out.write("                                    <span>Sort by </span>\n");
      out.write("                                    <select id=\"basic\" class=\"selectpicker show-tick form-control\" data-placeholder=\"$ USD\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option data-display=\"Select\">Nothing</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">Popularity</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">High Price ? High Price</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">Low Price ? High Price</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"4\">Best Selling</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Showing all 4 results</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 col-sm-4 text-center text-sm-right\">\n");
      out.write("                                <ul class=\"nav nav-tabs ml-auto\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a class=\"nav-link active\" href=\"#grid-view\" data-toggle=\"tab\"> <i class=\"fa fa-th\"></i> </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a class=\"nav-link\" href=\"#list-view\" data-toggle=\"tab\"> <i class=\"fa fa-list-ul\"></i> </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row product-categorie-box\">\n");
      out.write("                            <div class=\"tab-content\">\n");
      out.write("                                <div role=\"tabpanel\" class=\"tab-pane fade show active\" id=\"grid-view\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6 col-md-6 col-lg-4 col-xl-4\">\n");
      out.write("                                            <div class=\"products-single fix\">\n");
      out.write("                                                <div class=\"box-img-hover\">\n");
      out.write("                                                    <div class=\"type-lb\">\n");
      out.write("                                                        <p class=\"sale\">Sale</p>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <img src=\"images/img-pro-01.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                                    <div class=\"mask-icon\">\n");
      out.write("                                                        <ul>\n");
      out.write("                                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"why-text\">\n");
      out.write("                                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                                    <h5> $9.79</h5>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Shop Page -->\n");
      out.write("\n");
      out.write("    <!-- Start Instagram Feed  -->\n");
      out.write("    <div class=\"instagram-box\">\n");
      out.write("        <div class=\"main-instagram owl-carousel owl-theme\">\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-01.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-02.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-03.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-04.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-06.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-07.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-08.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-09.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Instagram Feed  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Start Footer  -->\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-md-12 col-sm-12\">\n");
      out.write("                        <div class=\"footer-widget\">\n");
      out.write("                            <h4>About Chickentique</h4>\n");
      out.write("                            <p>We are the Chickentique shop, your menswear store. Young, dynamic, personality and strong are what we aim for. Your satisfaction is our pleasure.\n");
      out.write("                            </p>\n");
      out.write("                            <p><em>Pham Xuan Phu - Cao Hong Hanh - Nguyen Duy Tan - Tran Minh Duc</em></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                        <div class=\"footer-link-contact\">\n");
      out.write("                            <h4>Contact Us</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <p><i class=\"fas fa-map-marker-alt\"></i>Address: D1 Street, Hi-Tech Park,<br>Long Thanh My, Thu Duc City,<br>Ho Chi Minh City, Vietnam </p>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <p><i class=\"fas fa-phone-square\"></i>Phone: <a href=\"tel:0929644051\">+ 84 929 644 051</a></p>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <p><i class=\"fas fa-envelope\"></i>Email: <a href=\"mailto:hanhchse150754@fpt.edu.vn\">hanhchse150754@fpt.edu.vn</a></p>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- End Footer  -->\n");
      out.write("\n");
      out.write("    <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\n");
      out.write("\n");
      out.write("    <!-- ALL JS FILES -->\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/jquery.superslides.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("    <script src=\"js/inewsticker.js\"></script>\n");
      out.write("    <script src=\"js/bootsnav.js.\"></script>\n");
      out.write("    <script src=\"js/images-loded.min.js\"></script>\n");
      out.write("    <script src=\"js/isotope.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/baguetteBox.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("    <script src=\"js/form-validator.min.js\"></script>\n");
      out.write("    <script src=\"js/contact-form-script.js\"></script>\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
