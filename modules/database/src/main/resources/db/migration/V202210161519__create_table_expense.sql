CREATE TABLE IF NOT EXISTS expense (
    id UUID NOT NULL PRIMARY KEY DEFAULT uuid_generate_v4(),
    customer_id UUID NOT NULL,
    amount NUMERIC,
    amount_paid NUMERIC,
    expense_name VARCHAR(50),
    expense_type VARCHAR(20),
    frequency_type VARCHAR(20),
    description TEXT,
    pay_at TIMESTAMP,
    due_date TIMESTAMP,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP,
    CONSTRAINT customer_id FOREIGN KEY(customer_id) REFERENCES customer(id)
);