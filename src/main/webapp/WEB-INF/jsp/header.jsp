<%-- 
    Document   : header
    Created on : 19.05.2016, 15:38:07
    Author     : Натусик
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>  
      <div class="container top-sect">
        <div class="navbar-header">
          <h1 class="navbar-brand">
            <a data-type='rd-navbar-brand'  href="/">Киби<small>Медиа</small></a>
          </h1>
          <a class="search-form_toggle" href="#"></a>
        </div>

        <div class="help-box text-right">
          <img src="${sfeduLogo}" width="150" height="150" alt="">
        </div>
      </div>


      <div id="stuck_container" class="stuck_container">
        <div class="container">   
        <nav class="navbar navbar-default navbar-static-top pull-left">            

            <div class="">  
              <ul class="nav navbar-nav sf-menu" data-type="navbar">
                <c:forEach begin="0" end="${mainPagesCount}" varStatus="loop">
                    <li>
                      <a href="<c:url value="${mainPages.get(loop.index).getHref()}" />">${mainPages.get(loop.index).getTitle()}</a>
                    </li>
                </c:forEach>
              </ul>                           
            </div>
        </nav>   
        <form class="search-form" action="search.php" method="GET" accept-charset="utf-8">
          <label class="search-form_label">
            <input class="search-form_input" type="text" name="s" autocomplete="off" placeholder=""/>
            <span class="search-form_liveout"></span>
          </label>
          <button class="search-form_submit fa-search" type="submit"></button>
        </form>
             
        </div>

      </div>  
    </header>
