INSERT into details (creation_time, update_time, version, description, price, quantity) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, 'The perfect size to ...', 30.3, 1);
INSERT into details (creation_time, update_time, version, description, price, quantity) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, 'The duration  is ...', 76.1, 3);
INSERT into details (creation_time, update_time, version, description, price, quantity) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, 'The type of ...', 59.9, 2);
INSERT into details (creation_time, update_time, version, description, price, quantity) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, 'We cannot guarantee a specific color ...', 40.1, 9);

INSERT into purchase (creation_time, update_time, version, expires, product_type, purchase_details_id) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, CURRENT_TIMESTAMP, 'Toothpaste', 1);
INSERT into purchase (creation_time, update_time, version, expires, product_type, purchase_details_id) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, CURRENT_TIMESTAMP +20, 'Vitamins', 2);
INSERT into purchase (creation_time, update_time, version, expires, product_type, purchase_details_id) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, CURRENT_TIMESTAMP +1000, 'Detergents', 3);
INSERT into purchase (creation_time, update_time, version, expires, product_type, purchase_details_id) VALUES (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0, CURRENT_TIMESTAMP +100, 'Beverages', 4);


----SELECT purchase.details_id, purchase.product_type, purchase.expires, details.description, details.amount FROM purchase INNER JOIN details ON purchase.details_id = details.id;