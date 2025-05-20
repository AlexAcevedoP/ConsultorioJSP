<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file= "components/header.jsp" %>
<%@include file= "components/bodyprimeraparte.jsp" %>
<div class="px-5">  
    
<h1>Agregar un Ondontólogo</h1>
<p>text</p>
<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-12 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                   placeholder="Nombre de usuario">
        </div>
        <div class="col-sm-12 mb-3 mb-sm-3">
            <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                   placeholder="Contraseña">
        </div>
        <div class="col-sm-12 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="Rol">
        </div>
    </div>
    
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Cear Usuario
    </button>
    
</form>
</div> 
<%@include file= "components/bodyfinal.jsp" %>