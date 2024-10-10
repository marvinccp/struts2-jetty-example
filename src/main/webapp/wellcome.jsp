<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>
    <p><strong>Concepto:</strong> <s:property value="invoiceBean.subject"/></p>
    <p><strong>Importe:</strong> <s:property value="invoiceBean.price"/></p>
    <p><strong>iva:</strong> <s:property value="iva"/></p>
    <%-- puedo hacerlo asi o importar la funcion en el action --%>
    <p><strong>Total :</strong> <s:property value="invoiceBean.calculateTotal()"/></p>
    <p><strong>Total (otra forma de hacerlo):</strong> <s:property value="total"/></p>


</body>
</html>