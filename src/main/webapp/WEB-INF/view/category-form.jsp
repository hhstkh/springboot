<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<s:form method="post" modelAttribute="category">
		<table>
			<tr>
				<td><label for="category-name">Category Name</label></td>
				<td><s:input type="text" id="category-name" name="category-name" path="name"/></td>
				<td><s:errors path="name"/></td>
			</tr>
			<tr>
				<td><label for="category-description">Category Description</label></td>
				<td><s:input type="textarea" id="category-description" name="category-description" path="description"/></td>
				<td><s:errors path="description"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</s:form>
</div>