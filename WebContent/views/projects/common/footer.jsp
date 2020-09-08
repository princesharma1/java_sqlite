<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.util.Constants"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<%--   <a class="navbar-brand" href="#"><%=Constants.PROJECT_NAME %></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footer" aria-controls="footer" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button> --%>
  <div class="collapse navbar-collapse" id="footer">
 <!--    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Features</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>
      </li>
    </ul> -->
    <span class="navbar-text">
     @Copyright
    </span>
  </div>
</nav>
<script src="<%=request.getContextPath()+Constants.PROJECT_ASSETS%>/js/jquery3.js"></script>
<script src="<%=request.getContextPath()+Constants.PROJECT_ASSETS%>/js/bootstrap.min.js"></script>

<script>
function _delete(id){
	var action="delete";
	var m = window.confirm("You are about to delete");
	console.log("m: " + m);	
	if(m==true){
		window.location.href='<%=request.getContextPath() %>/ProjectAction?pid='+id+'&action='+action;
	}
	return false;
}

$(document).ready(function(){
	$('._close').click(function(){
		$(this).parent().parent().remove();
	});
	
	
});
</script>

</body>
</html>   