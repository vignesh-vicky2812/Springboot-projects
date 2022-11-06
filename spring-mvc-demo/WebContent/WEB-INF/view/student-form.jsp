<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>


<html>
<head>
     <title>Student Registration Form</title>
</head>
<body>

   <form:form action="processForm" modelAttribute="student">
   
      First Name: <form:input path="firstName" />
      
      <br><br>
      Last Name <form:input path="lastName" />
      <br><br>
      
      <form:select path="country">
           <form:options items="${student.countryOptions}" />

      </form:select>
      
      <br><br>
      
      Favourite Language:
      Java <form:radiobutton path="favoriteLanguage" value="Java" />
      PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
      Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
      C# <form:radiobutton path="favoriteLanguage" value="C#" />
      <br><br>
      
      Operating Systems:
      
      Linux <form:checkbox path="operatingSystems" value="Linux" />
      Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
      MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
      
      <input type="submit" value="Submit" />
      
   
   </form:form>

</body>

</html>