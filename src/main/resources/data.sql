-- Пользователи
-- admin / admin123
-- john / user123
INSERT INTO users (id, username, password, role) VALUES
(1, 'admin', '$2a$10$3iWURPYV0YmKUlZjEC.kTuCKydJ2Y/Nq35xJ8IQZ3UG2jK.LF7V7K', 'ADMIN'),
(2, 'john',  '$2a$10$S63eDFGcZVHD/XVn4yD8QONpTb9bZ0V0qTwihgCLAZT22T8f2G.7y', 'USER');

-- Рестораны
INSERT INTO restaurant (id, name, address) VALUES
(1, 'Pizza Place', '123 Main St'),
(2, 'Sushi Bar', '456 Elm St');

-- Меню
INSERT INTO menu_item (id, name, price, restaurant_id) VALUES
(1, 'Margherita Pizza', 9.99, 1),
(2, 'Pepperoni Pizza', 11.99, 1),
(3, 'California Roll', 7.99, 2),
(4, 'Spicy Tuna Roll', 8.99, 2);

-- Заказы
INSERT INTO delivery_order (id, customer_name, delivery_address, menu_item_id) VALUES
(1, 'Alice', '789 Oak St', 1),
(2, 'Bob',   '321 Pine Ave', 3);
