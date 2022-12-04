DROP TABLE IF EXISTS member CASECADE;

CREATE TABLE member
{
    id bigint genarated by default as identity,
    name varchar(255),
    primary key (id)
};