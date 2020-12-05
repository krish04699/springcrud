<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>realestate</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-12">
   <h2>Real Estate SalePerson Details</h2>
   <hr/>

   <input type="button" value="Add SalePerson"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">SalePerson List</div>
    </div>
    <div>
     <table class="table">
      <tr>
      <th scope="col">Saleperson Id</th>
      <th scope="col">Saleperson Name</th>
      <th scope="col">Registartion No</th>
       <th scope="col">Reg-Start-Date</th>
       <th scope="col">Reg-End-Date</th>
       <th scope="col">Estate_AgentNAme</th>
       <th scope="col">Agent_LicenseNo</th>
       <th scope="col">Action</th>
      </tr>

      <!-- loop over and print our SalePersons -->
      <c:forEach var="tempSalePerson" items="${SalePersons}">

       <!-- construct an "update" link with SalePerson id -->
       <c:url var="updateLink" value="/updateForm">
        <c:param name="SalePersonId" value="${tempSalePerson.sid}" />
       </c:url>

       <!-- construct an "delete" link with SalePerson id -->
       <c:url var="deleteLink" value="/delete">
        <c:param name="SalePersonId" value="${tempSalePerson.sid}" />
       </c:url>

       <tr>
       <td scope="column">${tempSalePerson.sid}</td>
        <td>${tempSalePerson.salepersonName}</td>
        <td>${tempSalePerson.regNo}</td>
        <td>${tempSalePerson.regSdate}</td>
        <td>${tempSalePerson.regEdate}</td>
        <td>${tempSalePerson.estateAname}</td>
        <td>${tempSalePerson.agentLno}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this SalePerson?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>

    </div>
   </div>
  </div>

 </div>
</body>
</html>