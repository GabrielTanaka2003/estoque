CREATE TABLE IF NOT EXISTS tb_estoque(
    id_product uuid NOT NULL PRIMARY KEY,
    name VARCHAR(255),
    value numeric(38,2),
    quantity numeric(38,2)
);