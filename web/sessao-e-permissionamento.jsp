<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${empty user}">
    <c:redirect url="pagina-de-redirecionamento"/>
</c:if>

<c:if test="${(pageContext.request.requestURI eq '/app/ui014cadastrarrodovia.jsp')
              or (pageContext.request.requestURI eq '/app/ui015consultarrodovia.jsp')
              or (pageContext.request.requestURI eq '/app/ui016cadastrarbalanca.jsp')
              or (pageContext.request.requestURI eq '/app/ui017consultarbalanca.jsp')
              or (pageContext.request.requestURI eq '/app/ui018cadastrarposto.jsp')
              or (pageContext.request.requestURI eq '/app/ui024cadastrarpesagem.jsp')
              or (pageContext.request.requestURI eq '/app/ui025consultarpesagem.jsp')}">
    <c:if test="${!((user['tipoUsuario'] eq '3') or (user['tipoUsuario'] eq '4'))}">
        <c:redirect url="you-shall-not-pass.jsp"/>
    </c:if>
</c:if>

<c:if test="${(pageContext.request.requestURI eq '/app/ui026cadastrarcamera.jsp')
              or (pageContext.request.requestURI eq '/app/ui027consultarcamera.jsp')}">
    <c:if test="${!((user['tipoUsuario'] eq '3') or (user['tipoUsuario'] eq '1'))}">
        <c:redirect url="you-shall-not-pass.jsp"/>
    </c:if>
</c:if>




