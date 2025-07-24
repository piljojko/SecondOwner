-- BRANDS
INSERT INTO brand (name) VALUES ('Toyota');
INSERT INTO brand (name) VALUES ('BMW');
INSERT INTO brand (name) VALUES ('Mercedes');

-- MODELS
INSERT INTO model (name, brand_id) VALUES ('Corolla', 1);
INSERT INTO model (name, brand_id) VALUES ('Camry', 1);
INSERT INTO model (name, brand_id) VALUES ('Supra', 1);

INSERT INTO model (name, brand_id) VALUES ('X5', 2);
INSERT INTO model (name, brand_id) VALUES ('M3', 2);
INSERT INTO model (name, brand_id) VALUES ('i8', 2);

INSERT INTO model (name, brand_id) VALUES ('C-Class', 3);
INSERT INTO model (name, brand_id) VALUES ('E-Class', 3);
INSERT INTO model (name, brand_id) VALUES ('S-Class', 3);

-- VEHICLES
INSERT INTO vehicle (model_id, price) VALUES (1, 20000);  -- Toyota Corolla - 20,000$
INSERT INTO vehicle (model_id, price) VALUES (2, 25000);  -- Toyota Camry - 25,000$
INSERT INTO vehicle (model_id, price) VALUES (3, 55000);  -- Toyota Supra - 55,000$

INSERT INTO vehicle (model_id, price) VALUES (4, 60000);  -- BMW X5 - 60,000$
INSERT INTO vehicle (model_id, price) VALUES (5, 70000);  -- BMW M3 - 70,000$
INSERT INTO vehicle (model_id, price) VALUES (6, 140000); -- BMW i8 - 140,000$

INSERT INTO vehicle (model_id, price) VALUES (7, 45000);  -- Mercedes C-Class - 45,000$
INSERT INTO vehicle (model_id, price) VALUES (8, 55000);  -- Mercedes E-Class - 55,000$
INSERT INTO vehicle (model_id, price) VALUES (9, 100000); -- Mercedes S-Class - 100,000$

INSERT INTO image (name, base64Image, vehicle_id) VALUES
('Image 1', 'https://i.pinimg.com/1200x/00/c1/c0/00c1c001455f45bf52dc3cdc70d85c91.jpg', 1),
('Image 2', 'https://i.pinimg.com/736x/e9/0e/87/e90e87854d075a264ba1c896a69033c2.jpg', 2);

