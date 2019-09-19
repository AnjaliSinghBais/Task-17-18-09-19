<%@page isELIgnored="false"%>
<html>
<body>
	<h3>FOLLWING BOOK ADDED</h3>
		<pre>
		BOOK CODE  : ${info.bcode}
		BOOK NAME  : ${info.bname}
		PRICE      : ${info.price}
		</pre>
	<a href="addbook.jsp">AddBook</a><br>
	<a href="removebook.jsp">RemoveBook</a><br>
    <a href="update.jsp">UpdateBookDetails</a><br>

</body>
</html>