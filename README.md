# Servlet_doPost_With_Service_Method
we have five type of methods in any Web request/response:  GET  PUT  POST Delete  OPTIONS
When we need data from server then we use GET request 
When we need to submit data to server then we use POST request  

In  the form tag if you don't mentioned any thing it will consider it to as GET request and in GET request parameters are passed in URL. 
But if we use method as "POST" parameters are not passed to URL. 
Whether you use "get" or "post" in the form tag if you are using service() method in servlet then both the request will come to the service() method only or you can say that service() method in servlet will accept both the request either get or post.

Now if I want my, servlet will accept only "post" request not "get" request then how can you handle that situation:  
you can mentioned the doPost() method in your servlet instead of service() method.
Although doGet() or doPost() method will be called from the service() method of HttpServlet class.
