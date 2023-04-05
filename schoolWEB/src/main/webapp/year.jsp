<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="home/css/styles.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Liste des cours</title>
</head>
<body>

	<!--<c:if test="$cours != nul">
		<c:forEach items="$cours" var="cours">
			<pre>${cours.id} ${cours.name} ${cours.programme}</pre>
		</c:forEach>
	</c:if>
	
	<a href="Cours">Liste des cours</a>-->
				<div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title">Liste des années</h3>
                           <table class="table table-bordered table-responsive-md">
                                <tr>
                                    <th>Nom</th>
                                    <th>Action</th>
                                    <th>Action</th>
                                 </tr>
                               <c:forEach items="$year" var="year">
                                 <tr>
                                  <td>${year.name}</td>
                                    <td><a href="" class="btn btn-success form-group" >Modifier</a></td>
                                    <td><a href="" class="btn btn-danger form-group" onclick="return confirm('Voulez-vous supprimer?');">supprimer</a></td>
                                    </tr>
                                </table>
                   	 		</div>
                   	 	</div>
                	</c:forEach>
                	
             
	
</body>
</html>