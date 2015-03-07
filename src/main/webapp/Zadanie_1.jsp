<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%	
	ServletContext formContext = request.getServletContext();
	Integer formCounter = (Integer)formContext.getAttribute("counter");
	formCounter = formCounter != null ? formCounter : 0;
	
	int maxParticipants = 5;
	
	if (formCounter == maxParticipants)
	{
		response.sendRedirect("LimitReached.jsp");
	}
	else
	{
	formCounter = maxParticipants - formCounter;
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Java 4 US!</title>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Roboto Condensed:light">
    <style>
	      body {
    	    font-family: 'Roboto Condensed', serif;
        	font-size: 20px;
      		}
    </style>
</head>
<body>
	<table width="900px" align="center" style="margin-top:15px">
		<tr>
		<td>

<div><h1>Welcome to Java 4 US conference!</h1></div>

<div><h2>There are <%=formCounter%> seats left. Better get hurry :)</h2></div>

    <form method = "post"
    		action = "Zadanie_1">
 		<table cellpadding="10"><tr>
 			<td>Name:</td>
				<td>   
    				<input type = "text" name = "name" />
    			</td>	
    		</tr><tr>
    		<td>Surname:</td>
				<td>  		
   					<input type = "text" name = "surname" />
   				</td>
   			</tr><tr>
   			<td>Email:</td>
				<td>  		 
   					<input type = "text" name = "email" />
   				</td>
   			</tr><tr>
   			<td>Confirm email:</td>
				<td>  		 
   					<input type = "text" name = "confirm_email" />
   				</td>
   			</tr><tr>
   			<td>Company:</td>
				<td>  		
   					<input type = "text" name = "company" />
   				</td>
   			</tr><tr>
   			<td>Origin:</td>
				<td>  		
     				<select name = "origin">
    					<option value = "work_ad">from ad at work</option>
   						<option value = "school_ad">from ad at school</option>
    					<option value = "facebook">from Facebook</option>
    					<option value = "friend">from my friend</option>
   						<option value = "other">other origin</option>       
   					</select>
   				</td>
   			</tr><tr>
   			<td>Position:</td>
				<td>  		
    				<input type = "text" name = "position" />
    			</td>
    		</tr><tr>
				<td colspan="2">		
   	 				<input type = "submit" value = "Send it!"/>
   	 			</td>
			</tr>
		</table>	
       
    </form>

		</td>
		</tr>
	</table>
</body>
</html>