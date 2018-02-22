<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
	<a class="btn btn-primary" href="<c:url value="/admin/category-form"/>" role="button">Add Category</a>
</div>
<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>#</th>
				<th>Name</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="category" varStatus="categoryArr" items="${categories}" >
				<tr>
					<th scope="row">${categoryArr.index + 1}</th>
					<td>${category.name}</td>
					<td>${category.description}</td>
					<td>${category.description}</td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
</div>