<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<sj:head jqueryui="true"/>
</head>
<body>
  <s:form id="idForm" action="registrarProducto">
       <table align="center" border="1" width="50%">
         <tr>
             <td>Descripcion</td>
             <td><s:textfield name="producto.descripcion"/></td>
         </tr>
         <tr>
             <td>Stock</td>
             <td><s:textfield name="producto.stock"/></td>
         </tr>
         <tr>
             <td>Precio</td>
             <td><s:textfield name="producto.precio"/></td>
         </tr>
         <tr>
             <td>Fecha Registro</td>
             <td><sj:datepicker displayFormat="dd/mm/yy" name="producto.fecha"/></td>
         </tr>
         <tr>
             <td>Marca</td>
             <td>
                <s:url id="idMarca" action="cargarMarca"/>
                <sj:select
                        name="producto.codMarca"
                        href="%{idMarca}"
                        list="lstMarca"
                        listKey="codigoMarca"
                        listValue="descripcion"
                        headerKey="-1"
                        headerValue="[Seleccione]"
                />
               
             </td>
         </tr>
         <tr>
				<td colspan="2" align="center">
					<sj:submit value="Grabar" targets="divMensaje"/>
				</td>
			</tr>
         
       </table>
  </s:form>
  <div id="divMensaje"></div>
</body>
</html>