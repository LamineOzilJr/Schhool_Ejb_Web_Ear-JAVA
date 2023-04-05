<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/x-icon" href="home/assets/favicon.ico" />
     <link href="home/css/styles.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des étudiants</title>

</head>
<body>

<div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title">Liste des étudiants</h3>
                           <table class="table table-bordered table-responsive-md">
                                <tr>
                                	<th>Id </th>
                                    <th>Nom </th>
                                    <th>Prénom</th>
                                    <th>Date de naissance</th>
                                    <th>Téléphone</th>
                                    <th>Action</th>
                                    <th>Action</th>
                                 </tr>
                                 
                                 <c:out value="ozilinhooo"/>
                                 <c:if test="${students != null }">
                                 <c:forEach items="${students }" var="s">
                                    <tr>
	                                 <td><c:out value="${s.id}"/></td>
	                                 <td><c:out value="${s.firstname}"/></td>
	                                 <td><c:out value="${s.lastname}"/></td>
	                                 <td><c:out value="${s.birthdate}"/></td>
	                                 <td><c:out value="${s.phone}"/></td>
	                                  <td><a href="" class="btn btn-success form-group" >Modifier</a></td>
	                                  <td><a href="" class="btn btn-danger form-group" onclick="return confirm('Voulez-vous supprimer?');">supprimer</a></td>
	                                </tr>
	                             </c:forEach>
                                </c:if>
                             </table>
                   	 		</div>
                   	 	</div>
            </div>     	
  


</body>
</html>