package app.persistence;

import app.entities.Orderline;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {
    public static List<Orderline> getOrders(ConnectionPool connectionPool) {
        String sql = "SELECT * FROM public.orderline " + "ORDER BY order_id, orderline_id DESC";
        List<Orderline> orderlineList = new ArrayList<>();
        try (
                Connection connection = connectionPool.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int orderLineId = rs.getInt("orderline_id");
                int antal = rs.getInt("antal");
                int price = rs.getInt("price");
                int toppingId = rs.getInt("topping_id");
                int bundId = rs.getInt("bund_id");
                int orderId = rs.getInt("order_id");

                Orderline orderLine = new Orderline(orderLineId, antal, price, toppingId, bundId, orderId);
                orderlineList.add(orderLine);
            }
        } catch (SQLException e) {
            // Log the exception message
            e.printStackTrace();
            throw new RuntimeException("Error executing SQL query: " + e.getMessage());
        }
        return orderlineList;
    }
}

