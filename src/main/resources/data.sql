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

INSERT INTO images (name, base64Image, vehicle_id) VALUES
('Image 1', 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUA...', 1),
('Image 2', 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQEAAAAAAAD...', 2),
('Image 3', 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUA...', 3),
('Image 4', 'data:image/gif;base64,R0lGODlhPQBEAP8AAJXh...', 4),
('Image 5', 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQEAAAAAAAD...', 5),
('Image 6', 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUA...', 6),
('Image 7', 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUA...', 7),
('Image 8', 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQEAAAAAAAD...', 8),
('Image 9', 'data:image/gif;base64,R0lGODlhPQBEAP8AAJXh...',9);

