BEGIN TRANSACTION;

CREATE TABLE customer
(
        customer_id SERIAL NOT NULL,
        last_name VARCHAR (30) NOT NULL,
        first_name VARCHAR (30),
        phone integer
        
);

CREATE TABLE address
(
        address_id SERIAL NOT NULL,
        customer_id integer,
        address varchar (30),
        city varchar (30),
        district varchar (2),
        postal_code varchar (10)
 
);
CREATE TABLE artist
(
        artist_id SERIAL NOT NULL,
        first_name varchar(30),
        last_name varchar(30)
);

CREATE TABLE painting
(
        painting_id SERIAL NOT NULL,
        artist_id INTEGER NOT NULL,
        title VARCHAR (100),
        estimated_value NUMERIC (15,2),
        description VARCHAR (100)
        
);        
                     
CREATE TABLE transactions
(
        transaction_id SERIAL NOT NULL,
        customer_id integer,
        painting_id integer,
        artist_id integer,
        transaction_date timestamp without time zone,
        transaction_amount numeric (15, 2),
        isSale boolean
);        

COMMIT TRANSACTION;

ROLLBACK;

BEGIN TRANSACTION;
ALTER TABLE customer
ADD CONSTRAINT pk_customer PRIMARY KEY (customer_id);

Alter table artist add constraint pk_artist primary key (artist_id);
Alter table painting add constraint pk_painting primary key (painting_id);

ALTER TABLE address ADD constraint pk_address primary key (address_id);
ALTER TABLE address ADD CONSTRAINT customer_id foreign key (customer_id) references customer(customer_id);

alter table transactions add constraint pk_transaction primary key (transaction_id);
alter table transactions add constraint fk_customer foreign key (customer_id) references customer(customer_id);
alter table transactions add constraint fk_painting foreign key (painting_id) references painting (painting_id);
alter table transactions add constraint fk_artist foreign key (artist_id) references artist (artist_id);

COMMIT transaction;