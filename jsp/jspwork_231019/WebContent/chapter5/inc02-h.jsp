<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%! 
    int pageC=0;
    void addC(){
    pageC++;
    }
    %>
<% 
    addC();
    %>
<p>
	방문은
	<%= pageC %>
</p>