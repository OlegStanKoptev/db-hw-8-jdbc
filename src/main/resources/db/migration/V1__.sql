CREATE TABLE book
(
    isbn            VARCHAR(255) NOT NULL,
    title           VARCHAR(255),
    author          VARCHAR(255),
    number_of_pages INTEGER,
    published_date  VARCHAR(255),
    pub_name        VARCHAR(255),
    CONSTRAINT pk_book PRIMARY KEY (isbn)
);