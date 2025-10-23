CREATE TABLE IF NOT EXISTS cards (
  card_id SERIAL NOT NULL,
  mobile_number varchar(15) NOT NULL,
  card_number varchar(100) NOT NULL,
  card_type varchar(100) NOT NULL,
  total_limit INTEGER NOT NULL,
  amount_used INTEGER NOT NULL,
  available_amount INTEGER NOT NULL,
  created_at TIMESTAMP NOT NULL,
  created_by varchar(20) NOT NULL,
  updated_at TIMESTAMP DEFAULT NULL,
  updated_by varchar(20) DEFAULT NULL,
  PRIMARY KEY (card_id)
);