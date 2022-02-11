package com.uniovi.sdi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//Esta clase actuará como controlador
@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //primero , creamos un objeto Product service , para poder acceder a los métodos de esta clase.-> product service->modelo
        ProductsService ps=new ProductsService();
        //asignamos el resultado de la lecutra de los datos a una variable storeProducts
        List<Product> storeProducts=ps.getProducts();
        //una vez hecho esto, debemos añadir el valor del parametro a la request.
        request.setAttribute("storeProducts",storeProducts);
        //le devolvemos el "control" a la vista de productos, que mostrará el resultado->vista
        getServletContext().getRequestDispatcher("/products-view.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
