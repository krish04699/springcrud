<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dataform</title>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!--<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> -->

</head>
<body>
  <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Real Estate SalePerson Details</h2>
   <hr/>
  

<form:form action="saveSalePerson" cssClass="form-horizontal"
      method="post" modelAttribute="SalePerson"> 
  <div class="form-group">
    <div class="col-sm-4 mb-3">
      <label for="validationServer01">SalePerson Name</label>
      <form:input type="text" path="SalepersonName" class="form-control is-valid" id="validationServer01"  required="required"/>
      <div class="invalid-feedback">
        Enter name
      </div>
    </div>
    <div class="form-group">
    <div class="col-sm-4 mb-3">
      <label for="validationServer02">Registration No</label>
      <form:input type="text" path="regNo" class="form-control is-valid" id="validationServer02"  required="required"/>
      <div class="invalid-feedback">
        Enter Register number
      </div>
    </div>
    </div>
   
  </div>
  <div class="form-group">
    <div class="col-sm-4 mb-3">
      <label for="validationServer03">Registration Start Date</label>
      <form:input type="date" path="regSdate" class="form-control is-valid" id="validationServer03" required="required"/>
      <div class="invalid-feedback">
        choose a date
      </div>
    </div>
    <div class="form-group">
    <div class="col-sm-4 mb-3">
      <label for="validationServer04">Registration End Date</label>
      <form:input type="date" path="regEdate" class="form-control is-valid" id="validationServer04"  required="required"/>
      <div class="invalid-feedback">
        choose a date
      </div>
    </div>
    </div>
     <div class="form-group">
     <div class="col-sm-4 mb-3">
     <label for="validationServer03">Estate Agent Name</label>
    <form:select path="estateAname" class="custom-select , form-control is-valid" required="required">  
      <form:option value="C&H PROPERTIES PTE LTD" label="C&H PROPERTIES PTE LTD"/>
       			 <form:option value="ERA REALTY NETWORK PTE LTD" label="ERA REALTY NETWORK PTE LTD"/>  
      			 <form:option value="PROPNEX REALTY PTE LTD" label="PROPNEX REALTY PTE LTD"/>  
        		 <form:option value="SRI PTE LTD" label="SRI PTE LTD"/>  
        		 <form:option value="SINGAPORE ESTATE AGENCY PTE LTD" label="SINGAPORE ESTATE AGENCY PTE LTD"/>  
        </form:select>
    <div class="invalid-feedback">choose estate agent name</div>
  </div>
  </div>
  </div>
  <div class="form-group">
    <div class="col-sm-4 mb-3">
      <label for="validationServer04">Agent License No</label>
      <form:input type="text" path="agentLno" class="form-control is-valid" id="validationServer04"  required="required"/>
      <div class="invalid-feedback">
        enter valid number
      </div>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>
</form:form>
</div>
</div>

</body>
</html>