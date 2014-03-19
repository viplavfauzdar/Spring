<html>
<body>
<h2>Inserted</h2>
<% 
db.Customer c = new db.Customer();
c.setName("Viplav");		
db.CustomerHome ch = new db.CustomerHome();
ch.persist(c);
%>
</body>
</html>
