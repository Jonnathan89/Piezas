create table usuario(
   id serial primary key not null,   
   username varchar(100),
   password varchar(100),
   typeuser varchar(50)
);