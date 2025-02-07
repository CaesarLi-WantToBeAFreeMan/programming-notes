CREATE TABLE IF NOT EXISTS travels(
    id INT PRIMARY KEY,
    firstName VARCHAR(30) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    age INT NOT NULL,
    address VARCHAR(15) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telephone INT NOT NULL,
    registerDateTime TIMESTAMP
);