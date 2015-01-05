<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Templates</title>
		<%@ include file="/static/base.jsp" %>
		<style>
			html {
			  background: #7EC0F3 url("static/images/background.svg") 50% 0 no-repeat;
			  background-attachment: fixed;
			}
		</style>
		<link href="static/css/templates/templates.css" rel="stylesheet"></link>
	</head>
	<body>
	<%@ include file="/static/menu.html" %>
      <div id="pre-body">
          
      </div>
      <div>
		<div class="row">
			<div class="col-md-12 col-lg-12 col-sm-12">
				<ul class="notes" id="templates">
					<!-- {%for template in templates%} -->
							    <li class="animated">
							        <div>
									    <a href="<!-- {% url 'template_edit' template.greet_templates_parent.greet_parent_id template.id%} -->">
								            <small>Wedding Template 1</small>
								            <h4>
												<!-- {{template.greet_template_display_name}} -->Wedding 
											</h4>
								            <p>
								            	<img src="{{ MEDIA_URL }}{{template.template_image}}" class="img-responsive" alt="{{template.greet_template_display_name}}"></img>
								            </p>
										</a>
										<p class="likes blue animated zoomIn">
											<!-- {%if template.likes%}
												{{template.likes}}
											{%else%}
												0
											{%endif%} -->
											50
											<i class="fa fa-heart-o" id="{{template.greet_templates_name}}"></i>
										</p>
							        </div>
							    </li>
							<!-- {% empty %}
								Templates Coming Soon
					{%endfor%} -->
				</ul>
			</div>
		</div>
		
		<script type="text/javascript">
			$(".likes i").click(function(e){
				$.ajax({
					method : 'POST',
					url : '{%url "template_like"%}',
					data : {
						'id' : e.target.id,
						'csrfmiddlewaretoken' : "{{csrf_token}}",
					},
					success : function(response, status, xhr){
						$("#"+e.target.id).parent().html(response+'&nbsp;<i class="fa fa-heart-o green animated rubberBand"></i>');
					},
					error : function(response, status, xhr){
						alert("Error");
					},
				});
			});
		</script>
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