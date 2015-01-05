<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<%@ include file="/static/base.jsp" %>
	<style>
		html {
		  background: #7EC0F3 url("static/images/background.svg") 50% 0 no-repeat;
		  background-attachment: fixed;
		}
	</style>
</head>

  <body class="container">
      <%@ include file="/static/menu.html" %>
      <div id="pre-body">
          
      </div>
      <div>
        
      </div>

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->

    <!-- place project specific Javascript in this file -->
    <script src="static/js/greetcorner.js"></script>

    <script>
      $("input").addClass("form-control");
      $("textarea").addClass("form-control");
      $('.alert').click(function() {
         $('.alert').hide();
      })
    </script>
  </body>

  <%-- <%= page="/static/footer.html" %> --%>
</html>

