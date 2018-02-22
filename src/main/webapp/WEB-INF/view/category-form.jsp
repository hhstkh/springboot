<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<c:url value="/admin/category-form" var="submitCategoryFormUrl"/>
<div class="container">
	<s:form method="post" modelAttribute="category" action="${submitCategoryFormUrl}">
		<s:input type="hidden" id="category-id" name="category-id" path="id"/>
		<div class="form-group">
			<label for="category-name">Name</label>
			<s:input type="text" id="category-name" name="category-name" path="name"/>
			<s:errors path="name"/>
		</div>
		<div class="form-group">
			<label for="category-description">Description</label>
			<s:textarea id="category-description" name="category-description" path="description"/>
			<s:errors path="description"/>
		</div>
		<button type="submit" class="btn btn-primary">Save</button>
	</s:form>
</div>