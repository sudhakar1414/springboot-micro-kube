CREATE TABLE IF NOT EXISTS loans (
  loan_id SERIAL NOT NULL,
  mobile_number varchar(15) NOT NULL,
  loan_number varchar(100) NOT NULL,
  loan_type varchar(100) NOT NULL,
  total_loan INTEGER NOT NULL,
  amount_paid INTEGER NOT NULL,
  outstanding_amount INTEGER NOT NULL,
  created_at TIMESTAMP NOT NULL,
  created_by varchar(20) NOT NULL,
  updated_at TIMESTAMP DEFAULT NULL,
  updated_by varchar(20) DEFAULT NULL,
  PRIMARY KEY (loan_id)
);