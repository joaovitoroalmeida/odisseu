CREATE TABLE IF NOT EXISTS customer(
    id UUID NOT NULL PRIMARY KEY DEFAULT uuid_generate_v4(),
    customer_name VARCHAR(50) NOT NULL,
    cpf VARCHAR(20) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP,
    is_deleted BOOLEAN DEFAULT false
);