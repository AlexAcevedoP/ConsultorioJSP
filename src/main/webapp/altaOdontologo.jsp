<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file= "components/header.jsp" %>
<%@include file= "components/bodyprimeraparte.jsp" %>
<div class="px-5">  
    
<h1>Agregar un Ondontólogo</h1>
<p>text</p>
<form class="user">
    <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="cedula"
                   placeholder="Cédula">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="telefono"
                   placeholder="Teléfono">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="direccion"
                   placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="direccion"
                   placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="fechanac"
                   placeholder="Fecha de nacimiento">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="especialidad"
                   placeholder="Especialidad">
        </div>
    </div>
    
    <a href="#" class="btn btn-primary btn-user btn-block">
        Cear odontólogo
    </a>
    
</form>
</div> 
<%@include file= "components/bodyfinal.jsp" %>



