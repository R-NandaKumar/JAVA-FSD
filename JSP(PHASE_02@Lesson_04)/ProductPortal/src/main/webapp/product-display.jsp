<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h1>Product Details</h1>
    <c:if test="${sessionScope.product != null}">
        <p><strong>Name:</strong> ${sessionScope.product.name}</p>
        <p><strong>Description:</strong> ${sessionScope.product.description}</p>
        <p><strong>Price:</strong> ${sessionScope.product.price}</p>
    </c:if>
    <c:if test="${sessionScope.product == null}">
        <p>This are the product details............</p>
    </c:if>
</body>
</html>
