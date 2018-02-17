DROP TABLE shippers;

CREATE TABLE shippers (
  shipperid SERIAL,
  shippername text,
  phone text
);

INSERT INTO shippers (shippername, phone) VALUES ('DHL', '123-123');
INSERT INTO shippers (shippername, phone) VALUES ('UPS', '222-222');
INSERT INTO shippers (shippername, phone) VALUES ('Pocztex', '333-333');
