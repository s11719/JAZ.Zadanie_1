<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Zadanie 1</title>
</head>
<body>

    <form method = "post"
    		action = "Zadanie_1">
    
    <input type = "text" name = "name" />
    <input type = "text" name = "surname" />
    <input type = "text" name = "email" />
    <input type = "text" name = "confirm_email" />
    <input type = "text" name = "employer" />
     <select name = "origin">
    <option value = "work_ad">from ad at work</option>
    <option value = "school_ad">from ad at school</option>
    <option value = "facebook">from Facebook</option>
    <option value = "friend">from my friend</option>
    <option value = "other">other origin</option>       
    </select>
    <input type = "text" name = "occupation" />
    <input type = "submit" value = "Send it!"/>
   
    
    </form>

</body>
</html>