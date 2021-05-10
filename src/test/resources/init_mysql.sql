create table transactions (
    id varchar(255) not null,
    account_number varchar(255),
    amount double precision,
    currency varchar(255),
    date datetime,
    merchant_logo varchar(255),
    merchant_name varchar(255),
    type varchar(255),
    primary key (id)
) engine=InnoDB;

INSERT INTO `transactions` (id, type, date, account_number, currency, amount, merchant_name, merchant_logo)
VALUES ("b390bca2-b19a-11eb-8529-0242ac130003", 'DEBIT', now(), '123', 'USD', 100.00, 'Acme Ltd.', 'images/acme.png');

INSERT INTO `transactions` (id, type, date, account_number, currency, amount, merchant_name, merchant_logo)
VALUES ("b8373010-b19a-11eb-8529-0242ac130003", 'CREDIT', now(), '123', 'USD', 5.00, 'Caffeinenation Inc', 'images/caffeinenation.png');