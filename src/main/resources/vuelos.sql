DROP TABLE IF EXISTS vuelos;

CREATE TABLE vuelos (
  itineraryid INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  departureDate DATE NOT NULL,
  arrivalDate DATE NOT NULL,
  cityOrigin VARCHAR(250) NOT NULL,
  cityDestination VARCHAR(250) NOT NULL,
  baggage INT NOT NULL,
  cost DOUBLE  NOT NULL,
  departureHour TIME,
  arrivalHour TIME
);


INSERT INTO vuelos (
  name,
  departureDate,
  arrivalDate,
  cityOrigin,
  cityDestination,
  baggage,
  cost,
  departureHour,
  arrivalHour
) VALUES
('Cesar Anguiano', '2021-05-10', '2021-05-10', 'CDMX', 'GDL', 0, 125.50, '12:22:00', '16:22:00'),
('Pedro Infante', '2021-05-10', '2021-05-10', 'CDMX', 'GDL', 1, 125.50, '12:22:00', '16:22:00');


commit;