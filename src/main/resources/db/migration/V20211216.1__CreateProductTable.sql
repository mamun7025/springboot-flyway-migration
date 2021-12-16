CREATE TABLE product
(
    id          BIGINT NOT NULL auto_increment,
    code        VARCHAR(255),
    name        VARCHAR(255),
    description VARCHAR(255),
    upc         VARCHAR(255),
    sku         VARCHAR(255),
    PRIMARY KEY (id)
) ;