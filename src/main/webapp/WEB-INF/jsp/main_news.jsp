<%-- 
    Document   : main_news
    Created on : 19.05.2016, 15:57:59
    Author     : ???????
--%>

<div class="col-md-4 col-sm-12 col-xs-12">
<div class="thumbnail thumb-shadow">
  <img src="resources/images${newsPhotos.get(param.index).getHrefImg()}" alt="">
  <div class="caption bg2"> <!--bg-primary  bg3-->
    <h4>
        ${news.get(param.index).getTitle()}
    </h4>
    <div class="wrap">
      <p>
        ${news.get(param.index).getDescription()}        
      </p>
      <a href="#" class="btn-link fa-angle-right"></a>
    </div>  
  </div>
</div>              
</div>